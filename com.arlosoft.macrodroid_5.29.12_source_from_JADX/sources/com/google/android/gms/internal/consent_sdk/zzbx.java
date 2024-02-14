package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.core.p007os.EnvironmentCompat;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzbx {
    @GuardedBy("DeviceId.class")
    @Nullable

    /* renamed from: a */
    private static String f39402a;

    /* renamed from: a */
    public static synchronized String m55961a(Context context) {
        String str;
        String str2;
        synchronized (zzbx.class) {
            if (f39402a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    str2 = null;
                } else {
                    str2 = Settings.Secure.getString(contentResolver, "android_id");
                }
                if (str2 == null || m55962b()) {
                    str2 = "emulator";
                }
                f39402a = m55963c(str2);
            }
            str = f39402a;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m55962b() {
        String str = Build.FINGERPRINT;
        if (str.startsWith(GeofenceInfo.GEOFENCE_GENERIC_ID) || str.startsWith(EnvironmentCompat.MEDIA_UNKNOWN)) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith(GeofenceInfo.GEOFENCE_GENERIC_ID) && Build.DEVICE.startsWith(GeofenceInfo.GEOFENCE_GENERIC_ID)) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: c */
    private static String m55963c(String str) {
        int i = 0;
        while (i < 3) {
            try {
                MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
                instance.update(str.getBytes());
                return String.format("%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return "";
            }
        }
        return "";
    }
}
