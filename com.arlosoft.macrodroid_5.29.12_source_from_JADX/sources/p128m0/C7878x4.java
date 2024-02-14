package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.UninstallAppAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.x4 */
/* compiled from: UninstallAppActionInfo.kt */
public final class C7878x4 extends C3072g {

    /* renamed from: j */
    public static final C7879a f18945j = new C7879a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18946k = new C7878x4();
    @StringRes

    /* renamed from: g */
    private final int f18947g = C17541R$string.action_uninstall_app;

    /* renamed from: h */
    private final int f18948h = C17530R$drawable.ic_sticker_remove;
    @StringRes

    /* renamed from: i */
    private final int f18949i = C17541R$string.action_uninstall_app;

    /* renamed from: m0.x4$a */
    /* compiled from: UninstallAppActionInfo.kt */
    public static final class C7879a {
        private C7879a() {
        }

        public /* synthetic */ C7879a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37777a() {
            return C7878x4.f18946k;
        }
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new UninstallAppAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18949i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18948h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18947g;
    }
}
