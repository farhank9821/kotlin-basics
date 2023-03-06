fun main(args: Array<String>) {


  // rangeTo and in function
    var myCharRange ='a'.rangeTo('j')
    var myChar = 'k' in myCharRange
    println("myCharRange has k : " +myChar)


    // input from user
    print("Enter your name : ")
    var name:String = readLine()!!

    print("Enter your age : ")
    var age:Int = readLine()!!.toInt()

    println("Your name id $name and your age is "+  age)


    for (i in 1..10){
        println(i)
    }




}