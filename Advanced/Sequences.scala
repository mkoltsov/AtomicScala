testSeq(Vector(11,7,22,11,11))

testSeq(List(11,7,22,11,11))

def testSeq(s: Seq[Int]) = {
  println(s"${s.getClass.toString.replace('.', ' ').split(' ').last} is empty? ${s.isEmpty}")
  println(s"${s.length}")

}