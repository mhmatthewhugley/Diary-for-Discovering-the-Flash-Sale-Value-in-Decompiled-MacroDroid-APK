package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;
import p433xa.C16885l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B+\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0016\u0010\u001dJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0007R:\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u000b*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\n0\t8\bX\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/r;", "T", "V", "Lxa/l;", "Lkotlin/reflect/jvm/internal/v;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/r$a;", "kotlin.jvm.PlatformType", "D", "Lkotlin/reflect/jvm/internal/c0$b;", "_getter", "F", "()Lkotlin/reflect/jvm/internal/r$a;", "getter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.r */
/* compiled from: KProperty1Impl.kt */
public class C15077r<T, V> extends C15085v<V> implements C16885l<T, V> {

    /* renamed from: D */
    private final C13724c0.C13726b<C15078a<T, V>> f64261D;

    /* renamed from: E */
    private final C13321g<Member> f64262E = C13323i.m85668a(C13326k.PUBLICATION, new C15080c(this));

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/r$a;", "T", "V", "Lkotlin/reflect/jvm/internal/v$c;", "Lxa/l$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/r;", "s", "Lkotlin/reflect/jvm/internal/r;", "B", "()Lkotlin/reflect/jvm/internal/r;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/r;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.r$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class C15078a<T, V> extends C15085v.C15088c<V> implements C16885l.C16886a<T, V> {

        /* renamed from: s */
        private final C15077r<T, V> f64263s;

        public C15078a(C15077r<T, ? extends V> rVar) {
            C13706o.m87929f(rVar, "property");
            this.f64263s = rVar;
        }

        /* renamed from: B */
        public C15077r<T, V> mo74315z() {
            return this.f64263s;
        }

        public V invoke(T t) {
            return mo74315z().get(t);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/r$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/r$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.r$b */
    /* compiled from: KProperty1Impl.kt */
    static final class C15079b extends C13708q implements C16254a<C15078a<T, ? extends V>> {
        final /* synthetic */ C15077r<T, V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15079b(C15077r<T, ? extends V> rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* renamed from: a */
        public final C15078a<T, V> invoke() {
            return new C15078a<>(this.this$0);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"T", "V", "Ljava/lang/reflect/Member;", "a", "()Ljava/lang/reflect/Member;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.r$c */
    /* compiled from: KProperty1Impl.kt */
    static final class C15080c extends C13708q implements C16254a<Member> {
        final /* synthetic */ C15077r<T, V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15080c(C15077r<T, ? extends V> rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* renamed from: a */
        public final Member invoke() {
            return this.this$0.mo74372y();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15077r(C13832i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
        C13724c0.C13726b<C15078a<T, V>> b = C13724c0.m87971b(new C15079b(this));
        C13706o.m87928e(b, "lazy { Getter(this) }");
        this.f64261D = b;
    }

    /* renamed from: F */
    public C15078a<T, V> mo71963f() {
        C15078a<T, V> invoke = this.f64261D.invoke();
        C13706o.m87928e(invoke, "_getter()");
        return invoke;
    }

    public V get(T t) {
        return mo71963f().call(t);
    }

    public V invoke(T t) {
        return get(t);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15077r(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15078a<T, V>> b = C13724c0.m87971b(new C15079b(this));
        C13706o.m87928e(b, "lazy { Getter(this) }");
        this.f64261D = b;
    }
}
