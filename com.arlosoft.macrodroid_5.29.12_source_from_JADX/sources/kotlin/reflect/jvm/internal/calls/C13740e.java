package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13694h0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.calls.C13738d;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0015*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\b\n\u0013\u0007\u0015 !\"B5\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\b\u0010\u001a\u0001\u0007#$%&'()¨\u0006*"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "", "obj", "Lja/u;", "d", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "instanceClass", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "f", "g", "h", "Lkotlin/reflect/jvm/internal/calls/e$a;", "Lkotlin/reflect/jvm/internal/calls/e$b;", "Lkotlin/reflect/jvm/internal/calls/e$c;", "Lkotlin/reflect/jvm/internal/calls/e$e;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.e */
/* compiled from: CallerImpl.kt */
public abstract class C13740e<M extends Member> implements C13738d<M> {

    /* renamed from: e */
    public static final C13744d f61963e = new C13744d((C13695i) null);

    /* renamed from: a */
    private final M f61964a;

    /* renamed from: b */
    private final Type f61965b;

    /* renamed from: c */
    private final Class<?> f61966c;

    /* renamed from: d */
    private final List<Type> f61967d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$a;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/c;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$a */
    /* compiled from: CallerImpl.kt */
    public static final class C13741a extends C13740e<Constructor<?>> implements C13737c {

