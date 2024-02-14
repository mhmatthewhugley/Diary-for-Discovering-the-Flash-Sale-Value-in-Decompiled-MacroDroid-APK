package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzard extends zzarq {

    /* renamed from: A */
    private static final Object f25366A = new Object();

    /* renamed from: z */
    private static volatile String f25367z;

    public zzard(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2) {
        super(zzaqe, "Cv0JAL9ptzpRvgIi9AFTFGn0l5MhpPgpRN4VfZybymKMuiqBn9AG0bgJaX/QotAk", "/xONYRXeBwNZknPQ1yARx5KZSPQPbfL2mKAb1nbkf2s=", zzamk, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        this.f25387g.mo41695o(ExifInterface.LONGITUDE_EAST);
        if (f25367z == null) {
            synchronized (f25366A) {
                if (f25367z == null) {
                    f25367z = (String) this.f25388o.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f25387g) {
            this.f25387g.mo41695o(f25367z);
        }
    }
}
