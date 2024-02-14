package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ContactViaAppAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.b0 */
/* compiled from: ContactViaAppActionInfo.kt */
public final class C7701b0 extends C3072g {

    /* renamed from: j */
    public static final C7702a f18654j = new C7702a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18655k = new C7701b0();
    @StringRes

    /* renamed from: g */
    private final int f18656g = C17541R$string.action_contact_via_app;

    /* renamed from: h */
    private final int f18657h = C17530R$drawable.card_account_phone;
    @StringRes

    /* renamed from: i */
    private final int f18658i = C17541R$string.action_contact_via_app_help;

    /* renamed from: m0.b0$a */
    /* compiled from: ContactViaAppActionInfo.kt */
    public static final class C7702a {
        private C7702a() {
        }

        public /* synthetic */ C7702a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37742a() {
            return C7701b0.f18655k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32115v() {
        return f18654j.mo37742a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ContactViaAppAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18658i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18657h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18656g;
    }
}
