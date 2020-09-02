package com.example.demo

interface Tops4 {

	fun wearTop()
}


interface Shoes4 {

	fun wearShoes()
}

class Shirt4 : Tops4 {

	override fun wearTop() {
		println("wear shirt")
	}
}

class Dress4 : Tops4 {

	override fun wearTop() {
		println("wear dress")
	}
}

class Boots4 : Shoes4 {

	override fun wearShoes() {
		println("wear boots")
	}
}

class HighHeels4 : Shoes4 {

	override fun wearShoes() {
		println("wear high-heels")
	}
}

class Person4(top:Tops4, shoes: Shoes4) : Tops4 by top, Shoes4 by shoes

fun main(args: Array<String>) {

	val shirt = Shirt4()
	val boots = Boots4()
	val man = Person4(shirt, boots)
	man.wearTop()
	man.wearShoes()

	val dress = Dress4()
	val highHeels = HighHeels4()
	val woman = Person4(dress, highHeels)
	woman.wearTop()
	woman.wearShoes()

}