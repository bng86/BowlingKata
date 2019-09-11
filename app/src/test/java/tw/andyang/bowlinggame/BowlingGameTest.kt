package tw.andyang.bowlinggame

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Ignore
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
            game.roll(Frame(arrayOf(0,0)))
        }
        assertEquals(0, game.score())
    }

    @Test
    fun `test all roll is 1 then got score 20`() {
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(arrayOf(1, 1)))
        }
        assertEquals(20, game.score())
    }

    @Test
    fun `test roll 10 pins will show "strike"`() {
        val frame = Frame( arrayOf(10))
        assertEquals(Type.Strike, frame.type())
    }

    @Test
    fun `roll 2 times and total pins is 10 will show "spare"`() {
        val frame = Frame( arrayOf(5,5))
        assertEquals(Type.Spare, frame.type())
    }

    @Test
    fun `roll 2 times and total pins is 6 will show nothing`(){
        val frame = Frame( arrayOf(4,2))
        assertEquals(Type.Nothing, frame.type())
    }

    @Test
    fun `check Frame is 10`(){
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(arrayOf(0,0)))
        }
        assertEquals(10, game.frame())
    }

    @Test
    fun `test all strike total score is 300`() {
        for (i in 0 until BowlingGame.TOTAL_FRAMES) {
            game.roll(Frame(arrayOf(10)))
        }
        assertEquals(300, game.score())
    }

    @Test
    @Ignore
    fun `test strike get bonus`() {
        val bonus = game.roll(Frame(arrayOf(10)))

        assertNotNull(bonus)
    }

    @Test
    fun `in one frame rollpins 1 and 2 , get 3 score`() {
        val frame = Frame(arrayOf(1, 2))

        assertEquals(3, frame.score())
    }
}