package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.FileOperationV21Action;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.a1 */
/* compiled from: FileOperationV21ActionInfo */
public class C7694a1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18644g;

    /* renamed from: u */
    public static C4001c1 m32081u() {
        if (f18644g == null) {
            f18644g = new C7694a1();
        }
        return f18644g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FileOperationV21Action(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_file_operation_v2_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_file_send_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_file_operation_v2;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}
