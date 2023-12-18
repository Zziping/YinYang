package com.ziping.yinyang.bindingadapter

import android.graphics.drawable.Drawable
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

class YinYangBindingAdapter {
    companion object{
        @JvmStatic
        @BindingAdapter(value = ["setIndeterminateProgressBar"])
        fun setIndeterminateProgressBar(progressBar: ProgressBar, drawable: Drawable){
            progressBar.indeterminateDrawable = drawable
            progressBar.isIndeterminate = true
        }
    }
}