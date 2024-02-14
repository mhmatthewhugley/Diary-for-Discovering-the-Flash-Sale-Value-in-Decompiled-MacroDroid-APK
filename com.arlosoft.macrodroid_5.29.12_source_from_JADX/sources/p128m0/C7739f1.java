package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ForceMacroRunAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.f1 */
/* compiled from: ForceMacroRunActionInfo */
public class C7739f1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18721g;

    /* renamed from: u */
    public static C4001c1 m32286u() {
        if (f18721g == null) {
            f18721g = new C7739f1();
        }
        return f18721g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ForceMacroRunAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_force_macro_run_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_call_made_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_force_macro_run;
    }
}
