package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p123l1.C7613g1;

/* compiled from: VpnConstraint.kt */
public final class VpnConstraint extends Constraint {
    public static final Parcelable.Creator<VpnConstraint> CREATOR = new C4212a();
    private static final int OPTION_DISABLED = 1;
    private static final int OPTION_ENABLED = 0;

    /* renamed from: f */
    public static final C4213b f10778f = new C4213b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.constraint.VpnConstraint$a */
    /* compiled from: VpnConstraint.kt */
    public static final class C4212a implements Parcelable.Creator<VpnConstraint> {
        C4212a() {
        }

        /* renamed from: a */
        public VpnConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new VpnConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public VpnConstraint[] newArray(int i) {
            return new VpnConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.VpnConstraint$b */
    /* compiled from: VpnConstraint.kt */
    public static final class C4213b {
        private C4213b() {
        }

        public /* synthetic */ C4213b(C13695i iVar) {
            this();
        }
    }

    public VpnConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ VpnConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private final String[] m17187g3() {
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
        return m17187g3()[this.option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        Object systemService = mo27827K0().getSystemService("connectivity");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        C13706o.m87928e(allNetworks, "cm.allNetworks");
        int length = allNetworks.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                z = true;
                break;
            }
            i++;
        }
        if (this.option == 0) {
            return z;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7613g1.f18520g.mo37665a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17187g3();
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

    public VpnConstraint() {
    }

    private VpnConstraint(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
