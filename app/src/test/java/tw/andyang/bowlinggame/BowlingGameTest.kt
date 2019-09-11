package tw.andyang.bowlinggame

import junit.framework.Assert.assertEquals
import org.junit.Test

class BowlingGameTest{


    @Test
    fun testFrames() {
        val game = BowlingGame()
        assertEquals(10, game.totalFrames)
    }

    @Test
    fun testRollResult() {
        val game = BowlingGame()
        assertEquals("spare", game.roll())
    }
}