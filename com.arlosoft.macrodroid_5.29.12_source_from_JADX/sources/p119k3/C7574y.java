package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.DialNumberTrigger;

/* renamed from: k3.y */
/* compiled from: DialNumberTriggerInfo */
public class C7574y extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18482g;

    /* renamed from: u */
    public static C4001c1 m31533u() {
        if (f18482g == null) {
            f18482g = new C7574y();
        }
        return f18482g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DialNumberTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_dial_number_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_dialpad_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_dial_number;
    }
}
