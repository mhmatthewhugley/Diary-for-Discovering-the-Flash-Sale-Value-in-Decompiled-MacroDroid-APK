package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.z1 */
/* compiled from: LoopActionInfo */
public class C7889z1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18962g;

    /* renamed from: u */
    public static C4001c1 m33015u() {
        if (f18962g == null) {
            f18962g = new C7889z1();
        }
        return f18962g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LoopAction(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.while_do));
        arrayList.add(Integer.valueOf(C17541R$string.do_while));
        arrayList.add(Integer.valueOf(C17541R$string.item_category_macrodroid_condition_loop));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_loop_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_repeat_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_loop;
    }
}
