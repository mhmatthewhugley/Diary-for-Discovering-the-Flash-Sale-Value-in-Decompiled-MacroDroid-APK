package dev.skomlach.biometric.compat.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Base64;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import dev.skomlach.biometric.compat.crypto.rsa.RsaPrivateKey;
import dev.skomlach.biometric.compat.crypto.rsa.RsaPublicKey;
import dev.skomlach.common.contextprovider.C12104a;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;
import p269g9.C12317a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\fH\u0016J\"\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006-"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterfaceLegacyImpl;", "Ldev/skomlach/biometric/compat/crypto/CryptographyManagerInterface;", "Ljavax/crypto/Cipher;", "getCipher", "", "name", "Lja/u;", "getOrCreateSecretKey", "setFakeEnglishLocale", "Ljava/util/Locale;", "locale", "setLocale", "", "keyExist", "", "Ljava/security/PrivateKey;", "getPrivateKeys", "Ljava/security/PublicKey;", "getPublicKeys", "keyPairInFallback", "Ljava/security/KeyPair;", "getKeyPairFromFallback", "keyPair", "storeKeyPairInFallback", "keyName", "deleteKey", "isUserAuthRequired", "getInitializedCipherForEncryption", "", "initializationVector", "getInitializedCipherForDecryption", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getKEYSTORE_FALLBACK_NAME", "()Ljava/lang/String;", "KEYSTORE_FALLBACK_NAME", "getPRIVATE_KEY_NAME", "PRIVATE_KEY_NAME", "getPUBLIC_KEY_NAME", "PUBLIC_KEY_NAME", "getTYPE_RSA", "TYPE_RSA", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: CryptographyManagerInterfaceLegacyImpl.kt */
public final class CryptographyManagerInterfaceLegacyImpl implements CryptographyManagerInterface {
    private final Context context = C12104a.f58372a.mo68283g();

    private final Cipher getCipher() {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        C13706o.m87928e(instance, "getInstance(\"RSA/ECB/PKCS1Padding\")");
        return instance;
    }

    private final String getKEYSTORE_FALLBACK_NAME() {
        return "biometric_keystore_fallback";
    }

