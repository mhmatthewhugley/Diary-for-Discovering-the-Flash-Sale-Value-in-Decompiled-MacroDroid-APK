package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgsg implements zzgti {

    /* renamed from: b */
    private static final zzgsm f37212b = new zzgse();

    /* renamed from: a */
    private final zzgsm f37213a;

    public zzgsg() {
        zzgsm zzgsm;
        zzgsm[] zzgsmArr = new zzgsm[2];
        zzgsmArr[0] = zzgqz.m52932c();
        try {
            zzgsm = (zzgsm) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzgsm = f37212b;
        }
        zzgsmArr[1] = zzgsm;
        zzgsf zzgsf = new zzgsf(zzgsmArr);
        zzgro.m53028f(zzgsf, "messageInfoFactory");
        this.f37213a = zzgsf;
    }

    /* renamed from: a */
    private static boolean m53085a(zzgsl zzgsl) {
        return zzgsl.mo47408a() == 1;
    }

    /* renamed from: c */
    public final zzgth mo47396c(Class cls) {
        Class<zzgre> cls2 = zzgre.class;
        zzgtj.m53294g(cls);
        zzgsl a = this.f37213a.mo47298a(cls);
        if (a.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzgss.m53165k(zzgtj.m53288b(), zzgqt.m52920b(), a.zza());
            }
            return zzgss.m53165k(zzgtj.m53289b0(), zzgqt.m52919a(), a.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m53085a(a)) {
                return zzgsr.m53124K(cls, a, zzgsu.m53177b(), zzgsc.m53070e(), zzgtj.m53288b(), zzgqt.m52920b(), zzgsk.m53098b());
            }
            return zzgsr.m53124K(cls, a, zzgsu.m53177b(), zzgsc.m53070e(), zzgtj.m53288b(), (zzgqr) null, zzgsk.m53098b());
        } else if (m53085a(a)) {
            return zzgsr.m53124K(cls, a, zzgsu.m53176a(), zzgsc.m53069d(), zzgtj.m53289b0(), zzgqt.m52919a(), zzgsk.m53097a());
        } else {
            return zzgsr.m53124K(cls, a, zzgsu.m53176a(), zzgsc.m53069d(), zzgtj.m53286a(), (zzgqr) null, zzgsk.m53097a());
        }
    }
}
