package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.OrientationTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.f1 */
/* compiled from: OrientationTriggerInfo.kt */
public final class C7498f1 extends C5889c8 {

    /* renamed from: j */
    public static final C7499a f18361j = new C7499a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7498f1 f18362k = new C7498f1();
    @StringRes

    /* renamed from: g */
    private final int f18363g = C17541R$string.trigger_orientation;

    /* renamed from: h */
    private final int f18364h = C17530R$drawable.ic_phone_rotate_landscape_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18365i = C17541R$string.trigger_orientation_help;

    /* renamed from: k3.f1$a */
    /* compiled from: OrientationTriggerInfo.kt */
    public static final class C7499a {
        private C7499a() {
        }

        public /* synthetic */ C7499a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7498f1 mo37640a() {
            return C7498f1.f18362k;
        }
    }

    /* renamed from: v */
    public static final C7498f1 m31181v() {
        return f18361j.mo37640a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OrientationTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18365i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18364h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18363g;
    }
}
