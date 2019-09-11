package tw.andyang.bowlinggame

class BowlingGame {

    companion object {
        const val TOTAL_FRAMES = 10
    }

    private var score: Int = 0

    fun roll(frame: Frame) {

    }

    fun score(): Int {
        return score
    }
}

data class Frame(val index: Int, val rollPins: Array<Int>)