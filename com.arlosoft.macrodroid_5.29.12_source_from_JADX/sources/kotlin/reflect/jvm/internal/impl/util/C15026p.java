package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.util.C15017k;
import kotlin.reflect.jvm.internal.impl.util.C15031r;
import kotlin.reflect.jvm.internal.impl.util.C15040t;
import p225cc.C11170a;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;
import p416vb.C16755e;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.p */
/* compiled from: modifierChecks.kt */
public final class C15026p extends C14998b {

    /* renamed from: a */
    public static final C15026p f64155a = new C15026p();

    /* renamed from: b */
    private static final List<C15010h> f64156b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.p$a */
    /* compiled from: modifierChecks.kt */
    static final class C15027a extends C13708q implements C16265l<C14154y, String> {

        /* renamed from: a */
        public static final C15027a f64157a = new C15027a();

        C15027a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            if ((!p389sb.C16519a.m98608a(r4) && r4.mo72306v0() == null) == true) goto L_0x002b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.C14154y r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.C13706o.m87929f(r4, r0)
                java.util.List r4 = r4.mo72235g()
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.C13706o.m87928e(r4, r0)
                java.lang.Object r4 = kotlin.collections.C13566b0.m87436k0(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r4
                r0 = 1
                r1 = 0
                if (r4 == 0) goto L_0x002a
                boolean r2 = p389sb.C16519a.m98608a(r4)
                if (r2 != 0) goto L_0x0026
                kotlin.reflect.jvm.internal.impl.types.e0 r4 = r4.mo72306v0()
                if (r4 != 0) goto L_0x0026
                r4 = 1
                goto L_0x0027
            L_0x0026:
                r4 = 0
            L_0x0027:
                if (r4 != r0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r0 = 0
            L_0x002b:
                kotlin.reflect.jvm.internal.impl.util.p r4 = kotlin.reflect.jvm.internal.impl.util.C15026p.f64155a
                if (r0 != 0) goto L_0x0032
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C15026p.C15027a.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.p$b */
    /* compiled from: modifierChecks.kt */
    static final class C15028b extends C13708q implements C16265l<C14154y, String> {

        /* renamed from: a */
        public static final C15028b f64158a = new C15028b();

        C15028b() {
            super(1);
        }

        /* renamed from: b */
        private static final boolean m93243b(C14064m mVar) {
            return (mVar instanceof C13948e) && C13853h.m88251a0((C13948e) mVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.C14154y r5) {
            /*
                r4 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.C13706o.m87929f(r5, r0)
                kotlin.reflect.jvm.internal.impl.util.p r0 = kotlin.reflect.jvm.internal.impl.util.C15026p.f64155a
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r5.mo62163b()
                java.lang.String r1 = "containingDeclaration"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                boolean r0 = m93243b(r0)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x004d
                java.util.Collection r5 = r5.mo72234d()
                java.lang.String r0 = "overriddenDescriptors"
                kotlin.jvm.internal.C13706o.m87928e(r5, r0)
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L_0x0029
            L_0x0027:
                r5 = 0
                goto L_0x0049
            L_0x0029:
                java.util.Iterator r5 = r5.iterator()
            L_0x002d:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0027
                java.lang.Object r0 = r5.next()
                kotlin.reflect.jvm.internal.impl.descriptors.y r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C14154y) r0
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r0.mo62163b()
                java.lang.String r3 = "it.containingDeclaration"
                kotlin.jvm.internal.C13706o.m87928e(r0, r3)
                boolean r0 = m93243b(r0)
                if (r0 == 0) goto L_0x002d
                r5 = 1
            L_0x0049:
                if (r5 == 0) goto L_0x004c
                goto L_0x004d
            L_0x004c:
                r1 = 0
            L_0x004d:
                if (r1 != 0) goto L_0x0052
                java.lang.String r5 = "must override ''equals()'' in Any"
                goto L_0x0053
            L_0x0052:
                r5 = 0
            L_0x0053:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.C15026p.C15028b.invoke(kotlin.reflect.jvm.internal.impl.descriptors.y):java.lang.String");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.p$c */
    /* compiled from: modifierChecks.kt */
    static final class C15029c extends C13708q implements C16265l<C14154y, String> {

        /* renamed from: a */
        public static final C15029c f64159a = new C15029c();

        C15029c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C14154y yVar) {
            boolean z;
            C13706o.m87929f(yVar, "$this$$receiver");
            C14146w0 L = yVar.mo72231L();
            if (L == null) {
                L = yVar.mo72232P();
            }
            C15026p pVar = C15026p.f64155a;
            boolean z2 = false;
            if (L != null) {
                C14900e0 returnType = yVar.getReturnType();
                if (returnType != null) {
                    C14900e0 type = L.getType();
                    C13706o.m87928e(type, "receiver.type");
                    z = C11170a.m74966o(returnType, type);
                } else {
                    z = false;
                }
                if (z || pVar.m93240d(yVar, L)) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        C16157f fVar = C15030q.f64190k;
        C15017k.C15019b bVar = C15017k.C15019b.f64147b;
        C15004f[] fVarArr = {bVar, new C15040t.C15041a(1)};
        C16157f fVar2 = C15030q.f64191l;
        C15004f[] fVarArr2 = {bVar, new C15040t.C15041a(2)};
        C16157f fVar3 = C15030q.f64181b;
        C15022m mVar = C15022m.f64149a;
        C15016j jVar = C15016j.f64143a;
        C16157f fVar4 = C15030q.f64187h;
        C15040t.C15044d dVar = C15040t.C15044d.f64221b;
        C15031r.C15032a aVar = C15031r.C15032a.f64209d;
        C16157f fVar5 = C15030q.f64189j;
        C15040t.C15043c cVar = C15040t.C15043c.f64220b;
        f64156b = C13614t.m87751m(new C15010h(fVar, fVarArr, (C16265l) null, 4, (C13695i) null), new C15010h(fVar2, fVarArr2, (C16265l<? super C14154y, String>) C15027a.f64157a), new C15010h(fVar3, new C15004f[]{bVar, mVar, new C15040t.C15041a(2), jVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64182c, new C15004f[]{bVar, mVar, new C15040t.C15041a(3), jVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64183d, new C15004f[]{bVar, mVar, new C15040t.C15042b(2), jVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64188i, new C15004f[]{bVar}, (C16265l) null, 4, (C13695i) null), new C15010h(fVar4, new C15004f[]{bVar, dVar, mVar, aVar}, (C16265l) null, 4, (C13695i) null), new C15010h(fVar5, new C15004f[]{bVar, cVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64192m, new C15004f[]{bVar, cVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64193n, new C15004f[]{bVar, cVar, aVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64168I, new C15004f[]{bVar, dVar, mVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64184e, new C15004f[]{C15017k.C15018a.f64146b}, (C16265l<? super C14154y, String>) C15028b.f64158a), new C15010h(C15030q.f64186g, new C15004f[]{bVar, C15031r.C15034b.f64211d, dVar, mVar}, (C16265l) null, 4, (C13695i) null), new C15010h((Collection) C15030q.f64177R, new C15004f[]{bVar, dVar, mVar}, (C16265l) null, 4, (C13695i) null), new C15010h((Collection) C15030q.f64176Q, new C15004f[]{bVar, cVar}, (C16265l) null, 4, (C13695i) null), new C15010h((Collection<C16157f>) C13614t.m87751m(C15030q.f64203x, C15030q.f64204y), new C15004f[]{bVar}, (C16265l<? super C14154y, String>) C15029c.f64159a), new C15010h((Collection) C15030q.f64178S, new C15004f[]{bVar, C15031r.C15036c.f64213d, dVar, mVar}, (C16265l) null, 4, (C13695i) null), new C15010h(C15030q.f64195p, new C15004f[]{bVar, cVar}, (C16265l) null, 4, (C13695i) null));
    }

    private C15026p() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m93240d(C14154y yVar, C14146w0 w0Var) {
        C16151b g;
        C14900e0 returnType;
        C16756f value = w0Var.getValue();
        C13706o.m87928e(value, "receiver.value");
        if (!(value instanceof C16755e)) {
            return false;
        }
        C13948e s = ((C16755e) value).mo79740s();
        if (!s.mo62175l0() || (g = C16519a.m98614g(s)) == null) {
            return false;
        }
        C13961h b = C14147x.m89565b(C16519a.m98619l(s), g);
        if (!(b instanceof C13947d1)) {
            b = null;
        }
        C13947d1 d1Var = (C13947d1) b;
        if (d1Var == null || (returnType = yVar.getReturnType()) == null) {
            return false;
        }
        return C11170a.m74966o(returnType, d1Var.mo72280G());
    }

    /* renamed from: b */
    public List<C15010h> mo74259b() {
        return f64156b;
    }
}
