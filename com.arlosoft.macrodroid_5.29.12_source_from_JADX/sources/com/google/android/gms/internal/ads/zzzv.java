package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzv {

    /* renamed from: a */
    public final int f39050a;

    /* renamed from: b */
    public final int f39051b;

    /* renamed from: c */
    public final int f39052c;

    /* renamed from: d */
    public final int f39053d;

    /* renamed from: e */
    public final int f39054e;

    /* renamed from: f */
    public final int f39055f;

    /* renamed from: g */
    public final int f39056g;

    /* renamed from: h */
    public final int f39057h;

    /* renamed from: i */
    public final int f39058i;

    /* renamed from: j */
    public final long f39059j;
    @Nullable

    /* renamed from: k */
    public final zzzu f39060k;
    @Nullable

    /* renamed from: l */
    private final zzbq f39061l;

    private zzzv(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable zzzu zzzu, @Nullable zzbq zzbq) {
        this.f39050a = i;
        this.f39051b = i2;
        this.f39052c = i3;
        this.f39053d = i4;
        this.f39054e = i5;
        this.f39055f = m55558i(i5);
        this.f39056g = i6;
        this.f39057h = i7;
        this.f39058i = m55557h(i7);
        this.f39059j = j;
        this.f39060k = zzzu;
        this.f39061l = zzbq;
    }

    public zzzv(byte[] bArr, int i) {
        zzee zzee = new zzee(bArr, bArr.length);
        zzee.mo45203h(i * 8);
        this.f39050a = zzee.mo45198c(16);
        this.f39051b = zzee.mo45198c(16);
        this.f39052c = zzee.mo45198c(24);
        this.f39053d = zzee.mo45198c(24);
        int c = zzee.mo45198c(20);
        this.f39054e = c;
        this.f39055f = m55558i(c);
        this.f39056g = zzee.mo45198c(3) + 1;
        int c2 = zzee.mo45198c(5) + 1;
        this.f39057h = c2;
        this.f39058i = m55557h(c2);
        this.f39059j = zzen.m49169i0(zzee.mo45198c(4), zzee.mo45198c(32));
        this.f39060k = null;
        this.f39061l = null;
    }

    /* renamed from: h */
    private static int m55557h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: i */
    private static int m55558i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final long mo48464a() {
        long j = this.f39059j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f39054e);
    }

    /* renamed from: b */
    public final long mo48465b(long j) {
        return zzen.m49155b0((j * ((long) this.f39054e)) / 1000000, 0, this.f39059j - 1);
    }

    /* renamed from: c */
    public final zzaf mo48466c(byte[] bArr, @Nullable zzbq zzbq) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f39053d;
        if (i <= 0) {
            i = -1;
        }
        zzbq d = mo48467d(zzbq);
        zzad zzad = new zzad();
        zzad.mo41343s("audio/flac");
        zzad.mo41336l(i);
        zzad.mo41326e0(this.f39056g);
        zzad.mo41344t(this.f39054e);
        zzad.mo41333i(Collections.singletonList(bArr));
        zzad.mo41337m(d);
        return zzad.mo41349y();
    }

    @Nullable
    /* renamed from: d */
    public final zzbq mo48467d(@Nullable zzbq zzbq) {
        zzbq zzbq2 = this.f39061l;
        return zzbq2 == null ? zzbq : zzbq2.mo42878d(zzbq);
    }

    /* renamed from: e */
    public final zzzv mo48468e(List list) {
        return new zzzv(this.f39050a, this.f39051b, this.f39052c, this.f39053d, this.f39054e, this.f39056g, this.f39057h, this.f39059j, this.f39060k, mo48467d(new zzbq(list)));
    }

    /* renamed from: f */
    public final zzzv mo48469f(@Nullable zzzu zzzu) {
        return new zzzv(this.f39050a, this.f39051b, this.f39052c, this.f39053d, this.f39054e, this.f39056g, this.f39057h, this.f39059j, zzzu, this.f39061l);
    }

    /* renamed from: g */
    public final zzzv mo48470g(List list) {
        return new zzzv(this.f39050a, this.f39051b, this.f39052c, this.f39053d, this.f39054e, this.f39056g, this.f39057h, this.f39059j, this.f39060k, mo48467d(zzaav.m40954b(list)));
    }
}
