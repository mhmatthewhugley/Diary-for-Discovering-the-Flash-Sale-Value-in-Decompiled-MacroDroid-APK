package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/k;", "V", "Lkotlin/reflect/jvm/internal/q;", "", "value", "Lja/u;", "H", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/k$a;", "kotlin.jvm.PlatformType", "F", "Lkotlin/reflect/jvm/internal/c0$b;", "_setter", "G", "()Lkotlin/reflect/jvm/internal/k$a;", "setter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.k */
/* compiled from: KProperty0Impl.kt */
public final class C15052k<V> extends C15073q<V> {

    /* renamed from: F */
    private final C13724c0.C13726b<C15053a<V>> f64235F;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/k$a;", "R", "Lkotlin/reflect/jvm/internal/v$d;", "", "value", "Lja/u;", "C", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/k;", "s", "Lkotlin/reflect/jvm/internal/k;", "B", "()Lkotlin/reflect/jvm/internal/k;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/k;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.k$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C15053a<R> extends C15085v.C15091d<R> implements C16265l {

        /* renamed from: s */
        private final C15052k<R> f64236s;

        public C15053a(C15052k<R> kVar) {
            C13706o.m87929f(kVar, "property");
            this.f64236s = kVar;
        }

        /* renamed from: B */
        public C15052k<R> mo74315z() {
            return this.f64236s;
        }

        /* renamed from: C */
        public void mo74314C(R r) {
            mo74315z().mo74312H(r);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74314C(obj);
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/k$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/k$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.k$b */
    /* compiled from: KProperty0Impl.kt */
    static final class C15054b extends C13708q implements C16254a<C15053a<V>> {
        final /* synthetic */ C15052k<V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15054b(C15052k<V> kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* renamed from: a */
        public final C15053a<V> invoke() {
            return new C15053a<>(this.this$0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15052k(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15053a<V>> b = C13724c0.m87971b(new C15054b(this));
        C13706o.m87928e(b, "lazy { Setter(this) }");
        this.f64235F = b;
    }

    /* renamed from: G */
    public C15053a<V> mo74311G() {
        C15053a<V> invoke = this.f64235F.invoke();
        C13706o.m87928e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: H */
    public void mo74312H(V v) {
        mo74311G().call(v);
    }
}
