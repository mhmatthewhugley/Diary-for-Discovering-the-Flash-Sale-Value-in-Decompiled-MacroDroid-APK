package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfud extends zzfty implements SortedSet {

    /* renamed from: d */
    final /* synthetic */ zzfui f36418d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfud(zzfui zzfui, SortedMap sortedMap) {
        super(zzfui, sortedMap);
        this.f36418d = zzfui;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SortedMap mo46259c() {
        return (SortedMap) this.f36493a;
    }

    public final Comparator comparator() {
        return mo46259c().comparator();
    }

    public final Object first() {
        return mo46259c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfud(this.f36418d, mo46259c().headMap(obj));
    }

    public final Object last() {
        return mo46259c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfud(this.f36418d, mo46259c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfud(this.f36418d, mo46259c().tailMap(obj));
    }
}
