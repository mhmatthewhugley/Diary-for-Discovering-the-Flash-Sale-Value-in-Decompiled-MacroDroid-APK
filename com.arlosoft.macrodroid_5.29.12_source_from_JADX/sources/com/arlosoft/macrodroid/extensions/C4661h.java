package com.arlosoft.macrodroid.extensions;

import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.extensions.h */
/* compiled from: ArrayListExtensions.kt.kt */
public final class C4661h<T> extends ArrayList<T> {
    private final int maxSize;

    public C4661h(int i) {
        this.maxSize = i;
    }

    public boolean add(T t) {
        if (size() == this.maxSize) {
            remove(0);
        }
        return super.add(t);
    }

    /* renamed from: c */
    public /* bridge */ int mo29108c() {
        return super.size();
    }

    /* renamed from: d */
    public /* bridge */ Object mo29109d(int i) {
        return super.remove(i);
    }

    public final /* bridge */ T remove(int i) {
        return mo29109d(i);
    }

    public final /* bridge */ int size() {
        return mo29108c();
    }
}
