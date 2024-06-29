package com.example.myblogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvblogger.layoutManager=LinearLayoutManager(this)
        displayAuthor()
    }

    fun displayAuthor(){
        var author1=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author2=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author3=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author4=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author5=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author6=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author7=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author8=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author9=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")
        var author10=Blog(" Trevor Noah","Born a crime","2nd,February,2000","Read More","This celebrated, unforgettable first novel, shortlisted for the prestigious Women's Prize for Fiction and set in Nigeria, gives voice to both husband and wife as they tell the story of their marriage--and the forces that threaten to tear it apart.","","")

     val myAuthors= listOf(author1,author2,author3,author4,author5,author6,author7,author8,author9,author10)
      val authorAdapter=BloggerAdapter(myAuthors)
      binding.rvblogger.adapter=authorAdapter
    }
}