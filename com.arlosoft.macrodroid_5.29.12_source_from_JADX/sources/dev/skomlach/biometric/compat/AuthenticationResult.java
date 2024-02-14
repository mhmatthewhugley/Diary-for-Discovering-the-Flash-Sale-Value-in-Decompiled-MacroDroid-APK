package dev.skomlach.biometric.compat;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/AuthenticationResult;", "", "confirmed", "Ldev/skomlach/biometric/compat/BiometricType;", "cryptoObject", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "(Ldev/skomlach/biometric/compat/BiometricType;Ldev/skomlach/biometric/compat/BiometricCryptoObject;)V", "getConfirmed", "()Ldev/skomlach/biometric/compat/BiometricType;", "getCryptoObject", "()Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: AuthenticationResult.kt */
public final class AuthenticationResult {
    private final BiometricType confirmed;
    private final BiometricCryptoObject cryptoObject;

    public AuthenticationResult(BiometricType biometricType, BiometricCryptoObject biometricCryptoObject) {
        this.confirmed = biometricType;
        this.cryptoObject = biometricCryptoObject;
    }

    public static /* synthetic */ AuthenticationResult copy$default(AuthenticationResult authenticationResult, BiometricType biometricType, BiometricCryptoObject biometricCryptoObject, int i, Object obj) {
        if ((i & 1) != 0) {
            biometricType = authenticationResult.confirmed;
        }
        if ((i & 2) != 0) {
            biometricCryptoObject = authenticationResult.cryptoObject;
        }
        return authenticationResult.copy(biometricType, biometricCryptoObject);
    }

    public final BiometricType component1() {
        return this.confirmed;
    }

    public final BiometricCryptoObject component2() {
        return this.cryptoObject;
    }

    public final AuthenticationResult copy(BiometricType biometricType, BiometricCryptoObject biometricCryptoObject) {
        return new AuthenticationResult(biometricType, biometricCryptoObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationResult)) {
            return false;
        }
        AuthenticationResult authenticationResult = (AuthenticationResult) obj;
        return this.confirmed == authenticationResult.confirmed && C13706o.m87924a(this.cryptoObject, authenticationResult.cryptoObject);
    }

    public final BiometricType getConfirmed() {
        return this.confirmed;
    }

    public final BiometricCryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    public int hashCode() {
        BiometricType biometricType = this.confirmed;
        int i = 0;
        int hashCode = (biometricType == null ? 0 : biometricType.hashCode()) * 31;
        BiometricCryptoObject biometricCryptoObject = this.cryptoObject;
        if (biometricCryptoObject != null) {
            i = biometricCryptoObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        BiometricType biometricType = this.confirmed;
        BiometricCryptoObject biometricCryptoObject = this.cryptoObject;
        return "AuthenticationResult(confirmed=" + biometricType + ", cryptoObject=" + biometricCryptoObject + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthenticationResult(BiometricType biometricType, BiometricCryptoObject biometricCryptoObject, int i, C13695i iVar) {
        this(biometricType, (i & 2) != 0 ? null : biometricCryptoObject);
    }
}
