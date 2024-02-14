package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.UploadPhotoAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.z4 */
/* compiled from: UploadPhotoActionInfo */
public class C7892z4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18965g;

    /* renamed from: u */
    public static C4001c1 m33031u() {
        if (f18965g == null) {
            f18965g = new C7892z4();
        }
        return f18965g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new UploadPhotoAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_upload_photo_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_insert_photo_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_upload_photo;
    }
}
