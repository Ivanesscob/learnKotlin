/*
Создать программу, выполняющую следующий функционал:
- запрашивается количество строк и столбцов для двумерного массива
- вводится необходимое количество трехзначных чисел (числа могут повторяться)
- подсчитывается количество различных цифр в полученном массиве
- на консоль выводится двумерный массив из введенных чисел и количество различных цифр
используемых в данном массиве
Например, для массива
100   951   101   950
519   999   155   501
510   911   144   554
выведется результат: В массиве использовано 5 различных цифр
*/


fun main() {
    println("Введите размерность")
    val a = readln().toInt()
    val b = readln().toInt()
    println("Введите значения")
    val table = Array(a, { Array(b, {0}) })
    var intMutableSet: MutableSet<Int> = mutableSetOf()
    for(i in 0 until  a){
        for(j in 0 until  b){
            table[i][j] = readln().toInt()
            for (k in 0 .. 2){
            intMutableSet.add((table[i][j].toString())[k].toInt())
            }
        }
    }

    for(row in table){

        for(cell in row){
            print("$cell \t")
        }
        println()
    }
    println("Использовалось: " + intMutableSet.size+ " различных цифр" )

}