package com.example.lovecalculatorr

import com.example.lovecalculatorr.remote.LoveModel

interface MainView {
    fun changeActivity(loveModel: LoveModel)
    fun showError(error: String)
}