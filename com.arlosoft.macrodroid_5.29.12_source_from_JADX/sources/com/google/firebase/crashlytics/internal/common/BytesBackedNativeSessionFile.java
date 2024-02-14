package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class BytesBackedNativeSessionFile implements NativeSessionFile {
    @Nullable

    /* renamed from: a */
    private final byte[] f4878a;
    @NonNull

    /* renamed from: b */
    private final String f4879b;
    @NonNull

    /* renamed from: c */
    private final String f4880c;

    BytesBackedNativeSessionFile(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f4879b = str;
        this.f4880c = str2;
        this.f4878a = bArr;
    }

    @Nullable
    /* renamed from: d */
    private byte[] m6566d() {
        GZIPOutputStream gZIPOutputStream;
        if (m6567e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f4878a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    private boolean m6567e() {
        byte[] bArr = this.f4878a;
        return bArr == null || bArr.length == 0;
    }

    @Nullable
    /* renamed from: a */
    public CrashlyticsReport.FilesPayload.File mo22976a() {
        byte[] d = m6566d();
        if (d == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.m7231a().mo23196b(d).mo23197c(this.f4879b).mo23195a();
    }

    @NonNull
    /* renamed from: b */
    public String mo22977b() {
        return this.f4880c;
    }

    @Nullable
    /* renamed from: c */
    public InputStream mo22978c() {
        if (m6567e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f4878a);
    }
}
