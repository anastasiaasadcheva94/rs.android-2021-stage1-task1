package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val bracketsOpen = charArrayOf('<', '(', '[')
        val bracketsClose = charArrayOf('>', ')', ']')

        val result = mutableListOf<String>()
        var count = 0

        for (i in inputString.withIndex()) {
            if (i.value in bracketsOpen) {
                val indexOpenBracket = bracketsOpen.indexOf(i.value)
                val close = bracketsClose[indexOpenBracket]

                for (j in i.index + 1 until inputString.length) {
                    when {
                        inputString[j] == i.value -> count++
                        inputString[j] == close -> if (count == 0) {
                            result.add(inputString.substring(i.index + 1 until j))
                        } else {
                            count--
                        }
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}