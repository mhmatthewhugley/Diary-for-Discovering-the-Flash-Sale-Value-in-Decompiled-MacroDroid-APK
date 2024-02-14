package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.C13832i;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w;
import p242db.C11995f;
import p263fb.C12256d;
import p297ja.C13328m;
import p297ja.C13336r;
import p298jb.C13359a;
import p308kb.C13488l;
import p308kb.C13494n;
import p308kb.C13524t;
import p327mb.C15722e;
import p327mb.C15724g;
import p336nb.C15766a;
import p349ob.C15834e;
import p349ob.C15836f;
import p349ob.C15841i;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16269p;
import p433xa.C16878g;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u00010B\u001f\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b.\u0010/J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010#\u001a\u0018\u0012\u0014\u0012\u0012  *\b\u0018\u00010\u001fR\u00020\u00000\u001fR\u00020\u00000\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00138TX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/o;", "Lkotlin/reflect/jvm/internal/i;", "Lpb/f;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "y", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "u", "", "index", "v", "", "other", "", "equals", "hashCode", "", "toString", "Ljava/lang/Class;", "f", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "g", "Ljava/lang/String;", "getUsageModuleName", "()Ljava/lang/String;", "usageModuleName", "Lkotlin/reflect/jvm/internal/c0$b;", "Lkotlin/reflect/jvm/internal/o$a;", "kotlin.jvm.PlatformType", "o", "Lkotlin/reflect/jvm/internal/c0$b;", "data", "x", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "t", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "a", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.o */
/* compiled from: KPackageImpl.kt */
public final class C15061o extends C13832i {

    /* renamed from: f */
    private final Class<?> f64241f;

    /* renamed from: g */
    private final String f64242g;

