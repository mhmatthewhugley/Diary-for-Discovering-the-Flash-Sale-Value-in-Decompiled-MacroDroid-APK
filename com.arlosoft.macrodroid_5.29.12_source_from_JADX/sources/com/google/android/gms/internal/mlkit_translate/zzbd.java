package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzbd extends OutputStream {

    /* renamed from: a */
    private long f43133a = 0;

    zzbd() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo52083b() {
        return this.f43133a;
    }

    public final void write(int i) {
        this.f43133a++;
    }

    public final void write(byte[] bArr) {
        this.f43133a += (long) bArr.length;
    }

    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f43133a += (long) i2;
    }
}
