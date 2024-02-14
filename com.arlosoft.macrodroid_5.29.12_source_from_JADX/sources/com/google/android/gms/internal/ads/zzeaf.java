package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeaf {

    /* renamed from: a */
    private final zzdzs f33534a;

    /* renamed from: b */
    private final zzdvi f33535b;

    /* renamed from: c */
    private final Object f33536c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private final List f33537d;
    @GuardedBy("lock")

    /* renamed from: e */
    private boolean f33538e;

    zzeaf(zzdzs zzdzs, zzdvi zzdvi) {
        this.f33534a = zzdzs;
        this.f33535b = zzdvi;
        this.f33537d = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m48492d(List list) {
        String str;
        boolean z;
        synchronized (this.f33536c) {
            if (!this.f33538e) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbrq zzbrq = (zzbrq) it.next();
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27051Y7)).booleanValue()) {
                        zzdvh a = this.f33535b.mo45010a(zzbrq.f27690a);
                        if (a != null) {
                            zzbxq zzbxq = a.f33216c;
                            if (zzbxq != null) {
                                str = zzbxq.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27060Z7)).booleanValue()) {
                        zzdvh a2 = this.f33535b.mo45010a(zzbrq.f27690a);
                        if (a2 != null) {
                            if (a2.f33217d) {
                                z = true;
                                List list2 = this.f33537d;
                                String str3 = zzbrq.f27690a;
                                String c = this.f33535b.mo45012c(str3);
                                boolean z2 = zzbrq.f27691c;
                                list2.add(new zzeae(str3, str2, c, z2 ? 1 : 0, zzbrq.f27693f, zzbrq.f27692d, z));
                            }
                        }
                    }
                    z = false;
                    List list22 = this.f33537d;
                    String str32 = zzbrq.f27690a;
                    String c2 = this.f33535b.mo45012c(str32);
                    boolean z22 = zzbrq.f27691c;
                    list22.add(new zzeae(str32, str2, c2, z22 ? 1 : 0, zzbrq.f27693f, zzbrq.f27692d, z));
                }
                this.f33538e = true;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo45120a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f33536c) {
            if (!this.f33538e) {
                if (this.f33534a.mo45106t()) {
                    m48492d(this.f33534a.mo45097g());
                } else {
                    mo45121c();
                    return jSONArray;
                }
            }
            for (zzeae a : this.f33537d) {
                jSONArray.put(a.mo45119a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void mo45121c() {
        this.f33534a.mo45105s(new zzead(this));
    }
}
