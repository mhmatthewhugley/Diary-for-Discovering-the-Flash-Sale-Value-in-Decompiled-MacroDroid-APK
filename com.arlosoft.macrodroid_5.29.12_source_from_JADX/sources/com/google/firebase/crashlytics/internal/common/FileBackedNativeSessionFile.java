package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class FileBackedNativeSessionFile implements NativeSessionFile {
    @NonNull

    /* renamed from: a */
    private final File f5011a;
    @NonNull

    /* renamed from: b */
    private final String f5012b;
    @NonNull

    /* renamed from: c */
    private final String f5013c;

    FileBackedNativeSessionFile(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.f5012b = str;
        this.f5013c = str2;
        this.f5011a = file;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m6749d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream c = mo22978c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (c == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (c != null) {
                            c.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = c.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            c.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (c != null) {
                    c.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    @Nullable
    /* renamed from: a */
    public CrashlyticsReport.FilesPayload.File mo22976a() {
        byte[] d = m6749d();
        if (d != null) {
            return CrashlyticsReport.FilesPayload.File.m7231a().mo23196b(d).mo23197c(this.f5012b).mo23195a();
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public String mo22977b() {
        return this.f5013c;
    }

    @Nullable
    /* renamed from: c */
    public InputStream mo22978c() {
        if (this.f5011a.exists() && this.f5011a.isFile()) {
            try {
                return new FileInputStream(this.f5011a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
