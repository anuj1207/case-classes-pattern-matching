package edu.learning.scala.services

import edu.learning.scala.models.{Consultant, Employee, I, II, III, Manager, Person, Student}

class MatchingService {

  def greetPerson(person: Person) = {
    person match {
      case Employee(_, name, _, Consultant, _) =>
        s"Hi ${name.toUpperCase}! welcome to matching service. We hope you can consult us for some future endeavours"
      case Employee(_, name, _, Manager, _) =>
        s"Hi ${name.toUpperCase}! welcome to matching service. We are in need of some serious management in our services department"
      case Student(_, name, _, standard, _) if standard == I || standard == II || standard == III=> //Guard condition
        s"Hi ${name.toUpperCase}! As of now you are not qualified enough to have a proper place here." +
          " Matching service only works for the students which are at least in standard IV"
      case Student(_, name, _, standard, school) =>
        s"Hi ${name.toUpperCase}! welcome to the matching service. We are happy to have you here from school $school, standard $standard"
    }
  }

}
