package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.C13706o;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.n */
/* compiled from: UnsignedType.kt */
public enum C13906n {
    UBYTE(r1),
    USHORT(r1),
    UINT(r1),
    ULONG(r1);
    
    private final C16151b arrayClassId;
    private final C16151b classId;
    private final C16157f typeName;

    private C13906n(C16151b bVar) {
        this.classId = bVar;
        C16157f j = bVar.mo78552j();
        C13706o.m87928e(j, "classId.shortClassName");
        this.typeName = j;
        C16152c h = bVar.mo78549h();
        this.arrayClassId = new C16151b(h, C16157f.m97019i(j.mo78583d() + "Array"));
    }

    /* renamed from: d */
    public final C16151b mo72225d() {
        return this.arrayClassId;
    }

    /* renamed from: e */
    public final C16151b mo72226e() {
        return this.classId;
    }

    /* renamed from: f */
    public final C16157f mo72227f() {
        return this.typeName;
    }
}
