package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p327mb.C15719c;
import p336nb.C15766a;
import p349ob.C15831d;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.t */
/* compiled from: MemberSignature.kt */
public final class C14467t {

    /* renamed from: b */
    public static final C14468a f63311b = new C14468a((C13695i) null);

    /* renamed from: a */
    private final String f63312a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.t$a */
    /* compiled from: MemberSignature.kt */
    public static final class C14468a {
        private C14468a() {
        }

        public /* synthetic */ C14468a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14467t mo73211a(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "desc");
            return new C14467t(str + '#' + str2, (C13695i) null);
        }

        /* renamed from: b */
        public final C14467t mo73212b(C15831d dVar) {
            C13706o.m87929f(dVar, "signature");
            if (dVar instanceof C15831d.C15833b) {
                return mo73214d(dVar.mo75610c(), dVar.mo75609b());
            }
            if (dVar instanceof C15831d.C15832a) {
                return mo73211a(dVar.mo75610c(), dVar.mo75609b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: c */
        public final C14467t mo73213c(C15719c cVar, C15766a.C15771c cVar2) {
            C13706o.m87929f(cVar, "nameResolver");
            C13706o.m87929f(cVar2, "signature");
            return mo73214d(cVar.getString(cVar2.mo75434z()), cVar.getString(cVar2.mo75433y()));
        }

        /* renamed from: d */
        public final C14467t mo73214d(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "desc");
            return new C14467t(str + str2, (C13695i) null);
        }

        /* renamed from: e */
        public final C14467t mo73215e(C14467t tVar, int i) {
            C13706o.m87929f(tVar, "signature");
            return new C14467t(tVar.mo73207a() + '@' + i, (C13695i) null);
        }
    }

    private C14467t(String str) {
        this.f63312a = str;
    }

    public /* synthetic */ C14467t(String str, C13695i iVar) {
        this(str);
    }

    /* renamed from: a */
    public final String mo73207a() {
        return this.f63312a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14467t) && C13706o.m87924a(this.f63312a, ((C14467t) obj).f63312a);
    }

    public int hashCode() {
        return this.f63312a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f63312a + ')';
    }
}
