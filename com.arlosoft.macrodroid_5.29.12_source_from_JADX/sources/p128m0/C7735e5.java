package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.e5 */
/* compiled from: WaitUntilTriggerActionInfo.kt */
public final class C7735e5 extends C3072g {

    /* renamed from: j */
    public static final C7736a f18714j = new C7736a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18715k = new C7735e5();
    @StringRes

    /* renamed from: g */
    private final int f18716g = C17541R$string.action_wait_until_trigger;

    /* renamed from: h */
    private final int f18717h = C17530R$drawable.ic_bell_sleep;
    @StringRes

    /* renamed from: i */
    private final int f18718i = C17541R$string.action_wait_until_trigger_help;

    /* renamed from: m0.e5$a */
    /* compiled from: WaitUntilTriggerActionInfo.kt */
    public static final class C7736a {
        private C7736a() {
        }

        public /* synthetic */ C7736a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37750a() {
            return C7735e5.f18715k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32267v() {
        return f18714j.mo37750a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WaitUntilTriggerAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18718i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18717h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18716g;
    }
}
