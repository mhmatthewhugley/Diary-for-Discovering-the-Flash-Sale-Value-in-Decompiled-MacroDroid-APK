package p349ob;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14490f;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import p297ja.C13328m;
import p308kb.C13455c;
import p308kb.C13460d;
import p308kb.C13481i;
import p308kb.C13488l;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13527u;
import p327mb.C15714b;
import p327mb.C15719c;
import p327mb.C15722e;
import p327mb.C15723f;
import p327mb.C15724g;
import p336nb.C15766a;
import p349ob.C15831d;
import p370qa.C16265l;

/* renamed from: ob.i */
/* compiled from: JvmProtoBufUtil.kt */
public final class C15841i {

    /* renamed from: a */
    public static final C15841i f65291a = new C15841i();

    /* renamed from: b */
    private static final C14490f f65292b;

    static {
        C14490f d = C14490f.m90911d();
        C15766a.m95092a(d);
        C13706o.m87928e(d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f65292b = d;
    }

    private C15841i() {
    }

    /* renamed from: d */
    public static /* synthetic */ C15831d.C15832a m95457d(C15841i iVar, C13494n nVar, C15719c cVar, C15724g gVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return iVar.mo75621c(nVar, cVar, gVar, z);
    }

    /* renamed from: f */
    public static final boolean m95458f(C13494n nVar) {
        C13706o.m87929f(nVar, "proto");
        C15714b.C15716b a = C15830c.f65270a.mo75607a();
        Object w = nVar.mo73393w(C15766a.f65115e);
        C13706o.m87928e(w, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean g = a.mo75157d(((Number) w).intValue());
        C13706o.m87928e(g, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return g.booleanValue();
    }

    /* renamed from: g */
    private final String m95459g(C13508q qVar, C15719c cVar) {
        if (qVar.mo71454s0()) {
            return C15829b.m95440b(cVar.mo75164b(qVar.mo71440a0()));
        }
        return null;
    }

    /* renamed from: h */
    public static final C13328m<C15836f, C13455c> m95460h(byte[] bArr, String[] strArr) {
        C13706o.m87929f(bArr, "bytes");
        C13706o.m87929f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C13328m<>(f65291a.m95463k(byteArrayInputStream, strArr), C13455c.m86115D1(byteArrayInputStream, f65292b));
    }

    /* renamed from: i */
    public static final C13328m<C15836f, C13455c> m95461i(String[] strArr, String[] strArr2) {
        C13706o.m87929f(strArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C13706o.m87929f(strArr2, "strings");
        byte[] e = C15828a.m95437e(strArr);
        C13706o.m87928e(e, "decodeBytes(data)");
        return m95460h(e, strArr2);
    }

    /* renamed from: j */
    public static final C13328m<C15836f, C13481i> m95462j(String[] strArr, String[] strArr2) {
        C13706o.m87929f(strArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C13706o.m87929f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C15828a.m95437e(strArr));
        return new C13328m<>(f65291a.m95463k(byteArrayInputStream, strArr2), C13481i.m86499L0(byteArrayInputStream, f65292b));
    }

    /* renamed from: k */
    private final C15836f m95463k(InputStream inputStream, String[] strArr) {
        C15766a.C15777e F = C15766a.C15777e.m95216F(inputStream, f65292b);
        C13706o.m87928e(F, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C15836f(F, strArr);
    }

    /* renamed from: l */
    public static final C13328m<C15836f, C13488l> m95464l(byte[] bArr, String[] strArr) {
        C13706o.m87929f(bArr, "bytes");
        C13706o.m87929f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new C13328m<>(f65291a.m95463k(byteArrayInputStream, strArr), C13488l.m86602i0(byteArrayInputStream, f65292b));
    }

    /* renamed from: m */
    public static final C13328m<C15836f, C13488l> m95465m(String[] strArr, String[] strArr2) {
        C13706o.m87929f(strArr, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C13706o.m87929f(strArr2, "strings");
        byte[] e = C15828a.m95437e(strArr);
        C13706o.m87928e(e, "decodeBytes(data)");
        return m95464l(e, strArr2);
    }

    /* renamed from: a */
    public final C14490f mo75619a() {
        return f65292b;
    }

    /* renamed from: b */
    public final C15831d.C15833b mo75620b(C13460d dVar, C15719c cVar, C15724g gVar) {
        String str;
        C13706o.m87929f(dVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C14495h.C14502f<C13460d, C15766a.C15771c> fVar = C15766a.f65111a;
        C13706o.m87928e(fVar, "constructorSignature");
        C15766a.C15771c cVar2 = (C15766a.C15771c) C15722e.m95026a(dVar, fVar);
        String string = (cVar2 == null || !cVar2.mo75430B()) ? "<init>" : cVar.getString(cVar2.mo75434z());
        if (cVar2 == null || !cVar2.mo75429A()) {
            List<C13527u> P = dVar.mo71168P();
            C13706o.m87928e(P, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(P, 10));
            for (C13527u uVar : P) {
                C15841i iVar = f65291a;
                C13706o.m87928e(uVar, "it");
                String g = iVar.m95459g(C15723f.m95041n(uVar, gVar), cVar);
                if (g == null) {
                    return null;
                }
                arrayList.add(g);
            }
            str = C13566b0.m87432g0(arrayList, "", "(", ")V", 0, (CharSequence) null, (C16265l) null, 56, (Object) null);
        } else {
            str = cVar.getString(cVar2.mo75433y());
        }
        return new C15831d.C15833b(string, str);
    }

    /* renamed from: c */
    public final C15831d.C15832a mo75621c(C13494n nVar, C15719c cVar, C15724g gVar, boolean z) {
        String str;
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C14495h.C14502f<C13494n, C15766a.C15774d> fVar = C15766a.f65114d;
        C13706o.m87928e(fVar, "propertySignature");
        C15766a.C15774d dVar = (C15766a.C15774d) C15722e.m95026a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        C15766a.C15768b C = dVar.mo75449H() ? dVar.mo75444C() : null;
        if (C == null && z) {
            return null;
        }
        int g0 = (C == null || !C.mo75416B()) ? nVar.mo71359g0() : C.mo75420z();
        if (C == null || !C.mo75415A()) {
            str = m95459g(C15723f.m95038k(nVar, gVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.getString(C.mo75419y());
        }
        return new C15831d.C15832a(cVar.getString(g0), str);
    }

    /* renamed from: e */
    public final C15831d.C15833b mo75622e(C13481i iVar, C15719c cVar, C15724g gVar) {
        String str;
        C13481i iVar2 = iVar;
        C15719c cVar2 = cVar;
        C15724g gVar2 = gVar;
        C13706o.m87929f(iVar2, "proto");
        C13706o.m87929f(cVar2, "nameResolver");
        C13706o.m87929f(gVar2, "typeTable");
        C14495h.C14502f<C13481i, C15766a.C15771c> fVar = C15766a.f65112b;
        C13706o.m87928e(fVar, "methodSignature");
        C15766a.C15771c cVar3 = (C15766a.C15771c) C15722e.m95026a(iVar2, fVar);
        int i0 = (cVar3 == null || !cVar3.mo75430B()) ? iVar.mo71267i0() : cVar3.mo75434z();
        if (cVar3 == null || !cVar3.mo75429A()) {
            List n = C13614t.m87752n(C15723f.m95035h(iVar2, gVar2));
            List<C13527u> w0 = iVar.mo71279w0();
            C13706o.m87928e(w0, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(w0, 10));
            for (C13527u uVar : w0) {
                C13706o.m87928e(uVar, "it");
                arrayList.add(C15723f.m95041n(uVar, gVar2));
            }
            List<C13508q> q0 = C13566b0.m87442q0(n, arrayList);
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(q0, 10));
            for (C13508q g : q0) {
                String g2 = f65291a.m95459g(g, cVar2);
                if (g2 == null) {
                    return null;
                }
                arrayList2.add(g2);
            }
            String g3 = m95459g(C15723f.m95037j(iVar2, gVar2), cVar2);
            if (g3 == null) {
                return null;
            }
            str = C13566b0.m87432g0(arrayList2, "", "(", ")", 0, (CharSequence) null, (C16265l) null, 56, (Object) null) + g3;
        } else {
            str = cVar2.getString(cVar3.mo75433y());
        }
        return new C15831d.C15833b(cVar2.getString(i0), str);
    }
}
