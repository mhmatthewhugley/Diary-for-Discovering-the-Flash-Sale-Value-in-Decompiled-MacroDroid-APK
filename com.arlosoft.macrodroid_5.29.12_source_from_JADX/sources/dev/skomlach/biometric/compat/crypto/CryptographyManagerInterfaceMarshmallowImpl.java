package dev.skomlach.biometric.compat.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@RequiresApi(23)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterfaceMarshmallowImpl;", "Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterface;", "Ljavax/crypto/Cipher;", "getCipher", "", "keyName", "", "isUserAuthRequired", "Ljavax/crypto/SecretKey;", "getOrCreateSecretKey", "hasStrongBox", "getInitializedCipherForEncryption", "", "initializationVector", "getInitializedCipherForDecryption", "Lja/u;", "deleteKey", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getANDROID_KEYSTORE_PROVIDER_TYPE", "()Ljava/lang/String;", "ANDROID_KEYSTORE_PROVIDER_TYPE", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: CryptographyManagerInterfaceMarshmallowImpl.kt */
public final class CryptographyManagerInterfaceMarshmallowImpl implements CryptographyManagerInterface {
    private final Context context = C12104a.f58372a.mo68283g();

    private final String getANDROID_KEYSTORE_PROVIDER_TYPE() {
        return "AndroidKeyStore";
    }

    private final Cipher getCipher() {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        C13706o.m87928e(instance, "getInstance(transformation)");
        return instance;
    }

    private final SecretKey getOrCreateSecretKey(String str, boolean z) {
        KeyStore instance = KeyStore.getInstance(getANDROID_KEYSTORE_PROVIDER_TYPE());
        instance.load((KeyStore.LoadStoreParameter) null);
        Key key = instance.getKey(str, (char[]) null);
        if (key != null) {
            return (SecretKey) key;
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 3);
        builder.setBlockModes(new String[]{KeyPropertiesCompact.BLOCK_MODE_CBC});
        builder.setEncryptionPaddings(new String[]{KeyPropertiesCompact.ENCRYPTION_PADDING_PKCS7});
        builder.setUserAuthenticationRequired(z);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            builder.setInvalidatedByBiometricEnrollment(z);
        }
        if (i >= 28) {
            builder.setIsStrongBoxBacked(hasStrongBox());
        }
        KeyGenParameterSpec build = builder.build();
        C13706o.m87928e(build, "paramsBuilder.build()");
        KeyGenerator instance2 = KeyGenerator.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_AES, getANDROID_KEYSTORE_PROVIDER_TYPE());
        instance2.init(build);
        SecretKey generateKey = instance2.generateKey();
        C13706o.m87928e(generateKey, "keyGenerator.generateKey()");
        return generateKey;
    }

    private final boolean hasStrongBox() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
        }
        return false;
    }

    public void deleteKey(String str) {
        C13706o.m87929f(str, "keyName");
        KeyStore instance = KeyStore.getInstance(getANDROID_KEYSTORE_PROVIDER_TYPE());
        instance.load((KeyStore.LoadStoreParameter) null);
        instance.deleteEntry("CryptographyManagerInterfaceMarshmallowImpl." + str);
    }

    public Cipher getInitializedCipherForDecryption(String str, boolean z, byte[] bArr) {
        C13706o.m87929f(str, "keyName");
        try {
            Cipher cipher = getCipher();
            cipher.init(2, getOrCreateSecretKey("CryptographyManagerInterfaceMarshmallowImpl." + str, z), new GCMParameterSpec(128, bArr));
            return cipher;
        } catch (Throwable th) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68219e(th, "KeyName=CryptographyManagerInterfaceMarshmallowImpl." + str + "; isUserAuthRequired=" + z);
            throw th;
        }
    }

    public Cipher getInitializedCipherForEncryption(String str, boolean z) {
        C13706o.m87929f(str, "keyName");
        try {
            Cipher cipher = getCipher();
            cipher.init(1, getOrCreateSecretKey("CryptographyManagerInterfaceMarshmallowImpl." + str, z));
            return cipher;
        } catch (Throwable th) {
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            biometricLoggerImpl.mo68219e(th, "KeyName=CryptographyManagerInterfaceMarshmallowImpl." + str + "; isUserAuthRequired=" + z);
            throw th;
        }
    }
}
