package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.EndLoopAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.u0 */
/* compiled from: EndLoopActionInfo */
public class C7852u0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18907g;

    /* renamed from: u */
    public static C4001c1 m32834u() {
        if (f18907g == null) {
            f18907g = new C7852u0();
        }
        return f18907g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new EndLoopAction();
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_loop_end_loop;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_repeat_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_loop_end_loop;
    }
}
