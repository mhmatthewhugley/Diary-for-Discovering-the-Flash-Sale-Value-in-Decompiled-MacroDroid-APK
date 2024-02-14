package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SystemSettingAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.n4 */
/* compiled from: SystemSettingActionInfo.kt */
public final class C7803n4 extends C3072g {

    /* renamed from: j */
    public static final C7804a f18822j = new C7804a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18823k = new C7803n4();
    @StringRes

    /* renamed from: g */
    private final int f18824g = C17541R$string.action_system_setting;

    /* renamed from: h */
    private final int f18825h = C17530R$drawable.ic_cellphone_settings_variant_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18826i = C17541R$string.action_system_setting_help;

    /* renamed from: m0.n4$a */
    /* compiled from: SystemSettingActionInfo.kt */
    public static final class C7804a {
        private C7804a() {
        }

        public /* synthetic */ C7804a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37762a() {
            return C7803n4.f18823k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32604v() {
        return f18822j.mo37762a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SystemSettingAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18826i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18825h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18824g;
    }

    /* renamed from: q */
    public boolean mo27899q() {
        return false;
    }
}
