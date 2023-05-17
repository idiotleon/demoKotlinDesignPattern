package com.idiotleon.designPattern.structural.proxy

/**
 * @author: Leon
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 */
class RealSubject : Subject {
    override fun request() {
        println("The real subject is requesting.")
    }
}