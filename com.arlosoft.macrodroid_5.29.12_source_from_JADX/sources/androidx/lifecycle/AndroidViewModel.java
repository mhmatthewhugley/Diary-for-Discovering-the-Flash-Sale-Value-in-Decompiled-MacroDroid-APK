package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.NonNull;

public class AndroidViewModel extends ViewModel {
    private Application mApplication;

    public AndroidViewModel(@NonNull Application application) {
        this.mApplication = application;
    }

    @NonNull
    public <T extends Application> T getApplication() {
        return this.mApplication;
    }
}
