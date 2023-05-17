package com.idiotleon.designPattern.creational.builder

import com.idiotleon.designPattern.util.Annotation

/**
 * @author: Leon
 * Design Pattern - Builder
 *
 */
@Suppress(Annotation.UNUSED)
class Product private constructor(
    private val paramString: String,
    private val paramInt: Int,
    private val paramBoolean: Boolean
) {
    class Builder {
        private var paramString: String = ""
        private var paramInt: Int = 0
        private var paramBoolean: Boolean = false

        fun withParamString(paramString: String): Builder {
            this.paramString = paramString
            return this
        }

        fun withParamInt(paramInt: Int): Builder {
            this.paramInt = paramInt
            return this
        }

        fun withParamBoolean(paramBoolean: Boolean): Builder {
            this.paramBoolean = paramBoolean
            return this
        }

        fun build(): Product {
            return Product(paramString, paramInt, paramBoolean)
        }
    }
}