fun main(args: Array<String>) {


    var age = arrayListOf<Int>(10,12,14,15,19)
    age.add(5,20)
    println(age[5])
    age.remove(10)
    println(age[0])
    println("3rd element of arraylist = ${age[2]} ")


    var mixAdd = ArrayList<Any>()
    mixAdd.add("ford")
    mixAdd.add(5)
    mixAdd.add(2,"BMW")
    mixAdd.add(false)

    println(mixAdd[3])

    var mySetArray = setOf<Any>("kotlin",2,2.5,2,"Hello world",true)
    println(mySetArray.size)
    println(mySetArray.last())
    println()
    println()

    // immutable map of
    var age2 = mapOf<String,Int>("david" to 20,"ronaldo" to 25)
    println(age2["david"])
    println(age2["ronaldo"])


    // mutable map of
    var age3 = mutableMapOf<String,Int>("david" to 20,"ronaldo" to 25)
    age3.put("buffon",30)

    println(age3["buffon"])

}