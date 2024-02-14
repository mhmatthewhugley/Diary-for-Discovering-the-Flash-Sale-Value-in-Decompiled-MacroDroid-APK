package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.DarkThemeConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.m */
/* compiled from: DarkThemeConstraintInfo.kt */
public final class C7629m extends C4227b0 {

    /* renamed from: g */
    public static final C7630a f18536g = new C7630a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7629m f18537h = new C7629m();

    /* renamed from: l1.m$a */
    /* compiled from: DarkThemeConstraintInfo.kt */
    public static final class C7630a {
        private C7630a() {
        }

        public /* synthetic */ C7630a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7629m mo37668a() {
            return C7629m.f18537h;
        }
    }

    /* renamed from: v */
    public static final C7629m m31777v() {
        return f18536g.mo37668a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DarkThemeConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_dark_theme_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_contrast;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_dark_theme;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 29;
    }
}
