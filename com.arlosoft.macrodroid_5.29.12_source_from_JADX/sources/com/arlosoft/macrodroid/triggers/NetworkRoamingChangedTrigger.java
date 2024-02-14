package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.NetworkRoamingChangedTriggerReceiver;
import p119k3.C7485c1;
import p148q0.C8151a;

public class NetworkRoamingChangedTrigger extends Trigger {
    public static final Parcelable.Creator<NetworkRoamingChangedTrigger> CREATOR = new C5705a();
    private static NetworkRoamingChangedTriggerReceiver s_networkRoamingReceiver;
    private static int s_triggerCounter;
    private boolean m_roamingEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.NetworkRoamingChangedTrigger$a */
    class C5705a implements Parcelable.Creator<NetworkRoamingChangedTrigger> {
        C5705a() {
        }

        /* renamed from: a */
        public NetworkRoamingChangedTrigger createFromParcel(Parcel parcel) {
            return new NetworkRoamingChangedTrigger(parcel, (C5705a) null);
        }

        /* renamed from: b */
        public NetworkRoamingChangedTrigger[] newArray(int i) {
            return new NetworkRoamingChangedTrigger[i];
        }
    }

    /* synthetic */ NetworkRoamingChangedTrigger(Parcel parcel, C5705a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m22789g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_network_roaming_change_started), SelectableItem.m15535j1(C17541R$string.trigger_network_roaming_change_stopped)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_roamingEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_roamingEnabled ? m22789g3()[0] : m22789g3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_networkRoamingReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_networkRoamingReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7485c1.m31112u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_networkRoamingReceiver = new NetworkRoamingChangedTriggerReceiver();
            NetworkRoamingChangedTriggerReceiver.m24037a(mo27827K0());
            MacroDroidApplication.m14845u().registerReceiver(s_networkRoamingReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22789g3();
    }

    /* renamed from: h3 */
    public boolean mo31355h3() {
        return this.m_roamingEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_roamingEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_roamingEnabled = i == 0;
    }

    public NetworkRoamingChangedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private NetworkRoamingChangedTrigger() {
        this.m_roamingEnabled = true;
    }

    private NetworkRoamingChangedTrigger(Parcel parcel) {
        super(parcel);
        this.m_roamingEnabled = parcel.readInt() != 0;
    }
}
