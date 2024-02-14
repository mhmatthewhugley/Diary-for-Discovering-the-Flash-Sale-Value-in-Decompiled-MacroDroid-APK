package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.homescreen.C4762j;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6409o;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13706o;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.o */
/* compiled from: LastEditedMacroTile.kt */
public final class C4813o extends C10433a {

    /* renamed from: b */
    private final Activity f12071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4762j f12072c;

    /* renamed from: d */
    private final String f12073d;

    /* renamed from: e */
    private final int f12074e = C17530R$drawable.ic_share_white_24dp;

    /* renamed from: f */
    private final long f12075f = 21;

    /* renamed from: g */
    private final int f12076g;

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.o$a */
    /* compiled from: LastEditedMacroTile.kt */
    public static final class C4814a implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ C4813o f12077a;

        /* renamed from: b */
        final /* synthetic */ C13684d0<Macro> f12078b;

        C4814a(C4813o oVar, C13684d0<Macro> d0Var) {
            this.f12077a = oVar;
            this.f12078b = d0Var;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            this.f12077a.f12072c.mo29281w1(((Macro) this.f12078b.element).getId());
        }
    }

    public C4813o(Activity activity, C4762j jVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(jVar, "homeScreenNavigator");
        this.f12071b = activity;
        this.f12072c = jVar;
        String string = activity.getString(C17541R$string.home_screen_tile_last_edited_macro);
        C13706o.m87928e(string, "activity.getString(R.str…n_tile_last_edited_macro)");
        this.f12073d = string;
        this.f12076g = ContextCompat.getColor(activity, C17528R$color.home_screen_tile_last_edited_macro);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12076g;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12074e;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12075f;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12073d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r9.isCompleted() == false) goto L_0x002a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29335f(android.view.View r8, android.view.View r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r8 = "iconView"
            kotlin.jvm.internal.C13706o.m87929f(r9, r8)
            kotlin.jvm.internal.d0 r8 = new kotlin.jvm.internal.d0
            r8.<init>()
            com.arlosoft.macrodroid.macro.n r9 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            android.app.Activity r0 = r7.f12071b
            long r0 = com.arlosoft.macrodroid.settings.C5163j2.m20287w0(r0)
            com.arlosoft.macrodroid.macro.Macro r9 = r9.mo29682Q(r0)
            r8.element = r9
            if (r9 == 0) goto L_0x002a
            r0 = r9
            com.arlosoft.macrodroid.macro.Macro r0 = (com.arlosoft.macrodroid.macro.Macro) r0
            boolean r9 = r9.isCompleted()
            if (r9 != 0) goto L_0x003a
        L_0x002a:
            com.arlosoft.macrodroid.macro.n r9 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            android.app.Activity r0 = r7.f12071b
            long r0 = com.arlosoft.macrodroid.settings.C5163j2.m20263t0(r0)
            com.arlosoft.macrodroid.macro.Macro r9 = r9.mo29682Q(r0)
            r8.element = r9
        L_0x003a:
            T r9 = r8.element
            if (r9 == 0) goto L_0x00a8
            com.arlosoft.macrodroid.macro.Macro r9 = (com.arlosoft.macrodroid.macro.Macro) r9
            java.lang.String r3 = r9.getCategory()
            com.arlosoft.macrodroid.app.MacroDroidApplication$a r9 = com.arlosoft.macrodroid.app.MacroDroidApplication.f9883I
            com.arlosoft.macrodroid.app.MacroDroidApplication r9 = r9.mo27303b()
            java.lang.String r0 = "Categories"
            e1.a r9 = r9.mo27293q(r0)
            java.lang.Class<com.arlosoft.macrodroid.categories.CategoryList> r0 = com.arlosoft.macrodroid.categories.CategoryList.class
            java.lang.String r1 = "CategoryList"
            java.lang.Object r0 = r9.mo37133c(r1, r0)
            com.arlosoft.macrodroid.categories.CategoryList r0 = (com.arlosoft.macrodroid.categories.CategoryList) r0
            if (r0 == 0) goto L_0x009a
            java.lang.String r1 = "categoryName"
            kotlin.jvm.internal.C13706o.m87928e(r3, r1)
            com.arlosoft.macrodroid.categories.Category r0 = r0.getCategoryByName(r3)
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isLocked()
            if (r0 == 0) goto L_0x008c
            com.arlosoft.macrodroid.utils.o r0 = new com.arlosoft.macrodroid.utils.o
            r1 = 0
            r0.<init>(r9, r1)
            android.app.Activity r1 = r7.f12071b
            r9 = 2131953149(0x7f1305fd, float:1.954276E38)
            java.lang.String r2 = r1.getString(r9)
            android.app.Activity r9 = r7.f12071b
            java.lang.String r4 = com.arlosoft.macrodroid.settings.C5163j2.m19992J0(r9)
            r5 = 0
            com.arlosoft.macrodroid.homescreen.tiles.o$a r6 = new com.arlosoft.macrodroid.homescreen.tiles.o$a
            r6.<init>(r7, r8)
            r0.mo32449u(r1, r2, r3, r4, r5, r6)
            goto L_0x00b9
        L_0x008c:
            com.arlosoft.macrodroid.homescreen.j r9 = r7.f12072c
            T r8 = r8.element
            com.arlosoft.macrodroid.macro.Macro r8 = (com.arlosoft.macrodroid.macro.Macro) r8
            int r8 = r8.getId()
            r9.mo29281w1(r8)
            goto L_0x00b9
        L_0x009a:
            com.arlosoft.macrodroid.homescreen.j r9 = r7.f12072c
            T r8 = r8.element
            com.arlosoft.macrodroid.macro.Macro r8 = (com.arlosoft.macrodroid.macro.Macro) r8
            int r8 = r8.getId()
            r9.mo29281w1(r8)
            goto L_0x00b9
        L_0x00a8:
            android.app.Activity r8 = r7.f12071b
            android.content.Context r8 = r8.getApplicationContext()
            r9 = 2131954025(0x7f130969, float:1.9544538E38)
            r0 = 1
            android.widget.Toast r8 = p319lc.C15626c.makeText(r8, r9, r0)
            r8.show()
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.homescreen.tiles.C4813o.mo29335f(android.view.View, android.view.View):void");
    }
}
