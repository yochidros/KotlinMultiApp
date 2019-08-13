package com.yochidros.common

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin Hello World!!!! ${platformName()}"
}


expect fun currentTimeMillis(): Long

fun currentTimeSeconds(): Long = currentTimeMillis() / 1000