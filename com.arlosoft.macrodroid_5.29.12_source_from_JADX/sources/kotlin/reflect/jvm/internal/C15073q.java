package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;
import p433xa.C16883k;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B+\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005R.\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \t*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\b0\u00078\bX\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/q;", "V", "Lxa/k;", "Lkotlin/reflect/jvm/internal/v;", "get", "()Ljava/lang/Object;", "invoke", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/q$a;", "kotlin.jvm.PlatformType", "D", "Lkotlin/reflect/jvm/internal/c0$b;", "_getter", "F", "()Lkotlin/reflect/jvm/internal/q$a;", "getter", "Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.q */
/* compiled from: KProperty0Impl.kt */
public class C15073q<V> extends C15085v<V> implements C16883k<V> {

    /* renamed from: D */
    private final C13724c0.C13726b<C15074a<V>> f64258D;

    /* renamed from: E */
    private final C13321g<Object> f64259E = C13323i.m85668a(C13326k.PUBLICATION, new C15076c(this));

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/q$a;", "R", "Lkotlin/reflect/jvm/internal/v$c;", "Lxa/k$a;", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/q;", "s", "Lkotlin/reflect/jvm/internal/q;", "B", "()Lkotlin/reflect/jvm/internal/q;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/q;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.q$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C15074a<R> extends C15085v.C15088c<R> implements C16883k.C16884a<R> {

        /* renamed from: s */
        private final C15073q<R> f64260s;

        public C15074a(C15073q<? extends R> qVar) {
            C13706o.m87929f(qVar, "property");
            this.f64260s = qVar;
        }

        /* renamed from: B */
        public C15073q<R> mo74315z() {
            return this.f64260s;
        }

        public R invoke() {
            return mo74315z().get();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/q$a;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/q$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.q$b */
    /* compiled from: KProperty0Impl.kt */
    static final class C15075b extends C13708q implements C16254a<C15074a<? extends V>> {
        final /* synthetic */ C15073q<V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15075b(C15073q<? extends V> qVar) {
            super(0);
            this.this$0 = qVar;
        }

        /* renamed from: a */
        public final C15074a<V> invoke() {
            return new C15074a<>(this.this$0);
        }
    }

    @Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "", "V", "invoke"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.q$c */
    /* compiled from: KProperty0Impl.kt */
    static final class C15076c extends C13708q implements C16254a<Object> {
        final /* synthetic */ C15073q<V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15076c(C15073q<? extends V> qVar) {
            super(0);
            this.this$0 = qVar;
        }

        public final Object invoke() {
            C15073q<V> qVar = this.this$0;
            return qVar.mo74365A(qVar.mo74372y(), (Object) null, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15073q(C13832i iVar, C14140t0 t0Var) {
        super(iVar, t0Var);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(t0Var, "descriptor");
        C13724c0.C13726b<C15074a<V>> b = C13724c0.m87971b(new C15075b(this));
        C13706o.m87928e(b, "lazy { Getter(this) }");
        this.f64258D = b;
    }

    /* renamed from: F */
    public C15074a<V> mo71967f() {
        C15074a<V> invoke = this.f64258D.invoke();
        C13706o.m87928e(invoke, "_getter()");
        return invoke;
    }

    public V get() {
        return mo71967f().call(new Object[0]);
    }

    public V invoke() {
        return get();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15073q(C13832i iVar, String str, String str2, Object obj) {
        super(iVar, str, str2, obj);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
        C13724c0.C13726b<C15074a<V>> b = C13724c0.m87971b(new C15075b(this));
        C13706o.m87928e(b, "lazy { Getter(this) }");
        this.f64258D = b;
    }
}
