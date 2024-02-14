package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfyo extends zzfyq {
    zzfyo(zzfvi zzfvi, boolean z) {
        super(zzfvi, true);
        mo46594Q();
    }

    /* renamed from: U */
    public final /* bridge */ /* synthetic */ Object mo46603U(List list) {
        ArrayList a = zzfwb.m51179a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfyp zzfyp = (zzfyp) it.next();
            a.add(zzfyp != null ? zzfyp.f36594a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
