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
import com.arlosoft.macrodroid.triggers.receivers.SimChangeReceiver;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p119k3.C7564v1;

/* compiled from: SimChangeTrigger.kt */
public final class SimChangeTrigger extends Trigger {
    public static final Parcelable.Creator<SimChangeTrigger> CREATOR = new C5743a();

    /* renamed from: d */
    public static final C5744b f13680d = new C5744b((C13695i) null);
    private static SimChangeReceiver simChangeTriggerReceiver;
    private static int triggerCount;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.SimChangeTrigger$a */
    /* compiled from: SimChangeTrigger.kt */
    public static final class C5743a implements Parcelable.Creator<SimChangeTrigger> {
        C5743a() {
        }

        /* renamed from: a */
        public SimChangeTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SimChangeTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SimChangeTrigger[] newArray(int i) {
            return new SimChangeTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SimChangeTrigger$b */
    /* compiled from: SimChangeTrigger.kt */
    public static final class C5744b {
        private C5744b() {
        }

        public /* synthetic */ C5744b(C13695i iVar) {
            this();
        }
    }

    public SimChangeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SimChangeTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private final String[] m23177g3() {
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_sim_added);
        C13706o.m87928e(j1, "getString(R.string.trigger_sim_added)");
        String format = String.format(j1, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format, "format(format, *args)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_sim_removed);
        C13706o.m87928e(j12, "getString(R.string.trigger_sim_removed)");
        String format2 = String.format(j12, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format2, "format(format, *args)");
        return new String[]{format, format2};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m23177g3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                MacroDroidApplication.f9883I.mo27303b().unregisterReceiver(simChangeTriggerReceiver);
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
            simChangeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7564v1.f18463j.mo37652a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            SimChangeReceiver.f14374a.mo31974a();
            simChangeTriggerReceiver = new SimChangeReceiver();
            MacroDroidApplication.f9883I.mo27303b().registerReceiver(simChangeTriggerReceiver, new IntentFilter("android.intent.action.SIM_STATE_CHANGED"));
        }
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23177g3();
    }

    /* renamed from: h3 */
    public final int mo31493h3() {
        return this.option;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public SimChangeTrigger() {
    }

    private SimChangeTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
