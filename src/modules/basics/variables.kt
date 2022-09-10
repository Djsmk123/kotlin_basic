package modules.basics

fun main(){
    /*
      Kotlin has powerful type inference.
      While you can explicitly declare the type of a variable, you'll usually let the compiler do the work by inferring it.
      Kotlin does not enforce immutability, though it is recommended. In essence use val over var.
     */
    var a:String="Hello"

    println(a)
    a="Great"
    println(a)

    val b:Int=3
    println(b)

}