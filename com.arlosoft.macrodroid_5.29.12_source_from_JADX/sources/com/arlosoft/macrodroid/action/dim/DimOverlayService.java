package com.arlosoft.macrodroid.action.dim;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.events.DrawerHandleUpdateEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import p161s1.C10180a;
import p319lc.C15626c;

public class DimOverlayService extends Service {

    /* renamed from: f */
    public static boolean f8202f = false;

    /* renamed from: g */
    public static int f8203g = 100;

    /* renamed from: a */
    private WindowManager f8204a;

    /* renamed from: c */
    private View f8205c;

    /* renamed from: d */
    private int f8206d;

    /* renamed from: a */
    private void m14208a() {
        Display defaultDisplay = this.f8204a.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f8205c.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, (int) (((double) point.y) * 1.5d), 0, 0, m14209b(), 1816, -3);
        layoutParams.alpha = (((float) this.f8206d) / 100.0f) * 0.8f;
        layoutParams.gravity = 17;
        try {
            this.f8204a.addView(this.f8205c, layoutParams);
        } catch (Exception e) {
            C4878b.m18882u("Dim Overlay failed: requires SYSTEM_ALERT_WINDOW permission - " + e.toString());
            Context applicationContext = getApplicationContext();
            C15626c.m94876a(applicationContext, getString(C17541R$string.action_dim_screen) + " " + getString(C17541R$string.action_failed_requires_permission), 0).show();
        }
    }

    /* renamed from: b */
    private int m14209b() {
        return Build.VERSION.SDK_INT >= 26 ? 2038 : 2006;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        try {
            WindowManager windowManager = this.f8204a;
            if (!(windowManager == null || (view = this.f8205c) == null)) {
                windowManager.removeView(view);
            }
        } catch (IllegalArgumentException unused) {
        }
        m14208a();
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            this.f8204a.removeView(this.f8205c);
        } catch (Exception unused) {
        }
        f8202f = false;
        C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(C5163j2.m20012M(this)));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("percentage", 50);
        this.f8206d = intExtra;
        f8203g = intExtra;
        this.f8204a = (WindowManager) getSystemService("window");
        this.f8205c = View.inflate(getBaseContext(), C17535R$layout.dimmer_overlay, (ViewGroup) null);
        m14208a();
        f8202f = true;
        C10180a.m40075a().mo80018i(new DrawerHandleUpdateEvent(C5163j2.m20012M(this)));
        return 3;
    }
}
