package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.FileOperationAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.z0 */
/* compiled from: FileOperationActionInfo */
public class C7888z0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18961g;

    /* renamed from: u */
    public static C4001c1 m33008u() {
        if (f18961g == null) {
            f18961g = new C7888z0();
        }
        return f18961g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FileOperationAction(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.action_file_operation_copy));
        arrayList.add(Integer.valueOf(C17541R$string.action_file_operation_move));
        arrayList.add(Integer.valueOf(C17541R$string.action_file_operation_delete));
        arrayList.add(Integer.valueOf(C17541R$string.action_file_operation_folder));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_file_operation_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_folder_move_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_file_operation;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo27900r() {
        return 23;
    }
}
