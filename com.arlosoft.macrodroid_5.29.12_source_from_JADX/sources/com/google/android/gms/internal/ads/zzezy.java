package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzezy implements zzfyn {

    /* renamed from: a */
    public final /* synthetic */ zzfaa f35296a;

    /* renamed from: b */
    public final /* synthetic */ zzffz f35297b;

    /* renamed from: c */
    public final /* synthetic */ zzdah f35298c;

    public /* synthetic */ zzezy(zzfaa zzfaa, zzffz zzffz, zzdah zzdah) {
        this.f35296a = zzfaa;
        this.f35297b = zzffz;
        this.f35298c = zzdah;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) {
        zzffz zzffz = this.f35297b;
        zzdah zzdah = this.f35298c;
        zzfdw zzfdw = (zzfdw) obj;
        zzffz.f35729b = zzfdw;
        Iterator it = zzfdw.f35590b.f35586a.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfdk) it.next()).f35519a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return zzdah.mo44530h(zzfzg.m51414i(zzfdw));
            }
        }
        return zzfzg.m51414i((Object) null);
    }
}
