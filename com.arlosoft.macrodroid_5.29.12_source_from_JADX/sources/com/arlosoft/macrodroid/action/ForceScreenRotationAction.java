package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6363a1;
import com.arlosoft.macrodroid.utils.C6462z0;
import p128m0.C7747g1;
import p319lc.C15626c;

public class ForceScreenRotationAction extends Action {
    public static final Parcelable.Creator<ForceScreenRotationAction> CREATOR = new C2472b();
    /* access modifiers changed from: private */
    public static LinearLayout s_orientationChanger;
    private static C6462z0 s_orientationListener;
    private int m_option;
    private transient boolean m_overlayOn;

    /* renamed from: com.arlosoft.macrodroid.action.ForceScreenRotationAction$a */
    class C2471a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WindowManager.LayoutParams f7299a;

        /* renamed from: c */
        final /* synthetic */ boolean f7300c;

        /* renamed from: d */
        final /* synthetic */ WindowManager f7301d;

        C2471a(WindowManager.LayoutParams layoutParams, boolean z, WindowManager windowManager) {
            this.f7299a = layoutParams;
            this.f7300c = z;
            this.f7301d = windowManager;
        }

        public void run() {
            this.f7299a.screenOrientation = this.f7300c ? 1 : 9;
            this.f7301d.updateViewLayout(ForceScreenRotationAction.s_orientationChanger, this.f7299a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ForceScreenRotationAction$b */
    class C2472b implements Parcelable.Creator<ForceScreenRotationAction> {
        C2472b() {
        }

        /* renamed from: a */
        public ForceScreenRotationAction createFromParcel(Parcel parcel) {
            return new ForceScreenRotationAction(parcel, (C2471a) null);
        }

        /* renamed from: b */
        public ForceScreenRotationAction[] newArray(int i) {
            return new ForceScreenRotationAction[i];
        }
    }

    /* synthetic */ ForceScreenRotationAction(Parcel parcel, C2471a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private int m10905l3() {
        Configuration configuration = mo27827K0().getResources().getConfiguration();
        int rotation = ((WindowManager) mo27827K0().getSystemService("window")).getDefaultDisplay().getRotation();
        if (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: m3 */
    private String[] m10906m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_portrait), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_landscape), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_cancel), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_current), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_toggle_current), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_portrait_180), SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation_landscape_180), SelectableItem.m15535j1(C17541R$string.action_force_screen_sensor_landscape), SelectableItem.m15535j1(C17541R$string.action_force_screen_sensor_portrait), SelectableItem.m15535j1(C17541R$string.action_force_screen_full_sensor_mode)};
    }

    /* renamed from: n3 */
    private int m10907n3() {
        int l3 = m10905l3();
        int orientation = ((WindowManager) mo27827K0().getSystemService("window")).getDefaultDisplay().getOrientation();
        return orientation != 0 ? orientation != 1 ? orientation != 2 ? l3 == 1 ? 8 : 1 : l3 == 1 ? 9 : 8 : l3 == 1 ? 0 : 9 : l3 == 1 ? 1 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m10908o3(WindowManager.LayoutParams layoutParams, WindowManager windowManager, boolean z) {
        new Handler(Looper.getMainLooper()).post(new C2471a(layoutParams, z, windowManager));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m10906m3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7747g1.m32324u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        WindowManager windowManager = (WindowManager) mo27827K0().getSystemService("window");
        LinearLayout linearLayout = s_orientationChanger;
        if (linearLayout != null) {
            try {
                windowManager.removeView(linearLayout);
            } catch (IllegalArgumentException unused) {
            }
        }
        s_orientationChanger = new LinearLayout(mo27827K0());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1, 1, C6363a1.m24609c(), 24, -2);
        C6462z0 z0Var = s_orientationListener;
        if (z0Var != null) {
            z0Var.disable();
        }
        int i = this.m_option;
        if (i == 0) {
            layoutParams.screenOrientation = 1;
            this.m_overlayOn = true;
        } else if (i == 1) {
            layoutParams.screenOrientation = 0;
            this.m_overlayOn = true;
        } else if (i == 2) {
            this.m_overlayOn = false;
        } else if (i == 3) {
            layoutParams.screenOrientation = m10907n3();
            this.m_overlayOn = true;
        } else if (i == 4) {
            if (!this.m_overlayOn) {
                this.m_overlayOn = true;
                layoutParams.screenOrientation = m10907n3();
            } else {
                this.m_overlayOn = false;
            }
        } else if (i == 5) {
            layoutParams.screenOrientation = 9;
            this.m_overlayOn = true;
        } else if (i == 6) {
            layoutParams.screenOrientation = 8;
            this.m_overlayOn = true;
        } else if (i == 7) {
            layoutParams.screenOrientation = 6;
            this.m_overlayOn = true;
        } else if (i == 8) {
            s_orientationListener = new C6462z0(mo27827K0(), 3, new C3590x6(this, layoutParams, windowManager));
            this.m_overlayOn = true;
        } else if (i == 9) {
            layoutParams.screenOrientation = 10;
            this.m_overlayOn = true;
        } else {
            this.m_overlayOn = false;
        }
        if (this.m_overlayOn) {
            try {
                windowManager.addView(s_orientationChanger, layoutParams);
                s_orientationChanger.setVisibility(0);
                C6462z0 z0Var2 = s_orientationListener;
                if (z0Var2 != null) {
                    z0Var2.enable();
                }
            } catch (SecurityException unused2) {
                C4878b.m18874m("Screen Rotation failed: requires SYSTEM_ALERT_WINDOW permission", mo27840Y0().longValue());
                Context applicationContext = mo27827K0().getApplicationContext();
                C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.action_force_screen_rotation) + " " + SelectableItem.m15535j1(C17541R$string.action_failed_requires_permission), 0).show();
                s_orientationChanger = null;
            } catch (Exception e) {
                C4878b.m18880s("Screen Rotation failed: " + e.toString(), mo27840Y0().longValue());
            }
        } else {
            s_orientationChanger = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10906m3();
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public ForceScreenRotationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_overlayOn = false;
    }

    private ForceScreenRotationAction() {
    }

    private ForceScreenRotationAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
