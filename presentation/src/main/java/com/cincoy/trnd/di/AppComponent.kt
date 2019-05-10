package com.cincoy.trnd.di

import android.app.Application
import com.cincoy.trnd.TrndApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by mertkanuzunparmak on 2019-05-10.
 * mertkanu@gmail.com
 */
@Singleton
@Component(modules = [(AndroidInjectionModule::class), (ApplicationModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: TrndApplication)
}