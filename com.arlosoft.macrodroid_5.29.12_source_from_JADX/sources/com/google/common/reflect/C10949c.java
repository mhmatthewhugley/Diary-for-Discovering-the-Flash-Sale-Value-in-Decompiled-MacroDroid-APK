package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.Types;
import java.lang.reflect.Type;

/* renamed from: com.google.common.reflect.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10949c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Types.JavaVersion f53339a;

    public /* synthetic */ C10949c(Types.JavaVersion javaVersion) {
        this.f53339a = javaVersion;
    }

    public final Object apply(Object obj) {
        return this.f53339a.mo61521f((Type) obj);
    }
}
