package com.example.retrofitapp_la181955

import com.google.gson.annotations.SerializedName

class DogsResponse {
    private var images: List<String?>? = null

    fun getImages(): List<String?>? {
        return images
    }

    fun setImages(images: List<String?>?) {
        this.images = images
    }
}