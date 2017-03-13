package controllers;

import play.data.Form;
import play.mvc.*;
import views.html.index;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class uses a custom body parser to change the upload type.
 */
@Singleton
public class HomeController extends Controller {

    private final play.data.FormFactory formFactory;

    @Inject
    public HomeController(play.data.FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        Form<FormData> form = formFactory.form(FormData.class);
        Http.Context context = Http.Context.current();
        return ok(index.render(form, context.messages()));
    }

    @BodyParser.Of(MyMultipartFormDataBodyParser.class)
    public Result upload() throws IOException {
        final Http.MultipartFormData<File> formData = request().body().asMultipartFormData();
        System.out.println("HomeController.java formData = [" + formData + "]");
        final Http.MultipartFormData.FilePart<File> filePart = formData.getFile("name");
        System.out.println("HomeController.java filePart = [" + filePart + "] <~~~~~~~~~~~~~~~~~~~~~~~~ NULL!!!!!!");
        final File file = filePart.getFile();
        final long data = operateOnTempFile(file);
        // String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        // System.out.println("content = [" + content + "]");
        return ok("{fileSize: " + data + ", name: \"" + file.getName() + "\"}");
    }

    private long operateOnTempFile(File file) throws IOException {
        final long size = Files.size(file.toPath());
        // Files.deleteIfExists(file.toPath());
        return size;
    }

}
