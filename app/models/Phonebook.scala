package models

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Денис on 01.06.2017.
  */
case class Person(name: String, pnumber: String)
object Person {
  val availableArtist = List(
    Person("Wolfgang Amadeus Mozart", "+79780223656"),
    Person("Ludwig van Beethoven", "+79780223123"),
    Person("Johann Sebastian Bach", "+79780223656"),
    Person("Frédéric François Chopin", "+79780223656"),
    Person("Joseph Haydn", "Austria"),
    Person("Antonio Lucio Vivaldi", "Italy"),
    Person("Franz Peter Schubert", "Austria"),
    Person("Franz Liszt", "Austria"),
    Person("Giuseppe Fortunino Francesco Verdi", "Austria"))

  def fetch: List[Person] = {
    availableArtist
  }

  def fetchByName(name: String): List[Person] = {
    availableArtist.filter(a => a.name.contains(name))
  }

  def addNewPeerson (name: String,pnumber: String): Unit ={
    availableArtist:+ Person(name,pnumber)
  }
//  def fetchByCountry(country: String): Seq[Artist] = {
//    availableArtist.filter(a => a.country == country)
//  }

//  def fetchByNameOrCountry(name: String, country: String):
//  Seq[Artist] = {
//    availableArtist.filter(a => a.name.contains(name) || a.country
//      == country)
//  }

//  def fetchByNameAndCountry(name: String, country: String):
//  Seq[Artist] = {
//    availableArtist.filter(a => a.name.contains(name) && a.country
//      == country)
//  }
}git config --global user.email