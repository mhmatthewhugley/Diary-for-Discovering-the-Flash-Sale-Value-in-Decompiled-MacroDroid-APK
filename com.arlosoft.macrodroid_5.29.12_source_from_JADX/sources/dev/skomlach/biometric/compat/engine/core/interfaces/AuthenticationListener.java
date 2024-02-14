package dev.skomlach.biometric.compat.engine.core.interfaces;

import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/core/interfaces/AuthenticationListener;", "", "", "msg", "Lja/u;", "onHelp", "", "moduleTag", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "biometricCryptoObject", "onSuccess", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "onFailure", "onCanceled", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: AuthenticationListener.kt */
public interface AuthenticationListener {
    void onCanceled(int i);

    void onFailure(AuthenticationFailureReason authenticationFailureReason, int i);

    void onHelp(CharSequence charSequence);

    void onSuccess(int i, BiometricCryptoObject biometricCryptoObject);
}
