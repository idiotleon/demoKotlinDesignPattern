package com.idiotleon.designPattern.creational.singleton

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 * Design Pattern - Singleton
 *
 * Reference:
 * https://mp.weixin.qq.com/s/TGBiceF-ZTJsV6djmTANCw
 */
@Suppress(Annotation.UNUSED)
class Singleton {
    init {
        println("Singleton object initialized")
    }

    fun doSomething() {
        println("Singleton is doing something")
    }
}