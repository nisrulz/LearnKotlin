package github.nisrulz.sample.learnkotlin

// Converted the Java file to kotlin
class User {
  /*
   When defining variables in Kotlin, there are two options:
    1. Mutable variables, defined by var keyword.
    2. Immutable variables, defined by val keyword.

   Note : 1. By default, properties are non-null types, meaning that they can’t accept null value.
          2. By default, everything is of public scope. You don’t have to write public keyword again.
             To define a variable to accept a null value, a question mark must be added after the type.
          3. by default, all getter and setter are implicitly available you dont need to define unless you want a custom version for the same.
   */

  var firstName: String? = null
  var lastName: String? = null

  // Custom getter
  val fullName: String? get() = firstName + " " + lastName
}
