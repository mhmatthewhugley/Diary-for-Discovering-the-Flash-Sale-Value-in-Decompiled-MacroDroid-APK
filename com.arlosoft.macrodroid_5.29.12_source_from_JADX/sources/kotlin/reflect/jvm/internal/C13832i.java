package kotlin.reflect.jvm.internal;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13688f;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.C13724c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.text.C15152h;
import kotlin.text.C15159j;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.commons.p353io.IOUtils;
import p242db.C11994e;
import p242db.C12001k;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/i;", "Lkotlin/jvm/internal/f;", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "B", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "E", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "D", "", "result", "desc", "isConstructor", "Lja/u;", "m", "z", "", "begin", "end", "C", "A", "Lpb/f;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "y", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "u", "index", "v", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "scope", "Lkotlin/reflect/jvm/internal/i$c;", "belonginess", "Lkotlin/reflect/jvm/internal/f;", "w", "signature", "s", "q", "r", "isMember", "p", "n", "o", "x", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "t", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "a", "b", "c", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.i */
/* compiled from: KDeclarationContainerImpl.kt */
public abstract class C13832i implements C13688f {

    /* renamed from: a */
    public static final C13833a f62047a = new C13833a((C13695i) null);

    /* renamed from: c */
    private static final Class<?> f62048c = C13695i.class;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C15159j f62049d = new C15159j("<v#(\\d+)>");

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/i$a;", "", "Lkotlin/text/j;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/j;", "a", "()Lkotlin/text/j;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$a */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C13833a {
        private C13833a() {
        }

        public /* synthetic */ C13833a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15159j mo72095a() {
            return C13832i.f62049d;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/i$b;", "", "Ldb/k;", "a", "Lkotlin/reflect/jvm/internal/c0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lkotlin/reflect/jvm/internal/i;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$b */
    /* compiled from: KDeclarationContainerImpl.kt */
    public abstract class C13834b {

        /* renamed from: c */
        static final /* synthetic */ C16887m<Object>[] f62050c = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C13834b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C13724c0.C13725a f62051a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Ldb/k;", "kotlin.jvm.PlatformType", "a", "()Ldb/k;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.i$b$a */
        /* compiled from: KDeclarationContainerImpl.kt */
        static final class C13835a extends C13708q implements C16254a<C12001k> {
            final /* synthetic */ C13832i this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13835a(C13832i iVar) {
                super(0);
                this.this$0 = iVar;
            }

            /* renamed from: a */
            public final C12001k invoke() {
                return C13721b0.m87962a(this.this$0.mo71931e());
            }
        }

        public C13834b() {
            this.f62051a = C13724c0.m87973d(new C13835a(C13832i.this));
        }

        /* renamed from: a */
        public final C12001k mo72096a() {
            Object b = this.f62051a.mo71982b(this, f62050c[0]);
            C13706o.m87928e(b, "<get-moduleData>(...)");
            return (C12001k) b;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/i$c;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "member", "", "d", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$c */
    /* compiled from: KDeclarationContainerImpl.kt */
    protected enum C13836c {
        DECLARED,
        INHERITED;

        /* renamed from: d */
        public final boolean mo72098d(C13936b bVar) {
            C13706o.m87929f(bVar, "member");
            return bVar.mo72264h().mo72265b() == (this == DECLARED);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/y;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$d */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C13837d extends C13708q implements C16265l<C14154y, CharSequence> {

        /* renamed from: a */
        public static final C13837d f62056a = new C13837d();

        C13837d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C14154y yVar) {
            C13706o.m87929f(yVar, "descriptor");
            return C14552c.f63486j.mo73527q(yVar) + " | " + C13802f0.f62018a.mo72051g(yVar).mo72005a();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/t0;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$e */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C13838e extends C13708q implements C16265l<C14140t0, CharSequence> {

        /* renamed from: a */
        public static final C13838e f62057a = new C13838e();

        C13838e() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C14140t0 t0Var) {
            C13706o.m87929f(t0Var, "descriptor");
            return C14552c.f63486j.mo73527q(t0Var) + " | " + C13802f0.f62018a.mo72050f(t0Var).mo72015a();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "kotlin.jvm.PlatformType", "first", "second", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u;Lkotlin/reflect/jvm/internal/impl/descriptors/u;)I"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$f */
    /* compiled from: KDeclarationContainerImpl.kt */
    static final class C13839f<T> implements Comparator {

        /* renamed from: a */
        public static final C13839f<T> f62058a = new C13839f<>();

        C13839f() {
        }

        /* renamed from: a */
        public final int compare(C14141u uVar, C14141u uVar2) {
            Integer d = C14127t.m89522d(uVar, uVar2);
            if (d == null) {
                return 0;
            }
            return d.intValue();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo71668d2 = {"kotlin/reflect/jvm/internal/i$g", "Lkotlin/reflect/jvm/internal/a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "descriptor", "Lja/u;", "data", "Lkotlin/reflect/jvm/internal/f;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lja/u;)Lkotlin/reflect/jvm/internal/f;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.i$g */
    /* compiled from: KDeclarationContainerImpl.kt */
    public static final class C13840g extends C13718a {
        C13840g(C13832i iVar) {
            super(iVar);
        }

        /* renamed from: r */
        public C13792f<?> mo72103j(C14052l lVar, C13339u uVar) {
            C13706o.m87929f(lVar, "descriptor");
            C13706o.m87929f(uVar, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    /* renamed from: A */
    private final Class<?> m88166A(String str) {
        return m88168C(str, C15177w.m93681Z(str, ')', 0, false, 6, (Object) null) + 1, str.length());
    }

    /* renamed from: B */
    private final Method m88167B(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Method B;
        if (z) {
            clsArr[0] = cls;
        }
        Method E = m88170E(cls, str, clsArr, cls2);
        if (E != null) {
            return E;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (B = m88167B(superclass, str, clsArr, cls2, z)) != null) {
            return B;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C13706o.m87928e(interfaces, "interfaces");
        for (Class<?> cls3 : interfaces) {
            C13706o.m87928e(cls3, "superInterface");
            Method B2 = m88167B(cls3, str, clsArr, cls2, z);
            if (B2 != null) {
                return B2;
            }
            if (z) {
                Class<?> a = C11994e.m82405a(C14088d.m89402f(cls3), cls3.getName() + "$DefaultImpls");
                if (a != null) {
                    clsArr[0] = cls3;
                    Method E2 = m88170E(a, str, clsArr, cls2);
                    if (E2 != null) {
                        return E2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    private final Class<?> m88168C(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader f = C14088d.m89402f(mo71931e());
            String substring = str.substring(i + 1, i2 - 1);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = f.loadClass(C15176v.m93629D(substring, '/', FilenameUtils.EXTENSION_SEPARATOR, false, 4, (Object) null));
            C13706o.m87928e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            return C13841i0.m88200e(m88168C(str, i + 1, i2));
        } else {
            if (charAt == 'V') {
                Class<?> cls = Void.TYPE;
                C13706o.m87928e(cls, "TYPE");
                return cls;
            } else if (charAt == 'Z') {
                return Boolean.TYPE;
            } else {
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                throw new C13719a0("Unknown type prefix in the method signature: " + str);
            }
        }
    }

    /* renamed from: D */
    private final Constructor<?> m88169D(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Class[] clsArr = (Class[]) array;
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: E */
    private final Method m88170E(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C13706o.m87924a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C13706o.m87928e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (C13706o.m87924a(method.getName(), str) && C13706o.m87924a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private final void m88172m(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> z2 = m88173z(str);
        list.addAll(z2);
        int size = ((z2.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            C13706o.m87928e(cls, "TYPE");
            list.add(cls);
        }
        if (z) {
            Class<?> cls2 = f62048c;
            list.remove(cls2);
            C13706o.m87928e(cls2, "DEFAULT_CONSTRUCTOR_MARKER");
            list.add(cls2);
            return;
        }
        list.add(Object.class);
    }

    /* renamed from: z */
    private final List<Class<?>> m88173z(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C15177w.m93661M("VZCBSIFJD", charAt, false, 2, (Object) null)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C15177w.m93681Z(str, ';', i2, false, 4, (Object) null) + 1;
            } else {
                throw new C13719a0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(m88168C(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: n */
    public final Constructor<?> mo72087n(String str) {
        C13706o.m87929f(str, "desc");
        return m88169D(mo71931e(), m88173z(str));
    }

    /* renamed from: o */
    public final Constructor<?> mo72088o(String str) {
        C13706o.m87929f(str, "desc");
        Class<?> e = mo71931e();
        ArrayList arrayList = new ArrayList();
        m88172m(arrayList, str, true);
        C13339u uVar = C13339u.f61331a;
        return m88169D(e, arrayList);
    }

    /* renamed from: p */
    public final Method mo72089p(String str, String str2, boolean z) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "desc");
        if (C13706o.m87924a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo71931e());
        }
        m88172m(arrayList, str2, false);
        Class<?> x = mo72094x();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return m88167B(x, str3, (Class[]) array, m88166A(str2), z);
    }

    /* renamed from: q */
    public final C14154y mo72090q(String str, String str2) {
        Iterable iterable;
        String str3;
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "signature");
        if (C13706o.m87924a(str, "<init>")) {
            iterable = C13566b0.m87402F0(mo71977t());
        } else {
            C16157f i = C16157f.m97019i(str);
            C13706o.m87928e(i, "identifier(name)");
            iterable = mo71978u(i);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            if (C13706o.m87924a(C13802f0.f62018a.mo72051g((C14154y) next).mo72005a(), str2)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (C14154y) C13566b0.m87446u0(arrayList);
        }
        String g0 = C13566b0.m87432g0(iterable2, IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C13837d.f62056a, 30, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (g0.length() != 0) {
            z = false;
        }
        if (z) {
            str3 = " no members found";
        } else {
            str3 = 10 + g0;
        }
        sb.append(str3);
        throw new C13719a0(sb.toString());
    }

    /* renamed from: r */
    public final Method mo72091r(String str, String str2) {
        Method B;
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "desc");
        if (C13706o.m87924a(str, "<init>")) {
            return null;
        }
        Object[] array = m88173z(str2).toArray(new Class[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class[] clsArr = (Class[]) array;
        Class<?> A = m88166A(str2);
        Method B2 = m88167B(mo72094x(), str, clsArr, A, false);
        if (B2 != null) {
            return B2;
        }
        if (!mo72094x().isInterface() || (B = m88167B(Object.class, str, clsArr, A, false)) == null) {
            return null;
        }
        return B;
    }

    /* renamed from: s */
    public final C14140t0 mo72092s(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C13706o.m87929f(str4, "name");
        C13706o.m87929f(str5, "signature");
        C15152h b = f62049d.mo74467b(str5);
        boolean z = true;
        if (b != null) {
            String str6 = b.mo74456a().mo74458a().mo74457b().get(1);
            C14140t0 v = mo71979v(Integer.parseInt(str6));
            if (v != null) {
                return v;
            }
            throw new C13719a0("Local property #" + str6 + " not found in " + mo71931e());
        }
        C16157f i = C16157f.m97019i(str);
        C13706o.m87928e(i, "identifier(name)");
        Collection<C14140t0> y = mo71980y(i);
        ArrayList arrayList = new ArrayList();
        for (T next : y) {
            if (C13706o.m87924a(C13802f0.f62018a.mo72050f((C14140t0) next).mo72015a(), str5)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            throw new C13719a0("Property '" + str4 + "' (JVM signature: " + str5 + ") not resolved in " + this);
        } else if (arrayList.size() == 1) {
            return (C14140t0) C13566b0.m87446u0(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                C14141u visibility = ((C14140t0) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = C13613s0.m87743h(linkedHashMap, C13839f.f62058a).values();
            C13706o.m87928e(values, "properties\n             …\n                }.values");
            List list = (List) C13566b0.m87433h0(values);
            if (list.size() == 1) {
                C13706o.m87928e(list, "mostVisibleProperties");
                return (C14140t0) C13566b0.m87422W(list);
            }
            C16157f i2 = C16157f.m97019i(str);
            C13706o.m87928e(i2, "identifier(name)");
            String g0 = C13566b0.m87432g0(mo71980y(i2), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C13838e.f62057a, 30, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append("Property '");
            sb.append(str4);
            sb.append("' (JVM signature: ");
            sb.append(str5);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            if (g0.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = " no members found";
            } else {
                str3 = 10 + g0;
            }
            sb.append(str3);
            throw new C13719a0(sb.toString());
        }
    }

    /* renamed from: t */
    public abstract Collection<C14052l> mo71977t();

    /* renamed from: u */
    public abstract Collection<C14154y> mo71978u(C16157f fVar);

    /* renamed from: v */
    public abstract C14140t0 mo71979v(int i);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.C13792f<?>> mo72093w(kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h r8, kotlin.reflect.jvm.internal.C13832i.C13836c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            kotlin.reflect.jvm.internal.i$g r0 = new kotlin.reflect.jvm.internal.i$g
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k.C14699a.m91887a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0053
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C14064m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13936b
            if (r4 == 0) goto L_0x004c
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13936b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.f62757h
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r5, r6)
            if (r5 != 0) goto L_0x004c
            boolean r4 = r9.mo72098d(r4)
            if (r4 == 0) goto L_0x004c
            ja.u r4 = p297ja.C13339u.f61331a
            java.lang.Object r3 = r3.mo72277x(r0, r4)
            kotlin.reflect.jvm.internal.f r3 = (kotlin.reflect.jvm.internal.C13792f) r3
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 == 0) goto L_0x001e
            r2.add(r3)
            goto L_0x001e
        L_0x0053:
            java.util.List r8 = kotlin.collections.C13566b0.m87402F0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C13832i.mo72093w(kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.i$c):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Class<?> mo72094x() {
        Class<?> g = C14088d.m89403g(mo71931e());
        return g == null ? mo71931e() : g;
    }

    /* renamed from: y */
    public abstract Collection<C14140t0> mo71980y(C16157f fVar);
}
