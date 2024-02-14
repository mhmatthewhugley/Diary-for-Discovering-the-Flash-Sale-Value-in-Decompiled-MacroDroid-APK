package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzdw implements zzeq {

    /* renamed from: b */
    private static final zzec f40907b = new zzdu();

    /* renamed from: a */
    private final zzec f40908a;

    public zzdw() {
        zzec zzec;
        zzec[] zzecArr = new zzec[2];
        zzecArr[0] = zzcw.m58782c();
        try {
            zzec = (zzec) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzec = f40907b;
        }
        zzecArr[1] = zzec;
        zzdv zzdv = new zzdv(zzecArr);
        zzdh.m58817b(zzdv, "messageInfoFactory");
        this.f40908a = zzdv;
    }

    /* renamed from: a */
    private static boolean m58855a(zzeb zzeb) {
        return zzeb.mo50353a() == 1;
    }

    /* renamed from: c */
    public final <T> zzep<T> mo50341c(Class<T> cls) {
        Class<zzda> cls2 = zzda.class;
        zzer.m58936A(cls);
        zzeb b = this.f40908a.mo50301b(cls);
        if (b.zza()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzei.m58911g(zzer.m58964c(), zzcs.m58775a(), b.zzb());
            }
            return zzei.m58911g(zzer.m58962a(), zzcs.m58776b(), b.zzb());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m58855a(b)) {
                return zzeh.m58892n(cls, b, zzek.m58919b(), zzds.m58843d(), zzer.m58964c(), zzcs.m58775a(), zzea.m58865b());
            }
            return zzeh.m58892n(cls, b, zzek.m58919b(), zzds.m58843d(), zzer.m58964c(), (zzcq<?>) null, zzea.m58865b());
        } else if (m58855a(b)) {
            return zzeh.m58892n(cls, b, zzek.m58918a(), zzds.m58842c(), zzer.m58962a(), zzcs.m58776b(), zzea.m58864a());
        } else {
            return zzeh.m58892n(cls, b, zzek.m58918a(), zzds.m58842c(), zzer.m58963b(), (zzcq<?>) null, zzea.m58864a());
        }
    }
}
