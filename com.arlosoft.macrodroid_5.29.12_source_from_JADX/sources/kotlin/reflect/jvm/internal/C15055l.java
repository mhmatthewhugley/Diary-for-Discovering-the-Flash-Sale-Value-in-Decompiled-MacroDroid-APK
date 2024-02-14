package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;
import p433xa.C16880i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/l;", "T", "V", "Lkotlin/reflect/jvm/internal/r;", "Lxa/i;", "receiver", "value", "Lja/u;", "H", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/l$a;", "kotlin.jvm.PlatformType", "F", "Lkotlin/reflect/jvm/internal/c0$b;", "_setter", "G", "()Lkotlin/reflect/jvm/internal/l$a;", "setter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.l */
/* compiled from: KProperty1Impl.kt */
public final class C15055l<T, V> extends C15077r<T, V> implements C16880i<T, V> {

    /* renamed from: F */
    private final C13724c0.C13726b<C15056a<T, V>> f64237F;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/l$a;", "T", "V", "Lkotlin/reflect/jvm/internal/v$d;", "", "receiver", "value", "Lja/u;", "C", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/l;", "s", "Lkotlin/reflect/jvm/internal/l;", "B", "()Lkotlin/reflect/jvm/internal/l;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/l;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.l$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class C15056a<T, V> extends C15085v.C15091d<V> implements C16269p {

        /* renamed from: s */
        private final C15055l<T, V> f64238s;

        public C15056a(C15055l<T, V> lVar) {
            C13706o.m87929f(lVar, "property");
            this.f64238s = lVar;
        }

        /* renamed from: B */
        public C15055l<T, V> mo74315z() {
            return this.f64238s;
        }

        /* renamed from: C */
        public void mo74320C(T t, V v) {
            mo74315z().mo74318H(t, v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo74320C(obj, obj2);
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/l$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/l$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.l$b */
    /* compiled from: KProperty1Impl.kt */
    static final class C15057b extends C13708q implements C16254a<C15056a<T, V>> {
        final /* synthetic */ C15055l<T, V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15057b(C15055l<T, V> lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* renamed from: a */
        public final C15056a<T, V> invoke() {
            return new C15056a<>(this.this$0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15055l(C13832i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
        C13724c0.C13726b<C15056a<T, V>> b = C13724c0.m87971b(new C15057b(this));
        C13706o.m87928e(b, "lazy { Setter(this) }");
        this.f64237F = b;
    }

    /* renamed from: G */
    public C15056a<T, V> mo74317G() {
        C15056a<T, V> invoke = this.f64237F.invoke();
        C13706o.m87928e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: H */
    public void mo74318H(T t, V v) {
        mo74317G().call(t, v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15055l(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15056a<T, V>> b = C13724c0.m87971b(new C15057b(this));
        C13706o.m87928e(b, "lazy { Setter(this) }");
        this.f64237F = b;
    }
}
