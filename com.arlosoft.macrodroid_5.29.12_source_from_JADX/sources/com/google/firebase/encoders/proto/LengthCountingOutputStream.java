package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

final class LengthCountingOutputStream extends OutputStream {

    /* renamed from: a */
    private long f5591a = 0;

    LengthCountingOutputStream() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo23639b() {
        return this.f5591a;
    }

    public void write(int i) {
        this.f5591a++;
    }

    public void write(byte[] bArr) {
        this.f5591a += (long) bArr.length;
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f5591a += (long) i2;
    }
}
