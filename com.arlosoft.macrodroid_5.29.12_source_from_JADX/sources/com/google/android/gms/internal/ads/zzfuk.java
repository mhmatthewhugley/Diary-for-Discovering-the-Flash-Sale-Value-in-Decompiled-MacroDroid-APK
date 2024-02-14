package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfuk extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ zzful f36431a;

    zzfuk(zzful zzful) {
        this.f36431a = zzful;
    }

    public final void clear() {
        this.f36431a.mo46323q();
    }

    public final boolean contains(Object obj) {
        for (Collection contains : this.f36431a.mo46341u().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f36431a.mo46318c();
    }

    public final int size() {
        return this.f36431a.mo46320e();
    }
}
