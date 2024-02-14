package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.IncomingCallTrigger;

/* renamed from: k3.n0 */
/* compiled from: IncomingCallTriggerInfo */
public class C7534n0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18416g;

    /* renamed from: u */
    public static C4001c1 m31351u() {
        if (f18416g == null) {
            f18416g = new C7534n0();
        }
        return f18416g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IncomingCallTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_incoming_call_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_phone_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_incoming_call;
    }
}
