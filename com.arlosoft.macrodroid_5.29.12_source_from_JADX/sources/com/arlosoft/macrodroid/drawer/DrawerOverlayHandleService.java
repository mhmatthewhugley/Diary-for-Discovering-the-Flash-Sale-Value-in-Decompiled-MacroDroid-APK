package com.arlosoft.macrodroid.drawer;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.action.dim.DimOverlayService;
import com.arlosoft.macrodroid.events.DrawerHandleUpdateEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6363a1;
import p143p1.C16084a;
import p148q0.C8151a;
import p149q1.C8152a;
import p161s1.C10180a;

public class DrawerOverlayHandleService extends Service {

    /* renamed from: a */
    private WindowManager f11309a;

    /* renamed from: c */
    private boolean f11310c;

    /* renamed from: d */
    private int f11311d;

    /* renamed from: f */
    private int f11312f;

    /* renamed from: g */
    private View f11313g;

    /* renamed from: o */
    private View f11314o;

    /* renamed from: p */
    private int f11315p;

    /* renamed from: s */
    private C8152a f11316s;

    /* renamed from: b */
    private synchronized void m17547b() {
        this.f11316s = C5163j2.m20012M(this);
        View inflate = View.inflate(getBaseContext(), C17535R$layout.overlay_drawer_handle, (ViewGroup) null);
        this.f11313g = inflate;
        this.f11314o = inflate.findViewById(C17532R$id.visible_handle);
        WindowManager windowManager = (WindowManager) getSystemService("window");
        this.f11309a = windowManager;
        this.f11315p = windowManager.getDefaultDisplay().getHeight();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f11309a.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = (int) (((float) this.f11316s.swipeAreaWidth) * getResources().getDisplayMetrics().density);
        int visibleWidth = (int) (((float) this.f11316s.getVisibleWidth()) * getResources().getDisplayMetrics().density);
        C8152a aVar = this.f11316s;
        int i3 = this.f11315p;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, (int) ((((float) (aVar.swipeAreaHeight + 10)) / 100.0f) * ((float) i3)), this.f11316s.leftSide ? -i : i - i2, (((int) ((((float) (aVar.swipeAreaOffset + 10)) / 100.0f) * ((float) i3))) - (i3 / 2)) - m17548c(), C6363a1.m24608b(this), 17563688, -3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        m17550e();
        this.f11314o.getLayoutParams().width = visibleWidth;
        ((FrameLayout.LayoutParams) this.f11314o.getLayoutParams()).gravity = this.f11316s.leftSide ? 3 : 5;
        m17551f();
        this.f11313g.setOnTouchListener(new C16084a(this));
        if (i4 < 23 || Settings.canDrawOverlays(this)) {
            try {
                this.f11309a.addView(this.f11313g, layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private int m17548c() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m17549d(View view, MotionEvent motionEvent) {
        View view2 = this.f11313g;
        if (view2 != null && ViewCompat.isAttachedToWindow(view2)) {
            try {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f11311d = rawX;
                    this.f11312f = rawY;
                } else if (action == 1) {
                    this.f11310c = false;
                } else if (action == 2) {
                    int i = rawX - this.f11311d;
                    int i2 = rawY - this.f11312f;
                    if (C5163j2.m20099Y2(this) && (((i > 100 && this.f11316s.leftSide) || (i < -100 && !this.f11316s.leftSide)) && !this.f11310c)) {
                        this.f11310c = true;
                        startService(new Intent(this, DrawerOverlayService.class));
                    }
                    if (((i2 > 100 && C5163j2.m20092X2(this)) || (i2 < -100 && C5163j2.m20106Z2(this))) && !this.f11310c) {
                        this.f11310c = true;
                        startService(new Intent(this, DrawerOverlayService.class));
                    }
                }
            } catch (IllegalArgumentException e) {
                C8151a.m33873n(e);
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m17550e() {
        this.f11314o.setBackgroundResource(this.f11316s.leftSide ? C17530R$drawable.drawer_swipe_bg_left : C17530R$drawable.drawer_swipe_bg_right);
        C8152a aVar = this.f11316s;
        int alphaComponent = ColorUtils.setAlphaComponent(aVar.swipeAreaColor, Math.min(aVar.swipeAreaOpacity, 255));
        Drawable background = this.f11314o.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(alphaComponent);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(alphaComponent);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(alphaComponent);
        }
    }

    /* renamed from: f */
    private void m17551f() {
        FrameLayout frameLayout = (FrameLayout) this.f11313g.findViewById(C17532R$id.drawer_container);
        if (DimOverlayService.f8202f) {
            frameLayout.setAlpha(((float) ((100 - DimOverlayService.f8203g) + 20)) / 120.0f);
        } else {
            frameLayout.setAlpha(1.0f);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f11309a.removeView(this.f11313g);
        } catch (Exception unused) {
        }
        m17547b();
    }

    public void onCreate() {
        super.onCreate();
        m17547b();
        C10180a.m40075a().mo80019m(this);
    }

    public void onDestroy() {
        try {
            this.f11309a.removeView(this.f11313g);
        } catch (Exception unused) {
        }
        C10180a.m40075a().mo80020p(this);
        super.onDestroy();
    }

    public void onEventMainThread(DrawerHandleUpdateEvent drawerHandleUpdateEvent) {
        if (this.f11313g != null) {
            this.f11316s = drawerHandleUpdateEvent.mo29102a();
            m17550e();
            ((FrameLayout.LayoutParams) this.f11314o.getLayoutParams()).gravity = this.f11316s.leftSide ? 3 : 5;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f11313g.getLayoutParams();
            int i = (int) (((float) this.f11316s.swipeAreaWidth) * getResources().getDisplayMetrics().density);
            int visibleWidth = (int) (((float) this.f11316s.getVisibleWidth()) * getResources().getDisplayMetrics().density);
            C8152a aVar = this.f11316s;
            int i2 = this.f11315p;
            int i3 = (int) ((((float) (aVar.swipeAreaHeight + 10)) / 100.0f) * ((float) i2));
            int c = (((int) ((((float) (aVar.swipeAreaOffset + 10)) / 100.0f) * ((float) i2))) - (i2 / 2)) - m17548c();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f11309a.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            layoutParams.x = this.f11316s.leftSide ? -i4 : i4 - ((int) (((float) this.f11316s.swipeAreaWidth) * getResources().getDisplayMetrics().density));
            layoutParams.y = c;
            layoutParams.width = i;
            layoutParams.height = i3;
            this.f11309a.updateViewLayout(this.f11313g, layoutParams);
            this.f11314o.getLayoutParams().width = visibleWidth;
            m17551f();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
