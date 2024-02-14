package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.calls.C13738d;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eBA\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\t\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/a;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "jClass", "", "", "b", "Ljava/util/List;", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/a$a;", "c", "Lkotlin/reflect/jvm/internal/calls/a$a;", "callMode", "Ljava/lang/reflect/Method;", "d", "methods", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Lkotlin/reflect/jvm/internal/calls/a$b;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/a$a;Lkotlin/reflect/jvm/internal/calls/a$b;Ljava/util/List;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.a */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C13729a implements C13738d {

    /* renamed from: a */
    private final Class<?> f61944a;

    /* renamed from: b */
    private final List<String> f61945b;

    /* renamed from: c */
    private final C13730a f61946c;

    /* renamed from: d */
    private final List<Method> f61947d;

    /* renamed from: e */
    private final List<Type> f61948e;

    /* renamed from: f */
    private final List<Class<?>> f61949f;

    /* renamed from: g */
    private final List<Object> f61950g;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.a$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum C13730a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.a$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum C13731b {
        JAVA,
        KOTLIN
    }

    public C13729a(Class<?> cls, List<String> list, C13730a aVar, C13731b bVar, List<Method> list2) {
        C13706o.m87929f(cls, "jClass");
        C13706o.m87929f(list, "parameterNames");
        C13706o.m87929f(aVar, "callMode");
        C13706o.m87929f(bVar, "origin");
        C13706o.m87929f(list2, "methods");
        this.f61944a = cls;
        this.f61945b = list;
        this.f61946c = aVar;
        this.f61947d = list2;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f61948e = arrayList;
        List<Method> list3 = this.f61947d;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            C13706o.m87928e(returnType2, "it");
            Class<?> g = C14088d.m89403g(returnType2);
            if (g != null) {
                returnType2 = g;
            }
            arrayList2.add(returnType2);
        }
        this.f61949f = arrayList2;
        List<Method> list4 = this.f61947d;
        ArrayList arrayList3 = new ArrayList(C13616u.m87774u(list4, 10));
        for (Method defaultValue : list4) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f61950g = arrayList3;
        if (this.f61946c == C13730a.POSITIONAL_CALL && bVar == C13731b.JAVA && (!C13566b0.m87439n0(this.f61945b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    /* renamed from: a */
    public List<Type> mo71984a() {
        return this.f61948e;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo71985b() {
        return (Member) mo71988d();
    }

    /* renamed from: c */
    public void mo71986c(Object[] objArr) {
        C13738d.C13739a.m88002a(this, objArr);
    }

    public Object call(Object[] objArr) {
        Object obj;
        C13706o.m87929f(objArr, "args");
        mo71986c(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            int i3 = i2 + 1;
            if (obj2 == null && this.f61946c == C13730a.CALL_BY_NAME) {
                obj = this.f61950g.get(i2);
            } else {
                obj = C13732b.m87996l(obj2, this.f61949f.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                Void unused = C13732b.m87995k(i2, this.f61945b.get(i2), this.f61949f.get(i2));
                throw null;
            }
        }
        return C13732b.m87990f(this.f61944a, C13615t0.m87768r(C13566b0.m87413N0(this.f61945b, arrayList)), this.f61947d);
    }

    /* renamed from: d */
    public Void mo71988d() {
        return null;
    }

    public Type getReturnType() {
        return this.f61944a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13729a(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.C13729a.C13730a r9, kotlin.reflect.jvm.internal.calls.C13729a.C13731b r10, java.util.List r11, int r12, kotlin.jvm.internal.C13695i r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.C13616u.m87774u(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x002a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L_0x0013
        L_0x002a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13729a.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.a$a, kotlin.reflect.jvm.internal.calls.a$b, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
