package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ClearAppDataAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.p */
/* compiled from: ClearAppDataActionInfo */
public class C7813p extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18843g;

    /* renamed from: u */
    public static C4001c1 m32647u() {
        if (f18843g == null) {
            f18843g = new C7813p();
        }
        return f18843g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClearAppDataAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_clear_app_data_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_delete_circle_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_clear_app_data;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}
