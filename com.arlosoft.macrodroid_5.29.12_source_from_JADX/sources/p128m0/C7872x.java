package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ConfigureAppNotificationsAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.x */
/* compiled from: ConfigureAppNotificationsActionInfo */
public class C7872x extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18936g;

    /* renamed from: u */
    public static C4001c1 m32933u() {
        if (f18936g == null) {
            f18936g = new C7872x();
        }
        return f18936g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ConfigureAppNotificationsAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_configure_app_notifications_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_report_problem_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_configure_app_notifications;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}
