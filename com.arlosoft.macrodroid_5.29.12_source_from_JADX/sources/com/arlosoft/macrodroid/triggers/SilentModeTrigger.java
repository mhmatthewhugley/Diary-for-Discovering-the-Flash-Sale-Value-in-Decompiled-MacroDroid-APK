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
import com.arlosoft.macrodroid.triggers.receivers.SilentModeTriggerReceiver;
import p119k3.C7561u1;
import p148q0.C8151a;

public class SilentModeTrigger extends Trigger {
    public static final Parcelable.Creator<SilentModeTrigger> CREATOR = new C5742a();
    private static SilentModeTriggerReceiver s_silentModeTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_silentEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.SilentModeTrigger$a */
    class C5742a implements Parcelable.Creator<SilentModeTrigger> {
        C5742a() {
        }

        /* renamed from: a */
        public SilentModeTrigger createFromParcel(Parcel parcel) {
            return new SilentModeTrigger(parcel, (C5742a) null);
        }

        /* renamed from: b */
        public SilentModeTrigger[] newArray(int i) {
            return new SilentModeTrigger[i];
        }
    }

    /* synthetic */ SilentModeTrigger(Parcel parcel, C5742a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m23166g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_silent_mode_enabled), SelectableItem.m15535j1(C17541R$string.trigger_silent_mode_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_silentEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_silentEnabled ? m23166g3()[0] : m23166g3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_silentModeTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_silentModeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7561u1.m31475u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_silentModeTriggerReceiver = new SilentModeTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_silentModeTriggerReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23166g3();
    }

    /* renamed from: h3 */
    public boolean mo31488h3() {
        return this.m_silentEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_silentEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_silentEnabled = i == 0;
    }

    public SilentModeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SilentModeTrigger() {
        this.m_silentEnabled = true;
    }

    private SilentModeTrigger(Parcel parcel) {
        super(parcel);
        this.m_silentEnabled = parcel.readInt() != 0;
    }
}
