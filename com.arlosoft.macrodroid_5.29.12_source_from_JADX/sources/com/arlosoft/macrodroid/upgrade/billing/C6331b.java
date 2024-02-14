package com.arlosoft.macrodroid.upgrade.billing;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.arlosoft.macrodroid.upgrade.billing.b */
/* compiled from: Security */
class C6331b {
    /* renamed from: a */
    private static PublicKey m24527a(String str) throws IOException {
        try {
            return KeyFactory.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            String str2 = "Invalid key specification: " + e2;
            Log.w("IABUtil/Security", str2);
            throw new IOException(str2);
        }
    }

    /* renamed from: b */
    private static Boolean m24528b(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(decode)) {
                    return Boolean.TRUE;
                }
                Log.w("IABUtil/Security", "Signature verification failed...");
                return Boolean.FALSE;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (InvalidKeyException unused) {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return Boolean.FALSE;
            } catch (SignatureException unused2) {
                Log.e("IABUtil/Security", "Signature exception.");
                return Boolean.FALSE;
            }
        } catch (IllegalArgumentException unused3) {
            Log.w("IABUtil/Security", "Base64 decoding failed.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: c */
    public static boolean m24529c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnPEmRRNy3WbHl/AzTcWrQAtmNVNy6jzloz3An9tDJKmZnMaV4TsYtMALiGvttLfnKZi+X34UVuJmJMfYEEFgP5llidQklvdBw3gUKecve6Qv9kNLt6iJugLtmUpBKzx/yo2eF787XFkX9i2JPuIQ6J7rQFX6nDCsaoDVENABiifPZDZprgf5Epdr3QGvoso++7sj8oSzPD8r1x8BTDfblD0I6BgFfuB/uy3JKX20S/D7F46dMXhxMJCdpsjqqAnj4DSTESYw2oKizZjv9nzr9nK8qpuHkDytanSZr02kSuqLXYqvW0C0IqJHkX2V04k/Y5j7FzdHc/TfdqkwFp9ylQIDAQAB") || TextUtils.isEmpty(str2)) {
            Log.w("IABUtil/Security", "Purchase verification failed: missing data.");
            return false;
        }
        try {
            return m24528b(m24527a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnPEmRRNy3WbHl/AzTcWrQAtmNVNy6jzloz3An9tDJKmZnMaV4TsYtMALiGvttLfnKZi+X34UVuJmJMfYEEFgP5llidQklvdBw3gUKecve6Qv9kNLt6iJugLtmUpBKzx/yo2eF787XFkX9i2JPuIQ6J7rQFX6nDCsaoDVENABiifPZDZprgf5Epdr3QGvoso++7sj8oSzPD8r1x8BTDfblD0I6BgFfuB/uy3JKX20S/D7F46dMXhxMJCdpsjqqAnj4DSTESYw2oKizZjv9nzr9nK8qpuHkDytanSZr02kSuqLXYqvW0C0IqJHkX2V04k/Y5j7FzdHc/TfdqkwFp9ylQIDAQAB"), str, str2).booleanValue();
        } catch (IOException e) {
            Log.e("IABUtil/Security", "Error generating PublicKey from encoded key: " + e.getMessage());
            return false;
        }
    }
}
