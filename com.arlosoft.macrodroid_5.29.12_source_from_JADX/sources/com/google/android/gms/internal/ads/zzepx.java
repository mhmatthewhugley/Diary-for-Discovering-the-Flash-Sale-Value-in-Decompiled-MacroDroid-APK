package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepx implements zzeve {

    /* renamed from: a */
    private final zzeve f34675a;

    /* renamed from: b */
    private final zzfef f34676b;

    /* renamed from: c */
    private final Context f34677c;

    /* renamed from: d */
    private final zzcfy f34678d;

    public zzepx(zzero zzero, zzfef zzfef, Context context, zzcfy zzcfy) {
        this.f34675a = zzero;
        this.f34676b = zzfef;
        this.f34677c = context;
        this.f34678d = zzcfy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzepy mo45429a(zzevj zzevj) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        zzq zzq = this.f34676b.f35630e;
        zzq[] zzqArr = zzq.f2031p;
        if (zzqArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzq zzq2 : zzqArr) {
                boolean z4 = zzq2.f2033z;
                if (!z4 && !z2) {
                    str = zzq2.f2025a;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzq.f2025a;
            z = zzq.f2033z;
        }
        Resources resources = this.f34677c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f34678d.mo43494h().mo20377k();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqArr2 = zzq.f2031p;
        if (zzqArr2 != null) {
            boolean z5 = false;
            for (zzq zzq3 : zzqArr2) {
                if (zzq3.f2033z) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzq3.f2029g;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (((float) zzq3.f2030o) / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzq3.f2026c;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (((float) zzq3.f2027d) / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzepy(zzq, str, z, sb.toString(), f, i2, i, str2, this.f34676b.f35641p);
    }

    public final int zza() {
        return 7;
    }

    public final zzfzp zzb() {
        return zzfzg.m51418m(this.f34675a.zzb(), new zzepw(this), zzchc.f28461f);
    }
}
