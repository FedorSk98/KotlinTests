package tasks

class DayRelease {

    fun findDayoffs(day: Int, array: List<Int>): Int {

        var countVersion = 0
        var countDays = 0

        for (element in array){
            if (element == 0){
                countDays++
                if (countDays == day){
                    countVersion++
                }else if (countDays > day){
                    countVersion += countDays
                }
            }else{
                countDays = 0
            }
        }

        return countVersion
    }
}