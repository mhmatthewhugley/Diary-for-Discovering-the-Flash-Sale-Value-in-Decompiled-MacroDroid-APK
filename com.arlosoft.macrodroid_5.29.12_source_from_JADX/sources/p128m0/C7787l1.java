package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.IfConfirmedThenAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.l1 */
/* compiled from: IfConfirmedThenActionInfo.kt */
public final class C7787l1 extends C3072g {

    /* renamed from: j */
    public static final C7788a f18803j = new C7788a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18804k = new C7787l1();
    @StringRes

    /* renamed from: g */
    private final int f18805g = C17541R$string.action_if_confirmed_then;

    /* renamed from: h */
    private final int f18806h = C17530R$drawable.ic_account_question;
    @StringRes

    /* renamed from: i */
    private final int f18807i = C17541R$string.action_if_confirmed_then_help;

    /* renamed from: m0.l1$a */
    /* compiled from: IfConfirmedThenActionInfo.kt */
    public static final class C7788a {
        private C7788a() {
        }

        public /* synthetic */ C7788a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37761a() {
            return C7787l1.f18804k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32517v() {
        return f18803j.mo37761a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IfConfirmedThenAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18807i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18806h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18805g;
    }
}
