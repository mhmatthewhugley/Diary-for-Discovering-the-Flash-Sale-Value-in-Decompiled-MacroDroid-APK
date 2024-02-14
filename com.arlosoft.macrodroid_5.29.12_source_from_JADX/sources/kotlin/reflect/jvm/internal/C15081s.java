package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\tRF\u0010\u000f\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \r*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f0\f0\u000b8\bX\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u000eR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/s;", "D", "E", "V", "", "Lkotlin/reflect/jvm/internal/v;", "receiver1", "receiver2", "F", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/s$a;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/c0$b;", "_getter", "G", "()Lkotlin/reflect/jvm/internal/s$a;", "getter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.s */
/* compiled from: KProperty2Impl.kt */
public class C15081s<D, E, V> extends C15085v<V> implements C16269p {

    /* renamed from: D */
    private final C13724c0.C13726b<C15082a<D, E, V>> f64264D;

    /* renamed from: E */
    private final C13321g<Member> f64265E = C13323i.m85668a(C13326k.PUBLICATION, new C15084u(this));

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/s$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/v$c;", "", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/s;", "s", "Lkotlin/reflect/jvm/internal/s;", "B", "()Lkotlin/reflect/jvm/internal/s;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/s;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.s$a */
    /* compiled from: KProperty2Impl.kt */
    public static final class C15082a<D, E, V> extends C15085v.C15088c<V> implements C16269p {

        /* renamed from: s */
        private final C15081s<D, E, V> f64266s;

        public C15082a(C15081s<D, E, ? extends V> sVar) {
            C13706o.m87929f(sVar, "property");
            this.f64266s = sVar;
        }

        /* renamed from: B */
        public C15081s<D, E, V> mo74315z() {
            return this.f64266s;
        }

        public V invoke(D d, E e) {
            return mo74315z().mo74360F(d, e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15081s(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15082a<D, E, V>> b = C13724c0.m87971b(new C15083t(this));
        C13706o.m87928e(b, "lazy { Getter(this) }");
        this.f64264D = b;
    }

    /* renamed from: F */
    public V mo74360F(D d, E e) {
        return mo74352C().call(d, e);
    }

    /* renamed from: G */
    public C15082a<D, E, V> mo74352C() {
        C15082a<D, E, V> invoke = this.f64264D.invoke();
        C13706o.m87928e(invoke, "_getter()");
        return invoke;
    }

    public V invoke(D d, E e) {
        return mo74360F(d, e);
    }
}
