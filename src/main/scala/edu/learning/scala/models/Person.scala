package edu.learning.scala.models

trait Person{
  val age: Int
  val name: String
}

trait Designation

case object Consultant extends Designation
case object Manager extends Designation

trait Standard

case object I extends Standard
case object II extends Standard
case object III extends Standard
case object IV extends Standard
case object V extends Standard
case object VI extends Standard

case class Employee(id: Int, name: String, age: Int, designation: Designation, companyName: String) extends Person

case class Student(rollNo: Int, name: String, age: Int, standard: Standard, schoolName: String) extends Person
