package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcin {

    /* renamed from: a */
    private final Context f28536a;

    /* renamed from: b */
    private final zzciy f28537b;

    /* renamed from: c */
    private final ViewGroup f28538c;

    /* renamed from: d */
    private zzcim f28539d;

    public zzcin(Context context, ViewGroup viewGroup, zzcmp zzcmp) {
        this.f28536a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28538c = viewGroup;
        this.f28537b = zzcmp;
        this.f28539d = null;
    }

    /* renamed from: a */
    public final zzcim mo43687a() {
        return this.f28539d;
    }

    /* renamed from: b */
    public final void mo43688b(int i, int i2, int i3, int i4) {
        Preconditions.m4483f("The underlay may only be modified from the UI thread.");
        zzcim zzcim = this.f28539d;
        if (zzcim != null) {
            zzcim.mo43678n(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public final void mo43689c(int i, int i2, int i3, int i4, int i5, boolean z, zzcix zzcix, @Nullable Integer num) {
        if (this.f28539d == null) {
            zzbjj.m43560a(this.f28537b.mo43758l().mo42682a(), this.f28537b.mo43760n(), "vpr2");
            Context context = this.f28536a;
            zzciy zzciy = this.f28537b;
            zzcim zzcim = new zzcim(context, zzciy, i5, z, zzciy.mo43758l().mo42682a(), zzcix, num);
            this.f28539d = zzcim;
            this.f28538c.addView(zzcim, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            this.f28539d.mo43678n(i, i2, i3, i4);
            this.f28537b.mo43749c0(false);
        }
    }

    /* renamed from: d */
    public final void mo43690d() {
        Preconditions.m4483f("onDestroy must be called from the UI thread.");
        zzcim zzcim = this.f28539d;
        if (zzcim != null) {
            zzcim.mo43685y();
            this.f28538c.removeView(this.f28539d);
            this.f28539d = null;
        }
    }

    /* renamed from: e */
    public final void mo43691e() {
        Preconditions.m4483f("onPause must be called from the UI thread.");
        zzcim zzcim = this.f28539d;
        if (zzcim != null) {
            zzcim.mo43666E();
        }
    }

    /* renamed from: f */
    public final void mo43692f(int i) {
        zzcim zzcim = this.f28539d;
        if (zzcim != null) {
            zzcim.mo43675k(i);
        }
    }
}
