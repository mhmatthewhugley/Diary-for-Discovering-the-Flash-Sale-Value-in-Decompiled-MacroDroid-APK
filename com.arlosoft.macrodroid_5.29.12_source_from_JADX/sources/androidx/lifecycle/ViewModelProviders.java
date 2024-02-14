package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

@Deprecated
public class ViewModelProviders {

    @Deprecated
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(@NonNull Application application) {
            super(application);
        }
    }

    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelProvider m533of(@NonNull Fragment fragment) {
        return new ViewModelProvider(fragment);
    }

    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelProvider m535of(@NonNull FragmentActivity fragmentActivity) {
        return new ViewModelProvider(fragmentActivity);
    }

    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelProvider m534of(@NonNull Fragment fragment, @Nullable ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragment.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    @MainThread
    @NonNull
    @Deprecated
    /* renamed from: of */
    public static ViewModelProvider m536of(@NonNull FragmentActivity fragmentActivity, @Nullable ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }
}
