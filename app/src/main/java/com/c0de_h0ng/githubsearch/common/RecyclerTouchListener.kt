package com.c0de_h0ng.githubsearch.common

import android.view.View

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
interface RecyclerTouchListener {
    fun onClickItem(v: View, position: Int)
}