package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SendIntentAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.b3 */
/* compiled from: SendIntentActionInfo */
public class C7707b3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18669g;

    /* renamed from: u */
    public static C4001c1 m32135u() {
        if (f18669g == null) {
            f18669g = new C7707b3();
        }
        return f18669g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SendIntentAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_send_intent_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_cube_send_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_send_intent;
    }
}
