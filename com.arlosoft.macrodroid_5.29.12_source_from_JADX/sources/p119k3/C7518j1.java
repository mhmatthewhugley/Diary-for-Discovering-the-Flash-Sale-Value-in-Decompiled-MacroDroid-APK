package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.PriorityModeTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.j1 */
/* compiled from: PriorityModeTriggerInfo.kt */
public final class C7518j1 extends C5889c8 {

    /* renamed from: j */
    public static final C7519a f18390j = new C7519a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7518j1 f18391k = new C7518j1();
    @StringRes

    /* renamed from: g */
    private final int f18392g = C17541R$string.trigger_priority_mode;

    /* renamed from: h */
    private final int f18393h = C17530R$drawable.ic_bell_off_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18394i = C17541R$string.trigger_priority_mode_help;

    /* renamed from: k3.j1$a */
    /* compiled from: PriorityModeTriggerInfo.kt */
    public static final class C7519a {
        private C7519a() {
        }

        public /* synthetic */ C7519a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7518j1 mo37644a() {
            return C7518j1.f18391k;
        }
    }

    /* renamed from: v */
    public static final C7518j1 m31274v() {
        return f18390j.mo37644a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PriorityModeTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18394i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18393h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18392g;
    }
}
