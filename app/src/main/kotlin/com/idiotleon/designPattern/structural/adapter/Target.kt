package com.idiotleon.designPattern.structural.adapter

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
interface Target {
    fun request()
}