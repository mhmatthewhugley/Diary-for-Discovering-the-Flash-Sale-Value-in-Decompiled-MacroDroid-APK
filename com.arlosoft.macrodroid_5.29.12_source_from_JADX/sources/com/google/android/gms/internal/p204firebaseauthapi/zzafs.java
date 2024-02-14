package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzafs extends AbstractList implements RandomAccess, zzads {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzads f39848a;

    public zzafs(zzads zzads) {
        this.f39848a = zzads;
    }

    /* renamed from: V0 */
    public final void mo49107V0(zzacc zzacc) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final zzads mo49108b() {
        return this;
    }

    /* renamed from: e */
    public final List mo49110e() {
        return this.f39848a.mo49110e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzadr) this.f39848a).get(i);
    }

    public final Iterator iterator() {
        return new zzafr(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzafq(this, i);
    }

    public final int size() {
        return this.f39848a.size();
    }

    /* renamed from: y */
    public final Object mo49113y(int i) {
        return this.f39848a.mo49113y(i);
    }
}
