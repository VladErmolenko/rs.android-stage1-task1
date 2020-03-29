package subtask3

class BillCounter {

    // TODO: Complete the following function
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String =
        when(val difference = b - (bill.sum()-bill[k]) / 2) {
            0    -> "bon appetit"
            else -> difference.toString()
        }
    }

