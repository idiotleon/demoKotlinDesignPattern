package com.idiotleon.designPattern.creational.factory.abstract

import com.idiotleon.designPattern.creational.factory.product.ProductA
import com.idiotleon.designPattern.creational.factory.ProductB
import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 * Design Pattern - Abstract Factory
 *
 * Reference:
 * https://mp.weixin.qq.com/s/TGBiceF-ZTJsV6djmTANCw
 */
@Suppress(Annotation.UNUSED)
class ConcreteFactory : AbstractFactory {
    override fun createProductA(): ProductA {
        return ProductA()
    }

    override fun createProductB(): ProductB {
        return ProductB()
    }
}