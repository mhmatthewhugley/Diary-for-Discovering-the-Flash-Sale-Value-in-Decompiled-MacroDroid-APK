package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import p308kb.C13484j;
import p308kb.C13540x;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0 */
/* compiled from: ProtoEnumFlagsUtils.kt */
public final class C14714b0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0$a */
    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class C14715a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63759a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f63760b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f63761c;

        static {
            int[] iArr = new int[C13484j.values().length];
            iArr[C13484j.DECLARATION.ordinal()] = 1;
            iArr[C13484j.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[C13484j.DELEGATION.ordinal()] = 3;
            iArr[C13484j.SYNTHESIZED.ordinal()] = 4;
            f63759a = iArr;
            int[] iArr2 = new int[C13936b.C13937a.values().length];
            iArr2[C13936b.C13937a.DECLARATION.ordinal()] = 1;
            iArr2[C13936b.C13937a.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[C13936b.C13937a.DELEGATION.ordinal()] = 3;
            iArr2[C13936b.C13937a.SYNTHESIZED.ordinal()] = 4;
            f63760b = iArr2;
            int[] iArr3 = new int[C13540x.values().length];
            iArr3[C13540x.INTERNAL.ordinal()] = 1;
            iArr3[C13540x.PRIVATE.ordinal()] = 2;
            iArr3[C13540x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[C13540x.PROTECTED.ordinal()] = 4;
            iArr3[C13540x.PUBLIC.ordinal()] = 5;
            iArr3[C13540x.LOCAL.ordinal()] = 6;
            f63761c = iArr3;
        }
    }

    /* renamed from: a */
    public static final C14141u m91934a(C14711a0 a0Var, C13540x xVar) {
        C13706o.m87929f(a0Var, "<this>");
        switch (xVar == null ? -1 : C14715a.f63761c[xVar.ordinal()]) {
            case 1:
                C14141u uVar = C14127t.f62753d;
                C13706o.m87928e(uVar, "INTERNAL");
                return uVar;
            case 2:
                C14141u uVar2 = C14127t.f62750a;
                C13706o.m87928e(uVar2, "PRIVATE");
                return uVar2;
            case 3:
                C14141u uVar3 = C14127t.f62751b;
                C13706o.m87928e(uVar3, "PRIVATE_TO_THIS");
                return uVar3;
            case 4:
                C14141u uVar4 = C14127t.f62752c;
                C13706o.m87928e(uVar4, "PROTECTED");
                return uVar4;
            case 5:
                C14141u uVar5 = C14127t.f62754e;
                C13706o.m87928e(uVar5, "PUBLIC");
                return uVar5;
            case 6:
                C14141u uVar6 = C14127t.f62755f;
                C13706o.m87928e(uVar6, "LOCAL");
                return uVar6;
            default:
                C14141u uVar7 = C14127t.f62750a;
                C13706o.m87928e(uVar7, "PRIVATE");
                return uVar7;
        }
    }

    /* renamed from: b */
    public static final C13936b.C13937a m91935b(C14711a0 a0Var, C13484j jVar) {
        C13706o.m87929f(a0Var, "<this>");
        int i = jVar == null ? -1 : C14715a.f63759a[jVar.ordinal()];
        if (i == 1) {
            return C13936b.C13937a.DECLARATION;
        }
        if (i == 2) {
            return C13936b.C13937a.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return C13936b.C13937a.DELEGATION;
        }
        if (i != 4) {
            return C13936b.C13937a.DECLARATION;
        }
        return C13936b.C13937a.SYNTHESIZED;
    }
}
