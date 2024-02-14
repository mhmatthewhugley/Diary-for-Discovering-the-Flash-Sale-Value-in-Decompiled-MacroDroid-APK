package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.PriorityModeReceiver;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7518j1;

/* compiled from: PriorityModeTrigger.kt */
public final class PriorityModeTrigger extends Trigger {
    public static final Parcelable.Creator<PriorityModeTrigger> CREATOR = new C5720a();

    /* renamed from: d */
    public static final C5721b f13668d = new C5721b((C13695i) null);
    private static final PriorityModeReceiver priorityModeReceiver = new PriorityModeReceiver();
    private static int triggerCount;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.PriorityModeTrigger$a */
    /* compiled from: PriorityModeTrigger.kt */
    public static final class C5720a implements Parcelable.Creator<PriorityModeTrigger> {
        C5720a() {
        }

        /* renamed from: a */
        public PriorityModeTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new PriorityModeTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public PriorityModeTrigger[] newArray(int i) {
            return new PriorityModeTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.PriorityModeTrigger$b */
    /* compiled from: PriorityModeTrigger.kt */
    public static final class C5721b {
        private C5721b() {
        }

        public /* synthetic */ C5721b(C13695i iVar) {
            this();
        }
    }

    public PriorityModeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ PriorityModeTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private final String[] m22959h3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_all);
        C13706o.m87928e(j1, "getString(R.string.trigger_priority_mode_all)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_priority);
        C13706o.m87928e(j12, "getString(R.string.trigger_priority_mode_priority)");
        String j13 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_none);
        C13706o.m87928e(j13, "getString(R.string.trigger_priority_mode_none)");
        return new String[]{j1, j12, j13};
    }

    /* renamed from: i3 */
    private final String[] m22960i3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_all);
        C13706o.m87928e(j1, "getString(R.string.trigger_priority_mode_all)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_priority);
        C13706o.m87928e(j12, "getString(R.string.trigger_priority_mode_priority)");
        String j13 = SelectableItem.m15535j1(C17541R$string.trigger_priority_mode_none);
        C13706o.m87928e(j13, "getString(R.string.trigger_priority_mode_none)");
        String j14 = SelectableItem.m15535j1(C17541R$string.action_set_priority_mode_alarm_only);
        C13706o.m87928e(j14, "getString(R.string.actio…priority_mode_alarm_only)");
        return new String[]{j1, j12, j13, j14};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (Build.VERSION.SDK_INT <= 23) {
            return Math.min(this.option, m22959h3().length - 1);
        }
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22960i3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                mo27827K0().getApplicationContext().unregisterReceiver(priorityModeReceiver);
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7518j1.f18390j.mo37644a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + ": " + mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            mo27827K0().getApplicationContext().registerReceiver(priorityModeReceiver, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return Build.VERSION.SDK_INT > 23 ? m22960i3() : m22959h3();
    }

    /* renamed from: g3 */
    public final int mo31413g3() {
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

    public PriorityModeTrigger() {
    }

    private PriorityModeTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
