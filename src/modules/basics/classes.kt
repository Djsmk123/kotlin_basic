package modules.basics

class ADGTIM(private val numberOfStudents:Int, private val numberOfStudentsPlaced:Int,  var availableCourse:List<String>){
    fun getNumberOfStudents(){
        println("No of students in ADGITM :$numberOfStudents")
    }
    fun getNumberOfStudentsPlaced(){
        println("No of students placed in ADGITM :$numberOfStudentsPlaced")
    }
    fun getAvailableCourse(){
        println("Available Course are : ")
        availableCourse.forEach {
            println(it)
        }
    }
}
fun main(){
    val adgtim=ADGTIM(4000,2500, listOf("B.Tech","BBA","MBA"))
    adgtim.getNumberOfStudents()
    adgtim.getNumberOfStudentsPlaced()
    adgtim.getAvailableCourse()
}