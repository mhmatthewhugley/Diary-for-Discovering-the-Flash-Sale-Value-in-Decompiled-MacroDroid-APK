package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzt extends zzai {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzr f41922d;

    public zzt(zzr zzr) {
        super("internal.logger");
        this.f41922d = zzr;
        this.f41191c.put("log", new zzs(this, false, true));
        this.f41191c.put(NotificationCompat.GROUP_KEY_SILENT, new zzp(this, NotificationCompat.GROUP_KEY_SILENT));
        ((zzai) this.f41191c.get(NotificationCompat.GROUP_KEY_SILENT)).mo50710i("log", new zzs(this, true, true));
        this.f41191c.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.f41191c.get("unmonitored")).mo50710i("log", new zzs(this, false, false));
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        return zzap.f41197i;
    }
}
