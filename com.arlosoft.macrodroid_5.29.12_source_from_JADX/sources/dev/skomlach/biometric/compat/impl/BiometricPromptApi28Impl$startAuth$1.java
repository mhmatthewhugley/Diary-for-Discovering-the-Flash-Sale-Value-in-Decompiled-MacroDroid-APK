package dev.skomlach.biometric.compat.impl;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.BiometricAuthenticationListener;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u000e"}, mo71668d2 = {"dev/skomlach/biometric/compat/impl/BiometricPromptApi28Impl$startAuth$1", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "module", "Lja/u;", "onSuccess", "", "msg", "onHelp", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "Ldev/skomlach/biometric/compat/BiometricType;", "onFailure", "onCanceled", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptApi28Impl.kt */
public final class BiometricPromptApi28Impl$startAuth$1 implements BiometricAuthenticationListener {
    final /* synthetic */ Set<AuthenticationResult> $successList;

    BiometricPromptApi28Impl$startAuth$1(Set<AuthenticationResult> set) {
        this.$successList = set;
    }

    public void onCanceled(BiometricType biometricType) {
    }

    public void onFailure(AuthenticationFailureReason authenticationFailureReason, BiometricType biometricType) {
    }

    public void onHelp(CharSequence charSequence) {
    }

    public void onSuccess(AuthenticationResult authenticationResult) {
        if (authenticationResult != null) {
            this.$successList.add(authenticationResult);
        }
    }
}
