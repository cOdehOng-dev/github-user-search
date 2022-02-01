package com.c0de_h0ng.githubsearch.presentation

import android.view.ViewGroup
import com.c0de_h0ng.githubsearch.R
import com.c0de_h0ng.githubsearch.common.base.BaseListAdapter
import com.c0de_h0ng.githubsearch.common.base.BaseViewHolder
import com.c0de_h0ng.githubsearch.databinding.UserItemBinding
import com.c0de_h0ng.githubsearch.domain.model.User

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