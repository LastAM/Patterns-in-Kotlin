package Creational

class Room(val roomNo: Int):MapSite{
    override fun Enter(){ }
    private val roomNumber: Int? = null
    private val sides = arrayOfNulls<MapSite>(4)
}

enum class Direction {NORTH, SOUTH, WEST, EAST}

interface MapSite{
    fun Enter()
}
