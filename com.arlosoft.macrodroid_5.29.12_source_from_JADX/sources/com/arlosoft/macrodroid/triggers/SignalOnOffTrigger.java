package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.services.PhoneStateMonitorService;
import p119k3.C7557t1;

public class SignalOnOffTrigger extends Trigger {
    public static final Parcelable.Creator<SignalOnOffTrigger> CREATOR = new C5741a();
    private static int s_triggerCounter;
    private boolean m_signalOn;

    /* renamed from: com.arlosoft.macrodroid.triggers.SignalOnOffTrigger$a */
    class C5741a implements Parcelable.Creator<SignalOnOffTrigger> {
        C5741a() {
        }

        /* renamed from: a */
        public SignalOnOffTrigger createFromParcel(Parcel parcel) {
            return new SignalOnOffTrigger(parcel);
        }

        /* renamed from: b */
        public SignalOnOffTrigger[] newArray(int i) {
            return new SignalOnOffTrigger[i];
        }
    }

    public SignalOnOffTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    /* renamed from: g3 */
    private String[] m23155g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_signal_on_off_available), SelectableItem.m15535j1(C17541R$string.trigger_signal_on_off_unavailable)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_signalOn ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_signalOn ? m23155g3()[0] : m23155g3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            MacroDroidApplication.m14845u().stopService(new Intent(mo27827K0(), PhoneStateMonitorService.class));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7557t1.m31456u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            MacroDroidApplication.m14845u().startService(new Intent(mo27827K0(), PhoneStateMonitorService.class));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23155g3();
    }

    /* renamed from: h3 */
    public boolean mo31483h3() {
        return this.m_signalOn;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_signalOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_signalOn = i == 0;
    }

    SignalOnOffTrigger() {
        this.m_signalOn = true;
    }

    protected SignalOnOffTrigger(Parcel parcel) {
        super(parcel);
        this.m_signalOn = parcel.readInt() != 0;
    }
}
