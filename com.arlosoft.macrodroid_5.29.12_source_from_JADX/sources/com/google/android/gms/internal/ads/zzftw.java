package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzftw implements Iterator {

    /* renamed from: a */
    final Iterator f36405a;

    /* renamed from: c */
    Object f36406c = null;

    /* renamed from: d */
    Collection f36407d = null;

    /* renamed from: f */
    Iterator f36408f = zzfvw.INSTANCE;

    /* renamed from: g */
    final /* synthetic */ zzfui f36409g;

    zzftw(zzfui zzfui) {
        this.f36409g = zzfui;
        this.f36405a = zzfui.f36429f.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f36405a.hasNext() || this.f36408f.hasNext();
    }

    public final Object next() {
        if (!this.f36408f.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f36405a.next();
            this.f36406c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f36407d = collection;
            this.f36408f = collection.iterator();
        }
        return this.f36408f.next();
    }

    public final void remove() {
        this.f36408f.remove();
        Collection collection = this.f36407d;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f36405a.remove();
        }
        zzfui.m51004l(this.f36409g);
    }
}
