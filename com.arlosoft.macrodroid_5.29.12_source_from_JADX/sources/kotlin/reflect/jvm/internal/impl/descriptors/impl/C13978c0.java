package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14145w;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14975t;
import p272gc.C12359f;
import p362pb.C16157f;
import p370qa.C16254a;
import p389sb.C16519a;
import p416vb.C16753c;
import p416vb.C16754d;
import p442yb.C17007j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 */
/* compiled from: PropertyDescriptorImpl */
public class C13978c0 extends C14018n0 implements C14140t0 {

    /* renamed from: A */
    private C14141u f62455A;

    /* renamed from: B */
    private Collection<? extends C14140t0> f62456B;

    /* renamed from: C */
    private final C14140t0 f62457C;

    /* renamed from: D */
    private final C13936b.C13937a f62458D;

    /* renamed from: E */
    private final boolean f62459E;

    /* renamed from: F */
    private final boolean f62460F;

    /* renamed from: G */
    private final boolean f62461G;

    /* renamed from: H */
    private final boolean f62462H;

    /* renamed from: I */
    private final boolean f62463I;

    /* renamed from: J */
    private final boolean f62464J;

    /* renamed from: K */
    private List<C14146w0> f62465K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C14146w0 f62466L;

    /* renamed from: M */
    private C14146w0 f62467M;

    /* renamed from: N */
    private List<C13950e1> f62468N;

    /* renamed from: O */
    private C13984d0 f62469O;

    /* renamed from: P */
    private C14144v0 f62470P;

    /* renamed from: Q */
    private boolean f62471Q;

    /* renamed from: R */
    private C14145w f62472R;

    /* renamed from: S */
    private C14145w f62473S;

    /* renamed from: z */
    private final C13945d0 f62474z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c0$a */
    /* compiled from: PropertyDescriptorImpl */
    public class C13979a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C14064m f62475a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C13945d0 f62476b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C14141u f62477c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C14140t0 f62478d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f62479e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C13936b.C13937a f62480f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C14936j1 f62481g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f62482h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C14146w0 f62483i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public List<C13950e1> f62484j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C16157f f62485k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C14900e0 f62486l;

        public C13979a() {
            this.f62475a = C13978c0.this.mo62163b();
            this.f62476b = C13978c0.this.mo62179r();
            this.f62477c = C13978c0.this.getVisibility();
            this.f62480f = C13978c0.this.mo72264h();
            this.f62481g = C14936j1.f64059b;
            this.f62482h = true;
            this.f62483i = C13978c0.this.f62466L;
            this.f62484j = null;
            this.f62485k = C13978c0.this.getName();
            this.f62486l = C13978c0.this.getType();
        }

