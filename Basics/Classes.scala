import java.util.{Random => Rnd}

class Mammal {
  def meow(cnt:Int) = {
    "i'm a cat " + cnt
  }
  println("instantiating")
  val immut = "123"

  var mut = 123
}

val inst = new Mammal

println(inst.immut)
println(inst.meow(1))

val rnd = new Rnd()

println(rnd.nextInt(100))

class Royalty(clazz:String, chefValue:Boolean){
  var partOfRoyalFamily:Boolean = _
  val id = rnd.nextInt(100)
  println("new royalty has been added",clazz, chefValue, partOfRoyalFamily, id)
  def makeMeSir={println(clazz+" has been promoted to Sir")}

}

val chef = new Royalty("chef", true)
chef.partOfRoyalFamily = true
new Royalty("pupa", false)
chef.makeMeSir
//class Animal(cnt:Int, name:String){
//  var cnt
//}