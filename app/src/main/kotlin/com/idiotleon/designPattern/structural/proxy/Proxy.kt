package com.idiotleon.designPattern.structural.proxy

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 *
 * An object representing another object.
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 * https://www.dofactory.com/net/design-patterns
 */
@Suppress(Annotation.UNUSED)
class ProxySubject(private val realSubject: RealSubject) : Subject {
    override fun request() {
        println("The proxy subject is requesting.")
        realSubject.request()
    }
}