        /* renamed from: f */
        private final Object f61968f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C13741a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C13706o.m87929f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C13706o.m87928e(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x002b
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.C13593l.m87563j(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirstAndLast>"
                kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            L_0x002b:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f61968f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13741a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            C13694h0 h0Var = new C13694h0(3);
            h0Var.mo71949a(this.f61968f);
            h0Var.mo71950b(objArr);
            h0Var.mo71949a((Object) null);
            return ((Constructor) mo71985b()).newInstance(h0Var.mo71952d(new Object[h0Var.mo71951c()]));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$b;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$b */
    /* compiled from: CallerImpl.kt */
    public static final class C13742b extends C13740e<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C13742b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C13706o.m87929f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C13706o.m87928e(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x002a
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = kotlin.collections.C13593l.m87563j(r0, r2, r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropLast>"
                kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            L_0x002a:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13742b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            C13694h0 h0Var = new C13694h0(2);
            h0Var.mo71950b(objArr);
            h0Var.mo71949a((Object) null);
            return ((Constructor) mo71985b()).newInstance(h0Var.mo71952d(new Object[h0Var.mo71951c()]));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$c;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$c */
    /* compiled from: CallerImpl.kt */
    public static final class C13743c extends C13740e<Constructor<?>> implements C13737c {

        /* renamed from: f */
        private final Object f61969f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C13743c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C13706o.m87929f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C13706o.m87928e(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C13706o.m87928e(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f61969f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13743c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            C13694h0 h0Var = new C13694h0(2);
            h0Var.mo71949a(this.f61969f);
            h0Var.mo71950b(objArr);
            return ((Constructor) mo71985b()).newInstance(h0Var.mo71952d(new Object[h0Var.mo71951c()]));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$d;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$d */
    /* compiled from: CallerImpl.kt */
    public static final class C13744d {
        private C13744d() {
        }

        public /* synthetic */ C13744d(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$e;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Constructor;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$e */
    /* compiled from: CallerImpl.kt */
    public static final class C13745e extends C13740e<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C13745e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C13706o.m87929f(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                kotlin.jvm.internal.C13706o.m87928e(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                kotlin.jvm.internal.C13706o.m87928e(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13745e.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            return ((Constructor) mo71985b()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$f$a;", "Lkotlin/reflect/jvm/internal/calls/e$f$b;", "Lkotlin/reflect/jvm/internal/calls/e$f$c;", "Lkotlin/reflect/jvm/internal/calls/e$f$d;", "Lkotlin/reflect/jvm/internal/calls/e$f$e;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$f */
    /* compiled from: CallerImpl.kt */
    public static abstract class C13746f extends C13740e<Field> {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f$a;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$f$a */
        /* compiled from: CallerImpl.kt */
        public static final class C13747a extends C13746f implements C13737c {

            /* renamed from: f */
            private final Object f61970f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13747a(Field field, Object obj) {
                super(field, false, (C13695i) null);
                C13706o.m87929f(field, "field");
                this.f61970f = obj;
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                return ((Field) mo71985b()).get(this.f61970f);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f$b;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$f$b */
        /* compiled from: CallerImpl.kt */
        public static final class C13748b extends C13746f implements C13737c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13748b(Field field) {
                super(field, false, (C13695i) null);
                C13706o.m87929f(field, "field");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f$c;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$f$c */
        /* compiled from: CallerImpl.kt */
        public static final class C13749c extends C13746f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13749c(Field field) {
                super(field, true, (C13695i) null);
                C13706o.m87929f(field, "field");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f$d;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "", "args", "Lja/u;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$f$d */
        /* compiled from: CallerImpl.kt */
        public static final class C13750d extends C13746f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13750d(Field field) {
                super(field, true, (C13695i) null);
                C13706o.m87929f(field, "field");
            }

            /* renamed from: c */
            public void mo71994c(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                C13740e.super.mo71994c(objArr);
                mo71995d(C13596m.m87578C(objArr));
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$f$e;", "Lkotlin/reflect/jvm/internal/calls/e$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$f$e */
        /* compiled from: CallerImpl.kt */
        public static final class C13751e extends C13746f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13751e(Field field) {
                super(field, false, (C13695i) null);
                C13706o.m87929f(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C13746f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                kotlin.jvm.internal.C13706o.m87928e(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r8 = new java.lang.reflect.Type[r8]
                r4 = r8
                java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13746f.<init>(java.lang.reflect.Field, boolean):void");
        }

        public /* synthetic */ C13746f(Field field, boolean z, C13695i iVar) {
            this(field, z);
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            return ((Field) mo71985b()).get(mo71996e() != null ? C13596m.m87577B(objArr) : null);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0006\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Field;", "", "args", "Lja/u;", "c", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "b", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$g$a;", "Lkotlin/reflect/jvm/internal/calls/e$g$b;", "Lkotlin/reflect/jvm/internal/calls/e$g$c;", "Lkotlin/reflect/jvm/internal/calls/e$g$d;", "Lkotlin/reflect/jvm/internal/calls/e$g$e;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$g */
    /* compiled from: CallerImpl.kt */
    public static abstract class C13752g extends C13740e<Field> {

        /* renamed from: f */
        private final boolean f61971f;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g$a;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$g$a */
        /* compiled from: CallerImpl.kt */
        public static final class C13753a extends C13752g implements C13737c {

            /* renamed from: g */
            private final Object f61972g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13753a(Field field, boolean z, Object obj) {
                super(field, z, false, (C13695i) null);
                C13706o.m87929f(field, "field");
                this.f61972g = obj;
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                ((Field) mo71985b()).set(this.f61972g, C13596m.m87577B(objArr));
                return C13339u.f61331a;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g$b;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$g$b */
        /* compiled from: CallerImpl.kt */
        public static final class C13754b extends C13752g implements C13737c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13754b(Field field, boolean z) {
                super(field, z, false, (C13695i) null);
                C13706o.m87929f(field, "field");
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                ((Field) mo71985b()).set((Object) null, C13596m.m87591P(objArr));
                return C13339u.f61331a;
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g$c;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$g$c */
        /* compiled from: CallerImpl.kt */
        public static final class C13755c extends C13752g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13755c(Field field, boolean z) {
                super(field, z, true, (C13695i) null);
                C13706o.m87929f(field, "field");
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g$d;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "", "args", "Lja/u;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$g$d */
        /* compiled from: CallerImpl.kt */
        public static final class C13756d extends C13752g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13756d(Field field, boolean z) {
                super(field, z, true, (C13695i) null);
                C13706o.m87929f(field, "field");
            }

            /* renamed from: c */
            public void mo71994c(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                super.mo71994c(objArr);
                mo71995d(C13596m.m87578C(objArr));
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$g$e;", "Lkotlin/reflect/jvm/internal/calls/e$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$g$e */
        /* compiled from: CallerImpl.kt */
        public static final class C13757e extends C13752g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13757e(Field field, boolean z) {
                super(field, z, false, (C13695i) null);
                C13706o.m87929f(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C13752g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                kotlin.jvm.internal.C13706o.m87928e(r2, r0)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r0 = r7.getGenericType()
                java.lang.String r1 = "field.genericType"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                r4[r9] = r0
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f61971f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13752g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        public /* synthetic */ C13752g(Field field, boolean z, boolean z2, C13695i iVar) {
            this(field, z, z2);
        }

        /* renamed from: c */
        public void mo71994c(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            C13740e.super.mo71994c(objArr);
            if (this.f61971f && C13596m.m87591P(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo71994c(objArr);
            ((Field) mo71985b()).set(mo71996e() != null ? C13596m.m87577B(objArr) : null, C13596m.m87591P(objArr));
            return C13339u.f61331a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C13740e(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f61964a = r1
            r0.f61965b = r2
            r0.f61966c = r3
            if (r3 == 0) goto L_0x0027
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0
            r2 = 2
            r1.<init>(r2)
            r1.mo71949a(r3)
            r1.mo71950b(r4)
            int r2 = r1.mo71951c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.mo71952d(r2)
            java.util.List r1 = kotlin.collections.C13614t.m87751m(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r1 = kotlin.collections.C13596m.m87610i0(r4)
        L_0x002b:
            r0.f61967d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    public /* synthetic */ C13740e(Member member, Type type, Class cls, Type[] typeArr, C13695i iVar) {
        this(member, type, cls, typeArr);
    }

    /* renamed from: a */
    public List<Type> mo71984a() {
        return this.f61967d;
    }

    /* renamed from: b */
    public final M mo71985b() {
        return this.f61964a;
    }

    /* renamed from: c */
    public void mo71994c(Object[] objArr) {
        C13738d.C13739a.m88002a(this, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo71995d(Object obj) {
        if (obj == null || !this.f61964a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: e */
    public final Class<?> mo71996e() {
        return this.f61966c;
    }

    public final Type getReturnType() {
        return this.f61965b;
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0007B+\b\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/e$h$a;", "Lkotlin/reflect/jvm/internal/calls/e$h$b;", "Lkotlin/reflect/jvm/internal/calls/e$h$c;", "Lkotlin/reflect/jvm/internal/calls/e$h$d;", "Lkotlin/reflect/jvm/internal/calls/e$h$e;", "Lkotlin/reflect/jvm/internal/calls/e$h$f;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.e$h */
    /* compiled from: CallerImpl.kt */
    public static abstract class C13758h extends C13740e<Method> {

        /* renamed from: f */
        private final boolean f61973f;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$a;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$a */
        /* compiled from: CallerImpl.kt */
        public static final class C13759a extends C13758h implements C13737c {

            /* renamed from: g */
            private final Object f61974g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13759a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (C13695i) null);
                C13706o.m87929f(method, "method");
                this.f61974g = obj;
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                return mo71997f(this.f61974g, objArr);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$b;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$b */
        /* compiled from: CallerImpl.kt */
        public static final class C13760b extends C13758h implements C13737c {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13760b(Method method) {
                super(method, false, (Type[]) null, 4, (C13695i) null);
                C13706o.m87929f(method, "method");
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                return mo71997f((Object) null, objArr);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$c;", "Lkotlin/reflect/jvm/internal/calls/c;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$c */
        /* compiled from: CallerImpl.kt */
        public static final class C13761c extends C13758h implements C13737c {

            /* renamed from: g */
            private final Object f61975g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C13761c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C13706o.m87929f(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x0020
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.C13593l.m87563j(r0, r2, r1)
                    java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>"
                    kotlin.jvm.internal.C13706o.m87927d(r0, r1)
                L_0x0020:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f61975g = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13758h.C13761c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                C13694h0 h0Var = new C13694h0(2);
                h0Var.mo71949a(this.f61975g);
                h0Var.mo71950b(objArr);
                return mo71997f((Object) null, h0Var.mo71952d(new Object[h0Var.mo71951c()]));
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$d;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$d */
        /* compiled from: CallerImpl.kt */
        public static final class C13762d extends C13758h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13762d(Method method) {
                super(method, false, (Type[]) null, 6, (C13695i) null);
                C13706o.m87929f(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C13593l.m87563j(objArr, 1, objArr.length);
                    C13706o.m87927d(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return mo71997f(obj, objArr2);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$e;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$e */
        /* compiled from: CallerImpl.kt */
        public static final class C13763e extends C13758h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13763e(Method method) {
                super(method, true, (Type[]) null, 4, (C13695i) null);
                C13706o.m87929f(method, "method");
            }

            public Object call(Object[] objArr) {
                Object[] objArr2;
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                mo71995d(C13596m.m87578C(objArr));
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C13593l.m87563j(objArr, 1, objArr.length);
                    C13706o.m87927d(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
                }
                return mo71997f((Object) null, objArr2);
            }
        }

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/e$h$f;", "Lkotlin/reflect/jvm/internal/calls/e$h;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
        /* renamed from: kotlin.reflect.jvm.internal.calls.e$h$f */
        /* compiled from: CallerImpl.kt */
        public static final class C13764f extends C13758h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13764f(Method method) {
                super(method, false, (Type[]) null, 6, (C13695i) null);
                C13706o.m87929f(method, "method");
            }

            public Object call(Object[] objArr) {
                C13706o.m87929f(objArr, "args");
                mo71994c(objArr);
                return mo71997f((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13758h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.C13695i r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            L_0x001b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13758h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.i):void");
        }

        public /* synthetic */ C13758h(Method method, boolean z, Type[] typeArr, C13695i iVar) {
            this(method, z, typeArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final Object mo71997f(Object obj, Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            return this.f61973f ? C13339u.f61331a : ((Method) mo71985b()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C13758h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                kotlin.jvm.internal.C13706o.m87928e(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C13706o.m87924a(r7, r8)
                r6.f61973f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13740e.C13758h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
