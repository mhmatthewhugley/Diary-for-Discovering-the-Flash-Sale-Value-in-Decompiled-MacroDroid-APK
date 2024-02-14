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
import com.arlosoft.macrodroid.triggers.receivers.ScreenOnOffTriggerReceiver;
import p119k3.C7547q1;
import p148q0.C8151a;

public class ScreenOnOffTrigger extends Trigger {
    public static final Parcelable.Creator<ScreenOnOffTrigger> CREATOR = new C5738a();
    private static final Object s_lock = new Object();
    private static ScreenOnOffTriggerReceiver s_screenOnOffTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_screenOn;

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenOnOffTrigger$a */
    class C5738a implements Parcelable.Creator<ScreenOnOffTrigger> {
        C5738a() {
        }

        /* renamed from: a */
        public ScreenOnOffTrigger createFromParcel(Parcel parcel) {
            return new ScreenOnOffTrigger(parcel, (C5738a) null);
        }

        /* renamed from: b */
        public ScreenOnOffTrigger[] newArray(int i) {
            return new ScreenOnOffTrigger[i];
        }
    }

    /* synthetic */ ScreenOnOffTrigger(Parcel parcel, C5738a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m23126g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_screen_on_off_screen_on), SelectableItem.m15535j1(C17541R$string.trigger_screen_on_off_screen_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_screenOn ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_screenOn ? m23126g3()[0] : m23126g3()[1];
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
        return C7547q1.m31407u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_screenOnOffTriggerReceiver = new ScreenOnOffTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23126g3();
    }

    /* renamed from: h3 */
    public boolean mo31469h3() {
        return this.m_screenOn;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_screenOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_screenOn = i == 0;
    }

    public ScreenOnOffTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ScreenOnOffTrigger() {
        this.m_screenOn = true;
    }

    private ScreenOnOffTrigger(Parcel parcel) {
        super(parcel);
        this.m_screenOn = parcel.readInt() != 0;
    }
}
