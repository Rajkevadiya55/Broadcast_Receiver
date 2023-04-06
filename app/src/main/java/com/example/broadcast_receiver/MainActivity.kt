package com.example.broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.broadcast_receiver.databinding.ActivityMainBinding
import java.util.Locale.filter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //get permission
        if (ContextCompat.checkSelfPermission(
                this,android.Manifest.permission
                    .READ_PHONE_STATE

        )!=PackageManager.PERMISSION_GRANTED){
         ActivityCompat.requestPermissions(this,
         arrayOf(android.Manifest.permission.READ_PHONE_STATE),369)
        }
    }
}