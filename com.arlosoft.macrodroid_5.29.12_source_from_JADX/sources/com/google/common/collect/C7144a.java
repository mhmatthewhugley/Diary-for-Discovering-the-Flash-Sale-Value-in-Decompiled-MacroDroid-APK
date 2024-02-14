package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7144a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f17329a;

    public /* synthetic */ C7144a(Predicate predicate) {
        this.f17329a = predicate;
    }

    public final boolean apply(Object obj) {
        return this.f17329a.apply(Multisets.m28379h(((Map.Entry) obj).getKey(), ((Collection) ((Map.Entry) obj).getValue()).size()));
    }
}
