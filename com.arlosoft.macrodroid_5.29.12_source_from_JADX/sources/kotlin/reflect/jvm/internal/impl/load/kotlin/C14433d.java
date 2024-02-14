package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import org.apache.commons.p353io.FilenameUtils;
import p272gc.C12347d;
import p297ja.C13339u;
import p362pb.C16152c;
import p362pb.C16159h;
import p370qa.C16270q;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.d */
/* compiled from: descriptorBasedTypeSignatureMapping.kt */
public final class C14433d {
    /* renamed from: a */
    public static final String m90575a(C13948e eVar, C14475y<?> yVar) {
        C13706o.m87929f(eVar, "klass");
        C13706o.m87929f(yVar, "typeMappingConfiguration");
        String b = yVar.mo73228b(eVar);
        if (b != null) {
            return b;
        }
        C14064m b2 = eVar.mo62163b();
        C13706o.m87928e(b2, "klass.containingDeclaration");
        String f = C16159h.m97027b(eVar.getName()).mo78586f();
        C13706o.m87928e(f, "safeIdentifier(klass.name).identifier");
        if (b2 instanceof C14050k0) {
            C16152c e = ((C14050k0) b2).mo72551e();
            if (e.mo78558d()) {
                return f;
            }
            StringBuilder sb = new StringBuilder();
            String b3 = e.mo78556b();
            C13706o.m87928e(b3, "fqName.asString()");
            sb.append(C15176v.m93629D(b3, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null));
            sb.append('/');
            sb.append(f);
            return sb.toString();
        }
        C13948e eVar2 = b2 instanceof C13948e ? (C13948e) b2 : null;
        if (eVar2 != null) {
            String c = yVar.mo73229c(eVar2);
            if (c == null) {
                c = m90575a(eVar2, yVar);
            }
            return c + '$' + f;
        }
        throw new IllegalArgumentException("Unexpected container: " + b2 + " for " + eVar);
    }

    /* renamed from: b */
    public static /* synthetic */ String m90576b(C13948e eVar, C14475y yVar, int i, Object obj) {
        if ((i & 2) != 0) {
            yVar = C14477z.f63316a;
        }
        return m90575a(eVar, yVar);
    }

