package com.arlosoft.macrodroid.logcat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.logcat.C4843b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.LogcatTrigger;
import com.arlosoft.macrodroid.triggers.activities.LogcatConfigActivity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p139o1.C8001g;
import p149q1.C8157f;

/* compiled from: LogcatMessageSelectActivity.kt */
public final class LogcatMessageSelectActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: F */
    public static final C4839a f12185F = new C4839a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C4843b f12186A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Macro f12187B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public LogcatTrigger f12188C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f12189D;

    /* renamed from: E */
    public Map<Integer, View> f12190E = new LinkedHashMap();

    /* renamed from: s */
    public C4848c f12191s;

    /* renamed from: z */
    private C8001g f12192z;

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatMessageSelectActivity$a */
    /* compiled from: LogcatMessageSelectActivity.kt */
    public static final class C4839a {
        private C4839a() {
        }

        public /* synthetic */ C4839a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo29379a(Context context, Macro macro, LogcatTrigger logcatTrigger, int i) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(macro, "macro");
            C13706o.m87929f(logcatTrigger, "trigger");
            Intent intent = new Intent(context, LogcatMessageSelectActivity.class);
            intent.putExtra("trigger", logcatTrigger);
            intent.putExtra(C8157f.ITEM_TYPE, macro);
            intent.putExtra("enabled_buffers", i);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatMessageSelectActivity$b */
    /* compiled from: LogcatMessageSelectActivity.kt */
    public static final class C4840b implements C4843b.C4844a {

        /* renamed from: a */
        final /* synthetic */ LogcatMessageSelectActivity f12193a;

        C4840b(LogcatMessageSelectActivity logcatMessageSelectActivity) {
            this.f12193a = logcatMessageSelectActivity;
        }

        /* renamed from: a */
        public void mo29380a(LogcatMessage logcatMessage) {
            C13706o.m87929f(logcatMessage, "logcatMessage");
            this.f12193a.mo29378V1().mo29390a();
            this.f12193a.finish();
            LogcatConfigActivity.C5820a aVar = LogcatConfigActivity.f13795B;
            LogcatMessageSelectActivity logcatMessageSelectActivity = this.f12193a;
            Macro T1 = logcatMessageSelectActivity.f12187B;
            if (T1 == null) {
                C13706o.m87945v("macro");
                T1 = null;
            }
            LogcatTrigger U1 = this.f12193a.f12188C;
            if (U1 == null) {
                C13706o.m87945v("trigger");
                U1 = null;
            }
            aVar.mo31701a(logcatMessageSelectActivity, T1, U1, logcatMessage, this.f12193a.f12189D);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatMessageSelectActivity$c */
    /* compiled from: LogcatMessageSelectActivity.kt */
    public static final class C4841c implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ LogcatMessageSelectActivity f12194a;

        C4841c(LogcatMessageSelectActivity logcatMessageSelectActivity) {
            this.f12194a = logcatMessageSelectActivity;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            C4843b R1 = this.f12194a.f12186A;
            if (R1 == null) {
                C13706o.m87945v("adapter");
                R1 = null;
            }
            R1.getFilter().filter(str);
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* renamed from: V1 */
    public final C4848c mo29378V1() {
        C4848c cVar = this.f12191s;
        if (cVar != null) {
            return cVar;
        }
        C13706o.m87945v("logcatMessageRepository");
        return null;
    }

    public void onBackPressed() {
        Macro macro;
        LogcatTrigger logcatTrigger;
        mo29378V1().mo29390a();
        finish();
        LogcatConfigActivity.C5820a aVar = LogcatConfigActivity.f13795B;
        Macro macro2 = this.f12187B;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro = null;
        } else {
            macro = macro2;
        }
        LogcatTrigger logcatTrigger2 = this.f12188C;
        if (logcatTrigger2 == null) {
            C13706o.m87945v("trigger");
            logcatTrigger = null;
        } else {
            logcatTrigger = logcatTrigger2;
        }
        aVar.mo31701a(this, macro, logcatTrigger, (LogcatMessage) null, this.f12189D);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8001g c = C8001g.m33326c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f12192z = c;
        C4843b bVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        List<LogcatMessage> b = mo29378V1().mo29391b();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("trigger");
        C13706o.m87926c(parcelableExtra);
        this.f12188C = (LogcatTrigger) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra(C8157f.ITEM_TYPE);
        C13706o.m87926c(parcelableExtra2);
        this.f12187B = (Macro) parcelableExtra2;
        this.f12189D = getIntent().getIntExtra("enabled_buffers", 0);
        this.f12186A = new C4843b(b, new C4840b(this));
        C8001g gVar = this.f12192z;
        if (gVar == null) {
            C13706o.m87945v("binding");
            gVar = null;
        }
        RecyclerView recyclerView = gVar.f19270b;
        C4843b bVar2 = this.f12186A;
        if (bVar2 == null) {
            C13706o.m87945v("adapter");
        } else {
            bVar = bVar2;
        }
        recyclerView.setAdapter(bVar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.logcat_select_menu, menu);
        View actionView = menu.findItem(C17532R$id.menu_search).getActionView();
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(new C4841c(this));
        return true;
    }
}
