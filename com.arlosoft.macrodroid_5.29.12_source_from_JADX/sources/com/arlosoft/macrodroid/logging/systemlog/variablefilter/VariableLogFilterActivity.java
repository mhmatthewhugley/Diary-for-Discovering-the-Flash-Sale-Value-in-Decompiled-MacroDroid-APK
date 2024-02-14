package com.arlosoft.macrodroid.logging.systemlog.variablefilter;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.logging.systemlog.C4876a;
import com.arlosoft.macrodroid.logging.systemlog.LogFilter;
import com.arlosoft.macrodroid.logging.systemlog.variablefilter.C4907a;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p139o1.C8021q;

/* compiled from: VariableLogFilterActivity.kt */
public final class VariableLogFilterActivity extends MacroDroidBaseActivity {

    /* renamed from: A */
    private MenuItem f12333A;

    /* renamed from: B */
    private boolean f12334B;

    /* renamed from: C */
    public Map<Integer, View> f12335C = new LinkedHashMap();

    /* renamed from: o */
    private C8021q f12336o;

    /* renamed from: p */
    private final C4876a f12337p = new C4876a(this);

    /* renamed from: s */
    private String f12338s = "";

    /* renamed from: z */
    private C4907a f12339z;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.variablefilter.VariableLogFilterActivity$a */
    /* compiled from: VariableLogFilterActivity.kt */
    public static final class C4906a implements C4907a.C4908a {

        /* renamed from: a */
        final /* synthetic */ VariableLogFilterActivity f12340a;

        C4906a(VariableLogFilterActivity variableLogFilterActivity) {
            this.f12340a = variableLogFilterActivity;
        }

