package com.sagarock101.categories.ui.adapter

import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivities
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.categories.R
import com.sagarock101.categories.databinding.ItemSourcesBinding
import com.sagarock101.categories.model.Source
import com.sagarock101.core.adapter.BaseAdapter
import com.sagarock101.core.utilities.Utils
import com.sagarock101.core.viewholder.BaseViewHolder

class SourcesAdapter : BaseAdapter<Source>() {

    var selectedPosition = -1
    var lastSelectedPosition = -1

    private var objectAnimator: ObjectAnimator? = null

    override fun getLayoutId(position: Int, obj: Source) = R.layout.item_sources

    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Source> {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemSourcesBinding.inflate(layoutInflater, parent, false)

        return SourceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as SourceViewHolder
        if (position == selectedPosition)
            holder.expand()
        else holder.collapse()
        viewHolder.bind(listItems[position])
    }


    inner class SourceViewHolder(private val binding: ItemSourcesBinding) :
        BaseViewHolder<Source>(binding), View.OnClickListener {

        override fun bind(item: Source) {
            binding.source = item
            binding.cvParent.setOnClickListener(this)
            binding.btnOpenInBrowser.setOnClickListener(this)

        }

        fun expand() {
            hideShowDetails(VISIBLE)
            rotateArrow(true)
        }

        private fun rotateArrow(shouldRotate: Boolean) {
            if (shouldRotate) {
                rotatingObjectAnimator(0f, 90f)
            } else {
                if (binding.ivRightArrow.rotation == 90f)
                    rotatingObjectAnimator(90f, 0f)
            }
        }

        fun collapse() {
            hideShowDetails(GONE)
            rotateArrow(false)
        }

        private fun hideShowDetails(visibility: Int) {
            with(binding) {
                btnOpenInBrowser.visibility = visibility
                tvSourceDesc.visibility = visibility
            }
        }

        private fun rotatingObjectAnimator(from: Float, to: Float) {
            objectAnimator = ObjectAnimator.ofFloat(binding.ivRightArrow, View.ROTATION, from, to)
            objectAnimator?.apply {
                duration = 300
                start()
            }
        }

        override fun onClick(v: View?) {
            when (v) {
                binding.cvParent -> clickEventLogic()
                binding.btnOpenInBrowser -> clickEventLogic()
            }
        }

        private fun openBrowser() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(binding.source!!.url))
            startActivity(itemView.context, intent, null)
        }

        private fun clickEventLogic() {
            selectedPosition = adapterPosition
            if (lastSelectedPosition == -1) {
                lastSelectedPosition = selectedPosition
            } else {
                if (lastSelectedPosition != selectedPosition)
                    notifyItemChanged(lastSelectedPosition)
                if (lastSelectedPosition == selectedPosition) {
                    notifyItemChanged(lastSelectedPosition)
                    notifyItemChanged(selectedPosition)
                    lastSelectedPosition = -1
                    selectedPosition = -1
                    return
                }
                lastSelectedPosition = selectedPosition
            }
            notifyItemChanged(selectedPosition)
        }

    }

}