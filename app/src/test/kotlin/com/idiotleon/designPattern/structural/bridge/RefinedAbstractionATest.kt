package com.idiotleon.designPattern.structural.bridge

import com.idiotleon.designPattern.util.Output
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class RefinedAbstractionATest {
    @Test
    fun `refined abstraction A returns expected`() {
        val concreteImplementationA = ConcreteImplementorA()
        val abstraction = RefinedAbstractionA(concreteImplementationA)
        assertEquals(Output.CONCRETE_IMPLEMENTAION_A, abstraction.operate())
    }

    @Test
    fun `refined abstraction B returns expected`() {
        val concreteImplementationB = ConcreteImplementorB()
        val abstraction = RefinedAbstractionA(concreteImplementationB)
        assertEquals(Output.CONCRETE_IMPLEMENTAION_B, abstraction.operate())
    }
}