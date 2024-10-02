/*
Имеется массив целых чисел из 5-и строк и 5-и столбцов. Выяснить,
симметричен ли он относительно главной диагонали. То есть - элемент
1,2 равен элементу 2,1. Элемент 1,3 равен элементу 3,1 и т.д. Например массив

5  9  6  7  2
9  8  4  5  3
6  4  3  8  7
7  5  8  4  8
2  3  7  8  1
является симметричным относительно главной диагонали
 */

fun main() {
    val matrix = arrayOf(
        arrayOf(5, 9, 6, 7, 2),
        arrayOf(9, 8, 4, 5, 3),
        arrayOf(6, 4, 3, 8, 7),
        arrayOf(7, 5, 8, 4, 8),
        arrayOf(2, 3, 7, 8, 1)
    )
    var yesOrNo = true
    for (row in matrix) {
        println(row.joinToString("  "))
    }
    for(i in 0 until 5){
        for(j in 4 downTo 0){
            if(matrix[i][j] != matrix[j][i]){
                yesOrNo = false
                println(yesOrNo)
                return
            }
        }

    }
    println(yesOrNo)

}