package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OpenMacroDroidLogAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.k2 */
/* compiled from: OpenMacroDroidLogActionInfo */
public class C7780k2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18788g;

    /* renamed from: u */
    public static C4001c1 m32483u() {
        if (f18788g == null) {
            f18788g = new C7780k2();
        }
        return f18788g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OpenMacroDroidLogAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_open_macrodroid_log_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_file_document_box_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_open_macrodroid_log;
    }
}
