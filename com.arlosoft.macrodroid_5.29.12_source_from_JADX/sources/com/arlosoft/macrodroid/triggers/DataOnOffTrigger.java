package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.ConnectivityChangeReceiver;
import p119k3.C7558u;
import p148q0.C8151a;

public class DataOnOffTrigger extends Trigger {
    public static final Parcelable.Creator<DataOnOffTrigger> CREATOR = new C5631a();
    private static ConnectivityChangeReceiver s_connectivityChangeTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_dataAvailable;

    /* renamed from: com.arlosoft.macrodroid.triggers.DataOnOffTrigger$a */
    class C5631a implements Parcelable.Creator<DataOnOffTrigger> {
        C5631a() {
        }

        /* renamed from: a */
        public DataOnOffTrigger createFromParcel(Parcel parcel) {
            return new DataOnOffTrigger(parcel, (C5631a) null);
        }

        /* renamed from: b */
        public DataOnOffTrigger[] newArray(int i) {
            return new DataOnOffTrigger[i];
        }
    }

    /* synthetic */ DataOnOffTrigger(Parcel parcel, C5631a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22028h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_data_on_off_available), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_data_on_off_no_connection)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_dataAvailable ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_dataAvailable ? m22028h3()[0] : m22028h3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_connectivityChangeTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_connectivityChangeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7558u.m31461u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_connectivityChangeTriggerReceiver = new ConnectivityChangeReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_connectivityChangeTriggerReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22028h3();
    }

    /* renamed from: g3 */
    public boolean mo31065g3() {
        return this.m_dataAvailable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_dataAvailable ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_dataAvailable = i == 0;
    }

    public DataOnOffTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DataOnOffTrigger() {
        this.m_dataAvailable = true;
    }

    private DataOnOffTrigger(Parcel parcel) {
        super(parcel);
        this.m_dataAvailable = parcel.readInt() != 0;
    }
}
