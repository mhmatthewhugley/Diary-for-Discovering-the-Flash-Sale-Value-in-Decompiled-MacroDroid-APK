package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import p297ja.C13339u;
import p450zb.C17085h;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.k */
/* compiled from: constantValues.kt */
public abstract class C14623k extends C14617g<C13339u> {

    /* renamed from: b */
    public static final C14624a f63621b = new C14624a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.k$a */
    /* compiled from: constantValues.kt */
    public static final class C14624a {
        private C14624a() {
        }

        public /* synthetic */ C14624a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14623k mo73737a(String str) {
            C13706o.m87929f(str, "message");
            return new C14625b(str);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.k$b */
    /* compiled from: constantValues.kt */
    public static final class C14625b extends C14623k {

        /* renamed from: c */
        private final String f63622c;

        public C14625b(String str) {
            C13706o.m87929f(str, "message");
            this.f63622c = str;
        }

        /* renamed from: d */
        public C17085h mo73715a(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            return C17088k.m100540d(C17087j.ERROR_CONSTANT_VALUE, this.f63622c);
        }

        public String toString() {
            return this.f63622c;
        }
    }

    public C14623k() {
        super(C13339u.f61331a);
    }

    /* renamed from: c */
    public C13339u mo73727b() {
        throw new UnsupportedOperationException();
    }
}
