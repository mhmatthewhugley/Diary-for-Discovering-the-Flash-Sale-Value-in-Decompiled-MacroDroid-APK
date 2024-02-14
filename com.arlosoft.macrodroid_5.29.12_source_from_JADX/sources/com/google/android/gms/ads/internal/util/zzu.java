package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgi;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzu extends zzt {
    @VisibleForTesting
    /* renamed from: l */
    static final boolean m2786l(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: e */
    public final boolean mo20250e(Activity activity, Configuration configuration) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27029W3)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27047Y3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzaw.m1917b();
        int w = zzcgi.m45187w(activity, configuration.screenHeightDp);
        int w2 = zzcgi.m45187w(activity, configuration.screenWidthDp);
        zzt.m2905r();
        DisplayMetrics O = zzs.m2741O((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = O.heightPixels;
        int i2 = O.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzay.m1924c().mo42663b(zzbjc.f27010U3)).intValue();
        if (!m2786l(i, w + dimensionPixelSize, round) || !m2786l(i2, w2, round)) {
            return true;
        }
        return false;
    }
}
