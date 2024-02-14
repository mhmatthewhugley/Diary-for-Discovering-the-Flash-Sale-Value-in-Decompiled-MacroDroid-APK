package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.CloseApplicationAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.w */
/* compiled from: CloseApplicationActionInfo */
public class C7865w extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18926g;

    /* renamed from: u */
    public static C4001c1 m32897u() {
        if (f18926g == null) {
            f18926g = new C7865w();
        }
        return f18926g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CloseApplicationAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_close_application_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_skull_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_close_application;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}
