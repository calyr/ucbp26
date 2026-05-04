package com.ucb.app

import com.ucb.app.login.domain.vo.Email
import kotlin.test.Test
import kotlin.test.assertEquals


class EmailTest {

    @Test
    fun `test input email data`() {
        //arrange
        val inputData = "RobertoCarlos.callisaya@test.com"
        val expected = "robertocarlos.callisaya@test.com"
        //act
        val emailValueObject = Email.create(inputData)
        //assert
        assertEquals(expected, emailValueObject.value)
    }

    @Test
    fun `test input email data with multiple inputs`() {
        //arrange
        val inputs = mapOf(
         "ROBERTO@TEST.COM" to "roberto@test.com",
         "  espacio@test.com" to "espacio@test.com",
         " Roberto.Carlos@Test.com" to "roberto.carlos@test.com"
        )
        //act and assert
        inputs.forEach { (input, expected) ->
            val result = Email.create(input)
            assertEquals(expected, result.value, "Fail with input:$input")

        }
    }
}