package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfiw {

    /* renamed from: a */
    private final Clock f35861a;

    /* renamed from: b */
    private final Map f35862b = new HashMap();

    /* renamed from: c */
    private final Map f35863c = new HashMap();

    public zzfiw(Clock clock) {
        this.f35861a = clock;
    }

    /* renamed from: d */
    private final void m50242d(String str, String str2) {
        if (!this.f35862b.containsKey(str)) {
            this.f35862b.put(str, new ArrayList());
        }
        ((List) this.f35862b.get(str)).add(str2);
    }

    /* renamed from: a */
    public final List mo45787a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f35862b.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String zzfiv : (List) entry.getValue()) {
                    i++;
                    arrayList.add(new zzfiv(((String) entry.getKey()) + "." + i, zzfiv));
                }
            } else {
                arrayList.add(new zzfiv((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo45788b(String str) {
        if (this.f35863c.containsKey(str)) {
            long c = this.f35861a.mo21952c();
            long longValue = ((Long) this.f35863c.remove(str)).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(c - longValue);
            m50242d(str, sb.toString());
            return;
        }
        this.f35863c.put(str, Long.valueOf(this.f35861a.mo21952c()));
    }

    /* renamed from: c */
    public final void mo45789c(String str, String str2) {
        if (this.f35863c.containsKey(str)) {
            long c = this.f35861a.mo21952c();
            long longValue = ((Long) this.f35863c.remove(str)).longValue();
            m50242d(str, str2 + (c - longValue));
            return;
        }
        this.f35863c.put(str, Long.valueOf(this.f35861a.mo21952c()));
    }
}
