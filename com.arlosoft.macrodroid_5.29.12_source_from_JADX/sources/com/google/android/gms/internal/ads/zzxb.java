package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzxb {

    /* renamed from: g */
    private static final Comparator f38833g = zzwx.f38824a;

    /* renamed from: h */
    private static final Comparator f38834h = zzwy.f38825a;

    /* renamed from: a */
    private final ArrayList f38835a = new ArrayList();

    /* renamed from: b */
    private final zzxa[] f38836b = new zzxa[5];

    /* renamed from: c */
    private int f38837c = -1;

    /* renamed from: d */
    private int f38838d;

    /* renamed from: e */
    private int f38839e;

    /* renamed from: f */
    private int f38840f;

    public zzxb(int i) {
    }

    /* renamed from: a */
    public final float mo48368a(float f) {
        if (this.f38837c != 0) {
            Collections.sort(this.f38835a, f38834h);
            this.f38837c = 0;
        }
        float f2 = ((float) this.f38839e) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f38835a.size(); i2++) {
            zzxa zzxa = (zzxa) this.f38835a.get(i2);
            i += zzxa.f38831b;
            if (((float) i) >= f2) {
                return zzxa.f38832c;
            }
        }
        if (this.f38835a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f38835a;
        return ((zzxa) arrayList.get(arrayList.size() - 1)).f38832c;
    }

    /* renamed from: b */
    public final void mo48369b(int i, float f) {
        zzxa zzxa;
        if (this.f38837c != 1) {
            Collections.sort(this.f38835a, f38833g);
            this.f38837c = 1;
        }
        int i2 = this.f38840f;
        if (i2 > 0) {
            zzxa[] zzxaArr = this.f38836b;
            int i3 = i2 - 1;
            this.f38840f = i3;
            zzxa = zzxaArr[i3];
        } else {
            zzxa = new zzxa((zzwz) null);
        }
        int i4 = this.f38838d;
        this.f38838d = i4 + 1;
        zzxa.f38830a = i4;
        zzxa.f38831b = i;
        zzxa.f38832c = f;
        this.f38835a.add(zzxa);
        this.f38839e += i;
        while (true) {
            int i5 = this.f38839e;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzxa zzxa2 = (zzxa) this.f38835a.get(0);
                int i7 = zzxa2.f38831b;
                if (i7 <= i6) {
                    this.f38839e -= i7;
                    this.f38835a.remove(0);
                    int i8 = this.f38840f;
                    if (i8 < 5) {
                        zzxa[] zzxaArr2 = this.f38836b;
                        this.f38840f = i8 + 1;
                        zzxaArr2[i8] = zzxa2;
                    }
                } else {
                    zzxa2.f38831b = i7 - i6;
                    this.f38839e -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo48370c() {
        this.f38835a.clear();
        this.f38837c = -1;
        this.f38838d = 0;
        this.f38839e = 0;
    }
}
