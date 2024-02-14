package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.BatterySaverTriggerReceiver;
import p119k3.C7511i;

public class BatterySaverTrigger extends Trigger {
    public static final Parcelable.Creator<BatterySaverTrigger> CREATOR = new C5605a();
    private static BatterySaverTriggerReceiver s_batterySaverTrigger;
    private static int s_triggerCounter;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.triggers.BatterySaverTrigger$a */
    class C5605a implements Parcelable.Creator<BatterySaverTrigger> {
        C5605a() {
        }

        /* renamed from: a */
        public BatterySaverTrigger createFromParcel(Parcel parcel) {
            return new BatterySaverTrigger(parcel, (C5605a) null);
        }

        /* renamed from: b */
        public BatterySaverTrigger[] newArray(int i) {
            return new BatterySaverTrigger[i];
        }
    }

    /* synthetic */ BatterySaverTrigger(Parcel parcel, C5605a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m21636h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m21636h3()[this.m_option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0 && s_batterySaverTrigger != null) {
            MacroDroidApplication.m14845u().unregisterReceiver(s_batterySaverTrigger);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7511i.m31239u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_batterySaverTrigger = new BatterySaverTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_batterySaverTrigger, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21636h3();
    }

    /* renamed from: g3 */
    public int mo30954g3() {
        return this.m_option;
    }

    /* renamed from: m1 */
    public String mo27854m1() {
        return mo25559a1() + "(" + mo24672O0() + ")";
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

    public BatterySaverTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BatterySaverTrigger() {
    }

    private BatterySaverTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
