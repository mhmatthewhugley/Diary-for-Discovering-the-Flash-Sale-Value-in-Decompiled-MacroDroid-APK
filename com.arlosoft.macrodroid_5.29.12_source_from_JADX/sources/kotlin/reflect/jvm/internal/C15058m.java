package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13339u;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bRF\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000e*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r0\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/m;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/s;", "", "receiver1", "receiver2", "value", "Lja/u;", "I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/m$a;", "kotlin.jvm.PlatformType", "F", "Lkotlin/reflect/jvm/internal/c0$b;", "_setter", "H", "()Lkotlin/reflect/jvm/internal/m$a;", "setter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.m */
/* compiled from: KProperty2Impl.kt */
public final class C15058m<D, E, V> extends C15081s<D, E, V> {

    /* renamed from: F */
    private final C13724c0.C13726b<C15059a<D, E, V>> f64239F;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/m$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/v$d;", "", "receiver1", "receiver2", "value", "Lja/u;", "C", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/m;", "s", "Lkotlin/reflect/jvm/internal/m;", "B", "()Lkotlin/reflect/jvm/internal/m;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/m;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.m$a */
    /* compiled from: KProperty2Impl.kt */
    public static final class C15059a<D, E, V> extends C15085v.C15091d<V> implements C16270q {

        /* renamed from: s */
        private final C15058m<D, E, V> f64240s;

        public C15059a(C15058m<D, E, V> mVar) {
            C13706o.m87929f(mVar, "property");
            this.f64240s = mVar;
        }

        /* renamed from: B */
        public C15058m<D, E, V> mo74315z() {
            return this.f64240s;
        }

        /* renamed from: C */
        public void mo74325C(D d, E e, V v) {
            mo74315z().mo74323I(d, e, v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo74325C(obj, obj2, obj3);
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15058m(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15059a<D, E, V>> b = C13724c0.m87971b(new C15060n(this));
        C13706o.m87928e(b, "lazy { Setter(this) }");
        this.f64239F = b;
    }

    /* renamed from: H */
    public C15059a<D, E, V> mo74322H() {
        C15059a<D, E, V> invoke = this.f64239F.invoke();
        C13706o.m87928e(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: I */
    public void mo74323I(D d, E e, V v) {
        mo74322H().call(d, e, v);
    }
}
