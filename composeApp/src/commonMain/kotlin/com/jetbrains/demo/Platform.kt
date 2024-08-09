package com.jetbrains.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform