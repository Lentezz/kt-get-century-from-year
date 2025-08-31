package mate.academy

const val CENTURY_YEARS = 100
const val CENTURY_BOUNDARY_INCREMENT = 1
const val CENTURY_REMAINDER = 0

fun getCentury(year: Int) : Int {
    return if (year % CENTURY_YEARS == CENTURY_REMAINDER)
        year / CENTURY_YEARS
    else year / CENTURY_YEARS + CENTURY_BOUNDARY_INCREMENT
}
