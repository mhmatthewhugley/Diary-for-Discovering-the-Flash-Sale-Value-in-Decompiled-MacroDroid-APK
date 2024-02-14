package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzclg {

    /* renamed from: a */
    private final ArrayList f28839a = new ArrayList();

    /* renamed from: b */
    private long f28840b;

    zzclg() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo43908a() {
        Iterator it = this.f28839a.iterator();
        while (it.hasNext()) {
            Map b = ((zzazq) it.next()).mo42294b();
            if (b != null) {
                for (Map.Entry entry : b.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f28840b = Math.max(this.f28840b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f28840b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43909b(zzazq zzazq) {
        this.f28839a.add(zzazq);
    }
}
