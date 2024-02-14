package p433xa;

import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo71668d2 = {"Lxa/p;", "", "", "toString", "Lxa/q;", "a", "Lxa/n;", "b", "", "hashCode", "other", "", "equals", "variance", "Lxa/q;", "d", "()Lxa/q;", "type", "Lxa/n;", "c", "()Lxa/n;", "<init>", "(Lxa/q;Lxa/n;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: xa.p */
/* compiled from: KTypeProjection.kt */
public final class C16890p {

    /* renamed from: c */
    public static final C16891a f68129c = new C16891a((C13695i) null);

    /* renamed from: d */
    public static final C16890p f68130d = new C16890p((C16893q) null, (C16888n) null);

    /* renamed from: a */
    private final C16893q f68131a;

    /* renamed from: b */
    private final C16888n f68132b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo71668d2 = {"Lxa/p$a;", "", "Lxa/n;", "type", "Lxa/p;", "d", "a", "b", "c", "()Lxa/p;", "STAR", "star", "Lxa/p;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: xa.p$a */
    /* compiled from: KTypeProjection.kt */
    public static final class C16891a {
        private C16891a() {
        }

        public /* synthetic */ C16891a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16890p mo80048a(C16888n nVar) {
            C13706o.m87929f(nVar, "type");
            return new C16890p(C16893q.IN, nVar);
        }

        /* renamed from: b */
        public final C16890p mo80049b(C16888n nVar) {
            C13706o.m87929f(nVar, "type");
            return new C16890p(C16893q.OUT, nVar);
        }

        /* renamed from: c */
        public final C16890p mo80050c() {
            return C16890p.f68130d;
        }

        /* renamed from: d */
        public final C16890p mo80051d(C16888n nVar) {
            C13706o.m87929f(nVar, "type");
            return new C16890p(C16893q.INVARIANT, nVar);
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: xa.p$b */
    /* compiled from: KTypeProjection.kt */
    public /* synthetic */ class C16892b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68133a;

        static {
            int[] iArr = new int[C16893q.values().length];
            iArr[C16893q.INVARIANT.ordinal()] = 1;
            iArr[C16893q.IN.ordinal()] = 2;
            iArr[C16893q.OUT.ordinal()] = 3;
            f68133a = iArr;
        }
    }

    public C16890p(C16893q qVar, C16888n nVar) {
        String str;
        this.f68131a = qVar;
        this.f68132b = nVar;
        if (!((qVar == null) != (nVar == null) ? false : true)) {
            if (qVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + qVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: a */
    public final C16893q mo80041a() {
        return this.f68131a;
    }

    /* renamed from: b */
    public final C16888n mo80042b() {
        return this.f68132b;
    }

    /* renamed from: c */
    public final C16888n mo80043c() {
        return this.f68132b;
    }

    /* renamed from: d */
    public final C16893q mo80044d() {
        return this.f68131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16890p)) {
            return false;
        }
        C16890p pVar = (C16890p) obj;
        return this.f68131a == pVar.f68131a && C13706o.m87924a(this.f68132b, pVar.f68132b);
    }

    public int hashCode() {
        C16893q qVar = this.f68131a;
        int i = 0;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        C16888n nVar = this.f68132b;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        C16893q qVar = this.f68131a;
        int i = qVar == null ? -1 : C16892b.f68133a[qVar.ordinal()];
        if (i == -1) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        if (i == 1) {
            return String.valueOf(this.f68132b);
        }
        if (i == 2) {
            return "in " + this.f68132b;
        } else if (i == 3) {
            return "out " + this.f68132b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
