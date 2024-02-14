package com.arlosoft.macrodroid.logging.systemlog.macrofilter;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4004d1;
import com.arlosoft.macrodroid.logging.systemlog.C4876a;
import com.arlosoft.macrodroid.logging.systemlog.LogFilter;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p087f2.C12217a;
import p087f2.C12218b;
import p087f2.C12219c;
import p087f2.C12220d;
import p087f2.C12221e;
import p087f2.C12222f;
import p087f2.C12223g;
import p087f2.C12224h;
import p087f2.C12225i;
import p087f2.C12226j;
import p087f2.C12227k;
import p093g2.C7328a;
import p139o1.C8003h;
import p256eu.davidea.flexibleadapter.common.SmoothScrollLinearLayoutManager;
import p286i9.C12454b;
import p296j9.C13309a;
import p316l9.C15608g;
import p316l9.C15609h;
import p319lc.C15626c;

/* compiled from: MacroLogFilterActivity.kt */
public final class MacroLogFilterActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    private String f12299A = "";

    /* renamed from: B */
    public C7328a f12300B;

    /* renamed from: C */
    private C12454b<MacroFilterCategoryHeader> f12301C;

    /* renamed from: D */
    private MenuItem f12302D;

    /* renamed from: E */
    private MenuItem f12303E;

    /* renamed from: F */
    private final HashSet<String> f12304F = new HashSet<>();

    /* renamed from: G */
    private final HashSet<String> f12305G = new HashSet<>();

    /* renamed from: H */
    private boolean f12306H = true;

    /* renamed from: I */
    private CategoryList f12307I;

    /* renamed from: J */
    private boolean f12308J;

    /* renamed from: K */
    public Map<Integer, View> f12309K = new LinkedHashMap();

    /* renamed from: s */
    private C8003h f12310s;

    /* renamed from: z */
    private final C4876a f12311z = new C4876a(this);

    /* renamed from: c2 */
    private final boolean m18920c2() {
        C12454b<MacroFilterCategoryHeader> bVar = this.f12301C;
        if (bVar == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        }
        List<MacroFilterCategoryHeader> U0 = bVar.mo68869U0();
        C13706o.m87928e(U0, "adapter.currentItems");
        for (C15608g next : U0) {
            if (next instanceof MacroFilterCategoryHeader) {
                MacroFilterCategoryHeader macroFilterCategoryHeader = (MacroFilterCategoryHeader) next;
                macroFilterCategoryHeader.mo29474z();
                if (macroFilterCategoryHeader.mo74943c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d2 */
    private final String m18921d2(String str) {
        String d = C4004d1.m15682d(str, 24);
        C13706o.m87928e(d, "calculateSerialCode(password, 24)");
        return d;
    }

    /* renamed from: f2 */
    private final void m18922f2(MacroFilterCategoryHeader macroFilterCategoryHeader) {
        C12454b<MacroFilterCategoryHeader> bVar = this.f12301C;
        C12454b<MacroFilterCategoryHeader> bVar2 = null;
        if (bVar == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        }
        int b1 = bVar.mo68881b1(macroFilterCategoryHeader);
        CategoryList categoryList = this.f12307I;
        if (categoryList == null) {
            C13706o.m87945v("categoryList");
            categoryList = null;
        }
        Category categoryByName = categoryList.getCategoryByName(macroFilterCategoryHeader.mo29474z().getName());
        boolean z = true;
        if (!macroFilterCategoryHeader.mo74943c()) {
            if (categoryByName == null || !categoryByName.isLocked() || this.f12304F.contains(categoryByName.getName())) {
                z = false;
            }
            if (z) {
                String string = getString(C17541R$string.unlock_category);
                C13706o.m87928e(string, "getString(R.string.unlock_category)");
                m18930n2(string, C5163j2.m19992J0(this), b1);
                return;
            }
            C12454b<MacroFilterCategoryHeader> bVar3 = this.f12301C;
            if (bVar3 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = bVar3;
            }
            bVar2.mo68856J0(b1);
            return;
        }
        C12454b<MacroFilterCategoryHeader> bVar4 = this.f12301C;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
        } else {
            bVar2 = bVar4;
        }
        bVar2.mo68845B0(b1, true);
        if (this.f12305G.contains(macroFilterCategoryHeader.mo29474z().getName())) {
            this.f12305G.remove(macroFilterCategoryHeader.mo29474z().getName());
        }
    }

    /* renamed from: g2 */
    private final void m18923g2() {
        int i;
        LogFilter f2 = C5163j2.m20153f2(this);
        boolean z = false;
        this.f12308J = f2.getDisabledMacroIds().size() == 0;
        CategoryList categoryList = null;
        C12454b<MacroFilterCategoryHeader> bVar = new C12454b<>(new ArrayList(), (Object) null, true);
        this.f12301C = bVar;
        bVar.mo68900o0(C12224h.f58715a);
        C12454b<MacroFilterCategoryHeader> bVar2 = this.f12301C;
        if (bVar2 == null) {
            C13706o.m87945v("adapter");
            bVar2 = null;
        }
        bVar2.mo68875Y1(Integer.MAX_VALUE);
        C12454b<MacroFilterCategoryHeader> bVar3 = this.f12301C;
        if (bVar3 == null) {
            C13706o.m87945v("adapter");
            bVar3 = null;
        }
        bVar3.mo68877Z1(false);
        C8003h hVar = this.f12310s;
        if (hVar == null) {
            C13706o.m87945v("binding");
            hVar = null;
        }
        hVar.f19277d.setLayoutManager(new SmoothScrollLinearLayoutManager(this));
        C8003h hVar2 = this.f12310s;
        if (hVar2 == null) {
            C13706o.m87945v("binding");
            hVar2 = null;
        }
        RecyclerView recyclerView = hVar2.f19277d;
        C12454b<MacroFilterCategoryHeader> bVar4 = this.f12301C;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
            bVar4 = null;
        }
        recyclerView.setAdapter(bVar4);
        C8003h hVar3 = this.f12310s;
        if (hVar3 == null) {
            C13706o.m87945v("binding");
            hVar3 = null;
        }
        hVar3.f19277d.setHasFixedSize(true);
        C8003h hVar4 = this.f12310s;
        if (hVar4 == null) {
            C13706o.m87945v("binding");
            hVar4 = null;
        }
        hVar4.f19277d.addItemDecoration(new C13309a(this).mo70136a(C17535R$layout.macro_list_row, 0, 3, 0, 0).mo70142i(true).mo70141h(false).mo70143j(0));
        HashMap<String, List<Macro>> G = C4934n.m18998M().mo29677G();
        ArrayList arrayList = new ArrayList();
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this));
        instance.setStrength(0);
        ArrayList arrayList2 = new ArrayList(G.keySet());
        C13622x.m87781y(arrayList2, new C12227k(instance));
        CategoryList categoryList2 = (CategoryList) MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList2 == null) {
            categoryList2 = new CategoryList(new ArrayList());
        }
        this.f12307I = categoryList2;
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        int i3 = 100000;
        int i4 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            CategoryList categoryList3 = this.f12307I;
            if (categoryList3 == null) {
                C13706o.m87945v("categoryList");
                categoryList3 = categoryList;
            }
            C13706o.m87928e(str, "categoryName");
            Category categoryByName = categoryList3.getCategoryByName(str);
            if (categoryByName == null) {
                categoryByName = new Category(str, ContextCompat.getColor(this, C17528R$color.default_macro_tile_color), z, z);
            }
            int i5 = i3 + 1;
            MacroFilterCategoryHeader macroFilterCategoryHeader = r12;
            MacroFilterCategoryHeader macroFilterCategoryHeader2 = new MacroFilterCategoryHeader(categoryByName, i3, true, false, false, new C12221e(this), (View.OnLongClickListener) null, mo29487e2());
            List list = G.get(str);
            if (list != null) {
                C13622x.m87781y(list, new C12225i(instance));
            }
            C13706o.m87926c(list);
            Iterator it2 = list.iterator();
            while (true) {
                i = i4;
                if (!it2.hasNext()) {
                    break;
                }
                Macro macro = (Macro) it2.next();
                i4 = i + 1;
                macroFilterCategoryHeader.mo74947w(new MacroFilterListItem(macroFilterCategoryHeader, i, macro, !f2.getDisabledMacroIds().contains(Long.valueOf(macro.getGUID())), new C12222f(this)));
                i2++;
            }
            MacroFilterCategoryHeader macroFilterCategoryHeader3 = macroFilterCategoryHeader;
            if (macroFilterCategoryHeader3.mo74948x() > 0) {
                arrayList.add(macroFilterCategoryHeader3);
            }
            i4 = i;
            i3 = i5;
            z = false;
            categoryList = null;
        }
        C12454b<MacroFilterCategoryHeader> bVar5 = this.f12301C;
        if (bVar5 == null) {
            C13706o.m87945v("adapter");
            bVar5 = null;
        }
        bVar5.mo68889f2(arrayList);
        C8003h hVar5 = this.f12310s;
        if (hVar5 == null) {
            C13706o.m87945v("binding");
            hVar5 = null;
        }
        LinearLayout linearLayout = hVar5.f19275b;
        C13706o.m87928e(linearLayout, "binding.emptyView");
        linearLayout.setVisibility(arrayList.isEmpty() ? 0 : 8);
        if (i2 < 6) {
            this.f12306H = false;
        }
        C12454b<MacroFilterCategoryHeader> bVar6 = this.f12301C;
        if (bVar6 == null) {
            C13706o.m87945v("adapter");
            bVar6 = null;
        }
        for (C15609h next : bVar6.mo68882c1()) {
            if (!(next instanceof MacroFilterCategoryHeader) || ((MacroFilterCategoryHeader) next).mo29474z().isLocked()) {
                C12454b<MacroFilterCategoryHeader> bVar7 = this.f12301C;
                if (bVar7 == null) {
                    C13706o.m87945v("adapter");
                    bVar7 = null;
                }
                C12454b<MacroFilterCategoryHeader> bVar8 = this.f12301C;
                if (bVar8 == null) {
                    C13706o.m87945v("adapter");
                    bVar8 = null;
                }
                bVar7.mo68843A0(bVar8.mo68881b1(next));
            } else {
                C12454b<MacroFilterCategoryHeader> bVar9 = this.f12301C;
                if (bVar9 == null) {
                    C13706o.m87945v("adapter");
                    bVar9 = null;
                }
                bVar9.mo68861M0(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final boolean m18924h2(View view, int i) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final int m18925i2(Collator collator, String str, String str2) {
        return collator.compare(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m18926j2(MacroLogFilterActivity macroLogFilterActivity, MacroFilterCategoryHeader macroFilterCategoryHeader) {
        C13706o.m87929f(macroLogFilterActivity, "this$0");
        C13706o.m87928e(macroFilterCategoryHeader, "it");
        macroLogFilterActivity.m18922f2(macroFilterCategoryHeader);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final int m18927k2(Collator collator, Macro macro, Macro macro2) {
        return collator.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m18928l2(MacroLogFilterActivity macroLogFilterActivity, Long l, boolean z) {
        C13706o.m87929f(macroLogFilterActivity, "this$0");
        C13706o.m87928e(l, "id");
        macroLogFilterActivity.m18929m2(l.longValue(), z);
    }

    /* renamed from: m2 */
    private final void m18929m2(long j, boolean z) {
        List list;
        LogFilter f2 = C5163j2.m20153f2(this);
        if (z) {
            list = C13566b0.m87439n0(C13566b0.m87405I0(f2.getDisabledMacroIds()), Long.valueOf(j));
        } else {
            list = C13566b0.m87443r0(C13566b0.m87405I0(f2.getDisabledMacroIds()), Long.valueOf(j));
        }
        C13706o.m87928e(f2, "logFilter");
        C5163j2.m20081V5(this, LogFilter.copy$default(f2, 0, false, false, false, list, (List) null, 47, (Object) null));
    }

    /* renamed from: n2 */
    private final void m18930n2(String str, String str2, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.passwordEntry);
        Button button = (Button) inflate.findViewById(C17532R$id.okButton);
        Button button2 = (Button) inflate.findViewById(C17532R$id.cancelButton);
        builder.setTitle((CharSequence) str);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "alert.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
        Window window2 = create.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(5);
        }
        create.show();
        button.setOnClickListener(new C12219c(this, editText, str2, i, create));
        button2.setOnClickListener(new C12217a(create));
        editText.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m18931o2(MacroLogFilterActivity macroLogFilterActivity, EditText editText, String str, int i, Dialog dialog, View view) {
        C13706o.m87929f(macroLogFilterActivity, "this$0");
        C13706o.m87929f(dialog, "$dialog");
        if (C13706o.m87924a(macroLogFilterActivity.m18921d2(editText.getText().toString()), str)) {
            C12454b<MacroFilterCategoryHeader> bVar = macroLogFilterActivity.f12301C;
            if (bVar == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            }
            bVar.mo68856J0(i);
            dialog.dismiss();
            return;
        }
        C15626c.makeText(macroLogFilterActivity, C17541R$string.invalid_password, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m18932p2(Dialog dialog, View view) {
        C13706o.m87929f(dialog, "$dialog");
        dialog.cancel();
    }

    /* renamed from: q2 */
    private final void m18933q2(boolean z) {
        LogFilter f2 = C5163j2.m20153f2(this);
        C13706o.m87928e(f2, "getSystemLogFilter(this)");
        LogFilter copy$default = LogFilter.copy$default(f2, 0, false, false, false, (List) null, (List) null, 63, (Object) null);
        if (z) {
            List<Macro> z2 = C4934n.m18998M().mo29710z();
            C13706o.m87928e(z2, "getInstance().allCompletedMacros");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(z2, 10));
            for (Macro guid : z2) {
                arrayList.add(Long.valueOf(guid.getGUID()));
            }
            C5163j2.m20081V5(this, LogFilter.copy$default(copy$default, 0, false, false, false, arrayList, (List) null, 47, (Object) null));
        } else {
            C5163j2.m20081V5(this, LogFilter.copy$default(copy$default, 0, false, false, false, C13614t.m87748j(), (List) null, 47, (Object) null));
        }
        m18934r2();
    }

    /* renamed from: r2 */
    private final void m18934r2() {
        boolean z;
        C12454b<MacroFilterCategoryHeader> bVar;
        boolean z2;
        Category category;
        C12454b<MacroFilterCategoryHeader> bVar2 = this.f12301C;
        if (bVar2 == null) {
            C13706o.m87945v("adapter");
            bVar2 = null;
        }
        List<C15609h> c1 = bVar2.mo68882c1();
        C13706o.m87928e(c1, "adapter.headerItems");
        ArrayList<C15609h> arrayList = new ArrayList<>();
        Iterator<T> it = c1.iterator();
        while (true) {
            boolean z3 = true;
            z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C15609h hVar = (C15609h) next;
            if (!(hVar instanceof MacroFilterCategoryHeader) || !((MacroFilterCategoryHeader) hVar).mo74943c()) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (C15609h hVar2 : arrayList) {
            C13706o.m87927d(hVar2, "null cannot be cast to non-null type com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroFilterCategoryHeader");
            arrayList2.add(((MacroFilterCategoryHeader) hVar2).mo29474z().getName());
        }
        LogFilter f2 = C5163j2.m20153f2(this);
        HashMap<String, List<Macro>> G = C4934n.m18998M().mo29677G();
        ArrayList arrayList3 = new ArrayList();
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this));
        instance.setStrength(0);
        ArrayList arrayList4 = new ArrayList(G.keySet());
        C13622x.m87781y(arrayList4, new C12218b(instance));
        CategoryList categoryList = (CategoryList) MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList == null) {
            categoryList = new CategoryList(new ArrayList());
        }
        this.f12307I = categoryList;
        Iterator it2 = arrayList4.iterator();
        int i = 0;
        int i2 = 100000;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            CategoryList categoryList2 = this.f12307I;
            if (categoryList2 == null) {
                C13706o.m87945v("categoryList");
                categoryList2 = null;
            }
            C13706o.m87928e(str, "categoryName");
            Category categoryByName = categoryList2.getCategoryByName(str);
            boolean contains = arrayList2.contains(str);
            if (categoryByName == null) {
                category = new Category(str, ContextCompat.getColor(this, C17528R$color.default_macro_tile_color), contains, z);
            } else {
                category = Category.copy$default(categoryByName, (String) null, 0, contains, false, 11, (Object) null);
            }
            int i3 = i2 + 1;
            MacroFilterCategoryHeader macroFilterCategoryHeader = new MacroFilterCategoryHeader(category, i2, true, false, false, new C12220d(this), (View.OnLongClickListener) null, mo29487e2());
            List<Macro> list = G.get(str);
            if (list != null) {
                C13622x.m87781y(list, new C12226j(instance));
            }
            C13706o.m87926c(list);
            int i4 = i;
            for (Macro macro : list) {
                macroFilterCategoryHeader.mo74947w(new MacroFilterListItem(macroFilterCategoryHeader, i4, macro, !f2.getDisabledMacroIds().contains(Long.valueOf(macro.getGUID())), new C12223g(this)));
                i4++;
            }
            if (macroFilterCategoryHeader.mo74948x() > 0) {
                arrayList3.add(macroFilterCategoryHeader);
            }
            i = i4;
            i2 = i3;
            z = false;
        }
        C12454b<MacroFilterCategoryHeader> bVar3 = this.f12301C;
        if (bVar3 == null) {
            C13706o.m87945v("adapter");
            z2 = false;
            bVar = null;
        } else {
            bVar = bVar3;
            z2 = false;
        }
        bVar.mo68891g2(arrayList3, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m18935s2(MacroLogFilterActivity macroLogFilterActivity, Long l, boolean z) {
        C13706o.m87929f(macroLogFilterActivity, "this$0");
        C13706o.m87928e(l, "id");
        macroLogFilterActivity.m18929m2(l.longValue(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final int m18936t2(Collator collator, String str, String str2) {
        return collator.compare(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m18937u2(MacroLogFilterActivity macroLogFilterActivity, MacroFilterCategoryHeader macroFilterCategoryHeader) {
        C13706o.m87929f(macroLogFilterActivity, "this$0");
        C13706o.m87928e(macroFilterCategoryHeader, "it");
        macroLogFilterActivity.m18922f2(macroFilterCategoryHeader);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final int m18938v2(Collator collator, Macro macro, Macro macro2) {
        return collator.compare(macro.getName(), macro2.getName());
    }

    /* renamed from: e2 */
    public final C7328a mo29487e2() {
        C7328a aVar = this.f12300B;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("headingColorMapper");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8003h c = C8003h.m33333c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f12310s = c;
        C8003h hVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8003h hVar2 = this.f12310s;
        if (hVar2 == null) {
            C13706o.m87945v("binding");
        } else {
            hVar = hVar2;
        }
        setSupportActionBar(hVar.f19278e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        m18923g2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.system_log_macro_filer_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_expand_collapse_categories);
        C13706o.m87928e(findItem, "menu.findItem(R.id.menu_…pand_collapse_categories)");
        this.f12302D = findItem;
        MenuItem findItem2 = menu.findItem(C17532R$id.toggle_filter);
        C13706o.m87928e(findItem2, "menu.findItem(R.id.toggle_filter)");
        this.f12303E = findItem2;
        boolean c2 = m18920c2();
        MenuItem menuItem = this.f12302D;
        MenuItem menuItem2 = null;
        if (menuItem == null) {
            C13706o.m87945v("expandCollapseMenuItem");
            menuItem = null;
        }
        menuItem.setIcon(c2 ? C17530R$drawable.unfold_less_horizontal : C17530R$drawable.unfold_more_horizontal);
        MenuItem menuItem3 = this.f12302D;
        if (menuItem3 == null) {
            C13706o.m87945v("expandCollapseMenuItem");
            menuItem3 = null;
        }
        menuItem3.setTitle(c2 ? C17541R$string.collapse_categories : C17541R$string.expand_categories);
        MenuItem menuItem4 = this.f12302D;
        if (menuItem4 == null) {
            C13706o.m87945v("expandCollapseMenuItem");
            menuItem4 = null;
        }
        menuItem4.setVisible(this.f12306H);
        if (C4934n.m18998M().mo29710z().isEmpty()) {
            MenuItem menuItem5 = this.f12303E;
            if (menuItem5 == null) {
                C13706o.m87945v("toggleFilter");
            } else {
                menuItem2 = menuItem5;
            }
            menuItem2.setVisible(false);
            return true;
        }
        MenuItem menuItem6 = this.f12303E;
        if (menuItem6 == null) {
            C13706o.m87945v("toggleFilter");
        } else {
            menuItem2 = menuItem6;
        }
        menuItem2.setIcon(this.f12308J ? C17530R$drawable.filter_minus : C17530R$drawable.filter_plus);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        boolean z = true;
        if (itemId != 16908332) {
            MenuItem menuItem2 = null;
            if (itemId == 2131363229) {
                if (m18920c2()) {
                    C12454b<MacroFilterCategoryHeader> bVar = this.f12301C;
                    if (bVar == null) {
                        C13706o.m87945v("adapter");
                        bVar = null;
                    }
                    int itemCount = bVar.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        C12454b<MacroFilterCategoryHeader> bVar2 = this.f12301C;
                        if (bVar2 == null) {
                            C13706o.m87945v("adapter");
                            bVar2 = null;
                        }
                        bVar2.mo68843A0(i);
                    }
                    z = false;
                } else {
                    C12454b<MacroFilterCategoryHeader> bVar3 = this.f12301C;
                    if (bVar3 == null) {
                        C13706o.m87945v("adapter");
                        bVar3 = null;
                    }
                    bVar3.getItemCount();
                    C12454b<MacroFilterCategoryHeader> bVar4 = this.f12301C;
                    if (bVar4 == null) {
                        C13706o.m87945v("adapter");
                        bVar4 = null;
                    }
                    for (int itemCount2 = bVar4.getItemCount() - 1; -1 < itemCount2; itemCount2--) {
                        C12454b<MacroFilterCategoryHeader> bVar5 = this.f12301C;
                        if (bVar5 == null) {
                            C13706o.m87945v("adapter");
                            bVar5 = null;
                        }
                        MacroFilterCategoryHeader macroFilterCategoryHeader = bVar5.mo68869U0().get(itemCount2);
                        C13706o.m87928e(macroFilterCategoryHeader, "adapter.getCurrentItems()[i]");
                        C15608g gVar = macroFilterCategoryHeader;
                        if (gVar instanceof MacroFilterCategoryHeader) {
                            MacroFilterCategoryHeader macroFilterCategoryHeader2 = (MacroFilterCategoryHeader) gVar;
                            if (!macroFilterCategoryHeader2.mo29474z().isLocked() || this.f12304F.contains(macroFilterCategoryHeader2.mo29474z().getName())) {
                                C12454b<MacroFilterCategoryHeader> bVar6 = this.f12301C;
                                if (bVar6 == null) {
                                    C13706o.m87945v("adapter");
                                    bVar6 = null;
                                }
                                int b1 = bVar6.mo68881b1(gVar);
                                C12454b<MacroFilterCategoryHeader> bVar7 = this.f12301C;
                                if (bVar7 == null) {
                                    C13706o.m87945v("adapter");
                                    bVar7 = null;
                                }
                                bVar7.mo68856J0(b1);
                            }
                        }
                    }
                }
                C5163j2.m20172h5(this, z);
                MenuItem menuItem3 = this.f12302D;
                if (menuItem3 == null) {
                    C13706o.m87945v("expandCollapseMenuItem");
                    menuItem3 = null;
                }
                menuItem3.setTitle(z ? C17541R$string.collapse_categories : C17541R$string.expand_categories);
                MenuItem menuItem4 = this.f12302D;
                if (menuItem4 == null) {
                    C13706o.m87945v("expandCollapseMenuItem");
                } else {
                    menuItem2 = menuItem4;
                }
                menuItem2.setIcon(C5163j2.m20264t1(this) ? C17530R$drawable.unfold_less_horizontal : C17530R$drawable.unfold_more_horizontal);
            } else if (itemId == 2131364054) {
                m18933q2(this.f12308J);
                this.f12308J = !this.f12308J;
                MenuItem menuItem5 = this.f12303E;
                if (menuItem5 == null) {
                    C13706o.m87945v("toggleFilter");
                } else {
                    menuItem2 = menuItem5;
                }
                menuItem2.setIcon(this.f12308J ? C17530R$drawable.filter_minus : C17530R$drawable.filter_plus);
            }
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
