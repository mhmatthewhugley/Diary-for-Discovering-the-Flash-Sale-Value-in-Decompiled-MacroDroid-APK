package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7145b implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Comparator f17330a;

    public /* synthetic */ C7145b(Comparator comparator) {
        this.f17330a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f17330a.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
    }
}
