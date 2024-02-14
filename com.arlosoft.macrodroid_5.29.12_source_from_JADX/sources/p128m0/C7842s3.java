package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetMacroDroidIconAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.s3 */
/* compiled from: SetMacroDroidIconActionInfo */
public class C7842s3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18894g;

    /* renamed from: u */
    public static C4001c1 m32783u() {
        if (f18894g == null) {
            f18894g = new C7842s3();
        }
        return f18894g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetMacroDroidIconAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_macrodroid_icon_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.active_icon_new;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_macrodroid_icon;
    }
}
