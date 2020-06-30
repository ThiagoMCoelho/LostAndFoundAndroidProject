package com.fullfire.lostandfound.di;

import androidx.lifecycle.ViewModel;

import com.fullfire.lostandfound.ui.dashboard.DashboardViewModel;
import com.fullfire.lostandfound.ui.home.HomeViewModel;
import com.fullfire.lostandfound.ui.notifications.NotificationsViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel.class)
    abstract ViewModel temaViewModel(DashboardViewModel dashboardViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel questaoTemaViewModel(HomeViewModel homeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel.class)
    abstract ViewModel userViewModel(NotificationsViewModel notificationsViewModel);
}
