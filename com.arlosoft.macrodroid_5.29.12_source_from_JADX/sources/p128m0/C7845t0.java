package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.EndIfAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.t0 */
/* compiled from: EndIfActionInfo */
public class C7845t0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18897g;

    /* renamed from: u */
    public static C4001c1 m32801u() {
        if (f18897g == null) {
            f18897g = new C7845t0();
        }
        return f18897g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new EndIfAction();
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_if_end_if;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_directions_fork_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_if_end_if;
    }
}
