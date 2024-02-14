package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.TextManipulationAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.q4 */
/* compiled from: TextManipulationActionInfo */
public class C7826q4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18863g;

    /* renamed from: u */
    public static C4001c1 m32718u() {
        if (f18863g == null) {
            f18863g = new C7826q4();
        }
        return f18863g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TextManipulationAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_text_manipulation_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_code_string_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_text_manipulation;
    }
}
