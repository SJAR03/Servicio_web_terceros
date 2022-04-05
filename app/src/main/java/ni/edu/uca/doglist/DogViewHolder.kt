package ni.edu.uca.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ni.edu.uca.doglist.databinding.ItemDogBinding

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image: String){
        Picasso.get().load(image).into(binding.ivDog)
    }

}