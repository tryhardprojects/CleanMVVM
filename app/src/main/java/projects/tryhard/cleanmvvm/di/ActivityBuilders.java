package projects.tryhard.cleanmvvm.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import projects.tryhard.cleanmvvm.main.MainActivity;
import projects.tryhard.cleanmvvm.main.MainFragmentProvider;

@Module
abstract class ActivityBuilders {
    @ContributesAndroidInjector(modules = {
            MainFragmentProvider.class
    })
    abstract MainActivity bindMainActivity();

}
