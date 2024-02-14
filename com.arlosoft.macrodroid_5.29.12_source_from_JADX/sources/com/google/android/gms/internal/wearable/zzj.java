package com.google.android.gms.internal.wearable;

import android.os.ParcelFileDescriptor;
import androidx.work.Data;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzj {
    /* renamed from: a */
    public static File m64562a(ParcelFileDescriptor parcelFileDescriptor, File file) throws IOException {
        Throwable th;
        IOException e;
        FileOutputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File createTempFile = File.createTempFile("asset", ".tmp", file);
            FileOutputStream fileOutputStream = null;
            try {
                autoCloseInputStream = new FileOutputStream(createTempFile);
                try {
                    byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                    while (true) {
                        int read = autoCloseInputStream.read(bArr);
                        if (read < 0) {
                            m64563b(autoCloseInputStream);
                            m64563b(autoCloseInputStream);
                            return createTempFile;
                        }
                        autoCloseInputStream.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                IOException iOException = e3;
                FileOutputStream fileOutputStream2 = null;
                e = iOException;
                try {
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    m64563b(autoCloseInputStream);
                    m64563b(fileOutputStream);
                    createTempFile.delete();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                m64563b(autoCloseInputStream);
                m64563b(fileOutputStream);
                createTempFile.delete();
                throw th;
            }
        } finally {
            m64563b(autoCloseInputStream);
        }
    }

    /* renamed from: b */
    private static void m64563b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
