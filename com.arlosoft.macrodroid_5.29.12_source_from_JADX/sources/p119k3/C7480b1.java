package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.NFCTrigger;

/* renamed from: k3.b1 */
/* compiled from: NFCTriggerInfo */
public class C7480b1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18335g;

    /* renamed from: u */
    public static C4001c1 m31089u() {
        if (f18335g == null) {
            f18335g = new C7480b1();
        }
        return f18335g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && MacroDroidApplication.m14845u().getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new NFCTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_nfc_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_nfc_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_nfc;
    }
}
