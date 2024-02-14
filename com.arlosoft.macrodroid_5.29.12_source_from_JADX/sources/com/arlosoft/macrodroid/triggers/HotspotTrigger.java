package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.HotspotTriggerReceiver;
import p119k3.C7531m0;
import p148q0.C8151a;

public class HotspotTrigger extends Trigger {
    public static final Parcelable.Creator<HotspotTrigger> CREATOR = new C5660a();
    private static HotspotTriggerReceiver s_hotspotTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_hotspotEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.HotspotTrigger$a */
    class C5660a implements Parcelable.Creator<HotspotTrigger> {
        C5660a() {
        }

        /* renamed from: a */
        public HotspotTrigger createFromParcel(Parcel parcel) {
            return new HotspotTrigger(parcel, (C5660a) null);
        }

        /* renamed from: b */
        public HotspotTrigger[] newArray(int i) {
            return new HotspotTrigger[i];
        }
    }

    /* synthetic */ HotspotTrigger(Parcel parcel, C5660a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22330h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_hotspot_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_hotspot_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_hotspotEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_hotspotEnabled ? m22330h3()[0] : m22330h3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_hotspotTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_hotspotTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7531m0.m31334u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_hotspotTriggerReceiver = new HotspotTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_hotspotTriggerReceiver, new IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22330h3();
    }

    /* renamed from: g3 */
    public boolean mo31196g3() {
        return this.m_hotspotEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_hotspotEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_hotspotEnabled = i == 0;
    }

    public HotspotTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private HotspotTrigger() {
        this.m_hotspotEnabled = true;
    }

    private HotspotTrigger(Parcel parcel) {
        super(parcel);
        this.m_hotspotEnabled = parcel.readInt() != 0;
    }
}
