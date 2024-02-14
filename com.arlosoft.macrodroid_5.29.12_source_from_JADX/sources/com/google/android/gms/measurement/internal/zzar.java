package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzar {

    /* renamed from: a */
    final String f46459a;

    /* renamed from: b */
    final String f46460b;

    /* renamed from: c */
    final String f46461c;

    /* renamed from: d */
    final long f46462d;

    /* renamed from: e */
    final long f46463e;

    /* renamed from: f */
    final zzau f46464f;

    zzar(zzfr zzfr, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        Preconditions.m4484g(str2);
        Preconditions.m4484g(str3);
        this.f46459a = str2;
        this.f46460b = str3;
        this.f46461c = true == TextUtils.isEmpty(str) ? null : str;
        this.f46462d = j;
        this.f46463e = j2;
        if (j2 != 0 && j2 > j) {
            zzfr.mo55221z().mo55103u().mo55092b("Event created with reverse previous/current timestamps. appId", zzeh.m65566x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    zzfr.mo55221z().mo55098p().mo55091a("Param name can't be null");
                    it.remove();
                } else {
                    Object m = zzfr.mo55196N().mo55599m(str4, bundle2.get(str4));
                    if (m == null) {
                        zzfr.mo55221z().mo55103u().mo55092b("Param value can't be null", zzfr.mo55187D().mo55088e(str4));
                        it.remove();
                    } else {
                        zzfr.mo55196N().mo55574C(bundle2, str4, m);
                    }
                }
            }
            zzau = new zzau(bundle2);
        }
        this.f46464f = zzau;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzar mo55006a(zzfr zzfr, long j) {
        return new zzar(zzfr, this.f46461c, this.f46459a, this.f46460b, this.f46462d, j, this.f46464f);
    }

    public final String toString() {
        String str = this.f46459a;
        String str2 = this.f46460b;
        String obj = this.f46464f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    private zzar(zzfr zzfr, String str, String str2, String str3, long j, long j2, zzau zzau) {
        Preconditions.m4484g(str2);
        Preconditions.m4484g(str3);
        Preconditions.m4488k(zzau);
        this.f46459a = str2;
        this.f46460b = str3;
        this.f46461c = true == TextUtils.isEmpty(str) ? null : str;
        this.f46462d = j;
        this.f46463e = j2;
        if (j2 != 0 && j2 > j) {
            zzfr.mo55221z().mo55103u().mo55093c("Event created with reverse previous/current timestamps. appId, name", zzeh.m65566x(str2), zzeh.m65566x(str3));
        }
        this.f46464f = zzau;
    }
}
