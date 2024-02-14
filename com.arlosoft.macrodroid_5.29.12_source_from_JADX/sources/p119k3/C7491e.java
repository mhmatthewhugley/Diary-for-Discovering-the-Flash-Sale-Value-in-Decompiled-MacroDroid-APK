package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ApplicationLaunchedTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.e */
/* compiled from: ApplicationLaunchedTriggerInfo */
public class C7491e extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18349g;

    /* renamed from: u */
    public static C4001c1 m31142u() {
        if (f18349g == null) {
            f18349g = new C7491e();
        }
        return f18349g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ApplicationLaunchedTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_application_launched_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_launch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_application_launched;
    }
}
