package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BiometricFragment extends Fragment {
    static final int CANCELED_FROM_CLIENT = 3;
    static final int CANCELED_FROM_INTERNAL = 0;
    static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    static final int CANCELED_FROM_USER = 1;
    private static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    private static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    private static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private static final String TAG = "BiometricFragment";
    private Injector mInjector = new DefaultInjector();
    @Nullable
    private BiometricViewModel mViewModel;

    @RequiresApi(21)
    private static class Api21Impl {
        private Api21Impl() {
        }

        @Nullable
        static Intent createConfirmDeviceCredentialIntent(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    @RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
        }

        static void authenticate(@NonNull BiometricPrompt biometricPrompt, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        @NonNull
        static BiometricPrompt buildPrompt(@NonNull BiometricPrompt.Builder builder) {
            return builder.build();
        }

        @NonNull
        static BiometricPrompt.Builder createPromptBuilder(@NonNull Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void setDescription(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void setNegativeButton(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence, @NonNull Executor executor, @NonNull DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void setSubtitle(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void setTitle(@NonNull BiometricPrompt.Builder builder, @NonNull CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void authenticate(@NonNull BiometricPrompt biometricPrompt, @NonNull BiometricPrompt.CryptoObject cryptoObject, @NonNull CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }
    }

    @RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
        }

        static void setConfirmationRequired(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        static void setDeviceCredentialAllowed(@NonNull BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    @RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
        }

        static void setAllowedAuthenticators(@NonNull BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    static class DefaultInjector implements Injector {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        DefaultInjector() {
        }

        @NonNull
        public Handler getHandler() {
            return this.mHandler;
        }

        @Nullable
        public BiometricViewModel getViewModel(@Nullable Context context) {
            return BiometricPrompt.getViewModel(context);
        }

        public boolean isFaceHardwarePresent(@Nullable Context context) {
            return PackageUtils.hasSystemFeatureFace(context);
        }

        public boolean isFingerprintHardwarePresent(@Nullable Context context) {
            return PackageUtils.hasSystemFeatureFingerprint(context);
        }

        public boolean isIrisHardwarePresent(@Nullable Context context) {
            return PackageUtils.hasSystemFeatureIris(context);
        }
    }

    @VisibleForTesting
    interface Injector {
        @NonNull
        Handler getHandler();

        @Nullable
        BiometricViewModel getViewModel(@Nullable Context context);

        boolean isFaceHardwarePresent(@Nullable Context context);

        boolean isFingerprintHardwarePresent(@Nullable Context context);

        boolean isIrisHardwarePresent(@Nullable Context context);
    }

    private static class PromptExecutor implements Executor {
        private final Handler mPromptHandler = new Handler(Looper.getMainLooper());

        PromptExecutor() {
        }

        public void execute(@NonNull Runnable runnable) {
            this.mPromptHandler.post(runnable);
        }
    }

    private static class ShowPromptForAuthenticationRunnable implements Runnable {
        @NonNull
        private final WeakReference<BiometricFragment> mFragmentRef;

        ShowPromptForAuthenticationRunnable(@Nullable BiometricFragment biometricFragment) {
            this.mFragmentRef = new WeakReference<>(biometricFragment);
        }

        public void run() {
            if (this.mFragmentRef.get() != null) {
                ((BiometricFragment) this.mFragmentRef.get()).showPromptForAuthentication();
            }
        }
    }

    private static class StopDelayingPromptRunnable implements Runnable {
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopDelayingPromptRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        public void run() {
            if (this.mViewModelRef.get() != null) {
                ((BiometricViewModel) this.mViewModelRef.get()).setDelayingPrompt(false);
            }
        }
    }

    private static class StopIgnoringCancelRunnable implements Runnable {
        @NonNull
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopIgnoringCancelRunnable(@Nullable BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        public void run() {
            if (this.mViewModelRef.get() != null) {
                ((BiometricViewModel) this.mViewModelRef.get()).setIgnoringCancel(false);
            }
        }
    }

    private static int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (!fingerprintManagerCompat.isHardwareDetected()) {
            return 12;
        }
        return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
    }

    private void connectViewModel() {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setClientActivity(getActivity());
            viewModel.getAuthenticationResult().observe(this, new C0272b(this, viewModel));
            viewModel.getAuthenticationError().observe(this, new C0270a(this, viewModel));
            viewModel.getAuthenticationHelpMessage().observe(this, new C0276f(this, viewModel));
            viewModel.isAuthenticationFailurePending().observe(this, new C0274d(this, viewModel));
            viewModel.isNegativeButtonPressPending().observe(this, new C0275e(this, viewModel));
            viewModel.isFingerprintDialogCancelPending().observe(this, new C0273c(this, viewModel));
        }
    }

    private void dismissFingerprintDialog() {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setPromptShowing(false);
        }
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment == null) {
                return;
            }
            if (fingerprintDialogFragment.isAdded()) {
                fingerprintDialogFragment.dismissAllowingStateLoss();
            } else {
                parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
            }
        }
    }

    private int getDismissDialogDelay() {
        Context context = getContext();
        return (context == null || !DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) ? 2000 : 0;
    }

    @Nullable
    private BiometricViewModel getViewModel() {
        if (this.mViewModel == null) {
            this.mViewModel = this.mInjector.getViewModel(BiometricPrompt.getHostActivityOrContext(this));
        }
        return this.mViewModel;
    }

    private void handleConfirmCredentialResult(int i) {
        int i2 = -1;
        if (i == -1) {
            BiometricViewModel viewModel = getViewModel();
            if (viewModel == null || !viewModel.isUsingKeyguardManagerForBiometricAndCredential()) {
                i2 = 1;
            } else {
                viewModel.setUsingKeyguardManagerForBiometricAndCredential(false);
            }
            sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult((BiometricPrompt.CryptoObject) null, i2));
            return;
        }
        lambda$onAuthenticationError$7(10, getString(C0265R.string.generic_error_user_canceled));
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private boolean isFingerprintDialogNeededForCrypto() {
        Context hostActivityOrContext = BiometricPrompt.getHostActivityOrContext(this);
        BiometricViewModel viewModel = getViewModel();
        return (hostActivityOrContext == null || viewModel == null || viewModel.getCryptoObject() == null || !DeviceUtils.shouldUseFingerprintForCrypto(hostActivityOrContext, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean isFingerprintDialogNeededForErrorHandling() {
        return Build.VERSION.SDK_INT == 28 && !this.mInjector.isFingerprintHardwarePresent(getContext());
    }

    private boolean isKeyguardManagerNeededForBiometricAndCredential() {
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldUseKeyguardManagerForBiometricAndCredential(context, Build.MANUFACTURER)) {
            return false;
        }
        BiometricViewModel viewModel = getViewModel();
        int allowedAuthenticators = viewModel != null ? viewModel.getAllowedAuthenticators() : 0;
        if (viewModel == null || !AuthenticatorUtils.isWeakBiometricAllowed(allowedAuthenticators) || !AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) {
            return false;
        }
        viewModel.setUsingKeyguardManagerForBiometricAndCredential(true);
        return true;
    }

    private boolean isKeyguardManagerNeededForCredential() {
        Context context = getContext();
        if (Build.VERSION.SDK_INT == 29 && !this.mInjector.isFingerprintHardwarePresent(context) && !this.mInjector.isFaceHardwarePresent(context) && !this.mInjector.isIrisHardwarePresent(context)) {
            return true;
        }
        if (!isManagingDeviceCredentialButton() || BiometricManager.from(context).canAuthenticate(255) == 0) {
            return false;
        }
        return true;
    }

    private boolean isUsingFingerprintDialog() {
        return Build.VERSION.SDK_INT < 28 || isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$0(BiometricViewModel biometricViewModel, BiometricPrompt.AuthenticationResult authenticationResult) {
        if (authenticationResult != null) {
            onAuthenticationSucceeded(authenticationResult);
            biometricViewModel.setAuthenticationResult((BiometricPrompt.AuthenticationResult) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$1(BiometricViewModel biometricViewModel, BiometricErrorData biometricErrorData) {
        if (biometricErrorData != null) {
            onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
            biometricViewModel.setAuthenticationError((BiometricErrorData) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$2(BiometricViewModel biometricViewModel, CharSequence charSequence) {
        if (charSequence != null) {
            onAuthenticationHelp(charSequence);
            biometricViewModel.setAuthenticationError((BiometricErrorData) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$3(BiometricViewModel biometricViewModel, Boolean bool) {
        if (bool.booleanValue()) {
            onAuthenticationFailed();
            biometricViewModel.setAuthenticationFailurePending(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$4(BiometricViewModel biometricViewModel, Boolean bool) {
        if (bool.booleanValue()) {
            if (isManagingDeviceCredentialButton()) {
                onDeviceCredentialButtonPressed();
            } else {
                onCancelButtonPressed();
            }
            biometricViewModel.setNegativeButtonPressPending(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$connectViewModel$5(BiometricViewModel biometricViewModel, Boolean bool) {
        if (bool.booleanValue()) {
            cancelAuthentication(1);
            dismiss();
            biometricViewModel.setFingerprintDialogCancelPending(false);
        }
    }

    @RequiresApi(21)
    private void launchConfirmCredentialActivity() {
        Context hostActivityOrContext = BiometricPrompt.getHostActivityOrContext(this);
        if (hostActivityOrContext == null) {
            Log.e(TAG, "Failed to check device credential. Client context not found.");
            return;
        }
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Failed to check device credential. View model was null.");
            return;
        }
        KeyguardManager keyguardManager = KeyguardUtils.getKeyguardManager(hostActivityOrContext);
        if (keyguardManager == null) {
            lambda$onAuthenticationError$7(12, getString(C0265R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence title = viewModel.getTitle();
        CharSequence subtitle = viewModel.getSubtitle();
        CharSequence description = viewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent createConfirmDeviceCredentialIntent = Api21Impl.createConfirmDeviceCredentialIntent(keyguardManager, title, subtitle);
        if (createConfirmDeviceCredentialIntent == null) {
            lambda$onAuthenticationError$7(14, getString(C0265R.string.generic_error_no_device_credential));
            return;
        }
        viewModel.setConfirmingDeviceCredential(true);
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(createConfirmDeviceCredentialIntent, 1);
    }

    static BiometricFragment newInstance() {
        return new BiometricFragment();
    }

    private void sendErrorToClient(final int i, @NonNull final CharSequence charSequence) {
        final BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Unable to send error to client. View model was null.");
        } else if (!viewModel.isConfirmingDeviceCredential()) {
            if (!viewModel.isAwaitingResult()) {
                Log.w(TAG, "Error not sent to client. Client is not awaiting a result.");
                return;
            }
            viewModel.setAwaitingResult(false);
            viewModel.getClientExecutor().execute(new Runnable() {
                public void run() {
                    viewModel.getClientCallback().onAuthenticationError(i, charSequence);
                }
            });
        }
    }

    private void sendFailureToClient() {
        final BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Unable to send failure to client. View model was null.");
        } else if (!viewModel.isAwaitingResult()) {
            Log.w(TAG, "Failure not sent to client. Client is not awaiting a result.");
        } else {
            viewModel.getClientExecutor().execute(new Runnable() {
                public void run() {
                    viewModel.getClientCallback().onAuthenticationFailed();
                }
            });
        }
    }

    private void sendSuccessAndDismiss(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessToClient(authenticationResult);
        dismiss();
    }

    private void sendSuccessToClient(@NonNull final BiometricPrompt.AuthenticationResult authenticationResult) {
        final BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Unable to send success to client. View model was null.");
        } else if (!viewModel.isAwaitingResult()) {
            Log.w(TAG, "Success not sent to client. Client is not awaiting a result.");
        } else {
            viewModel.setAwaitingResult(false);
            viewModel.getClientExecutor().execute(new Runnable() {
                public void run() {
                    viewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
                }
            });
        }
    }

    @RequiresApi(28)
    private void showBiometricPromptForAuthentication() {
        BiometricPrompt.Builder createPromptBuilder = Api28Impl.createPromptBuilder(requireContext().getApplicationContext());
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Not showing biometric prompt. View model was null.");
            return;
        }
        CharSequence title = viewModel.getTitle();
        CharSequence subtitle = viewModel.getSubtitle();
        CharSequence description = viewModel.getDescription();
        if (title != null) {
            Api28Impl.setTitle(createPromptBuilder, title);
        }
        if (subtitle != null) {
            Api28Impl.setSubtitle(createPromptBuilder, subtitle);
        }
        if (description != null) {
            Api28Impl.setDescription(createPromptBuilder, description);
        }
        CharSequence negativeButtonText = viewModel.getNegativeButtonText();
        if (!TextUtils.isEmpty(negativeButtonText)) {
            Api28Impl.setNegativeButton(createPromptBuilder, negativeButtonText, viewModel.getClientExecutor(), viewModel.getNegativeButtonListener());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Api29Impl.setConfirmationRequired(createPromptBuilder, viewModel.isConfirmationRequired());
        }
        int allowedAuthenticators = viewModel.getAllowedAuthenticators();
        if (i >= 30) {
            Api30Impl.setAllowedAuthenticators(createPromptBuilder, allowedAuthenticators);
        } else if (i >= 29) {
            Api29Impl.setDeviceCredentialAllowed(createPromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
        }
        authenticateWithBiometricPrompt(Api28Impl.buildPrompt(createPromptBuilder), getContext());
    }

    private void showFingerprintDialogForAuthentication() {
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat from = FingerprintManagerCompat.from(applicationContext);
        int checkForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(from);
        if (checkForFingerprintPreAuthenticationErrors != 0) {
            lambda$onAuthenticationError$7(checkForFingerprintPreAuthenticationErrors, ErrorUtils.getFingerprintErrorString(applicationContext, checkForFingerprintPreAuthenticationErrors));
            return;
        }
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null && isAdded()) {
            viewModel.setFingerprintDialogDismissedInstantly(true);
            if (!DeviceUtils.shouldHideFingerprintDialog(applicationContext, Build.MODEL)) {
                this.mInjector.getHandler().postDelayed(new C0278h(viewModel), 500);
                FingerprintDialogFragment.newInstance().show(getParentFragmentManager(), FINGERPRINT_DIALOG_FRAGMENT_TAG);
            }
            viewModel.setCanceledFrom(0);
            authenticateWithFingerprint(from, applicationContext);
        }
    }

    private void showFingerprintErrorMessage(@Nullable CharSequence charSequence) {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null) {
            if (charSequence == null) {
                charSequence = getString(C0265R.string.default_error_msg);
            }
            viewModel.setFingerprintDialogState(2);
            viewModel.setFingerprintDialogHelpMessage(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void authenticate(@NonNull BiometricPrompt.PromptInfo promptInfo, @Nullable BiometricPrompt.CryptoObject cryptoObject) {
        if (BiometricPrompt.getHostActivityOrContext(this) == null) {
            Log.e(TAG, "Not launching prompt. Client context was null.");
            return;
        }
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Not launching prompt. View model was null.");
            return;
        }
        viewModel.setPromptInfo(promptInfo);
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 30 || consolidatedAuthenticators != 15 || cryptoObject != null) {
            viewModel.setCryptoObject(cryptoObject);
        } else {
            viewModel.setCryptoObject(CryptoObjectUtils.createFakeCryptoObject());
        }
        if (isManagingDeviceCredentialButton()) {
            viewModel.setNegativeButtonTextOverride(getString(C0265R.string.confirm_device_credential_password));
        } else {
            viewModel.setNegativeButtonTextOverride((CharSequence) null);
        }
        if (isKeyguardManagerNeededForCredential()) {
            viewModel.setAwaitingResult(true);
            launchConfirmCredentialActivity();
        } else if (viewModel.isDelayingPrompt()) {
            this.mInjector.getHandler().postDelayed(new ShowPromptForAuthenticationRunnable(this), 600);
        } else {
            showPromptForAuthentication();
        }
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(28)
    @VisibleForTesting
    public void authenticateWithBiometricPrompt(@NonNull android.hardware.biometrics.BiometricPrompt biometricPrompt, @Nullable Context context) {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Not authenticating with biometric prompt. View model was null.");
            return;
        }
        BiometricPrompt.CryptoObject wrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(viewModel.getCryptoObject());
        CancellationSignal biometricCancellationSignal = viewModel.getCancellationSignalProvider().getBiometricCancellationSignal();
        PromptExecutor promptExecutor = new PromptExecutor();
        BiometricPrompt.AuthenticationCallback biometricCallback = viewModel.getAuthenticationCallbackProvider().getBiometricCallback();
        if (wrapForBiometricPrompt == null) {
            try {
                Api28Impl.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } catch (NullPointerException e) {
                Log.e(TAG, "Got NPE while authenticating with biometric prompt.", e);
                lambda$onAuthenticationError$7(1, context != null ? context.getString(C0265R.string.default_error_msg) : "");
            }
        } else {
            Api28Impl.authenticate(biometricPrompt, wrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void authenticateWithFingerprint(@NonNull FingerprintManagerCompat fingerprintManagerCompat, @NonNull Context context) {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Not showing fingerprint dialog. View model was null.");
            return;
        }
        try {
            fingerprintManagerCompat.authenticate(CryptoObjectUtils.wrapForFingerprintManager(viewModel.getCryptoObject()), 0, viewModel.getCancellationSignalProvider().getFingerprintCancellationSignal(), viewModel.getAuthenticationCallbackProvider().getFingerprintCallback(), (Handler) null);
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e);
            lambda$onAuthenticationError$7(1, ErrorUtils.getFingerprintErrorString(context, 1));
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelAuthentication(int i) {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Unable to cancel authentication. View model was null.");
        } else if (i == 3 || !viewModel.isIgnoringCancel()) {
            if (isUsingFingerprintDialog()) {
                viewModel.setCanceledFrom(i);
                if (i == 1) {
                    sendErrorToClient(10, ErrorUtils.getFingerprintErrorString(getContext(), 10));
                }
            }
            viewModel.getCancellationSignalProvider().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void dismiss() {
        dismissFingerprintDialog();
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.setPromptShowing(false);
        }
        if (viewModel == null || (!viewModel.isConfirmingDeviceCredential() && isAdded())) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context != null && DeviceUtils.shouldDelayShowingPrompt(context, Build.MODEL)) {
            if (viewModel != null) {
                viewModel.setDelayingPrompt(true);
            }
            this.mInjector.getHandler().postDelayed(new StopDelayingPromptRunnable(this.mViewModel), 600);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isManagingDeviceCredentialButton() {
        BiometricViewModel viewModel = getViewModel();
        return Build.VERSION.SDK_INT <= 28 && viewModel != null && AuthenticatorUtils.isDeviceCredentialAllowed(viewModel.getAllowedAuthenticators());
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            BiometricViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.setConfirmingDeviceCredential(false);
            }
            handleConfirmCredentialResult(i2);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void onAuthenticationError(int i, @Nullable CharSequence charSequence) {
        if (!ErrorUtils.isKnownError(i)) {
            i = 8;
        }
        BiometricViewModel viewModel = getViewModel();
        if (viewModel == null) {
            Log.e(TAG, "Unable to handle authentication error. View model was null.");
            return;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.isLockoutError(i) && context != null && KeyguardUtils.isDeviceSecuredWithCredential(context) && AuthenticatorUtils.isDeviceCredentialAllowed(viewModel.getAllowedAuthenticators())) {
            launchConfirmCredentialActivity();
        } else if (isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = ErrorUtils.getFingerprintErrorString(getContext(), i);
            }
            if (i == 5) {
                int canceledFrom = viewModel.getCanceledFrom();
                if (canceledFrom == 0 || canceledFrom == 3) {
                    sendErrorToClient(i, charSequence);
                }
                dismiss();
                return;
            }
            if (viewModel.isFingerprintDialogDismissedInstantly()) {
                lambda$onAuthenticationError$7(i, charSequence);
            } else {
                showFingerprintErrorMessage(charSequence);
                this.mInjector.getHandler().postDelayed(new C0277g(this, i, charSequence), (long) getDismissDialogDelay());
            }
            viewModel.setFingerprintDialogDismissedInstantly(true);
        } else {
            if (charSequence == null) {
                charSequence = getString(C0265R.string.default_error_msg) + " " + i;
            }
            lambda$onAuthenticationError$7(i, charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(C0265R.string.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    /* access modifiers changed from: package-private */
    public void onAuthenticationHelp(@NonNull CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessAndDismiss(authenticationResult);
    }

    /* access modifiers changed from: package-private */
    public void onCancelButtonPressed() {
        BiometricViewModel viewModel = getViewModel();
        CharSequence negativeButtonText = viewModel != null ? viewModel.getNegativeButtonText() : null;
        if (negativeButtonText == null) {
            negativeButtonText = getString(C0265R.string.default_error_msg);
        }
        lambda$onAuthenticationError$7(13, negativeButtonText);
        cancelAuthentication(2);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
    }

    /* access modifiers changed from: package-private */
    public void onDeviceCredentialButtonPressed() {
        launchConfirmCredentialActivity();
    }

    public void onStart() {
        super.onStart();
        BiometricViewModel viewModel = getViewModel();
        if (Build.VERSION.SDK_INT == 29 && viewModel != null && AuthenticatorUtils.isDeviceCredentialAllowed(viewModel.getAllowedAuthenticators())) {
            viewModel.setIgnoringCancel(true);
            this.mInjector.getHandler().postDelayed(new StopIgnoringCancelRunnable(viewModel), 250);
        }
    }

    public void onStop() {
        super.onStop();
        BiometricViewModel viewModel = getViewModel();
        if (Build.VERSION.SDK_INT < 29 && viewModel != null && !viewModel.isConfirmingDeviceCredential() && !isChangingConfigurations()) {
            cancelAuthentication(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: sendErrorAndDismiss */
    public void lambda$onAuthenticationError$7(int i, @NonNull CharSequence charSequence) {
        sendErrorToClient(i, charSequence);
        dismiss();
    }

    /* access modifiers changed from: package-private */
    public void showPromptForAuthentication() {
        BiometricViewModel viewModel = getViewModel();
        if (viewModel != null && !viewModel.isPromptShowing()) {
            if (getContext() == null) {
                Log.w(TAG, "Not showing biometric prompt. Context is null.");
                return;
            }
            viewModel.setPromptShowing(true);
            viewModel.setAwaitingResult(true);
            if (isKeyguardManagerNeededForBiometricAndCredential()) {
                launchConfirmCredentialActivity();
            } else if (isUsingFingerprintDialog()) {
                showFingerprintDialogForAuthentication();
            } else {
                showBiometricPromptForAuthentication();
            }
        }
    }

    @VisibleForTesting
    static BiometricFragment newInstance(@NonNull Injector injector) {
        BiometricFragment biometricFragment = new BiometricFragment();
        biometricFragment.mInjector = injector;
        return biometricFragment;
    }
}
