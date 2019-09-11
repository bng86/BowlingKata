package tw.andyang.bowlinggame

class BowlingGame {

    companion object {
        const val TOTAL_FRAMES = 10
    }

    private var score: Int = 0

    fun roll(frame: Frame) {
        frame.rollPins.forEach { pins ->
            score += pins
        }
    }

    fun score(): Int {
        return score
    }
}

data class Frame(val index: Int, val rollPins: Array<Int>) {
    fun type(): Type {
        return Type.Strike
    }
}

enum class Type {
    Strike,
    Spare
}