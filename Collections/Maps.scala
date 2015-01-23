val constants = Map("Pi"-> 3.141, "e"->2.718, "phi"-> 1.618)

println(constants)

println(Vector(("Pi",3.141), ("e",2.718),("phi",1.618)).toMap == constants)

println(constants("Pi"))

println(constants.values)
println(constants.keys)

println((for(pair <- constants) yield pair.toString))

println((for((k,v) <- constants) yield s"$k : $v"))

println(constants.keys.toVector)