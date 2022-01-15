package com.example.sdk_project.ui.main.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sdk_project.R
import com.example.sdk_project.databinding.RecyclerviewItemBinding
import com.example.sdk_project.ui.main.dto.MainResponseDTO
import com.example.sdk_project.ui.main.viewmodel.MainViewModel

class MainAdapter (val context: Context,
                   val productData: List<MainResponseDTO.PostList>,
                   val vm: MainViewModel
) : RecyclerView.Adapter<MainAdapter.Holder>() {

    private lateinit var binding: RecyclerviewItemBinding
    var liked = 0

    var like: Boolean = false

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        binding = DataBindingUtil.inflate<RecyclerviewItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_item, parent, false
        )

        return Holder(binding.root)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        Log.d("Main", "onBindViewHolder: ${productData.get(position)}")

        binding.run {
            productData.get(position).run {

            }
        }

    }

    override fun getItemCount(): Int {
        return productData.size
    }

    fun getName(name: String): String {
        when (name) {
            "SCHOOL" -> return "교내"
            "SUBURBS" -> return "교외"
            "GRADE_FIRST" -> return "1학년"
            "GRADE_SECOND" -> return "2학년"
            "GRADE_THIRD" -> return "3학년"
        }
        return "default"
    }
}