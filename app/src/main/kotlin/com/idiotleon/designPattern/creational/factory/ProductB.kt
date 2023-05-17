package com.idiotleon.designPattern.creational.factory

import com.idiotleon.designPattern.creational.factory.product.Product

class ProductB : Product {
    override fun doSomething() {
        println("ProductB is doing something")
    }
}