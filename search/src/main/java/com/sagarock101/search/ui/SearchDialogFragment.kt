package com.sagarock101.search.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.DialogFragment
import com.sagarock101.core.utils.MyAnimationUtils.enterReveal2FromFab
import com.sagarock101.core.utils.MyAnimationUtils.startColorAnimation
import com.sagarock101.search.R
import com.sagarock101.search.databinding.FragmentDialogSearchBinding
import kotlin.properties.Delegates

class SearchDialogFragment : DialogFragment() {

    lateinit var binding: FragmentDialogSearchBinding
    var fabWidth by Delegates.notNull<Int>()
    var fabHeight by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, android.R.style.ThemeOverlay)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDialogSearchBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.addOnLayoutChangeListener(object : View.OnLayoutChangeListener {
            override fun onLayoutChange(
                v: View?,
                left: Int,
                top: Int,
                right: Int,
                bottom: Int,
                oldLeft: Int,
                oldTop: Int,
                oldRight: Int,
                oldBottom: Int
            ) {
                view.removeOnLayoutChangeListener(this)
                view.enterReveal2FromFab(fabWidth, fabHeight)
                view.startColorAnimation(ResourcesCompat.getColor(requireContext().resources, com.sagarock101.stylekit.R.color.colorPrimary, null),
                    ResourcesCompat.getColor(requireContext().resources, R.color.white, null), 2000
                )
            }

        })
    }

    fun setMeasureWidthHeightOfFab(fabWidth: Int, fabHeight: Int) {
        this.fabWidth = fabWidth
        this.fabHeight = fabHeight
    }

}