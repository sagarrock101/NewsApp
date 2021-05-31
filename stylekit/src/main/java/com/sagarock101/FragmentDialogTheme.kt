package com.sagarock101

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import com.sagarock101.stylekit.R
import com.sagarock101.stylekit.binding.getThemeId
import com.sagarock101.stylekit.databinding.FragmentDialogThemeBinding

class FragmentDialogTheme: DialogFragment(), RadioGroup.OnCheckedChangeListener {

    companion object {
        interface OnDialogThemeBtnListener {
            fun onDialogThemeBtnClick(themeName: String)
        }
    }

    private var checkedThemeRes: Int? = null

    private lateinit var binding: FragmentDialogThemeBinding
    private var listener: OnDialogThemeBtnListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDialogThemeBinding.inflate(inflater)
        dialog?.window?.setBackgroundDrawable(
            ResourcesCompat.getDrawable(
                requireContext().resources,
                R.drawable.bg_semi_transparent_layer,
                null
            )
        )
        highLightSelectedTheme()
        binding.rgThemes.setOnCheckedChangeListener(this)
        return binding.root
    }

    private fun highLightSelectedTheme() {
        if(checkedThemeRes == R.style.LightTheme)
            binding.rbLightTheme.isChecked = true
        else binding.rbDartkTheme.isChecked = true
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

    fun setListener(listener: OnDialogThemeBtnListener) {
        this.listener = listener
    }

    fun setThemeToBeChecked(themeRes: Int) {
        checkedThemeRes = themeRes
    }
}