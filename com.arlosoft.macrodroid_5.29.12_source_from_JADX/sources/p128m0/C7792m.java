package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.CancelActiveMacroAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.m */
/* compiled from: CancelActiveMacroActionInfo */
public class C7792m extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18811g;

    /* renamed from: u */
    public static C4001c1 m32540u() {
        if (f18811g == null) {
            f18811g = new C7792m();
        }
        return f18811g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CancelActiveMacroAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_cancel_macro_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_close_box_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_cancel_macro;
    }
}
