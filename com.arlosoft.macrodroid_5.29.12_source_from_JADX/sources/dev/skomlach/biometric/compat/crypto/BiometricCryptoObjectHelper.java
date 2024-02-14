package dev.skomlach.biometric.compat.crypto;

import android.os.Build;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricCryptographyPurpose;
import dev.skomlach.biometric.compat.utils.LastUpdatedTs;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/BiometricCryptoObjectHelper;", "", "", "name", "Lja/u;", "deleteCrypto", "Ldev/skomlach/biometric/compat/BiometricCryptographyPurpose;", "purpose", "", "isUserAuthRequired", "Ldev/skomlach/biometric/compat/BiometricCryptoObject;", "getBiometricCryptoObject", "Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterface;", "managerInterface", "Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterface;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricCryptoObjectHelper.kt */
public final class BiometricCryptoObjectHelper {
    public static final BiometricCryptoObjectHelper INSTANCE = new BiometricCryptoObjectHelper();
    private static final CryptographyManagerInterface managerInterface;

    static {
        CryptographyManagerInterface cryptographyManagerInterface;
        if (Build.VERSION.SDK_INT >= 23) {
            cryptographyManagerInterface = new CryptographyManagerInterfaceMarshmallowImpl();
        } else {
            cryptographyManagerInterface = new CryptographyManagerInterfaceKitkatImpl();
        }
        managerInterface = cryptographyManagerInterface;
    }

    private BiometricCryptoObjectHelper() {
    }

    public static /* synthetic */ BiometricCryptoObject getBiometricCryptoObject$default(BiometricCryptoObjectHelper biometricCryptoObjectHelper, String str, BiometricCryptographyPurpose biometricCryptographyPurpose, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return biometricCryptoObjectHelper.getBiometricCryptoObject(str, biometricCryptographyPurpose, z);
    }

    public final void deleteCrypto(String str) {
        CryptographyManagerInterface cryptographyManagerInterface = managerInterface;
        if (str != null) {
            long timestamp = LastUpdatedTs.INSTANCE.getTimestamp();
            cryptographyManagerInterface.deleteKey(str + HelpFormatter.DEFAULT_OPT_PREFIX + timestamp);
        }
    }

    public final BiometricCryptoObject getBiometricCryptoObject(String str, BiometricCryptographyPurpose biometricCryptographyPurpose, boolean z) {
        Cipher cipher;
        if (biometricCryptographyPurpose != null) {
            if (!(str == null || str.length() == 0)) {
                try {
                    int purpose = biometricCryptographyPurpose.getPurpose();
                    if (purpose == 1000) {
                        CryptographyManagerInterface cryptographyManagerInterface = managerInterface;
                        long timestamp = LastUpdatedTs.INSTANCE.getTimestamp();
                        cipher = cryptographyManagerInterface.getInitializedCipherForEncryption(str + HelpFormatter.DEFAULT_OPT_PREFIX + timestamp, z);
                    } else if (purpose == 1001) {
                        CryptographyManagerInterface cryptographyManagerInterface2 = managerInterface;
                        long timestamp2 = LastUpdatedTs.INSTANCE.getTimestamp();
                        cipher = cryptographyManagerInterface2.getInitializedCipherForDecryption(str + HelpFormatter.DEFAULT_OPT_PREFIX + timestamp2, z, biometricCryptographyPurpose.getInitVector());
                    } else {
                        throw new IllegalArgumentException("Cryptography purpose should be BiometricCryptographyPurpose.ENCRYPT or BiometricCryptographyPurpose.DECRYPT");
                    }
                    return new BiometricCryptoObject((Signature) null, cipher, (Mac) null);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new BiometricCryptoException(th);
                }
            }
        }
        return null;
    }
}
