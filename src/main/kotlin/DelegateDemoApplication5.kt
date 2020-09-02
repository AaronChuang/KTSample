package com.example.demo


class Example {
	val argVal: String = "argVal"
	var argVar: String = "argVar"

	val argVal2: String = "argVal"
		get(){
			println("argVal's get()")
			return field
		}

	var argVar2: String = "argVar"
		set(value) {
			println("argVar's set()")
			field = value
		}
		get(){
			println("argVar's get()")
			return field
		}
}


fun main(args: Array<String>) {

	val ex = Example()

	ex.argVal2

	ex.argVar2 = "hello"

	ex.argVar2

}