package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6401l0;
import p128m0.C7720d;

public class AllowLEDNotificationLightAction extends Action {
    public static final Parcelable.Creator<AllowLEDNotificationLightAction> CREATOR = new C2330a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.action.AllowLEDNotificationLightAction$a */
    class C2330a implements Parcelable.Creator<AllowLEDNotificationLightAction> {
        C2330a() {
        }

        /* renamed from: a */
        public AllowLEDNotificationLightAction createFromParcel(Parcel parcel) {
            return new AllowLEDNotificationLightAction(parcel, (C2330a) null);
        }

        /* renamed from: b */
        public AllowLEDNotificationLightAction[] newArray(int i) {
            return new AllowLEDNotificationLightAction[i];
        }
    }

    /* synthetic */ AllowLEDNotificationLightAction(Parcel parcel, C2330a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m9709j3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_allow_LED_notification_on), MacroDroidApplication.m14845u().getString(C17541R$string.action_allow_LED_notification_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m9709j3()[!this.m_enabled];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7720d.m32191u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT >= 23) {
            Context K0 = mo27827K0();
            boolean z = this.m_enabled;
            C6401l0.m24656b(K0, "notification_light_pulse", z ? 1 : 0, mo27837X0().getName());
            return;
        }
        Settings.System.putInt(mo27827K0().getContentResolver(), "notification_light_pulse", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "led_indicator_charing", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "led_indicator_charging", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "led_indicator_low_battery", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "led_indicator_missed_event", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "led_indicator_voice_recording", this.m_enabled ? 1 : 0);
        Settings.System.putInt(mo27827K0().getContentResolver(), "lge_notification_light_pulse", this.m_enabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9709j3();
    }

    /* renamed from: m2 */
    public boolean mo24739m2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enabled ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_enabled = i == 0;
    }

    public AllowLEDNotificationLightAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AllowLEDNotificationLightAction() {
        this.m_enabled = true;
    }

    private AllowLEDNotificationLightAction(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() == 0;
    }
}
