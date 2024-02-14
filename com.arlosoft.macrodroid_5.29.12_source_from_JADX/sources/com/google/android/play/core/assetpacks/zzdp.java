package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.zzco;
import com.google.android.play.core.internal.zzcq;
import com.google.android.play.core.internal.zzcs;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzdp implements zzcs {

    /* renamed from: a */
    private final zzcs f51498a;

    /* renamed from: b */
    private final zzcs f51499b;

    /* renamed from: c */
    private final zzcs f51500c;

    /* renamed from: d */
    private final zzcs f51501d;

    /* renamed from: e */
    private final zzcs f51502e;

    /* renamed from: f */
    private final zzcs f51503f;

    /* renamed from: g */
    private final zzcs f51504g;

    public zzdp(zzcs zzcs, zzcs zzcs2, zzcs zzcs3, zzcs zzcs4, zzcs zzcs5, zzcs zzcs6, zzcs zzcs7) {
        this.f51498a = zzcs;
        this.f51499b = zzcs2;
        this.f51500c = zzcs3;
        this.f51501d = zzcs4;
        this.f51502e = zzcs5;
        this.f51503f = zzcs6;
        this.f51504g = zzcs7;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        File file;
        String str = (String) this.f51498a.zza();
        Object zza = this.f51499b.zza();
        Object zza2 = this.f51500c.zza();
        Context a = ((zzu) this.f51501d).mo59787a();
        Object zza3 = this.f51502e.zza();
        zzco a2 = zzcq.m70942a(this.f51503f);
        zzbb zzbb = (zzbb) zza;
        zzco zzco = (zzco) zza2;
        zzed zzed = (zzed) zza3;
        zzeb zzeb = (zzeb) this.f51504g.zza();
        if (str != null) {
            file = new File(a.getExternalFilesDir((String) null), str);
        } else {
            file = a.getExternalFilesDir((String) null);
        }
        return new zzdo(file, zzbb, zzco, a, zzed, a2, zzeb);
    }
}
