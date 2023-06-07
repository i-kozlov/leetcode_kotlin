package s1000

import java.util.LinkedList

//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
//идем по студентам
//перем 1ого
//если совпадает с sandwitch - убираем обоих
//иначе двигаем студента в конец

//стоп - все студенты одинаковы и не берут сендвич
//сделаем так счетчик с последнего изменения - не превышает длины очереди
class Solution1700 {

    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val studentsQueue = LinkedList(students.toList())
        val sandwichesQueue = LinkedList(sandwiches.toList())

        var couldntServe = 0
        while (couldntServe < students.size && !studentsQueue.isEmpty()) {
            val studentHead = studentsQueue.poll()
            val match = studentHead == sandwichesQueue.peek()
            if (match) {
                sandwichesQueue.poll()
                couldntServe = 0
            } else {
                studentsQueue.add(studentHead)
                couldntServe++
            }
        }

        return studentsQueue.size
    }
}

fun main() {

    val r = Solution1700().countStudents(
            intArrayOf(1,1,1,0,0,1),
            intArrayOf(1,0,0,0,1,1)
    )
    println(r)

    //add more test examples

}