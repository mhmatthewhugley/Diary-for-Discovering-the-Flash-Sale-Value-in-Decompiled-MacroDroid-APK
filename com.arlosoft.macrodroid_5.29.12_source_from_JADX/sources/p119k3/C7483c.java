package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.c */
/* compiled from: AndroidWearTriggerInfo */
public class C7483c extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18341g;

    /* renamed from: u */
    public static C4001c1 m31102u() {
        if (f18341g == null) {
            f18341g = new C7483c();
        }
        return f18341g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AndroidWearTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_android_wear_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_watch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_android_wear;
    }
}
