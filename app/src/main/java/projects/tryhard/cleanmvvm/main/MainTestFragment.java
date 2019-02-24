package projects.tryhard.cleanmvvm.main;

import android.arch.lifecycle.ViewModelProviders;

import javax.inject.Inject;

import projects.tryhard.cleanmvvm.ViewModelProviderFactory;
import projects.tryhard.cleanmvvm.ui.base.BaseFragment;

public class MainTestFragment extends BaseFragment<MainViewModel> {
    @Inject
    ViewModelProviderFactory factory;
    private MainViewModel mMainViewModel;

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public MainViewModel getViewModel() {
        mMainViewModel = ViewModelProviders.of(this,factory).get(MainViewModel.class);
        return mMainViewModel;
    }
}
