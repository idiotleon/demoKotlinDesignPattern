package com.idiotleon.designPattern.structural.bridge

import com.idiotleon.designPattern.util.Output

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
class ConcreteImplementorB : Implementor {
    override fun operate() = Output.CONCRETE_IMPLEMENTAION_B
}