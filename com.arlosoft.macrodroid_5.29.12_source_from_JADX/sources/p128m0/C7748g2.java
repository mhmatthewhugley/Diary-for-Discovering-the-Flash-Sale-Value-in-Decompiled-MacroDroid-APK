package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.NotificationInteractionAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.g2 */
/* compiled from: NotificationInteractionActionInfo.kt */
public final class C7748g2 extends C3072g {

    /* renamed from: j */
    public static final C7749a f18733j = new C7749a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18734k = new C7748g2();
    @StringRes

    /* renamed from: g */
    private final int f18735g = C17541R$string.action_notification_interaction;

    /* renamed from: h */
    private final int f18736h = C17530R$drawable.ic_touch_app_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18737i = C17541R$string.action_notification_interaction_help;

    /* renamed from: m0.g2$a */
    /* compiled from: NotificationInteractionActionInfo.kt */
    public static final class C7749a {
        private C7749a() {
        }

        public /* synthetic */ C7749a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37752a() {
            return C7748g2.f18734k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32330v() {
        return f18733j.mo37752a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new NotificationInteractionAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18737i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18736h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18735g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 19;
    }
}
