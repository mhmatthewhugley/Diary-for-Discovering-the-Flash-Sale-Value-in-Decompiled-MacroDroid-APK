package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C15085v;
import kotlin.reflect.jvm.internal.calls.C13740e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14775j;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import p349ob.C15841i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\"\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/v$a;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/d;", "b", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "g", "", "f", "(Lkotlin/reflect/jvm/internal/v$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.w */
/* compiled from: KPropertyImpl.kt */
public final class C15096w {
    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.reflect.jvm.internal.v$a, kotlin.reflect.jvm.internal.v$a<?, ?>] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.calls.C13738d<?> m93390b(kotlin.reflect.jvm.internal.C15085v.C15086a<?, ?> r6, boolean r7) {
        /*
            kotlin.reflect.jvm.internal.i$a r0 = kotlin.reflect.jvm.internal.C13832i.f62047a
            kotlin.text.j r0 = r0.mo72095a()
            kotlin.reflect.jvm.internal.v r1 = r6.mo74315z()
            java.lang.String r1 = r1.mo74368E()
            boolean r0 = r0.mo74468c(r1)
            if (r0 == 0) goto L_0x0017
            kotlin.reflect.jvm.internal.calls.j r6 = kotlin.reflect.jvm.internal.calls.C13772j.f61986a
            return r6
        L_0x0017:
            kotlin.reflect.jvm.internal.f0 r0 = kotlin.reflect.jvm.internal.C13802f0.f62018a
            kotlin.reflect.jvm.internal.v r1 = r6.mo74315z()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r1 = r1.mo72037v()
            kotlin.reflect.jvm.internal.e r0 = r0.mo72050f(r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.C13783e.C13786c
            r2 = 0
            if (r1 == 0) goto L_0x0168
            kotlin.reflect.jvm.internal.e$c r0 = (kotlin.reflect.jvm.internal.C13783e.C13786c) r0
            nb.a$d r1 = r0.mo72022f()
            if (r7 == 0) goto L_0x003d
            boolean r3 = r1.mo75450I()
            if (r3 == 0) goto L_0x0048
            nb.a$c r1 = r1.mo75445D()
            goto L_0x0049
        L_0x003d:
            boolean r3 = r1.mo75451J()
            if (r3 == 0) goto L_0x0048
            nb.a$c r1 = r1.mo75446E()
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x0070
            kotlin.reflect.jvm.internal.v r3 = r6.mo74315z()
            kotlin.reflect.jvm.internal.i r3 = r3.mo72035t()
            mb.c r4 = r0.mo72020d()
            int r5 = r1.mo75434z()
            java.lang.String r4 = r4.getString(r5)
            mb.c r0 = r0.mo72020d()
            int r1 = r1.mo75433y()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r0 = r3.mo72091r(r4, r0)
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 != 0) goto L_0x0118
            kotlin.reflect.jvm.internal.v r0 = r6.mo74315z()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r0.mo72037v()
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.C14654f.m91645d(r0)
            if (r0 == 0) goto L_0x00ed
            kotlin.reflect.jvm.internal.v r0 = r6.mo74315z()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r0.mo72037v()
            kotlin.reflect.jvm.internal.impl.descriptors.u r0 = r0.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.u r1 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.f62753d
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r1)
            if (r0 == 0) goto L_0x00ed
            kotlin.reflect.jvm.internal.v r7 = r6.mo74315z()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r7 = r7.mo72037v()
            kotlin.reflect.jvm.internal.impl.descriptors.m r7 = r7.mo62163b()
            java.lang.Class r7 = kotlin.reflect.jvm.internal.calls.C13768h.m88025h(r7)
            if (r7 == 0) goto L_0x00cd
            kotlin.reflect.jvm.internal.v r0 = r6.mo74315z()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r0.mo72037v()
            java.lang.reflect.Method r7 = kotlin.reflect.jvm.internal.calls.C13768h.m88023f(r7, r0)
            if (r7 == 0) goto L_0x00cd
            boolean r0 = r6.mo72039x()
            if (r0 == 0) goto L_0x00c6
            kotlin.reflect.jvm.internal.calls.i$a r0 = new kotlin.reflect.jvm.internal.calls.i$a
            java.lang.Object r1 = m93394f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x00c6:
            kotlin.reflect.jvm.internal.calls.i$b r0 = new kotlin.reflect.jvm.internal.calls.i$b
            r0.<init>(r7)
            goto L_0x01a1
        L_0x00cd:
            kotlin.reflect.jvm.internal.a0 r7 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.v r6 = r6.mo74315z()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00ed:
            kotlin.reflect.jvm.internal.v r0 = r6.mo74315z()
            java.lang.reflect.Field r0 = r0.mo74367D()
            if (r0 == 0) goto L_0x00fd
            kotlin.reflect.jvm.internal.calls.e r0 = m93391c(r6, r7, r0)
            goto L_0x01a1
        L_0x00fd:
            kotlin.reflect.jvm.internal.a0 r7 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.v r6 = r6.mo74315z()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0118:
            int r7 = r0.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x013a
            boolean r7 = r6.mo72039x()
            if (r7 == 0) goto L_0x0132
            kotlin.reflect.jvm.internal.calls.e$h$a r7 = new kotlin.reflect.jvm.internal.calls.e$h$a
            java.lang.Object r1 = m93394f(r6)
            r7.<init>(r0, r1)
            goto L_0x0137
        L_0x0132:
            kotlin.reflect.jvm.internal.calls.e$h$d r7 = new kotlin.reflect.jvm.internal.calls.e$h$d
            r7.<init>(r0)
        L_0x0137:
            r0 = r7
            goto L_0x01a1
        L_0x013a:
            boolean r7 = m93392d(r6)
            if (r7 == 0) goto L_0x0152
            boolean r7 = r6.mo72039x()
            if (r7 == 0) goto L_0x014c
            kotlin.reflect.jvm.internal.calls.e$h$b r7 = new kotlin.reflect.jvm.internal.calls.e$h$b
            r7.<init>(r0)
            goto L_0x0137
        L_0x014c:
            kotlin.reflect.jvm.internal.calls.e$h$e r7 = new kotlin.reflect.jvm.internal.calls.e$h$e
            r7.<init>(r0)
            goto L_0x0137
        L_0x0152:
            boolean r7 = r6.mo72039x()
            if (r7 == 0) goto L_0x0162
            kotlin.reflect.jvm.internal.calls.e$h$c r7 = new kotlin.reflect.jvm.internal.calls.e$h$c
            java.lang.Object r1 = m93394f(r6)
            r7.<init>(r0, r1)
            goto L_0x0137
        L_0x0162:
            kotlin.reflect.jvm.internal.calls.e$h$f r7 = new kotlin.reflect.jvm.internal.calls.e$h$f
            r7.<init>(r0)
            goto L_0x0137
        L_0x0168:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.C13783e.C13784a
            if (r1 == 0) goto L_0x0177
            kotlin.reflect.jvm.internal.e$a r0 = (kotlin.reflect.jvm.internal.C13783e.C13784a) r0
            java.lang.reflect.Field r0 = r0.mo72016b()
            kotlin.reflect.jvm.internal.calls.e r0 = m93391c(r6, r7, r0)
            goto L_0x01a1
        L_0x0177:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.C13783e.C13785b
            if (r1 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x0184
            kotlin.reflect.jvm.internal.e$b r0 = (kotlin.reflect.jvm.internal.C13783e.C13785b) r0
            java.lang.reflect.Method r7 = r0.mo72017b()
            goto L_0x018c
        L_0x0184:
            kotlin.reflect.jvm.internal.e$b r0 = (kotlin.reflect.jvm.internal.C13783e.C13785b) r0
            java.lang.reflect.Method r7 = r0.mo72018c()
            if (r7 == 0) goto L_0x01ac
        L_0x018c:
            boolean r0 = r6.mo72039x()
            if (r0 == 0) goto L_0x019c
            kotlin.reflect.jvm.internal.calls.e$h$a r0 = new kotlin.reflect.jvm.internal.calls.e$h$a
            java.lang.Object r1 = m93394f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x019c:
            kotlin.reflect.jvm.internal.calls.e$h$d r0 = new kotlin.reflect.jvm.internal.calls.e$h$d
            r0.<init>(r7)
        L_0x01a1:
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r6 = r6.mo74374y()
            r7 = 0
            r1 = 2
            kotlin.reflect.jvm.internal.calls.d r6 = kotlin.reflect.jvm.internal.calls.C13768h.m88020c(r0, r6, r7, r1, r2)
            return r6
        L_0x01ac:
            kotlin.reflect.jvm.internal.a0 r6 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r7.append(r1)
            java.lang.reflect.Method r0 = r0.mo72017b()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01c7:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.C13783e.C13787d
            if (r1 == 0) goto L_0x0245
            if (r7 == 0) goto L_0x01d4
            kotlin.reflect.jvm.internal.e$d r0 = (kotlin.reflect.jvm.internal.C13783e.C13787d) r0
            kotlin.reflect.jvm.internal.d$e r7 = r0.mo72024b()
            goto L_0x01dc
        L_0x01d4:
            kotlin.reflect.jvm.internal.e$d r0 = (kotlin.reflect.jvm.internal.C13783e.C13787d) r0
            kotlin.reflect.jvm.internal.d$e r7 = r0.mo72025c()
            if (r7 == 0) goto L_0x022a
        L_0x01dc:
            kotlin.reflect.jvm.internal.v r0 = r6.mo74315z()
            kotlin.reflect.jvm.internal.i r0 = r0.mo72035t()
            java.lang.String r1 = r7.mo72014c()
            java.lang.String r7 = r7.mo72013b()
            java.lang.reflect.Method r7 = r0.mo72091r(r1, r7)
            if (r7 == 0) goto L_0x020f
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.mo72039x()
            if (r0 == 0) goto L_0x0209
            kotlin.reflect.jvm.internal.calls.e$h$a r0 = new kotlin.reflect.jvm.internal.calls.e$h$a
            java.lang.Object r6 = m93394f(r6)
            r0.<init>(r7, r6)
            goto L_0x020e
        L_0x0209:
            kotlin.reflect.jvm.internal.calls.e$h$d r0 = new kotlin.reflect.jvm.internal.calls.e$h$d
            r0.<init>(r7)
        L_0x020e:
            return r0
        L_0x020f:
            kotlin.reflect.jvm.internal.a0 r7 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.v r6 = r6.mo74315z()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x022a:
            kotlin.reflect.jvm.internal.a0 r7 = new kotlin.reflect.jvm.internal.a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            kotlin.reflect.jvm.internal.v r6 = r6.mo74315z()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0245:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.C15096w.m93390b(kotlin.reflect.jvm.internal.v$a, boolean):kotlin.reflect.jvm.internal.calls.d");
    }

    /* renamed from: c */
    private static final C13740e<Field> m93391c(C15085v.C15086a<?, ?> aVar, boolean z, Field field) {
        C13740e<Field> eVar;
        if (m93395g(aVar.mo74315z().mo72037v()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                if (!aVar.mo72039x()) {
                    return new C13740e.C13746f.C13749c(field);
                }
                eVar = new C13740e.C13746f.C13747a(field, m93394f(aVar));
            } else if (aVar.mo72039x()) {
                eVar = new C13740e.C13752g.C13753a(field, m93393e(aVar), m93394f(aVar));
            } else {
                eVar = new C13740e.C13752g.C13755c(field, m93393e(aVar));
            }
        } else if (m93392d(aVar)) {
            if (z) {
                if (aVar.mo72039x()) {
                    return new C13740e.C13746f.C13748b(field);
                }
                return new C13740e.C13746f.C13750d(field);
            } else if (aVar.mo72039x()) {
                eVar = new C13740e.C13752g.C13754b(field, m93393e(aVar));
            } else {
                eVar = new C13740e.C13752g.C13756d(field, m93393e(aVar));
            }
        } else if (z) {
            return new C13740e.C13746f.C13751e(field);
        } else {
            eVar = new C13740e.C13752g.C13757e(field, m93393e(aVar));
        }
        return eVar;
    }

    /* renamed from: d */
    private static final boolean m93392d(C15085v.C15086a<?, ?> aVar) {
        return aVar.mo74315z().mo72037v().getAnnotations().mo72249n1(C13841i0.m88204i());
    }

    /* renamed from: e */
    private static final boolean m93393e(C15085v.C15086a<?, ?> aVar) {
        return !C14956n1.m92997l(aVar.mo74315z().mo72037v().getType());
    }

    /* renamed from: f */
    public static final Object m93394f(C15085v.C15086a<?, ?> aVar) {
        C13706o.m87929f(aVar, "<this>");
        return aVar.mo74315z().mo74373z();
    }

    /* renamed from: g */
    private static final boolean m93395g(C14140t0 t0Var) {
        C14064m b = t0Var.mo62163b();
        C13706o.m87928e(b, "containingDeclaration");
        if (!C14650d.m91637x(b)) {
            return false;
        }
        C14064m b2 = b.mo62163b();
        if ((C14650d.m91603C(b2) || C14650d.m91633t(b2)) && (!(t0Var instanceof C14775j) || !C15841i.m95458f(((C14775j) t0Var).mo73859f0()))) {
            return false;
        }
        return true;
    }
}
