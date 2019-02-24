package projects.tryhard.cleanmvvm.ui.base;

import android.arch.lifecycle.ViewModel;

import projects.tryhard.cleanmvvm.data.DataManager;

public class BaseViewModel extends ViewModel {
    private DataManager mDataManager;

    public BaseViewModel(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }
}
