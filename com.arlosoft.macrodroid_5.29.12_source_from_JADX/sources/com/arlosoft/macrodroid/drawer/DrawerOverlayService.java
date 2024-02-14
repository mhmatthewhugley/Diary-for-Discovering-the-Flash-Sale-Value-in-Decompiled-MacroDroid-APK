package com.arlosoft.macrodroid.drawer;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.android.p023dx.p026io.Opcodes;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.action.dim.DimOverlayService;
import com.arlosoft.macrodroid.events.CloseDrawerEvent;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.DrawerOpenCloseTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p143p1.C16085b;
import p143p1.C16086c;
import p143p1.C16087d;
import p143p1.C16088e;
import p143p1.C16089f;
import p149q1.C8152a;
import p161s1.C10180a;

public class DrawerOverlayService extends Service {

    /* renamed from: A */
    public static boolean f11317A = false;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WindowManager f11318a;

    /* renamed from: c */
    private int f11319c;

    /* renamed from: d */
    WindowManager.LayoutParams f11320d;

    /* renamed from: f */
    private View f11321f;

    /* renamed from: g */
    private View f11322g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public DrawerFrameLayout f11323o;

    /* renamed from: p */
    private int f11324p;

    /* renamed from: s */
    private boolean f11325s;

    /* renamed from: z */
    private C8152a f11326z;

    /* renamed from: com.arlosoft.macrodroid.drawer.DrawerOverlayService$a */
    class C4455a implements Animation.AnimationListener {
        C4455a() {
        }

        public void onAnimationEnd(Animation animation) {
            DrawerOverlayService.this.f11318a.removeView(DrawerOverlayService.this.f11323o);
            DrawerOverlayService.this.stopSelf();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: h */
    private void m17559h() {
        this.f11321f.setX((float) (this.f11326z.leftSide ? -this.f11319c : this.f11319c));
        this.f11321f.animate().setInterpolator(new DecelerateInterpolator()).setDuration(250).x((float) (this.f11326z.leftSide ? 0 : this.f11319c - this.f11324p));
        this.f11322g.animate().setDuration(250).alpha(0.3f);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m17562k() {
        if (!this.f11325s) {
            this.f11325s = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (this.f11326z.leftSide ? -this.f11324p : this.f11324p), 0.0f, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(250);
            this.f11322g.animate().setDuration(250).alpha(0.0f);
            translateAnimation.setAnimationListener(new C4455a());
            this.f11321f.startAnimation(translateAnimation);
        }
    }

    /* renamed from: j */
    private void m17561j(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof DrawerOpenCloseTrigger) && ((DrawerOpenCloseTrigger) next2).mo31100g3() == z && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m17563l(View view) {
        stopSelf();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m17566o(View view) {
        stopSelf();
        Intent intent = new Intent(this, NewHomeScreenActivity.class);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    /* renamed from: p */
    private synchronized void m17567p() {
        this.f11318a = (WindowManager) getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f11318a.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f11319c = displayMetrics.widthPixels;
        this.f11324p = getResources().getDimensionPixelOffset(this.f11326z.leftSide ? C17529R$dimen.drawer_width_left : C17529R$dimen.drawer_width_right);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 0, 0, C6363a1.m24608b(this), 17563680, -3);
        this.f11320d = layoutParams;
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        DrawerFrameLayout drawerFrameLayout = (DrawerFrameLayout) View.inflate(getBaseContext(), C17535R$layout.overlay_drawer, (ViewGroup) null);
        this.f11323o = drawerFrameLayout;
        drawerFrameLayout.setBackKeyListener(new C16089f(this));
        this.f11323o.setOnClickListener(new C16086c(this));
        this.f11321f = this.f11323o.findViewById(C17532R$id.drawer_wrapper);
        this.f11322g = this.f11323o.findViewById(C17532R$id.background);
        ((FrameLayout.LayoutParams) this.f11321f.getLayoutParams()).gravity = this.f11326z.leftSide ? 3 : 5;
        ((FrameLayout.LayoutParams) this.f11321f.getLayoutParams()).width = this.f11324p;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 0) {
            z = false;
        }
        this.f11323o.findViewById(Boolean.valueOf(z).booleanValue() ? C17532R$id.drawer_anim_fixer_ltr : C17532R$id.drawer_anim_fixer_rtl).setVisibility(this.f11326z.leftSide ? 8 : 0);
        ImageView imageView = (ImageView) this.f11323o.findViewById(C17532R$id.macrodroid_icon);
        ImageView imageView2 = (ImageView) this.f11323o.findViewById(C17532R$id.add_button);
        ImageView imageView3 = (ImageView) this.f11323o.findViewById(C17532R$id.reorder_button);
        View findViewById = this.f11323o.findViewById(C17532R$id.drawer_header);
        if (this.f11326z.leftSide) {
            findViewById.setBackgroundResource(C17530R$drawable.drawer_header_background_left);
        }
        if (this.f11326z.headerColor != 0) {
            Drawable wrap = DrawableCompat.wrap(findViewById.getBackground());
            DrawableCompat.setTint(wrap, this.f11326z.headerColor);
            findViewById.setBackground(wrap);
        }
        if (DimOverlayService.f8202f) {
            ((FrameLayout) this.f11323o.findViewById(C17532R$id.drawer_dimmer_container)).setForeground(new ColorDrawable(Color.argb((DimOverlayService.f8203g * Opcodes.REM_INT_LIT8) / 100, 0, 0, 0)));
        }
        MacroDroidDrawer macroDroidDrawer = (MacroDroidDrawer) this.f11323o.findViewById(C17532R$id.macrodroid_drawer);
        if (this.f11326z.leftSide) {
            macroDroidDrawer.setBackgroundResource(C17530R$drawable.drawer_body_background_left);
        }
        macroDroidDrawer.mo28837p();
        imageView2.setOnClickListener(new C16087d(macroDroidDrawer));
        imageView3.setOnClickListener(new C16088e(macroDroidDrawer));
        imageView.setOnClickListener(new C16085b(this));
        if (i < 23 || Settings.canDrawOverlays(this)) {
            try {
                this.f11318a.addView(this.f11323o, this.f11320d);
                m17559h();
            } catch (Exception unused) {
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f11318a.removeView(this.f11323o);
        } catch (Exception unused) {
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        C10180a.m40075a().mo80019m(this);
        this.f11326z = C5163j2.m20012M(this);
        m17567p();
        m17561j(true);
        f11317A = true;
    }

    public void onDestroy() {
        m17562k();
        C10180a.m40075a().mo80020p(this);
        m17561j(false);
        f11317A = false;
        super.onDestroy();
    }

    public void onEventMainThread(CloseDrawerEvent closeDrawerEvent) {
        m17562k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        m17562k();
    }
}
