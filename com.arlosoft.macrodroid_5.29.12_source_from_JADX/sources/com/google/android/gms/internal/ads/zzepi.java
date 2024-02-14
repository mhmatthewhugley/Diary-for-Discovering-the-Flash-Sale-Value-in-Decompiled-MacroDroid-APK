package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepi implements zzeve {

    /* renamed from: a */
    private final zzfzq f34641a;

    /* renamed from: b */
    private final zzfzq f34642b;

    /* renamed from: c */
    private final Context f34643c;

    /* renamed from: d */
    private final zzfef f34644d;

    /* renamed from: e */
    private final View f34645e;

    public zzepi(zzfzq zzfzq, zzfzq zzfzq2, Context context, zzfef zzfef, @Nullable ViewGroup viewGroup) {
        this.f34641a = zzfzq;
        this.f34642b = zzfzq2;
        this.f34643c = context;
        this.f34644d = zzfef;
        this.f34645e = viewGroup;
    }

    /* renamed from: c */
    private final List m49429c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f34645e;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzepj mo45425a() throws Exception {
        return new zzepj(this.f34643c, this.f34644d.f35630e, m49429c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzepj mo45426b() throws Exception {
        return new zzepj(this.f34643c, this.f34644d.f35630e, m49429c());
    }

    public final int zza() {
        return 3;
    }

    public final zzfzp zzb() {
        zzbjc.m43542c(this.f34643c);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26865F8)).booleanValue()) {
            return this.f34642b.mo46579F(new zzepg(this));
        }
        return this.f34641a.mo46579F(new zzeph(this));
    }
}
