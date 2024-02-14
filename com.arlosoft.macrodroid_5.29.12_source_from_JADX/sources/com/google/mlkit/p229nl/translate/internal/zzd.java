package com.google.mlkit.p229nl.translate.internal;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.mlkit.nl.translate.internal.zzd */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzd {
    /* renamed from: a */
    static synchronized void m79216a(File file) throws IOException {
        synchronized (zzd.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(String.valueOf(file).concat(" exists, but is not a directory"));
                }
            } else if (!file.mkdirs()) {
                throw new IOException("Can not create directory ".concat(String.valueOf(file)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m79218c(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File c : listFiles) {
                m79218c(c, true);
            }
        }
        return !z || file.delete();
    }
}
