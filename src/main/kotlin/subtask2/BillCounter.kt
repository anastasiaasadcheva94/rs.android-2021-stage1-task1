package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlySplit = "bon appetit"
        val check = bill.sum()

        val actual: Int = (check - bill[k]) / 2 // сумма без еды Анны

        val anna = if (actual == b) {
            fairlySplit
        } else {
            (b - actual).toString()
        }
        return anna
    }
}
