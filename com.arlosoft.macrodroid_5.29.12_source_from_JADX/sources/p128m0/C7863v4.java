package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.UIInteractionAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.v4 */
/* compiled from: UIInteractionActionInfo.kt */
public final class C7863v4 extends C3072g {

    /* renamed from: j */
    public static final C7864a f18921j = new C7864a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18922k = new C7863v4();
    @StringRes

    /* renamed from: g */
    private final int f18923g = C17541R$string.action_ui_interaction;

    /* renamed from: h */
    private final int f18924h = C17530R$drawable.ic_gesture_double_tap_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18925i = C17541R$string.action_ui_interaction_help;

    /* renamed from: m0.v4$a */
    /* compiled from: UIInteractionActionInfo.kt */
    public static final class C7864a {
        private C7864a() {
        }

        public /* synthetic */ C7864a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37774a() {
            return C7863v4.f18922k;
        }
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new UIInteractionAction(activity, macro);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Integer> mo27890d() {
        return C13614t.m87744f(Integer.valueOf(C17541R$string.ui_interaction_click), Integer.valueOf(C17541R$string.ui_interaction_copy), Integer.valueOf(C17541R$string.ui_interaction_paste), Integer.valueOf(C17541R$string.ui_interaction_cut), Integer.valueOf(C17541R$string.ui_interaction_perform_gesture), Integer.valueOf(C17541R$string.trigger_swipe));
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18925i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18924h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18923g;
    }
}
