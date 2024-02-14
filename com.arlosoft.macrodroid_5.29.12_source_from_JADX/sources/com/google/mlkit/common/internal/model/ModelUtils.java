package com.google.mlkit.common.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@WorkerThread
@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class ModelUtils {

    /* renamed from: a */
    private static final GmsLogger f56243a = new GmsLogger("ModelUtils", "");

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static abstract class AutoMLManifest {
        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public abstract String mo64500a();

        @NonNull
        @KeepForSdk
        /* renamed from: b */
        public abstract String mo64501b();

        @NonNull
        @KeepForSdk
        /* renamed from: c */
        public abstract String mo64502c();
    }

    @KeepForSdk
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static abstract class ModelLoggingInfo {
        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public abstract String mo64506a();

        @KeepForSdk
        /* renamed from: b */
        public abstract long mo64507b();

        @KeepForSdk
        /* renamed from: c */
        public abstract boolean mo64508c();
    }

    private ModelUtils() {
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public static String m78982a(@NonNull File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            String c = m78984c(fileInputStream);
            fileInputStream.close();
            return c;
        } catch (IOException e) {
            f56243a.mo21704d("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        } catch (Throwable th) {
            zzh.m79002a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m78983b(@NonNull File file, @NonNull String str) {
        String a = m78982a(file);
        f56243a.mo21702b("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(a)));
        return str.equals(a);
    }

    @Nullable
    /* renamed from: c */
    private static String m78984c(InputStream inputStream) {
        int i;
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            f56243a.mo21704d("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        } catch (IOException unused2) {
            f56243a.mo21704d("ModelUtils", "Failed to read model file");
            return null;
        }
    }
}
