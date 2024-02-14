package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcu implements zzdo {

    /* renamed from: b */
    private static final zzda f45664b = new zzcs();

    /* renamed from: a */
    private final zzda f45665a;

    public zzcu() {
        zzda zzda;
        zzda[] zzdaArr = new zzda[2];
        zzdaArr[0] = zzbr.m64178c();
        try {
            zzda = (zzda) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzda = f45664b;
        }
        zzdaArr[1] = zzda;
        zzct zzct = new zzct(zzdaArr);
        zzcd.m64227f(zzct, "messageInfoFactory");
        this.f45665a = zzct;
    }

    /* renamed from: a */
    private static boolean m64266a(zzcz zzcz) {
        return zzcz.mo53993a() == 1;
    }

    /* renamed from: c */
    public final zzdn mo53981c(Class cls) {
        Class<zzbv> cls2 = zzbv.class;
        zzdp.m64383e(cls);
        zzcz a = this.f45665a.mo53932a(cls);
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzdg.m64326h(zzdp.m64380b(), zzbm.m64166b(), a.zza());
            }
            return zzdg.m64326h(zzdp.m64378Z(), zzbm.m64165a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m64266a(a)) {
                return zzdf.m64292A(cls, a, zzdi.m64335b(), zzcq.m64252d(), zzdp.m64380b(), zzbm.m64166b(), zzcy.m64277b());
            }
            return zzdf.m64292A(cls, a, zzdi.m64335b(), zzcq.m64252d(), zzdp.m64380b(), (zzbk) null, zzcy.m64277b());
        } else if (m64266a(a)) {
            return zzdf.m64292A(cls, a, zzdi.m64334a(), zzcq.m64251c(), zzdp.m64378Z(), zzbm.m64165a(), zzcy.m64276a());
        } else {
            return zzdf.m64292A(cls, a, zzdi.m64334a(), zzcq.m64251c(), zzdp.m64379a(), (zzbk) null, zzcy.m64276a());
        }
    }
}
