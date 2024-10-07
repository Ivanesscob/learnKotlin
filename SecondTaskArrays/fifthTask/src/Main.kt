/*Создать приложение, в котором пользователь вводит массив из различных слов.
На выходе приложение должно показать слова сгруппированные по признаку
"состоят из одинаковых букв". Например, на входе ["eat", "tea", "tan", "ate", "nat", "bat"].
Получаем группы:
"ate", "eat", "tea"
"nat", "tan"
"bat"
*/

fun main() {
    val string = readln()
    val arrOfString = string.split(" ")
    var letters = mutableMapOf<String, MutableList<String>>()
    for (element in arrOfString){
        var sp = element
        var sp1 = sp.toCharArray().sorted().joinToString("")
        if (letters.containsKey(sp1)) {
            letters[sp1]?.add(sp)
        } else {

            letters[sp1] = mutableListOf(sp)
        }

    }
    for (valueList in letters.values) {
        for (value in valueList) {
            print("\"$value\", ")
        }
        println()
    }
}

