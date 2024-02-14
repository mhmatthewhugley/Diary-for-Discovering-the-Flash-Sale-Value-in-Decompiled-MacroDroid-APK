package p119k3;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.VpnTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.f2 */
/* compiled from: VpnTriggerInfo.kt */
public final class C7500f2 extends C5889c8 {

    /* renamed from: g */
    public static final C7501a f18366g = new C7501a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7500f2 f18367h = new C7500f2();

    /* renamed from: k3.f2$a */
    /* compiled from: VpnTriggerInfo.kt */
    public static final class C7501a {
        private C7501a() {
        }

        public /* synthetic */ C7501a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7500f2 mo37641a() {
            return C7500f2.f18367h;
        }
    }

    /* renamed from: v */
    public static final C7500f2 m31188v() {
        return f18366g.mo37641a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VpnTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_vpn_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_vpn_key_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_vpn;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}
