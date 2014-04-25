package controllers

import play.api._
import play.api.mvc._
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global
import play.api.libs.concurrent.Akka
import play.api.libs.ws._
import play.api.libs.json._
import play.api.Play.current

object Application extends Controller {

  def index = Action {
    Ok(Json.obj("aaaa" -> "aaaaaaaaaaa"))
  }

  def api = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}

object Contexts {
  implicit val myExecutionContext: ExecutionContext = Akka.system.dispatchers.lookup("my-context")
}

