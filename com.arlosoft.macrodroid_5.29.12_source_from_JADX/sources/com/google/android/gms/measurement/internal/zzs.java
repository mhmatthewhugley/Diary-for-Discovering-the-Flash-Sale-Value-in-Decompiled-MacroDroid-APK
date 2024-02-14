package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzs {

    /* renamed from: a */
    private final zzfr f47335a;

    public zzs(zzfr zzfr) {
        this.f47335a = zzfr;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo55624a(String str, Bundle bundle) {
        String str2;
        this.f47335a.mo55185B().mo55073e();
        if (!this.f47335a.mo55212m()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f47335a.mo55189F().f46755v.mo55125b(str2);
                this.f47335a.mo55189F().f46756w.mo55121b(this.f47335a.mo55201a().mo21950a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo55625b() {
        String str;
        this.f47335a.mo55185B().mo55073e();
        if (mo55627d()) {
            if (mo55628e()) {
                this.f47335a.mo55189F().f46755v.mo55125b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f47335a.mo55191I().mo55375s("auto", "_cmpx", bundle);
            } else {
                String a = this.f47335a.mo55189F().f46755v.mo55124a();
                if (TextUtils.isEmpty(a)) {
                    this.f47335a.mo55221z().mo55100r().mo55091a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f47335a.mo55189F().f46756w.mo55120a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f47335a.mo55191I().mo55375s(str, "_cmp", (Bundle) pair.second);
                }
                this.f47335a.mo55189F().f46755v.mo55125b((String) null);
            }
            this.f47335a.mo55189F().f46756w.mo55121b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo55626c() {
        if (mo55627d() && mo55628e()) {
            this.f47335a.mo55189F().f46755v.mo55125b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo55627d() {
        return this.f47335a.mo55189F().f46756w.mo55120a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo55628e() {
        if (mo55627d() && this.f47335a.mo55201a().mo21950a() - this.f47335a.mo55189F().f46756w.mo55120a() > this.f47335a.mo55219x().mo54933p((String) null, zzdu.f46588S)) {
            return true;
        }
        return false;
    }
}
