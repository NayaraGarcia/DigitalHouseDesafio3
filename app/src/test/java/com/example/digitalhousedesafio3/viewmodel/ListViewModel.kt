package com.example.digitalhousedesafio3.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.digitalhouse.desafiowebservice.service.MarvelService
import com.example.digitalhousedesafio3.domain.Marvel
import kotlinx.coroutines.launch
import java.lang.Exception
import java.security.MessageDigest

class ListViewModel (val marvelService: MarvelService) : ViewModel() {

    val listComics = MutableLiveData<ArrayList<Marvel>>()

    fun getComics() {
        viewModelScope.launch {
            try {
                val ts = System.currentTimeMillis()
                listComics.value = marvelService.getComicsFromCharacter(
                    ts = ts,
                    hash = getHash(ts)
                ).data.results
            } catch (e: Exception) {
                Log.e("ComicListViewModel", e.toString())
            }
        }
    }

    fun md5(str: String): ByteArray = MessageDigest.getInstance("MD5").digest(str.toByteArray(
        Charsets.UTF_8
    ))
    fun ByteArray.toHex() = joinToString("") { "%02x".format(it) }

    fun getHash(ts: Long) : String {
        return md5("${ts}${BuildConfig.MARVEL_API_PRIVATEKEY}${BuildConfig.MARVEL_API_PUBLICKEY}").toHex()
    }


}