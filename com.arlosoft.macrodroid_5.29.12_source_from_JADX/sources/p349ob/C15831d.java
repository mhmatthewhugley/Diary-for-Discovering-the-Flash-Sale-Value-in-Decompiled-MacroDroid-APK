package p349ob;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: ob.d */
/* compiled from: JvmMemberSignature.kt */
public abstract class C15831d {

    /* renamed from: ob.d$a */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C15832a extends C15831d {

        /* renamed from: a */
        private final String f65274a;

        /* renamed from: b */
        private final String f65275b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15832a(String str, String str2) {
            super((C13695i) null);
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "desc");
            this.f65274a = str;
            this.f65275b = str2;
        }

        /* renamed from: a */
        public String mo75608a() {
            return mo75610c() + ':' + mo75609b();
        }

        /* renamed from: b */
        public String mo75609b() {
            return this.f65275b;
        }

        /* renamed from: c */
        public String mo75610c() {
            return this.f65274a;
        }

        /* renamed from: d */
        public final String mo75612d() {
            return mo75610c();
        }

        /* renamed from: e */
        public final String mo75613e() {
            return mo75609b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15832a)) {
                return false;
            }
            C15832a aVar = (C15832a) obj;
            return C13706o.m87924a(mo75610c(), aVar.mo75610c()) && C13706o.m87924a(mo75609b(), aVar.mo75609b());
        }

        public int hashCode() {
            return (mo75610c().hashCode() * 31) + mo75609b().hashCode();
        }
    }

    /* renamed from: ob.d$b */
    /* compiled from: JvmMemberSignature.kt */
    public static final class C15833b extends C15831d {

        /* renamed from: a */
        private final String f65276a;

        /* renamed from: b */
        private final String f65277b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15833b(String str, String str2) {
            super((C13695i) null);
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "desc");
            this.f65276a = str;
            this.f65277b = str2;
        }

        /* renamed from: a */
        public String mo75608a() {
            return mo75610c() + mo75609b();
        }

        /* renamed from: b */
        public String mo75609b() {
            return this.f65277b;
        }

        /* renamed from: c */
        public String mo75610c() {
            return this.f65276a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15833b)) {
                return false;
            }
            C15833b bVar = (C15833b) obj;
            return C13706o.m87924a(mo75610c(), bVar.mo75610c()) && C13706o.m87924a(mo75609b(), bVar.mo75609b());
        }

        public int hashCode() {
            return (mo75610c().hashCode() * 31) + mo75609b().hashCode();
        }
    }

    private C15831d() {
    }

    public /* synthetic */ C15831d(C13695i iVar) {
        this();
    }

    /* renamed from: a */
    public abstract String mo75608a();

    /* renamed from: b */
    public abstract String mo75609b();

    /* renamed from: c */
    public abstract String mo75610c();

    public final String toString() {
        return mo75608a();
    }
}
