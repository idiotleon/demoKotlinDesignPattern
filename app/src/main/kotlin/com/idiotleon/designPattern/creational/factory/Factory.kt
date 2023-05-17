package com.idiotleon.designPattern.creational.factory

import com.idiotleon.designPattern.creational.factory.product.Product
import com.idiotleon.designPattern.creational.factory.product.ProductA
import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 * Design Pattern - Factory
 *
 * Reference:
 * https://mp.weixin.qq.com/s/TGBiceF-ZTJsV6djmTANCw
 */
@Suppress(Annotation.UNUSED)
class Factory {
    fun createProduct(type: String): Product {
        return when (type) {
            "A" -> ProductA()
            "B" -> ProductB()
            else -> throw IllegalArgumentException("Invalid product type")
        }
    }
}