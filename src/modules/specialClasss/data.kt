package modules.specialClasss

/*
Data classes make it easy to create classes that are used to store values.
 Such classes are automatically provided with methods for copying, getting a string representation,
 and using instances in collections.
 You can override these methods with your own implementations in the class declaration.
 */
data class Student(val name:String,val marks:Int){
    override fun equals(other: Any?): Boolean {
       return other is Student && other.marks == this.marks
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + marks
        return result
    }

}
fun main(){
    val student1 = Student(name = "SmkWinner",200)
    val student2 = Student(name="Lenovo",600)
    val student3 =Student(name="Lenovo_1",200)
    println("student1==student 2:${student1==student2} ")
    println("student1==student 3:${student1==student3} ")

    println(student1.copy(name = "smkwinner", marks = 300))

    println("student 1, name=${student1.component1()},marks=${student1.component2()}")




}