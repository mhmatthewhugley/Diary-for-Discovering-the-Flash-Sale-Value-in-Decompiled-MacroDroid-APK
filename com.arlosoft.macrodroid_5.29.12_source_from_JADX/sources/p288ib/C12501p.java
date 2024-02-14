package p288ib;

import kotlin.jvm.internal.C13706o;
import p362pb.C16152c;

/* renamed from: ib.p */
/* compiled from: javaLoading.kt */
public final class C12501p {
    /* renamed from: a */
    private static final boolean m83604a(C12503r rVar) {
        C16152c e;
        C12483b0 b0Var = (C12483b0) C13566b0.m87448w0(rVar.mo68997g());
        C12495j jVar = null;
        C12510x type = b0Var != null ? b0Var.getType() : null;
        if (type instanceof C12495j) {
            jVar = (C12495j) type;
        }
        if (jVar == null) {
            return false;
        }
        C12494i c = jVar.mo68985c();
        if (!(c instanceof C12492g) || (e = ((C12492g) c).mo68968e()) == null || !C13706o.m87924a(e.mo78556b(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0.equals("toString") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0044;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m83605b(p288ib.C12503r r3) {
        /*
            pb.f r0 = r3.getName()
            java.lang.String r0 = r0.mo78583d()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L_0x0033
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L_0x0025
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            boolean r3 = m83604a(r3)
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x003b:
            java.util.List r3 = r3.mo68997g()
            boolean r3 = r3.isEmpty()
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p288ib.C12501p.m83605b(ib.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m83606c(C12502q qVar) {
        C13706o.m87929f(qVar, "<this>");
        return qVar.mo68995M().mo68966F() && (qVar instanceof C12503r) && m83605b((C12503r) qVar);
    }
}
