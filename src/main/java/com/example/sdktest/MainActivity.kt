package com.example.sdktest

import ai.paravision.sdk.android.ParavisionFaceSDK
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.media.Image
import android.media.ImageReader
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var faceSDKInstance = ParavisionFaceSDK.Builder(applicationContext)
            .sdkMode(ParavisionFaceSDK.SDKMode.BENCHMARK)
            .build()

       val imageView: ImageView = findViewById(R.id.imageView)
        val bitMap = BitmapFactory.decodeResource(resources, R.drawable.sample)
        val displayOptions = arrayOf(ParavisionFaceSDK.FaceDetectionOption.BOUNDING_BOX)


        val paravisionFaceResult = faceSDKInstance.processFullImage( bitMap, displayOptions, true)
        print("hi");
        if (paravisionFaceResult != null) {
            Log.d("Size: ", paravisionFaceResult.faces. );
        }
    }
}

