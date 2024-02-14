package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;

/* renamed from: k3.o0 */
/* compiled from: IncomingSMSTriggerInfo */
public class C7537o0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18419g;

    /* renamed from: u */
    public static C4001c1 m31366u() {
        if (f18419g == null) {
            f18419g = new C7537o0();
        }
        return f18419g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IncomingSMSTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_incoming_sms_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_sms_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_incoming_sms;
    }
}
