package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.HttpRequestAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.j1 */
/* compiled from: HttpRequestActionInfo.kt */
public final class C7770j1 extends C3072g {

    /* renamed from: j */
    public static final C7771a f18769j = new C7771a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18770k = new C7770j1();
    @StringRes

    /* renamed from: g */
    private final int f18771g = C17541R$string.action_http_request;

    /* renamed from: h */
    private final int f18772h = C17530R$drawable.upload_network;
    @StringRes

    /* renamed from: i */
    private final int f18773i = C17541R$string.action_http_request_info;

    /* renamed from: m0.j1$a */
    /* compiled from: HttpRequestActionInfo.kt */
    public static final class C7771a {
        private C7771a() {
        }

        public /* synthetic */ C7771a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37756a() {
            return C7770j1.f18770k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32440v() {
        return f18769j.mo37756a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new HttpRequestAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18773i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18772h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18771g;
    }
}
