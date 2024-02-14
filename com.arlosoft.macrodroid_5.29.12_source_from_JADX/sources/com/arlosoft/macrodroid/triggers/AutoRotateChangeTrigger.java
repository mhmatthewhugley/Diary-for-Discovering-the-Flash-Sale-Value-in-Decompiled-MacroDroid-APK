package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7496f;

public class AutoRotateChangeTrigger extends Trigger {
    public static final Parcelable.Creator<AutoRotateChangeTrigger> CREATOR = new C5601b();
    private static final int STATE_DISABLED = 1;
    private static final int STATE_ENABLED = 0;
    private static ContentObserver s_contentObserver = null;
    /* access modifiers changed from: private */
    public static int s_enabledState = -1;
    private static int s_triggerCounter;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.triggers.AutoRotateChangeTrigger$a */
    class C5600a extends ContentObserver {
        C5600a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            int i = 0;
            if (Settings.System.getInt(MacroDroidApplication.m14845u().getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
            if (i != AutoRotateChangeTrigger.s_enabledState) {
                int unused = AutoRotateChangeTrigger.s_enabledState = i;
                AutoRotateChangeTrigger.m21580m3(i);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.AutoRotateChangeTrigger$b */
    class C5601b implements Parcelable.Creator<AutoRotateChangeTrigger> {
        C5601b() {
        }

        /* renamed from: a */
        public AutoRotateChangeTrigger createFromParcel(Parcel parcel) {
            return new AutoRotateChangeTrigger(parcel, (C5600a) null);
        }

        /* renamed from: b */
        public AutoRotateChangeTrigger[] newArray(int i) {
            return new AutoRotateChangeTrigger[i];
        }
    }

    /* synthetic */ AutoRotateChangeTrigger(Parcel parcel, C5600a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m21579l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static void m21580m3(int i) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof AutoRotateChangeTrigger) && ((AutoRotateChangeTrigger) next2).mo30933k3() == i && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new Handler(MacroDroidApplication.m14845u().getMainLooper()).post(new C5806a0((Macro) it2.next()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m21579l3()[this.m_option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0 && s_contentObserver != null) {
            mo27827K0().getContentResolver().unregisterContentObserver(s_contentObserver);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7496f.m31170u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_contentObserver = new C5600a(new Handler());
            mo27827K0().getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, s_contentObserver);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21579l3();
    }

    /* renamed from: k3 */
    public int mo30933k3() {
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

    public AutoRotateChangeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AutoRotateChangeTrigger() {
    }

    private AutoRotateChangeTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
