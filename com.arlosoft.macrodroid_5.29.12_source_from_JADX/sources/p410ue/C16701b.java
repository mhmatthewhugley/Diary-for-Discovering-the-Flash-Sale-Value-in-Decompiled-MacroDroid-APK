package p410ue;

import java.io.File;
import java.lang.reflect.Method;
import org.zeroturnaround.zip.ZipException;

/* renamed from: ue.b */
/* compiled from: Java6FileApiPermissionsStrategy */
class C16701b implements C16705f {

    /* renamed from: a */
    private final Method f67601a = C16708h.m99228b(File.class, "canExecute", new Class[0]);

    /* renamed from: b */
    private final Method f67602b;

    /* renamed from: c */
    private final Method f67603c;

    /* renamed from: d */
    private final Method f67604d;

    public C16701b() throws ZipException {
        Class cls = Boolean.TYPE;
        this.f67602b = C16708h.m99228b(File.class, "setExecutable", cls, cls);
        this.f67604d = C16708h.m99228b(File.class, "setReadable", cls, cls);
        this.f67603c = C16708h.m99228b(File.class, "setWritable", cls, cls);
    }

    /* renamed from: c */
    private boolean m99184c(File file) {
        return ((Boolean) C16708h.m99229c(this.f67601a, file, new Object[0])).booleanValue();
    }

    /* renamed from: d */
    private boolean m99185d(File file, boolean z, boolean z2) {
        return ((Boolean) C16708h.m99229c(this.f67602b, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    /* renamed from: e */
    private boolean m99186e(File file, boolean z, boolean z2) {
        return ((Boolean) C16708h.m99229c(this.f67604d, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    /* renamed from: f */
    private boolean m99187f(File file, boolean z, boolean z2) {
        return ((Boolean) C16708h.m99229c(this.f67603c, file, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue();
    }

    /* renamed from: a */
    public void mo79608a(File file, C16704e eVar) {
        boolean z = true;
        m99185d(file, eVar.mo79616g(), !eVar.mo79610a() && !eVar.mo79613d());
        m99187f(file, eVar.mo79618i(), !eVar.mo79612c() && !eVar.mo79615f());
        boolean h = eVar.mo79617h();
        if (eVar.mo79611b() || eVar.mo79614e()) {
            z = false;
        }
        m99186e(file, h, z);
    }

    /* renamed from: b */
    public C16704e mo79609b(File file) {
        C16704e eVar = new C16704e();
        eVar.mo79619j(file.isDirectory());
        if (m99184c(file)) {
            eVar.mo79626q(true);
        }
        if (file.canWrite()) {
            eVar.mo79628s(true);
            if (file.isDirectory()) {
                eVar.mo79622m(true);
                eVar.mo79625p(true);
            }
        }
        if (file.canRead()) {
            eVar.mo79627r(true);
            eVar.mo79621l(true);
            eVar.mo79624o(true);
        }
        return eVar;
    }
}
