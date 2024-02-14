package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ExitActionBlockAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.v0 */
/* compiled from: ExitActionBlockActionInfo.kt */
public final class C7858v0 extends C3072g {

    /* renamed from: j */
    public static final C7859a f18913j = new C7859a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18914k = new C7858v0();
    @StringRes

    /* renamed from: g */
    private final int f18915g = C17541R$string.action_exit_action_block;

    /* renamed from: h */
    private final int f18916h = C17530R$drawable.exit_run;
    @StringRes

    /* renamed from: i */
    private final int f18917i = C17541R$string.action_exit_action_block_help;

    /* renamed from: m0.v0$a */
    /* compiled from: ExitActionBlockActionInfo.kt */
    public static final class C7859a {
        private C7859a() {
        }

        public /* synthetic */ C7859a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37773a() {
            return C7858v0.f18914k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32869v() {
        return f18913j.mo37773a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ExitActionBlockAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18917i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18916h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18915g;
    }
}
