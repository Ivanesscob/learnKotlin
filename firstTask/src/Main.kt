import kotlin.math.ln
import kotlin.math.log


// 1 Задание
/* Создать приложение, которое подсчитывает количество подряд идущих одинаковых
символов во введенной строке. На вход подается, например, строка AAADSSSRRTTHAAAA.
На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов
меньше двух, то мы не пишем единицу */

/*fun main() {
    val sentence = "AAADSSSRRTTHAAAA"
    var result = "";
    var currentChar = sentence[0]
    var count = 1
    for (i in 1 until sentence.length) {
        if (sentence[i] == currentChar) {
            count++
        } else {
            if (count == 1){
                result+= currentChar.toString()
            }
            else{
                result+=currentChar.toString() + count.toString()
            }

            currentChar = sentence[i]
            count = 1
        }
    }
    result += currentChar.toString() + count
    println(result)

}*/



// 2 Задание
/*
Создать приложение, которое подсчитывает количество различных символов
во введенной строке. Символы в ответе расположить
в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
A - 3
D - 2
S - 3
*/

/*fun main() {
    var input = "AASADDSS"
    input = input.toCharArray().sorted().joinToString("")
    var currentChar = input[0]
    var count = 1
    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {

            println("$currentChar - $count ")
            currentChar = input[i]
            count = 1
        }
    }

    println("$currentChar - $count ")
}*/


// Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.

/*
fun main() {
    var input = readln().toInt()
    var result = "";
    var ost =1;
    while (ost != 0){
        result+= input %2
        ost = input /2
        input /= 2
    }
    result = result.split("").reversed().joinToString("")
    println(result)
}
*/


/*
Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть
вещественными. Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате -
ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ
*/


/*

fun main(){
    var input = readln()
    var a = input.split(" ")
    when (a[2]){
        "+" -> println(a[0].toDouble() + a[1].toDouble())
        "-" -> println(a[0].toDouble() - a[1].toDouble())
        "/" -> println(a[0].toDouble() / a[1].toDouble())
        "*" -> println(a[0].toDouble() * a[1].toDouble())
    }
}

*/

/*
Создать приложение, с помощью которого пользователь, введя целое число n и
основание степени x узнает, существует ли целочисленный показатель степени y
для которого выполняется равенство xy = n. В случае, если показатель существует
– вычислить его и вывести. В противном случае вывести текст – «Целочисленный показатель
не существует».
*/

/*
fun main(){
    println("Введите целое число n:")
    val n = readln().toInt()

    println("Введите основание степени x:")
    val x = readln().toInt()

    // Проверка ввода
    if (x <= 1 || n <= 0) {
        println("Ввод некорректен. Число n должно быть целым положительным, а x больше 1.")
        return
    }


    val y = findExponent(n, x)

    if (y != null) {
        println("Целочисленный показатель y: $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
fun findExponent(n: Int, x: Int): Int? {
    var value = n
    var exponent = 0

    while (value % x == 0) {
        value /= x
        exponent++
    }

    return if (value == 1) exponent else null
}
*/


/*Создать приложение, в котором пользователь вводит две различных цифры.
На выходе приложение выдает, если это возможно, из введенных цифр, нечетное
число. Результат выводится в консоль. При невозможности создать нечетное число
выводится сообщение – «Создать нечетное число невозможно». Каждое число вводится на
отдельной строке*/


/*
fun main(){
    var a = readln().toInt()
    var b = readln().toInt()
    val mass = arrayOf(1,3,5,7,9)
    var c = true
    for (i in 0 .. 4){
        if (a == mass[i]){
            println(b.toString()+a.toString())
            c = false
            return
        }
        if (b == mass[i]) {
            println(a.toString() + b.toString())
            c = false
            return
        }
    }
    if (c){
        println("Невозможно сделать")
    }

}*/
