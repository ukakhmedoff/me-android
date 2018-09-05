package io.forus.me.android.presentation.view.screens.qr.dialogs

import android.content.Context
import com.afollestad.materialdialogs.MaterialDialog
import io.forus.me.android.presentation.R


class ScanVoucherNotEligibleDialog(private val context: Context,
                                   private val dismissListener: () -> Unit){

    private val dialog: MaterialDialog = MaterialDialog.Builder(context)
            .title(R.string.voucher)
            .content(R.string.qr_voucher_access_denied)
            .icon(context.resources.getDrawable(R.drawable.ic_close))
            .positiveText(context.resources.getString(R.string.qr_popup_restore_identity_positive))
            .dismissListener { dismissListener.invoke() }
            .build()

    fun show(){
        dialog.show()
    }
}