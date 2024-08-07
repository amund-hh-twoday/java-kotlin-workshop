package com.twoday.kotlin_spring_boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.twoday.kotlin_spring_boot.basic_class.JavaClass
import com.twoday.kotlin_spring_boot.basic_class.KotlinClass

@SpringBootApplication
class KotlinSpringBootApplication

fun main(args: Array<String>) {
	//runApplication<KotlinSpringBootApplication>(*args)
    val kotlinClass = KotlinClass("Gunnar", 32, "Oslo Gate 1")
    val javaClass = JavaClass("Gunnar", 32, "Oslo Gate 2")

    kotlinClass.name = "Hei"

    println(kotlinClass.name)
    println(javaClass.name)
}
