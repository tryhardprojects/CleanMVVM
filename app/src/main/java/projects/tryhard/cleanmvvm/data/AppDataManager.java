package projects.tryhard.cleanmvvm.data;

import android.content.Context;

import javax.inject.Inject;

public class AppDataManager implements DataManager{
    private final Context mContext;

    @Inject
    public AppDataManager(Context mContext) {
        this.mContext = mContext;
    }
}
