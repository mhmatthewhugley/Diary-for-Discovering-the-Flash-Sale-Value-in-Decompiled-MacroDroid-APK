package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.AndroidWearAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.g */
/* compiled from: AndroidWearActionInfo */
public class C7745g extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18730g;

    /* renamed from: u */
    public static C4001c1 m32314u() {
        if (f18730g == null) {
            f18730g = new C7745g();
        }
        return f18730g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AndroidWearAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_android_wear_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_watch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_android_wear;
    }
}
