//UNIFORM ACCESS PRINCIPLE
case class Style(va: Boolean) {
  //when a method without the args mutates the state it's convenient to write it with parenthesis
  def getA() = va
  //if it doesn't mutate, it's common to write the method without parenthesis
  def getB = va
}

val st = Style(true)

//st.getA()
//it's better to write like this
st.getB
