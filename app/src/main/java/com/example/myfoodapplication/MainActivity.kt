package com.example.myfoodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    private var title: String = "Halaman Utama"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rv_food)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        Log.d("ADD Data:", "setelah menambah data berhasil")
        showRecyclerList()

        setActionBarTitle(title)
    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodAdapter
        Log.d("show Data:", "menampilkan data berhasil")

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedFood(data)
                Log.d("pencet", "Berhasil dipencet")
            }

        })
    }

    private fun showSelectedFood(food: Food) {
//        Toast.makeText(this, "Kamu memilih " + food.name, Toast.LENGTH_SHORT).show()
        Log.d("pencet", "Berhasil Toast ${food.name}")
        val moveWithDataIntent = Intent(this@MainActivity, FoodDetailActivity::class.java)

        moveWithDataIntent.putExtra(
            FoodDetailActivity.EXTRA_FOOD,
            food
        )

        startActivity(moveWithDataIntent)
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val intent = Intent(this@MainActivity,AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}