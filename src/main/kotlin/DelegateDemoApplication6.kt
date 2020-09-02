package com.example.demo

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DelegateVal : ReadOnlyProperty<Example2, String> {

	override fun getValue(thisRef: Example2, property: KProperty<*>): String {
		println("DelegateVal's getValue()")
		return "DelegateVal's getValue()"
	}

}

class DelegateVar : ReadWriteProperty<Example2, String> {

	override fun getValue(thisRef: Example2, property: KProperty<*>): String {
		println("DelegateVar's getValue()")
		return "DelegateVar's getValue()"
	}

	override fun setValue(thisRef: Example2, property: KProperty<*>, value: String) {
		println("DelegateVar's setValue()")
	}

}

class Example2 {
	val argVal: String by DelegateVal()
	var argVar: String by DelegateVar()
}


fun main(args: Array<String>) {

	val ex = Example2()

	ex.argVal

	ex.argVar = "hello"

	ex.argVar

}