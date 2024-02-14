package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13685e;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C13783e;
import kotlin.reflect.jvm.internal.calls.C13738d;
import kotlin.reflect.jvm.internal.calls.C13768h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.load.java.C14218k;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import p297ja.C13339u;
import p336nb.C15766a;
import p349ob.C15831d;
import p349ob.C15841i;
import p370qa.C16254a;
import p433xa.C16879h;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u0000 G*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004HIJKB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010A\u001a\u00020)¢\u0006\u0004\bB\u0010CB5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010D\u001a\u0004\u0018\u00010)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bB\u0010EB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bB\u0010FJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010,\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010-R\u0014\u00101\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00104\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u0006\u0012\u0002\b\u0003098VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010:R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u0001098VX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010>\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00100R\u0014\u0010A\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006L"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v;", "V", "Lkotlin/reflect/jvm/internal/f;", "Lxa/m;", "Ljava/lang/reflect/Member;", "y", "fieldOrMethod", "", "receiver1", "receiver2", "A", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/i;", "g", "Lkotlin/reflect/jvm/internal/i;", "t", "()Lkotlin/reflect/jvm/internal/i;", "container", "o", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "p", "E", "signature", "s", "Ljava/lang/Object;", "rawBoundReceiver", "Lkotlin/reflect/jvm/internal/c0$b;", "Ljava/lang/reflect/Field;", "z", "Lkotlin/reflect/jvm/internal/c0$b;", "_javaField", "Lkotlin/reflect/jvm/internal/c0$a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/c0$a;", "_descriptor", "()Ljava/lang/Object;", "boundReceiver", "x", "()Z", "isBound", "D", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/v$c;", "C", "()Lkotlin/reflect/jvm/internal/v$c;", "getter", "Lkotlin/reflect/jvm/internal/calls/d;", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "u", "defaultCaller", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/i;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "B", "a", "b", "c", "d", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.v */
/* compiled from: KPropertyImpl.kt */
public abstract class C15085v<V> extends C13792f<V> implements C16887m<V> {

    /* renamed from: B */
    public static final C15087b f64267B = new C15087b((C13695i) null);

    /* renamed from: C */
    private static final Object f64268C = new Object();

    /* renamed from: A */
    private final C13724c0.C13725a<C14140t0> f64269A;

    /* renamed from: g */
    private final C13832i f64270g;

    /* renamed from: o */
    private final String f64271o;

    /* renamed from: p */
    private final String f64272p;

    /* renamed from: s */
    private final Object f64273s;

    /* renamed from: z */
    private final C13724c0.C13726b<Field> f64274z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v$a;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/f;", "", "Lxa/h;", "Lkotlin/reflect/jvm/internal/v;", "z", "()Lkotlin/reflect/jvm/internal/v;", "property", "Lkotlin/reflect/jvm/internal/i;", "t", "()Lkotlin/reflect/jvm/internal/i;", "container", "Lkotlin/reflect/jvm/internal/calls/d;", "u", "()Lkotlin/reflect/jvm/internal/calls/d;", "defaultCaller", "", "x", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/s0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$a */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C15086a<PropertyType, ReturnType> extends C13792f<ReturnType> implements C16879h<ReturnType> {
        public boolean isExternal() {
            return mo74374y().isExternal();
        }

        public boolean isInfix() {
            return mo74374y().isInfix();
        }

        public boolean isInline() {
            return mo74374y().isInline();
        }

        public boolean isOperator() {
            return mo74374y().isOperator();
        }

        public boolean isSuspend() {
            return mo74374y().isSuspend();
        }

        /* renamed from: t */
        public C13832i mo72035t() {
            return mo74315z().mo72035t();
        }

        /* renamed from: u */
        public C13738d<?> mo72036u() {
            return null;
        }

        /* renamed from: x */
        public boolean mo72039x() {
            return mo74315z().mo72039x();
        }

        /* renamed from: y */
        public abstract C14126s0 mo74374y();

        /* renamed from: z */
        public abstract C15085v<PropertyType> mo74315z();
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v$b;", "", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$b */
    /* compiled from: KPropertyImpl.kt */
    public static final class C15087b {
        private C15087b() {
        }

