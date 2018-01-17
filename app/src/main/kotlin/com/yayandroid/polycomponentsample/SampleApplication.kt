package com.yayandroid.polycomponentsample

import com.yayandroid.polycomponentsample.base.BaseSampleApplication
import com.yayandroid.polycomponentsample.base.FeatureApplicationComponent
import com.yayandroid.polycomponentsample.feature1.Feature1Component
import com.yayandroid.polycomponentsample.feature2.Feature2Component

class SampleApplication : BaseSampleApplication() {

    private val feature1component: Feature1Component by lazy {
        Feature1Component.create(coreApplicationComponent)
    }

    private val feature2component: Feature2Component by lazy {
        Feature2Component.create(coreApplicationComponent)
    }

    private val mainComponent: MainComponent by lazy {
        MainComponent.create(coreApplicationComponent)
    }

    override fun feature1ApplicationComponent(): FeatureApplicationComponent = feature1component

    override fun feature2ApplicationComponent(): FeatureApplicationComponent = feature2component

    override fun mainApplicationComponent(): FeatureApplicationComponent = mainComponent

}