    /* renamed from: o */
    private final C13724c0.C13726b<C15062a> f64243o;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R/\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0004\u0010\u0018R%\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/o$a;", "Lkotlin/reflect/jvm/internal/i$b;", "Lkotlin/reflect/jvm/internal/i;", "Ldb/f;", "d", "Lkotlin/reflect/jvm/internal/c0$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/reflect/jvm/internal/c0$b;", "()Ljava/lang/Class;", "multifileFacade", "Lja/r;", "Lob/f;", "Lkb/l;", "Lob/e;", "g", "()Lja/r;", "metadata", "", "Lkotlin/reflect/jvm/internal/f;", "h", "getMembers", "()Ljava/util/Collection;", "members", "<init>", "(Lkotlin/reflect/jvm/internal/o;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.o$a */
    /* compiled from: KPackageImpl.kt */
    private final class C15062a extends C13832i.C13834b {

        /* renamed from: j */
        static final /* synthetic */ C16887m<Object>[] f64244j;

        /* renamed from: d */
        private final C13724c0.C13725a f64245d;

        /* renamed from: e */
        private final C13724c0.C13725a f64246e = C13724c0.m87973d(new C15067e(this));

        /* renamed from: f */
        private final C13724c0.C13726b f64247f;

        /* renamed from: g */
        private final C13724c0.C13726b f64248g;

        /* renamed from: h */
        private final C13724c0.C13725a f64249h;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Ldb/f;", "a", "()Ldb/f;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$a */
        /* compiled from: KPackageImpl.kt */
        static final class C15063a extends C13708q implements C16254a<C11995f> {
            final /* synthetic */ C15061o this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15063a(C15061o oVar) {
                super(0);
                this.this$0 = oVar;
            }

            /* renamed from: a */
            public final C11995f invoke() {
                return C11995f.f58195c.mo67435a(this.this$0.mo71931e());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "Lkotlin/reflect/jvm/internal/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$b */
        /* compiled from: KPackageImpl.kt */
        static final class C15064b extends C13708q implements C16254a<Collection<? extends C13792f<?>>> {
            final /* synthetic */ C15061o this$0;
            final /* synthetic */ C15062a this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15064b(C15061o oVar, C15062a aVar) {
                super(0);
                this.this$0 = oVar;
                this.this$1 = aVar;
            }

            /* renamed from: a */
            public final Collection<C13792f<?>> invoke() {
                return this.this$0.mo72093w(this.this$1.mo74332f(), C13832i.C13836c.DECLARED);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lja/r;", "Lob/f;", "Lkb/l;", "Lob/e;", "a", "()Lja/r;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$c */
        /* compiled from: KPackageImpl.kt */
        static final class C15065c extends C13708q implements C16254a<C13336r<? extends C15836f, ? extends C13488l, ? extends C15834e>> {
            final /* synthetic */ C15062a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15065c(C15062a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final C13336r<C15836f, C13488l, C15834e> invoke() {
                C13359a b;
                C11995f b2 = this.this$0.m93318c();
                if (b2 == null || (b = b2.mo67427b()) == null) {
                    return null;
                }
                String[] a = b.mo70760a();
                String[] g = b.mo70766g();
                if (a == null || g == null) {
                    return null;
                }
                C13328m<C15836f, C13488l> m = C15841i.m95465m(a, g);
                return new C13336r<>(m.mo70152a(), m.mo70153b(), b.mo70763d());
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Ljava/lang/Class;", "a", "()Ljava/lang/Class;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$d */
        /* compiled from: KPackageImpl.kt */
        static final class C15066d extends C13708q implements C16254a<Class<?>> {
            final /* synthetic */ C15062a this$0;
            final /* synthetic */ C15061o this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15066d(C15062a aVar, C15061o oVar) {
                super(0);
                this.this$0 = aVar;
                this.this$1 = oVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
                r0 = r0.mo67427b();
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Class<?> invoke() {
                /*
                    r8 = this;
                    kotlin.reflect.jvm.internal.o$a r0 = r8.this$0
                    db.f r0 = r0.m93318c()
                    r1 = 0
                    if (r0 == 0) goto L_0x0015
                    jb.a r0 = r0.mo67427b()
                    if (r0 == 0) goto L_0x0015
                    java.lang.String r0 = r0.mo70764e()
                    r2 = r0
                    goto L_0x0016
                L_0x0015:
                    r2 = r1
                L_0x0016:
                    if (r2 == 0) goto L_0x003c
                    int r0 = r2.length()
                    if (r0 <= 0) goto L_0x0020
                    r0 = 1
                    goto L_0x0021
                L_0x0020:
                    r0 = 0
                L_0x0021:
                    if (r0 == 0) goto L_0x003c
                    kotlin.reflect.jvm.internal.o r0 = r8.this$1
                    java.lang.Class r0 = r0.mo71931e()
                    java.lang.ClassLoader r0 = r0.getClassLoader()
                    r3 = 47
                    r4 = 46
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    java.lang.String r1 = kotlin.text.C15176v.m93629D(r2, r3, r4, r5, r6, r7)
                    java.lang.Class r1 = r0.loadClass(r1)
                L_0x003c:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C15061o.C15062a.C15066d.invoke():java.lang.Class");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.o$a$e */
        /* compiled from: KPackageImpl.kt */
        static final class C15067e extends C13708q implements C16254a<C14692h> {
            final /* synthetic */ C15062a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15067e(C15062a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final C14692h invoke() {
                C11995f b = this.this$0.m93318c();
                if (b != null) {
                    return this.this$0.mo72096a().mo67443c().mo67418a(b);
                }
                return C14692h.C14695b.f63726b;
            }
        }

        static {
            Class<C15062a> cls = C15062a.class;
            f64244j = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "metadata", "getMetadata()Lkotlin/Triple;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public C15062a() {
            super();
            this.f64245d = C13724c0.m87973d(new C15063a(C15061o.this));
            this.f64247f = C13724c0.m87971b(new C15066d(this, C15061o.this));
            this.f64248g = C13724c0.m87971b(new C15065c(this));
            this.f64249h = C13724c0.m87973d(new C15064b(C15061o.this, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C11995f m93318c() {
            return (C11995f) this.f64245d.mo71982b(this, f64244j[0]);
        }

        /* renamed from: d */
        public final C13336r<C15836f, C13488l, C15834e> mo74330d() {
            return (C13336r) this.f64248g.mo71982b(this, f64244j[3]);
        }

        /* renamed from: e */
        public final Class<?> mo74331e() {
            return (Class) this.f64247f.mo71982b(this, f64244j[2]);
        }

        /* renamed from: f */
        public final C14692h mo74332f() {
            Object b = this.f64246e.mo71982b(this, f64244j[1]);
            C13706o.m87928e(b, "<get-scope>(...)");
            return (C14692h) b;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/o$a;", "Lkotlin/reflect/jvm/internal/o;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/o$a;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.o$b */
    /* compiled from: KPackageImpl.kt */
    static final class C15068b extends C13708q implements C16254a<C15062a> {
        final /* synthetic */ C15061o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15068b(C15061o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* renamed from: a */
        public final C15062a invoke() {
            return new C15062a();
        }
    }

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.o$c */
    /* compiled from: KPackageImpl.kt */
    /* synthetic */ class C15069c extends C13703l implements C16269p<C14814w, C13494n, C14140t0> {

        /* renamed from: a */
        public static final C15069c f64251a = new C15069c();

        C15069c() {
            super(2);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14814w.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: l */
        public final C14140t0 invoke(C14814w wVar, C13494n nVar) {
            C13706o.m87929f(wVar, "p0");
            C13706o.m87929f(nVar, "p1");
            return wVar.mo74011l(nVar);
        }
    }

    public C15061o(Class<?> cls, String str) {
        C13706o.m87929f(cls, "jClass");
        this.f64241f = cls;
        this.f64242g = str;
        C13724c0.C13726b<C15062a> b = C13724c0.m87971b(new C15068b(this));
        C13706o.m87928e(b, "lazy { Data() }");
        this.f64243o = b;
    }

    /* renamed from: F */
    private final C14692h m93310F() {
        return this.f64243o.invoke().mo74332f();
    }

    /* renamed from: e */
    public Class<?> mo71931e() {
        return this.f64241f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15061o) && C13706o.m87924a(mo71931e(), ((C15061o) obj).mo71931e());
    }

    public int hashCode() {
        return mo71931e().hashCode();
    }

    /* renamed from: t */
    public Collection<C14052l> mo71977t() {
        return C13614t.m87748j();
    }

    public String toString() {
        return "file class " + C14088d.m89397a(mo71931e()).mo78544b();
    }

    /* renamed from: u */
    public Collection<C14154y> mo71978u(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return m93310F().mo72450c(fVar, C12256d.FROM_REFLECTION);
    }

    /* renamed from: v */
    public C14140t0 mo71979v(int i) {
        C13336r<C15836f, C13488l, C15834e> d = this.f64243o.invoke().mo74330d();
        if (d == null) {
            return null;
        }
        C15836f a = d.mo70170a();
        C13488l b = d.mo70171b();
        C15834e c = d.mo70172c();
        C14495h.C14502f<C13488l, List<C13494n>> fVar = C15766a.f65124n;
        C13706o.m87928e(fVar, "packageLocalVariable");
        C13494n nVar = (C13494n) C15722e.m95027b(b, fVar, i);
        if (nVar == null) {
            return null;
        }
        Class<?> e = mo71931e();
        C13524t Z = b.mo71310Z();
        C13706o.m87928e(Z, "packageProto.typeTable");
        return (C14140t0) C13841i0.m88202g(e, nVar, a, new C15724g(Z), c, C15069c.f64251a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Class<?> mo72094x() {
        Class<?> e = this.f64243o.invoke().mo74331e();
        return e == null ? mo71931e() : e;
    }

    /* renamed from: y */
    public Collection<C14140t0> mo71980y(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return m93310F().mo72451d(fVar, C12256d.FROM_REFLECTION);
    }
}
