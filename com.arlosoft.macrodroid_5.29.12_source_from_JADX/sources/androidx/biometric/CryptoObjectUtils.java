package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class CryptoObjectUtils {
    private static final String FAKE_KEY_NAME = "androidxBiometric";
    private static final String KEYSTORE_INSTANCE = "AndroidKeyStore";
    private static final String TAG = "CryptoObjectUtils";

    @RequiresApi(23)
    private static class Api23Impl {
        private Api23Impl() {
        }

        @NonNull
        static KeyGenParameterSpec buildKeyGenParameterSpec(@NonNull KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        @NonNull
        static KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder(@NonNull String str, int i) {
            return new KeyGenParameterSpec.Builder(str, i);
        }

        static void initKeyGenerator(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void setBlockModeCBC(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(new String[]{KeyPropertiesCompact.BLOCK_MODE_CBC});
        }

        static void setEncryptionPaddingPKCS7(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(new String[]{KeyPropertiesCompact.ENCRYPTION_PADDING_PKCS7});
        }
    }

    @RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
        }

        @NonNull
        static BiometricPrompt.CryptoObject create(@NonNull Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @Nullable
        static Cipher getCipher(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        @Nullable
        static Mac getMac(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        @Nullable
        static Signature getSignature(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        @NonNull
        static BiometricPrompt.CryptoObject create(@NonNull Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        @NonNull
        static BiometricPrompt.CryptoObject create(@NonNull Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }
    }

    @RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        static BiometricPrompt.CryptoObject create(@NonNull IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        @Nullable
        static IdentityCredential getIdentityCredential(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    private CryptoObjectUtils() {
    }

    @RequiresApi(23)
    @Nullable
    static BiometricPrompt.CryptoObject createFakeCryptoObject() {
        try {
            KeyStore instance = KeyStore.getInstance(KEYSTORE_INSTANCE);
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder = Api23Impl.createKeyGenParameterSpecBuilder(FAKE_KEY_NAME, 3);
            Api23Impl.setBlockModeCBC(createKeyGenParameterSpecBuilder);
            Api23Impl.setEncryptionPaddingPKCS7(createKeyGenParameterSpecBuilder);
            KeyGenerator instance2 = KeyGenerator.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_AES, KEYSTORE_INSTANCE);
            Api23Impl.initKeyGenerator(instance2, Api23Impl.buildKeyGenParameterSpec(createKeyGenParameterSpecBuilder));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey(FAKE_KEY_NAME, (char[]) null));
            return new BiometricPrompt.CryptoObject(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w(TAG, "Failed to create fake crypto object.", e);
            return null;
        }
    }

    @RequiresApi(28)
    @Nullable
    static BiometricPrompt.CryptoObject unwrapFromBiometricPrompt(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = Api28Impl.getCipher(cryptoObject);
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = Api28Impl.getSignature(cryptoObject);
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = Api28Impl.getMac(cryptoObject);
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = Api30Impl.getIdentityCredential(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    @Nullable
    static BiometricPrompt.CryptoObject unwrapFromFingerprintManager(@Nullable FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        return null;
    }

    @RequiresApi(28)
    @Nullable
    static BiometricPrompt.CryptoObject wrapForBiometricPrompt(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return Api30Impl.create(identityCredential);
    }

    @Nullable
    static FingerprintManagerCompat.CryptoObject wrapForFingerprintManager(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new FingerprintManagerCompat.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new FingerprintManagerCompat.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new FingerprintManagerCompat.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && cryptoObject.getIdentityCredential() != null) {
            Log.e(TAG, "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
