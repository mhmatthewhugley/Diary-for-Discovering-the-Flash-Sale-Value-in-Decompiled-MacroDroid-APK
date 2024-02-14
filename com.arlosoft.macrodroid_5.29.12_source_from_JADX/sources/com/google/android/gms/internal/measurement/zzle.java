package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzle implements zzly {

    /* renamed from: b */
    private static final zzlk f41665b = new zzlc();

    /* renamed from: a */
    private final zzlk f41666a;

    public zzle() {
        zzlk zzlk;
        zzlk[] zzlkArr = new zzlk[2];
        zzlkArr[0] = zzka.m60485c();
        try {
            zzlk = (zzlk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzlk = f41665b;
        }
        zzlkArr[1] = zzlk;
        zzld zzld = new zzld(zzlkArr);
        zzkn.m60543f(zzld, "messageInfoFactory");
        this.f41666a = zzld;
    }

    /* renamed from: a */
    private static boolean m60587a(zzlj zzlj) {
        return zzlj.mo51505a() == 1;
    }

    /* renamed from: c */
    public final zzlx mo51493c(Class cls) {
        Class<zzkf> cls2 = zzkf.class;
        zzlz.m60732g(cls);
        zzlj a = this.f41666a.mo51436a(cls);
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzlq.m60667j(zzlz.m60726b(), zzju.m60472b(), a.zza());
            }
            return zzlq.m60667j(zzlz.m60727b0(), zzju.m60471a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m60587a(a)) {
                return zzlp.m60625L(cls, a, zzls.m60678b(), zzla.m60573d(), zzlz.m60726b(), zzju.m60472b(), zzli.m60599b());
            }
            return zzlp.m60625L(cls, a, zzls.m60678b(), zzla.m60573d(), zzlz.m60726b(), (zzjs) null, zzli.m60599b());
        } else if (m60587a(a)) {
            return zzlp.m60625L(cls, a, zzls.m60677a(), zzla.m60572c(), zzlz.m60727b0(), zzju.m60471a(), zzli.m60598a());
        } else {
            return zzlp.m60625L(cls, a, zzls.m60677a(), zzla.m60572c(), zzlz.m60724a(), (zzjs) null, zzli.m60598a());
        }
    }
}
