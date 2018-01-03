package PMLdev.Lerning.DesignPatternsEoROOS

enum class Direction {NORTH, SOUTH, WEST, EAST}
interface MapSite{
    fun Enter()
}

class Room(val roomNo: Int): MapSite {

    fun GetSide(dir: Direction): MapSite? = sides[dir.ordinal]
    fun SetSide(dir: Direction, mapSite: MapSite) { sides[dir.ordinal]=mapSite }

    override fun Enter(){ }

    private val sides = arrayOfNulls<MapSite>(4)
}
class Wall:MapSite{
    override fun Enter(){ }
}
class Door(val room1: Room, val room2: Room):MapSite{
    override fun Enter(){ }
    fun OtherSideFrom(room:Room): Room{
        return Room(1)
    }
    private var isOpen: Boolean=true
}

class Maze {
    private val mapRoom = ArrayList<Room>()
    fun AddRoom(room: Room){
        mapRoom.add(room)
    }
    fun ListRoom() = mapRoom
    fun RoomNo(index: Int): Room? = mapRoom.findLast { it.roomNo==index }
}

class MazeGame{
    fun CreateMaze(): Maze{
        val aMaze = Maze()
        val r1 = Room(1); val r2 = Room(2)
        val theDoor = Door(r1, r2)

        aMaze.AddRoom(r1)
        aMaze.AddRoom(r2)

        r1.SetSide(Direction.NORTH, Wall())
        r1.SetSide(Direction.EAST, theDoor)
        r1.SetSide(Direction.SOUTH, Wall())
        r1.SetSide(Direction.WEST, Wall())

        r1.SetSide(Direction.NORTH, Wall())
        r1.SetSide(Direction.EAST, Wall())
        r1.SetSide(Direction.SOUTH, Wall())
        r1.SetSide(Direction.WEST, theDoor)
        return aMaze
    }
}

class Gamer(var room: Room){
    val LogExecutions:ArrayList<String> = arrayListOf("я в $room")
}