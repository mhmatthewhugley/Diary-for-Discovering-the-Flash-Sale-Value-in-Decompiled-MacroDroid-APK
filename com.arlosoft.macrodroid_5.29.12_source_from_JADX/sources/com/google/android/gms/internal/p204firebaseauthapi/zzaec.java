package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaec */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaec implements zzaex {

    /* renamed from: b */
    private static final zzaei f39775b = new zzaea();

    /* renamed from: a */
    private final zzaei f39776a;

    public zzaec() {
        zzaei zzaei;
        zzaei[] zzaeiArr = new zzaei[2];
        zzaeiArr[0] = zzada.m56411c();
        try {
            zzaei = (zzaei) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzaei = f39775b;
        }
        zzaeiArr[1] = zzaei;
        zzaeb zzaeb = new zzaeb(zzaeiArr);
        zzadl.m56462f(zzaeb, "messageInfoFactory");
        this.f39776a = zzaeb;
    }

    /* renamed from: a */
    private static boolean m56511a(zzaeh zzaeh) {
        return zzaeh.mo49136a() == 1;
    }

    /* renamed from: c */
    public final zzaew mo49124c(Class cls) {
        Class<zzadf> cls2 = zzadf.class;
        zzaey.m56699g(cls);
        zzaeh a = this.f39776a.mo49065a(cls);
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzaeo.m56595k(zzaey.m56693b(), zzacv.m56398b(), a.zza());
            }
            return zzaeo.m56595k(zzaey.m56694b0(), zzacv.m56397a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m56511a(a)) {
                return zzaen.m56554Q(cls, a, zzaeq.m56607b(), zzady.m56497e(), zzaey.m56693b(), zzacv.m56398b(), zzaeg.m56524b());
            }
            return zzaen.m56554Q(cls, a, zzaeq.m56607b(), zzady.m56497e(), zzaey.m56693b(), (zzact) null, zzaeg.m56524b());
        } else if (m56511a(a)) {
            return zzaen.m56554Q(cls, a, zzaeq.m56606a(), zzady.m56496d(), zzaey.m56694b0(), zzacv.m56397a(), zzaeg.m56523a());
        } else {
            return zzaen.m56554Q(cls, a, zzaeq.m56606a(), zzady.m56496d(), zzaey.m56691a(), (zzact) null, zzaeg.m56523a());
        }
    }
}
