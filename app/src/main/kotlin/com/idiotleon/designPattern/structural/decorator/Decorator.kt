package com.idiotleon.designPattern.structural.decorator

abstract class Decorator(private val component: Component) : Component {
    override fun operate() {
        component.operate()
    }
}