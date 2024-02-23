package com.example.di.intent


import com.example.home.home.ui.HomeNavigation
import com.example.navigation.navigation.HomeNavigationImpl
import org.koin.dsl.module

val intentHomeModule = module {
    single<HomeNavigation> { HomeNavigationImpl(get()) }
}