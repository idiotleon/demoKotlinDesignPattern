package com.idiotleon.designPattern.structural.composite

/**
 * @author Leon
 */
abstract class Component {
    var name: String? = null

    abstract fun add(component: Component)

    abstract fun remove(component: Component)

    abstract fun display(depth: Int)
}