package com.google.firebase.storage.internal;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public class AdaptiveStreamBuffer {

    /* renamed from: f */
    private static final Runtime f55487f = Runtime.getRuntime();

    /* renamed from: a */
    private final InputStream f55488a;

    /* renamed from: b */
    private byte[] f55489b;

    /* renamed from: c */
    private int f55490c = 0;

    /* renamed from: d */
    private boolean f55491d = false;

    /* renamed from: e */
    private boolean f55492e = true;

    public AdaptiveStreamBuffer(InputStream inputStream, int i) {
        this.f55488a = inputStream;
        this.f55489b = new byte[i];
    }

    /* renamed from: g */
    private int m77592g(int i) {
        int max = Math.max(this.f55489b.length * 2, i);
        Runtime runtime = f55487f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f55492e || ((long) max) >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f55489b, 0, bArr, 0, this.f55490c);
                this.f55489b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f55492e = false;
            }
        }
        return this.f55489b.length;
    }

    /* renamed from: a */
    public int mo63708a(int i) throws IOException {
        int i2 = this.f55490c;
        int i3 = 0;
        if (i <= i2) {
            int i4 = i2 - i;
            this.f55490c = i4;
            byte[] bArr = this.f55489b;
            System.arraycopy(bArr, i, bArr, 0, i4);
            return i;
        }
        this.f55490c = 0;
        while (i3 < i) {
            int skip = (int) this.f55488a.skip((long) (i - i3));
            if (skip > 0) {
                i3 += skip;
            } else if (skip != 0) {
                continue;
            } else if (this.f55488a.read() == -1) {
                break;
            } else {
                i3++;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public int mo63709b() {
        return this.f55490c;
    }

    /* renamed from: c */
    public void mo63710c() throws IOException {
        this.f55488a.close();
    }

    /* renamed from: d */
    public int mo63711d(int i) throws IOException {
        if (i > this.f55489b.length) {
            i = Math.min(i, m77592g(i));
        }
        while (true) {
            int i2 = this.f55490c;
            if (i2 >= i) {
                break;
            }
            int read = this.f55488a.read(this.f55489b, i2, i - i2);
            if (read == -1) {
                this.f55491d = true;
                break;
            }
            this.f55490c += read;
        }
        return this.f55490c;
    }

    /* renamed from: e */
    public byte[] mo63712e() {
        return this.f55489b;
    }

    /* renamed from: f */
    public boolean mo63713f() {
        return this.f55491d;
    }
}
