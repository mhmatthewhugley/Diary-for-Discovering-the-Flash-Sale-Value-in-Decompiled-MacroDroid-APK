package p308kb;

import kotlin.reflect.jvm.internal.impl.protobuf.C14503i;

/* renamed from: kb.j */
/* compiled from: ProtoBuf */
public enum C13484j implements C14503i.C14504a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: g */
    private static C14503i.C14505b<C13484j> f61658g;
    private final int value;

    /* renamed from: kb.j$a */
    /* compiled from: ProtoBuf */
    static class C13485a implements C14503i.C14505b<C13484j> {
        C13485a() {
        }

        /* renamed from: b */
        public C13484j mo71085a(int i) {
            return C13484j.m86580b(i);
        }
    }

    static {
        f61658g = new C13485a();
    }

    private C13484j(int i, int i2) {
        this.value = i2;
    }

    /* renamed from: b */
    public static C13484j m86580b(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    /* renamed from: c */
    public final int mo71084c() {
        return this.value;
    }
}
