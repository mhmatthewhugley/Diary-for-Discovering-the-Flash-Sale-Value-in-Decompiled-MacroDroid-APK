package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzayf implements zzayc, zzayb {

    /* renamed from: a */
    public final zzayc[] f26254a;

    /* renamed from: c */
    private final IdentityHashMap f26255c = new IdentityHashMap();

    /* renamed from: d */
    private zzayb f26256d;

    /* renamed from: f */
    private int f26257f;

    /* renamed from: g */
    private zzayt f26258g;

    /* renamed from: o */
    private zzayc[] f26259o;

    /* renamed from: p */
    private zzayq f26260p;

    public zzayf(zzayc... zzaycArr) {
        this.f26254a = zzaycArr;
    }

    /* renamed from: a */
    public final boolean mo42190a(long j) {
        return this.f26260p.mo42190a(j);
    }

    /* renamed from: c */
    public final long mo42209c(zzayx[] zzayxArr, boolean[] zArr, zzayo[] zzayoArr, boolean[] zArr2, long j) {
        int length;
        int i;
        zzayx[] zzayxArr2 = zzayxArr;
        zzayo[] zzayoArr2 = zzayoArr;
        int length2 = zzayxArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzayxArr2.length;
            if (i2 >= length) {
                break;
            }
            zzayo zzayo = zzayoArr2[i2];
            if (zzayo == null) {
                i = -1;
            } else {
                i = ((Integer) this.f26255c.get(zzayo)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzayx zzayx = zzayxArr2[i2];
            if (zzayx != null) {
                zzays d = zzayx.mo42265d();
                int i3 = 0;
                while (true) {
                    zzayc[] zzaycArr = this.f26254a;
                    if (i3 >= zzaycArr.length) {
                        break;
                    } else if (zzaycArr[i3].mo42219n().mo42257a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f26255c.clear();
        zzayo[] zzayoArr3 = new zzayo[length];
        zzayo[] zzayoArr4 = new zzayo[length];
        zzayx[] zzayxArr3 = new zzayx[length];
        ArrayList arrayList = new ArrayList(this.f26254a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f26254a.length) {
            for (int i5 = 0; i5 < zzayxArr2.length; i5++) {
                zzayx zzayx2 = null;
                zzayoArr4[i5] = iArr[i5] == i4 ? zzayoArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzayx2 = zzayxArr2[i5];
                }
                zzayxArr3[i5] = zzayx2;
            }
            int i6 = i4;
            zzayx[] zzayxArr4 = zzayxArr3;
            ArrayList arrayList2 = arrayList;
            long c = this.f26254a[i4].mo42209c(zzayxArr3, zArr, zzayoArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = c;
            } else if (c != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzayxArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzbac.m42926e(zzayoArr4[i7] != null);
                    zzayo zzayo2 = zzayoArr4[i7];
                    zzayoArr3[i7] = zzayo2;
                    this.f26255c.put(zzayo2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzayoArr4[i7] != null) {
                        z2 = false;
                    }
                    zzbac.m42926e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f26254a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzayxArr3 = zzayxArr4;
            zzayoArr2 = zzayoArr;
        }
        zzayo[] zzayoArr5 = zzayoArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzayoArr3, 0, zzayoArr5, 0, length);
        zzayc[] zzaycArr2 = new zzayc[arrayList3.size()];
        this.f26259o = zzaycArr2;
        arrayList3.toArray(zzaycArr2);
        this.f26260p = new zzaxq(this.f26259o);
        return j2;
    }

    /* renamed from: d */
    public final void mo42210d(zzayb zzayb, long j) {
        this.f26256d = zzayb;
        this.f26257f = r0;
        for (zzayc d : this.f26254a) {
            d.mo42210d(this, j);
        }
    }

    /* renamed from: e */
    public final long mo42211e() {
        long e = this.f26254a[0].mo42211e();
        int i = 1;
        while (true) {
            zzayc[] zzaycArr = this.f26254a;
            if (i >= zzaycArr.length) {
                if (e != -9223372036854775807L) {
                    zzayc[] zzaycArr2 = this.f26259o;
                    int length = zzaycArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzayc zzayc = zzaycArr2[i2];
                        if (zzayc == this.f26254a[0] || zzayc.mo42213g(e) == e) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return e;
            } else if (zzaycArr[i].mo42211e() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    /* renamed from: f */
    public final long mo42212f() {
        long j = Long.MAX_VALUE;
        for (zzayc f : this.f26259o) {
            long f2 = f.mo42212f();
            if (f2 != Long.MIN_VALUE) {
                j = Math.min(j, f2);
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: g */
    public final long mo42213g(long j) {
        long g = this.f26259o[0].mo42213g(j);
        int i = 1;
        while (true) {
            zzayc[] zzaycArr = this.f26259o;
            if (i >= zzaycArr.length) {
                return g;
            }
            if (zzaycArr[i].mo42213g(g) == g) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    /* renamed from: h */
    public final void mo41956h(zzayc zzayc) {
        int i = this.f26257f - 1;
        this.f26257f = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzayc n : this.f26254a) {
                i2 += n.mo42219n().f26315a;
            }
            zzays[] zzaysArr = new zzays[i2];
            int i3 = 0;
            for (zzayc n2 : this.f26254a) {
                zzayt n3 = n2.mo42219n();
                int i4 = n3.f26315a;
                int i5 = 0;
                while (i5 < i4) {
                    zzaysArr[i3] = n3.mo42258b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f26258g = new zzayt(zzaysArr);
            this.f26256d.mo41956h(this);
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo41958i(zzayq zzayq) {
        zzayc zzayc = (zzayc) zzayq;
        if (this.f26258g != null) {
            this.f26256d.mo41958i(this);
        }
    }

    /* renamed from: l */
    public final void mo42217l(long j) {
        for (zzayc l : this.f26259o) {
            l.mo42217l(j);
        }
    }

    /* renamed from: n */
    public final zzayt mo42219n() {
        return this.f26258g;
    }

    /* renamed from: p */
    public final void mo42221p() throws IOException {
        for (zzayc p : this.f26254a) {
            p.mo42221p();
        }
    }

    public final long zza() {
        return this.f26260p.zza();
    }
}
