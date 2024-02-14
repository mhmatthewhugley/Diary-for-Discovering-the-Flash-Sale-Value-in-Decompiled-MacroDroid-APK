package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.r0 */
/* compiled from: ElseIfConfirmedThenActionInfo.kt */
public final class C7829r0 extends C3072g {

    /* renamed from: j */
    public static final C7830a f18869j = new C7830a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18870k = new C7829r0();
    @StringRes

    /* renamed from: g */
    private final int f18871g = C17541R$string.action_else_if_confirmed_then;

    /* renamed from: h */
    private final int f18872h = C17530R$drawable.ic_directions_fork_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18873i = C17541R$string.action_else_if_confirmed_then;

    /* renamed from: m0.r0$a */
    /* compiled from: ElseIfConfirmedThenActionInfo.kt */
    public static final class C7830a {
        private C7830a() {
        }

        public /* synthetic */ C7830a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37768a() {
            return C7829r0.f18870k;
        }
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ElseIfConfirmedThenAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18873i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18872h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18871g;
    }
}
