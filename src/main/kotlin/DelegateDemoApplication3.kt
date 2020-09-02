package com.example.demo

interface Cloth3 {
	fun wear()
}

class Shirt3 : Cloth3 {
	override fun wear() {
		println("wear shirt")
	}
}

class Dress3 : Cloth3 {
	override fun wear() {
		println("wear dress")
	}
}

class Person3(val cloth: Cloth3):Cloth3 by cloth

fun main(args: Array<String>) {

	val shirt = Shirt3()
	val man = Person3(shirt)
	man.wear()

	val dress = Dress3()
	val woman = Person3(dress)
	woman.wear()

}