package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13871c;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14125s;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13913a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.load.java.C14164b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14237e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14944l0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import p225cc.C11170a;
import p288ib.C12479a;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l */
/* compiled from: signatureEnhancement.kt */
public final class C14384l {

    /* renamed from: a */
    private final C14345d f63148a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$a */
    /* compiled from: signatureEnhancement.kt */
    static final class C14385a extends C13708q implements C16265l<C14967q1, Boolean> {

        /* renamed from: a */
        public static final C14385a f63149a = new C14385a();

        C14385a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14967q1 q1Var) {
            C13961h c = q1Var.mo73702N0().mo62183c();
            if (c == null) {
                return Boolean.FALSE;
            }
            C16157f name = c.getName();
            C13871c cVar = C13871c.f62112a;
            return Boolean.valueOf(C13706o.m87924a(name, cVar.mo72169h().mo78562g()) && C13706o.m87924a(C16519a.m98611d(c), cVar.mo72169h()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$b */
    /* compiled from: signatureEnhancement.kt */
    static final class C14386b extends C13708q implements C16265l<C13936b, C14900e0> {

        /* renamed from: a */
        public static final C14386b f63150a = new C14386b();

        C14386b() {
            super(1);
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            C14146w0 P = bVar.mo72232P();
            C13706o.m87926c(P);
            C14900e0 type = P.getType();
            C13706o.m87928e(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$c */
    /* compiled from: signatureEnhancement.kt */
    static final class C14387c extends C13708q implements C16265l<C13936b, C14900e0> {

        /* renamed from: a */
        public static final C14387c f63151a = new C14387c();

        C14387c() {
            super(1);
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            C14900e0 returnType = bVar.getReturnType();
            C13706o.m87926c(returnType);
            return returnType;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$d */
    /* compiled from: signatureEnhancement.kt */
    static final class C14388d extends C13708q implements C16265l<C13936b, C14900e0> {

        /* renamed from: $p */
        final /* synthetic */ C13966i1 f63152$p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14388d(C13966i1 i1Var) {
            super(1);
            this.f63152$p = i1Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            C14900e0 type = bVar.mo72235g().get(this.f63152$p.mo72303i()).getType();
            C13706o.m87928e(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$e */
    /* compiled from: signatureEnhancement.kt */
    static final class C14389e extends C13708q implements C16265l<C14967q1, Boolean> {

        /* renamed from: a */
        public static final C14389e f63153a = new C14389e();

        C14389e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14967q1 q1Var) {
            C13706o.m87929f(q1Var, "it");
            return Boolean.valueOf(q1Var instanceof C14944l0);
        }
    }

    public C14384l(C14345d dVar) {
        C13706o.m87929f(dVar, "typeEnhancement");
        this.f63148a = dVar;
    }

    /* renamed from: a */
    private final boolean m90383a(C14900e0 e0Var) {
        return C14956n1.m92988c(e0Var, C14385a.f63149a);
    }

    /* renamed from: b */
    private final C14900e0 m90384b(C13936b bVar, C13913a aVar, boolean z, C14301g gVar, C14164b bVar2, C14396q qVar, boolean z2, C16265l<? super C13936b, ? extends C14900e0> lVar) {
        C16265l<? super C13936b, ? extends C14900e0> lVar2 = lVar;
        C14393n nVar = new C14393n(aVar, z, gVar, bVar2, false, 16, (C13695i) null);
        C13936b bVar3 = bVar;
        C14900e0 e0Var = (C14900e0) lVar2.invoke(bVar);
        Collection<? extends C13936b> d = bVar.mo72234d();
        C13706o.m87928e(d, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (C13936b bVar4 : d) {
            C13706o.m87928e(bVar4, "it");
            arrayList.add((C14900e0) lVar2.invoke(bVar4));
        }
        return m90385c(nVar, e0Var, arrayList, qVar, z2);
    }

    /* renamed from: c */
    private final C14900e0 m90385c(C14393n nVar, C14900e0 e0Var, List<? extends C14900e0> list, C14396q qVar, boolean z) {
        return this.f63148a.mo73009a(e0Var, nVar.mo72982b(e0Var, list, qVar, z), nVar.mo72994u());
    }

    /* renamed from: d */
    static /* synthetic */ C14900e0 m90386d(C14384l lVar, C13936b bVar, C13913a aVar, boolean z, C14301g gVar, C14164b bVar2, C14396q qVar, boolean z2, C16265l lVar2, int i, Object obj) {
        return lVar.m90384b(bVar, aVar, z, gVar, bVar2, qVar, (i & 32) != 0 ? false : z2, lVar2);
    }

    /* renamed from: e */
    static /* synthetic */ C14900e0 m90387e(C14384l lVar, C14393n nVar, C14900e0 e0Var, List list, C14396q qVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            qVar = null;
        }
        return lVar.m90385c(nVar, e0Var, list, qVar, (i & 8) != 0 ? false : z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.C13936b> D m90388f(D r21, kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g r22) {
        /*
            r20 = this;
            r11 = r20
            r12 = r21
            boolean r0 = r12 instanceof p271gb.C12327a
            if (r0 != 0) goto L_0x0009
            return r12
        L_0x0009:
            r13 = r12
            gb.a r13 = (p271gb.C12327a) r13
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r0 = r13.mo72264h()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.C13936b.C13937a.FAKE_OVERRIDE
            r14 = 1
            if (r0 != r1) goto L_0x0024
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = r13.mo72233a()
            java.util.Collection r0 = r0.mo72234d()
            int r0 = r0.size()
            if (r0 != r14) goto L_0x0024
            return r12
        L_0x0024:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r20.m90390k(r21, r22)
            r7 = r22
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r8 = kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a.m89815h(r7, r0)
            boolean r0 = r12 instanceof p271gb.C12335f
            r15 = 0
            if (r0 == 0) goto L_0x0050
            r0 = r12
            gb.f r0 = (p271gb.C12335f) r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 r1 = r0.mo72346f()
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.mo72319F()
            if (r1 != 0) goto L_0x0044
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            if (r1 == 0) goto L_0x0050
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 r0 = r0.mo72346f()
            kotlin.jvm.internal.C13706o.m87926c(r0)
            r9 = r0
            goto L_0x0051
        L_0x0050:
            r9 = r12
        L_0x0051:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r13.mo72232P()
            r10 = 0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14154y
            if (r0 != 0) goto L_0x005e
            r0 = r10
            goto L_0x005f
        L_0x005e:
            r0 = r9
        L_0x005f:
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r0
            if (r0 == 0) goto L_0x006d
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<kotlin.reflect.jvm.internal.impl.descriptors.i1> r1 = p271gb.C12331e.f59011X
            java.lang.Object r0 = r0.mo68665u0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r0
            r2 = r0
            goto L_0x006e
        L_0x006d:
            r2 = r10
        L_0x006e:
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$b r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l.C14386b.f63150a
            r0 = r20
            r1 = r21
            r3 = r8
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.m90389j(r1, r2, r3, r4, r5, r6)
            r16 = r0
            goto L_0x0080
        L_0x007e:
            r16 = r10
        L_0x0080:
            boolean r0 = r12 instanceof p271gb.C12331e
            if (r0 == 0) goto L_0x0088
            r0 = r12
            gb.e r0 = (p271gb.C12331e) r0
            goto L_0x0089
        L_0x0088:
            r0 = r10
        L_0x0089:
            if (r0 == 0) goto L_0x00b0
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.C14473x.f63314a
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = r0.mo62163b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            r3 = 3
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v.m90689c(r0, r15, r15, r3, r10)
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.C14469u.m90686a(r1, r2, r0)
            if (r0 == 0) goto L_0x00b0
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14354j.m90352d()
            java.lang.Object r0 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14383k) r0
            r17 = r0
            goto L_0x00b2
        L_0x00b0:
            r17 = r10
        L_0x00b2:
            if (r17 == 0) goto L_0x00c2
            java.util.List r0 = r17.mo73063a()
            r0.size()
            java.util.List r0 = r13.mo72235g()
            r0.size()
        L_0x00c2:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.b r0 = r22.mo72914a()
            kotlin.reflect.jvm.internal.impl.load.java.w r0 = r0.mo72771i()
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.C14216i0.m89797b(r0)
            if (r0 != 0) goto L_0x00de
            kotlin.reflect.jvm.internal.impl.load.java.lazy.b r0 = r8.mo72914a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r0 = r0.mo72779q()
            boolean r0 = r0.mo72788b()
            if (r0 == 0) goto L_0x00e6
        L_0x00de:
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.C14216i0.m89796a(r21)
            if (r0 == 0) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00e6:
            r7 = 0
        L_0x00e7:
            java.util.List r0 = r9.mo72235g()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r1 = kotlin.collections.C13616u.m87774u(r0, r5)
            r6.<init>(r1)
            java.util.Iterator r18 = r0.iterator()
        L_0x00ff:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r18.next()
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r2
            if (r17 == 0) goto L_0x0120
            java.util.List r0 = r17.mo73063a()
            if (r0 == 0) goto L_0x0120
            int r1 = r2.mo72303i()
            java.lang.Object r0 = kotlin.collections.C13566b0.m87425Z(r0, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14396q) r0
            r4 = r0
            goto L_0x0121
        L_0x0120:
            r4 = r10
        L_0x0121:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$d r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$d
            r3.<init>(r2)
            r0 = r20
            r1 = r21
            r19 = r3
            r3 = r8
            r15 = 10
            r5 = r7
            r15 = r6
            r6 = r19
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.m90389j(r1, r2, r3, r4, r5, r6)
            r15.add(r0)
            r6 = r15
            r5 = 10
            r15 = 0
            goto L_0x00ff
        L_0x013f:
            r15 = r6
            r3 = 1
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C14140t0
            if (r0 != 0) goto L_0x0147
            r0 = r10
            goto L_0x0148
        L_0x0147:
            r0 = r12
        L_0x0148:
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C14140t0) r0
            if (r0 == 0) goto L_0x0154
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14234c.m89875a(r0)
            if (r0 != r14) goto L_0x0154
            r0 = 1
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            kotlin.reflect.jvm.internal.impl.load.java.b r0 = kotlin.reflect.jvm.internal.impl.load.java.C14164b.FIELD
            goto L_0x015c
        L_0x015a:
            kotlin.reflect.jvm.internal.impl.load.java.b r0 = kotlin.reflect.jvm.internal.impl.load.java.C14164b.METHOD_RETURN_TYPE
        L_0x015c:
            r5 = r0
            if (r17 == 0) goto L_0x0165
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q r0 = r17.mo73064b()
            r6 = r0
            goto L_0x0166
        L_0x0165:
            r6 = r10
        L_0x0166:
            r7 = 0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l$c r17 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l.C14387c.f63151a
            r18 = 32
            r19 = 0
            r0 = r20
            r1 = r21
            r2 = r9
            r4 = r8
            r8 = r17
            r9 = r18
            r17 = r10
            r10 = r19
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = m90386d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r13.getReturnType()
            kotlin.jvm.internal.C13706o.m87926c(r1)
            boolean r1 = r11.m90383a(r1)
            if (r1 != 0) goto L_0x01da
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r13.mo72232P()
            if (r1 == 0) goto L_0x019d
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r1.getType()
            if (r1 == 0) goto L_0x019d
            boolean r1 = r11.m90383a(r1)
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            if (r1 != 0) goto L_0x01da
            java.util.List r1 = r13.mo72235g()
            java.lang.String r2 = "valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x01b5
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01b5
        L_0x01b3:
            r1 = 0
            goto L_0x01d5
        L_0x01b5:
            java.util.Iterator r1 = r1.iterator()
        L_0x01b9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01b3
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r2
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r2.getType()
            java.lang.String r3 = "it.type"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            boolean r2 = r11.m90383a(r2)
            if (r2 == 0) goto L_0x01b9
            r1 = 1
        L_0x01d5:
            if (r1 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r1 = 0
            goto L_0x01db
        L_0x01da:
            r1 = 1
        L_0x01db:
            if (r1 == 0) goto L_0x01eb
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r1 = p380rb.C16378d.m98129a()
            kotlin.reflect.jvm.internal.impl.load.java.j r2 = new kotlin.reflect.jvm.internal.impl.load.java.j
            r2.<init>(r12)
            ja.m r10 = p297ja.C13337s.m85692a(r1, r2)
            goto L_0x01ed
        L_0x01eb:
            r10 = r17
        L_0x01ed:
            if (r16 != 0) goto L_0x0216
            if (r0 != 0) goto L_0x0216
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01f9
        L_0x01f7:
            r14 = 0
            goto L_0x0210
        L_0x01f9:
            java.util.Iterator r1 = r15.iterator()
        L_0x01fd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f7
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r2
            if (r2 == 0) goto L_0x020d
            r2 = 1
            goto L_0x020e
        L_0x020d:
            r2 = 0
        L_0x020e:
            if (r2 == 0) goto L_0x01fd
        L_0x0210:
            if (r14 != 0) goto L_0x0216
            if (r10 == 0) goto L_0x0215
            goto L_0x0216
        L_0x0215:
            return r12
        L_0x0216:
            if (r16 != 0) goto L_0x0226
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r13.mo72232P()
            if (r1 == 0) goto L_0x0223
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r1.getType()
            goto L_0x0228
        L_0x0223:
            r1 = r17
            goto L_0x0228
        L_0x0226:
            r1 = r16
        L_0x0228:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C13616u.m87774u(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r15.iterator()
            r15 = 0
        L_0x0238:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0265
            java.lang.Object r4 = r3.next()
            int r5 = r15 + 1
            if (r15 >= 0) goto L_0x0249
            kotlin.collections.C13614t.m87758t()
        L_0x0249:
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r4
            if (r4 != 0) goto L_0x0260
            java.util.List r4 = r13.mo72235g()
            java.lang.Object r4 = r4.get(r15)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r4
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = r4.getType()
            java.lang.String r6 = "valueParameters[index].type"
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)
        L_0x0260:
            r2.add(r4)
            r15 = r5
            goto L_0x0238
        L_0x0265:
            if (r0 != 0) goto L_0x026e
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r13.getReturnType()
            kotlin.jvm.internal.C13706o.m87926c(r0)
        L_0x026e:
            gb.a r0 = r13.mo68649C(r1, r2, r0, r10)
            java.lang.String r1 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l.m90388f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.load.java.lazy.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a.m89815h(r12, r11.getAnnotations());
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.types.C14900e0 m90389j(kotlin.reflect.jvm.internal.impl.descriptors.C13936b r10, kotlin.reflect.jvm.internal.impl.descriptors.C13966i1 r11, kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g r12, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14396q r13, boolean r14, p370qa.C16265l<? super kotlin.reflect.jvm.internal.impl.descriptors.C13936b, ? extends kotlin.reflect.jvm.internal.impl.types.C14900e0> r15) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x000f
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r11.getAnnotations()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.g r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a.m89815h(r12, r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r4 = r0
            goto L_0x0010
        L_0x000f:
            r4 = r12
        L_0x0010:
            kotlin.reflect.jvm.internal.impl.load.java.b r5 = kotlin.reflect.jvm.internal.impl.load.java.C14164b.VALUE_PARAMETER
            r3 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.m90384b(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l.m90389j(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.i1, kotlin.reflect.jvm.internal.impl.load.java.lazy.g, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, boolean, qa.l):kotlin.reflect.jvm.internal.impl.types.e0");
    }

    /* renamed from: k */
    private final <D extends C13936b> C13921g m90390k(D d, C14301g gVar) {
        C13961h a = C14125s.m89514a(d);
        if (a == null) {
            return d.getAnnotations();
        }
        List<C12479a> list = null;
        C14241f fVar = a instanceof C14241f ? (C14241f) a : null;
        if (fVar != null) {
            list = fVar.mo72815Q0();
        }
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C12479a eVar : list) {
            arrayList.add(new C14237e(gVar, eVar, true));
        }
        return C13921g.f62330v.mo72250a(C13566b0.m87440o0(d.getAnnotations(), arrayList));
    }

    /* renamed from: g */
    public final <D extends C13936b> Collection<D> mo73065g(C14301g gVar, Collection<? extends D> collection) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m90388f((C13936b) it.next(), gVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C14900e0 mo73066h(C14900e0 e0Var, C14301g gVar) {
        C13706o.m87929f(e0Var, "type");
        C13706o.m87929f(gVar, "context");
        C14900e0 e = m90387e(this, new C14393n((C13913a) null, false, gVar, C14164b.TYPE_USE, true), e0Var, C13614t.m87748j(), (C14396q) null, false, 12, (Object) null);
        return e == null ? e0Var : e;
    }

    /* renamed from: i */
    public final List<C14900e0> mo73067i(C13950e1 e1Var, List<? extends C14900e0> list, C14301g gVar) {
        C13706o.m87929f(e1Var, "typeParameter");
        C13706o.m87929f(list, "bounds");
        C13706o.m87929f(gVar, "context");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C14900e0 e0Var : list) {
            if (!C11170a.m74953b(e0Var, C14389e.f63153a)) {
                C14900e0 e0Var2 = e0Var;
                C14900e0 e = m90387e(this, new C14393n(e1Var, false, gVar, C14164b.TYPE_PARAMETER_BOUNDS, false, 16, (C13695i) null), e0Var2, C13614t.m87748j(), (C14396q) null, false, 12, (Object) null);
                if (e != null) {
                    e0Var = e;
                }
            }
            arrayList.add(e0Var);
        }
        return arrayList;
    }
}
