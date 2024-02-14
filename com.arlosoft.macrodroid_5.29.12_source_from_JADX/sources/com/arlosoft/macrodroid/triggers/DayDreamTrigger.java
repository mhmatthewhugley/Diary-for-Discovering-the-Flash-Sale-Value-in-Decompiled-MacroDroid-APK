package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.DayDreamTriggerReceiver;
import p119k3.C7562v;
import p148q0.C8151a;

public class DayDreamTrigger extends Trigger {
    public static final Parcelable.Creator<DayDreamTrigger> CREATOR = new C5632a();
    private static DayDreamTriggerReceiver s_dayDreamTriggerReceiver;
    private static final Object s_lock = new Object();
    private static int s_triggerCounter;
    private boolean m_dayDreamEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.DayDreamTrigger$a */
    class C5632a implements Parcelable.Creator<DayDreamTrigger> {
        C5632a() {
        }

        /* renamed from: a */
        public DayDreamTrigger createFromParcel(Parcel parcel) {
            return new DayDreamTrigger(parcel, (C5632a) null);
        }

        /* renamed from: b */
        public DayDreamTrigger[] newArray(int i) {
            return new DayDreamTrigger[i];
        }
    }

    /* synthetic */ DayDreamTrigger(Parcel parcel, C5632a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22039h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_daydream_on), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_daydream_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_dayDreamEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_dayDreamEnabled ? m22039h3()[0] : m22039h3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_dayDreamTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_dayDreamTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7562v.m31480u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_dayDreamTriggerReceiver = new DayDreamTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DREAMING_STARTED");
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.DREAMING_STOPPED");
            MacroDroidApplication.m14845u().registerReceiver(s_dayDreamTriggerReceiver, intentFilter);
            MacroDroidApplication.m14845u().registerReceiver(s_dayDreamTriggerReceiver, intentFilter2);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22039h3();
    }

    /* renamed from: g3 */
    public boolean mo31070g3() {
        return this.m_dayDreamEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_dayDreamEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_dayDreamEnabled = i == 0;
    }

    public DayDreamTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DayDreamTrigger() {
        this.m_dayDreamEnabled = true;
    }

    private DayDreamTrigger(Parcel parcel) {
        super(parcel);
        this.m_dayDreamEnabled = parcel.readInt() != 0;
    }
}
