package kr.co.hanbit.wipitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kr.co.hanbit.wipitest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnNext = binding.btnNext

        binding.btnBack.setOnClickListener {
            /*val intent = Intent(this, Activity::class.java)
            startActivity(intent)*/
        }
        btnNext.setOnClickListener {
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.main_frame, Fraghobby()).commit()
        }


    }
}