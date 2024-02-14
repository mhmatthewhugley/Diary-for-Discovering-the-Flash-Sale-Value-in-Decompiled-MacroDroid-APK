package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.CallActiveTrigger;

/* renamed from: k3.o */
/* compiled from: CallActiveTriggerInfo */
public class C7536o extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18418g;

    /* renamed from: u */
    public static C4001c1 m31361u() {
        if (f18418g == null) {
            f18418g = new C7536o();
        }
        return f18418g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CallActiveTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_call_active_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_phone_in_talk_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_call_active;
    }
}
