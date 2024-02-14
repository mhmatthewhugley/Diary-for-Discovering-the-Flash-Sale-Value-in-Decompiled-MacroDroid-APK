package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7502g;

public class AutoSyncChangeTrigger extends Trigger {
    public static final Parcelable.Creator<AutoSyncChangeTrigger> CREATOR = new C5602a();
    private static final int STATE_DISABLED = 1;
    private static final int STATE_ENABLED = 0;
    private static int s_enabledState = -1;
    private static Object s_statusChangeListener;
    private static int s_triggerCounter;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.triggers.AutoSyncChangeTrigger$a */
    class C5602a implements Parcelable.Creator<AutoSyncChangeTrigger> {
        C5602a() {
        }

        /* renamed from: a */
        public AutoSyncChangeTrigger createFromParcel(Parcel parcel) {
            return new AutoSyncChangeTrigger(parcel, (C5602a) null);
        }

        /* renamed from: b */
        public AutoSyncChangeTrigger[] newArray(int i) {
            return new AutoSyncChangeTrigger[i];
        }
    }

    /* synthetic */ AutoSyncChangeTrigger(Parcel parcel, C5602a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m21596j3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* renamed from: k3 */
    private static void m21597k3(int i) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof AutoSyncChangeTrigger) && ((AutoSyncChangeTrigger) next2).mo30939i3() == i && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new Handler(MacroDroidApplication.m14845u().getMainLooper()).post(new C5881c0((Macro) it2.next()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static /* synthetic */ void m21598l3(int i) {
        boolean z = !ContentResolver.getMasterSyncAutomatically();
        if (z != s_enabledState) {
            s_enabledState = z ? 1 : 0;
            m21597k3(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m21596j3()[this.m_option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        Object obj;
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0 && (obj = s_statusChangeListener) != null) {
            ContentResolver.removeStatusChangeListener(obj);
            s_statusChangeListener = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7502g.m31195u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_statusChangeListener = ContentResolver.addStatusChangeListener(1, C5869b0.f13928a);
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21596j3();
    }

    /* renamed from: i3 */
    public int mo30939i3() {
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

    public AutoSyncChangeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AutoSyncChangeTrigger() {
    }

    private AutoSyncChangeTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
