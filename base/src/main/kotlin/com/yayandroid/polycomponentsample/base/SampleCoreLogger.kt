package com.yayandroid.polycomponentsample.base

import android.util.Log

class SampleCoreLogger {

    fun logSelf() = Log.e("SampleCoreLogger", "SampleCoreLogger instance: $this with hashcode: ${this.hashCode()}")

    fun string(component: ApplicationComponent) = "${component.javaClass.simpleName} ${component.hashCode()}"

}