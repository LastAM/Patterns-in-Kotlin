package PMLdev.Lerning.DesignPatternsEoROOS.Strategy

class Composition(val compositor: Compositor){
    fun Repair(){}
}

abstract class Compositor{
    abstract fun Compose()
}

class SimpleCompositor: Compositor(){
    override fun Compose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class TeXCompositor: Compositor(){
    override fun Compose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
class ArrayCompositor: Compositor(){
    override fun Compose() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}