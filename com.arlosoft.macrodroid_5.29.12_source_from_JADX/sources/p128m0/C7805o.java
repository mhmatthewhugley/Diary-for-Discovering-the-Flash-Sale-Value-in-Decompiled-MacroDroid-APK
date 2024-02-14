package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ChangeKeyboardAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.o */
/* compiled from: ChangeKeyboardActionInfo.kt */
public final class C7805o extends C3072g {

    /* renamed from: l */
    public static final C7806a f18827l = new C7806a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18828m = new C7805o();
    @StringRes

    /* renamed from: g */
    private final int f18829g = C17541R$string.action_change_keyboard;

    /* renamed from: h */
    private final int f18830h = C17530R$drawable.ic_keyboard_settings_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18831i = C17541R$string.action_change_keyboard_help;

    /* renamed from: j */
    private final int f18832j = 1;

    /* renamed from: k */
    private final List<String> f18833k = C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS");

    /* renamed from: m0.o$a */
    /* compiled from: ChangeKeyboardActionInfo.kt */
    public static final class C7806a {
        private C7806a() {
        }

        public /* synthetic */ C7806a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37763a() {
            return C7805o.f18828m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32612v() {
        return f18827l.mo37763a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ChangeKeyboardAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18833k;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18831i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18830h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18829g;
    }

    /* renamed from: l */
    public int mo27894l() {
        return this.f18832j;
    }
}
