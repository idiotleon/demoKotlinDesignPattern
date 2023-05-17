package com.idiotleon.designPattern.creational.prototype

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 * Design Pattern - Prototype:
 * by cloning an existing object, to create a new object
 *
 * Reference:
 * https://mp.weixin.qq.com/s/TGBiceF-ZTJsV6djmTANCw
 */
@Suppress(Annotation.UNUSED)
class ConcretePrototypeA(private var paramString: String = "") : Prototype() {

    fun setParamString(paramString: String) {
        this.paramString = paramString
    }

    override fun clone(): Prototype {
        val obj = ConcretePrototypeA()
        obj.setParamString(this.paramString)
        return obj
    }
}