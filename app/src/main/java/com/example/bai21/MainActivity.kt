package com.example.bai21

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bai21.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navleftMenu.itemIconTintList = null

        binding.navleftMenu.setNavigationItemSelectedListener {
            when(it.itemId)
            {
               R.id.home->Toast.makeText(this,"home",Toast.LENGTH_SHORT).show()
               R.id.exit->Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show()
               R.id.message->Toast.makeText(this,"messagef" +
                       "",Toast.LENGTH_SHORT).show()
            }
            true
        }

    }
}