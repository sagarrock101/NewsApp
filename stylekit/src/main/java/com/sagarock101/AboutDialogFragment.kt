package com.sagarock101

import android.graphics.Point
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.*
import android.widget.RadioGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import com.sagarock101.stylekit.R
import com.sagarock101.stylekit.binding.getThemeId
import com.sagarock101.stylekit.databinding.FragmentAboutDialogBinding
import com.sagarock101.stylekit.databinding.FragmentDialogThemeBinding

class AboutDialogFragment : DialogFragment(), View.OnClickListener {

    private lateinit var binding: FragmentAboutDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay_Material)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutDialogBinding.inflate(inflater)
        setDescriptionText()
        binding.btnOk.setOnClickListener(this)
        return binding.root
    }

    private fun setDescriptionText() {
        binding.tvDesc.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onResume() {
        val window = dialog!!.window
        window?.setBackgroundDrawableResource(
            R.drawable.bg_semi_transparent_layer
        )
        val size = Point()
        val display = window?.windowManager?.defaultDisplay
        display?.getSize(size)
        val width = (size.x * 0.9).toInt()
        val height = (size.y * 0.9).toInt()

        window?.setLayout(width, height)
        window?.setGravity(Gravity.CENTER)
        super.onResume()
    }

    override fun onClick(v: View?) {
       when(v) {
           binding.btnOk -> dismiss()
       }
    }

}