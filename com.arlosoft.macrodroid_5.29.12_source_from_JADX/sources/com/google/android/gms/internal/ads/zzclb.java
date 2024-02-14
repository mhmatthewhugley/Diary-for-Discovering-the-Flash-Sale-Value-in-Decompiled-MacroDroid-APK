package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzclb implements Releasable {

    /* renamed from: a */
    protected final Context f28830a;

    /* renamed from: c */
    protected final String f28831c;

    /* renamed from: d */
    protected final WeakReference f28832d;

    public zzclb(zzciy zzciy) {
        Context context = zzciy.getContext();
        this.f28830a = context;
        this.f28831c = zzt.m2905r().mo20412z(context, zzciy.mo43759m().f28446a);
        this.f28832d = new WeakReference(zzciy);
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m45658h(zzclb zzclb, String str, Map map) {
        zzciy zzciy = (zzciy) zzclb.f28832d.get();
        if (zzciy != null) {
            zzciy.mo42954y("onPrecacheEvent", map);
        }
    }

    /* renamed from: i */
    public abstract void mo43894i();

    @VisibleForTesting
    /* renamed from: j */
    public final void mo43895j(String str, @Nullable String str2, String str3, @Nullable String str4) {
        zzcgi.f28421b.post(new zzcla(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo43896k(String str, String str2, int i) {
        zzcgi.f28421b.post(new zzcky(this, str, str2, i));
    }

    @VisibleForTesting
    /* renamed from: l */
    public final void mo43897l(String str, String str2, long j) {
        zzcgi.f28421b.post(new zzckz(this, str, str2, j));
    }

    @VisibleForTesting
    /* renamed from: m */
    public final void mo43898m(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcgi.f28421b.post(new zzckx(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    @VisibleForTesting
    /* renamed from: n */
    public final void mo43899n(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = zzcgi.f28421b;
        zzckw zzckw = r0;
        zzckw zzckw2 = new zzckw(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zzckw);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo43900o(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo43901p(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo43902q(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo43903r(int i) {
    }

    public void release() {
    }

    /* renamed from: s */
    public abstract boolean mo43904s(String str);

    /* renamed from: t */
    public boolean mo43905t(String str, String[] strArr) {
        return mo43904s(str);
    }

    /* renamed from: u */
    public boolean mo43906u(String str, String[] strArr, zzckt zzckt) {
        return mo43904s(str);
    }
}
