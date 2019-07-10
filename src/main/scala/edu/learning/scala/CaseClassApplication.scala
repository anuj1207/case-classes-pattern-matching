package edu.learning.scala

import edu.learning.scala.models.{Consultant, Employee, I, Manager, Student, V}
import edu.learning.scala.services.MatchingService

object CaseClassApplication extends App {

  val matchingService = new MatchingService

  println("==============================creating employees ===============================")
  val firstEmployee = Employee(1048, "Piyush", 30, Manager, "Knoldus")
  val secondEmployee = Employee(2022, "Anuj", 26, Consultant, "Knoldus")

  println(s"\n===============Employees created\nfirstEmployee: $firstEmployee\nsecondEmployee: $secondEmployee\n==============\n")


  println("==============================creating students ===============================")
  val firstStudent = Student(33, "Kabir", 10, V, "IRS")
  val secondStudent = Student(101, "Mirza", 5, I, "IRS")

  println(s"\n===============Students created\nfirstStudent: $firstStudent\nsecondStudent: $secondStudent\n==============\n")

  println("========================sending students to matching service=========================")

  println(matchingService.greetPerson(firstStudent))
  println(matchingService.greetPerson(secondStudent))

  println("========================sending employees to matching service=========================")

  println(matchingService.greetPerson(firstEmployee))
  println(matchingService.greetPerson(secondEmployee))
}
