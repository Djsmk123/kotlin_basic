package modules.basics
open class Fee(var fee:List<Int>){
    fun getFee(){
        println("Fee per semesters are : ")
        for(i in fee.indices)
        {
            println("Semester ${i+1} : ${fee[i]}")
        }
    }
}


class Adgtim(private val numberOfStudents:Int, private val numberOfStudentsPlaced:Int, var availableCourse:List<String>, fee: List<Int>):
    Fee(fee) {
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
    val adgtim=Adgtim(4000,2500, listOf("B.Tech","BBA","MBA"), listOf(113000,113000,113000,113000,))
    adgtim.getNumberOfStudents()
    adgtim.getNumberOfStudentsPlaced()
    adgtim.getAvailableCourse()
    adgtim.getFee()


}

