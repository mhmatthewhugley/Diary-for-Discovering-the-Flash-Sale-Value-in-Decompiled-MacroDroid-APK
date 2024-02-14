package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.C13706o;
import p362pb.C16151b;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.m */
/* compiled from: UnsignedType.kt */
public enum C13905m {
    UBYTEARRAY(r1),
    USHORTARRAY(r1),
    UINTARRAY(r1),
    ULONGARRAY(r1);
    
    private final C16151b classId;
    private final C16157f typeName;

    private C13905m(C16151b bVar) {
        this.classId = bVar;
        C16157f j = bVar.mo78552j();
        C13706o.m87928e(j, "classId.shortClassName");
        this.typeName = j;
    }

    /* renamed from: d */
    public final C16157f mo72224d() {
        return this.typeName;
    }
}
