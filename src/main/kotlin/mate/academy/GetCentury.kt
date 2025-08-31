package mate.academy

const val CENTURY_YEARS = 100

fun getCentury(year: Int) : Int {
    return if (year % 100 == 0) year / CENTURY_YEARS else year / CENTURY_YEARS + 1
}
