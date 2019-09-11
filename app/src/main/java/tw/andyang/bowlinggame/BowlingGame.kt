package tw.andyang.bowlinggame

class BowlingGame {

    companion object {
        const val TOTAL_FRAMES = 10
    }

    private var score: Int = 0
    private var frameTimes = 0
    private var frames: MutableList<Frame> = mutableListOf()

    fun roll(frame: Frame) {
        frameTimes++

        frames.add(frame)
    }

    fun score(): Int {
        frames.forEachIndexed { i, frame ->
            frame.rollPins.forEach { pins ->
                score += pins
            }
        }

        return score
    }

    fun frame(): Int {
        return  frameTimes
    }

//    fun bonus(): Int {
//        if (frame() == 10)
//        {
//           TODO()
//        }
//    }
}

data class Frame(val rollPins: Array<Int>) {
    fun type(): Type {
        if(rollPins.size==2 && rollPins[0]+rollPins[1]==10){
            return Type.Spare
        } else if( rollPins.size == 1 && rollPins[0] == 10){
            return Type.Strike
        }
        return Type.Nothing
    }
}

enum class Type {
    Strike,
    Spare,
    Nothing
}