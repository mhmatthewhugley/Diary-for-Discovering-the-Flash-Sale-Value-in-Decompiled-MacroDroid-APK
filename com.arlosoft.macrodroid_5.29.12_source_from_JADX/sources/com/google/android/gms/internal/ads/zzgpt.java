package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpt extends OutputStream {

    /* renamed from: o */
    private static final byte[] f37006o = new byte[0];

    /* renamed from: a */
    private final int f37007a = 128;

    /* renamed from: c */
    private final ArrayList f37008c = new ArrayList();

    /* renamed from: d */
    private int f37009d;

    /* renamed from: f */
    private byte[] f37010f = new byte[128];

    /* renamed from: g */
    private int f37011g;

    zzgpt(int i) {
    }

    /* renamed from: f */
    private final void m52557f(int i) {
        this.f37008c.add(new zzgps(this.f37010f));
        int length = this.f37009d + this.f37010f.length;
        this.f37009d = length;
        this.f37010f = new byte[Math.max(this.f37007a, Math.max(i, length >>> 1))];
        this.f37011g = 0;
    }

    /* renamed from: b */
    public final synchronized int mo47097b() {
        return this.f37009d + this.f37011g;
    }

    /* renamed from: c */
    public final synchronized zzgpw mo47098c() {
        int i = this.f37011g;
        byte[] bArr = this.f37010f;
        if (i >= bArr.length) {
            this.f37008c.add(new zzgps(this.f37010f));
            this.f37010f = f37006o;
        } else if (i > 0) {
            this.f37008c.add(new zzgps(Arrays.copyOf(bArr, i)));
        }
        this.f37009d += this.f37011g;
        this.f37011g = 0;
        return zzgpw.m52563Q(this.f37008c);
    }

    /* renamed from: e */
    public final synchronized void mo47099e() {
        this.f37008c.clear();
        this.f37009d = 0;
        this.f37011g = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo47097b())});
    }

    public final synchronized void write(int i) {
        if (this.f37011g == this.f37010f.length) {
            m52557f(1);
        }
        byte[] bArr = this.f37010f;
        int i2 = this.f37011g;
        this.f37011g = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f37010f;
        int length = bArr2.length;
        int i3 = this.f37011g;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f37011g += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m52557f(i5);
        System.arraycopy(bArr, i + i4, this.f37010f, 0, i5);
        this.f37011g = i5;
    }
}
