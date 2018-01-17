package com.yayandroid.polycomponentsample.base.di

import com.yayandroid.polycomponentsample.base.SampleCoreLogger
import dagger.Module
import dagger.Provides

@Module
class SampleCoreModule {

    @CoreScope
    @Provides fun providesSampleCoreLogger(): SampleCoreLogger = SampleCoreLogger()

}