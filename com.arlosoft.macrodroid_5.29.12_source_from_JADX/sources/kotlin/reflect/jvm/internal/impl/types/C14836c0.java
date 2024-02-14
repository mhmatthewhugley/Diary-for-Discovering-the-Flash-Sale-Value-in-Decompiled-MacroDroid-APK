package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.c0 */
/* compiled from: TypeSubstitution.kt */
public final class C14836c0 extends C14936j1 {

    /* renamed from: c */
    private final C13950e1[] f63962c;

    /* renamed from: d */
    private final C14926g1[] f63963d;

    /* renamed from: e */
    private final boolean f63964e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14836c0(C13950e1[] e1VarArr, C14926g1[] g1VarArr, boolean z, int i, C13695i iVar) {
        this(e1VarArr, g1VarArr, (i & 4) != 0 ? false : z);
    }

    /* renamed from: b */
    public boolean mo73714b() {
        return this.f63964e;
    }

    /* renamed from: e */
    public C14926g1 mo72941e(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "key");
        C13961h c = e0Var.mo73702N0().mo62183c();
        C13950e1 e1Var = c instanceof C13950e1 ? (C13950e1) c : null;
        if (e1Var == null) {
            return null;
        }
        int i = e1Var.mo72272i();
        C13950e1[] e1VarArr = this.f63962c;
        if (i >= e1VarArr.length || !C13706o.m87924a(e1VarArr[i].mo62171j(), e1Var.mo62171j())) {
            return null;
        }
        return this.f63963d[i];
    }

    /* renamed from: f */
    public boolean mo72942f() {
        return this.f63963d.length == 0;
    }

    /* renamed from: i */
    public final C14926g1[] mo74056i() {
        return this.f63963d;
    }

    /* renamed from: j */
    public final C13950e1[] mo74057j() {
        return this.f63962c;
    }

    public C14836c0(C13950e1[] e1VarArr, C14926g1[] g1VarArr, boolean z) {
        C13706o.m87929f(e1VarArr, "parameters");
        C13706o.m87929f(g1VarArr, "arguments");
        this.f63962c = e1VarArr;
        this.f63963d = g1VarArr;
        this.f63964e = z;
        int length = e1VarArr.length;
        int length2 = g1VarArr.length;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14836c0(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.C13950e1> r9, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.C14926g1> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.C13950e1[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.C13706o.m87927d(r9, r1)
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1[]) r3
            kotlin.reflect.jvm.internal.impl.types.g1[] r9 = new kotlin.reflect.jvm.internal.impl.types.C14926g1[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            kotlin.jvm.internal.C13706o.m87927d(r9, r1)
            r4 = r9
            kotlin.reflect.jvm.internal.impl.types.g1[] r4 = (kotlin.reflect.jvm.internal.impl.types.C14926g1[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14836c0.<init>(java.util.List, java.util.List):void");
    }
}
