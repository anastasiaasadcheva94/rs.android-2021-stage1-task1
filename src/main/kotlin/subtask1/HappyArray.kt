package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val sad = sadArray.toMutableList()
        var i = 1

        while (i <= sad.size - 2) {
            if (sad[i - 1] + sad[i + 1] <= sad[i]) {
                sad.removeAt(i)
                i=1
            }
            i++
        }
        return sad.toIntArray()
    }
}
