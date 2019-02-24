package projects.tryhard.cleanmvvm.ui.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity<V extends BaseViewModel> extends DaggerAppCompatActivity implements BaseFragment.Callback{
    private V mViewModel;

    @LayoutRes
    public abstract int getLayout();

    public abstract V getViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        this.mViewModel = mViewModel == null ? getViewModel() : mViewModel;

        ButterKnife.bind(this);
    }
}
