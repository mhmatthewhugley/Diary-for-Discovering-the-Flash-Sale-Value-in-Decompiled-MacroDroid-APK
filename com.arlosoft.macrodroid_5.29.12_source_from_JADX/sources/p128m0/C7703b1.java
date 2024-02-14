package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.FloatingButtonConfigureAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.b1 */
/* compiled from: FloatingButtonConfigureActionInfo.kt */
public final class C7703b1 extends C3072g {

    /* renamed from: j */
    public static final C7704a f18659j = new C7704a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18660k = new C7703b1();
    @StringRes

    /* renamed from: g */
    private final int f18661g = C17541R$string.action_floating_button_configure;

    /* renamed from: h */
    private final int f18662h = C17530R$drawable.ic_fiber_manual_record_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18663i = C17541R$string.action_floating_button_configure_help;

    /* renamed from: m0.b1$a */
    /* compiled from: FloatingButtonConfigureActionInfo.kt */
    public static final class C7704a {
        private C7704a() {
        }

        public /* synthetic */ C7704a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37743a() {
            return C7703b1.f18660k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32122v() {
        return f18659j.mo37743a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FloatingButtonConfigureAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18663i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18662h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18661g;
    }
}
