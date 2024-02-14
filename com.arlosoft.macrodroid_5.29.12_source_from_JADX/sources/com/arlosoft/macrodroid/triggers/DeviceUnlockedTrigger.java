package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.DeviceUnlockedTriggerReceiver;
import p119k3.C7571x;
import p148q0.C8151a;

public class DeviceUnlockedTrigger extends Trigger {
    public static final Parcelable.Creator<DeviceUnlockedTrigger> CREATOR = new C5635a();
    private static DeviceUnlockedTriggerReceiver s_deviceUnlockedTriggerReceiver;
    private static int s_triggerCounter;

    /* renamed from: com.arlosoft.macrodroid.triggers.DeviceUnlockedTrigger$a */
    class C5635a implements Parcelable.Creator<DeviceUnlockedTrigger> {
        C5635a() {
        }

        /* renamed from: a */
        public DeviceUnlockedTrigger createFromParcel(Parcel parcel) {
            return new DeviceUnlockedTrigger(parcel, (C5635a) null);
        }

        /* renamed from: b */
        public DeviceUnlockedTrigger[] newArray(int i) {
            return new DeviceUnlockedTrigger[i];
        }
    }

    /* synthetic */ DeviceUnlockedTrigger(Parcel parcel, C5635a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_deviceUnlockedTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_deviceUnlockedTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7571x.m31518u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_deviceUnlockedTriggerReceiver = new DeviceUnlockedTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_deviceUnlockedTriggerReceiver, new IntentFilter("android.intent.action.USER_PRESENT"));
        }
        s_triggerCounter++;
    }

    public DeviceUnlockedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DeviceUnlockedTrigger() {
    }

    private DeviceUnlockedTrigger(Parcel parcel) {
        super(parcel);
    }
}
