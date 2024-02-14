package com.arlosoft.macrodroid.homescreen;

import android.content.Context;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.settings.C5163j2;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.homescreen.m */
/* compiled from: UpgradeBanner.kt */
public final class C4765m {

    /* renamed from: c */
    public static final C4766a f11949c = new C4766a((C13695i) null);

    /* renamed from: a */
    private final Context f11950a;

    /* renamed from: b */
    private final Integer[] f11951b = {Integer.valueOf(C17541R$string.unlimited_number_of_macros), Integer.valueOf(C17541R$string.no_adverts), Integer.valueOf(C17541R$string.cloud_backup), Integer.valueOf(C17541R$string.upgrade_unlimited_no_template_store_title), Integer.valueOf(C17541R$string.upgrade_unlimited_support_us_title)};

    /* renamed from: com.arlosoft.macrodroid.homescreen.m$a */
    /* compiled from: UpgradeBanner.kt */
    public static final class C4766a {
        private C4766a() {
        }

        public /* synthetic */ C4766a(C13695i iVar) {
            this();
        }
    }

    public C4765m(Context context) {
        C13706o.m87929f(context, "context");
        this.f11950a = context;
    }

    @StringRes
    /* renamed from: a */
    public final int mo29301a() {
        long o2 = C5163j2.m20225o2(this.f11950a);
        int G = C5163j2.m19970G(this.f11950a);
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        if (o2 == 0) {
            C5163j2.m20149e6(this.f11950a, currentTimeMillis);
            return this.f11951b[0].intValue();
        } else if (currentTimeMillis - o2 <= 3600000) {
            return this.f11951b[G].intValue();
        } else {
            C5163j2.m20149e6(this.f11950a, currentTimeMillis);
            int i2 = G + 1;
            if (i2 < this.f11951b.length) {
                i = i2;
            }
            C5163j2.m19950D3(this.f11950a, i);
            return this.f11951b[i].intValue();
        }
    }
}