        /* renamed from: a */
        private static /* synthetic */ void m88730a(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = "setName";
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: n */
        public C14140t0 mo72350n() {
            return C13978c0.this.mo72337Q0(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C14142u0 mo72351o() {
            C14140t0 t0Var = this.f62478d;
            if (t0Var == null) {
                return null;
            }
            return t0Var.mo72346f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C14144v0 mo72352p() {
            C14140t0 t0Var = this.f62478d;
            if (t0Var == null) {
                return null;
            }
            return t0Var.mo72334H();
        }

        /* renamed from: q */
        public C13979a mo72353q(boolean z) {
            this.f62482h = z;
            return this;
        }

        /* renamed from: r */
        public C13979a mo72354r(C13936b.C13937a aVar) {
            if (aVar == null) {
                m88730a(10);
            }
            this.f62480f = aVar;
            return this;
        }

        /* renamed from: s */
        public C13979a mo72355s(C13945d0 d0Var) {
            if (d0Var == null) {
                m88730a(6);
            }
            this.f62476b = d0Var;
            return this;
        }

        /* renamed from: t */
        public C13979a mo72356t(C13936b bVar) {
            this.f62478d = (C14140t0) bVar;
            return this;
        }

        /* renamed from: u */
        public C13979a mo72357u(C14064m mVar) {
            if (mVar == null) {
                m88730a(0);
            }
            this.f62475a = mVar;
            return this;
        }

        /* renamed from: v */
        public C13979a mo72358v(C14936j1 j1Var) {
            if (j1Var == null) {
                m88730a(15);
            }
            this.f62481g = j1Var;
            return this;
        }

        /* renamed from: w */
        public C13979a mo72359w(C14141u uVar) {
            if (uVar == null) {
                m88730a(8);
            }
            this.f62477c = uVar;
            return this;
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.t0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C13978c0(kotlin.reflect.jvm.internal.impl.descriptors.C14064m r12, kotlin.reflect.jvm.internal.impl.descriptors.C14140t0 r13, kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g r14, kotlin.reflect.jvm.internal.impl.descriptors.C13945d0 r15, kotlin.reflect.jvm.internal.impl.descriptors.C14141u r16, boolean r17, p362pb.C16157f r18, kotlin.reflect.jvm.internal.impl.descriptors.C13936b.C13937a r19, kotlin.reflect.jvm.internal.impl.descriptors.C14158z0 r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r11 = this;
            r7 = r11
            r8 = r15
            r9 = r16
            r10 = r19
            if (r12 != 0) goto L_0x000c
            r0 = 0
            m88690h0(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 1
            m88690h0(r0)
        L_0x0012:
            if (r8 != 0) goto L_0x0018
            r0 = 2
            m88690h0(r0)
        L_0x0018:
            if (r9 != 0) goto L_0x001e
            r0 = 3
            m88690h0(r0)
        L_0x001e:
            if (r18 != 0) goto L_0x0024
            r0 = 4
            m88690h0(r0)
        L_0x0024:
            if (r10 != 0) goto L_0x002a
            r0 = 5
            m88690h0(r0)
        L_0x002a:
            if (r20 != 0) goto L_0x0030
            r0 = 6
            m88690h0(r0)
        L_0x0030:
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r5 = r17
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r7.f62456B = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r7.f62465K = r0
            r7.f62474z = r8
            r7.f62455A = r9
            if (r13 != 0) goto L_0x004e
            r0 = r7
            goto L_0x004f
        L_0x004e:
            r0 = r13
        L_0x004f:
            r7.f62457C = r0
            r7.f62458D = r10
            r0 = r21
            r7.f62459E = r0
            r0 = r22
            r7.f62460F = r0
            r0 = r23
            r7.f62461G = r0
            r0 = r24
            r7.f62462H = r0
            r0 = r25
            r7.f62463I = r0
            r0 = r26
            r7.f62464J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C13978c0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.t0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.u, boolean, pb.f, kotlin.reflect.jvm.internal.impl.descriptors.b$a, kotlin.reflect.jvm.internal.impl.descriptors.z0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: O0 */
    public static C13978c0 m88684O0(C14064m mVar, C13921g gVar, C13945d0 d0Var, C14141u uVar, boolean z, C16157f fVar, C13936b.C13937a aVar, C14158z0 z0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (mVar == null) {
            m88690h0(7);
        }
        if (gVar == null) {
            m88690h0(8);
        }
        if (d0Var == null) {
            m88690h0(9);
        }
        if (uVar == null) {
            m88690h0(10);
        }
        if (fVar == null) {
            m88690h0(11);
        }
        if (aVar == null) {
            m88690h0(12);
        }
        if (z0Var == null) {
            m88690h0(13);
        }
        return new C13978c0(mVar, (C14140t0) null, gVar, d0Var, uVar, z, fVar, aVar, z0Var, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: S0 */
    private C14158z0 m88685S0(boolean z, C14140t0 t0Var) {
        C14158z0 z0Var;
        if (z) {
            if (t0Var == null) {
                t0Var = m88711a();
            }
            z0Var = t0Var.getSource();
        } else {
            z0Var = C14158z0.f62778a;
        }
        if (z0Var == null) {
            m88690h0(28);
        }
        return z0Var;
    }

    /* renamed from: T0 */
    private static C14154y m88686T0(C14945l1 l1Var, C14126s0 s0Var) {
        if (l1Var == null) {
            m88690h0(30);
        }
        if (s0Var == null) {
            m88690h0(31);
        }
        if (s0Var.mo72331s0() != null) {
            return s0Var.mo72331s0().mo72267c(l1Var);
        }
        return null;
    }

    /* renamed from: Y0 */
    private static C14141u m88687Y0(C14141u uVar, C13936b.C13937a aVar) {
        return (aVar != C13936b.C13937a.FAKE_OVERRIDE || !C14127t.m89525g(uVar.mo72572f())) ? uVar : C14127t.f62757h;
    }

    /* renamed from: d1 */
    private static C14146w0 m88688d1(C14945l1 l1Var, C14140t0 t0Var, C14146w0 w0Var) {
        C14900e0 p = l1Var.mo74215p(w0Var.getType(), C14970r1.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new C13992f0(t0Var, new C16753c(t0Var, p, w0Var.getValue()), w0Var.getAnnotations());
    }

    /* renamed from: e1 */
    private static C14146w0 m88689e1(C14945l1 l1Var, C14140t0 t0Var, C14146w0 w0Var) {
        C14900e0 p = l1Var.mo74215p(w0Var.getType(), C14970r1.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new C13992f0(t0Var, new C16754d(t0Var, p, w0Var.getValue()), w0Var.getAnnotations());
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88690h0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: A */
    public boolean mo72333A() {
        return this.f62464J;
    }

    /* renamed from: D0 */
    public void mo72262D0(Collection<? extends C13936b> collection) {
        if (collection == null) {
            m88690h0(40);
        }
        this.f62456B = collection;
    }

    /* renamed from: H */
    public C14144v0 mo72334H() {
        return this.f62470P;
    }

    /* renamed from: L */
    public C14146w0 mo72231L() {
        return this.f62466L;
    }

    /* renamed from: N0 */
    public C14140t0 mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        C14140t0 n = mo72342X0().mo72357u(mVar).mo72356t((C13936b) null).mo72355s(d0Var).mo72359w(uVar).mo72354r(aVar).mo72353q(z).mo72350n();
        if (n == null) {
            m88690h0(42);
        }
        return n;
    }

    /* renamed from: P */
    public C14146w0 mo72232P() {
        return this.f62467M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public C13978c0 mo68662P0(C14064m mVar, C13945d0 d0Var, C14141u uVar, C14140t0 t0Var, C13936b.C13937a aVar, C16157f fVar, C14158z0 z0Var) {
        if (mVar == null) {
            m88690h0(32);
        }
        if (d0Var == null) {
            m88690h0(33);
        }
        if (uVar == null) {
            m88690h0(34);
        }
        if (aVar == null) {
            m88690h0(35);
        }
        if (fVar == null) {
            m88690h0(36);
        }
        if (z0Var == null) {
            m88690h0(37);
        }
        return new C13978c0(mVar, t0Var, getAnnotations(), d0Var, uVar, mo72440N(), fVar, aVar, z0Var, mo72349y0(), mo68664b0(), mo62175l0(), mo62160Y(), isExternal(), mo72333A());
    }

    /* renamed from: Q */
    public C14145w mo72336Q() {
        return this.f62473S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C14140t0 mo72337Q0(C13979a aVar) {
        C14146w0 w0Var;
        C16254a<C17007j<C14617g<?>>> aVar2;
        if (aVar == null) {
            m88690h0(29);
        }
        C13978c0 P0 = mo68662P0(aVar.f62475a, aVar.f62476b, aVar.f62477c, aVar.f62478d, aVar.f62480f, aVar.f62485k, m88685S0(aVar.f62479e, aVar.f62478d));
        List<C13950e1> typeParameters = aVar.f62484j == null ? getTypeParameters() : aVar.f62484j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C14945l1 b = C14975t.m93114b(typeParameters, aVar.f62481g, P0, arrayList);
        C14900e0 c = aVar.f62486l;
        C14900e0 p = b.mo74215p(c, C14970r1.OUT_VARIANCE);
        C14019o oVar = null;
        if (p == null) {
            return null;
        }
        C14900e0 p2 = b.mo74215p(c, C14970r1.IN_VARIANCE);
        if (p2 != null) {
            P0.mo68663Z0(p2);
        }
        C14146w0 d = aVar.f62483i;
        if (d != null) {
            C14146w0 c2 = d.mo72267c(b);
            if (c2 == null) {
                return null;
            }
            w0Var = c2;
        } else {
            w0Var = null;
        }
        C14146w0 w0Var2 = this.f62467M;
        C14146w0 e1 = w0Var2 != null ? m88689e1(b, P0, w0Var2) : null;
        ArrayList arrayList2 = new ArrayList();
        for (C14146w0 d1 : this.f62465K) {
            C14146w0 d12 = m88688d1(b, P0, d1);
            if (d12 != null) {
                arrayList2.add(d12);
            }
        }
        P0.mo72344b1(p, arrayList, w0Var, e1, arrayList2);
        C13984d0 d0Var = this.f62469O == null ? null : new C13984d0(P0, this.f62469O.getAnnotations(), aVar.f62476b, m88687Y0(this.f62469O.getVisibility(), aVar.f62480f), this.f62469O.mo72319F(), this.f62469O.isExternal(), this.f62469O.isInline(), aVar.f62480f, aVar.mo72351o(), C14158z0.f62778a);
        if (d0Var != null) {
            C14900e0 returnType = this.f62469O.getReturnType();
            d0Var.mo72325N0(m88686T0(b, this.f62469O));
            d0Var.mo72374Q0(returnType != null ? b.mo74215p(returnType, C14970r1.OUT_VARIANCE) : null);
        }
        C13990e0 e0Var = this.f62470P == null ? null : new C13990e0(P0, this.f62470P.getAnnotations(), aVar.f62476b, m88687Y0(this.f62470P.getVisibility(), aVar.f62480f), this.f62470P.mo72319F(), this.f62470P.isExternal(), this.f62470P.isInline(), aVar.f62480f, aVar.mo72352p(), C14158z0.f62778a);
        if (e0Var != null) {
            List<C13966i1> P02 = C14020p.m89050P0(e0Var, this.f62470P.mo72235g(), b, false, false, (boolean[]) null);
            if (P02 == null) {
                P0.mo72343a1(true);
                P02 = Collections.singletonList(C13990e0.m88817P0(e0Var, C16519a.m98613f(aVar.f62475a).mo72118H(), this.f62470P.mo72235g().get(0).getAnnotations()));
            }
            if (P02.size() == 1) {
                e0Var.mo72325N0(m88686T0(b, this.f62470P));
                e0Var.mo72387R0(P02.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        C14145w wVar = this.f62472R;
        C14019o oVar2 = wVar == null ? null : new C14019o(wVar.getAnnotations(), P0);
        C14145w wVar2 = this.f62473S;
        if (wVar2 != null) {
            oVar = new C14019o(wVar2.getAnnotations(), P0);
        }
        P0.mo72340V0(d0Var, e0Var, oVar2, oVar);
        if (aVar.f62482h) {
            C12359f c3 = C12359f.m83113c();
            for (C14140t0 c4 : mo72234d()) {
                c3.add(c4.mo72267c(b));
            }
            P0.mo72262D0(c3);
        }
        if (mo68664b0() && (aVar2 = this.f62565s) != null) {
            P0.mo72457K0(this.f62564p, aVar2);
        }
        return P0;
    }

    /* renamed from: R0 */
    public C13984d0 mo72346f() {
        return this.f62469O;
    }

    /* renamed from: U0 */
    public void mo72339U0(C13984d0 d0Var, C14144v0 v0Var) {
        mo72340V0(d0Var, v0Var, (C14145w) null, (C14145w) null);
    }

    /* renamed from: V0 */
    public void mo72340V0(C13984d0 d0Var, C14144v0 v0Var, C14145w wVar, C14145w wVar2) {
        this.f62469O = d0Var;
        this.f62470P = v0Var;
        this.f62472R = wVar;
        this.f62473S = wVar2;
    }

    /* renamed from: W0 */
    public boolean mo72341W0() {
        return this.f62471Q;
    }

    /* renamed from: X0 */
    public C13979a mo72342X0() {
        return new C13979a();
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return this.f62462H;
    }

    /* renamed from: Z0 */
    public void mo68663Z0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88690h0(14);
        }
    }

    /* renamed from: a1 */
    public void mo72343a1(boolean z) {
        this.f62471Q = z;
    }

    /* renamed from: b0 */
    public boolean mo68664b0() {
        return this.f62460F;
    }

    /* renamed from: b1 */
    public void mo72344b1(C14900e0 e0Var, List<? extends C13950e1> list, C14146w0 w0Var, C14146w0 w0Var2, List<C14146w0> list2) {
        if (e0Var == null) {
            m88690h0(17);
        }
        if (list == null) {
            m88690h0(18);
        }
        if (list2 == null) {
            m88690h0(19);
        }
        mo72446G0(e0Var);
        this.f62468N = new ArrayList(list);
        this.f62467M = w0Var2;
        this.f62466L = w0Var;
        this.f62465K = list2;
    }

    /* renamed from: c1 */
    public void mo72345c1(C14141u uVar) {
        if (uVar == null) {
            m88690h0(20);
        }
        this.f62455A = uVar;
    }

    /* renamed from: d */
    public Collection<? extends C14140t0> mo72234d() {
        Collection<? extends C14140t0> collection = this.f62456B;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m88690h0(41);
        }
        return collection;
    }

    public C14900e0 getReturnType() {
        C14900e0 type = getType();
        if (type == null) {
            m88690h0(23);
        }
        return type;
    }

    public List<C13950e1> getTypeParameters() {
        List<C13950e1> list = this.f62468N;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    public C14141u getVisibility() {
        C14141u uVar = this.f62455A;
        if (uVar == null) {
            m88690h0(25);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13936b.C13937a mo72264h() {
        C13936b.C13937a aVar = this.f62458D;
        if (aVar == null) {
            m88690h0(39);
        }
        return aVar;
    }

    public boolean isExternal() {
        return this.f62463I;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return this.f62461G;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = this.f62474z;
        if (d0Var == null) {
            m88690h0(24);
        }
        return d0Var;
    }

    /* renamed from: u */
    public List<C14126s0> mo72347u() {
        ArrayList arrayList = new ArrayList(2);
        C13984d0 d0Var = this.f62469O;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        C14144v0 v0Var = this.f62470P;
        if (v0Var != null) {
            arrayList.add(v0Var);
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public <V> V mo68665u0(C13908a.C13909a<V> aVar) {
        return null;
    }

    /* renamed from: w0 */
    public C14145w mo72348w0() {
        return this.f62472R;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo71973c(this, d);
    }

    /* renamed from: x0 */
    public List<C14146w0> mo72238x0() {
        List<C14146w0> list = this.f62465K;
        if (list == null) {
            m88690h0(22);
        }
        return list;
    }

    /* renamed from: y0 */
    public boolean mo72349y0() {
        return this.f62459E;
    }

    /* renamed from: c */
    public C14140t0 m88717c(C14945l1 l1Var) {
        if (l1Var == null) {
            m88690h0(27);
        }
        if (l1Var.mo74212k()) {
            return this;
        }
        return mo72342X0().mo72358v(l1Var.mo74211j()).mo72356t(m88711a()).mo72350n();
    }

    /* renamed from: a */
    public C14140t0 m88712a() {
        C14140t0 t0Var = this.f62457C;
        C14140t0 a = t0Var == this ? this : t0Var.mo72233a();
        if (a == null) {
            m88690h0(38);
        }
        return a;
    }
}
