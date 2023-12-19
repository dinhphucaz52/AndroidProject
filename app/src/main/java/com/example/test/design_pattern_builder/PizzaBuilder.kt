package com.example.test.design_pattern_builder

interface PizzaBuilder {
    fun setPizza(pizza: PizzaEnum) : PizzaBuilder
    fun setSalad(salad: SaladEnum) : PizzaBuilder
    fun setWater(water: WaterEnum) : PizzaBuilder
    fun setDessert(dessert: DessertEnum) : PizzaBuilder
    fun build():PizzaStore
}