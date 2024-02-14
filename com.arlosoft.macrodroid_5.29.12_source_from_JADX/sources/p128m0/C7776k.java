package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.BreakFromLoopAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.k */
/* compiled from: BreakFromLoopActionInfo.kt */
public final class C7776k extends C3072g {

    /* renamed from: j */
    public static final C7777a f18781j = new C7777a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18782k = new C7776k();
    @StringRes

    /* renamed from: g */
    private final int f18783g = C17541R$string.action_break_from_loop;

    /* renamed from: h */
    private final int f18784h = C17530R$drawable.arrow_expand_right;
    @StringRes

    /* renamed from: i */
    private final int f18785i = C17541R$string.action_break_from_loop_help;

    /* renamed from: m0.k$a */
    /* compiled from: BreakFromLoopActionInfo.kt */
    public static final class C7777a {
        private C7777a() {
        }

        public /* synthetic */ C7777a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37758a() {
            return C7776k.f18782k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32466v() {
        return f18781j.mo37758a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BreakFromLoopAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18785i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18784h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18783g;
    }
}
