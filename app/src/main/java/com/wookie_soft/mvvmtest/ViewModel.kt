package com.wookie_soft.mvvmtest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel () :ViewModel() {

    // MutableLiveData를 은닉하기
        private var count = MutableLiveData<Int>()

    // 다른 클래스가 접근할 수 있는 데이터
    val countData : LiveData<Int>
        get() = count

        val inputText = MutableLiveData<String>()

        // 초기 값 설정하기
        init {
            count.value = 2
            inputText.value = "45"
        }

        // 덧셈 결과 값 수정하기
        // 덧셈 결과 값 수정하기

        fun getUpdatedCount(){
            val plusCount:Int =  inputText.value!!.toInt()
            count.value = (count.value)?.plus(plusCount)
        }
    }
