package tw.andyang.bowlinggame

import junit.framework.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class BowlingGameTest {


    @Test
    fun `test game frames is 10`() {
        assertEquals(10, BowlingGame.TOTAL_FRAMES)
    }

    @Test
    fun `test all roll is zero then got score zero`() {
        val game = BowlingGame()
        for (i in 0 until 20) {
            game.roll(Frame(i, arrayOf(0,0)))
        }
        assertEquals(0, game.score())
    }

    @Test
    @Ignore
    fun `test all roll is 1 then got score 20`() {
        val game = BowlingGame()
        for (i in 0 until 20) {
//            game.roll(1)
        }
        assertEquals(20, game.score())
    }
}