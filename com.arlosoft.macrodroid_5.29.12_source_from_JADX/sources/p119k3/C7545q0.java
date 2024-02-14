package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.IpAddressChangeTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.q0 */
/* compiled from: IpAddressChangeTriggerInfo.kt */
public final class C7545q0 extends C5889c8 {

    /* renamed from: j */
    public static final C7546a f18433j = new C7546a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18434k = new C7545q0();
    @StringRes

    /* renamed from: g */
    private final int f18435g = C17541R$string.trigger_ip_address;

    /* renamed from: h */
    private final int f18436h = C17530R$drawable.ethernet;
    @StringRes

    /* renamed from: i */
    private final int f18437i = C17541R$string.trigger_ip_address_help;

    /* renamed from: k3.q0$a */
    /* compiled from: IpAddressChangeTriggerInfo.kt */
    public static final class C7546a {
        private C7546a() {
        }

        public /* synthetic */ C7546a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37649a() {
            return C7545q0.f18434k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31401v() {
        return f18433j.mo37649a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IpAddressChangeTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18437i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18436h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18435g;
    }
}
