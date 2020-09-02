package com.example.demo

interface Cloth1 {
	fun wear()
}

class Shirt1 : Cloth1 {
	override fun wear() {
		println("wear shirt")
	}
}

class Dress1 : Cloth1 {
	override fun wear() {
		println("wear dress")
	}
}

open class Person1(val cloth: Cloth1) {
	open fun wearCloth() {
		cloth.wear()
	}
}

class Man(cloth: Cloth1) : Person1(cloth) {
	override fun wearCloth() {
		println("wear shirt")
	}
}

class Woman(cloth: Cloth1) : Person1(cloth) {
	override fun wearCloth() {
		println("wear dress")
	}
}

fun main() {
	val shirt = Shirt1()
	val man = Man(shirt)
	man.wearCloth()

	val dress = Dress1()
	val woman = Woman(dress)
	woman.wearCloth()
}
