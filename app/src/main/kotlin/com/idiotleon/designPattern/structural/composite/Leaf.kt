package com.idiotleon.designPattern.structural.composite

import java.lang.UnsupportedOperationException

class Leaf : Component() {
    override fun add(component: Component) {
        throw UnsupportedOperationException("Components cannot be added to Leaf.")
    }

    override fun remove(component: Component) {
        throw UnsupportedOperationException("Components of a Leaf cannot be removed.")
    }

    override fun display(depth: Int) {

    }
}