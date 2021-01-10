package com.sagarock101.core.utilities

import androidx.recyclerview.widget.RecyclerView
import com.sagarock101.core.bindings.getSnapPosition
import com.sagarock101.core.interfaces.OnSnapPositionChangeListener

class SnapOnScrollListener(
    var snapHelper: SnapHelper,
    var onSnapPositionChangeListener: OnSnapPositionChangeListener
): RecyclerView.OnScrollListener() {
    private var snapPosition = RecyclerView.NO_POSITION

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
//        notifySnapPositionChange(recyclerView)
    }

    private fun notifySnapPositionChange(recyclerView: RecyclerView) {
        val snapPosition = snapHelper.getSnapPosition(recyclerView)
        val snapPositionChanged = this.snapPosition != snapPosition
        if(snapPositionChanged) {
            onSnapPositionChangeListener?.onSnapPositionChange(snapPosition, this.snapPosition)
            this.snapPosition = snapPosition
        }
    }

    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        if(newState == RecyclerView.SCROLL_STATE_IDLE)
            notifySnapPositionChange(recyclerView)
    }
}