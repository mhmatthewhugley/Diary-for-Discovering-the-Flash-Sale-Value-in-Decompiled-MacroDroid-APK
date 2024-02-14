package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.PowerButtonToggleTriggerReceiver;
import p119k3.C7513i1;
import p148q0.C8151a;

public class PowerButtonToggleTrigger extends Trigger {
    public static final Parcelable.Creator<PowerButtonToggleTrigger> CREATOR = new C5719a();
    private static final String[] s_options = {ExifInterface.GPS_MEASUREMENT_3D, "4", "5"};
    private static PowerButtonToggleTriggerReceiver s_screenOnOffTriggerReceiver;
    private static int s_triggerCounter = 0;
    private int m_numToggles;

    /* renamed from: com.arlosoft.macrodroid.triggers.PowerButtonToggleTrigger$a */
    class C5719a implements Parcelable.Creator<PowerButtonToggleTrigger> {
        C5719a() {
        }

        /* renamed from: a */
        public PowerButtonToggleTrigger createFromParcel(Parcel parcel) {
            return new PowerButtonToggleTrigger(parcel, (C5719a) null);
        }

        /* renamed from: b */
        public PowerButtonToggleTrigger[] newArray(int i) {
            return new PowerButtonToggleTrigger[i];
        }
    }

    /* synthetic */ PowerButtonToggleTrigger(Parcel parcel, C5719a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_numToggles - 3;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.trigger_power_button_toggle) + " (" + this.m_numToggles + ")";
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_screenOnOffTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7513i1.m31251u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_screenOnOffTriggerReceiver = new PowerButtonToggleTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return s_options;
    }

    /* renamed from: g3 */
    public int mo31408g3() {
        return this.m_numToggles;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.trigger_power_button_toggle_num_presses);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_numToggles);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_numToggles = i + 3;
    }

    public PowerButtonToggleTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public PowerButtonToggleTrigger() {
        this.m_numToggles = 3;
    }

    private PowerButtonToggleTrigger(Parcel parcel) {
        super(parcel);
        this.m_numToggles = parcel.readInt();
    }
}
