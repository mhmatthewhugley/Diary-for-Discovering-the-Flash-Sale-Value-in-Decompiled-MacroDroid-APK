package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqr extends zzarq {

    /* renamed from: A */
    private static final zzarr f25348A = new zzarr();

    /* renamed from: z */
    private final Context f25349z;

    public zzaqr(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, Context context) {
        super(zzaqe, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", zzamk, i, 29);
        this.f25349z = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        this.f25387g.mo41704v0(ExifInterface.LONGITUDE_EAST);
        AtomicReference a = f25348A.mo41850a(this.f25349z.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f25388o.invoke((Object) null, new Object[]{this.f25349z}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.f25387g) {
            this.f25387g.mo41704v0(zzanp.m41981a(str.getBytes(), true));
        }
    }
}
