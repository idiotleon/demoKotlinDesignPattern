package com.idiotleon.designPattern.creational.prototype

abstract class Prototype : Cloneable {
    abstract override fun clone(): Prototype
}