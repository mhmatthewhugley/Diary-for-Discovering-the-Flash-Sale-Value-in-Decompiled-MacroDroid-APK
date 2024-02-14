package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import p272gc.C12354e;
import p389sb.C16519a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.b */
/* compiled from: AbstractClassTypeConstructor */
public abstract class C14832b extends C14914g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14832b(C17012n nVar) {
        super(nVar);
        if (nVar == null) {
            m92408u(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void m92408u(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = 3
            goto L_0x0018
        L_0x0017:
            r5 = 2
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14832b.m92408u(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo72381g(C13961h hVar) {
        if (hVar == null) {
            m92408u(2);
        }
        return (hVar instanceof C13948e) && mo74219e(mo62189v(), hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C14900e0 mo72382k() {
        if (C13853h.m88276t0(mo62189v())) {
            return null;
        }
        return mo72371m().mo72136i();
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        C13853h f = C16519a.m98613f(mo62189v());
        if (f == null) {
            m92408u(1);
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Collection<C14900e0> mo74052n(boolean z) {
        C14064m b = mo62189v().mo62163b();
        if (!(b instanceof C13948e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m92408u(3);
            }
            return emptyList;
        }
        C12354e eVar = new C12354e();
        C13948e eVar2 = (C13948e) b;
        eVar.add(eVar2.mo72274p());
        C13948e n0 = eVar2.mo62177n0();
        if (z && n0 != null) {
            eVar.add(n0.mo72274p());
        }
        return eVar;
    }

    /* renamed from: v */
    public abstract C13948e mo62189v();
}
