package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfon {
    /* renamed from: a */
    public static File m50693a(@NonNull File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static File m50694b(String str, String str2, @NonNull File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m50695c(str, file), str2);
    }

    /* renamed from: c */
    public static File m50695c(String str, @NonNull File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m50693a(file2, false);
        return file2;
    }

    /* renamed from: d */
    public static boolean m50696d(@NonNull File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && m50696d(file2) && z;
            }
        } else {
            z = true;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m50697e(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.m4889b(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.m4889b(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.m4889b(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            IOUtils.m4889b(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.m4889b(fileOutputStream);
            throw th;
        }
    }
}
