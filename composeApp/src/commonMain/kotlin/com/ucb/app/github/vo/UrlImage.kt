package com.ucb.app.github.vo

import kotlin.jvm.JvmInline

@JvmInline
value class UrlImage(val value: String) {
    init {
        require(value.startsWith("https://")) {
            "UrlImage must start with HTTPS"
        }
        require(value.isNotBlank()) {
            "UrlImage must not be blank"
        }
    }

    override fun toString(): String {
        return value
    }
}