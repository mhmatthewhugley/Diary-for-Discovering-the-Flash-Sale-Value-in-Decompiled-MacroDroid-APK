package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14092f;
import p288ib.C12488e;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C14098j extends C14092f implements C12488e {

    /* renamed from: c */
    private final Object[] f62723c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14098j(C16157f fVar, Object[] objArr) {
        super(fVar, (C13695i) null);
        C13706o.m87929f(objArr, "values");
        this.f62723c = objArr;
    }

    public List<C14092f> getElements() {
        Object[] objArr = this.f62723c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C14092f.C14093a aVar = C14092f.f62720b;
            C13706o.m87926c(obj);
            arrayList.add(aVar.mo72613a(obj, (C16157f) null));
        }
        return arrayList;
    }
}
