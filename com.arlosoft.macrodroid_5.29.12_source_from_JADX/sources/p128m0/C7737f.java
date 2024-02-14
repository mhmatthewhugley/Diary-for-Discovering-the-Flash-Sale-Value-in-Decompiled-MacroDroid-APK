package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.AndroidShortcutsAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.f */
/* compiled from: AndroidShortcutsActionInfo */
public class C7737f extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18719g;

    /* renamed from: u */
    public static C4001c1 m32273u() {
        if (f18719g == null) {
            f18719g = new C7737f();
        }
        return f18719g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AndroidShortcutsAction(activity, macro);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.action_android_shortcuts_settings));
        arrayList.add(Integer.valueOf(C17541R$string.action_android_shortcuts_options));
        arrayList.add(Integer.valueOf(C17541R$string.action_android_shortcuts_recent));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_android_shortcuts_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_android_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_android_shortcuts;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 17;
    }
}
