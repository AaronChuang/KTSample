package com.example.demo

interface Cloth2 {
	fun wear()
}

class Shirt2 : Cloth2 {
	override fun wear() {
		println("wear shirt")
	}
}

class Dress2 : Cloth2 {
	override fun wear() {
		println("wear dress")
	}
}

class Person2(val cloth: Cloth2) {
	fun wearCloth() {
		cloth.wear()
	}
}


fun main(args: Array<String>) {

	val shirt = Shirt2()
	val man = Person2(shirt)
	man.wearCloth()

	val dress = Dress2()
	val woman = Person2(dress)
	woman.wearCloth()

}