package com.example.myfoodapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)


    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]


        Glide.with(holder.itemView.context)
            .load(food.photo)
            .centerCrop()
            .apply(RequestOptions().override(120, 140))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.tvCountry.text = food.country
        holder.tvDetail.text = food.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
//            Toast.makeText(holder.itemView.context, "Kamu memilih " + listFood[position].name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCountry: TextView = itemView.findViewById(R.id.tv_item_country)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }

}