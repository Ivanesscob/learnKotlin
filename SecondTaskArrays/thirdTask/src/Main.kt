/*
Имеется массив из символов русского алфавита (все 33 символа, могут быть не по порядку).
Символы алфавита нумеруются от 1 до 33. Каждое число используется только один раз.
Сообщение шифруется с помощью ключевого слова, задаваемого пользователем. Номер символа
ключевого слова показывает, на сколько нужно сдвинуться по массиву из символов русского алфавита.
Составить программу шифровки и дешифровки строкового выражения (то есть программа спрашивает -
зашифровать или расшифровать текст и ключевое слово). Первый массив считать закольцованным.
Регистр букв не имеет значения. Например:

А	Б	В	Г	Д	Е	Ё	Ж	З	И	Й	К	Л	М	Н	О	П	Р	С	Т	У	Ф	Х	Ц	Ч	Ш	Щ	Ь	Ы	Ъ	Э	Ю	Я
21	13	4	20	22	1	25	12	24	14	2	28	9	23	3	29	6	16	15	11	26	5	30	27	8	18	10	33	31	32	19	7	17
Ключевое слово - ПОЛЕ
Исходный текст - СООБЩЕНИЕ
Зашифрованный текст - АЁФИРХЖСЮ
 */


fun main() {
    val keyWord = readln()
    val message = readln()
    var result = ""
    val lenghtOfKeyWord = keyWord.length
    val lenghtOfMessaage = message.length
    var counterKeyWord = 0
    val array = arrayOf(
        arrayOf('А', 21),
        arrayOf('Б', 13),
        arrayOf('В', 4),
        arrayOf('Г', 20),
        arrayOf('Д', 22),
        arrayOf('Е', 1),
        arrayOf('Ё', 25),
        arrayOf('Ж', 12),
        arrayOf('З', 24),
        arrayOf('И', 14),
        arrayOf('Й', 2),
        arrayOf('К', 28),
        arrayOf('Л', 9),
        arrayOf('М', 23),
        arrayOf('Н', 3),
        arrayOf('О', 29),
        arrayOf('П', 6),
        arrayOf('Р', 16),
        arrayOf('С', 15),
        arrayOf('Т', 11),
        arrayOf('У', 26),
        arrayOf('Ф', 5),
        arrayOf('Х', 30),
        arrayOf('Ц', 27),
        arrayOf('Ч', 8),
        arrayOf('Ш', 18),
        arrayOf('Щ', 10),
        arrayOf('Ь', 33),
        arrayOf('Ы', 31),
        arrayOf('Ъ', 32),
        arrayOf('Э', 19),
        arrayOf('Ю', 7),
        arrayOf('Я', 17)
    )
    for (i in 0 until lenghtOfMessaage){
        var numberOfLetterOfWord = 0
        var numberOfLetterOfKeyWord = 0

        if (counterKeyWord > lenghtOfKeyWord-1){
            counterKeyWord = 0
        }

        for (j in 0 until 33){
            if (message[i] == array[j][0]){
                numberOfLetterOfWord = array[j][1] as Int

            }
            if(keyWord[counterKeyWord] == array[j][0]){
                numberOfLetterOfKeyWord = array[j][1] as Int

            }

        }
        for(j in 0 until 33){
            if(numberOfLetterOfWord+numberOfLetterOfKeyWord > 33){
                if (array[j][1] == numberOfLetterOfWord+numberOfLetterOfKeyWord-33){
                    result+= array[j][0]
                    break
                }
            }
            else{
                if (array[j][1] == numberOfLetterOfWord+numberOfLetterOfKeyWord){
                    result+= array[j][0]
                    break
                }
            }

        }
        counterKeyWord++





    }
    println(result)



}