package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001b¨\u0006!"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/g;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lkotlin/reflect/jvm/internal/calls/d;", "caller", "", "b", "Z", "isDefault", "Lkotlin/reflect/jvm/internal/calls/g$a;", "c", "Lkotlin/reflect/jvm/internal/calls/g$a;", "data", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/d;Z)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.g */
/* compiled from: InlineClassAwareCaller.kt */
public final class C13766g<M extends Member> implements C13738d<M> {

    /* renamed from: a */
    private final C13738d<M> f61976a;

    /* renamed from: b */
    private final boolean f61977b;

    /* renamed from: c */
    private final C13767a f61978c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/g$a;", "", "Lwa/e;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "argumentRange", "<init>", "(Lwa/e;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.calls.g$a */
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class C13767a {

        /* renamed from: a */
        private final C16788e f61979a;

        /* renamed from: b */
        private final Method[] f61980b;

        /* renamed from: c */
        private final Method f61981c;

        public C13767a(C16788e eVar, Method[] methodArr, Method method) {
            C13706o.m87929f(eVar, "argumentRange");
            C13706o.m87929f(methodArr, "unbox");
            this.f61979a = eVar;
            this.f61980b = methodArr;
            this.f61981c = method;
        }

        /* renamed from: a */
        public final C16788e mo71998a() {
            return this.f61979a;
        }

        /* renamed from: b */
        public final Method[] mo71999b() {
            return this.f61980b;
        }

        /* renamed from: c */
        public final Method mo72000c() {
            return this.f61981c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if ((r12 instanceof kotlin.reflect.jvm.internal.calls.C13737c) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13766g(kotlin.reflect.jvm.internal.impl.descriptors.C13936b r11, kotlin.reflect.jvm.internal.calls.C13738d<? extends M> r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "caller"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            r10.<init>()
            r10.f61976a = r12
            r10.f61977b = r13
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r11.getReturnType()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            java.lang.Class r0 = kotlin.reflect.jvm.internal.calls.C13768h.m88026i(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.internal.calls.C13768h.m88021d(r0, r11)
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91642a(r11)
            r3 = 0
            if (r2 == 0) goto L_0x003b
            kotlin.reflect.jvm.internal.calls.g$a r11 = new kotlin.reflect.jvm.internal.calls.g$a
            wa.e$a r12 = p424wa.C16788e.f67768g
            wa.e r12 = r12.mo79778a()
            java.lang.reflect.Method[] r13 = new java.lang.reflect.Method[r3]
            r11.<init>(r12, r13, r0)
            goto L_0x0146
        L_0x003b:
            boolean r2 = r12 instanceof kotlin.reflect.jvm.internal.calls.C13740e.C13758h.C13761c
            java.lang.String r4 = "descriptor.containingDeclaration"
            r5 = -1
            r6 = 1
            if (r2 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            boolean r2 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14052l
            if (r2 == 0) goto L_0x004d
            boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.calls.C13737c
            if (r12 == 0) goto L_0x0067
            goto L_0x0068
        L_0x004d:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r11.mo72231L()
            if (r2 == 0) goto L_0x0067
            boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.calls.C13737c
            if (r12 != 0) goto L_0x0067
            kotlin.reflect.jvm.internal.impl.descriptors.m r12 = r11.mo62163b()
            kotlin.jvm.internal.C13706o.m87928e(r12, r4)
            boolean r12 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91643b(r12)
            if (r12 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r13 == 0) goto L_0x006c
            r12 = 2
            goto L_0x006d
        L_0x006c:
            r12 = 0
        L_0x006d:
            boolean r13 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14154y
            if (r13 == 0) goto L_0x007c
            r13 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.y r13 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r13
            boolean r13 = r13.isSuspend()
            if (r13 == 0) goto L_0x007c
            r13 = 1
            goto L_0x007d
        L_0x007c:
            r13 = 0
        L_0x007d:
            int r12 = r12 + r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r11.mo72232P()
            if (r2 == 0) goto L_0x008e
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r2.getType()
            goto L_0x008f
        L_0x008e:
            r2 = r1
        L_0x008f:
            if (r2 == 0) goto L_0x0095
            r13.add(r2)
            goto L_0x00d8
        L_0x0095:
            boolean r2 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14052l
            if (r2 == 0) goto L_0x00be
            r2 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.l r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C14052l) r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo72390d0()
            java.lang.String r4 = "descriptor.constructedClass"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            boolean r4 = r2.mo62182y()
            if (r4 == 0) goto L_0x00d8
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r2.mo62163b()
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r2, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            kotlin.reflect.jvm.internal.impl.types.m0 r2 = r2.mo72274p()
            r13.add(r2)
            goto L_0x00d8
        L_0x00be:
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r11.mo62163b()
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            boolean r4 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r4 == 0) goto L_0x00d8
            boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91643b(r2)
            if (r4 == 0) goto L_0x00d8
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            kotlin.reflect.jvm.internal.impl.types.m0 r2 = r2.mo72274p()
            r13.add(r2)
        L_0x00d8:
            java.util.List r2 = r11.mo72235g()
            java.lang.String r4 = "descriptor.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00f9
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r4
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = r4.getType()
            r13.add(r4)
            goto L_0x00e5
        L_0x00f9:
            int r2 = r13.size()
            int r2 = r2 + r5
            int r2 = r2 + r12
            int r12 = kotlin.reflect.jvm.internal.calls.C13765f.m88012a(r10)
            if (r12 != r2) goto L_0x0149
            int r12 = java.lang.Math.max(r5, r3)
            int r4 = r13.size()
            int r4 = r4 + r5
            wa.e r12 = p424wa.C16792h.m99549k(r12, r4)
            java.lang.reflect.Method[] r4 = new java.lang.reflect.Method[r2]
            r7 = 0
        L_0x0115:
            if (r7 >= r2) goto L_0x0141
            int r8 = r12.mo79764d()
            int r9 = r12.mo79766f()
            if (r7 > r9) goto L_0x0125
            if (r8 > r7) goto L_0x0125
            r8 = 1
            goto L_0x0126
        L_0x0125:
            r8 = 0
        L_0x0126:
            if (r8 == 0) goto L_0x013b
            int r8 = r7 - r5
            java.lang.Object r8 = r13.get(r8)
            kotlin.reflect.jvm.internal.impl.types.e0 r8 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r8
            java.lang.Class r8 = kotlin.reflect.jvm.internal.calls.C13768h.m88026i(r8)
            if (r8 == 0) goto L_0x013b
            java.lang.reflect.Method r8 = kotlin.reflect.jvm.internal.calls.C13768h.m88023f(r8, r11)
            goto L_0x013c
        L_0x013b:
            r8 = r1
        L_0x013c:
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0141:
            kotlin.reflect.jvm.internal.calls.g$a r11 = new kotlin.reflect.jvm.internal.calls.g$a
            r11.<init>(r12, r4, r0)
        L_0x0146:
            r10.f61978c = r11
            return
        L_0x0149:
            kotlin.reflect.jvm.internal.a0 r12 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r13.append(r0)
            int r0 = kotlin.reflect.jvm.internal.calls.C13765f.m88012a(r10)
            r13.append(r0)
            java.lang.String r0 = " != "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r0 = "\nCalling: "
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = "\nParameter types: "
            r13.append(r11)
            java.util.List r11 = r10.mo71984a()
            r13.append(r11)
            java.lang.String r11 = ")\nDefault: "
            r13.append(r11)
            boolean r11 = r10.f61977b
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13766g.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.calls.d, boolean):void");
    }

    /* renamed from: a */
    public List<Type> mo71984a() {
        return this.f61976a.mo71984a();
    }

    /* renamed from: b */
    public M mo71985b() {
        return this.f61976a.mo71985b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r10});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            kotlin.reflect.jvm.internal.calls.g$a r0 = r9.f61978c
            wa.e r1 = r0.mo71998a()
            java.lang.reflect.Method[] r2 = r0.mo71999b()
            java.lang.reflect.Method r0 = r0.mo72000c()
            int r3 = r10.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r4 = "copyOf(this, size)"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.C13706o.m87927d(r3, r4)
            int r4 = r1.mo79764d()
            int r1 = r1.mo79766f()
            r5 = 0
            if (r4 > r1) goto L_0x0050
        L_0x002d:
            r6 = r2[r4]
            r7 = r10[r4]
            if (r6 == 0) goto L_0x0049
            if (r7 == 0) goto L_0x003c
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r7 = r6.invoke(r7, r8)
            goto L_0x0049
        L_0x003c:
            java.lang.Class r6 = r6.getReturnType()
            java.lang.String r7 = "method.returnType"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)
            java.lang.Object r7 = kotlin.reflect.jvm.internal.C13841i0.m88201f(r6)
        L_0x0049:
            r3[r4] = r7
            if (r4 == r1) goto L_0x0050
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0050:
            kotlin.reflect.jvm.internal.calls.d<M> r10 = r9.f61976a
            java.lang.Object r10 = r10.call(r3)
            if (r0 == 0) goto L_0x0066
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r10
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r10 = r0
        L_0x0066:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.C13766g.call(java.lang.Object[]):java.lang.Object");
    }

    public Type getReturnType() {
        return this.f61976a.getReturnType();
    }
}
