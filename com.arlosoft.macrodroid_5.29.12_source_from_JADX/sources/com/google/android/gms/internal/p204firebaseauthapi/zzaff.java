package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaff */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaff implements Iterator {

    /* renamed from: a */
    private int f39826a = -1;

    /* renamed from: c */
    private boolean f39827c;

    /* renamed from: d */
    private Iterator f39828d;

    /* renamed from: f */
    final /* synthetic */ zzafj f39829f;

    /* synthetic */ zzaff(zzafj zzafj, zzafe zzafe) {
        this.f39829f = zzafj;
    }

    /* renamed from: a */
    private final Iterator m56728a() {
        if (this.f39828d == null) {
            this.f39828d = this.f39829f.f39833d.entrySet().iterator();
        }
        return this.f39828d;
    }

    public final boolean hasNext() {
        if (this.f39826a + 1 >= this.f39829f.f39832c.size()) {
            return !this.f39829f.f39833d.isEmpty() && m56728a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f39827c = true;
        int i = this.f39826a + 1;
        this.f39826a = i;
        if (i < this.f39829f.f39832c.size()) {
            return (Map.Entry) this.f39829f.f39832c.get(this.f39826a);
        }
        return (Map.Entry) m56728a().next();
    }

    public final void remove() {
        if (this.f39827c) {
            this.f39827c = false;
            this.f39829f.m56736n();
            if (this.f39826a < this.f39829f.f39832c.size()) {
                zzafj zzafj = this.f39829f;
                int i = this.f39826a;
                this.f39826a = i - 1;
                Object unused = zzafj.m56734l(i);
                return;
            }
            m56728a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
