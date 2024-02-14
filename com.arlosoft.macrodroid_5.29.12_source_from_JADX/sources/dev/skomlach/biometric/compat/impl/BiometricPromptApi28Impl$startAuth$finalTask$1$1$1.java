package dev.skomlach.biometric.compat.impl;

import androidx.biometric.BiometricPrompt;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.utils.DevicesWithKnownBugs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$startAuth$finalTask$1$1$1", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "Lja/u;", "onAuthenticationFailed", "", "errorCode", "", "errString", "onAuthenticationError", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onAuthenticationSucceeded", "", "errorTs", "J", "skipTimeout", "I", "", "onePlusWithBiometricBugFailure", "Z", "getOnePlusWithBiometricBugFailure", "()Z", "setOnePlusWithBiometricBugFailure", "(Z)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl$startAuth$finalTask$1$1$1 extends BiometricPrompt.AuthenticationCallback {
    final /* synthetic */ AtomicBoolean $dialogClosed;
    final /* synthetic */ Set<AuthenticationResult> $successList;
    private long errorTs = System.currentTimeMillis();
    private boolean onePlusWithBiometricBugFailure;
    private final int skipTimeout;
    final /* synthetic */ BiometricPromptApi28Impl this$0;

    BiometricPromptApi28Impl$startAuth$finalTask$1$1$1(BiometricPromptApi28Impl biometricPromptApi28Impl, AtomicBoolean atomicBoolean, Set<AuthenticationResult> set) {
        this.this$0 = biometricPromptApi28Impl;
        this.$dialogClosed = atomicBoolean;
        this.$successList = set;
        this.skipTimeout = biometricPromptApi28Impl.getBuilder().getContext().getResources().getInteger(17694720);
    }

    public final boolean getOnePlusWithBiometricBugFailure() {
        return this.onePlusWithBiometricBugFailure;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        C13706o.m87929f(charSequence, "errString");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (this.onePlusWithBiometricBugFailure) {
                this.onePlusWithBiometricBugFailure = false;
            } else if (!this.$dialogClosed.get()) {
                this.$dialogClosed.set(true);
                this.this$0.stopAuth();
                BiometricPromptCompat.AuthenticationCallback access$getCallback$p = this.this$0.callback;
                if (access$getCallback$p != null) {
                    access$getCallback$p.onSucceeded(this.$successList);
                }
            }
        }
    }

    public void onAuthenticationFailed() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (DevicesWithKnownBugs.INSTANCE.isOnePlusWithBiometricBug()) {
                this.onePlusWithBiometricBugFailure = true;
                if (!this.$dialogClosed.get()) {
                    this.$dialogClosed.set(true);
                    this.this$0.stopAuth();
                    BiometricPromptCompat.AuthenticationCallback access$getCallback$p = this.this$0.callback;
                    if (access$getCallback$p != null) {
                        access$getCallback$p.onSucceeded(this.$successList);
                    }
                }
            }
        }
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C13706o.m87929f(authenticationResult, "result");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.errorTs > ((long) this.skipTimeout)) {
            this.errorTs = currentTimeMillis;
            if (!this.$dialogClosed.get()) {
                this.$dialogClosed.set(true);
                this.this$0.stopAuth();
                BiometricPromptCompat.AuthenticationCallback access$getCallback$p = this.this$0.callback;
                if (access$getCallback$p != null) {
                    access$getCallback$p.onSucceeded(this.$successList);
                }
            }
        }
    }

    public final void setOnePlusWithBiometricBugFailure(boolean z) {
        this.onePlusWithBiometricBugFailure = z;
    }
}
