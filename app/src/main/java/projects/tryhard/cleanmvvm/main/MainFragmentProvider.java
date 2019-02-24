package projects.tryhard.cleanmvvm.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentProvider {
    @ContributesAndroidInjector
    abstract MainTestFragment provideAboutFragmentFactory();
}
