package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzg extends RelativeLayout {
    @VisibleForTesting

    /* renamed from: a */
    final zzas f2089a;
    @VisibleForTesting

    /* renamed from: c */
    boolean f2090c;

    public zzg(Context context, String str, String str2, String str3) {
        super(context);
        zzas zzas = new zzas(context, str);
        this.f2089a = zzas;
        zzas.mo20290o(str2);
        zzas.mo20289n(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2090c) {
            return false;
        }
        this.f2089a.mo20288m(motionEvent);
        return false;
    }
}
