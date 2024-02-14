package androidx.biometric;

import android.content.Context;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0736a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricPrompt {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_UNKNOWN = -1;
    private static final String BIOMETRIC_FRAGMENT_TAG = "androidx.biometric.BiometricFragment";
    static final int BIOMETRIC_SUCCESS = 0;
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;
    private static final String TAG = "BiometricPromptCompat";
    @Nullable
    private FragmentManager mClientFragmentManager;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, @NonNull CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(@NonNull AuthenticationResult authenticationResult) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationError {
    }

    public static class AuthenticationResult {
        private final int mAuthenticationType;
        private final CryptoObject mCryptoObject;

        AuthenticationResult(CryptoObject cryptoObject, int i) {
            this.mCryptoObject = cryptoObject;
            this.mAuthenticationType = i;
        }

        public int getAuthenticationType() {
            return this.mAuthenticationType;
        }

        @Nullable
        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static class PromptInfo {
        private final int mAllowedAuthenticators;
        @Nullable
        private final CharSequence mDescription;
        private final boolean mIsConfirmationRequired;
        private final boolean mIsDeviceCredentialAllowed;
        @Nullable
        private final CharSequence mNegativeButtonText;
        @Nullable
        private final CharSequence mSubtitle;
        @NonNull
        private final CharSequence mTitle;

        public static class Builder {
            private int mAllowedAuthenticators = 0;
            @Nullable
            private CharSequence mDescription = null;
            private boolean mIsConfirmationRequired = true;
            private boolean mIsDeviceCredentialAllowed = false;
            @Nullable
            private CharSequence mNegativeButtonText = null;
            @Nullable
            private CharSequence mSubtitle = null;
            @Nullable
            private CharSequence mTitle = null;

            @NonNull
            public PromptInfo build() {
                boolean z;
                if (TextUtils.isEmpty(this.mTitle)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                } else if (AuthenticatorUtils.isSupportedCombination(this.mAllowedAuthenticators)) {
                    int i = this.mAllowedAuthenticators;
                    if (i != 0) {
                        z = AuthenticatorUtils.isDeviceCredentialAllowed(i);
                    } else {
                        z = this.mIsDeviceCredentialAllowed;
                    }
                    if (TextUtils.isEmpty(this.mNegativeButtonText) && !z) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    } else if (TextUtils.isEmpty(this.mNegativeButtonText) || !z) {
                        return new PromptInfo(this.mTitle, this.mSubtitle, this.mDescription, this.mNegativeButtonText, this.mIsConfirmationRequired, this.mIsDeviceCredentialAllowed, this.mAllowedAuthenticators);
                    } else {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                } else {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AuthenticatorUtils.convertToString(this.mAllowedAuthenticators));
                }
            }

            @NonNull
            public Builder setAllowedAuthenticators(int i) {
                this.mAllowedAuthenticators = i;
                return this;
            }

            @NonNull
            public Builder setConfirmationRequired(boolean z) {
                this.mIsConfirmationRequired = z;
                return this;
            }

            @NonNull
            public Builder setDescription(@Nullable CharSequence charSequence) {
                this.mDescription = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setDeviceCredentialAllowed(boolean z) {
                this.mIsDeviceCredentialAllowed = z;
                return this;
            }

            @NonNull
            public Builder setNegativeButtonText(@NonNull CharSequence charSequence) {
                this.mNegativeButtonText = charSequence;
                return this;
            }

            @NonNull
            public Builder setSubtitle(@Nullable CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            @NonNull
            public Builder setTitle(@NonNull CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }
        }

        PromptInfo(@NonNull CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.mTitle = charSequence;
            this.mSubtitle = charSequence2;
            this.mDescription = charSequence3;
            this.mNegativeButtonText = charSequence4;
            this.mIsConfirmationRequired = z;
            this.mIsDeviceCredentialAllowed = z2;
            this.mAllowedAuthenticators = i;
        }

        public int getAllowedAuthenticators() {
            return this.mAllowedAuthenticators;
        }

        @Nullable
        public CharSequence getDescription() {
            return this.mDescription;
        }

        @NonNull
        public CharSequence getNegativeButtonText() {
            CharSequence charSequence = this.mNegativeButtonText;
            return charSequence != null ? charSequence : "";
        }

        @Nullable
        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        @NonNull
        public CharSequence getTitle() {
            return this.mTitle;
        }

        public boolean isConfirmationRequired() {
            return this.mIsConfirmationRequired;
        }

        @Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.mIsDeviceCredentialAllowed;
        }
    }

    private static class ResetCallbackObserver implements DefaultLifecycleObserver {
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        ResetCallbackObserver(@NonNull BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C0736a.m539a(this, lifecycleOwner);
        }

        public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
            if (this.mViewModelRef.get() != null) {
                ((BiometricViewModel) this.mViewModelRef.get()).resetClientCallback();
            }
        }

        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C0736a.m541c(this, lifecycleOwner);
        }

        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C0736a.m542d(this, lifecycleOwner);
        }

        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C0736a.m543e(this, lifecycleOwner);
        }

        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C0736a.m544f(this, lifecycleOwner);
        }
    }

    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        } else if (authenticationCallback != null) {
            init(fragmentActivity.getSupportFragmentManager(), getViewModel(fragmentActivity), (Executor) null, authenticationCallback);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    private static void addObservers(@NonNull Fragment fragment, @Nullable BiometricViewModel biometricViewModel) {
        if (biometricViewModel != null) {
            fragment.getLifecycle().addObserver(new ResetCallbackObserver(biometricViewModel));
        }
    }

    private void authenticateInternal(@NonNull PromptInfo promptInfo, @Nullable CryptoObject cryptoObject) {
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
        } else if (fragmentManager.isStateSaved()) {
            Log.e(TAG, "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            findOrAddBiometricFragment(this.mClientFragmentManager).authenticate(promptInfo, cryptoObject);
        }
    }

    @Nullable
    private static BiometricFragment findBiometricFragment(@NonNull FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.findFragmentByTag(BIOMETRIC_FRAGMENT_TAG);
    }

    @NonNull
    private static BiometricFragment findOrAddBiometricFragment(@NonNull FragmentManager fragmentManager) {
        BiometricFragment findBiometricFragment = findBiometricFragment(fragmentManager);
        if (findBiometricFragment != null) {
            return findBiometricFragment;
        }
        BiometricFragment newInstance = BiometricFragment.newInstance();
        fragmentManager.beginTransaction().add((Fragment) newInstance, BIOMETRIC_FRAGMENT_TAG).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return newInstance;
    }

    @Nullable
    static Context getHostActivityOrContext(@NonNull Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        return fragment.getContext();
    }

    @Nullable
    static BiometricViewModel getViewModel(@Nullable Context context) {
        if (context instanceof ViewModelStoreOwner) {
            return (BiometricViewModel) new ViewModelProvider((ViewModelStoreOwner) context).get(BiometricViewModel.class);
        }
        return null;
    }

    private void init(@Nullable FragmentManager fragmentManager, @Nullable BiometricViewModel biometricViewModel, @Nullable Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        this.mClientFragmentManager = fragmentManager;
        if (biometricViewModel != null) {
            if (executor != null) {
                biometricViewModel.setClientExecutor(executor);
            }
            biometricViewModel.setClientCallback(authenticationCallback);
        }
    }

    public void authenticate(@NonNull PromptInfo promptInfo, @NonNull CryptoObject cryptoObject) {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        } else if (cryptoObject != null) {
            int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
            if (AuthenticatorUtils.isWeakBiometricAllowed(consolidatedAuthenticators)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            } else if (Build.VERSION.SDK_INT >= 30 || !AuthenticatorUtils.isDeviceCredentialAllowed(consolidatedAuthenticators)) {
                authenticateInternal(promptInfo, cryptoObject);
            } else {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
        } else {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
    }

    public void cancelAuthentication() {
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager == null) {
            Log.e(TAG, "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        BiometricFragment findBiometricFragment = findBiometricFragment(fragmentManager);
        if (findBiometricFragment == null) {
            Log.e(TAG, "Unable to cancel authentication. BiometricFragment not found.");
        } else {
            findBiometricFragment.cancelAuthentication(3);
        }
    }

    public static class CryptoObject {
        @Nullable
        private final Cipher mCipher;
        @Nullable
        private final IdentityCredential mIdentityCredential;
        @Nullable
        private final Mac mMac;
        @Nullable
        private final Signature mSignature;

        public CryptoObject(@NonNull Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.mCipher;
        }

        @RequiresApi(30)
        @Nullable
        public IdentityCredential getIdentityCredential() {
            return this.mIdentityCredential;
        }

        @Nullable
        public Mac getMac() {
            return this.mMac;
        }

        @Nullable
        public Signature getSignature() {
            return this.mSignature;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.mSignature = null;
            this.mCipher = cipher;
            this.mMac = null;
            this.mIdentityCredential = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = mac;
            this.mIdentityCredential = null;
        }

        @RequiresApi(30)
        public CryptoObject(@NonNull IdentityCredential identityCredential) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = identityCredential;
        }
    }

    public BiometricPrompt(@NonNull Fragment fragment, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        } else if (authenticationCallback != null) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            BiometricViewModel viewModel = getViewModel(getHostActivityOrContext(fragment));
            addObservers(fragment, viewModel);
            init(childFragmentManager, viewModel, (Executor) null, authenticationCallback);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    public void authenticate(@NonNull PromptInfo promptInfo) {
        if (promptInfo != null) {
            authenticateInternal(promptInfo, (CryptoObject) null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    public BiometricPrompt(@NonNull FragmentActivity fragmentActivity, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        } else if (authenticationCallback != null) {
            init(fragmentActivity.getSupportFragmentManager(), getViewModel(fragmentActivity), executor, authenticationCallback);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    public BiometricPrompt(@NonNull Fragment fragment, @NonNull Executor executor, @NonNull AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        } else if (authenticationCallback != null) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            BiometricViewModel viewModel = getViewModel(getHostActivityOrContext(fragment));
            addObservers(fragment, viewModel);
            init(childFragmentManager, viewModel, executor, authenticationCallback);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }
}
