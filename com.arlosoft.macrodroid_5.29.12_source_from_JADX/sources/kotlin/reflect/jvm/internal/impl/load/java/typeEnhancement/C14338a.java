package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.load.java.C14160a;
import kotlin.reflect.jvm.internal.impl.load.java.C14164b;
import kotlin.reflect.jvm.internal.impl.load.java.C14406x;
import p218bc.C11134i;
import p218bc.C11140o;
import p218bc.C11141p;
import p362pb.C16153d;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a */
/* compiled from: AbstractSignatureParts.kt */
public abstract class C14338a<TAnnotation> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a */
    /* compiled from: AbstractSignatureParts.kt */
    private static final class C14339a {

        /* renamed from: a */
        private final C11134i f63115a;

        /* renamed from: b */
        private final C14406x f63116b;

        /* renamed from: c */
        private final C11140o f63117c;

        public C14339a(C11134i iVar, C14406x xVar, C11140o oVar) {
            this.f63115a = iVar;
            this.f63116b = xVar;
            this.f63117c = oVar;
        }

        /* renamed from: a */
        public final C14406x mo73000a() {
            return this.f63116b;
        }

        /* renamed from: b */
        public final C11134i mo73001b() {
            return this.f63115a;
        }

        /* renamed from: c */
        public final C11140o mo73002c() {
            return this.f63117c;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b */
    /* compiled from: AbstractSignatureParts.kt */
    static final class C14340b extends C13708q implements C16265l<Integer, C14348e> {
        final /* synthetic */ C14348e[] $computedResult;
        final /* synthetic */ C14396q $predefined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14340b(C14396q qVar, C14348e[] eVarArr) {
            super(1);
            this.$predefined = qVar;
            this.$computedResult = eVarArr;
        }

        /* renamed from: a */
        public final C14348e mo73003a(int i) {
            Map<Integer, C14348e> a;
            C14348e eVar;
            C14396q qVar = this.$predefined;
            if (qVar != null && (a = qVar.mo73084a()) != null && (eVar = a.get(Integer.valueOf(i))) != null) {
                return eVar;
            }
            C14348e[] eVarArr = this.$computedResult;
            return (i < 0 || i > C13596m.m87581F(eVarArr)) ? C14348e.f63126e.mo73019a() : eVarArr[i];
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo73003a(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$c */
    /* compiled from: AbstractSignatureParts.kt */
    static final class C14341c extends C13708q implements C16265l<TAnnotation, Boolean> {
        final /* synthetic */ C14338a<TAnnotation> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14341c(C14338a<TAnnotation> aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(TAnnotation tannotation) {
            C13706o.m87929f(tannotation, "$this$extractNullability");
            return Boolean.valueOf(this.this$0.mo72992r(tannotation));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$d */
    /* compiled from: AbstractSignatureParts.kt */
    static final class C14342d extends C13708q implements C16265l<C14339a, Iterable<? extends C14339a>> {
        final /* synthetic */ C11141p $this_with;
        final /* synthetic */ C14338a<TAnnotation> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14342d(C14338a<TAnnotation> aVar, C11141p pVar) {
            super(1);
            this.this$0 = aVar;
            this.$this_with = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r0 = r10.$this_with.mo62281L(r0);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14339a> invoke(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14339a r11) {
            /*
                r10 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C13706o.m87929f(r11, r0)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a<TAnnotation> r0 = r10.this$0
                boolean r0 = r0.mo72994u()
                r1 = 0
                if (r0 == 0) goto L_0x0027
                bc.i r0 = r11.mo73001b()
                if (r0 == 0) goto L_0x0023
                bc.p r2 = r10.$this_with
                bc.g r0 = r2.mo62281L(r0)
                if (r0 == 0) goto L_0x0023
                bc.p r2 = r10.$this_with
                bc.j r0 = r2.mo62272D0(r0)
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                if (r0 == 0) goto L_0x0027
                return r1
            L_0x0027:
                bc.i r0 = r11.mo73001b()
                if (r0 == 0) goto L_0x00a5
                bc.p r2 = r10.$this_with
                bc.n r0 = r2.mo62285T(r0)
                if (r0 == 0) goto L_0x00a5
                bc.p r2 = r10.$this_with
                java.util.List r0 = r2.mo62335z(r0)
                if (r0 == 0) goto L_0x00a5
                bc.p r2 = r10.$this_with
                bc.i r3 = r11.mo73001b()
                java.util.List r2 = r2.mo62306i(r3)
                bc.p r3 = r10.$this_with
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a<TAnnotation> r4 = r10.this$0
                java.util.Iterator r5 = r0.iterator()
                java.util.Iterator r6 = r2.iterator()
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r0 = kotlin.collections.C13616u.m87774u(r0, r8)
                int r2 = kotlin.collections.C13616u.m87774u(r2, r8)
                int r0 = java.lang.Math.min(r0, r2)
                r7.<init>(r0)
            L_0x0066:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x00a4
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x00a4
                java.lang.Object r0 = r5.next()
                java.lang.Object r2 = r6.next()
                bc.m r2 = (p218bc.C11138m) r2
                bc.o r0 = (p218bc.C11140o) r0
                boolean r8 = r3.mo62336z0(r2)
                if (r8 == 0) goto L_0x008e
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a
                kotlin.reflect.jvm.internal.impl.load.java.x r8 = r11.mo73000a()
                r2.<init>(r1, r8, r0)
                goto L_0x00a0
            L_0x008e:
                bc.i r2 = r3.mo62326u(r2)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r8 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a
                kotlin.reflect.jvm.internal.impl.load.java.x r9 = r11.mo73000a()
                kotlin.reflect.jvm.internal.impl.load.java.x r9 = r4.m90277c(r2, r9)
                r8.<init>(r2, r9, r0)
                r2 = r8
            L_0x00a0:
                r7.add(r2)
                goto L_0x0066
            L_0x00a4:
                r1 = r7
            L_0x00a5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14342d.invoke(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a):java.lang.Iterable");
        }
    }

    /* renamed from: B */
    private final C14353i m90274B(C14353i iVar, C14353i iVar2) {
        if (iVar == null) {
            return iVar2;
        }
        if (iVar2 == null) {
            return iVar;
        }
        if (iVar.mo73031d() && !iVar2.mo73031d()) {
            return iVar2;
        }
        if (iVar.mo73031d() || !iVar2.mo73031d()) {
            return (iVar.mo73030c().compareTo(iVar2.mo73030c()) >= 0 && iVar.mo73030c().compareTo(iVar2.mo73030c()) > 0) ? iVar : iVar2;
        }
        return iVar;
    }

    /* renamed from: C */
    private final List<C14339a> m90275C(C11134i iVar) {
        return m90280f(new C14339a(iVar, m90277c(iVar, mo72987m()), (C11140o) null), new C14342d(this, mo72995v()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C14406x m90277c(C11134i iVar, C14406x xVar) {
        return mo72983h().mo72672c(xVar, mo72984i(iVar));
    }

    /* renamed from: d */
    private final C14348e m90278d(C11134i iVar) {
        C14352h hVar;
        C14352h t = m90283t(iVar);
        C14350f fVar = null;
        if (t == null) {
            C11134i p = mo72990p(iVar);
            hVar = p != null ? m90283t(p) : null;
        } else {
            hVar = t;
        }
        C11141p v = mo72995v();
        C13871c cVar = C13871c.f62112a;
        if (cVar.mo72172l(mo72993s(v.mo62314m0(iVar)))) {
            fVar = C14350f.READ_ONLY;
        } else if (cVar.mo72171k(mo72993s(v.mo62301f0(iVar)))) {
            fVar = C14350f.MUTABLE;
        }
        boolean z = false;
        boolean z2 = mo72995v().mo62280K(iVar) || mo72981A(iVar);
        if (hVar != t) {
            z = true;
        }
        return new C14348e(hVar, fVar, z2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012a, code lost:
        if ((r0 != null && r0.mo72973c()) != false) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0154  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e m90279e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14339a r12) {
        /*
            r11 = this;
            bc.i r0 = r12.mo73001b()
            r1 = 0
            if (r0 != 0) goto L_0x0022
            bc.p r0 = r11.mo72995v()
            bc.o r2 = r12.mo73002c()
            if (r2 == 0) goto L_0x0016
            bc.u r0 = r0.mo62304h(r2)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            bc.u r2 = p218bc.C11149u.IN
            if (r0 != r2) goto L_0x0022
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e$a r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e.f63126e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r12 = r12.mo73019a()
            return r12
        L_0x0022:
            bc.o r0 = r12.mo73002c()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            bc.i r4 = r12.mo73001b()
            if (r4 == 0) goto L_0x0039
            java.lang.Iterable r4 = r11.mo72984i(r4)
            if (r4 != 0) goto L_0x003d
        L_0x0039:
            java.util.List r4 = kotlin.collections.C13614t.m87748j()
        L_0x003d:
            bc.p r5 = r11.mo72995v()
            bc.i r6 = r12.mo73001b()
            if (r6 == 0) goto L_0x0052
            bc.n r6 = r5.mo62285T(r6)
            if (r6 == 0) goto L_0x0052
            bc.o r5 = r5.mo62334y0(r6)
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            kotlin.reflect.jvm.internal.impl.load.java.b r6 = r11.mo72986l()
            kotlin.reflect.jvm.internal.impl.load.java.b r7 = kotlin.reflect.jvm.internal.impl.load.java.C14164b.TYPE_PARAMETER_BOUNDS
            if (r6 != r7) goto L_0x005d
            r6 = 1
            goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            if (r0 != 0) goto L_0x0061
            goto L_0x00ad
        L_0x0061:
            if (r6 != 0) goto L_0x00a5
            boolean r7 = r11.mo72989o()
            if (r7 == 0) goto L_0x00a5
            bc.i r7 = r12.mo73001b()
            if (r7 == 0) goto L_0x0077
            boolean r7 = r11.mo72996w(r7)
            if (r7 != r2) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r7 == 0) goto L_0x00a5
            java.lang.Iterable r7 = r11.mo72985k()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0087:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r7.next()
            kotlin.reflect.jvm.internal.impl.load.java.a r10 = r11.mo72983h()
            boolean r10 = r10.mo72678m(r9)
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x0087
            r8.add(r9)
            goto L_0x0087
        L_0x00a0:
            java.util.List r4 = kotlin.collections.C13566b0.m87442q0(r8, r4)
            goto L_0x00ad
        L_0x00a5:
            java.lang.Iterable r7 = r11.mo72985k()
            java.util.List r4 = kotlin.collections.C13566b0.m87440o0(r7, r4)
        L_0x00ad:
            kotlin.reflect.jvm.internal.impl.load.java.a r7 = r11.mo72983h()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f r7 = r7.mo72673e(r4)
            kotlin.reflect.jvm.internal.impl.load.java.a r8 = r11.mo72983h()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$c r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$c
            r9.<init>(r11)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r4 = r8.mo72674f(r4, r9)
            if (r4 == 0) goto L_0x00de
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = r4.mo73030c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = r4.mo73030c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            if (r1 != r6) goto L_0x00d5
            if (r5 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r2 = 0
        L_0x00d6:
            boolean r1 = r4.mo73031d()
            r12.<init>(r0, r7, r2, r1)
            return r12
        L_0x00de:
            if (r0 != 0) goto L_0x00e6
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00e3:
            kotlin.reflect.jvm.internal.impl.load.java.b r0 = kotlin.reflect.jvm.internal.impl.load.java.C14164b.TYPE_USE
            goto L_0x00ea
        L_0x00e6:
            kotlin.reflect.jvm.internal.impl.load.java.b r0 = r11.mo72986l()
        L_0x00ea:
            kotlin.reflect.jvm.internal.impl.load.java.x r4 = r12.mo73000a()
            if (r4 == 0) goto L_0x00f5
            kotlin.reflect.jvm.internal.impl.load.java.q r0 = r4.mo73098a(r0)
            goto L_0x00f6
        L_0x00f5:
            r0 = r1
        L_0x00f6:
            if (r5 == 0) goto L_0x00fd
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r4 = r11.m90282j(r5)
            goto L_0x00fe
        L_0x00fd:
            r4 = r1
        L_0x00fe:
            r6 = 2
            if (r4 == 0) goto L_0x0109
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i.m90345b(r4, r8, r3, r6, r1)
            if (r8 != 0) goto L_0x0111
        L_0x0109:
            if (r0 == 0) goto L_0x0110
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r8 = r0.mo72974d()
            goto L_0x0111
        L_0x0110:
            r8 = r1
        L_0x0111:
            if (r4 == 0) goto L_0x0118
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = r4.mo73030c()
            goto L_0x0119
        L_0x0118:
            r4 = r1
        L_0x0119:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
            if (r4 == r9) goto L_0x012f
            if (r5 == 0) goto L_0x012d
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.mo72973c()
            if (r0 != r2) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            if (r0 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = 0
            goto L_0x0130
        L_0x012f:
            r0 = 1
        L_0x0130:
            bc.o r12 = r12.mo73002c()
            if (r12 == 0) goto L_0x014b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r12 = r11.m90282j(r12)
            if (r12 == 0) goto L_0x014b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = r12.mo73030c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            if (r4 != r5) goto L_0x014c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.FORCE_FLEXIBILITY
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i.m90345b(r12, r4, r3, r6, r1)
            goto L_0x014c
        L_0x014b:
            r12 = r1
        L_0x014c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r12 = r11.m90274B(r12, r8)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e
            if (r12 == 0) goto L_0x0158
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = r12.mo73030c()
        L_0x0158:
            if (r12 == 0) goto L_0x0161
            boolean r12 = r12.mo73031d()
            if (r12 != r2) goto L_0x0161
            goto L_0x0162
        L_0x0161:
            r2 = 0
        L_0x0162:
            r4.<init>(r1, r7, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.m90279e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e");
    }

    /* renamed from: f */
    private final <T> List<T> m90280f(T t, C16265l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        m90281g(t, arrayList, lVar);
        return arrayList;
    }

    /* renamed from: g */
    private final <T> void m90281g(T t, List<T> list, C16265l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t);
        Iterable<Object> iterable = (Iterable) lVar.invoke(t);
        if (iterable != null) {
            for (Object g : iterable) {
                m90281g(g, list, lVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00b3 A[EDGE_INSN: B:85:0x00b3->B:55:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i m90282j(p218bc.C11140o r8) {
        /*
            r7 = this;
            bc.p r0 = r7.mo72995v()
            boolean r1 = r7.mo72999z(r8)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            java.util.List r8 = r0.mo62283O(r8)
            boolean r1 = r8 instanceof java.util.Collection
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001e
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x001e
        L_0x001c:
            r5 = 1
            goto L_0x0035
        L_0x001e:
            java.util.Iterator r5 = r8.iterator()
        L_0x0022:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x001c
            java.lang.Object r6 = r5.next()
            bc.i r6 = (p218bc.C11134i) r6
            boolean r6 = r0.mo62310k(r6)
            if (r6 != 0) goto L_0x0022
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            return r2
        L_0x0038:
            if (r1 == 0) goto L_0x0042
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x0042
        L_0x0040:
            r5 = 0
            goto L_0x005e
        L_0x0042:
            java.util.Iterator r5 = r8.iterator()
        L_0x0046:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r5.next()
            bc.i r6 = (p218bc.C11134i) r6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = r7.m90283t(r6)
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x0046
            r5 = 1
        L_0x005e:
            if (r5 == 0) goto L_0x0062
            r1 = r8
            goto L_0x00a9
        L_0x0062:
            if (r1 == 0) goto L_0x006c
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x006c
        L_0x006a:
            r1 = 0
            goto L_0x0088
        L_0x006c:
            java.util.Iterator r1 = r8.iterator()
        L_0x0070:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r1.next()
            bc.i r5 = (p218bc.C11134i) r5
            bc.i r5 = r7.mo72990p(r5)
            if (r5 == 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r5 == 0) goto L_0x0070
            r1 = 1
        L_0x0088:
            if (r1 == 0) goto L_0x00db
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L_0x0093:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r2.next()
            bc.i r5 = (p218bc.C11134i) r5
            bc.i r5 = r7.mo72990p(r5)
            if (r5 == 0) goto L_0x0093
            r1.add(r5)
            goto L_0x0093
        L_0x00a9:
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00b5
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b5
        L_0x00b3:
            r0 = 1
            goto L_0x00cc
        L_0x00b5:
            java.util.Iterator r2 = r1.iterator()
        L_0x00b9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r2.next()
            bc.i r5 = (p218bc.C11134i) r5
            boolean r5 = r0.mo62327u0(r5)
            if (r5 != 0) goto L_0x00b9
            r0 = 0
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NULLABLE
            goto L_0x00d3
        L_0x00d1:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h.NOT_NULL
        L_0x00d3:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            if (r1 == r8) goto L_0x00d8
            r3 = 1
        L_0x00d8:
            r2.<init>(r0, r3)
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.m90282j(bc.o):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i");
    }

    /* renamed from: t */
    private final C14352h m90283t(C11134i iVar) {
        C11141p v = mo72995v();
        if (v.mo62332x0(v.mo62314m0(iVar))) {
            return C14352h.NULLABLE;
        }
        if (!v.mo62332x0(v.mo62301f0(iVar))) {
            return C14352h.NOT_NULL;
        }
        return null;
    }

    /* renamed from: A */
    public abstract boolean mo72981A(C11134i iVar);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r10 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r8 = r8.mo73001b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p370qa.C16265l<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e> mo72982b(p218bc.C11134i r10, java.lang.Iterable<? extends p218bc.C11134i> r11, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14396q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.util.List r0 = r9.m90275C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C13616u.m87774u(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            bc.i r3 = (p218bc.C11134i) r3
            java.util.List r3 = r9.m90275C(r3)
            r1.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r2 = r9.mo72991q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x006b
            boolean r2 = r9.mo72997x()
            if (r2 == 0) goto L_0x0069
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L_0x004e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            r10 = 0
            goto L_0x0066
        L_0x004e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0052:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r11.next()
            bc.i r2 = (p218bc.C11134i) r2
            boolean r2 = r9.mo72998y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0052
            r10 = 1
        L_0x0066:
            if (r10 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r10 = 0
            goto L_0x006c
        L_0x006b:
            r10 = 1
        L_0x006c:
            if (r10 == 0) goto L_0x0070
            r10 = 1
            goto L_0x0074
        L_0x0070:
            int r10 = r0.size()
        L_0x0074:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14348e[r10]
            r2 = 0
        L_0x0077:
            if (r2 >= r10) goto L_0x00d1
            java.lang.Object r5 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14339a) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = r9.m90279e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x008c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.C13566b0.m87425Z(r8, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.C14339a) r8
            if (r8 == 0) goto L_0x00ab
            bc.i r8 = r8.mo73001b()
            if (r8 == 0) goto L_0x00ab
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r8 = r9.m90278d(r8)
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            if (r8 == 0) goto L_0x008c
            r6.add(r8)
            goto L_0x008c
        L_0x00b2:
            if (r2 != 0) goto L_0x00bc
            boolean r7 = r9.mo72997x()
            if (r7 == 0) goto L_0x00bc
            r7 = 1
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            if (r2 != 0) goto L_0x00c7
            boolean r8 = r9.mo72988n()
            if (r8 == 0) goto L_0x00c7
            r8 = 1
            goto L_0x00c8
        L_0x00c7:
            r8 = 0
        L_0x00c8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14399s.m90440a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x0077
        L_0x00d1:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14338a.mo72982b(bc.i, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, boolean):qa.l");
    }

    /* renamed from: h */
    public abstract C14160a<TAnnotation> mo72983h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo72984i(C11134i iVar);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo72985k();

    /* renamed from: l */
    public abstract C14164b mo72986l();

    /* renamed from: m */
    public abstract C14406x mo72987m();

    /* renamed from: n */
    public abstract boolean mo72988n();

    /* renamed from: o */
    public abstract boolean mo72989o();

    /* renamed from: p */
    public abstract C11134i mo72990p(C11134i iVar);

    /* renamed from: q */
    public boolean mo72991q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo72992r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract C16153d mo72993s(C11134i iVar);

    /* renamed from: u */
    public abstract boolean mo72994u();

    /* renamed from: v */
    public abstract C11141p mo72995v();

    /* renamed from: w */
    public abstract boolean mo72996w(C11134i iVar);

    /* renamed from: x */
    public abstract boolean mo72997x();

    /* renamed from: y */
    public abstract boolean mo72998y(C11134i iVar, C11134i iVar2);

    /* renamed from: z */
    public abstract boolean mo72999z(C11140o oVar);
}
