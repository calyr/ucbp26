package com.ucb.app.login.domain.vo

import kotlin.jvm.JvmInline

@JvmInline
value class Email private constructor(val value: String) {

    companion object {
        fun create(raw: String): Email {
            val sanitizedValue = raw.lowercase().trim()
            val data = Email(sanitizedValue)
            return data
        }
    }
    override fun toString(): String {
        return value
    }
}