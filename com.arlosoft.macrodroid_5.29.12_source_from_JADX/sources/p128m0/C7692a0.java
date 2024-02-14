package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ConnectivityCheckAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.a0 */
/* compiled from: ConnectivityCheckActionInfo.kt */
public final class C7692a0 extends C3072g {

    /* renamed from: j */
    public static final C7693a f18639j = new C7693a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18640k = new C7692a0();
    @StringRes

    /* renamed from: g */
    private final int f18641g = C17541R$string.action_connectivity_check;

    /* renamed from: h */
    private final int f18642h = C17530R$drawable.ic_network_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18643i = C17541R$string.action_connectivity_check_help;

    /* renamed from: m0.a0$a */
    /* compiled from: ConnectivityCheckActionInfo.kt */
    public static final class C7693a {
        private C7693a() {
        }

        public /* synthetic */ C7693a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37740a() {
            return C7692a0.f18640k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32075v() {
        return f18639j.mo37740a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ConnectivityCheckAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18643i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18642h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18641g;
    }
}
