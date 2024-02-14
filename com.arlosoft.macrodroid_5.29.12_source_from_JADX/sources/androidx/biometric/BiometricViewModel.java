package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.biometric.AuthenticationCallbackProvider;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricViewModel extends ViewModel {
    @Nullable
    private AuthenticationCallbackProvider mAuthenticationCallbackProvider;
    @Nullable
    private MutableLiveData<BiometricErrorData> mAuthenticationError;
    @Nullable
    private MutableLiveData<CharSequence> mAuthenticationHelpMessage;
    @Nullable
    private MutableLiveData<BiometricPrompt.AuthenticationResult> mAuthenticationResult;
    private int mCanceledFrom = 0;
    @Nullable
    private CancellationSignalProvider mCancellationSignalProvider;
    @Nullable
    private WeakReference<FragmentActivity> mClientActivity;
    @Nullable
    private BiometricPrompt.AuthenticationCallback mClientCallback;
    @Nullable
    private Executor mClientExecutor;
    @Nullable
    private BiometricPrompt.CryptoObject mCryptoObject;
    @Nullable
    private MutableLiveData<CharSequence> mFingerprintDialogHelpMessage;
    private int mFingerprintDialogPreviousState = 0;
    @Nullable
    private MutableLiveData<Integer> mFingerprintDialogState;
    @Nullable
    private MutableLiveData<Boolean> mIsAuthenticationFailurePending;
    private boolean mIsAwaitingResult;
    private boolean mIsConfirmingDeviceCredential;
    private boolean mIsDelayingPrompt;
    @Nullable
    private MutableLiveData<Boolean> mIsFingerprintDialogCancelPending;
    private boolean mIsFingerprintDialogDismissedInstantly = true;
    private boolean mIsIgnoringCancel;
    @Nullable
    private MutableLiveData<Boolean> mIsNegativeButtonPressPending;
    private boolean mIsPromptShowing;
    private boolean mIsUsingKeyguardManagerForBiometricAndCredential;
    @Nullable
    private DialogInterface.OnClickListener mNegativeButtonListener;
    @Nullable
    private CharSequence mNegativeButtonTextOverride;
    @Nullable
    private BiometricPrompt.PromptInfo mPromptInfo;

    private static final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        CallbackListener(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        /* access modifiers changed from: package-private */
        public void onError(int i, @Nullable CharSequence charSequence) {
            if (this.mViewModelRef.get() != null && !((BiometricViewModel) this.mViewModelRef.get()).isConfirmingDeviceCredential() && ((BiometricViewModel) this.mViewModelRef.get()).isAwaitingResult()) {
                ((BiometricViewModel) this.mViewModelRef.get()).setAuthenticationError(new BiometricErrorData(i, charSequence));
            }
        }

        /* access modifiers changed from: package-private */
        public void onFailure() {
            if (this.mViewModelRef.get() != null && ((BiometricViewModel) this.mViewModelRef.get()).isAwaitingResult()) {
                ((BiometricViewModel) this.mViewModelRef.get()).setAuthenticationFailurePending(true);
            }
        }

        /* access modifiers changed from: package-private */
        public void onHelp(@Nullable CharSequence charSequence) {
            if (this.mViewModelRef.get() != null) {
                ((BiometricViewModel) this.mViewModelRef.get()).setAuthenticationHelpMessage(charSequence);
            }
        }

        /* access modifiers changed from: package-private */
        public void onSuccess(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.mViewModelRef.get() != null && ((BiometricViewModel) this.mViewModelRef.get()).isAwaitingResult()) {
                if (authenticationResult.getAuthenticationType() == -1) {
                    authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), ((BiometricViewModel) this.mViewModelRef.get()).getInferredAuthenticationResultType());
                }
                ((BiometricViewModel) this.mViewModelRef.get()).setAuthenticationResult(authenticationResult);
            }
        }
    }

    private static class DefaultExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        DefaultExecutor() {
        }

        public void execute(Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    private static class NegativeButtonListener implements DialogInterface.OnClickListener {
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        NegativeButtonListener(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.mViewModelRef.get() != null) {
                ((BiometricViewModel) this.mViewModelRef.get()).setNegativeButtonPressPending(true);
            }
        }
    }

    private static <T> void updateValue(MutableLiveData<T> mutableLiveData, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    /* access modifiers changed from: package-private */
    public int getAllowedAuthenticators() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, this.mCryptoObject);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        if (this.mAuthenticationCallbackProvider == null) {
            this.mAuthenticationCallbackProvider = new AuthenticationCallbackProvider(new CallbackListener(this));
        }
        return this.mAuthenticationCallbackProvider;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public MutableLiveData<BiometricErrorData> getAuthenticationError() {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        return this.mAuthenticationError;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<CharSequence> getAuthenticationHelpMessage() {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        return this.mAuthenticationHelpMessage;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        return this.mAuthenticationResult;
    }

    /* access modifiers changed from: package-private */
    public int getCanceledFrom() {
        return this.mCanceledFrom;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public CancellationSignalProvider getCancellationSignalProvider() {
        if (this.mCancellationSignalProvider == null) {
            this.mCancellationSignalProvider = new CancellationSignalProvider();
        }
        return this.mCancellationSignalProvider;
    }

    @Nullable
    public FragmentActivity getClientActivity() {
        WeakReference<FragmentActivity> weakReference = this.mClientActivity;
        if (weakReference != null) {
            return (FragmentActivity) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public BiometricPrompt.AuthenticationCallback getClientCallback() {
        if (this.mClientCallback == null) {
            this.mClientCallback = new BiometricPrompt.AuthenticationCallback() {
            };
        }
        return this.mClientCallback;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public Executor getClientExecutor() {
        Executor executor = this.mClientExecutor;
        return executor != null ? executor : new DefaultExecutor();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public BiometricPrompt.CryptoObject getCryptoObject() {
        return this.mCryptoObject;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<CharSequence> getFingerprintDialogHelpMessage() {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        return this.mFingerprintDialogHelpMessage;
    }

    /* access modifiers changed from: package-private */
    public int getFingerprintDialogPreviousState() {
        return this.mFingerprintDialogPreviousState;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<Integer> getFingerprintDialogState() {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        return this.mFingerprintDialogState;
    }

    /* access modifiers changed from: package-private */
    public int getInferredAuthenticationResultType() {
        int allowedAuthenticators = getAllowedAuthenticators();
        return (!AuthenticatorUtils.isSomeBiometricAllowed(allowedAuthenticators) || AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) ? -1 : 2;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public DialogInterface.OnClickListener getNegativeButtonListener() {
        if (this.mNegativeButtonListener == null) {
            this.mNegativeButtonListener = new NegativeButtonListener(this);
        }
        return this.mNegativeButtonListener;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getNegativeButtonText() {
        CharSequence charSequence = this.mNegativeButtonTextOverride;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getNegativeButtonText();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<Boolean> isAuthenticationFailurePending() {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        return this.mIsAuthenticationFailurePending;
    }

    /* access modifiers changed from: package-private */
    public boolean isAwaitingResult() {
        return this.mIsAwaitingResult;
    }

    /* access modifiers changed from: package-private */
    public boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        return promptInfo == null || promptInfo.isConfirmationRequired();
    }

    /* access modifiers changed from: package-private */
    public boolean isConfirmingDeviceCredential() {
        return this.mIsConfirmingDeviceCredential;
    }

    /* access modifiers changed from: package-private */
    public boolean isDelayingPrompt() {
        return this.mIsDelayingPrompt;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<Boolean> isFingerprintDialogCancelPending() {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        return this.mIsFingerprintDialogCancelPending;
    }

    /* access modifiers changed from: package-private */
    public boolean isFingerprintDialogDismissedInstantly() {
        return this.mIsFingerprintDialogDismissedInstantly;
    }

    /* access modifiers changed from: package-private */
    public boolean isIgnoringCancel() {
        return this.mIsIgnoringCancel;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public LiveData<Boolean> isNegativeButtonPressPending() {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        return this.mIsNegativeButtonPressPending;
    }

    /* access modifiers changed from: package-private */
    public boolean isPromptShowing() {
        return this.mIsPromptShowing;
    }

    /* access modifiers changed from: package-private */
    public boolean isUsingKeyguardManagerForBiometricAndCredential() {
        return this.mIsUsingKeyguardManagerForBiometricAndCredential;
    }

    /* access modifiers changed from: package-private */
    public void resetClientCallback() {
        this.mClientCallback = null;
    }

    /* access modifiers changed from: package-private */
    public void setAuthenticationError(@Nullable BiometricErrorData biometricErrorData) {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationError, biometricErrorData);
    }

    /* access modifiers changed from: package-private */
    public void setAuthenticationFailurePending(boolean z) {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        updateValue(this.mIsAuthenticationFailurePending, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public void setAuthenticationHelpMessage(@Nullable CharSequence charSequence) {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationHelpMessage, charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setAuthenticationResult(@Nullable BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationResult, authenticationResult);
    }

    /* access modifiers changed from: package-private */
    public void setAwaitingResult(boolean z) {
        this.mIsAwaitingResult = z;
    }

    /* access modifiers changed from: package-private */
    public void setCanceledFrom(int i) {
        this.mCanceledFrom = i;
    }

    /* access modifiers changed from: package-private */
    public void setClientActivity(@NonNull FragmentActivity fragmentActivity) {
        this.mClientActivity = new WeakReference<>(fragmentActivity);
    }

    /* access modifiers changed from: package-private */
    public void setClientCallback(@NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.mClientCallback = authenticationCallback;
    }

    /* access modifiers changed from: package-private */
    public void setClientExecutor(@NonNull Executor executor) {
        this.mClientExecutor = executor;
    }

    /* access modifiers changed from: package-private */
    public void setConfirmingDeviceCredential(boolean z) {
        this.mIsConfirmingDeviceCredential = z;
    }

    /* access modifiers changed from: package-private */
    public void setCryptoObject(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        this.mCryptoObject = cryptoObject;
    }

    /* access modifiers changed from: package-private */
    public void setDelayingPrompt(boolean z) {
        this.mIsDelayingPrompt = z;
    }

    /* access modifiers changed from: package-private */
    public void setFingerprintDialogCancelPending(boolean z) {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        updateValue(this.mIsFingerprintDialogCancelPending, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public void setFingerprintDialogDismissedInstantly(boolean z) {
        this.mIsFingerprintDialogDismissedInstantly = z;
    }

    /* access modifiers changed from: package-private */
    public void setFingerprintDialogHelpMessage(@NonNull CharSequence charSequence) {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogHelpMessage, charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setFingerprintDialogPreviousState(int i) {
        this.mFingerprintDialogPreviousState = i;
    }

    /* access modifiers changed from: package-private */
    public void setFingerprintDialogState(int i) {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogState, Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public void setIgnoringCancel(boolean z) {
        this.mIsIgnoringCancel = z;
    }

    /* access modifiers changed from: package-private */
    public void setNegativeButtonPressPending(boolean z) {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        updateValue(this.mIsNegativeButtonPressPending, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    public void setNegativeButtonTextOverride(@Nullable CharSequence charSequence) {
        this.mNegativeButtonTextOverride = charSequence;
    }

    /* access modifiers changed from: package-private */
    public void setPromptInfo(@Nullable BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    /* access modifiers changed from: package-private */
    public void setPromptShowing(boolean z) {
        this.mIsPromptShowing = z;
    }

    /* access modifiers changed from: package-private */
    public void setUsingKeyguardManagerForBiometricAndCredential(boolean z) {
        this.mIsUsingKeyguardManagerForBiometricAndCredential = z;
    }
}