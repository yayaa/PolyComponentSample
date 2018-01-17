package com.yayandroid.polycomponentsample.feature2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.yayandroid.polycomponentsample.base.SampleCoreLogger
import javax.inject.Inject

class Feature2Activity : AppCompatActivity() {

    @Inject lateinit var sampleCoreLogger: SampleCoreLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_2)

        val feature2Component = getApplicationComponent()
        feature2Component.inject(this)
        sampleCoreLogger.logSelf()

        findViewById<TextView>(R.id.sampleTextView).apply {
            text = "Component: \n ${sampleCoreLogger.string(feature2Component)}"
        }
    }
}
