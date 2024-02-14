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
import p119k3.C7554t;

public class DarkThemeTrigger extends Trigger {
    public static final Parcelable.Creator<DarkThemeTrigger> CREATOR = new C5630b();
    private static final int STATE_DISABLED = 1;
    private static final int STATE_ENABLED = 0;
    private static ContentObserver s_contentObserver = null;
    /* access modifiers changed from: private */
    public static int s_enabledState = -1;
    private static int s_triggerCounter;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.triggers.DarkThemeTrigger$a */
    class C5629a extends ContentObserver {
        C5629a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            int i = 0;
            if (Settings.Secure.getInt(MacroDroidApplication.m14845u().getContentResolver(), "ui_night_mode", 0) != 2) {
                i = 1;
            }
            if (i != DarkThemeTrigger.s_enabledState) {
                int unused = DarkThemeTrigger.s_enabledState = i;
                DarkThemeTrigger.m22014m3(i);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.DarkThemeTrigger$b */
    class C5630b implements Parcelable.Creator<DarkThemeTrigger> {
        C5630b() {
        }

        /* renamed from: a */
        public DarkThemeTrigger createFromParcel(Parcel parcel) {
            return new DarkThemeTrigger(parcel, (C5629a) null);
        }

        /* renamed from: b */
        public DarkThemeTrigger[] newArray(int i) {
            return new DarkThemeTrigger[i];
        }
    }

    /* synthetic */ DarkThemeTrigger(Parcel parcel, C5629a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m22013l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static void m22014m3(int i) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof DarkThemeTrigger) && ((DarkThemeTrigger) next2).mo31059k3() == i && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new Handler(MacroDroidApplication.m14845u().getMainLooper()).post(new C5979k2((Macro) it2.next()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22013l3()[this.m_option];
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
        return C7554t.m31444v();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_contentObserver = new C5629a(new Handler());
            mo27827K0().getContentResolver().registerContentObserver(Settings.Secure.getUriFor("ui_night_mode"), true, s_contentObserver);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22013l3();
    }

    /* renamed from: k3 */
    public int mo31059k3() {
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

    public DarkThemeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DarkThemeTrigger() {
    }

    private DarkThemeTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
