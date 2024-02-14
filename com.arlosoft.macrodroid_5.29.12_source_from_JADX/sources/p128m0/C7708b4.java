package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetVariableAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.b4 */
/* compiled from: SetVariableActionInfo */
public class C7708b4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18670g;

    /* renamed from: u */
    public static C4001c1 m32140u() {
        if (f18670g == null) {
            f18670g = new C7708b4();
        }
        return f18670g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetVariableAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_variable_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_help_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_variable;
    }
}
