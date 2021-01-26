package com.sagarock101

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import com.sagarock101.stylekit.R
import com.sagarock101.stylekit.databinding.FragmentDialogThemeBinding

class FragmentDialogTheme: DialogFragment(), RadioGroup.OnCheckedChangeListener {

    companion object {
        interface OnDialogThemeBtnListener {
            fun onDialogThemeBtnClick(themeName: String)
        }
    }

    var listener: OnDialogThemeBtnListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDialogThemeBinding.inflate(inflater)
        binding.rgThemes.setOnCheckedChangeListener(this)
        dialog?.window?.setBackgroundDrawable(
            ResourcesCompat.getDrawable(
                requireContext().resources,
                R.drawable.bg_semi_transparent_layer,
                null
            )
        )
        return binding.root
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
            when(checkedId) {
                R.id.rb_light_theme -> {
                    listener?.onDialogThemeBtnClick(getString(R.string.light_theme))
                }
                R.id.rb_dartk_theme -> {
                    listener?.onDialogThemeBtnClick(getString(R.string.dark_theme))
                }
            }
    }
}