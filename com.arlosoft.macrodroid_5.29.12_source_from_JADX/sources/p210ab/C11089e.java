package p210ab;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14020p;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.util.C15030q;
import p362pb.C16157f;

/* renamed from: ab.e */
/* compiled from: FunctionInvokeDescriptor.kt */
public final class C11089e extends C13994g0 {

    /* renamed from: V */
    public static final C11090a f54009V = new C11090a((C13695i) null);

    /* renamed from: ab.e$a */
    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class C11090a {
        private C11090a() {
        }

        public /* synthetic */ C11090a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        private final C13966i1 m74699b(C11089e eVar, int i, C13950e1 e1Var) {
            String str;
            String d = e1Var.getName().mo78583d();
            C13706o.m87928e(d, "typeParameter.name.asString()");
            if (C13706o.m87924a(d, ExifInterface.GPS_DIRECTION_TRUE)) {
                str = "instance";
            } else if (C13706o.m87924a(d, ExifInterface.LONGITUDE_EAST)) {
                str = "receiver";
            } else {
                str = d.toLowerCase(Locale.ROOT);
                C13706o.m87928e(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            C13921g b = C13921g.f62330v.mo72251b();
            C16157f i2 = C16157f.m97019i(str);
            C13706o.m87928e(i2, "identifier(name)");
            C14951m0 p = e1Var.mo72274p();
            C13706o.m87928e(p, "typeParameter.defaultType");
            C14158z0 z0Var = C14158z0.f62778a;
            C13706o.m87928e(z0Var, "NO_SOURCE");
            return new C14006l0(eVar, (C13966i1) null, i, b, i2, p, false, false, false, (C14900e0) null, z0Var);
        }

        /* renamed from: a */
        public final C11089e mo62208a(C11080b bVar, boolean z) {
            C13706o.m87929f(bVar, "functionClass");
            List<C13950e1> q = bVar.mo62178q();
            C11089e eVar = new C11089e(bVar, (C11089e) null, C13936b.C13937a.DECLARATION, z, (C13695i) null);
            C14146w0 J0 = bVar.mo72283J0();
            List j = C13614t.m87748j();
            List j2 = C13614t.m87748j();
            ArrayList arrayList = new ArrayList();
            for (T next : q) {
                if (!(((C13950e1) next).mo72273l() == C14970r1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<C13592k0> M0 = C13566b0.m87411M0(arrayList);
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(M0, 10));
            for (C13592k0 k0Var : M0) {
                arrayList2.add(C11089e.f54009V.m74699b(eVar, k0Var.mo71844c(), (C13950e1) k0Var.mo71845d()));
            }
            eVar.mo72397R0((C14146w0) null, J0, j, j2, arrayList2, ((C13950e1) C13566b0.m87434i0(q)).mo72274p(), C13945d0.ABSTRACT, C14127t.f62754e);
            eVar.mo68652Z0(true);
            return eVar;
        }
    }

    private C11089e(C14064m mVar, C11089e eVar, C13936b.C13937a aVar, boolean z) {
        super(mVar, eVar, C13921g.f62330v.mo72251b(), C15030q.f64188i, aVar, C14158z0.f62778a);
        mo72466f1(true);
        mo72468h1(z);
        mo68651Y0(false);
    }

    public /* synthetic */ C11089e(C14064m mVar, C11089e eVar, C13936b.C13937a aVar, boolean z, C13695i iVar) {
        this(mVar, eVar, aVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.descriptors.C14154y m74695p1(java.util.List<p362pb.C16157f> r10) {
        /*
            r9 = this;
            java.util.List r0 = r9.mo72235g()
            int r0 = r0.size()
            int r1 = r10.size()
            int r0 = r0 - r1
            r1 = 1
            java.lang.String r2 = "valueParameters"
            r3 = 0
            if (r0 != 0) goto L_0x0054
            java.util.List r4 = r9.mo72235g()
            kotlin.jvm.internal.C13706o.m87928e(r4, r2)
            java.util.List r4 = kotlin.collections.C13566b0.m87413N0(r10, r4)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x002a
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x002a
        L_0x0028:
            r4 = 1
            goto L_0x0051
        L_0x002a:
            java.util.Iterator r4 = r4.iterator()
        L_0x002e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0028
            java.lang.Object r5 = r4.next()
            ja.m r5 = (p297ja.C13328m) r5
            java.lang.Object r6 = r5.mo70152a()
            pb.f r6 = (p362pb.C16157f) r6
            java.lang.Object r5 = r5.mo70153b()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r5
            pb.f r5 = r5.getName()
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r6, r5)
            if (r5 != 0) goto L_0x002e
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0054
            return r9
        L_0x0054:
            java.util.List r4 = r9.mo72235g()
            kotlin.jvm.internal.C13706o.m87928e(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C13616u.m87774u(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x006a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r5
            pb.f r6 = r5.getName()
            java.lang.String r7 = "it.name"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)
            int r7 = r5.mo72303i()
            int r8 = r7 - r0
            if (r8 < 0) goto L_0x0090
            java.lang.Object r8 = r10.get(r8)
            pb.f r8 = (p362pb.C16157f) r8
            if (r8 == 0) goto L_0x0090
            r6 = r8
        L_0x0090:
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = r5.mo72307z(r9, r6, r7)
            r2.add(r5)
            goto L_0x006a
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.types.l1 r0 = kotlin.reflect.jvm.internal.impl.types.C14945l1.f64066b
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c r0 = r9.mo72459S0(r0)
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x00a6
        L_0x00a4:
            r1 = 0
            goto L_0x00bd
        L_0x00a6:
            java.util.Iterator r10 = r10.iterator()
        L_0x00aa:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r10.next()
            pb.f r4 = (p362pb.C16157f) r4
            if (r4 != 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            if (r4 == 0) goto L_0x00aa
        L_0x00bd:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c r10 = r0.mo72478G(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c r10 = r10.mo72495b(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r9.m88873a()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c r10 = r10.mo72508n(r0)
            java.lang.String r0 = "newCopyBuilder(TypeSubst…   .setOriginal(original)"
            kotlin.jvm.internal.C13706o.m87928e(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r10 = super.mo62206M0(r10)
            kotlin.jvm.internal.C13706o.m87926c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p210ab.C11089e.m74695p1(java.util.List):kotlin.reflect.jvm.internal.impl.descriptors.y");
    }

    /* renamed from: B */
    public boolean mo62204B() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C14020p mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        C13706o.m87929f(mVar, "newOwner");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(z0Var, "source");
        return new C11089e(mVar, (C11089e) yVar, aVar, isSuspend());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.C14154y mo62206M0(kotlin.reflect.jvm.internal.impl.descriptors.impl.C14020p.C14023c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r7 = super.mo62206M0(r7)
            ab.e r7 = (p210ab.C11089e) r7
            if (r7 != 0) goto L_0x000f
            r7 = 0
            return r7
        L_0x000f:
            java.util.List r0 = r7.mo72235g()
            java.lang.String r1 = "substituted.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            java.lang.String r4 = "it.type"
            r5 = 1
            if (r2 == 0) goto L_0x0028
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x004a
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r2
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r2.getType()
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            pb.f r2 = kotlin.reflect.jvm.internal.impl.builtins.C13852g.m88225d(r2)
            if (r2 == 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x002c
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            return r7
        L_0x004d:
            java.util.List r0 = r7.mo72235g()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C13616u.m87774u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0063:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r2
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r2.getType()
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            pb.f r2 = kotlin.reflect.jvm.internal.impl.builtins.C13852g.m88225d(r2)
            r1.add(r2)
            goto L_0x0063
        L_0x007e:
            kotlin.reflect.jvm.internal.impl.descriptors.y r7 = r7.m74695p1(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p210ab.C11089e.mo62206M0(kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c):kotlin.reflect.jvm.internal.impl.descriptors.y");
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }
}
