package p308kb;

import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;

/* renamed from: kb.k */
/* compiled from: ProtoBuf */
public enum C13486k implements C14503i.C14504a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: g */
    private static C14503i.C14505b<C13486k> f61664g;
    private final int value;

    /* renamed from: kb.k$a */
    /* compiled from: ProtoBuf */
    static class C13487a implements C14503i.C14505b<C13486k> {
        C13487a() {
        }

        /* renamed from: b */
        public C13486k mo71085a(int i) {
            return C13486k.m86584b(i);
        }
    }

    static {
        f61664g = new C13487a();
    }

    private C13486k(int i, int i2) {
        this.value = i2;
    }

    /* renamed from: b */
    public static C13486k m86584b(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    /* renamed from: c */
    public final int mo71084c() {
        return this.value;
    }
}
