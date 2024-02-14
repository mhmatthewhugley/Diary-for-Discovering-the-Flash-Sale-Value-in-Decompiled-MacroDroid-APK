package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzx extends zzv {
    /* renamed from: m */
    static final /* synthetic */ WindowInsets m2790m(Activity activity, View view, WindowInsets windowInsets) {
        if (zzt.m2904q().mo43494h().mo20377k() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg h = zzt.m2904q().mo43494h();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                h.mo20386p0(str);
            } else {
                zzt.m2904q().mo43494h().mo20386p0(str);
            }
        }
        m2791n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: n */
    private static final void m2791n(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: h */
    public final int mo20253h(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    /* renamed from: i */
    public final void mo20254i(Activity activity) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27053Z0)).booleanValue() && zzt.m2904q().mo43494h().mo20377k() == null && !activity.isInMultiWindowMode()) {
            m2791n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzw(this, activity));
        }
    }
}