    private final KeyPair getKeyPairFromFallback(String str) {
        try {
            C12317a aVar = C12317a.f58995a;
            String keystore_fallback_name = getKEYSTORE_FALLBACK_NAME();
            SharedPreferences a = aVar.mo68640a(keystore_fallback_name + HelpFormatter.DEFAULT_OPT_PREFIX + str);
            if (a.contains(getPRIVATE_KEY_NAME()) && a.contains(getPUBLIC_KEY_NAME())) {
                byte[] decode = Base64.decode(a.getString(getPRIVATE_KEY_NAME(), (String) null), 0);
                byte[] decode2 = Base64.decode(a.getString(getPUBLIC_KEY_NAME(), (String) null), 0);
                RsaPrivateKey.Companion companion = RsaPrivateKey.Companion;
                C13706o.m87928e(decode, "privateKeyBytes");
                RsaPrivateKey fromByteArray = companion.fromByteArray(decode, 8);
                RsaPublicKey.Companion companion2 = RsaPublicKey.Companion;
                C13706o.m87928e(decode2, "publicKeyBytes");
                return new KeyPair(companion2.fromByteArray(decode2, 8).toRsaKey(), fromByteArray.toRsaKey());
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private final void getOrCreateSecretKey(String str) throws Exception {
        if (!keyExist(str)) {
            Locale locale = Locale.getDefault();
            try {
                setFakeEnglishLocale();
                KeyPairGenerator instance = KeyPairGenerator.getInstance(getTYPE_RSA());
                instance.initialize(2048);
                KeyPair generateKeyPair = instance.generateKeyPair();
                C13706o.m87928e(generateKeyPair, "keyPair.generateKeyPair()");
                storeKeyPairInFallback(str, generateKeyPair);
                C13706o.m87928e(locale, "localeBeforeFakingEnglishLocale");
                setLocale(locale);
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                C13706o.m87928e(locale, "localeBeforeFakingEnglishLocale");
                setLocale(locale);
                throw th;
            }
        }
    }

    private final String getPRIVATE_KEY_NAME() {
        return "privateKey";
    }

    private final String getPUBLIC_KEY_NAME() {
        return "publicKey";
    }

    private final List<PrivateKey> getPrivateKeys(String str) {
        ArrayList arrayList = new ArrayList();
        KeyPair keyPairFromFallback = getKeyPairFromFallback(str);
        if (keyPairFromFallback != null) {
            arrayList.add(keyPairFromFallback.getPrivate());
        }
        return arrayList;
    }

    private final List<PublicKey> getPublicKeys(String str) {
        ArrayList arrayList = new ArrayList();
        KeyPair keyPairFromFallback = getKeyPairFromFallback(str);
        if (keyPairFromFallback != null) {
            arrayList.add(keyPairFromFallback.getPublic());
        }
        return arrayList;
    }

    private final String getTYPE_RSA() {
        return KeyPropertiesCompact.KEY_ALGORITHM_RSA;
    }

    private final boolean keyExist(String str) throws Exception {
        return keyPairInFallback(str);
    }

    private final boolean keyPairInFallback(String str) {
        try {
            C12317a aVar = C12317a.f58995a;
            String keystore_fallback_name = getKEYSTORE_FALLBACK_NAME();
            SharedPreferences a = aVar.mo68640a(keystore_fallback_name + HelpFormatter.DEFAULT_OPT_PREFIX + str);
            if (!a.contains(getPRIVATE_KEY_NAME()) || !a.contains(getPUBLIC_KEY_NAME())) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private final void setFakeEnglishLocale() {
        Locale locale = Locale.US;
        C13706o.m87928e(locale, "US");
        setLocale(locale);
    }

    private final void setLocale(Locale locale) {
        Locale.setDefault(locale);
        Resources resources = this.context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    private final void storeKeyPairInFallback(String str, KeyPair keyPair) {
        try {
            RsaPrivateKey.Companion companion = RsaPrivateKey.Companion;
            PrivateKey privateKey = keyPair.getPrivate();
            C13706o.m87927d(privateKey, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateCrtKey");
            RsaPrivateKey fromRsaKey = companion.fromRsaKey((RSAPrivateCrtKey) privateKey);
            RsaPublicKey.Companion companion2 = RsaPublicKey.Companion;
            PublicKey publicKey = keyPair.getPublic();
            C13706o.m87927d(publicKey, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            RsaPublicKey fromRsaKey2 = companion2.fromRsaKey((RSAPublicKey) publicKey);
            C12317a aVar = C12317a.f58995a;
            String keystore_fallback_name = getKEYSTORE_FALLBACK_NAME();
            aVar.mo68640a(keystore_fallback_name + HelpFormatter.DEFAULT_OPT_PREFIX + str).edit().putString(getPRIVATE_KEY_NAME(), Base64.encodeToString(fromRsaKey.toByteArray(8), 0)).putString(getPUBLIC_KEY_NAME(), Base64.encodeToString(fromRsaKey2.toByteArray(8), 0)).apply();
        } catch (Throwable unused) {
        }
    }

    public void deleteKey(String str) {
        C13706o.m87929f(str, "keyName");
        C12317a aVar = C12317a.f58995a;
        String keystore_fallback_name = getKEYSTORE_FALLBACK_NAME();
        aVar.mo68640a(keystore_fallback_name + HelpFormatter.DEFAULT_OPT_PREFIX + str).edit().clear().apply();
    }

    public Cipher getInitializedCipherForDecryption(String str, boolean z, byte[] bArr) {
        C13706o.m87929f(str, "keyName");
        Cipher cipher = getCipher();
        getOrCreateSecretKey("CryptographyManagerInterfaceLegacyImpl." + str);
        for (PrivateKey next : getPrivateKeys("CryptographyManagerInterfaceLegacyImpl." + str)) {
            if (next != null) {
                try {
                    cipher.init(2, next);
                } catch (Exception unused) {
                }
            }
        }
        return cipher;
    }

    public Cipher getInitializedCipherForEncryption(String str, boolean z) {
        C13706o.m87929f(str, "keyName");
        Cipher cipher = getCipher();
        getOrCreateSecretKey("CryptographyManagerInterfaceLegacyImpl." + str);
        for (PublicKey next : getPublicKeys("CryptographyManagerInterfaceLegacyImpl." + str)) {
            if (next != null) {
                try {
                    cipher.init(1, KeyFactory.getInstance(next.getAlgorithm()).generatePublic(new X509EncodedKeySpec(next.getEncoded())));
                    return cipher;
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        throw new IllegalStateException("Cipher initialization error");
    }
}
