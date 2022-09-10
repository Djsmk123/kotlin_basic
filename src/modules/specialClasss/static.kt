package modules.specialClasss

class GameOfThrone{

    companion object {
        private val ep=listOf("Winter is Coming","The KingsRoad","Lord Snow","Cripples, Bastards, and Broken Things",	"The Wolf and the Lion",	"A Golden Crown",	"You Win or You Die",	"The Pointy End",	"Baelor","Fire and Blood")
        fun getAllEpisodesNameSession01(){
            println("Episodes names are :")
            ep.forEach{
                println(it)
            }
        }
    }
}
fun main(){
    GameOfThrone.getAllEpisodesNameSession01()
}