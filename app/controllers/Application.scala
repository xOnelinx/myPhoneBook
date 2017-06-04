package controllers

import models.Person
import play.api.mvc._

/**
  * Created by Денис on 01.06.2017.
  */
class Application extends Controller{

  def listPersons(filter: String) = Action { implicit request =>
    Ok(views.html.index(
      Person.fetchByName(filter), filter
    ))
  }



}
