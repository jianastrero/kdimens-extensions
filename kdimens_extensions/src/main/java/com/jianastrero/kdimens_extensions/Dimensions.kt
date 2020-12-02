package com.jianastrero.kdimens_extensions

import android.content.res.Resources

val Number.dp: Float
    get() = toFloat() * Resources.getSystem().displayMetrics.density

val Number.pxOfDP: Float
    get() = toFloat() / Resources.getSystem().displayMetrics.density

val Number.sp: Number
    get() = toFloat() * Resources.getSystem().displayMetrics.scaledDensity

val Number.pxOfSP: Number
    get() = toFloat() / Resources.getSystem().displayMetrics.scaledDensity