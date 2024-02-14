package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\tB\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J*\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006$"}, mo71668d2 = {"Lkotlin/coroutines/c;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "f", "Lkotlin/coroutines/g$b;", "element", "", "a", "context", "d", "", "writeReplace", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lqa/p;)Ljava/lang/Object;", "minusKey", "other", "equals", "hashCode", "", "toString", "left", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$b;", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.c */
/* compiled from: CoroutineContextImpl.kt */
public final class C13630c implements C13640g, Serializable {
    private final C13640g.C13643b element;
    private final C13640g left;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/coroutines/c$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/g;", "elements", "[Lkotlin/coroutines/g;", "getElements", "()[Lkotlin/coroutines/g;", "<init>", "([Lkotlin/coroutines/g;)V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.c$a */
    /* compiled from: CoroutineContextImpl.kt */
    private static final class C13631a implements Serializable {

        /* renamed from: a */
        public static final C13632a f61894a = new C13632a((C13695i) null);
        private static final long serialVersionUID = 0;
        private final C13640g[] elements;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lkotlin/coroutines/c$a$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.coroutines.c$a$a */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C13632a {
            private C13632a() {
            }

            public /* synthetic */ C13632a(C13695i iVar) {
                this();
            }
        }

        public C13631a(C13640g[] gVarArr) {
            C13706o.m87929f(gVarArr, "elements");
            this.elements = gVarArr;
        }

        private final Object readResolve() {
            C13640g[] gVarArr = this.elements;
            C13640g gVar = C13646h.f61899a;
            for (C13640g plus : gVarArr) {
                gVar = gVar.plus(plus);
            }
            return gVar;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "acc", "Lkotlin/coroutines/g$b;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/g$b;)Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.c$b */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C13633b extends C13708q implements C16269p<String, C13640g.C13643b, String> {

        /* renamed from: a */
        public static final C13633b f61895a = new C13633b();

        C13633b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C13640g.C13643b bVar) {
            C13706o.m87929f(str, "acc");
            C13706o.m87929f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lja/u;", "<anonymous parameter 0>", "Lkotlin/coroutines/g$b;", "element", "a", "(Lja/u;Lkotlin/coroutines/g$b;)V"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.c$c */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C13634c extends C13708q implements C16269p<C13339u, C13640g.C13643b, C13339u> {
        final /* synthetic */ C13640g[] $elements;
        final /* synthetic */ C13680b0 $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13634c(C13640g[] gVarArr, C13680b0 b0Var) {
            super(2);
            this.$elements = gVarArr;
            this.$index = b0Var;
        }

        /* renamed from: a */
        public final void mo71878a(C13339u uVar, C13640g.C13643b bVar) {
            C13706o.m87929f(uVar, "<anonymous parameter 0>");
            C13706o.m87929f(bVar, "element");
            C13640g[] gVarArr = this.$elements;
            C13680b0 b0Var = this.$index;
            int i = b0Var.element;
            b0Var.element = i + 1;
            gVarArr[i] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo71878a((C13339u) obj, (C13640g.C13643b) obj2);
            return C13339u.f61331a;
        }
    }

    public C13630c(C13640g gVar, C13640g.C13643b bVar) {
        C13706o.m87929f(gVar, "left");
        C13706o.m87929f(bVar, "element");
        this.left = gVar;
        this.element = bVar;
    }

    /* renamed from: a */
    private final boolean m87812a(C13640g.C13643b bVar) {
        return C13706o.m87924a(get(bVar.getKey()), bVar);
    }

    /* renamed from: d */
    private final boolean m87813d(C13630c cVar) {
        while (m87812a(cVar.element)) {
            C13640g gVar = cVar.left;
            if (gVar instanceof C13630c) {
                cVar = (C13630c) gVar;
            } else {
                C13706o.m87927d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m87812a((C13640g.C13643b) gVar);
            }
        }
        return false;
    }

    /* renamed from: f */
    private final int m87814f() {
        int i = 2;
        C13630c cVar = this;
        while (true) {
            C13640g gVar = cVar.left;
            cVar = gVar instanceof C13630c ? (C13630c) gVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int f = m87814f();
        C13640g[] gVarArr = new C13640g[f];
        C13680b0 b0Var = new C13680b0();
        fold(C13339u.f61331a, new C13634c(gVarArr, b0Var));
        if (b0Var.element == f) {
            return new C13631a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13630c) {
                C13630c cVar = (C13630c) obj;
                if (cVar.m87814f() != m87814f() || !cVar.m87813d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        C13706o.m87929f(pVar, "operation");
        return pVar.invoke(this.left.fold(r, pVar), this.element);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        C13706o.m87929f(cVar, "key");
        C13630c cVar2 = this;
        while (true) {
            E e = cVar2.element.get(cVar);
            if (e != null) {
                return e;
            }
            C13640g gVar = cVar2.left;
            if (!(gVar instanceof C13630c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C13630c) gVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        C13706o.m87929f(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        C13640g minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == C13646h.f61899a) {
            return this.element;
        }
        return new C13630c(minusKey, this.element);
    }

    public C13640g plus(C13640g gVar) {
        return C13640g.C13641a.m87820a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", C13633b.f61895a)) + ']';
    }
}
