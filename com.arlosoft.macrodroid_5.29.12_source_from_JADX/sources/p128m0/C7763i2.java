package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OpenFileAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.i2 */
/* compiled from: OpenFileActionInfo */
public class C7763i2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18756g;

    /* renamed from: u */
    public static C4001c1 m32409u() {
        if (f18756g == null) {
            f18756g = new C7763i2();
        }
        return f18756g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OpenFileAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_open_file_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_file_document_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_open_file;
    }
}
