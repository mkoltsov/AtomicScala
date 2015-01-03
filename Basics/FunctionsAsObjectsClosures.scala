val vec = Vector(1, 2, 3, 4, 5)

def prln(n: Int) = println(n)
vec.foreach(prln)

vec.foreach((n: Int) => {
  println(n)
})

vec.foreach(n => println(n))

val vec1 = "Duck".toVector

vec1.foreach(n => println(n + '>'))

var s = ""

vec1.foreach(n => s = s + n + ':')

println(s)

val sv = Vector(4, 6, 2, 7, 2, 1)

println(sv.sorted)

println(sv.sortWith((i, j) => j < i))

class Later(val f: () => Unit) {
  def call(): Unit = {
    f()
  }
}

var later = () => println("now")
val later1 = () => println("now")
val later2 = (n: String) => {
  println(n)
  println ("END")
}

later()
later1()
later2("chef")