        /* renamed from: a */
        public void mo29498a(String str, boolean z) {
            C13706o.m87929f(str, "variableName");
            this.f12340a.m18961S1(str, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: o1.q} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18960R1() {
        /*
            r10 = this;
            com.arlosoft.macrodroid.common.u r0 = com.arlosoft.macrodroid.common.C4064u.m16048t()
            r1 = 1
            java.util.List r0 = r0.mo27993r(r1)
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = "binding.emptyView"
            java.lang.String r4 = "binding"
            r5 = 0
            if (r2 == 0) goto L_0x0028
            o1.q r0 = r10.f12336o
            if (r0 != 0) goto L_0x001c
            kotlin.jvm.internal.C13706o.m87945v(r4)
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            android.widget.LinearLayout r0 = r5.f19409c
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x00a7
        L_0x0028:
            o1.q r2 = r10.f12336o
            if (r2 != 0) goto L_0x0030
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r2 = r5
        L_0x0030:
            android.widget.LinearLayout r2 = r2.f19409c
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            r3 = 8
            r2.setVisibility(r3)
            com.arlosoft.macrodroid.logging.systemlog.LogFilter r2 = com.arlosoft.macrodroid.settings.C5163j2.m20153f2(r10)
            java.util.List r3 = r2.getDisabledVariableNames()
            boolean r3 = r3.isEmpty()
            r10.f12334B = r3
            java.lang.String r3 = "variablesList"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C13616u.m87774u(r0, r6)
            r3.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0083
            java.lang.Object r6 = r0.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r6 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r6
            com.arlosoft.macrodroid.logging.systemlog.variablefilter.c r7 = new com.arlosoft.macrodroid.logging.systemlog.variablefilter.c
            java.lang.String r8 = "it"
            kotlin.jvm.internal.C13706o.m87928e(r6, r8)
            java.util.List r8 = r2.getDisabledVariableNames()
            java.lang.String r9 = r6.getName()
            boolean r8 = r8.contains(r9)
            r8 = r8 ^ r1
            r7.<init>(r6, r8)
            r3.add(r7)
            goto L_0x005c
        L_0x0083:
            com.arlosoft.macrodroid.logging.systemlog.variablefilter.a r0 = new com.arlosoft.macrodroid.logging.systemlog.variablefilter.a
            com.arlosoft.macrodroid.logging.systemlog.variablefilter.VariableLogFilterActivity$a r1 = new com.arlosoft.macrodroid.logging.systemlog.variablefilter.VariableLogFilterActivity$a
            r1.<init>(r10)
            r0.<init>(r3, r1)
            r10.f12339z = r0
            o1.q r0 = r10.f12336o
            if (r0 != 0) goto L_0x0097
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r0 = r5
        L_0x0097:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f19410d
            com.arlosoft.macrodroid.logging.systemlog.variablefilter.a r1 = r10.f12339z
            if (r1 != 0) goto L_0x00a3
            java.lang.String r1 = "adapter"
            kotlin.jvm.internal.C13706o.m87945v(r1)
            goto L_0x00a4
        L_0x00a3:
            r5 = r1
        L_0x00a4:
            r0.setAdapter(r5)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.systemlog.variablefilter.VariableLogFilterActivity.m18960R1():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public final void m18961S1(String str, boolean z) {
        List list;
        LogFilter f2 = C5163j2.m20153f2(this);
        if (z) {
            list = C13566b0.m87439n0(C13566b0.m87405I0(f2.getDisabledVariableNames()), str);
        } else {
            list = C13566b0.m87443r0(C13566b0.m87405I0(f2.getDisabledVariableNames()), str);
        }
        List list2 = list;
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(true);
        C13706o.m87928e(r, "variablesList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(r, 10));
        for (MacroDroidVariable macroDroidVariable : r) {
            C13706o.m87928e(macroDroidVariable, "it");
            arrayList.add(new C4911c(macroDroidVariable, !list2.contains(macroDroidVariable.getName())));
        }
        C4907a aVar = this.f12339z;
        if (aVar == null) {
            C13706o.m87945v("adapter");
            aVar = null;
        }
        aVar.mo29501D(arrayList);
        C13706o.m87928e(f2, "logFilter");
        C5163j2.m20081V5(this, LogFilter.copy$default(f2, 0, false, false, false, (List) null, list2, 31, (Object) null));
    }

    /* renamed from: T1 */
    private final void m18962T1(boolean z) {
        LogFilter logFilter;
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(false);
        C13706o.m87928e(r, "variablesList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(r, 10));
        for (MacroDroidVariable name : r) {
            arrayList.add(name.getName());
        }
        LogFilter f2 = C5163j2.m20153f2(this);
        C13706o.m87928e(f2, "getSystemLogFilter(this)");
        LogFilter copy$default = LogFilter.copy$default(f2, 0, false, false, false, (List) null, (List) null, 63, (Object) null);
        if (z) {
            logFilter = LogFilter.copy$default(copy$default, 0, false, false, false, (List) null, arrayList, 31, (Object) null);
        } else {
            logFilter = LogFilter.copy$default(copy$default, 0, false, false, false, (List) null, C13614t.m87748j(), 31, (Object) null);
        }
        C5163j2.m20081V5(this, logFilter);
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(r, 10));
        for (MacroDroidVariable macroDroidVariable : r) {
            C13706o.m87928e(macroDroidVariable, "it");
            arrayList2.add(new C4911c(macroDroidVariable, !logFilter.getDisabledVariableNames().contains(macroDroidVariable.getName())));
        }
        C4907a aVar = this.f12339z;
        C4907a aVar2 = null;
        if (aVar == null) {
            C13706o.m87945v("adapter");
            aVar = null;
        }
        aVar.mo29501D(arrayList2);
        C4907a aVar3 = this.f12339z;
        if (aVar3 == null) {
            C13706o.m87945v("adapter");
        } else {
            aVar2 = aVar3;
        }
        aVar2.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8021q c = C8021q.m33396c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f12336o = c;
        C8021q qVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8021q qVar2 = this.f12336o;
        if (qVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            qVar = qVar2;
        }
        setSupportActionBar(qVar.f19411e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.system_log_variable_filer_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.toggle_filter);
        C13706o.m87928e(findItem, "menu.findItem(R.id.toggle_filter)");
        this.f12333A = findItem;
        MenuItem menuItem = null;
        if (C4064u.m16048t().mo27993r(false).isEmpty()) {
            MenuItem menuItem2 = this.f12333A;
            if (menuItem2 == null) {
                C13706o.m87945v("toggleFilter");
            } else {
                menuItem = menuItem2;
            }
            menuItem.setVisible(false);
            return true;
        }
        MenuItem menuItem3 = this.f12333A;
        if (menuItem3 == null) {
            C13706o.m87945v("toggleFilter");
        } else {
            menuItem = menuItem3;
        }
        menuItem.setIcon(this.f12334B ? C17530R$drawable.filter_minus : C17530R$drawable.filter_plus);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId != 2131364054) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m18962T1(this.f12334B);
            this.f12334B = !this.f12334B;
            MenuItem menuItem2 = this.f12333A;
            if (menuItem2 == null) {
                C13706o.m87945v("toggleFilter");
                menuItem2 = null;
            }
            menuItem2.setIcon(this.f12334B ? C17530R$drawable.filter_minus : C17530R$drawable.filter_plus);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m18960R1();
    }
}
