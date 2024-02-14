package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.WriteToFileAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.g5 */
/* compiled from: WriteToFileActionInfo */
public class C7752g5 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18740g;

    /* renamed from: u */
    public static C4001c1 m32347u() {
        if (f18740g == null) {
            f18740g = new C7752g5();
        }
        return f18740g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WriteToFileAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_write_to_file_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_file_plus_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_write_to_file;
    }
}
