package com.idiotleon.designPattern.structural.facade

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 *
 * A single class that represents an entire subsystems.
 *
 * Reference:
 * https://mp.weixin.qq.com/s/HhUfOnrTP2g2WEuooMM1eA
 * https://www.dofactory.com/net/facade-design-pattern
 */
@Suppress(Annotation.UNUSED)
class Facade(
    private val subsystemA: SubsystemA,
    private val subsystemB: SubsystemB,
    private val subsystemC: SubsystemC
) {
    fun operate() {
        subsystemA.operateA()
        subsystemB.operateB()
        subsystemC.operateC()
    }
}