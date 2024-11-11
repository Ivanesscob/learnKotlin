fun main() {
    val russianAlphabetLowercase = listOf(
        'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
        'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
        'ы', 'ь', 'э', 'ю', 'я'
    )

    println("0 - зашифровка. 1 - расшифровка")
    val answer = readLine()?.toIntOrNull()

    if (answer == 0) {
        println("Введите слово для зашифровки:")
        val word = readLine() ?: return
        var result = word[0].toString()

        for (i in 1 until word.length) {
            for (j in russianAlphabetLowercase.indices) {
                if (russianAlphabetLowercase[j] == word[i]) {
                    result += if (i + j > 32) {
                        russianAlphabetLowercase[j + i - 32]
                    } else {
                        russianAlphabetLowercase[j + i]
                    }
                }
            }
        }
        println(result)
    } else {
        println("Введите слово для расшифровки:")
        val word = readLine() ?: return
        var result = word[0].toString()

        for (i in 1 until word.length) {
            for (j in russianAlphabetLowercase.indices) {
                if (russianAlphabetLowercase[j] == word[i]) {
                    result += if (j - i < 0) {
                        russianAlphabetLowercase[j - i + 33]
                    } else {
                        russianAlphabetLowercase[j - i]
                    }
                }
            }
        }
        println(result)
    }
}
