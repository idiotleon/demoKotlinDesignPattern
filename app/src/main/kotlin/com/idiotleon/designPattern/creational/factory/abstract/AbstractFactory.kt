package com.idiotleon.designPattern.creational.factory.abstract

import com.idiotleon.designPattern.creational.factory.product.ProductA
import com.idiotleon.designPattern.creational.factory.ProductB

interface AbstractFactory {
    fun createProductA(): ProductA
    fun createProductB(): ProductB
}
