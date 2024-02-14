package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetNFCAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Collections;
import java.util.List;

/* renamed from: m0.u3 */
/* compiled from: SetNFCActionInfo */
public class C7855u3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18910g;

    /* renamed from: u */
    public static C4001c1 m32851u() {
        if (f18910g == null) {
            f18910g = new C7855u3();
        }
        return f18910g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetNFCAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_nfc_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_nfc_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_nfc;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}
