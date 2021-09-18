package com.example.myfoodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class FoodDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_FOOD = "extra_food"
    }
    private var title: String = "Detail Makanan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        setActionBarTitle(title)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvCountry: TextView = findViewById(R.id.tv_item_country)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.iv_item_photo)
        val tvTools: TextView = findViewById(R.id.tv_item_tools)
        val tvRecipe: TextView = findViewById(R.id.tv_item_recipe)
        val btnShare: Button = findViewById(R.id.btn_share)


        val food = intent.getSerializableExtra(EXTRA_FOOD) as? Food

        if (food != null) {
            Glide.with(this@FoodDetailActivity)
                .load(food.photo)
                .apply(RequestOptions().override(120, 140))
                .into(imgPhoto)
            tvName.text = food.name
            tvCountry.text = food.country
            tvDetail.text = food.detail
            tvTools.text = food.tools
            tvRecipe.text = food.recipe

            btnShare.setOnClickListener {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Haii, Coba lihat resep " + food.name + "ini! Mungkin menarik"
                )
                intent.type = "text/plain"
                startActivity(intent)
            }

        }



    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}