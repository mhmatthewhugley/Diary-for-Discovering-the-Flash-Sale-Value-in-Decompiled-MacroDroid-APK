package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.view.Display;
import androidx.appcompat.app.AlertDialog;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.ScreenOnActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import p128m0.C7883y2;
import p319lc.C15626c;

public class ScreenOnAction extends Action {
    public static final Parcelable.Creator<ScreenOnAction> CREATOR = new C2610b();
    private boolean m_pieLockScreen;
    private boolean m_screenOff;
    private boolean m_screenOffNoLock;
    private boolean m_screenOnAlternative;

    /* renamed from: com.arlosoft.macrodroid.action.ScreenOnAction$a */
    class C2609a implements DialogInterface.OnClickListener {
        C2609a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ScreenOnAction.super.mo24714u1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ScreenOnAction$b */
    class C2610b implements Parcelable.Creator<ScreenOnAction> {
        C2610b() {
        }

        /* renamed from: a */
        public ScreenOnAction createFromParcel(Parcel parcel) {
            return new ScreenOnAction(parcel, (C2609a) null);
        }

        /* renamed from: b */
        public ScreenOnAction[] newArray(int i) {
            return new ScreenOnAction[i];
        }
    }

    /* synthetic */ ScreenOnAction(Parcel parcel, C2609a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private String[] m12099m3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_screen_on_on), SelectableItem.m15535j1(C17541R$string.action_screen_on_off), SelectableItem.m15535j1(C17541R$string.action_screen_on_off_no_lock), SelectableItem.m15535j1(C17541R$string.action_screen_on_alternative)};
    }

    /* renamed from: n3 */
    private String[] m12100n3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_screen_on_off_pie_do_not_lock_screen), SelectableItem.m15535j1(C17541R$string.trigger_screen_on_off_pie_lock_the_screen)};
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m12101o3(DialogInterface dialogInterface, int i) {
        boolean z = true;
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() != 1) {
            z = false;
        }
        this.m_pieLockScreen = z;
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_screenOff ? this.m_screenOffNoLock ? 2 : 1 : this.m_screenOnAlternative ? 3 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_screenOff) {
            return this.m_screenOffNoLock ? m12099m3()[2] : m12099m3()[1];
        }
        return m12099m3()[0];
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (Build.VERSION.SDK_INT < 28 || !this.m_screenOff || this.m_pieLockScreen || C4061t1.m15992f0(mo27827K0())) {
            return null;
        }
        return SelectableItem.m15535j1(C17541R$string.accessibility_description);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7883y2.m32983u();
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        mo27871v1();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        PowerManager powerManager = (PowerManager) mo27827K0().getSystemService("power");
        if (!this.m_screenOff) {
            powerManager.newWakeLock(805306378, "macrodroid:screenonaction").acquire(WorkRequest.MIN_BACKOFF_MILLIS);
            if (this.m_screenOnAlternative) {
                boolean z = false;
                for (Display state : ((DisplayManager) mo27827K0().getSystemService("display")).getDisplays()) {
                    if (state.getState() != 1) {
                        z = true;
                    }
                }
                if (!z) {
                    Intent intent = new Intent(mo27827K0(), ScreenOnActivity.class);
                    intent.addFlags(268435456);
                    mo27827K0().startActivity(intent);
                }
            }
        } else if (!powerManager.isScreenOn()) {
        } else {
            if (Build.VERSION.SDK_INT >= 28 && !this.m_pieLockScreen) {
                Intent intent2 = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
                intent2.setAction("com.arlosoft.macrodroid.triggers.services.GLOBAL_CONTROL");
                intent2.putExtra("GlobalControlType", 8);
                mo27827K0().startService(intent2);
            } else if (this.m_screenOffNoLock) {
                try {
                    C4061t1.m15947B0(new String[]{"input keyevent 26"});
                } catch (Exception e) {
                    C4878b.m18868g("Failed to run root command to turn off screen: " + e.toString());
                }
            } else {
                ComponentName componentName = new ComponentName(mo27827K0(), MacroDroidDeviceAdminReceiver.class);
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) mo27827K0().getSystemService("device_policy");
                if (devicePolicyManager.isAdminActive(componentName)) {
                    try {
                        devicePolicyManager.lockNow();
                    } catch (SecurityException unused) {
                        C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.action_screen_on_failed), 0).show();
                    }
                }
            }
        }
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return Build.VERSION.SDK_INT >= 28 && this.m_screenOff && !this.m_pieLockScreen;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12099m3();
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return this.m_screenOnAlternative && Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: j2 */
    public boolean mo24958j2() {
        if (Build.VERSION.SDK_INT < 28 || this.m_pieLockScreen) {
            return this.m_screenOff;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public AlertDialog mo25541l3() {
        if (mo27850j0() == null) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m12100n3(), this.m_pieLockScreen ? 1 : 0, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3652ze(this));
        AlertDialog create = builder.create();
        create.show();
        return create;
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20056S1(mo27827K0())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((CharSequence) mo25559a1());
            builder.setMessage((CharSequence) mo25557Q0());
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2609a());
            builder.show();
            C5163j2.m19960E5(mo27827K0(), false);
            return;
        }
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.m_screenOff) {
            mo24689O1();
        } else if (Build.VERSION.SDK_INT >= 28) {
            mo25541l3();
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_screenOff ? 1 : 0);
        parcel.writeInt(this.m_screenOffNoLock ? 1 : 0);
        parcel.writeInt(this.m_screenOnAlternative ? 1 : 0);
        parcel.writeInt(this.m_pieLockScreen ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        boolean z2 = (i == 0 || i == 3) ? false : true;
        this.m_screenOff = z2;
        this.m_screenOffNoLock = z2 && i == 2;
        if (z2 || i != 3) {
            z = false;
        }
        this.m_screenOnAlternative = z;
    }

    public ScreenOnAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ScreenOnAction() {
        this.m_pieLockScreen = false;
    }

    private ScreenOnAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.m_pieLockScreen = false;
        this.m_screenOff = parcel.readInt() != 0;
        this.m_screenOffNoLock = parcel.readInt() != 0;
        this.m_screenOnAlternative = parcel.readInt() != 0;
        this.m_pieLockScreen = parcel.readInt() != 0 ? true : z;
    }
}
