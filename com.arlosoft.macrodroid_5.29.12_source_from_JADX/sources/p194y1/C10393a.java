package p194y1;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: y1.a */
/* compiled from: InfoBar.kt */
public abstract class C10393a {

    /* renamed from: a */
    private final int f23631a;

    /* renamed from: b */
    private final int f23632b;

    /* renamed from: c */
    private final String f23633c;

    /* renamed from: d */
    private final boolean f23634d;

    /* renamed from: e */
    private final String f23635e;

    /* renamed from: f */
    private final String f23636f;

    /* renamed from: g */
    private final Integer f23637g;

    /* renamed from: y1.a$a */
    /* compiled from: InfoBar.kt */
    public static final class C10394a extends C10393a {
        public C10394a() {
            super(C17541R$string.long_term_user_thanks_and_upgrade_encouragement_variant_1, C17528R$color.home_screen_bar_info, "encourage_upgrade_1", true, (String) null, (String) null, Integer.valueOf(C17541R$string.upgrade), 48, (C13695i) null);
        }
    }

    /* renamed from: y1.a$b */
    /* compiled from: InfoBar.kt */
    public static final class C10395b extends C10393a {
        public C10395b() {
            super(C17541R$string.long_term_user_thanks_and_upgrade_encouragement_variant_2, C17528R$color.home_screen_bar_info, "encourage_upgrade_2", true, (String) null, (String) null, Integer.valueOf(C17541R$string.upgrade), 48, (C13695i) null);
        }
    }

    /* renamed from: y1.a$c */
    /* compiled from: InfoBar.kt */
    public static final class C10396c extends C10393a {
        public C10396c() {
            super(C17541R$string.android_10_file_warning, C17528R$color.home_screen_bar_warning, "file_access_warning", false, (String) null, (String) null, (Integer) null, 120, (C13695i) null);
        }
    }

    /* renamed from: y1.a$d */
    /* compiled from: InfoBar.kt */
    public static final class C10397d extends C10393a {
        public C10397d() {
            super(C17541R$string.for_limited_time_sale_price, C17528R$color.home_screen_bar_info, "flash_sale_info", false, (String) null, (String) null, (Integer) null, 120, (C13695i) null);
        }
    }

    /* renamed from: y1.a$e */
    /* compiled from: InfoBar.kt */
    public static final class C10398e extends C10393a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10398e(String str, String str2) {
            super(0, C17528R$color.home_screen_bar_info, "help_translate_info", true, str, str2, (Integer) null, 64, (C13695i) null);
            C13706o.m87929f(str, "localizedMessage");
            C13706o.m87929f(str2, "buttonText");
        }
    }

    /* renamed from: y1.a$f */
    /* compiled from: InfoBar.kt */
    public static final class C10399f extends C10393a {
        public C10399f() {
            super(C17541R$string.home_screen_tile_long_press_info, C17528R$color.home_screen_bar_info, "tile_long_press_info", false, (String) null, (String) null, (Integer) null, 120, (C13695i) null);
        }
    }

    /* renamed from: y1.a$g */
    /* compiled from: InfoBar.kt */
    public static final class C10400g extends C10393a {
        public C10400g() {
            super(C17541R$string.all_notifications_disabled_warning, C17528R$color.home_screen_bar_warning, "notification_warning", true, (String) null, (String) null, (Integer) null, 112, (C13695i) null);
        }
    }

    private C10393a(@StringRes int i, @ColorRes int i2, String str, boolean z, String str2, String str3, @StringRes Integer num) {
        this.f23631a = i;
        this.f23632b = i2;
        this.f23633c = str;
        this.f23634d = z;
        this.f23635e = str2;
        this.f23636f = str3;
        this.f23637g = num;
    }

    public /* synthetic */ C10393a(int i, int i2, String str, boolean z, String str2, String str3, Integer num, C13695i iVar) {
        this(i, i2, str, z, str2, str3, num);
    }

    /* renamed from: a */
    public final String mo41081a() {
        return this.f23633c;
    }

    /* renamed from: b */
    public final int mo41082b() {
        return this.f23632b;
    }

    /* renamed from: c */
    public final String mo41083c() {
        return this.f23636f;
    }

    /* renamed from: d */
    public final Integer mo41084d() {
        return this.f23637g;
    }

    /* renamed from: e */
    public final int mo41085e() {
        return this.f23631a;
    }

    /* renamed from: f */
    public final String mo41086f() {
        return this.f23635e;
    }

    /* renamed from: g */
    public final boolean mo41087g() {
        return this.f23634d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10393a(int i, int i2, String str, boolean z, String str2, String str3, Integer num, int i3, C13695i iVar) {
        this(i, i2, str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : num, (C13695i) null);
    }
}
