package com.fullfire.lostandfound.di;

import android.app.Application;

import com.fullfire.lostandfound.di.mudules.AppModule;
import com.fullfire.lostandfound.di.mudules.FragmentBuildersModule;
import com.fullfire.lostandfound.di.mudules.MainActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AppModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,
        FragmentBuildersModule.class
})
public interface ApplicationComponent {

    void inject(MainApplicationController mainApplicationController);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }
}
