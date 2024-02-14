package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ContinueLoopAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.c0 */
/* compiled from: ContinueLoopActionInfo.kt */
public final class C7712c0 extends C3072g {

    /* renamed from: j */
    public static final C7713a f18677j = new C7713a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18678k = new C7712c0();
    @StringRes

    /* renamed from: g */
    private final int f18679g = C17541R$string.action_continue_loop;

    /* renamed from: h */
    private final int f18680h = C17530R$drawable.arrow_expand_up;
    @StringRes

    /* renamed from: i */
    private final int f18681i = C17541R$string.action_continue_loop_help;

    /* renamed from: m0.c0$a */
    /* compiled from: ContinueLoopActionInfo.kt */
    public static final class C7713a {
        private C7713a() {
        }

        public /* synthetic */ C7713a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37746a() {
            return C7712c0.f18678k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32158v() {
        return f18677j.mo37746a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ContinueLoopAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18681i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18680h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18679g;
    }
}
