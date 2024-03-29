package tw.andyang.bowlinggame

class BowlingGame {

    companion object {
        const val TOTAL_FRAMES = 10
    }

    private var score: Int = 0
    private var currentFrame = 0
    private var frames: MutableList<Frame> = mutableListOf()

    fun roll(frame: Frame) {
        currentFrame++

        frames.add(frame)
    }

    fun score(): Int {
        val size= frames.size
        frames.forEachIndexed { currentFrame, frame ->
            score += when (frame.type()) {
                Type.Strike -> {
                    var currentScore=10
                    var bounsBall = 0
                    if(frames.getOrNull(currentFrame + 1) != null){
                        if (frames[currentFrame + 1].type() == Type.Strike){
                            currentScore += 10
                            bounsBall++
                        } else {
                            currentFrame + frames[currentFrame + 1].score()
                        }
                    }
                    return currentScore
                }
                Type.Spare -> 10
                Type.Normal -> frame.score()
            }
        }
        return score
    }

    fun frame(): Int {
        return  currentFrame
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
        return Type.Normal
    }

    fun score(): Int {
        return rollPins.sum()
    }

}

enum class Type {
    Strike,
    Spare,
    Normal
}