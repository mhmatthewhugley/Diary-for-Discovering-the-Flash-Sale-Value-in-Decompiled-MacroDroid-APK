package p410ue;

import java.io.File;

/* renamed from: ue.g */
/* compiled from: ZTFilePermissionsUtil */
class C16706g {

    /* renamed from: a */
    private static final C16705f f67632a = new C16707a();

    /* renamed from: b */
    private static final C16705f f67633b = m99220b();

    /* renamed from: ue.g$a */
    /* compiled from: ZTFilePermissionsUtil */
    static class C16707a implements C16705f {
        C16707a() {
        }

        /* renamed from: a */
        public void mo79608a(File file, C16704e eVar) {
        }

        /* renamed from: b */
        public C16704e mo79609b(File file) {
            return null;
        }
    }

    /* renamed from: a */
    private static int m99219a(boolean z, int i) {
        if (z) {
            return i;
        }
        return 0;
    }

    /* renamed from: b */
    private static C16705f m99220b() {
        C16705f f = m99224f(C16702c.class);
        if (f == null) {
            f = m99224f(C16701b.class);
        }
        return f == null ? f67632a : f;
    }

    /* renamed from: c */
    static C16704e m99221c(int i) {
        C16704e eVar = new C16704e();
        boolean z = false;
        eVar.mo79626q((i & 64) > 0);
        eVar.mo79620k((i & 8) > 0);
        eVar.mo79623n((i & 1) > 0);
        eVar.mo79628s((i & 128) > 0);
        eVar.mo79622m((i & 16) > 0);
        eVar.mo79625p((i & 2) > 0);
        eVar.mo79627r((i & 256) > 0);
        eVar.mo79621l((i & 32) > 0);
        if ((i & 4) > 0) {
            z = true;
        }
        eVar.mo79624o(z);
        return eVar;
    }

    /* renamed from: d */
    static C16705f m99222d() {
        return f67633b;
    }

    /* renamed from: e */
    static int m99223e(C16704e eVar) {
        return m99219a(eVar.mo79614e(), 4) | m99219a(eVar.mo79616g(), 64) | 0 | m99219a(eVar.mo79610a(), 8) | m99219a(eVar.mo79613d(), 1) | m99219a(eVar.mo79618i(), 128) | m99219a(eVar.mo79612c(), 16) | m99219a(eVar.mo79615f(), 2) | m99219a(eVar.mo79617h(), 256) | m99219a(eVar.mo79611b(), 32);
    }

    /* renamed from: f */
    private static C16705f m99224f(Class<? extends C16705f> cls) {
        try {
            return (C16705f) cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
