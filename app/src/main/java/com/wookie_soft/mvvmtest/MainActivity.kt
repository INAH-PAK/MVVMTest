package com.wookie_soft.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import androidx.lifecycle.get
import com.wookie_soft.mvvmtest.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.combine

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var viewModel:ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        // liveData를 binding에서 사용하기 위해
        // 뷰 모델 객체에 실제 lifecycleowner를 현재 activity로 지정해줘야 함
        binding.lifecycleOwner = this
        // 뷰 모델을 바인딩 변수로 사용함
        binding.viewModel = viewModel

    }
}
