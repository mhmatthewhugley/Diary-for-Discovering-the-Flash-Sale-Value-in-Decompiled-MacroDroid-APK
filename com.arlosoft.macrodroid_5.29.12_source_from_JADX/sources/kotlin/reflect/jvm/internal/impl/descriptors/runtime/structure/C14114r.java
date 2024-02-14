package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14123z;
import p288ib.C12499n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r */
/* compiled from: ReflectJavaField.kt */
public final class C14114r extends C14116t implements C12499n {

    /* renamed from: a */
    private final Field f62741a;

    public C14114r(Field field) {
        C13706o.m87929f(field, "member");
        this.f62741a = field;
    }

    /* renamed from: E */
    public boolean mo68991E() {
        return mo72635Q().isEnumConstant();
    }

    /* renamed from: L */
    public boolean mo68992L() {
        return false;
    }

    /* renamed from: S */
    public Field mo72635Q() {
        return this.f62741a;
    }

    /* renamed from: T */
    public C14123z getType() {
        C14123z.C14124a aVar = C14123z.f62749a;
        Type genericType = mo72635Q().getGenericType();
        C13706o.m87928e(genericType, "member.genericType");
        return aVar.mo72656a(genericType);
    }
}
