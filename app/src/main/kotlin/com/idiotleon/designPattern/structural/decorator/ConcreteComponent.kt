package com.idiotleon.designPattern.structural.decorator

import com.idiotleon.designPattern.util.Annotation

@Suppress(Annotation.UNUSED)
class ConcreteComponent : Component {
    override fun operate() {
        println("ConcreteComponent is operating.")
    }
}