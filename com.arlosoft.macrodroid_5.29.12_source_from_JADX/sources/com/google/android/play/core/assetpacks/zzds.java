package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzds {

    /* renamed from: a */
    private byte[] f51507a = new byte[4096];

    /* renamed from: b */
    private int f51508b;

    /* renamed from: c */
    private long f51509c;

    /* renamed from: d */
    private long f51510d;

    /* renamed from: e */
    private int f51511e;

    /* renamed from: f */
    private int f51512f;

    /* renamed from: g */
    private int f51513g;

    /* renamed from: h */
    private boolean f51514h;
    @Nullable

    /* renamed from: i */
    private String f51515i;

    public zzds() {
        mo59745d();
    }

    /* renamed from: e */
    private final int m70694e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f51508b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f51507a, this.f51508b, min);
        int i5 = this.f51508b + min;
        this.f51508b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: a */
    public final int mo59742a() {
        return this.f51512f;
    }

    /* renamed from: b */
    public final int mo59743b(byte[] bArr, int i, int i2) {
        int e = m70694e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f51509c == -1) {
            long b = zzbr.m70625b(this.f51507a, 0);
            this.f51509c = b;
            if (b == 67324752) {
                this.f51514h = false;
                this.f51510d = zzbr.m70625b(this.f51507a, 18);
                this.f51513g = zzbr.m70624a(this.f51507a, 8);
                this.f51511e = zzbr.m70624a(this.f51507a, 26);
                int a = this.f51511e + 30 + zzbr.m70624a(this.f51507a, 28);
                this.f51512f = a;
                int length = this.f51507a.length;
                if (length < a) {
                    do {
                        length += length;
                    } while (length < a);
                    this.f51507a = Arrays.copyOf(this.f51507a, length);
                }
            } else {
                this.f51514h = true;
            }
        }
        int e2 = m70694e(this.f51512f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f51514h && this.f51515i == null) {
            this.f51515i = new String(this.f51507a, 30, this.f51511e);
        }
        return i3;
    }

    /* renamed from: c */
    public final zzet mo59744c() {
        int i = this.f51508b;
        int i2 = this.f51512f;
        if (i < i2) {
            return new zzbq(this.f51515i, this.f51510d, this.f51513g, true, this.f51514h, Arrays.copyOf(this.f51507a, i));
        }
        zzbq zzbq = new zzbq(this.f51515i, this.f51510d, this.f51513g, false, this.f51514h, Arrays.copyOf(this.f51507a, i2));
        mo59745d();
        return zzbq;
    }

    /* renamed from: d */
    public final void mo59745d() {
        this.f51508b = 0;
        this.f51511e = -1;
        this.f51509c = -1;
        this.f51514h = false;
        this.f51512f = 30;
        this.f51510d = -1;
        this.f51513g = -1;
        this.f51515i = null;
    }
}
