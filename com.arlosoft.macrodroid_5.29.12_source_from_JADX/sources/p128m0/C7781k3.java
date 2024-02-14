package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetDigitalAssistantAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.k3 */
/* compiled from: SetDigitalAssistantActionInfo.kt */
public final class C7781k3 extends C3072g {

    /* renamed from: l */
    public static final C7782a f18789l = new C7782a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18790m = new C7781k3();
    @StringRes

    /* renamed from: g */
    private final int f18791g = C17541R$string.action_set_digital_assistant;

    /* renamed from: h */
    private final int f18792h = C17530R$drawable.ic_assistant;
    @StringRes

    /* renamed from: i */
    private final int f18793i = C17541R$string.action_set_digital_assistant_help;

    /* renamed from: j */
    private final int f18794j = 1;

    /* renamed from: k */
    private final List<String> f18795k = C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS");

    /* renamed from: m0.k3$a */
    /* compiled from: SetDigitalAssistantActionInfo.kt */
    public static final class C7782a {
        private C7782a() {
        }

        public /* synthetic */ C7782a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37759a() {
            return C7781k3.f18790m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32489v() {
        return f18789l.mo37759a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetDigitalAssistantAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18795k;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18793i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18792h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18791g;
    }

    /* renamed from: l */
    public int mo27894l() {
        return this.f18794j;
    }
}
