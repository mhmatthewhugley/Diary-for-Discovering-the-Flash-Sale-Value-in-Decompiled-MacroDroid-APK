package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p362pb.C16159h;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 */
/* compiled from: PropertySetterDescriptorImpl */
public class C13990e0 extends C13976b0 implements C14144v0 {

    /* renamed from: D */
    private C13966i1 f62508D;

    /* renamed from: E */
    private final C14144v0 f62509E;

    /* JADX WARNING: type inference failed for: r20v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.v0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13990e0(kotlin.reflect.jvm.internal.impl.descriptors.C14140t0 r12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g r13, kotlin.reflect.jvm.internal.impl.descriptors.C13945d0 r14, kotlin.reflect.jvm.internal.impl.descriptors.C14141u r15, boolean r16, boolean r17, boolean r18, kotlin.reflect.jvm.internal.impl.descriptors.C13936b.C13937a r19, kotlin.reflect.jvm.internal.impl.descriptors.C14144v0 r20, kotlin.reflect.jvm.internal.impl.descriptors.C14158z0 r21) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0006
            r0 = 0
            m88818h0(r0)
        L_0x0006:
            if (r13 != 0) goto L_0x000c
            r0 = 1
            m88818h0(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 2
            m88818h0(r0)
        L_0x0012:
            if (r15 != 0) goto L_0x0018
            r0 = 3
            m88818h0(r0)
        L_0x0018:
            if (r19 != 0) goto L_0x001e
            r0 = 4
            m88818h0(r0)
        L_0x001e:
            if (r21 != 0) goto L_0x0024
            r0 = 5
            m88818h0(r0)
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<set-"
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
            r1.f62509E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C13990e0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.t0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.u, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.v0, kotlin.reflect.jvm.internal.impl.descriptors.z0):void");
    }

    /* renamed from: P0 */
    public static C14006l0 m88817P0(C14144v0 v0Var, C14900e0 e0Var, C13921g gVar) {
        if (v0Var == null) {
            m88818h0(7);
        }
        if (e0Var == null) {
            m88818h0(8);
        }
        if (gVar == null) {
            m88818h0(9);
        }
        return new C14006l0(v0Var, (C13966i1) null, 0, gVar, C16159h.f66315n, e0Var, false, false, false, (C14900e0) null, C14158z0.f62778a);
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88818h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: Q0 */
    public C14144v0 m88826a() {
        C14144v0 v0Var = this.f62509E;
        if (v0Var == null) {
            m88818h0(13);
        }
        return v0Var;
    }

    /* renamed from: R0 */
    public void mo72387R0(C13966i1 i1Var) {
        if (i1Var == null) {
            m88818h0(6);
        }
        this.f62508D = i1Var;
    }

    /* renamed from: d */
    public Collection<? extends C14144v0> mo72234d() {
        Collection<C14126s0> L0 = super.mo72323L0(false);
        if (L0 == null) {
            m88818h0(10);
        }
        return L0;
    }

    /* renamed from: g */
    public List<C13966i1> mo72235g() {
        C13966i1 i1Var = this.f62508D;
        if (i1Var != null) {
            List<C13966i1> singletonList = Collections.singletonList(i1Var);
            if (singletonList == null) {
                m88818h0(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }

    public C14900e0 getReturnType() {
        C14951m0 Z = C16519a.m98613f(this).mo72132Z();
        if (Z == null) {
            m88818h0(12);
        }
        return Z;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72429e(this, d);
    }
}
