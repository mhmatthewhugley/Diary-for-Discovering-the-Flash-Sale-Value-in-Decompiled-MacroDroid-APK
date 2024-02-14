package dev.skomlach.biometric.compat.crypto;

import javax.crypto.Cipher;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterface;", "", "", "keyName", "", "isUserAuthRequired", "Ljavax/crypto/Cipher;", "getInitializedCipherForEncryption", "", "initializationVector", "getInitializedCipherForDecryption", "Lja/u;", "deleteKey", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: CryptographyManagerInterface.kt */
public interface CryptographyManagerInterface {
    void deleteKey(String str);

    Cipher getInitializedCipherForDecryption(String str, boolean z, byte[] bArr);

    Cipher getInitializedCipherForEncryption(String str, boolean z);
}
