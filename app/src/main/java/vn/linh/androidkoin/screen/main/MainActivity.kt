package vn.linh.androidkoin.screen.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject
import vn.linh.androidkoin.R
import vn.linh.androidkoin.data.source.UserRepository

class MainActivity : AppCompatActivity() {

    val userRepository:UserRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
