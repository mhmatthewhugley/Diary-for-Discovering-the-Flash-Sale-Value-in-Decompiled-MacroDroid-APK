package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcop {

    /* renamed from: a */
    private final zzcgv f29160a;

    /* renamed from: b */
    private final Context f29161b;

    /* renamed from: c */
    private final WeakReference f29162c;

    /* synthetic */ zzcop(zzcon zzcon, zzcoo zzcoo) {
        this.f29160a = zzcon.f29157a;
        this.f29161b = zzcon.f29158b;
        this.f29162c = zzcon.f29159c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo44219a() {
        return this.f29161b;
    }

    /* renamed from: b */
    public final zzape mo44220b() {
        return new zzape(new zzi(this.f29161b, this.f29160a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzbll mo44221c() {
        return new zzbll(this.f29161b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzcgv mo44222d() {
        return this.f29160a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo44223e() {
        return zzt.m2905r().mo20412z(this.f29161b, this.f29160a.f28446a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final WeakReference mo44224f() {
        return this.f29162c;
    }
}
