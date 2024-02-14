package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.c */
/* compiled from: MemberScope.kt */
public abstract class C14680c {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.c$a */
    /* compiled from: MemberScope.kt */
    public static final class C14681a extends C14680c {

        /* renamed from: a */
        public static final C14681a f63684a = new C14681a();

        /* renamed from: b */
        private static final int f63685b;

        static {
            C14683d.C14684a aVar = C14683d.f63687c;
            f63685b = (~(aVar.mo73814i() | aVar.mo73809d())) & aVar.mo73807b();
        }

        private C14681a() {
        }

        /* renamed from: a */
        public int mo73798a() {
            return f63685b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.c$b */
    /* compiled from: MemberScope.kt */
    public static final class C14682b extends C14680c {

        /* renamed from: a */
        public static final C14682b f63686a = new C14682b();

        private C14682b() {
        }

        /* renamed from: a */
        public int mo73798a() {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract int mo73798a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
