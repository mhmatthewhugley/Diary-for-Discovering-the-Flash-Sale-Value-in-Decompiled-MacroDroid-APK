package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzauf implements zzatl {

    /* renamed from: b */
    private int f25633b = -1;

    /* renamed from: c */
    private int f25634c = -1;

    /* renamed from: d */
    private int[] f25635d;

    /* renamed from: e */
    private boolean f25636e;

    /* renamed from: f */
    private int[] f25637f;

    /* renamed from: g */
    private ByteBuffer f25638g;

    /* renamed from: h */
    private ByteBuffer f25639h;

    /* renamed from: i */
    private boolean f25640i;

    public zzauf() {
        ByteBuffer byteBuffer = zzatl.f25551a;
        this.f25638g = byteBuffer;
        this.f25639h = byteBuffer;
    }

    /* renamed from: a */
    public final ByteBuffer mo41996a() {
        ByteBuffer byteBuffer = this.f25639h;
        this.f25639h = zzatl.f25551a;
        return byteBuffer;
    }

    /* renamed from: b */
    public final void mo41997b() {
        this.f25640i = true;
    }

    /* renamed from: c */
    public final void mo41998c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f25633b;
        int length = ((limit - position) / (i + i)) * this.f25637f.length;
        int i2 = length + length;
        if (this.f25638g.capacity() < i2) {
            this.f25638g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f25638g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f25637f) {
                this.f25638g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f25633b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f25638g.flip();
        this.f25639h = this.f25638g;
    }

    /* renamed from: d */
    public final void mo41999d() {
        this.f25639h = zzatl.f25551a;
        this.f25640i = false;
    }

    /* renamed from: e */
    public final boolean mo42000e(int i, int i2, int i3) throws zzatk {
        boolean z = !Arrays.equals(this.f25635d, this.f25637f);
        int[] iArr = this.f25635d;
        this.f25637f = iArr;
        if (iArr == null) {
            this.f25636e = false;
            return z;
        } else if (i3 != 2) {
            throw new zzatk(i, i2, i3);
        } else if (!z && this.f25634c == i && this.f25633b == i2) {
            return false;
        } else {
            this.f25634c = i;
            this.f25633b = i2;
            this.f25636e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f25637f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f25636e = (i5 != i4) | this.f25636e;
                    i4++;
                } else {
                    throw new zzatk(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo42001f() {
        mo41999d();
        this.f25638g = zzatl.f25551a;
        this.f25633b = -1;
        this.f25634c = -1;
        this.f25637f = null;
        this.f25636e = false;
    }

    /* renamed from: g */
    public final boolean mo42002g() {
        return this.f25636e;
    }

    /* renamed from: h */
    public final boolean mo42003h() {
        return this.f25640i && this.f25639h == zzatl.f25551a;
    }

    /* renamed from: i */
    public final void mo42042i(int[] iArr) {
        this.f25635d = iArr;
    }

    public final int zza() {
        int[] iArr = this.f25637f;
        return iArr == null ? this.f25633b : iArr.length;
    }

    public final int zzb() {
        return 2;
    }
}
