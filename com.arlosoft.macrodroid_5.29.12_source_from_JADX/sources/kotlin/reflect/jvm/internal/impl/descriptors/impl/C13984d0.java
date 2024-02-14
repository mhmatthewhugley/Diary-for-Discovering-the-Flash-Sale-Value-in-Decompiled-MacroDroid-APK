package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 */
/* compiled from: PropertyGetterDescriptorImpl */
public class C13984d0 extends C13976b0 implements C14142u0 {

    /* renamed from: D */
    private C14900e0 f62492D;

    /* renamed from: E */
    private final C14142u0 f62493E;

    /* JADX WARNING: type inference failed for: r20v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.u0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13984d0(kotlin.reflect.jvm.internal.impl.descriptors.C14140t0 r12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g r13, kotlin.reflect.jvm.internal.impl.descriptors.C13945d0 r14, kotlin.reflect.jvm.internal.impl.descriptors.C14141u r15, boolean r16, boolean r17, boolean r18, kotlin.reflect.jvm.internal.impl.descriptors.C13936b.C13937a r19, kotlin.reflect.jvm.internal.impl.descriptors.C14142u0 r20, kotlin.reflect.jvm.internal.impl.descriptors.C14158z0 r21) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0006
            r0 = 0
            m88776h0(r0)
        L_0x0006:
            if (r13 != 0) goto L_0x000c
            r0 = 1
            m88776h0(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 2
            m88776h0(r0)
        L_0x0012:
            if (r15 != 0) goto L_0x0018
            r0 = 3
            m88776h0(r0)
        L_0x0018:
            if (r19 != 0) goto L_0x001e
            r0 = 4
            m88776h0(r0)
        L_0x001e:
            if (r21 != 0) goto L_0x0024
            r0 = 5
            m88776h0(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<get-"
            r0.append(r1)
            pb.f r1 = r12.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            pb.f r5 = p362pb.C16157f.m97021l(r0)
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r12
            r4 = r13
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r20 == 0) goto L_0x005a
            r1 = r11
            r0 = r20
            goto L_0x005c
        L_0x005a:
            r0 = r11
            r1 = r0
        L_0x005c:
            r1.f62493E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.t0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.u, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.u0, kotlin.reflect.jvm.internal.impl.descriptors.z0):void");
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88776h0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: P0 */
    public C14142u0 m88784a() {
        C14142u0 u0Var = this.f62493E;
        if (u0Var == null) {
            m88776h0(8);
        }
        return u0Var;
    }

    /* renamed from: Q0 */
    public void mo72374Q0(C14900e0 e0Var) {
        if (e0Var == null) {
            e0Var = mo72327W().getType();
        }
        this.f62492D = e0Var;
    }

    /* renamed from: d */
    public Collection<? extends C14142u0> mo72234d() {
        Collection<C14126s0> L0 = super.mo72323L0(true);
        if (L0 == null) {
            m88776h0(6);
        }
        return L0;
    }

    /* renamed from: g */
    public List<C13966i1> mo72235g() {
        List<C13966i1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88776h0(7);
        }
        return emptyList;
    }

    public C14900e0 getReturnType() {
        return this.f62492D;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72431g(this, d);
    }
}
