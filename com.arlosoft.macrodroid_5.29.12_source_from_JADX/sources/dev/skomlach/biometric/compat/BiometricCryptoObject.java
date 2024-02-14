package dev.skomlach.biometric.compat;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "", "signature", "Ljava/security/Signature;", "cipher", "Ljavax/crypto/Cipher;", "mac", "Ljavax/crypto/Mac;", "(Ljava/security/Signature;Ljavax/crypto/Cipher;Ljavax/crypto/Mac;)V", "getCipher", "()Ljavax/crypto/Cipher;", "getMac", "()Ljavax/crypto/Mac;", "getSignature", "()Ljava/security/Signature;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: BiometricCryptoObject.kt */
public final class BiometricCryptoObject {
    private final Cipher cipher;
    private final Mac mac;
    private final Signature signature;

    public BiometricCryptoObject() {
        this((Signature) null, (Cipher) null, (Mac) null, 7, (C13695i) null);
    }

    public BiometricCryptoObject(Signature signature2, Cipher cipher2, Mac mac2) {
        this.signature = signature2;
        this.cipher = cipher2;
        this.mac = mac2;
    }

    public static /* synthetic */ BiometricCryptoObject copy$default(BiometricCryptoObject biometricCryptoObject, Signature signature2, Cipher cipher2, Mac mac2, int i, Object obj) {
        if ((i & 1) != 0) {
            signature2 = biometricCryptoObject.signature;
        }
        if ((i & 2) != 0) {
            cipher2 = biometricCryptoObject.cipher;
        }
        if ((i & 4) != 0) {
            mac2 = biometricCryptoObject.mac;
        }
        return biometricCryptoObject.copy(signature2, cipher2, mac2);
    }

    public final Signature component1() {
        return this.signature;
    }

    public final Cipher component2() {
        return this.cipher;
    }

    public final Mac component3() {
        return this.mac;
    }

    public final BiometricCryptoObject copy(Signature signature2, Cipher cipher2, Mac mac2) {
        return new BiometricCryptoObject(signature2, cipher2, mac2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiometricCryptoObject)) {
            return false;
        }
        BiometricCryptoObject biometricCryptoObject = (BiometricCryptoObject) obj;
        return C13706o.m87924a(this.signature, biometricCryptoObject.signature) && C13706o.m87924a(this.cipher, biometricCryptoObject.cipher) && C13706o.m87924a(this.mac, biometricCryptoObject.mac);
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public final Mac getMac() {
        return this.mac;
    }

    public final Signature getSignature() {
        return this.signature;
    }

    public int hashCode() {
        Signature signature2 = this.signature;
        int i = 0;
        int hashCode = (signature2 == null ? 0 : signature2.hashCode()) * 31;
        Cipher cipher2 = this.cipher;
        int hashCode2 = (hashCode + (cipher2 == null ? 0 : cipher2.hashCode())) * 31;
        Mac mac2 = this.mac;
        if (mac2 != null) {
            i = mac2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Signature signature2 = this.signature;
        Cipher cipher2 = this.cipher;
        Mac mac2 = this.mac;
        return "BiometricCryptoObject(signature=" + signature2 + ", cipher=" + cipher2 + ", mac=" + mac2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BiometricCryptoObject(Signature signature2, Cipher cipher2, Mac mac2, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : signature2, (i & 2) != 0 ? null : cipher2, (i & 4) != 0 ? null : mac2);
    }
}
