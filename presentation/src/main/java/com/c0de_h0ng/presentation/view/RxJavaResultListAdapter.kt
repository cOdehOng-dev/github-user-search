package com.c0de_h0ng.presentation.view

import android.view.ViewGroup
import com.c0de_h0ng.domain.model.User
import com.c0de_h0ng.presentation.R
import com.c0de_h0ng.presentation.common.base.BaseListAdapter
import com.c0de_h0ng.presentation.common.base.BaseViewHolder
import com.c0de_h0ng.presentation.databinding.UserItemBinding

/**
 * Created by c0de_h0ng on 2022/02/01.
 */
class RxJavaResultListAdapter : BaseListAdapter<User>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<User, *> {
        return RxJavaResultViewHolder(parent)
    }

    inner class RxJavaResultViewHolder(parent: ViewGroup) : BaseViewHolder<User, UserItemBinding>(R.layout.user_item, parent) {
        override fun bind(data: User) {
            binding.run {
                this.profileUrl = data.profileUrl
                this.userName = data.login
            }
        }
    }

}