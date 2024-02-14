package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.calls.C13738d;
import kotlin.reflect.jvm.internal.calls.C13740e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eB\u001f\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0001\u0002\u001b\u001c¨\u0006\u001d"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/d;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "b", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "e", "()Ljava/lang/reflect/Method;", "member", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Lkotlin/reflect/jvm/internal/calls/i$a;", "Lkotlin/reflect/jvm/internal/calls/i$b;", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.i */
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class C13769i implements C13738d<Method> {

    /* renamed from: a */
    private final Method f61982a;

    /* renamed from: b */
    private final List<Type> f61983b;

    /* renamed from: c */
    private final Type f61984c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/i$a;", "Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/c;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.i$a */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C13770a extends C13769i implements C13737c {

        /* renamed from: d */
        private final Object f61985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13770a(Method method, Object obj) {
            super(method, C13614t.m87748j(), (C13695i) null);
            C13706o.m87929f(method, "unboxMethod");
            this.f61985d = obj;
        }

        public Object call(Object[] objArr) {
            C13706o.m87929f(objArr, "args");
            mo72002d(objArr);
            return mo72001c(this.f61985d, objArr);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/i$b;", "Lkotlin/reflect/jvm/internal/calls/i;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.i$b */
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class C13771b extends C13769i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13771b(Method method) {
            super(method, C13612s.m87736e(method.getDeclaringClass()), (C13695i) null);
            C13706o.m87929f(method, "unboxMethod");
        }

        public Object call(Object[] objArr) {
            Object[] objArr2;
            C13706o.m87929f(objArr, "args");
            mo72002d(objArr);
            Object obj = objArr[0];
            C13740e.C13744d dVar = C13740e.f61963e;
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = C13593l.m87563j(objArr, 1, objArr.length);
                C13706o.m87927d(objArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.jvm.internal.calls.CallerImpl.Companion.dropFirst>");
            }
            return mo72001c(obj, objArr2);
        }
    }

    private C13769i(Method method, List<? extends Type> list) {
        this.f61982a = method;
        this.f61983b = list;
        Class<?> returnType = method.getReturnType();
        C13706o.m87928e(returnType, "unboxMethod.returnType");
        this.f61984c = returnType;
    }

    public /* synthetic */ C13769i(Method method, List list, C13695i iVar) {
        this(method, list);
    }

    /* renamed from: a */
    public final List<Type> mo71984a() {
        return this.f61983b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo72001c(Object obj, Object[] objArr) {
        C13706o.m87929f(objArr, "args");
        return this.f61982a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: d */
    public void mo72002d(Object[] objArr) {
        C13738d.C13739a.m88002a(this, objArr);
    }

    /* renamed from: e */
    public final Method mo71985b() {
        return null;
    }

    public final Type getReturnType() {
        return this.f61984c;
    }
}
