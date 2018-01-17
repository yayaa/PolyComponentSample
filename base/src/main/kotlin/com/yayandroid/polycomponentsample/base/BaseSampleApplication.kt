package com.yayandroid.polycomponentsample.base

import android.app.Application
import com.yayandroid.polycomponentsample.base.di.DaggerSampleCoreComponent

abstract class BaseSampleApplication : Application() {

    val coreApplicationComponent: CoreApplicationComponent by lazy {
        DaggerSampleCoreComponent.builder()
                .application(this)
                .build()
    }

    abstract fun feature1ApplicationComponent(): FeatureApplicationComponent

    abstract fun feature2ApplicationComponent(): FeatureApplicationComponent

    abstract fun mainApplicationComponent(): FeatureApplicationComponent

}