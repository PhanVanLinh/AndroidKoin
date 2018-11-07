package vn.linh.androidkoin.screen.di

import org.koin.dsl.module.module
import vn.linh.androidkoin.data.source.UserRepository

val appModule = module{
    single { UserRepository() }
}