package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m4888a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m4889b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static long m4890c(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) throws IOException {
        return m4891d(inputStream, outputStream, false, 1024);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: d */
    public static long m4891d(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m4889b(inputStream);
                    m4889b(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m4889b(inputStream);
            m4889b(outputStream);
        }
        return j;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: e */
    public static byte[] m4892e(@NonNull InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m4891d(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
