package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.OutgoingCallTrigger;

/* renamed from: k3.g1 */
/* compiled from: OutgoingCallTriggerInfo */
public class C7504g1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18370g;

    /* renamed from: u */
    public static C4001c1 m31205u() {
        if (f18370g == null) {
            f18370g = new C7504g1();
        }
        return f18370g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OutgoingCallTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_outgoing_call_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_phone_forward_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_outgoing_call;
    }
}
