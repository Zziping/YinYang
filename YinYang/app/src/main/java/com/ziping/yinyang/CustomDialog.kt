package com.ziping.yinyang

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.fragment.app.DialogFragment

class CustomDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.layout_custom_dialog)

        val window = dialog.window
        window?.setBackgroundDrawableResource(R.color.white)
        val lp = window?.attributes
        lp?.gravity = Gravity.BOTTOM
        lp?.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        window?.attributes = lp
        val decorView = window?.decorView
        decorView?.fitsSystemWindows = false

        return dialog
    }

}