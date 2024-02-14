package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgi;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdSize {
    @NonNull

    /* renamed from: i */
    public static final AdSize f1675i = new AdSize(320, 50, "320x50_mb");
    @NonNull

    /* renamed from: j */
    public static final AdSize f1676j = new AdSize(468, 60, "468x60_as");
    @NonNull

    /* renamed from: k */
    public static final AdSize f1677k = new AdSize(320, 100, "320x100_as");
    @NonNull

    /* renamed from: l */
    public static final AdSize f1678l = new AdSize(728, 90, "728x90_as");
    @NonNull

    /* renamed from: m */
    public static final AdSize f1679m = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    @NonNull

    /* renamed from: n */
    public static final AdSize f1680n = new AdSize(160, 600, "160x600_as");
    @NonNull
    @Deprecated

    /* renamed from: o */
    public static final AdSize f1681o = new AdSize(-1, -2, "smart_banner");
    @NonNull

    /* renamed from: p */
    public static final AdSize f1682p = new AdSize(-3, -4, "fluid");
    @NonNull

    /* renamed from: q */
    public static final AdSize f1683q = new AdSize(0, 0, "invalid");
    @NonNull

    /* renamed from: r */
    public static final AdSize f1684r = new AdSize(-3, 0, "search_v2");
    @NonNull

    /* renamed from: s */
    public static final AdSize f1685s = new AdSize(50, 50, "50x50_mb");

    /* renamed from: a */
    private final int f1686a;

    /* renamed from: b */
    private final int f1687b;

    /* renamed from: c */
    private final String f1688c;

    /* renamed from: d */
    private boolean f1689d;

    /* renamed from: e */
    private boolean f1690e;

    /* renamed from: f */
    private int f1691f;

    /* renamed from: g */
    private boolean f1692g;

    /* renamed from: h */
    private int f1693h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdSize(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        L_0x000a:
            r1 = -2
            if (r5 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    /* renamed from: a */
    public int mo19678a() {
        return this.f1687b;
    }

    /* renamed from: b */
    public int mo19679b(@NonNull Context context) {
        int i = this.f1687b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzq.m2417l2(context.getResources().getDisplayMetrics());
        }
        zzaw.m1917b();
        return zzcgi.m45187w(context, this.f1687b);
    }

    /* renamed from: c */
    public int mo19680c() {
        return this.f1686a;
    }

    /* renamed from: d */
    public int mo19681d(@NonNull Context context) {
        int i = this.f1686a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            zzaw.m1917b();
            return zzcgi.m45187w(context, this.f1686a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* renamed from: e */
    public boolean mo19682e() {
        return this.f1687b == -2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f1686a == adSize.f1686a && this.f1687b == adSize.f1687b && this.f1688c.equals(adSize.f1688c);
    }

    /* renamed from: f */
    public boolean mo19684f() {
        return this.f1686a == -3 && this.f1687b == -4;
    }

    /* renamed from: g */
    public boolean mo19685g() {
        return this.f1686a == -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo19686h() {
        return this.f1693h;
    }

    public int hashCode() {
        return this.f1688c.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo19688i() {
        return this.f1691f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo19689j(int i) {
        this.f1691f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo19690k(int i) {
        this.f1693h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo19691l(boolean z) {
        this.f1690e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo19692m(boolean z) {
        this.f1692g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo19693n() {
        return this.f1689d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo19694o() {
        return this.f1690e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo19695p() {
        return this.f1692g;
    }

    @NonNull
    public String toString() {
        return this.f1688c;
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f1686a = i;
            this.f1687b = i2;
            this.f1688c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }
}
