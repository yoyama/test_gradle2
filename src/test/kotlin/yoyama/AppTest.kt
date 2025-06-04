package yoyama

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class AppTest {
    @Test
    fun testGreeting() {
        val outContent = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outContent))
        try {
            App().greeting()
            assertEquals("Hello World\n", outContent.toString())
        } finally {
            System.setOut(originalOut)
        }
    }
}
