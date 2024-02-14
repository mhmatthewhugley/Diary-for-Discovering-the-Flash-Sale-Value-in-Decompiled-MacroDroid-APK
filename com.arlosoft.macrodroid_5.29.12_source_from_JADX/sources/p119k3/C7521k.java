package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BluetoothBeaconTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.k */
/* compiled from: BluetoothBeaconTriggerInfo.kt */
public final class C7521k extends C5889c8 {

    /* renamed from: k */
    public static final C7522a f18396k = new C7522a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C4001c1 f18397l = new C7521k();
    @StringRes

    /* renamed from: g */
    private final int f18398g = C17541R$string.trigger_bluetooth_beacon;

    /* renamed from: h */
    private final int f18399h = C17530R$drawable.ic_access_point_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18400i = C17541R$string.trigger_bluetooth_beacon_help;

    /* renamed from: j */
    private final boolean f18401j = true;

    /* renamed from: k3.k$a */
    /* compiled from: BluetoothBeaconTriggerInfo.kt */
    public static final class C7522a {
        private C7522a() {
        }

        public /* synthetic */ C7522a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37645a() {
            return C7521k.f18397l;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31286v() {
        return f18396k.mo37645a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BluetoothBeaconTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18400i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18399h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18398g;
    }

    /* renamed from: o */
    public boolean mo27897o() {
        return this.f18401j;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 18;
    }
}
