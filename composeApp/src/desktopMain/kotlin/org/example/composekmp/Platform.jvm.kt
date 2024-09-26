package org.example.composekmp

import Platform

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

//actual fun getPlatform(): Platform = JVMPlatform()