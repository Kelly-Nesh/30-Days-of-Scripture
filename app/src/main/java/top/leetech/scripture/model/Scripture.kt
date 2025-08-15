package top.leetech.scripture.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Scripture(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val verse: Int,
    @StringRes val reference: Int,
    @DrawableRes val image: Int
)