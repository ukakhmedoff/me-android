package io.forus.me.android.presentation.view.screens.records.item.validators

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import io.forus.me.android.presentation.R
import io.forus.me.android.presentation.helpers.inflate
import kotlinx.android.synthetic.main.validator_list_item.view.*

class ValidatorP2PVH(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.validator_list_item_p2p)) {
    init {

    }

    fun render(item: ValidatorViewModel) = with(itemView) {
        tv_name.text = item.name

        iv_icon.setImageUrl(item.imageUrl)
        iv_verification.setImageDrawable(resources.getDrawable(
                when(item.status){
                    ValidatorViewModel.Status.none -> R.drawable.ic_baseline_add_circle_outline
                    ValidatorViewModel.Status.pending -> R.drawable.ic_watch_later
                    ValidatorViewModel.Status.approved -> R.drawable.ic_verified_user
                    ValidatorViewModel.Status.declined -> R.drawable.ic_close
                }
        ))
    }
}