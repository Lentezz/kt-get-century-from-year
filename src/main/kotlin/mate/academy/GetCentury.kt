package mate.academy

const val CENTURY_YEARS = 100
const val CENTURY_BOUNDARY_INCREMENT = 1

fun getCentury(year: Int) : Int {
    return if (year % 100 == 0) year / CENTURY_YEARS else year / CENTURY_YEARS + CENTURY_BOUNDARY_INCREMENT
}
