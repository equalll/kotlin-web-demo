<answer>operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)</answer>

class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate> {
    override fun contains(item: MyDate): Boolean = start < item && item < endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}