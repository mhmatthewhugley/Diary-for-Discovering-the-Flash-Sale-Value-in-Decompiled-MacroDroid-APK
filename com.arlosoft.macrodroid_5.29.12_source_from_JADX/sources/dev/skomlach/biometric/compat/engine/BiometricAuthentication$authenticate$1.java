package dev.skomlach.biometric.compat.engine;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.core.interfaces.AuthenticationListener;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, mo71668d2 = {"dev/skomlach/biometric/compat/engine/BiometricAuthentication$authenticate$1", "Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "msg", "Lja/u;", "onHelp", "", "moduleTag", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "onSuccess", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "reason", "onFailure", "onCanceled", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricAuthentication.kt */
public final class BiometricAuthentication$authenticate$1 implements AuthenticationListener {
    final /* synthetic */ HashMap<Integer, BiometricType> $hashMap;
    final /* synthetic */ SoftReference<BiometricAuthenticationListener> $ref;

    BiometricAuthentication$authenticate$1(SoftReference<BiometricAuthenticationListener> softReference, HashMap<Integer, BiometricType> hashMap) {
        this.$ref = softReference;
        this.$hashMap = hashMap;
    }

    public void onCanceled(int i) {
        BiometricAuthenticationListener biometricAuthenticationListener = this.$ref.get();
        if (biometricAuthenticationListener != null) {
            biometricAuthenticationListener.onCanceled(this.$hashMap.get(Integer.valueOf(i)));
        }
    }

    public void onFailure(AuthenticationFailureReason authenticationFailureReason, int i) {
        BiometricAuthenticationListener biometricAuthenticationListener = this.$ref.get();
        if (biometricAuthenticationListener != null) {
            biometricAuthenticationListener.onFailure(authenticationFailureReason, this.$hashMap.get(Integer.valueOf(i)));
        }
    }

    public void onHelp(CharSequence charSequence) {
        BiometricAuthenticationListener biometricAuthenticationListener = this.$ref.get();
        if (biometricAuthenticationListener != null) {
            biometricAuthenticationListener.onHelp(charSequence);
        }
    }

    public void onSuccess(int i, BiometricCryptoObject biometricCryptoObject) {
        BiometricAuthenticationListener biometricAuthenticationListener = this.$ref.get();
        if (biometricAuthenticationListener != null) {
            biometricAuthenticationListener.onSuccess(new AuthenticationResult(this.$hashMap.get(Integer.valueOf(i)), biometricCryptoObject));
        }
    }
}