        public /* synthetic */ C15087b(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00118VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v$c;", "V", "Lkotlin/reflect/jvm/internal/v$a;", "", "", "toString", "other", "", "equals", "", "hashCode", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "g", "Lkotlin/reflect/jvm/internal/c0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/d;", "o", "Lkotlin/reflect/jvm/internal/c0$b;", "s", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$c */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C15088c<V> extends C15086a<V, V> {

        /* renamed from: p */
        static final /* synthetic */ C16887m<Object>[] f64275p;

        /* renamed from: g */
        private final C13724c0.C13725a f64276g = C13724c0.m87973d(new C15090b(this));

        /* renamed from: o */
        private final C13724c0.C13726b f64277o = C13724c0.m87971b(new C15089a(this));

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/d;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/d;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.v$c$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C15089a extends C13708q implements C16254a<C13738d<?>> {
            final /* synthetic */ C15088c<V> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15089a(C15088c<? extends V> cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final C13738d<?> invoke() {
                return C15096w.m93389a(this.this$0, true);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/u0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.v$c$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C15090b extends C13708q implements C16254a<C14142u0> {
            final /* synthetic */ C15088c<V> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15090b(C15088c<? extends V> cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final C14142u0 invoke() {
                C14142u0 f = this.this$0.mo74315z().mo72037v().mo72346f();
                return f == null ? C14602c.m91472d(this.this$0.mo74315z().mo72037v(), C13921g.f62330v.mo72251b()) : f;
            }
        }

        static {
            Class<C15088c> cls = C15088c.class;
            f64275p = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: A */
        public C14142u0 mo74374y() {
            Object b = this.f64276g.mo71982b(this, f64275p[0]);
            C13706o.m87928e(b, "<get-descriptor>(...)");
            return (C14142u0) b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C15088c) && C13706o.m87924a(mo74315z(), ((C15088c) obj).mo74315z());
        }

        public String getName() {
            return "<get-" + mo74315z().getName() + '>';
        }

        public int hashCode() {
            return mo74315z().hashCode();
        }

        /* renamed from: s */
        public C13738d<?> mo72034s() {
            Object b = this.f64277o.mo71982b(this, f64275p[1]);
            C13706o.m87928e(b, "<get-caller>(...)");
            return (C13738d) b;
        }

        public String toString() {
            return "getter of " + mo74315z();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v$d;", "V", "Lkotlin/reflect/jvm/internal/v$a;", "Lja/u;", "", "", "toString", "other", "", "equals", "", "hashCode", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "g", "Lkotlin/reflect/jvm/internal/c0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/d;", "o", "Lkotlin/reflect/jvm/internal/c0$b;", "s", "()Lkotlin/reflect/jvm/internal/calls/d;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$d */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C15091d<V> extends C15086a<V, C13339u> {

        /* renamed from: p */
        static final /* synthetic */ C16887m<Object>[] f64278p;

        /* renamed from: g */
        private final C13724c0.C13725a f64279g = C13724c0.m87973d(new C15093b(this));

        /* renamed from: o */
        private final C13724c0.C13726b f64280o = C13724c0.m87971b(new C15092a(this));

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/d;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/d;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.v$d$a */
        /* compiled from: KPropertyImpl.kt */
        static final class C15092a extends C13708q implements C16254a<C13738d<?>> {
            final /* synthetic */ C15091d<V> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15092a(C15091d<V> dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* renamed from: a */
            public final C13738d<?> invoke() {
                return C15096w.m93389a(this.this$0, false);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/v0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.v$d$b */
        /* compiled from: KPropertyImpl.kt */
        static final class C15093b extends C13708q implements C16254a<C14144v0> {
            final /* synthetic */ C15091d<V> this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15093b(C15091d<V> dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* renamed from: a */
            public final C14144v0 invoke() {
                C14144v0 H = this.this$0.mo74315z().mo72037v().mo72334H();
                if (H != null) {
                    return H;
                }
                C14140t0 B = this.this$0.mo74315z().mo72037v();
                C13921g.C13922a aVar = C13921g.f62330v;
                return C14602c.m91473e(B, aVar.mo72251b(), aVar.mo72251b());
            }
        }

        static {
            Class<C15091d> cls = C15091d.class;
            f64278p = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: A */
        public C14144v0 mo74374y() {
            Object b = this.f64279g.mo71982b(this, f64278p[0]);
            C13706o.m87928e(b, "<get-descriptor>(...)");
            return (C14144v0) b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C15091d) && C13706o.m87924a(mo74315z(), ((C15091d) obj).mo74315z());
        }

        public String getName() {
            return "<set-" + mo74315z().getName() + '>';
        }

        public int hashCode() {
            return mo74315z().hashCode();
        }

        /* renamed from: s */
        public C13738d<?> mo72034s() {
            Object b = this.f64280o.mo71982b(this, f64278p[1]);
            C13706o.m87928e(b, "<get-caller>(...)");
            return (C13738d) b;
        }

        public String toString() {
            return "setter of " + mo74315z();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/t0;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$e */
    /* compiled from: KPropertyImpl.kt */
    static final class C15094e extends C13708q implements C16254a<C14140t0> {
        final /* synthetic */ C15085v<V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15094e(C15085v<? extends V> vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* renamed from: a */
        public final C14140t0 invoke() {
            return this.this$0.mo72035t().mo72092s(this.this$0.getName(), this.this$0.mo74368E());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"V", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.v$f */
    /* compiled from: KPropertyImpl.kt */
    static final class C15095f extends C13708q implements C16254a<Field> {
        final /* synthetic */ C15085v<V> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15095f(C15085v<? extends V> vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* renamed from: a */
        public final Field invoke() {
            Class<?> cls;
            C13783e f = C13802f0.f62018a.mo72050f(this.this$0.mo72037v());
            if (f instanceof C13783e.C13786c) {
                C13783e.C13786c cVar = (C13783e.C13786c) f;
                C14140t0 b = cVar.mo72019b();
                C15831d.C15832a d = C15841i.m95457d(C15841i.f65291a, cVar.mo72021e(), cVar.mo72020d(), cVar.mo72023g(), false, 8, (Object) null);
                if (d == null) {
                    return null;
                }
                C15085v<V> vVar = this.this$0;
                if (C14218k.m89804e(b) || C15841i.m95458f(cVar.mo72021e())) {
                    cls = vVar.mo72035t().mo71931e().getEnclosingClass();
                } else {
                    C14064m b2 = b.mo62163b();
                    if (b2 instanceof C13948e) {
                        cls = C13841i0.m88210o((C13948e) b2);
                    } else {
                        cls = vVar.mo72035t().mo71931e();
                    }
                }
                if (cls == null) {
                    return null;
                }
                try {
                    return cls.getDeclaredField(d.mo75610c());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            } else if (f instanceof C13783e.C13784a) {
                return ((C13783e.C13784a) f).mo72016b();
            } else {
                if ((f instanceof C13783e.C13785b) || (f instanceof C13783e.C13787d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private C15085v(C13832i iVar, String str, String str2, C14140t0 t0Var, Object obj) {
        this.f64270g = iVar;
        this.f64271o = str;
        this.f64272p = str2;
        this.f64273s = obj;
        C13724c0.C13726b<Field> b = C13724c0.m87971b(new C15095f(this));
        C13706o.m87928e(b, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f64274z = b;
        C13724c0.C13725a<C14140t0> c = C13724c0.m87972c(t0Var, new C15094e(this));
        C13706o.m87928e(c, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f64269A = c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo74365A(Member member, Object obj, Object obj2) {
        try {
            Object obj3 = f64268C;
            if ((obj == obj3 || obj2 == obj3) && mo72037v().mo72232P() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object z = mo72039x() ? mo74373z() : obj;
            if (!(z != obj3)) {
                z = null;
            }
            if (!mo72039x()) {
                obj = obj2;
            }
            if (!(obj != obj3)) {
                obj = null;
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(z);
            }
            if (member instanceof Method) {
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke((Object) null, new Object[0]);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    Object[] objArr = new Object[1];
                    if (z == null) {
                        Class cls = ((Method) member).getParameterTypes()[0];
                        C13706o.m87928e(cls, "fieldOrMethod.parameterTypes[0]");
                        z = C13841i0.m88201f(cls);
                    }
                    objArr[0] = z;
                    return method.invoke((Object) null, objArr);
                } else if (length == 2) {
                    Method method2 = (Method) member;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = z;
                    if (obj == null) {
                        Class cls2 = ((Method) member).getParameterTypes()[1];
                        C13706o.m87928e(cls2, "fieldOrMethod.parameterTypes[1]");
                        obj = C13841i0.m88201f(cls2);
                    }
                    objArr2[1] = obj;
                    return method2.invoke((Object) null, objArr2);
                } else {
                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    /* renamed from: B */
    public C14140t0 mo72037v() {
        C14140t0 invoke = this.f64269A.invoke();
        C13706o.m87928e(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: C */
    public abstract C15088c<V> mo74352C();

    /* renamed from: D */
    public final Field mo74367D() {
        return this.f64274z.invoke();
    }

    /* renamed from: E */
    public final String mo74368E() {
        return this.f64272p;
    }

    public boolean equals(Object obj) {
        C15085v<?> c = C13841i0.m88198c(obj);
        if (c != null && C13706o.m87924a(mo72035t(), c.mo72035t()) && C13706o.m87924a(getName(), c.getName()) && C13706o.m87924a(this.f64272p, c.f64272p) && C13706o.m87924a(this.f64273s, c.f64273s)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.f64271o;
    }

    public int hashCode() {
        return (((mo72035t().hashCode() * 31) + getName().hashCode()) * 31) + this.f64272p.hashCode();
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: s */
    public C13738d<?> mo72034s() {
        return mo74352C().mo72034s();
    }

    /* renamed from: t */
    public C13832i mo72035t() {
        return this.f64270g;
    }

    public String toString() {
        return C13788e0.f62008a.mo72029g(mo72037v());
    }

    /* renamed from: u */
    public C13738d<?> mo72036u() {
        return mo74352C().mo72036u();
    }

    /* renamed from: x */
    public boolean mo72039x() {
        return !C13706o.m87924a(this.f64273s, C13685e.NO_RECEIVER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Member mo74372y() {
        if (!mo72037v().mo72333A()) {
            return null;
        }
        C13783e f = C13802f0.f62018a.mo72050f(mo72037v());
        if (f instanceof C13783e.C13786c) {
            C13783e.C13786c cVar = (C13783e.C13786c) f;
            if (cVar.mo72022f().mo75448G()) {
                C15766a.C15771c B = cVar.mo72022f().mo75443B();
                if (!B.mo75430B() || !B.mo75429A()) {
                    return null;
                }
                return mo72035t().mo72091r(cVar.mo72020d().getString(B.mo75434z()), cVar.mo72020d().getString(B.mo75433y()));
            }
        }
        return mo74367D();
    }

    /* renamed from: z */
    public final Object mo74373z() {
        return C13768h.m88018a(this.f64273s, mo72037v());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15085v(C13832i iVar, String str, String str2, Object obj) {
        this(iVar, str, str2, (C14140t0) null, obj);
        C13706o.m87929f(iVar, "container");
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15085v(kotlin.reflect.jvm.internal.C13832i r8, kotlin.reflect.jvm.internal.impl.descriptors.C14140t0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            pb.f r0 = r9.getName()
            java.lang.String r3 = r0.mo78583d()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)
            kotlin.reflect.jvm.internal.f0 r0 = kotlin.reflect.jvm.internal.C13802f0.f62018a
            kotlin.reflect.jvm.internal.e r0 = r0.mo72050f(r9)
            java.lang.String r4 = r0.mo72015a()
            java.lang.Object r6 = kotlin.jvm.internal.C13685e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C15085v.<init>(kotlin.reflect.jvm.internal.i, kotlin.reflect.jvm.internal.impl.descriptors.t0):void");
    }
}
