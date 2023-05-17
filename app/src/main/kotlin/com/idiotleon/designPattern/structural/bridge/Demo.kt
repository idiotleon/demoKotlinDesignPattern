package com.idiotleon.designPattern.structural.bridge

import com.idiotleon.designPattern.util.Annotation


/**
 * @author Leon
 * Design Pattern - Bridge
 *
 * Separates the interface of an object from its implementation.
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 * https://www.dofactory.com/net/bridge-design-pattern
 */
@Suppress(Annotation.UNUSED)
class Demo {
    fun demo() {
        val concreteImplementationA = ConcreteImplementorA()
        val abstractionA = RefinedAbstractionA(concreteImplementationA)
        abstractionA.operate()

        val concreteImplementorB = ConcreteImplementorB()
        val abstractionB = RefinedAbstractionB(concreteImplementorB)
        abstractionB.operate()
    }
}