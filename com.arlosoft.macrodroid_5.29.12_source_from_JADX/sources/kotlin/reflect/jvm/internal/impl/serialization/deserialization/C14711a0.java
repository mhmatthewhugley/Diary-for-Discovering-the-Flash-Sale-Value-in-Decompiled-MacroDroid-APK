package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p308kb.C13455c;
import p308kb.C13486k;
import p308kb.C13508q;
import p308kb.C13519s;
import p308kb.C13540x;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 */
/* compiled from: ProtoEnumFlags.kt */
public final class C14711a0 {

    /* renamed from: a */
    public static final C14711a0 f63745a = new C14711a0();

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0$a */
    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class C14712a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63746a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f63747b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f63748c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f63749d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f63750e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f63751f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f63752g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f63753h;

        static {
            int[] iArr = new int[C13486k.values().length];
            iArr[C13486k.FINAL.ordinal()] = 1;
            iArr[C13486k.OPEN.ordinal()] = 2;
            iArr[C13486k.ABSTRACT.ordinal()] = 3;
            iArr[C13486k.SEALED.ordinal()] = 4;
            f63746a = iArr;
            int[] iArr2 = new int[C13945d0.values().length];
            iArr2[C13945d0.FINAL.ordinal()] = 1;
            iArr2[C13945d0.OPEN.ordinal()] = 2;
            iArr2[C13945d0.ABSTRACT.ordinal()] = 3;
            iArr2[C13945d0.SEALED.ordinal()] = 4;
            f63747b = iArr2;
            int[] iArr3 = new int[C13540x.values().length];
            iArr3[C13540x.INTERNAL.ordinal()] = 1;
            iArr3[C13540x.PRIVATE.ordinal()] = 2;
            iArr3[C13540x.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[C13540x.PROTECTED.ordinal()] = 4;
            iArr3[C13540x.PUBLIC.ordinal()] = 5;
            iArr3[C13540x.LOCAL.ordinal()] = 6;
            f63748c = iArr3;
            int[] iArr4 = new int[C13455c.C13458c.values().length];
            iArr4[C13455c.C13458c.CLASS.ordinal()] = 1;
            iArr4[C13455c.C13458c.INTERFACE.ordinal()] = 2;
            iArr4[C13455c.C13458c.ENUM_CLASS.ordinal()] = 3;
            iArr4[C13455c.C13458c.ENUM_ENTRY.ordinal()] = 4;
            iArr4[C13455c.C13458c.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[C13455c.C13458c.OBJECT.ordinal()] = 6;
            iArr4[C13455c.C13458c.COMPANION_OBJECT.ordinal()] = 7;
            f63749d = iArr4;
            int[] iArr5 = new int[C13951f.values().length];
            iArr5[C13951f.CLASS.ordinal()] = 1;
            iArr5[C13951f.INTERFACE.ordinal()] = 2;
            iArr5[C13951f.ENUM_CLASS.ordinal()] = 3;
            iArr5[C13951f.ENUM_ENTRY.ordinal()] = 4;
            iArr5[C13951f.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[C13951f.OBJECT.ordinal()] = 6;
            f63750e = iArr5;
            int[] iArr6 = new int[C13519s.C13522c.values().length];
            iArr6[C13519s.C13522c.IN.ordinal()] = 1;
            iArr6[C13519s.C13522c.OUT.ordinal()] = 2;
            iArr6[C13519s.C13522c.INV.ordinal()] = 3;
            f63751f = iArr6;
            int[] iArr7 = new int[C13508q.C13510b.C13513c.values().length];
            iArr7[C13508q.C13510b.C13513c.IN.ordinal()] = 1;
            iArr7[C13508q.C13510b.C13513c.OUT.ordinal()] = 2;
            iArr7[C13508q.C13510b.C13513c.INV.ordinal()] = 3;
            iArr7[C13508q.C13510b.C13513c.STAR.ordinal()] = 4;
            f63752g = iArr7;
            int[] iArr8 = new int[C14970r1.values().length];
            iArr8[C14970r1.IN_VARIANCE.ordinal()] = 1;
            iArr8[C14970r1.OUT_VARIANCE.ordinal()] = 2;
            iArr8[C14970r1.INVARIANT.ordinal()] = 3;
            f63753h = iArr8;
        }
    }

    private C14711a0() {
    }

    /* renamed from: a */
    public final C13951f mo73839a(C13455c.C13458c cVar) {
        switch (cVar == null ? -1 : C14712a.f63749d[cVar.ordinal()]) {
            case 1:
                return C13951f.CLASS;
            case 2:
                return C13951f.INTERFACE;
            case 3:
                return C13951f.ENUM_CLASS;
            case 4:
                return C13951f.ENUM_ENTRY;
            case 5:
                return C13951f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return C13951f.OBJECT;
            default:
                return C13951f.CLASS;
        }
    }

    /* renamed from: b */
    public final C13945d0 mo73840b(C13486k kVar) {
        int i = kVar == null ? -1 : C14712a.f63746a[kVar.ordinal()];
        if (i == 1) {
            return C13945d0.FINAL;
        }
        if (i == 2) {
            return C13945d0.OPEN;
        }
        if (i == 3) {
            return C13945d0.ABSTRACT;
        }
        if (i != 4) {
            return C13945d0.FINAL;
        }
        return C13945d0.SEALED;
    }

    /* renamed from: c */
    public final C14970r1 mo73841c(C13508q.C13510b.C13513c cVar) {
        C13706o.m87929f(cVar, "projection");
        int i = C14712a.f63752g[cVar.ordinal()];
        if (i == 1) {
            return C14970r1.IN_VARIANCE;
        }
        if (i == 2) {
            return C14970r1.OUT_VARIANCE;
        }
        if (i == 3) {
            return C14970r1.INVARIANT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }

    /* renamed from: d */
    public final C14970r1 mo73842d(C13519s.C13522c cVar) {
        C13706o.m87929f(cVar, "variance");
        int i = C14712a.f63751f[cVar.ordinal()];
        if (i == 1) {
            return C14970r1.IN_VARIANCE;
        }
        if (i == 2) {
            return C14970r1.OUT_VARIANCE;
        }
        if (i == 3) {
            return C14970r1.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
