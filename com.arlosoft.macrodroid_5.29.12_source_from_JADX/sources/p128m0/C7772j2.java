package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OpenLastPhotoAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.j2 */
/* compiled from: OpenLastPhotoActionInfo.kt */
public final class C7772j2 extends C3072g {

    /* renamed from: j */
    public static final C7773a f18774j = new C7773a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18775k = new C7772j2();
    @StringRes

    /* renamed from: g */
    private final int f18776g = C17541R$string.action_open_last_photo;

    /* renamed from: h */
    private final int f18777h = C17530R$drawable.camera_image;
    @StringRes

    /* renamed from: i */
    private final int f18778i = C17541R$string.action_open_last_photo_help;

    /* renamed from: m0.j2$a */
    /* compiled from: OpenLastPhotoActionInfo.kt */
    public static final class C7773a {
        private C7773a() {
        }

        public /* synthetic */ C7773a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37757a() {
            return C7772j2.f18775k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32447v() {
        return f18774j.mo37757a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OpenLastPhotoAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18778i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18777h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18776g;
    }
}
