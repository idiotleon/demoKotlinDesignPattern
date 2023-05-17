package com.idiotleon.designPattern.structural.bridge

import com.idiotleon.designPattern.util.Annotation

/**
 * @author Leon
 * Design Pattern - Bridge
 *
 * Separates the interface of an object from its implementation.
 *
 * This is a concrete, not an abstract, class (implementation).
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 * https://www.dofactory.com/net/bridge-design-pattern
 */
@Suppress(Annotation.UNUSED)
class RefinedAbstractionB(private val implementor: Implementor) : Abstraction(implementor) {
    override fun operate(): String {
        println("RefinedAbstractionB is operating.")
        return implementor.operate()
    }
}