package modules.specialClasss

enum class AvailableMoves{
    Stone,Paper,Scisscor
}
fun main(){
    val move=AvailableMoves.Scisscor
    when(move){
        AvailableMoves.Scisscor->{
            println(move.name)
            println(move.ordinal)
        }
        AvailableMoves.Stone->{
            println(move.name)
            println(move.ordinal)
        }
        AvailableMoves.Paper->{
            println(move.name)
            println(move.ordinal)
        }
    }


}