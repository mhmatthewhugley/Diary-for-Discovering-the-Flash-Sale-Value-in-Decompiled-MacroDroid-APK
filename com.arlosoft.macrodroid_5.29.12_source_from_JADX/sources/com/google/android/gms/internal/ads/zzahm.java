package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahm {

    /* renamed from: a */
    private final zzaap f24603a;

    /* renamed from: b */
    private long f24604b;

    /* renamed from: c */
    private boolean f24605c;

    /* renamed from: d */
    private int f24606d;

    /* renamed from: e */
    private long f24607e;

    /* renamed from: f */
    private boolean f24608f;

    /* renamed from: g */
    private boolean f24609g;

    /* renamed from: h */
    private boolean f24610h;

    /* renamed from: i */
    private boolean f24611i;

    /* renamed from: j */
    private boolean f24612j;

    /* renamed from: k */
    private long f24613k;

    /* renamed from: l */
    private long f24614l;

    /* renamed from: m */
    private boolean f24615m;

    public zzahm(zzaap zzaap) {
        this.f24603a = zzaap;
    }

    /* renamed from: e */
    private final void m41449e(int i) {
        long j = this.f24614l;
        if (j != -9223372036854775807L) {
            boolean z = this.f24615m;
            long j2 = this.f24604b;
            long j3 = this.f24613k;
            this.f24603a.mo41216f(j, z ? 1 : 0, (int) (j2 - j3), i, (zzaao) null);
        }
    }

    /* renamed from: a */
    public final void mo41487a(long j, int i, boolean z) {
        if (this.f24612j && this.f24609g) {
            this.f24615m = this.f24605c;
            this.f24612j = false;
        } else if (this.f24610h || this.f24609g) {
            if (z && this.f24611i) {
                m41449e(i + ((int) (j - this.f24604b)));
            }
            this.f24613k = this.f24604b;
            this.f24614l = this.f24607e;
            this.f24615m = this.f24605c;
            this.f24611i = true;
        }
    }

    /* renamed from: b */
    public final void mo41488b(byte[] bArr, int i, int i2) {
        if (this.f24608f) {
            int i3 = this.f24606d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f24609g = (bArr[i4] & 128) != 0;
                this.f24608f = false;
                return;
            }
            this.f24606d = i3 + (i2 - i);
        }
    }

    /* renamed from: c */
    public final void mo41489c() {
        this.f24608f = false;
        this.f24609g = false;
        this.f24610h = false;
        this.f24611i = false;
        this.f24612j = false;
    }

    /* renamed from: d */
    public final void mo41490d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f24609g = false;
        this.f24610h = false;
        this.f24607e = j2;
        this.f24606d = 0;
        this.f24604b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f24611i && !this.f24612j) {
                if (z) {
                    m41449e(i);
                }
                this.f24611i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f24610h = !this.f24612j;
                this.f24612j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f24605c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f24608f = z2;
    }
}
