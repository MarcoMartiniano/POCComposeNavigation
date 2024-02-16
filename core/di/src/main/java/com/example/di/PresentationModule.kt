package com.example.di

import com.example.home.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    // Home module
    viewModel { HomeViewModel() }

}