package dagger.android;

import android.content.ContentProvider;
import androidx.annotation.CallSuper;
import p404u8.C16667a;

public abstract class DaggerContentProvider extends ContentProvider {
    @CallSuper
    public boolean onCreate() {
        C16667a.m99106d(this);
        return true;
    }
}
