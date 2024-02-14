package p210ab;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: ab.c */
/* compiled from: FunctionClassKind.kt */
public enum C11084c {
    Function(C13902k.f62196r, "Function", false, false),
    SuspendFunction(C13902k.f62188j, "SuspendFunction", true, false),
    KFunction(r4, "KFunction", false, true),
    KSuspendFunction(r4, "KSuspendFunction", true, true);
    

    /* renamed from: a */
    public static final C11085a f54000a = null;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final C16152c packageFqName;

    /* renamed from: ab.c$a */
    /* compiled from: FunctionClassKind.kt */
    public static final class C11085a {

        /* renamed from: ab.c$a$a */
        /* compiled from: FunctionClassKind.kt */
        public static final class C11086a {

            /* renamed from: a */
            private final C11084c f54006a;

            /* renamed from: b */
            private final int f54007b;

            public C11086a(C11084c cVar, int i) {
                C13706o.m87929f(cVar, "kind");
                this.f54006a = cVar;
                this.f54007b = i;
            }

            /* renamed from: a */
            public final C11084c mo62197a() {
                return this.f54006a;
            }

            /* renamed from: b */
            public final int mo62198b() {
                return this.f54007b;
            }

            /* renamed from: c */
            public final C11084c mo62199c() {
                return this.f54006a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11086a)) {
                    return false;
                }
                C11086a aVar = (C11086a) obj;
                return this.f54006a == aVar.f54006a && this.f54007b == aVar.f54007b;
            }

            public int hashCode() {
                return (this.f54006a.hashCode() * 31) + this.f54007b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f54006a + ", arity=" + this.f54007b + ')';
            }
        }

        private C11085a() {
        }

        public /* synthetic */ C11085a(C13695i iVar) {
            this();
        }

        /* renamed from: d */
        private final Integer m74687d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (!(charAt >= 0 && charAt < 10)) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }

        /* renamed from: a */
        public final C11084c mo62194a(C16152c cVar, String str) {
            C13706o.m87929f(cVar, "packageFqName");
            C13706o.m87929f(str, "className");
            for (C11084c cVar2 : C11084c.values()) {
                if (C13706o.m87924a(cVar2.mo62192e(), cVar) && C15176v.m93634I(str, cVar2.mo62191d(), false, 2, (Object) null)) {
                    return cVar2;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final C11084c mo62195b(String str, C16152c cVar) {
            C13706o.m87929f(str, "className");
            C13706o.m87929f(cVar, "packageFqName");
            C11086a c = mo62196c(str, cVar);
            if (c != null) {
                return c.mo62199c();
            }
            return null;
        }

        /* renamed from: c */
        public final C11086a mo62196c(String str, C16152c cVar) {
            C13706o.m87929f(str, "className");
            C13706o.m87929f(cVar, "packageFqName");
            C11084c a = mo62194a(cVar, str);
            if (a == null) {
                return null;
            }
            String substring = str.substring(a.mo62191d().length());
            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
            Integer d = m74687d(substring);
            if (d != null) {
                return new C11086a(a, d.intValue());
            }
            return null;
        }
    }

    static {
        f54000a = new C11085a((C13695i) null);
    }

    private C11084c(C16152c cVar, String str, boolean z, boolean z2) {
        this.packageFqName = cVar;
        this.classNamePrefix = str;
        this.isSuspendType = z;
        this.isReflectType = z2;
    }

    /* renamed from: d */
    public final String mo62191d() {
        return this.classNamePrefix;
    }

    /* renamed from: e */
    public final C16152c mo62192e() {
        return this.packageFqName;
    }

    /* renamed from: f */
    public final C16157f mo62193f(int i) {
        C16157f i2 = C16157f.m97019i(this.classNamePrefix + i);
        C13706o.m87928e(i2, "identifier(\"$classNamePrefix$arity\")");
        return i2;
    }
}
