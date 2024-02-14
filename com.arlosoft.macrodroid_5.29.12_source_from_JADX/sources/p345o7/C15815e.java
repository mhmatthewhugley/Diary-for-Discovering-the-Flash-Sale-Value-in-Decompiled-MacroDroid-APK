package p345o7;

import java.util.Objects;
import p345o7.C15808b;

/* renamed from: o7.e */
/* compiled from: Request */
public final class C15815e {

    /* renamed from: a */
    private final C15811c f65242a;

    /* renamed from: b */
    private final String f65243b;

    /* renamed from: c */
    private final C15808b f65244c;

    /* renamed from: d */
    private final Object f65245d;

    /* renamed from: o7.e$b */
    /* compiled from: Request */
    public static class C15817b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C15811c f65246a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f65247b = "GET";
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C15808b.C15810b f65248c = new C15808b.C15810b();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Object f65249d;

        /* renamed from: f */
        public C15815e mo75598f() {
            if (this.f65246a != null) {
                return new C15815e(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: g */
        public C15817b mo75599g(String str, String str2) {
            this.f65248c.mo75582f(str, str2);
            return this;
        }

        /* renamed from: h */
        public C15817b mo75600h(C15811c cVar) {
            if (cVar != null) {
                this.f65246a = cVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    /* renamed from: a */
    public C15808b mo75595a() {
        return this.f65244c;
    }

    /* renamed from: b */
    public C15811c mo75596b() {
        return this.f65242a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f65243b);
        sb.append(", url=");
        sb.append(this.f65242a);
        sb.append(", tag=");
        Object obj = this.f65245d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    private C15815e(C15817b bVar) {
        this.f65242a = bVar.f65246a;
        this.f65243b = bVar.f65247b;
        this.f65244c = bVar.f65248c.mo75580c();
        C15818f unused = Objects.requireNonNull(bVar);
        this.f65245d = bVar.f65249d != null ? bVar.f65249d : this;
    }
}
