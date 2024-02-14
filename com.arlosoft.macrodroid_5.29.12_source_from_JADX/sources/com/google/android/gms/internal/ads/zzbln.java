package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbln extends zzblv {

    /* renamed from: A */
    static final int f27508A = Color.rgb(204, 204, 204);

    /* renamed from: B */
    static final int f27509B;

    /* renamed from: z */
    private static final int f27510z;

    /* renamed from: a */
    private final String f27511a;

    /* renamed from: c */
    private final List f27512c = new ArrayList();

    /* renamed from: d */
    private final List f27513d = new ArrayList();

    /* renamed from: f */
    private final int f27514f;

    /* renamed from: g */
    private final int f27515g;

    /* renamed from: o */
    private final int f27516o;

    /* renamed from: p */
    private final int f27517p;

    /* renamed from: s */
    private final int f27518s;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f27510z = rgb;
        f27509B = rgb;
    }

    public zzbln(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.f27511a = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzblq zzblq = (zzblq) list.get(i5);
            this.f27512c.add(zzblq);
            this.f27513d.add(zzblq);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = f27508A;
        }
        this.f27514f = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = f27509B;
        }
        this.f27515g = i4;
        this.f27516o = num3 != null ? num3.intValue() : 12;
        this.f27517p = i;
        this.f27518s = i2;
    }

    /* renamed from: Kb */
    public final int mo42732Kb() {
        return this.f27516o;
    }

    /* renamed from: Lb */
    public final List mo42733Lb() {
        return this.f27512c;
    }

    /* renamed from: a */
    public final int mo42734a() {
        return this.f27518s;
    }

    /* renamed from: b */
    public final int mo42735b() {
        return this.f27515g;
    }

    /* renamed from: d */
    public final int mo42736d() {
        return this.f27514f;
    }

    /* renamed from: e */
    public final List mo42737e() {
        return this.f27513d;
    }

    /* renamed from: f */
    public final String mo42738f() {
        return this.f27511a;
    }

    public final int zzb() {
        return this.f27517p;
    }
}
