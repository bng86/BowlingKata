package tw.andyang.bowlinggame

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BowlingGameTest {

    private lateinit var  game: BowlingGame

    @Before
    fun setUp() {
        game = BowlingGame()
    }

    @Test
    fun `test game frames is 10`() {
        assertEquals(10, BowlingGame.TOTAL_FRAMES)
    }

    @Test
    fun `test all roll is zero then got score zero`() {
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(i, arrayOf(0,0)))
        }
        assertEquals(0, game.score())
    }

    @Test
    fun `test all roll is 1 then got score 20`() {
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(i, arrayOf(1, 1)))
        }
        assertEquals(20, game.score())
    }

    @Test
    fun `test roll 10 pins will show "strike"`() {
        val frame = Frame( 0, arrayOf(10))
        assertEquals(Type.Strike, frame.type())
    }

    @Test
    fun `roll 2 times and total pins is 10 will show "spare"`() {
        val frame = Frame( 0, arrayOf(5,5))
        assertEquals(Type.Spare, frame.type())
    }

    @Test
    fun `roll 2 times and total pins is 6 will show nothing`(){
        val frame = Frame( 0, arrayOf(4,2))
        assertEquals(Type.Nothing, frame.type())
    }

    @Test
    fun `check Frame is 10`(){
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(i, arrayOf(0,0)))
        }
        assertEquals(10, game.frame())
    }
}