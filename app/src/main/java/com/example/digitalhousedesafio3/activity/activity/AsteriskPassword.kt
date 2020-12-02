package com.example.digitalhousedesafio3.activity.activity

import android.text.method.PasswordTransformationMethod
import android.view.View

class AsteriskPassword : PasswordTransformationMethod() {
    override fun getTransformation(source: CharSequence?, view: View?): CharSequence {
        return Password(source!!)
    }

    private inner class Password(private val mSource: CharSequence) : CharSequence {

        override val length: Int
            get() = mSource.length

        override fun get(index: Int): Char {
            return '*'
        }

        override fun subSequence(start: Int, end: Int): CharSequence {
            return mSource.subSequence(start, end)
        }

    }
}