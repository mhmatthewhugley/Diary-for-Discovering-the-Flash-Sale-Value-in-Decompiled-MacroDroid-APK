package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ClearNotificationsAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.t */
/* compiled from: ClearNotificationsActionInfo */
public class C7844t extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18896g;

    /* renamed from: u */
    public static C4001c1 m32795u() {
        if (f18896g == null) {
            f18896g = new C7844t();
        }
        return f18896g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClearNotificationsAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_clear_notifications_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_eye_off_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_clear_notifications;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 18;
    }
}
