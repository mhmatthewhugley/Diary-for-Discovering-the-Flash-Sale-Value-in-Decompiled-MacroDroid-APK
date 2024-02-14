package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzbi extends OutputStream {

    /* renamed from: a */
    private long f41972a = 0;

    zzbi() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo51823b() {
        return this.f41972a;
    }

    public final void write(int i) {
        this.f41972a++;
    }

    public final void write(byte[] bArr) {
        this.f41972a += (long) bArr.length;
    }

    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f41972a += (long) i2;
    }
}
