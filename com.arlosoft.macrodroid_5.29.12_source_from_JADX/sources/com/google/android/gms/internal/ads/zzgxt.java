package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxt implements zzgxi {

    /* renamed from: c */
    private static final zzgxi f37421c = zzgxj.m53647a(Collections.emptySet());

    /* renamed from: a */
    private final List f37422a;

    /* renamed from: b */
    private final List f37423b;

    /* synthetic */ zzgxt(List list, List list2, zzgxr zzgxr) {
        this.f37422a = list;
        this.f37423b = list2;
    }

    /* renamed from: a */
    public static zzgxs m53663a(int i, int i2) {
        return new zzgxs(i, i2, (zzgxr) null);
    }

    /* renamed from: b */
    public final Set zzb() {
        int size = this.f37422a.size();
        ArrayList arrayList = new ArrayList(this.f37423b.size());
        int size2 = this.f37423b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzgxv) this.f37423b.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = zzgxf.m53640a(size);
        int size3 = this.f37422a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = ((zzgxv) this.f37422a.get(i2)).zzb();
            Objects.requireNonNull(zzb);
            a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(next);
                a.add(next);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
