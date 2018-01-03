package pmldev.learning.hfPatternsDesign


/*Фабрика Simple*/
abstract class Pizza{
    abstract var name: String
    abstract var dough: String
    abstract var souse: String
    var toppings = mutableListOf<String>()

    fun prepare(){
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: ")
        toppings.forEach { println(it) }
    }
    fun bake(){
        println("Bake for 25 minutes at 350")
    }
    fun cut(){
        println("Cutting the pizza into diagonal slices")
    }
    fun box(){
        println("Place pizza in official PizzaStore box")
    }
}


/*паттерн Фабрика*/
class NYStyleCheesePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class NYStyleGreekPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class NYStylePepperoniPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class NYStyleClamPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class NYStyleVeggiePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}

class ChicagoStyleCheesePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class ChicagoStyleGreekPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class ChicagoStylePepperoniPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class ChicagoStyleClamPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class ChicagoStyleVeggiePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}

class CalifornyStyleCheesePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class CalifornyStyleGreekPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class CalifornyStylePepperoniPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class CalifornyStyleClamPizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
class CalifornyStyleVeggiePizza: Pizza(){
    override var name: String = "NY Style Sauce and Cheese Pizza"
    override var dough: String = "Thin Crust Dough"
    override var souse : String = "Marinara Sauce"
    init {
        toppings.add("Grated Reggiano Cheese")
    }
}
/*Клиент Фабрики*/
abstract class PizzaStore {
    fun orderPizza(type: String): Pizza? {
        val pizza = createPizza(type)
        pizza?.prepare()
        pizza?.bake()
        pizza?.cut()
        pizza?.box()
        return pizza
    }
    protected abstract fun createPizza(type: String): Pizza?
}

class ChicagoStylePizzaStore: PizzaStore(){
    override fun createPizza(type: String): Pizza? = when(type){
        "cheese"    -> ChicagoStyleCheesePizza()
        "greek"     -> ChicagoStyleGreekPizza()
        "pepperoni" -> ChicagoStylePepperoniPizza()
        "clam"      -> ChicagoStyleClamPizza()
        "veggie"    -> ChicagoStyleVeggiePizza()
        else -> null
    }
}
class NYStylePizzaStore: PizzaStore(){
    override fun createPizza(item: String): Pizza? = when(item){
        "cheese"    -> NYStyleCheesePizza()
        "greek"     -> NYStyleGreekPizza()
        "pepperoni" -> NYStylePepperoniPizza()
        "clam"      -> NYStyleClamPizza()
        "veggie"    -> NYStyleVeggiePizza()
        else -> null
    }
}
class CalifornyPizzaStore: PizzaStore(){
    override fun createPizza(type: String): Pizza? = when(type){
        "cheese"    -> CalifornyStyleCheesePizza()
        "greek"     -> CalifornyStyleGreekPizza()
        "pepperoni" -> CalifornyStylePepperoniPizza()
        "clam"      -> CalifornyStyleClamPizza()
        "veggie"    -> CalifornyStyleVeggiePizza()
        else -> null
    }
}

fun main(args: Array<String>){
    val nyPizzaStore = NYStylePizzaStore().orderPizza("cheese")
}
