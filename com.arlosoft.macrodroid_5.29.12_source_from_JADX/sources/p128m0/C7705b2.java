package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.MacroDroidNotificationTextAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.b2 */
/* compiled from: MacroDroidNotificationTextActionInfo.kt */
public final class C7705b2 extends C3072g {

    /* renamed from: j */
    public static final C7706a f18664j = new C7706a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18665k = new C7705b2();
    @StringRes

    /* renamed from: g */
    private final int f18666g = C17541R$string.action_macrodroid_notification_text;

    /* renamed from: h */
    private final int f18667h = C17530R$drawable.ic_card_text_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18668i = C17541R$string.action_macrodroid_notification_text_help;

    /* renamed from: m0.b2$a */
    /* compiled from: MacroDroidNotificationTextActionInfo.kt */
    public static final class C7706a {
        private C7706a() {
        }

        public /* synthetic */ C7706a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37744a() {
            return C7705b2.f18665k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32129v() {
        return f18664j.mo37744a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MacroDroidNotificationTextAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18668i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18667h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18666g;
    }
}
