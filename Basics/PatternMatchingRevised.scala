case class Person(name: String)

def acceptAnything(x: Any) = {
  x match {
    case s: String => "A string" + s
    case i: Int if (i < 20) => s"Int is less than 20 $i"
    case i: Int => s"Some other int $i"
    case p: Person => s"The person ${p.name}"
    case _ => "No one knows what it is"
  }
}

println(acceptAnything("chef"))
println(acceptAnything(10))
println(acceptAnything(30))
println(acceptAnything(Person("Chef")))
println(acceptAnything(Unit))

