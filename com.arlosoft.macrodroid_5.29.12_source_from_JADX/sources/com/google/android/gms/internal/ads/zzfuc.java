package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfuc extends zzftv implements SortedMap {

    /* renamed from: o */
    SortedSet f36416o;

    /* renamed from: p */
    final /* synthetic */ zzfui f36417p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfuc(zzfui zzfui, SortedMap sortedMap) {
        super(zzfui, sortedMap);
        this.f36417p = zzfui;
    }

    public final Comparator comparator() {
        return mo46235d().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedMap mo46235d() {
        return (SortedMap) this.f36403f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public SortedSet mo46232b() {
        return new zzfud(this.f36417p, mo46235d());
    }

    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f36416o;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e = mo46232b();
        this.f36416o = e;
        return e;
    }

    public final Object firstKey() {
        return mo46235d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfuc(this.f36417p, mo46235d().headMap(obj));
    }

    public final Object lastKey() {
        return mo46235d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfuc(this.f36417p, mo46235d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfuc(this.f36417p, mo46235d().tailMap(obj));
    }
}
