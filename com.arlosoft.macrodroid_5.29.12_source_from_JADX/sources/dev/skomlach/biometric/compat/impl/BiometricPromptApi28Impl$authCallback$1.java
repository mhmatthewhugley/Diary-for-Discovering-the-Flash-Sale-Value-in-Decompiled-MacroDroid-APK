package dev.skomlach.biometric.compat.impl;

import androidx.biometric.BiometricPrompt;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.impl.AuthResult;
import dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialogImpl;
import dev.skomlach.biometric.compat.utils.BiometricErrorLockoutPermanentFix;
import dev.skomlach.biometric.compat.utils.DevicesWithKnownBugs;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.activityView.IconStateHelper;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.misc.C12114c;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$authCallback$1", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "Lja/u;", "onAuthenticationFailed", "", "errorCode", "", "errString", "onAuthenticationError", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onAuthenticationSucceeded", "", "errorTs", "J", "skipTimeout", "I", "", "onePlusWithBiometricBugFailure", "Z", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl$authCallback$1 extends BiometricPrompt.AuthenticationCallback {
    private long errorTs = System.currentTimeMillis();
    private boolean onePlusWithBiometricBugFailure;
    private final int skipTimeout;
    final /* synthetic */ BiometricPromptApi28Impl this$0;

    BiometricPromptApi28Impl$authCallback$1(BiometricPromptApi28Impl biometricPromptApi28Impl) {
        this.this$0 = biometricPromptApi28Impl;
        this.skipTimeout = biometricPromptApi28Impl.getBuilder().getContext().getResources().getInteger(17694720);
    }

    /* access modifiers changed from: private */
    /* renamed from: onAuthenticationError$lambda-0  reason: not valid java name */
    public static final void m101315onAuthenticationError$lambda0(int i, BiometricPromptApi28Impl biometricPromptApi28Impl) {
        AuthenticationFailureReason authenticationFailureReason;
        C13706o.m87929f(biometricPromptApi28Impl, "this$0");
        AuthenticationFailureReason authenticationFailureReason2 = AuthenticationFailureReason.UNKNOWN;
        boolean z = true;
        if (i == 1) {
            authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
        } else if (i == 2) {
            authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
        } else if (i == 3) {
            authenticationFailureReason = AuthenticationFailureReason.TIMEOUT;
        } else if (i == 4) {
            authenticationFailureReason = AuthenticationFailureReason.SENSOR_FAILED;
        } else if (i == 7) {
            HardwareAccessImpl.Companion.getInstance(biometricPromptApi28Impl.getBuilder().getBiometricAuthRequest()).lockout();
            authenticationFailureReason = AuthenticationFailureReason.LOCKED_OUT;
        } else if (i == 9) {
            for (BiometricType biometricSensorPermanentlyLocked : biometricPromptApi28Impl.getBuilder().getPrimaryAvailableTypes()) {
                BiometricErrorLockoutPermanentFix.INSTANCE.setBiometricSensorPermanentlyLocked(biometricSensorPermanentlyLocked);
            }
            authenticationFailureReason = AuthenticationFailureReason.HARDWARE_UNAVAILABLE;
        } else if (i == 11) {
            authenticationFailureReason = AuthenticationFailureReason.NO_BIOMETRICS_REGISTERED;
        } else if (i != 12) {
            BiometricPromptCompat.AuthenticationCallback access$getCallback$p = biometricPromptApi28Impl.callback;
            if (access$getCallback$p != null) {
                access$getCallback$p.onCanceled();
            }
            biometricPromptApi28Impl.cancelAuthentication();
            return;
        } else {
            authenticationFailureReason = AuthenticationFailureReason.NO_HARDWARE;
        }
        if (!biometricPromptApi28Impl.restartPredicate.invoke(authenticationFailureReason)) {
            biometricPromptApi28Impl.checkAuthResultForPrimary(AuthResult.AuthResultState.FATAL_ERROR, (BiometricPrompt.CryptoObject) null, authenticationFailureReason);
        } else if (biometricPromptApi28Impl.callback != null) {
            for (BiometricType errorType : biometricPromptApi28Impl.isSamsungWorkaroundRequired() ? biometricPromptApi28Impl.getBuilder().getAllAvailableTypes() : biometricPromptApi28Impl.getBuilder().getPrimaryAvailableTypes()) {
                IconStateHelper.INSTANCE.errorType(errorType);
            }
            BiometricPromptCompatDialogImpl access$getDialog$p = biometricPromptApi28Impl.dialog;
            if (access$getDialog$p != null) {
                if (authenticationFailureReason != AuthenticationFailureReason.LOCKED_OUT) {
                    z = false;
                }
                access$getDialog$p.onFailure(z);
            }
            biometricPromptApi28Impl.authenticate(biometricPromptApi28Impl.callback);
        }
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        C13706o.m87929f(charSequence, "errString");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        biometricLoggerImpl.mo68217d("BiometricPromptApi28Impl.onAuthenticationError: " + i + " " + charSequence);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (this.onePlusWithBiometricBugFailure) {
                this.onePlusWithBiometricBugFailure = false;
            } else {
                C12114c.f58379a.mo68305g(new C12066i(i, this.this$0));
            }
        }
    }

    public void onAuthenticationFailed() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptApi28Impl.onAuthenticationFailed");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (DevicesWithKnownBugs.INSTANCE.isOnePlusWithBiometricBug()) {
                this.onePlusWithBiometricBugFailure = true;
                this.this$0.cancelAuthentication();
                return;
            }
            for (BiometricType errorType : this.this$0.isSamsungWorkaroundRequired() ? this.this$0.getBuilder().getAllAvailableTypes() : this.this$0.getBuilder().getPrimaryAvailableTypes()) {
                IconStateHelper.INSTANCE.errorType(errorType);
            }
            BiometricPromptCompatDialogImpl access$getDialog$p = this.this$0.dialog;
            if (access$getDialog$p != null) {
                access$getDialog$p.onFailure(false);
            }
        }
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C13706o.m87929f(authenticationResult, "result");
        BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
        int authenticationType = authenticationResult.getAuthenticationType();
        BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        biometricLoggerImpl.mo68217d("BiometricPromptApi28Impl.onAuthenticationSucceeded: " + authenticationType + "; Crypto=" + cryptoObject);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            this.onePlusWithBiometricBugFailure = false;
            BiometricPromptApi28Impl.checkAuthResultForPrimary$default(this.this$0, AuthResult.AuthResultState.SUCCESS, authenticationResult.getCryptoObject(), (AuthenticationFailureReason) null, 4, (Object) null);
        }
    }
}
