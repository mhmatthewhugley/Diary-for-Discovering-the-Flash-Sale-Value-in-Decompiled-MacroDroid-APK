package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.VpnConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.g1 */
/* compiled from: VpnConstraintInfo.kt */
public final class C7613g1 extends C4227b0 {

    /* renamed from: g */
    public static final C7614a f18520g = new C7614a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7613g1 f18521h = new C7613g1();

    /* renamed from: l1.g1$a */
    /* compiled from: VpnConstraintInfo.kt */
    public static final class C7614a {
        private C7614a() {
        }

        public /* synthetic */ C7614a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7613g1 mo37665a() {
            return C7613g1.f18521h;
        }
    }

    /* renamed from: v */
    public static final C7613g1 m31705v() {
        return f18520g.mo37665a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VpnConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_vpn_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_vpn_key_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_vpn;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}
