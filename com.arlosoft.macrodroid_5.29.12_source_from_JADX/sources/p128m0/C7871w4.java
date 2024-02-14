package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.USBTetheringAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.w4 */
/* compiled from: USBTetheringActionInfo */
public class C7871w4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18935g;

    /* renamed from: u */
    public static C4001c1 m32927u() {
        if (f18935g == null) {
            f18935g = new C7871w4();
        }
        return f18935g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new USBTetheringAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_usb_tethering_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_usb_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_usb_tethering;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}
