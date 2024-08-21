package tasks


class LineNumbers {

    fun someMethod(list: List<Int>): Boolean {

        var counter = 1
        val countNumbersIsLine = 3
        var result = false

        for (i in 0..<list.size - 1) {
            if (list[i] + 1 == list[i + 1]) {
                counter++
            } else if (list[i] - 1 == list[i + 1]) {
                counter--
            } else {
                counter = 1
            }
            if (counter == countNumbersIsLine || counter == -countNumbersIsLine) {
                result = true
                break
            }
        }

        return result
    }
}