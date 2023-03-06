

fun main() {
    println("Enter 2 elements : ")
    var a:Int = readLine()!!.toInt()
    var b:Int = readLine()!!.toInt()
    show(a,b)
    var c:Int = add(a,b)
    println("Sum of given 2 numbers is $c ")
    var d:Int = factorial(b)
    println("factorial of the given number is $d")
}

fun show(a:Int, b:Int) {
    println("You entered $a and $b")
}

fun add(a:Int, b:Int):Int{
    var c:Int = a + b;
    return c
}

fun factorial(a:Int):Int {
    if(a == 0)
        return 0;
    if(a == 1)
        return 1;
    else
        return a*factorial(a-1)
}