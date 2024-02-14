package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.settings.C5163j2;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p198z1.C10433a;
import p297ja.C13339u;
import p370qa.C16254a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.k */
/* compiled from: ForumTile.kt */
public final class C4807k extends C10433a {

    /* renamed from: g */
    public static final C4808a f12051g = new C4808a((C13695i) null);

    /* renamed from: b */
    private final Activity f12052b;

    /* renamed from: c */
    private final String f12053c;

    /* renamed from: d */
    private final int f12054d = C17530R$drawable.ic_forum_white_48dp;

    /* renamed from: e */
    private final long f12055e = 5;

    /* renamed from: f */
    private final int f12056f;

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.k$a */
    /* compiled from: ForumTile.kt */
    public static final class C4808a {
        private C4808a() {
        }

        public /* synthetic */ C4808a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.homescreen.tiles.k$b */
    /* compiled from: ForumTile.kt */
    static final class C4809b extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ C4807k this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4809b(C4807k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        public final void invoke() {
            this.this$0.m18596k("https://www.macrodroidforum.com", true);
        }
    }

    public C4807k(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12052b = activity;
        String string = activity.getString(C17541R$string.forum);
        C13706o.m87928e(string, "activity.getString(R.string.forum)");
        this.f12053c = string;
        this.f12056f = ContextCompat.getColor(activity, C17528R$color.forum_primary);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(1:2)|3|4|5|6|7|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        r6.f12052b.startActivity(new android.content.Intent(r6.f12052b, com.arlosoft.macrodroid.ForumActivity.class));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x005d */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m18596k(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            r0.<init>()
            android.app.Activity r1 = r6.f12052b
            r2 = 2131099942(0x7f060126, float:1.7812251E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setToolbarColor(r1)
            r0.addDefaultShareMenuItem()
            r1 = 0
            r0.setShowTitle(r1)
            android.app.Activity r1 = r6.f12052b
            r2 = 17432576(0x10a0000, float:2.5346597E-38)
            r3 = 17432577(0x10a0001, float:2.53466E-38)
            r0.setExitAnimations(r1, r2, r3)
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r8 == 0) goto L_0x004a
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r2 = "https://www.tapatalk.com/groups/macrodroid"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r8.<init>(r1, r2)
            r2 = 100
            android.app.Activity r3 = r6.f12052b
            r4 = 134217728(0x8000000, float:3.85186E-34)
            int r5 = com.arlosoft.macrodroid.utils.C6368b1.f14959b
            r4 = r4 | r5
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r3, r2, r8, r4)
            android.app.Activity r2 = r6.f12052b
            r3 = 2131954529(0x7f130b61, float:1.954556E38)
            java.lang.String r2 = r2.getString(r3)
            r0.addMenuItem(r2, r8)
        L_0x004a:
            androidx.browser.customtabs.CustomTabsIntent r8 = r0.build()
            java.lang.String r0 = "builder.build()"
            kotlin.jvm.internal.C13706o.m87928e(r8, r0)
            android.app.Activity r0 = r6.f12052b     // Catch:{ all -> 0x005d }
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x005d }
            r8.launchUrl(r0, r2)     // Catch:{ all -> 0x005d }
            goto L_0x007a
        L_0x005d:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ all -> 0x006c }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x006c }
            r8.<init>(r1, r7)     // Catch:{ all -> 0x006c }
            android.app.Activity r7 = r6.f12052b     // Catch:{ all -> 0x006c }
            r7.startActivity(r8)     // Catch:{ all -> 0x006c }
            goto L_0x007a
        L_0x006c:
            android.app.Activity r7 = r6.f12052b
            android.content.Intent r8 = new android.content.Intent
            android.app.Activity r0 = r6.f12052b
            java.lang.Class<com.arlosoft.macrodroid.ForumActivity> r1 = com.arlosoft.macrodroid.ForumActivity.class
            r8.<init>(r0, r1)
            r7.startActivity(r8)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.homescreen.tiles.C4807k.m18596k(java.lang.String, boolean):void");
    }

    /* renamed from: l */
    private final void m18597l(C16254a<C13339u> aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this.f12052b, C17542R$style.Theme_App_Dialog_Template);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_forum);
        appCompatDialog.setTitle((int) C17541R$string.forum);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.warningText);
        C13706o.m87926c(findViewById3);
        Linkify.addLinks((TextView) findViewById3, 1);
        ((Button) findViewById).setOnClickListener(new C4806j(this, aVar, appCompatDialog));
        ((Button) findViewById2).setOnClickListener(new C4805i(appCompatDialog));
        C4656c.m18114c(appCompatDialog, 0);
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m18598m(C4807k kVar, C16254a aVar, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(kVar, "this$0");
        C13706o.m87929f(aVar, "$acceptedCallback");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C5163j2.m20072U3(kVar.f12052b, true);
        aVar.invoke();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m18599n(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12056f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12054d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12055e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12053c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        if (C5163j2.m20183j0(this.f12052b)) {
            m18596k("https://www.macrodroidforum.com", true);
            return;
        }
        C5163j2.m20093X3(this.f12052b, true);
        m18597l(new C4809b(this));
    }
}
