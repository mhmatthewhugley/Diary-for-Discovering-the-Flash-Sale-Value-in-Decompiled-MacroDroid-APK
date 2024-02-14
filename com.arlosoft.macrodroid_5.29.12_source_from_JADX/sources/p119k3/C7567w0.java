package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.MacroEnabledTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.w0 */
/* compiled from: MacroEnabledTriggerInfo.kt */
public final class C7567w0 extends C5889c8 {

    /* renamed from: j */
    public static final C7568a f18469j = new C7568a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18470k = new C7567w0();
    @StringRes

    /* renamed from: g */
    private final int f18471g = C17541R$string.trigger_macro_enabled;

    /* renamed from: h */
    private final int f18472h = C17530R$drawable.ic_power_cycle;
    @StringRes

    /* renamed from: i */
    private final int f18473i = C17541R$string.trigger_macro_enabled_help;

    /* renamed from: k3.w0$a */
    /* compiled from: MacroEnabledTriggerInfo.kt */
    public static final class C7568a {
        private C7568a() {
        }

        public /* synthetic */ C7568a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37653a() {
            return C7567w0.f18470k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31503v() {
        return f18469j.mo37653a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MacroEnabledTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18473i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18472h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18471g;
    }
}
