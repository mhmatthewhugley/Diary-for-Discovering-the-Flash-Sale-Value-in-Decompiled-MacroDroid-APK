package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p112j2.C7439d0;
import p128m0.C7877x3;

public class SetPriorityMode extends Action {
    public static final Parcelable.Creator<SetPriorityMode> CREATOR = new C2654a();
    private static final int OPTION_PRIORITY_MODE_ALARM_ONLY = 3;
    private static final int OPTION_PRIORITY_MODE_ALL = 0;
    private static final int OPTION_PRIORITY_MODE_NONE = 2;
    private static final int OPTION_PRIORITY_MODE_PRIORITY = 1;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.SetPriorityMode$a */
    class C2654a implements Parcelable.Creator<SetPriorityMode> {
        C2654a() {
        }

        /* renamed from: a */
        public SetPriorityMode createFromParcel(Parcel parcel) {
            return new SetPriorityMode(parcel, (C2654a) null);
        }

        /* renamed from: b */
        public SetPriorityMode[] newArray(int i) {
            return new SetPriorityMode[i];
        }
    }

    /* synthetic */ SetPriorityMode(Parcel parcel, C2654a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m12563j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_all), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_priority), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_none)};
    }

    /* renamed from: k3 */
    private String[] m12564k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_all), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_priority), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_none), SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_alarm_only)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m12564k3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7877x3.m32956u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        NotificationManager notificationManager = (NotificationManager) mo27827K0().getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i = this.m_option;
                if (i == 0) {
                    notificationManager.setInterruptionFilter(1);
                } else if (i == 1) {
                    notificationManager.setInterruptionFilter(2);
                } else if (i == 2) {
                    notificationManager.setInterruptionFilter(3);
                } else if (i == 3) {
                    notificationManager.setInterruptionFilter(4);
                }
            } catch (SecurityException unused) {
                C7439d0.m30911p0(mo27827K0(), mo24738G0(), 7);
            }
        } else {
            int i2 = this.m_option;
            if (i2 == 0) {
                Intent intent = new Intent("com.arlosoft.macrodroid.SET_PRIORITY_MODE");
                intent.putExtra("interruptionFilterType", 1);
                mo27827K0().sendBroadcast(intent);
            } else if (i2 == 1) {
                Intent intent2 = new Intent("com.arlosoft.macrodroid.SET_PRIORITY_MODE");
                intent2.putExtra("interruptionFilterType", 2);
                mo27827K0().sendBroadcast(intent2);
            } else if (i2 == 2) {
                Intent intent3 = new Intent("com.arlosoft.macrodroid.SET_PRIORITY_MODE");
                intent3.putExtra("interruptionFilterType", 3);
                mo27827K0().sendBroadcast(intent3);
            }
        }
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        if (!C5163j2.m20223o0(mo27827K0()) && Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT >= 23) {
            return m12564k3();
        }
        return m12563j3();
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return Build.VERSION.SDK_INT < 23;
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

    public SetPriorityMode(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetPriorityMode() {
    }

    private SetPriorityMode(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
