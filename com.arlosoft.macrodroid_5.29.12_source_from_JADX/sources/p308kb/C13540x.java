package p308kb;

import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;

/* renamed from: kb.x */
/* compiled from: ProtoBuf */
public enum C13540x implements C14503i.C14504a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: p */
    private static C14503i.C14505b<C13540x> f61815p;
    private final int value;

    /* renamed from: kb.x$a */
    /* compiled from: ProtoBuf */
    static class C13541a implements C14503i.C14505b<C13540x> {
        C13541a() {
        }

        /* renamed from: b */
        public C13540x mo71085a(int i) {
            return C13540x.m87339b(i);
        }
    }

    static {
        f61815p = new C13541a();
    }

    private C13540x(int i, int i2) {
        this.value = i2;
    }

    /* renamed from: b */
    public static C13540x m87339b(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    /* renamed from: c */
    public final int mo71084c() {
        return this.value;
    }
}
