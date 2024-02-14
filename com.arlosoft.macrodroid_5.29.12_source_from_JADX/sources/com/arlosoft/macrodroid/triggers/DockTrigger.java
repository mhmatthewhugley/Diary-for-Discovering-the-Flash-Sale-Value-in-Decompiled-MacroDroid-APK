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
import com.arlosoft.macrodroid.triggers.receivers.DockTriggerReceiver;
import p119k3.C7577z;
import p148q0.C8151a;

public class DockTrigger extends Trigger {
    public static final Parcelable.Creator<DockTrigger> CREATOR = new C5638a();
    private static DockTriggerReceiver s_dockTriggerReceiver;
    private static int s_triggerCounter;
    private int m_dockType;

    /* renamed from: com.arlosoft.macrodroid.triggers.DockTrigger$a */
    class C5638a implements Parcelable.Creator<DockTrigger> {
        C5638a() {
        }

        /* renamed from: a */
        public DockTrigger createFromParcel(Parcel parcel) {
            return new DockTrigger(parcel, (C5638a) null);
        }

        /* renamed from: b */
        public DockTrigger[] newArray(int i) {
            return new DockTrigger[i];
        }
    }

    /* synthetic */ DockTrigger(Parcel parcel, C5638a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22087h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_dock_any), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_dock_desk), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_dock_car), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_dock_undock)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_dockType;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m22087h3()[this.m_dockType];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_dockTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_dockTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7577z.m31550u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_dockTriggerReceiver = new DockTriggerReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
            intentFilter.setPriority(Integer.MAX_VALUE);
            MacroDroidApplication.m14845u().registerReceiver(s_dockTriggerReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22087h3();
    }

    /* renamed from: g3 */
    public int mo31095g3() {
        return this.m_dockType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.trigger_dock_select);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_dockType);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_dockType = i;
    }

    public DockTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public DockTrigger() {
        this.m_dockType = 0;
    }

    private DockTrigger(Parcel parcel) {
        super(parcel);
        this.m_dockType = parcel.readInt();
    }
}
