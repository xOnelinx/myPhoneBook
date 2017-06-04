package controllers

import models.Person
import play.api.libs.json.JsValue
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



//  def listPersons = Action {
//    Ok(views.html.index(Person.fetch))
//  }

//  def fetchPersonsByName(name:String) = Action {
//    Ok(views.html.index(Person.fetchByName(name)))
//  }

//  def search(name: String, country: String) = Action {
//    val result = Artist.fetchByNameOrCountry(name, country)
//    if(result.isEmpty){
//      NoContent
//    }
//    else {
//      Ok(views.html.home(result))
//    }
//  }
//
//  def search2(name: Option[String], country: String) = Action {
//    val result = name match{
//      case Some(n) => Artist.fetchByNameOrCountry(n, country)
//      case None => Artist.fetchByCountry(country)
//    }
//    if(result.isEmpty){
//      NoContent
//    }
//    else {
//      Ok(views.html.home(result))
//    }
//  }


}
