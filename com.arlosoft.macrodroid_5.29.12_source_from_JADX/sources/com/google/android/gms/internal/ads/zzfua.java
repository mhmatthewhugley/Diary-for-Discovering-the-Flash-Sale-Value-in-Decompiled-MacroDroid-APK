package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfua extends zzfud implements NavigableSet {

    /* renamed from: f */
    final /* synthetic */ zzfui f36415f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfua(zzfui zzfui, NavigableMap navigableMap) {
        super(zzfui, navigableMap);
        this.f36415f = zzfui;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ SortedMap mo46259c() {
        return (NavigableMap) ((SortedMap) this.f36493a);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36493a)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new zzfua(this.f36415f, ((NavigableMap) ((SortedMap) this.f36493a)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36493a)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36493a)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36493a)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return zzfvx.m51175a(iterator());
    }

    public final Object pollLast() {
        return zzfvx.m51175a(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzfua(this.f36415f, ((NavigableMap) ((SortedMap) this.f36493a)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfua(this.f36415f, ((NavigableMap) ((SortedMap) this.f36493a)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzfua(this.f36415f, ((NavigableMap) ((SortedMap) this.f36493a)).tailMap(obj, z));
    }
}
