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
import com.arlosoft.macrodroid.triggers.receivers.VpnChangeReceiver;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p119k3.C7500f2;

/* compiled from: VpnTrigger.kt */
public final class VpnTrigger extends Trigger {
    public static final Parcelable.Creator<VpnTrigger> CREATOR = new C5770a();
    private static final int OPTION_DISABLED = 1;
    private static final int OPTION_ENABLED = 0;

    /* renamed from: d */
    public static final C5771b f13730d = new C5771b((C13695i) null);
    private static int triggerCount;
    private static VpnChangeReceiver vpnChangeTriggerReceiver;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.VpnTrigger$a */
    /* compiled from: VpnTrigger.kt */
    public static final class C5770a implements Parcelable.Creator<VpnTrigger> {
        C5770a() {
        }

        /* renamed from: a */
        public VpnTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new VpnTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public VpnTrigger[] newArray(int i) {
            return new VpnTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VpnTrigger$b */
    /* compiled from: VpnTrigger.kt */
    public static final class C5771b {
        private C5771b() {
        }

        public /* synthetic */ C5771b(C13695i iVar) {
            this();
        }
    }

    public VpnTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ VpnTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private final String[] m23556g3() {
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.enabled);
        C13706o.m87928e(j1, "getString(R.string.enabled)");
        String format = String.format(j1, Arrays.copyOf(new Object[0], 0));
        C13706o.m87928e(format, "format(format, *args)");
        String j12 = SelectableItem.m15535j1(C17541R$string.disabled);
        C13706o.m87928e(j12, "getString(R.string.disabled)");
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
        return m23556g3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            try {
                MacroDroidApplication.f9883I.mo27303b().unregisterReceiver(vpnChangeTriggerReceiver);
            } catch (Exception e) {
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
            vpnChangeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7500f2.f18366g.mo37641a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            vpnChangeTriggerReceiver = new VpnChangeReceiver();
            MacroDroidApplication.f9883I.mo27303b().registerReceiver(vpnChangeTriggerReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23556g3();
    }

    /* renamed from: h3 */
    public final boolean mo31605h3() {
        return this.option == 0;
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

    public VpnTrigger() {
    }

    private VpnTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}