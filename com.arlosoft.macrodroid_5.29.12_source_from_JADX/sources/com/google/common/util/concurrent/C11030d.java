package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.common.util.concurrent.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11030d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Method f53714a;

    /* renamed from: c */
    public final /* synthetic */ Object f53715c;

    /* renamed from: d */
    public final /* synthetic */ Object[] f53716d;

    public /* synthetic */ C11030d(Method method, Object obj, Object[] objArr) {
        this.f53714a = method;
        this.f53715c = obj;
        this.f53716d = objArr;
    }

    public final Object call() {
        return SimpleTimeLimiter.C110221.m74334b(this.f53714a, this.f53715c, this.f53716d);
    }
}
