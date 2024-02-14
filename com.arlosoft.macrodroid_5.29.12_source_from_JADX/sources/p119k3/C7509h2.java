package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.WebHookTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.h2 */
/* compiled from: WebHookTriggerInfo.kt */
public final class C7509h2 extends C5889c8 {

    /* renamed from: j */
    public static final C7510a f18375j = new C7510a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18376k = new C7509h2();
    @StringRes

    /* renamed from: g */
    private final int f18377g = C17541R$string.trigger_web_hook;

    /* renamed from: h */
    private final int f18378h = C17530R$drawable.ic_webhook_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18379i = C17541R$string.trigger_web_hook_help;

    /* renamed from: k3.h2$a */
    /* compiled from: WebHookTriggerInfo.kt */
    public static final class C7510a {
        private C7510a() {
        }

        public /* synthetic */ C7510a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37642a() {
            return C7509h2.f18376k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31233v() {
        return f18375j.mo37642a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WebHookTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18379i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18378h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18377g;
    }
}
