package com.idiotleon.designPattern.structural.adapter

import com.idiotleon.designPattern.util.Annotation

/**
 * @author Leon
 * Design Pattern - Adapter
 *
 * Matches interfaces of different classes.
 * Converts the interface of a class into another interface clients expect.
 *
 * Reference:
 * https://mp.weixin.qq.com/s/TGBiceF-ZTJsV6djmTANCw
 * https://www.dofactory.com/net/adapter-design-pattern
 */
@Suppress(Annotation.UNUSED)
class Adapter(private val adaptee: Adaptee) : Target {
    override fun request() {
        adaptee.specificRequest()
    }
}