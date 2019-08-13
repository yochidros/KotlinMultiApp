
package com.yochidros.common

actual fun platformName() : String {
    return "Android"
}
actual fun currentTimeMillis(): Long {
    return System.currentTimeMillis()
}