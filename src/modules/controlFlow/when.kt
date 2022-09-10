package modules.controlFlow
import java.util.Scanner
fun main(){
    //java library for reading inputs from user
    val reader=Scanner(System.`in`)

    println("Enter a = :")
    val num1:Int=reader.nextInt()
    println("Enter b = :")
    val num2:Int=reader.nextInt()
    println("Enter operator '+' ,'-','/','*'")
    //getting first char
    val op:Char= reader.next()[0]


    println("Result = ${calculation(num1,num2,op)}")

}
fun calculation(num1:Int,num2:Int,op:Char):Number{
    when(op){
        '+'->{
            return num1+num2
        }
        '-'->{
            return  num1-num2
        }
        '*'->{
            return num1*num2
        }
        '/'->{
            return num1/num2
        }
    }
    return  0

}