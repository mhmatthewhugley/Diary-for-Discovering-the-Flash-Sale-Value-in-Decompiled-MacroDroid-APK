package androidx.biometric.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class AuthPromptHost {
    @Nullable
    private FragmentActivity mActivity;
    @Nullable
    private Fragment mFragment;

    public AuthPromptHost(@NonNull FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    @Nullable
    public FragmentActivity getActivity() {
        return this.mActivity;
    }

    @Nullable
    public Fragment getFragment() {
        return this.mFragment;
    }

    public AuthPromptHost(@NonNull Fragment fragment) {
        this.mFragment = fragment;
    }
}
