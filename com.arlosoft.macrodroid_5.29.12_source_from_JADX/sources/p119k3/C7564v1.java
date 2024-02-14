package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.SimChangeTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.v1 */
/* compiled from: SimChangeTriggerInfo.kt */
public final class C7564v1 extends C5889c8 {

    /* renamed from: j */
    public static final C7565a f18463j = new C7565a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18464k = new C7564v1();
    @StringRes

    /* renamed from: g */
    private final int f18465g = C17541R$string.trigger_sim_change;

    /* renamed from: h */
    private final int f18466h = C17530R$drawable.ic_sim;
    @StringRes

    /* renamed from: i */
    private final int f18467i = C17541R$string.trigger_sim_change_help;

    /* renamed from: k3.v1$a */
    /* compiled from: SimChangeTriggerInfo.kt */
    public static final class C7565a {
        private C7565a() {
        }

        public /* synthetic */ C7565a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37652a() {
            return C7564v1.f18464k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31491v() {
        return f18463j.mo37652a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SimChangeTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18467i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18466h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18465g;
    }
}
