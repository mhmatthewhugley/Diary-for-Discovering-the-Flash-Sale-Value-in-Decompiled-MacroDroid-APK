package p360p9;

import androidx.webkit.ProxyConfig;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import p226cd.C11188e;
import p292io.grpc.C12562g0;
import p292io.grpc.C12960q0;
import p292io.grpc.internal.C12716i2;
import p292io.grpc.internal.C12749o0;
import p369q9.C16240d;

/* renamed from: p9.c */
/* compiled from: Headers */
class C16112c {

    /* renamed from: a */
    public static final C16240d f66093a;

    /* renamed from: b */
    public static final C16240d f66094b;

    /* renamed from: c */
    public static final C16240d f66095c;

    /* renamed from: d */
    public static final C16240d f66096d;

    /* renamed from: e */
    public static final C16240d f66097e = new C16240d(C12749o0.f60035h.mo69779d(), "application/grpc");

    /* renamed from: f */
    public static final C16240d f66098f = new C16240d("te", "trailers");

    static {
        C11188e eVar = C16240d.f66557g;
        f66093a = new C16240d(eVar, ProxyConfig.MATCH_HTTPS);
        f66094b = new C16240d(eVar, "http");
        C11188e eVar2 = C16240d.f66555e;
        f66095c = new C16240d(eVar2, "POST");
        f66096d = new C16240d(eVar2, "GET");
    }

    /* renamed from: a */
    public static List<C16240d> m96757a(C12960q0 q0Var, String str, String str2, String str3, boolean z, boolean z2) {
        Preconditions.m5393t(q0Var, "headers");
        Preconditions.m5393t(str, "defaultPath");
        Preconditions.m5393t(str2, "authority");
        q0Var.mo69763d(C12749o0.f60035h);
        q0Var.mo69763d(C12749o0.f60036i);
        C12960q0.C12967g<String> gVar = C12749o0.f60037j;
        q0Var.mo69763d(gVar);
        ArrayList arrayList = new ArrayList(C12562g0.m83775a(q0Var) + 7);
        if (z2) {
            arrayList.add(f66094b);
        } else {
            arrayList.add(f66093a);
        }
        if (z) {
            arrayList.add(f66096d);
        } else {
            arrayList.add(f66095c);
        }
        arrayList.add(new C16240d(C16240d.f66558h, str2));
        arrayList.add(new C16240d(C16240d.f66556f, str));
        arrayList.add(new C16240d(gVar.mo69779d(), str3));
        arrayList.add(f66097e);
        arrayList.add(f66098f);
        byte[][] d = C12716i2.m84265d(q0Var);
        for (int i = 0; i < d.length; i += 2) {
            C11188e r = C11188e.m75104r(d[i]);
            if (m96758b(r.mo62489H())) {
                arrayList.add(new C16240d(r, C11188e.m75104r(d[i + 1])));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m96758b(String str) {
        return !str.startsWith(":") && !C12749o0.f60035h.mo69779d().equalsIgnoreCase(str) && !C12749o0.f60037j.mo69779d().equalsIgnoreCase(str);
    }
}
