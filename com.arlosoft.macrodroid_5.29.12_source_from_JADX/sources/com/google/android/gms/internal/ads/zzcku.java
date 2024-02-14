package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcku implements Iterable {

    /* renamed from: a */
    private final List f28789a = new ArrayList();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public final zzckt mo43883c(zzciy zzciy) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzckt zzckt = (zzckt) it.next();
            if (zzckt.f28785c == zzciy) {
                return zzckt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo43884d(zzckt zzckt) {
        this.f28789a.add(zzckt);
    }

    /* renamed from: f */
    public final void mo43885f(zzckt zzckt) {
        this.f28789a.remove(zzckt);
    }

    /* renamed from: h */
    public final boolean mo43886h(zzciy zzciy) {
        ArrayList<zzckt> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzckt zzckt = (zzckt) it.next();
            if (zzckt.f28785c == zzciy) {
                arrayList.add(zzckt);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzckt zzckt2 : arrayList) {
            zzckt2.f28786d.mo43894i();
        }
        return true;
    }

    public final Iterator iterator() {
        return this.f28789a.iterator();
    }
}
