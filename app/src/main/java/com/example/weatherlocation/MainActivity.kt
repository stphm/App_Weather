package com.example.weatherlocation

import android.Manifest
import android.content.pm.PackageManager
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import java.lang.Override as Override1

class MainActivity : AppCompatActivity() {

    val APP_ID:String = "5fd34a7d5dbc21e24dac7d70ad7b6004"
    val WEATHER_URL:String = "https://openweathermap.org/data/2.5/weather"

    val MIN_TIME:Long = 5000
    val MIN_DISTANCE:Float = 1000F;
    val REQUEST_CODE:Int = 101;

    var  Location_Provider:String = LocationManager.GPS_PROVIDER


    @Override1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    }
}