    /* renamed from: c */
    public static final boolean m90577c(C13908a aVar) {
        C13706o.m87929f(aVar, "descriptor");
        if (aVar instanceof C14052l) {
            return true;
        }
        C14900e0 returnType = aVar.getReturnType();
        C13706o.m87926c(returnType);
        if (C13853h.m88244B0(returnType)) {
            C14900e0 returnType2 = aVar.getReturnType();
            C13706o.m87926c(returnType2);
            if (C14956n1.m92997l(returnType2) || (aVar instanceof C14142u0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m90578d(kotlin.reflect.jvm.internal.impl.types.C14900e0 r8, kotlin.reflect.jvm.internal.impl.load.kotlin.C14451m<T> r9, kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0 r10, kotlin.reflect.jvm.internal.impl.load.kotlin.C14475y<? extends T> r11, kotlin.reflect.jvm.internal.impl.load.kotlin.C14444j<T> r12, p370qa.C16270q<? super kotlin.reflect.jvm.internal.impl.types.C14900e0, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.C14418a0, p297ja.C13339u> r13) {
        /*
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "writeGenericType"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r11.mo73230d(r8)
            if (r1 == 0) goto L_0x0029
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = m90578d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x0029:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C13852g.m88238q(r8)
            if (r0 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = kotlin.reflect.jvm.internal.impl.builtins.C13904l.m88465a(r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = m90578d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.types.checker.q r0 = kotlin.reflect.jvm.internal.impl.types.checker.C14865q.f63991a
            java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.C14426b0.m90536b(r0, r8, r9, r10)
            if (r1 == 0) goto L_0x0051
            boolean r11 = r10.mo73129d()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.C14426b0.m90535a(r9, r1, r11)
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0051:
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r8.mo73702N0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.C14884d0
            if (r2 == 0) goto L_0x0077
            kotlin.reflect.jvm.internal.impl.types.d0 r1 = (kotlin.reflect.jvm.internal.impl.types.C14884d0) r1
            kotlin.reflect.jvm.internal.impl.types.e0 r8 = r1.mo74116g()
            if (r8 != 0) goto L_0x0069
            java.util.Collection r8 = r1.mo72370l()
            kotlin.reflect.jvm.internal.impl.types.e0 r8 = r11.mo73232f(r8)
        L_0x0069:
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = p225cc.C11170a.m74974w(r8)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r8 = m90578d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0077:
            kotlin.reflect.jvm.internal.impl.descriptors.h r1 = r1.mo62183c()
            if (r1 == 0) goto L_0x01c5
            boolean r2 = p450zb.C17088k.m100541m(r1)
            if (r2 == 0) goto L_0x008f
            java.lang.String r10 = "error/NonExistentClass"
            java.lang.Object r9 = r9.mo73193e(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r1
            r11.mo73231e(r8, r1)
            return r9
        L_0x008f:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r2 == 0) goto L_0x00fe
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88255c0(r8)
            if (r3 == 0) goto L_0x00fe
            java.util.List r0 = r8.mo73700L0()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x00f6
            java.util.List r8 = r8.mo73700L0()
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            kotlin.reflect.jvm.internal.impl.types.g1 r8 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r8
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r8.getType()
            java.lang.String r0 = "memberProjection.type"
            kotlin.jvm.internal.C13706o.m87928e(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.r1 r0 = r8.mo74185c()
            kotlin.reflect.jvm.internal.impl.types.r1 r3 = kotlin.reflect.jvm.internal.impl.types.C14970r1.IN_VARIANCE
            if (r0 != r3) goto L_0x00c7
            java.lang.String r8 = "java/lang/Object"
            java.lang.Object r8 = r9.mo73193e(r8)
            goto L_0x00dc
        L_0x00c7:
            kotlin.reflect.jvm.internal.impl.types.r1 r8 = r8.mo74185c()
            java.lang.String r0 = "memberProjection.projectionKind"
            kotlin.jvm.internal.C13706o.m87928e(r8, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r4 = r10.mo73131f(r8, r1)
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m90578d(r2, r3, r4, r5, r6, r7)
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 91
            r10.append(r11)
            java.lang.String r8 = r9.mo73192d(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object r8 = r9.mo73189a(r8)
            return r8
        L_0x00f6:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "arrays must have one type argument"
            r8.<init>(r9)
            throw r8
        L_0x00fe:
            if (r2 == 0) goto L_0x0172
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91643b(r1)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r10.mo73128c()
            if (r2 != 0) goto L_0x0122
            bc.i r0 = kotlin.reflect.jvm.internal.impl.types.C14987x.m93162a(r0, r8)
            r2 = r0
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r2
            if (r2 == 0) goto L_0x0122
            kotlin.reflect.jvm.internal.impl.load.kotlin.a0 r4 = r10.mo73132g()
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m90578d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0122:
            boolean r12 = r10.mo73130e()
            if (r12 == 0) goto L_0x0136
            r12 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.e r12 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r12
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88265k0(r12)
            if (r12 == 0) goto L_0x0136
            java.lang.Object r9 = r9.mo73194f()
            goto L_0x016e
        L_0x0136:
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r1
            kotlin.reflect.jvm.internal.impl.descriptors.e r12 = r1.mo72233a()
            java.lang.String r0 = "descriptor.original"
            kotlin.jvm.internal.C13706o.m87928e(r12, r0)
            java.lang.Object r12 = r11.mo73227a(r12)
            if (r12 != 0) goto L_0x016d
            kotlin.reflect.jvm.internal.impl.descriptors.f r12 = r1.mo62168h()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.C13951f.ENUM_ENTRY
            if (r12 != r0) goto L_0x015b
            kotlin.reflect.jvm.internal.impl.descriptors.m r12 = r1.mo62163b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r12, r0)
            r1 = r12
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r1
        L_0x015b:
            kotlin.reflect.jvm.internal.impl.descriptors.e r12 = r1.mo72233a()
            java.lang.String r0 = "enumClassIfEnumEntry.original"
            kotlin.jvm.internal.C13706o.m87928e(r12, r0)
            java.lang.String r11 = m90575a(r12, r11)
            java.lang.Object r9 = r9.mo73193e(r11)
            goto L_0x016e
        L_0x016d:
            r9 = r12
        L_0x016e:
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0172:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13950e1
            if (r0 == 0) goto L_0x0194
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r1
            kotlin.reflect.jvm.internal.impl.types.e0 r12 = p225cc.C11170a.m74960i(r1)
            boolean r8 = r8.mo73021O0()
            if (r8 == 0) goto L_0x0186
            kotlin.reflect.jvm.internal.impl.types.e0 r12 = p225cc.C11170a.m74971t(r12)
        L_0x0186:
            r0 = r12
            qa.q r5 = p272gc.C12347d.m83097b()
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r8 = m90578d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0194:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13947d1
            if (r0 == 0) goto L_0x01ae
            boolean r0 = r10.mo73127b()
            if (r0 == 0) goto L_0x01ae
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13947d1) r1
            kotlin.reflect.jvm.internal.impl.types.m0 r2 = r1.mo72280G()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = m90578d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01dc }
            return r8
        L_0x01ae:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown type "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01c5:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "no descriptor for type constructor of "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01dc:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C14433d.m90578d(kotlin.reflect.jvm.internal.impl.types.e0, kotlin.reflect.jvm.internal.impl.load.kotlin.m, kotlin.reflect.jvm.internal.impl.load.kotlin.a0, kotlin.reflect.jvm.internal.impl.load.kotlin.y, kotlin.reflect.jvm.internal.impl.load.kotlin.j, qa.q):java.lang.Object");
    }

    /* renamed from: e */
    public static /* synthetic */ Object m90579e(C14900e0 e0Var, C14451m mVar, C14418a0 a0Var, C14475y yVar, C14444j jVar, C16270q<Object, Object, Object, C13339u> qVar, int i, Object obj) {
        if ((i & 32) != 0) {
            qVar = C12347d.m83097b();
        }
        return m90578d(e0Var, mVar, a0Var, yVar, jVar, qVar);
    }
}
