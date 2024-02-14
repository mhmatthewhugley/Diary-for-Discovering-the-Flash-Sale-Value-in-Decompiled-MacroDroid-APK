package p362pb;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: pb.a */
/* compiled from: CallableId.kt */
public final class C16149a {

    /* renamed from: e */
    private static final C16150a f66277e = new C16150a((C13695i) null);
    @Deprecated

    /* renamed from: f */
    private static final C16157f f66278f;
    @Deprecated

    /* renamed from: g */
    private static final C16152c f66279g;

    /* renamed from: a */
    private final C16152c f66280a;

    /* renamed from: b */
    private final C16152c f66281b;

    /* renamed from: c */
    private final C16157f f66282c;

    /* renamed from: d */
    private final C16152c f66283d;

    /* renamed from: pb.a$a */
    /* compiled from: CallableId.kt */
    private static final class C16150a {
        private C16150a() {
        }

        public /* synthetic */ C16150a(C13695i iVar) {
            this();
        }
    }

    static {
        C16157f fVar = C16159h.f66313l;
        f66278f = fVar;
        C16152c k = C16152c.m96986k(fVar);
        C13706o.m87928e(k, "topLevel(LOCAL_NAME)");
        f66279g = k;
    }

    public C16149a(C16152c cVar, C16152c cVar2, C16157f fVar, C16152c cVar3) {
        C13706o.m87929f(cVar, "packageName");
        C13706o.m87929f(fVar, "callableName");
        this.f66280a = cVar;
        this.f66281b = cVar2;
        this.f66282c = fVar;
        this.f66283d = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16149a)) {
            return false;
        }
        C16149a aVar = (C16149a) obj;
        return C13706o.m87924a(this.f66280a, aVar.f66280a) && C13706o.m87924a(this.f66281b, aVar.f66281b) && C13706o.m87924a(this.f66282c, aVar.f66282c) && C13706o.m87924a(this.f66283d, aVar.f66283d);
    }

    public int hashCode() {
        int hashCode = this.f66280a.hashCode() * 31;
        C16152c cVar = this.f66281b;
        int i = 0;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f66282c.hashCode()) * 31;
        C16152c cVar2 = this.f66283d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String b = this.f66280a.mo78556b();
        C13706o.m87928e(b, "packageName.asString()");
        sb.append(C15176v.m93629D(b, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null));
        sb.append("/");
        C16152c cVar = this.f66281b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f66282c);
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16149a(C16152c cVar, C16152c cVar2, C16157f fVar, C16152c cVar3, int i, C13695i iVar) {
        this(cVar, cVar2, fVar, (i & 8) != 0 ? null : cVar3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16149a(C16152c cVar, C16157f fVar) {
        this(cVar, (C16152c) null, fVar, (C16152c) null, 8, (C13695i) null);
        C13706o.m87929f(cVar, "packageName");
        C13706o.m87929f(fVar, "callableName");
    }
}
