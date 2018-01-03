package pmldev.learning.hfPatternsDesign.simplefactory

import java.lang.Exception
abstract class Pizza{
    abstract fun prepare()
    abstract fun bake()
    abstract fun cut()
    abstract fun box()
}

class CheesePizza: Pizza(){
    override fun prepare(){}
    override fun bake(){}
    override fun cut(){}
    override fun box(){}
}
class GreekPizza: Pizza(){
    override fun prepare(){}
    override fun bake(){}
    override fun cut(){}
    override fun box(){}
}
class PepperoniPizza: Pizza(){
    override fun prepare(){}
    override fun bake(){}
    override fun cut(){}
    override fun box(){}
}
class ClamPizza: Pizza(){
    override fun prepare(){}
    override fun bake(){}
    override fun cut(){}
    override fun box(){}
}
class VeggiePizza: Pizza(){
    override fun prepare(){}
    override fun bake(){}
    override fun cut(){}
    override fun box(){}
}

class SimplePizzaFactory {
    fun createPizza(type: String) = when(type){
        "cheese" -> CheesePizza()
        "greek" -> GreekPizza()
        "pepperoni" -> PepperoniPizza()
        "clam" -> ClamPizza()
        "veggie" -> VeggiePizza()

        else -> throw Exception("не известная пицца")
    }
}