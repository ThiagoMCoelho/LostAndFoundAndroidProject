package com.fullfire.lostandfound.di.mudules;

import com.fullfire.lostandfound.ui.dashboard.DashboardFragment;
import com.fullfire.lostandfound.ui.home.HomeFragment;
import com.fullfire.lostandfound.ui.notifications.NotificationsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract DashboardFragment contributesDashBoardFragment();

    @ContributesAndroidInjector
    abstract HomeFragment contributesHomeFragment();

    @ContributesAndroidInjector
    abstract NotificationsFragment contributesNotificationFragment();


}
