package com.yayandroid.polycomponentsample

import android.app.Activity
import com.yayandroid.polycomponentsample.base.CoreApplicationComponent
import com.yayandroid.polycomponentsample.base.FeatureApplicationComponent
import com.yayandroid.polycomponentsample.base.di.ActivityScope
import com.yayandroid.polycomponentsample.base.di.SampleCoreComponent
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(SampleCoreComponent::class))
abstract class MainComponent : FeatureApplicationComponent{

    companion object {
        fun create(coreComponent: CoreApplicationComponent): MainComponent = DaggerMainComponent.builder()
                .sampleCoreComponent(coreComponent as SampleCoreComponent)
                .build()
    }

    abstract fun inject(activity: MainActivity)

}

internal fun Activity.getMainComponent() = (application as SampleApplication).mainApplicationComponent() as MainComponent