package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.WhatsAppAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.f5 */
/* compiled from: WhatsAppActionInfo.kt */
public final class C7743f5 extends C3072g {

    /* renamed from: j */
    public static final C7744a f18725j = new C7744a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18726k = new C7743f5();
    @StringRes

    /* renamed from: g */
    private final int f18727g = C17541R$string.action_whats_app;

    /* renamed from: h */
    private final int f18728h = C17530R$drawable.ic_whatsapp;
    @StringRes

    /* renamed from: i */
    private final int f18729i = C17541R$string.action_whats_app_help;

    /* renamed from: m0.f5$a */
    /* compiled from: WhatsAppActionInfo.kt */
    public static final class C7744a {
        private C7744a() {
        }

        public /* synthetic */ C7744a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37751a() {
            return C7743f5.f18726k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32307v() {
        return f18725j.mo37751a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WhatsAppAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18729i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18728h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18727g;
    }

    /* renamed from: n */
    public boolean mo27896n() {
        return true;
    }
}
