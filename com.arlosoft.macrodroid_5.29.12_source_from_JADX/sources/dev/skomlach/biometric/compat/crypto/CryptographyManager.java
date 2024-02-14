package dev.skomlach.biometric.compat.crypto;

import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricCryptographyResult;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.util.Set;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ \u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/CryptographyManager;", "", "()V", "decryptData", "Ldev/skomlach/biometric/compat/BiometricCryptographyResult;", "ciphertext", "", "confirmed", "", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "encryptData", "plaintext", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: CryptographyManager.kt */
public final class CryptographyManager {
    public static final CryptographyManager INSTANCE = new CryptographyManager();

    private CryptographyManager() {
    }

    public final BiometricCryptographyResult decryptData(byte[] bArr, Set<AuthenticationResult> set) {
        C13706o.m87929f(set, "confirmed");
        if (bArr == null) {
            return null;
        }
        for (AuthenticationResult next : set) {
            try {
                BiometricType confirmed = next.getConfirmed();
                if (confirmed != null) {
                    BiometricCryptoObject cryptoObject = next.getCryptoObject();
                    if (cryptoObject == null) {
                        continue;
                    } else {
                        Cipher cipher = cryptoObject.getCipher();
                        if (cipher != null) {
                            byte[] doFinal = cipher.doFinal(bArr);
                            C13706o.m87928e(doFinal, "cipher.doFinal(ciphertext)");
                            return new BiometricCryptographyResult(confirmed, doFinal, (byte[]) null, 4, (C13695i) null);
                        }
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
        return null;
    }

    public final BiometricCryptographyResult encryptData(byte[] bArr, Set<AuthenticationResult> set) {
        C13706o.m87929f(set, "confirmed");
        if (bArr == null) {
            return null;
        }
        for (AuthenticationResult next : set) {
            try {
                BiometricType confirmed = next.getConfirmed();
                if (confirmed != null) {
                    BiometricCryptoObject cryptoObject = next.getCryptoObject();
                    if (cryptoObject == null) {
                        continue;
                    } else {
                        Cipher cipher = cryptoObject.getCipher();
                        if (cipher != null) {
                            byte[] doFinal = cipher.doFinal(bArr);
                            C13706o.m87928e(doFinal, "bytes");
                            return new BiometricCryptographyResult(confirmed, doFinal, cipher.getIV());
                        }
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
        }
        return null;
    }
}
