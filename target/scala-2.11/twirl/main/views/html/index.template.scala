
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.FormData],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[controllers.FormData])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

 """),_display_(/*5.3*/helper/*5.9*/.form(action = routes.HomeController.upload, 'enctype -> "multipart/form-data")/*5.88*/ {_display_(Seq[Any](format.raw/*5.90*/("""
  """),_display_(/*6.4*/helper/*6.10*/.inputFile(form("name"))),format.raw/*6.34*/("""
  """),format.raw/*7.3*/("""<input type="submit" value="upload file"/>
 """)))}),format.raw/*8.3*/("""
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(form:Form[controllers.FormData],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(messages)

  def f:((Form[controllers.FormData]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (messages) => apply(form)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 22:25:28 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/play-java-fileupload/app/views/index.scala.html
                  HASH: fb7cac888f5672597b790747b593bfc27ef6a494
                  MATRIX: 784->1|952->74|982->79|1013->102|1052->104|1083->110|1096->116|1183->195|1222->197|1252->202|1266->208|1310->232|1340->236|1415->282|1447->285
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|40->9
                  -- GENERATED --
              */
          