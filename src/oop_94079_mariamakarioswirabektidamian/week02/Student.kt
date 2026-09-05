package oop_94079_mariamakarioswirabektidamian.week02

class Student(
    val name: String,
    val nim: String,
    val major: String,
    val gpa: Double = 0.0
) {

    // Secondary Constructor
    constructor(name: String, nim: String) :
            this(name, nim, "Non-Matriculated", 0.0)
}
