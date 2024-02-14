package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.RestoreNotificationsAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.w2 */
/* compiled from: RestoreNotificationsActionInfo.kt */
public final class C7868w2 extends C3072g {

    /* renamed from: j */
    public static final C7869a f18929j = new C7869a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18930k = new C7868w2();
    @StringRes

    /* renamed from: g */
    private final int f18931g = C17541R$string.action_restore_hidden_notifications;

    /* renamed from: h */
    private final int f18932h = C17530R$drawable.ic_eye_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18933i = C17541R$string.action_restore_hidden_notifications_help;

    /* renamed from: m0.w2$a */
    /* compiled from: RestoreNotificationsActionInfo.kt */
    public static final class C7869a {
        private C7869a() {
        }

        public /* synthetic */ C7869a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37775a() {
            return C7868w2.f18930k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32915v() {
        return f18929j.mo37775a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new RestoreNotificationsAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18933i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18932h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18931g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 30;
    }
}
