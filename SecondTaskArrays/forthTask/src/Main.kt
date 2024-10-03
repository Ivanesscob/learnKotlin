/*
Задача 4.

Создать приложение, в котором пользователь дает на вход два числовых массива,
числа в массиве могут повторяться. На выходе приложение выдает пересечение этих массивов.
Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2]. На выходе должны получить [1, 2, 2, 3].
То есть учитывается количество повторений чисел в массиве. Число 2 в одном массиве повторялось два раза,
в другом - три. Значит в итоговом массиве число два должно быть два раза*/

fun main(){
    println("Введите длинну 1 массива")
    val a = readln().toInt()
    val firstArr = arrayOfNulls<Int>(a)
    for (i in 0 until a){
        firstArr[i] = readln().toInt()
    }
    firstArr.sort()
    println("Введите длинну 2 массива")
    val ab = readln().toInt()
    val secondArr = arrayOfNulls<Int>(ab)
    for (i in 0 until ab){
        secondArr[i] = readln().toInt()
    }
    secondArr.sort()
    var result = ""
    for (i in 0 until a){
        for(j in 0 until ab){
            if (firstArr[i] == secondArr[j]){
                result+= firstArr[i].toString() +" "
                break
            }
        }
    }
    println(result)

}