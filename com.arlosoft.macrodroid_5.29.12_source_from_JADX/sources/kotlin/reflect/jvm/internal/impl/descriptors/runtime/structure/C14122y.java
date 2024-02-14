package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C13706o;
import p288ib.C12509w;
import p288ib.C12510x;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.y */
/* compiled from: ReflectJavaRecordComponent.kt */
public final class C14122y extends C14116t implements C12509w {

    /* renamed from: a */
    private final Object f62748a;

    public C14122y(Object obj) {
        C13706o.m87929f(obj, "recordComponent");
        this.f62748a = obj;
    }

    /* renamed from: Q */
    public Member mo72635Q() {
        Method c = C14079a.f62691a.mo72576c(this.f62748a);
        if (c != null) {
            return c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* renamed from: a */
    public boolean mo69009a() {
        return false;
    }

    public C12510x getType() {
        Class<?> d = C14079a.f62691a.mo72577d(this.f62748a);
        if (d != null) {
            return new C14110n(d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
