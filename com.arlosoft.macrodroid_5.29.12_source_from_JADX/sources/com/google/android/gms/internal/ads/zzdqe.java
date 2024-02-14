package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdqe implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ View f32781a;

    /* renamed from: c */
    public final /* synthetic */ zzcmp f32782c;

    /* renamed from: d */
    public final /* synthetic */ String f32783d;

    /* renamed from: f */
    public final /* synthetic */ WindowManager.LayoutParams f32784f;

    /* renamed from: g */
    public final /* synthetic */ int f32785g;

    /* renamed from: o */
    public final /* synthetic */ WindowManager f32786o;

    public /* synthetic */ zzdqe(View view, zzcmp zzcmp, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f32781a = view;
        this.f32782c = zzcmp;
        this.f32783d = str;
        this.f32784f = layoutParams;
        this.f32785g = i;
        this.f32786o = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f32781a;
        zzcmp zzcmp = this.f32782c;
        String str = this.f32783d;
        WindowManager.LayoutParams layoutParams = this.f32784f;
        int i = this.f32785g;
        WindowManager windowManager = this.f32786o;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && zzcmp.mo44027R().getWindowToken() != null) {
            if ("1".equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(zzcmp.mo44027R(), layoutParams);
        }
    }
}
