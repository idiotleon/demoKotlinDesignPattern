package com.idiotleon.designPattern.structural.decorator

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 */
@Suppress(Annotation.UNUSED)
class ConcreteDecoratorB(component: Component) : Decorator(component) {
    override fun operate() {
        super.operate()
        println("ConcreteDecoratorB is operating.")
    }
}