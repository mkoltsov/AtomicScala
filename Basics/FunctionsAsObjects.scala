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