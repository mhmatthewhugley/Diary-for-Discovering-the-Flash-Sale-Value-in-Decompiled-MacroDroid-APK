package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.LogcatTrigger;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.u0 */
/* compiled from: LogcatTriggerInfo.kt */
public final class C7559u0 extends C5889c8 {

    /* renamed from: l */
    public static final C7560a f18453l = new C7560a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18454m = new C7559u0();
    @StringRes

    /* renamed from: g */
    private final int f18455g = C17541R$string.trigger_logcat;

    /* renamed from: h */
    private final int f18456h = C17530R$drawable.ic_cat;
    @StringRes

    /* renamed from: i */
    private final int f18457i = C17541R$string.trigger_logcat_help;

    /* renamed from: j */
    private final int f18458j = 1;

    /* renamed from: k */
    private final List<String> f18459k = C13612s.m87736e("android.permission.READ_LOGS");

    /* renamed from: k3.u0$a */
    /* compiled from: LogcatTriggerInfo.kt */
    public static final class C7560a {
        private C7560a() {
        }

        public /* synthetic */ C7560a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37651a() {
            return C7559u0.f18454m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31467v() {
        return f18453l.mo37651a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LogcatTrigger(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18459k;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18457i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18456h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18455g;
    }

    /* renamed from: l */
    public int mo27894l() {
        return this.f18458j;
    }
}
