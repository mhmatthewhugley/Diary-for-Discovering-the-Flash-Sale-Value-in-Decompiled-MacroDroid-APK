package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzftz extends zzfuc implements NavigableMap {

    /* renamed from: s */
    final /* synthetic */ zzfui f36414s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzftz(zzfui zzfui, NavigableMap navigableMap) {
        super(zzfui, navigableMap);
        this.f36414s = zzfui;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f36403f)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo46210c(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36403f)).ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ SortedMap mo46235d() {
        return (NavigableMap) ((SortedMap) this.f36403f);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new zzftz(this.f36414s, ((NavigableMap) ((SortedMap) this.f36403f)).descendingMap());
    }

    /* renamed from: f */
    public final /* synthetic */ SortedSet mo46239f() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f36403f)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo46210c(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f36403f)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo46210c(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36403f)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Map.Entry mo46243g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h = this.f36414s.mo46199h();
        h.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfvj(entry.getKey(), this.f36414s.mo46200i(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final NavigableSet mo46238e() {
        return new zzfua(this.f36414s, (NavigableMap) ((SortedMap) this.f36403f));
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f36403f)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo46210c(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36403f)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f36403f)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo46210c(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f36403f)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo46210c(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f36403f)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo46243g(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo46243g(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzftz(this.f36414s, ((NavigableMap) ((SortedMap) this.f36403f)).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzftz(this.f36414s, ((NavigableMap) ((SortedMap) this.f36403f)).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzftz(this.f36414s, ((NavigableMap) ((SortedMap) this.f36403f)).tailMap(obj, z));
    }
}
