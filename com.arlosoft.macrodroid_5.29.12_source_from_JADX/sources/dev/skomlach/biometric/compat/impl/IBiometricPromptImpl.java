package dev.skomlach.biometric.compat.impl;

import dev.skomlach.biometric.compat.BiometricPromptCompat;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;", "", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "callback", "Lja/u;", "authenticate", "cancelAuthentication", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "getBuilder", "()Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: IBiometricPromptImpl.kt */
public interface IBiometricPromptImpl {
    void authenticate(BiometricPromptCompat.AuthenticationCallback authenticationCallback);

    void cancelAuthentication();

    BiometricPromptCompat.Builder getBuilder();
}
