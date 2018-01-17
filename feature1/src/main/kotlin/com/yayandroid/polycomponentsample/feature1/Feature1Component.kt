package com.yayandroid.polycomponentsample.feature1

import android.app.Activity
import com.yayandroid.polycomponentsample.base.BaseSampleApplication
import com.yayandroid.polycomponentsample.base.CoreApplicationComponent
import com.yayandroid.polycomponentsample.base.FeatureApplicationComponent
import com.yayandroid.polycomponentsample.base.di.SampleCoreComponent
import dagger.Component

@Feature1Scope
@Component(dependencies = arrayOf(SampleCoreComponent::class))
interface Feature1Component : FeatureApplicationComponent {

    companion object {
        fun create(coreApplicationComponent: CoreApplicationComponent): Feature1Component
                = DaggerFeature1Component.builder()
                .sampleCoreComponent(coreApplicationComponent as SampleCoreComponent)
                .build()
    }

    fun inject(activity: Feature1Activity)

}

internal fun Activity.getApplicationComponent()
        = (application as BaseSampleApplication).feature1ApplicationComponent() as Feature1Component