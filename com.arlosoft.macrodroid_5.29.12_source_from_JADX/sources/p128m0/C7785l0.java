package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DisableCameraAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.l0 */
/* compiled from: DisableCameraActionInfo.kt */
public final class C7785l0 extends C3072g {

    /* renamed from: j */
    public static final C7786a f18798j = new C7786a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18799k = new C7785l0();
    @StringRes

    /* renamed from: g */
    private final int f18800g = C17541R$string.action_enable_disable_camera;

    /* renamed from: h */
    private final int f18801h = C17530R$drawable.camera_off;
    @StringRes

    /* renamed from: i */
    private final int f18802i = C17541R$string.action_enable_disable_camera_help;

    /* renamed from: m0.l0$a */
    /* compiled from: DisableCameraActionInfo.kt */
    public static final class C7786a {
        private C7786a() {
        }

        public /* synthetic */ C7786a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37760a() {
            return C7785l0.f18799k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32509v() {
        return f18798j.mo37760a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DisableCameraAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18802i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18801h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18800g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo27900r() {
        return 29;
    }
}
