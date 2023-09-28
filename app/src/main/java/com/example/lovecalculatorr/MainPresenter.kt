package com.example.lovecalculatorr

import com.example.lovecalculatorr.remote.LoveModel
import com.example.lovecalculatorr.remote.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter {
    lateinit var view: MainView
    var service = RetrofitService()

    fun attachView(view: MainView) {
        this.view = view
    }

    fun getLove(firstName: String, secondName: String) {
        service.api.countCompatibility(firstName, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                response.body()?.let {
                    view.changeActivity(it)
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                view.showError(t.message.toString())
            }
        })
    }
}