package androidx.biometric.auth;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

class AuthPromptUtils {

    private static class AuthPromptWrapper implements AuthPrompt {
        @NonNull
        private final WeakReference<BiometricPrompt> mBiometricPromptRef;

        AuthPromptWrapper(@NonNull BiometricPrompt biometricPrompt) {
            this.mBiometricPromptRef = new WeakReference<>(biometricPrompt);
        }

        public void cancelAuthentication() {
            if (this.mBiometricPromptRef.get() != null) {
                ((BiometricPrompt) this.mBiometricPromptRef.get()).cancelAuthentication();
            }
        }
    }

    private static class AuthenticationCallbackWrapper extends BiometricPrompt.AuthenticationCallback {
        @NonNull
        private final AuthPromptCallback mClientCallback;
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        AuthenticationCallbackWrapper(@NonNull AuthPromptCallback authPromptCallback, @NonNull BiometricViewModel biometricViewModel) {
            this.mClientCallback = authPromptCallback;
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Nullable
        private static FragmentActivity getActivity(@NonNull WeakReference<BiometricViewModel> weakReference) {
            if (weakReference.get() != null) {
                return ((BiometricViewModel) weakReference.get()).getClientActivity();
            }
            return null;
        }

        public void onAuthenticationError(int i, @NonNull CharSequence charSequence) {
            this.mClientCallback.onAuthenticationError(getActivity(this.mViewModelRef), i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.mClientCallback.onAuthenticationFailed(getActivity(this.mViewModelRef));
        }

        public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            this.mClientCallback.onAuthenticationSucceeded(getActivity(this.mViewModelRef), authenticationResult);
        }
    }

    private static class DefaultExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        DefaultExecutor() {
        }

        public void execute(@NonNull Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    private AuthPromptUtils() {
    }

    @NonNull
    private static BiometricPrompt createBiometricPrompt(@NonNull AuthPromptHost authPromptHost, @Nullable Executor executor, @NonNull AuthPromptCallback authPromptCallback) {
        if (executor == null) {
            executor = new DefaultExecutor();
        }
        if (authPromptHost.getActivity() != null) {
            return new BiometricPrompt(authPromptHost.getActivity(), executor, (BiometricPrompt.AuthenticationCallback) wrapCallback(authPromptCallback, new ViewModelProvider(authPromptHost.getActivity())));
        } else if (authPromptHost.getFragment() == null || authPromptHost.getFragment().getActivity() == null) {
            throw new IllegalArgumentException("AuthPromptHost must contain a FragmentActivity or an attached Fragment.");
        } else {
            return new BiometricPrompt(authPromptHost.getFragment(), executor, (BiometricPrompt.AuthenticationCallback) wrapCallback(authPromptCallback, new ViewModelProvider(authPromptHost.getFragment().getActivity())));
        }
    }

    @NonNull
    static AuthPrompt startAuthentication(@NonNull AuthPromptHost authPromptHost, @NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject, @Nullable Executor executor, @NonNull AuthPromptCallback authPromptCallback) {
        BiometricPrompt createBiometricPrompt = createBiometricPrompt(authPromptHost, executor, authPromptCallback);
        if (cryptoObject == null) {
            createBiometricPrompt.authenticate(promptInfo);
        } else {
            createBiometricPrompt.authenticate(promptInfo, cryptoObject);
        }
        return new AuthPromptWrapper(createBiometricPrompt);
    }

    private static AuthenticationCallbackWrapper wrapCallback(@NonNull AuthPromptCallback authPromptCallback, @NonNull ViewModelProvider viewModelProvider) {
        return new AuthenticationCallbackWrapper(authPromptCallback, (BiometricViewModel) viewModelProvider.get(BiometricViewModel.class));
    }
}
