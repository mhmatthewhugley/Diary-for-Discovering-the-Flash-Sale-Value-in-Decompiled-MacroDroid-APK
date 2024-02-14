package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DarkThemeAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.e0 */
/* compiled from: DarkThemeActionInfo.kt */
public final class C7729e0 extends C3072g {

    /* renamed from: l */
    public static final C7730a f18703l = new C7730a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18704m = new C7729e0();
    @StringRes

    /* renamed from: g */
    private final int f18705g = C17541R$string.action_dark_theme;

    /* renamed from: h */
    private final int f18706h = C17530R$drawable.ic_contrast;
    @StringRes

    /* renamed from: i */
    private final int f18707i = C17541R$string.action_dark_theme_help;

    /* renamed from: j */
    private final int f18708j = 1;

    /* renamed from: k */
    private final List<String> f18709k = C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS");

    /* renamed from: m0.e0$a */
    /* compiled from: DarkThemeActionInfo.kt */
    public static final class C7730a {
        private C7730a() {
        }

        public /* synthetic */ C7730a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37749a() {
            return C7729e0.f18704m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32237v() {
        return f18703l.mo37749a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DarkThemeAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18709k;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18707i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18706h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18705g;
    }

    /* renamed from: l */
    public int mo27894l() {
        return this.f18708j;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 29;
    }
}
