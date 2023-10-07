package over1000

class Solution2483 {

    fun bestClosingTime(customers: String): Int {

        val closePenalty = IntArray(customers.length)
        val openPenalty = IntArray(customers.length)

        if (customers[0] == 'Y') {
            closePenalty[0] = 1
        } else {
            openPenalty[0] = 1
        }

        for (i in 1..customers.lastIndex) {
            val c = customers[i]
            if (c == 'Y') {
                closePenalty[i] = closePenalty[i - 1] + 1
                openPenalty[i] = openPenalty[i - 1]
            } else {
                closePenalty[i] = closePenalty[i - 1]
                openPenalty[i] = openPenalty[i - 1] + 1
            }
        }

        var minPenalty = closePenalty[customers.lastIndex]
        var idx = 0
        for (i in 1..customers.lastIndex) {
            val penalty = closePenalty[customers.length - 1] - closePenalty[i - 1] + openPenalty[i - 1]
            if (penalty < minPenalty) {
                minPenalty = penalty
                idx = i
            }
        }

        if (openPenalty[customers.lastIndex] < minPenalty) {
            idx = customers.lastIndex + 1
        }


        return idx

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //add example
        }
    }
}
