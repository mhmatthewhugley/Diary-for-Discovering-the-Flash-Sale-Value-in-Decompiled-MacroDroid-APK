package com.arlosoft.macrodroid.homescreen.quickrun;

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
import androidx.appcompat.widget.Toolbar;
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
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader;
import com.arlosoft.macrodroid.macrolist.MacroListItem;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p093g2.C7328a;
import p190x3.C10378a;
import p256eu.davidea.flexibleadapter.common.SmoothScrollLinearLayoutManager;
import p286i9.C12454b;
import p296j9.C13309a;
import p316l9.C15608g;
import p316l9.C15609h;
import p319lc.C15626c;

/* compiled from: QuickRunAddMacrosActivity.kt */
public final class QuickRunAddMacrosActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: G */
    public static final C4767a f11952G = new C4767a((C13695i) null);

    /* renamed from: A */
    private MenuItem f11953A;

    /* renamed from: B */
    private final HashSet<String> f11954B = new HashSet<>();

    /* renamed from: C */
    private final HashSet<String> f11955C = new HashSet<>();

    /* renamed from: D */
    private boolean f11956D = true;

    /* renamed from: E */
    private CategoryList f11957E;

    /* renamed from: F */
    public Map<Integer, View> f11958F = new LinkedHashMap();

    /* renamed from: s */
    public C7328a f11959s;

    /* renamed from: z */
    private C12454b<MacroListCategoryHeader> f11960z;

    /* renamed from: com.arlosoft.macrodroid.homescreen.quickrun.QuickRunAddMacrosActivity$a */
    /* compiled from: QuickRunAddMacrosActivity.kt */
    public static final class C4767a {
        private C4767a() {
        }

        public /* synthetic */ C4767a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: b2 */
    private final boolean m18472b2() {
        C12454b<MacroListCategoryHeader> bVar = this.f11960z;
        if (bVar == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        }
        List<MacroListCategoryHeader> U0 = bVar.mo68869U0();
        C13706o.m87928e(U0, "adapter.currentItems");
        for (C15608g next : U0) {
            if (next instanceof MacroListCategoryHeader) {
                MacroListCategoryHeader macroListCategoryHeader = (MacroListCategoryHeader) next;
                macroListCategoryHeader.mo29720z();
                if (macroListCategoryHeader.mo74943c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c2 */
    private final String m18473c2(String str) {
        String d = C4004d1.m15682d(str, 24);
        C13706o.m87928e(d, "calculateSerialCode(password, 24)");
        return d;
    }

    /* renamed from: e2 */
    private final void m18474e2(MacroListCategoryHeader macroListCategoryHeader) {
        C12454b<MacroListCategoryHeader> bVar = this.f11960z;
        C12454b<MacroListCategoryHeader> bVar2 = null;
        if (bVar == null) {
            C13706o.m87945v("adapter");
            bVar = null;
        }
        int b1 = bVar.mo68881b1(macroListCategoryHeader);
        CategoryList categoryList = this.f11957E;
        if (categoryList == null) {
            C13706o.m87945v("categoryList");
            categoryList = null;
        }
        Category categoryByName = categoryList.getCategoryByName(macroListCategoryHeader.mo29720z().getName());
        boolean z = true;
        if (!macroListCategoryHeader.mo74943c()) {
            if (categoryByName == null || !categoryByName.isLocked() || this.f11954B.contains(categoryByName.getName())) {
                z = false;
            }
            if (z) {
                String string = getString(C17541R$string.unlock_category);
                C13706o.m87928e(string, "getString(R.string.unlock_category)");
                m18484o2(string, macroListCategoryHeader.mo29720z().getName(), C5163j2.m19992J0(this), macroListCategoryHeader);
                return;
            }
            C12454b<MacroListCategoryHeader> bVar3 = this.f11960z;
            if (bVar3 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = bVar3;
            }
            bVar2.mo68856J0(b1);
            return;
        }
        C12454b<MacroListCategoryHeader> bVar4 = this.f11960z;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
        } else {
            bVar2 = bVar4;
        }
        bVar2.mo68845B0(b1, true);
        if (this.f11955C.contains(macroListCategoryHeader.mo29720z().getName())) {
            this.f11955C.remove(macroListCategoryHeader.mo29720z().getName());
        }
    }

    /* renamed from: f2 */
    private final void m18475f2() {
        C12454b<MacroListCategoryHeader> bVar;
        List<Macro> list;
        CategoryList categoryList = null;
        C12454b<MacroListCategoryHeader> bVar2 = new C12454b<>(new ArrayList(), (Object) null, true);
        this.f11960z = bVar2;
        bVar2.mo68900o0(C4780h.f11983a);
        C12454b<MacroListCategoryHeader> bVar3 = this.f11960z;
        if (bVar3 == null) {
            C13706o.m87945v("adapter");
            bVar3 = null;
        }
        bVar3.mo68875Y1(Integer.MAX_VALUE);
        C12454b<MacroListCategoryHeader> bVar4 = this.f11960z;
        if (bVar4 == null) {
            C13706o.m87945v("adapter");
            bVar4 = null;
        }
        bVar4.mo68877Z1(true);
        List<Long> u1 = C5163j2.m20272u1(this);
        int i = C17532R$id.recyclerView;
        ((RecyclerView) mo29302a2(i)).setLayoutManager(new SmoothScrollLinearLayoutManager(this));
        RecyclerView recyclerView = (RecyclerView) mo29302a2(i);
        C12454b<MacroListCategoryHeader> bVar5 = this.f11960z;
        if (bVar5 == null) {
            C13706o.m87945v("adapter");
            bVar5 = null;
        }
        recyclerView.setAdapter(bVar5);
        ((RecyclerView) mo29302a2(i)).setHasFixedSize(true);
        boolean z = false;
        ((RecyclerView) mo29302a2(i)).addItemDecoration(new C13309a(this).mo70136a(C17535R$layout.macro_list_row, 0, 3, 0, 0).mo70142i(true).mo70141h(false).mo70143j(0));
        HashMap<String, List<Macro>> G = C4934n.m18998M().mo29677G();
        ArrayList arrayList = new ArrayList();
        Collator instance = Collator.getInstance(C5163j2.m19963F0(this));
        instance.setStrength(0);
        ArrayList arrayList2 = new ArrayList(G.keySet());
        C13622x.m87781y(arrayList2, new C4782j(instance));
        CategoryList categoryList2 = (CategoryList) MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList2 == null) {
            categoryList2 = new CategoryList(new ArrayList());
        }
        this.f11957E = categoryList2;
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        int i3 = 100000;
        int i4 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            CategoryList categoryList3 = this.f11957E;
            if (categoryList3 == null) {
                C13706o.m87945v("categoryList");
                categoryList3 = categoryList;
            }
            C13706o.m87928e(str, "categoryName");
            Category categoryByName = categoryList3.getCategoryByName(str);
            if (categoryByName == null) {
                categoryByName = new Category(str, ContextCompat.getColor(this, C17528R$color.default_macro_tile_color), z, z);
            }
            Category category = categoryByName;
            int i5 = i3 + 1;
            MacroListCategoryHeader macroListCategoryHeader = r11;
            MacroListCategoryHeader macroListCategoryHeader2 = new MacroListCategoryHeader(category, i3, true, false, false, new C4778f(this), (View.OnLongClickListener) null, mo29303d2());
            List list2 = G.get(str);
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object next : list2) {
                    if (!u1.contains(Long.valueOf(((Macro) next).getGUID()))) {
                        arrayList3.add(next);
                    }
                }
                list = C13566b0.m87405I0(arrayList3);
            } else {
                list = null;
            }
            if (list != null) {
                C13622x.m87781y(list, new C4781i(instance));
            }
            C13706o.m87926c(list);
            int i6 = i4;
            int i7 = 0;
            for (Macro macro : list) {
                int i8 = i7 + 1;
                int i9 = i6 + 1;
                boolean z2 = i7 == list.size() + -1;
                C4776d dVar = r7;
                C4776d dVar2 = new C4776d(this, macro);
                macroListCategoryHeader.mo74947w(new MacroListItem(macroListCategoryHeader, i6, macro, category, 0, false, 0, false, false, z2, dVar, C4777e.f11980a, C4779g.f11982a, false, mo29303d2(), false, this.f11954B));
                i2++;
                i7 = i8;
                i6 = i9;
            }
            MacroListCategoryHeader macroListCategoryHeader3 = macroListCategoryHeader;
            if (macroListCategoryHeader3.mo74948x() > 0) {
                arrayList.add(macroListCategoryHeader3);
            }
            i4 = i6;
            i3 = i5;
            categoryList = null;
            z = false;
        }
        C12454b<MacroListCategoryHeader> bVar6 = this.f11960z;
        if (bVar6 == null) {
            C13706o.m87945v("adapter");
            bVar6 = null;
        }
        bVar6.mo68889f2(arrayList);
        LinearLayout linearLayout = (LinearLayout) mo29302a2(C17532R$id.emptyView);
        C13706o.m87928e(linearLayout, "emptyView");
        linearLayout.setVisibility(arrayList.isEmpty() ? 0 : 8);
        if (i2 < 6) {
            this.f11956D = false;
            C12454b<MacroListCategoryHeader> bVar7 = this.f11960z;
            if (bVar7 == null) {
                C13706o.m87945v("adapter");
                bVar7 = null;
            }
            for (C15609h next2 : bVar7.mo68882c1()) {
                if (!(next2 instanceof MacroListCategoryHeader) || ((MacroListCategoryHeader) next2).mo29720z().isLocked()) {
                    C12454b<MacroListCategoryHeader> bVar8 = this.f11960z;
                    if (bVar8 == null) {
                        C13706o.m87945v("adapter");
                        bVar8 = null;
                    }
                    C12454b<MacroListCategoryHeader> bVar9 = this.f11960z;
                    if (bVar9 == null) {
                        C13706o.m87945v("adapter");
                        bVar9 = null;
                    }
                    bVar8.mo68843A0(bVar9.mo68881b1(next2));
                } else {
                    C12454b<MacroListCategoryHeader> bVar10 = this.f11960z;
                    if (bVar10 == null) {
                        C13706o.m87945v("adapter");
                        bVar10 = null;
                    }
                    bVar10.mo68861M0(next2);
                }
            }
        } else if (C5163j2.m20264t1(this)) {
            C12454b<MacroListCategoryHeader> bVar11 = this.f11960z;
            if (bVar11 == null) {
                C13706o.m87945v("adapter");
                bVar11 = null;
            }
            for (C15609h next3 : bVar11.mo68882c1()) {
                if (!(next3 instanceof MacroListCategoryHeader) || ((MacroListCategoryHeader) next3).mo29720z().isLocked()) {
                    C12454b<MacroListCategoryHeader> bVar12 = this.f11960z;
                    if (bVar12 == null) {
                        C13706o.m87945v("adapter");
                        bVar12 = null;
                    }
                    C12454b<MacroListCategoryHeader> bVar13 = this.f11960z;
                    if (bVar13 == null) {
                        C13706o.m87945v("adapter");
                        bVar13 = null;
                    }
                    bVar12.mo68843A0(bVar13.mo68881b1(next3));
                } else {
                    C12454b<MacroListCategoryHeader> bVar14 = this.f11960z;
                    if (bVar14 == null) {
                        C13706o.m87945v("adapter");
                        bVar14 = null;
                    }
                    bVar14.mo68861M0(next3);
                }
            }
        } else {
            C12454b<MacroListCategoryHeader> bVar15 = this.f11960z;
            if (bVar15 == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            } else {
                bVar = bVar15;
            }
            bVar.mo68847C0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final boolean m18476g2(View view, int i) {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final int m18477h2(Collator collator, String str, String str2) {
        return collator.compare(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m18478i2(QuickRunAddMacrosActivity quickRunAddMacrosActivity, MacroListCategoryHeader macroListCategoryHeader) {
        C13706o.m87929f(quickRunAddMacrosActivity, "this$0");
        C13706o.m87928e(macroListCategoryHeader, "it");
        quickRunAddMacrosActivity.m18474e2(macroListCategoryHeader);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final int m18479j2(Collator collator, Macro macro, Macro macro2) {
        return collator.compare(macro.getName(), macro2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m18480k2(QuickRunAddMacrosActivity quickRunAddMacrosActivity, Macro macro, View view) {
        C13706o.m87929f(quickRunAddMacrosActivity, "this$0");
        C13706o.m87928e(macro, "macro");
        quickRunAddMacrosActivity.m18483n2(macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final boolean m18481l2(View view) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m18482m2(MacroListItem macroListItem) {
    }

    /* renamed from: n2 */
    private final void m18483n2(Macro macro) {
        List<Long> u1 = C5163j2.m20272u1(C10378a.f23596a.mo41059a());
        u1.add(Long.valueOf(macro.getGUID()));
        C5163j2.m20180i5(this, u1);
        finish();
    }

    /* renamed from: o2 */
    private final void m18484o2(String str, String str2, String str3, MacroListCategoryHeader macroListCategoryHeader) {
        String str4;
        CategoryList categoryList = this.f11957E;
        if (categoryList == null) {
            C13706o.m87945v("categoryList");
            str4 = str2;
            categoryList = null;
        } else {
            str4 = str2;
        }
        Category categoryByName = categoryList.getCategoryByName(str4);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C17535R$layout.dialog_password_prompt, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.passwordEntry);
        Button button = (Button) inflate.findViewById(C17532R$id.okButton);
        Button button2 = (Button) inflate.findViewById(C17532R$id.cancelButton);
        String str5 = str;
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
        button.setOnClickListener(new C4775c(this, editText, str3, str2, macroListCategoryHeader, categoryByName, create));
        button2.setOnClickListener(new C4774b(create));
        editText.requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m18485p2(QuickRunAddMacrosActivity quickRunAddMacrosActivity, EditText editText, String str, String str2, MacroListCategoryHeader macroListCategoryHeader, Category category, Dialog dialog, View view) {
        C13706o.m87929f(quickRunAddMacrosActivity, "this$0");
        C13706o.m87929f(str2, "$categoryName");
        C13706o.m87929f(macroListCategoryHeader, "$categoryHeader");
        C13706o.m87929f(dialog, "$dialog");
        if (C13706o.m87924a(quickRunAddMacrosActivity.m18473c2(editText.getText().toString()), str)) {
            quickRunAddMacrosActivity.f11954B.add(str2);
            macroListCategoryHeader.mo29715E(true);
            C12454b<MacroListCategoryHeader> bVar = quickRunAddMacrosActivity.f11960z;
            C12454b<MacroListCategoryHeader> bVar2 = null;
            if (bVar == null) {
                C13706o.m87945v("adapter");
                bVar = null;
            }
            C12454b<MacroListCategoryHeader> bVar3 = quickRunAddMacrosActivity.f11960z;
            if (bVar3 == null) {
                C13706o.m87945v("adapter");
                bVar3 = null;
            }
            bVar.notifyItemChanged(bVar3.mo68881b1(macroListCategoryHeader));
            C12454b<MacroListCategoryHeader> bVar4 = quickRunAddMacrosActivity.f11960z;
            if (bVar4 == null) {
                C13706o.m87945v("adapter");
                bVar4 = null;
            }
            C12454b<MacroListCategoryHeader> bVar5 = quickRunAddMacrosActivity.f11960z;
            if (bVar5 == null) {
                C13706o.m87945v("adapter");
            } else {
                bVar2 = bVar5;
            }
            bVar4.mo68856J0(bVar2.mo68881b1(macroListCategoryHeader));
            HashSet<String> hashSet = quickRunAddMacrosActivity.f11955C;
            C13706o.m87926c(category);
            hashSet.add(category.getName());
            dialog.dismiss();
            return;
        }
        C15626c.makeText(quickRunAddMacrosActivity.getApplicationContext(), C17541R$string.invalid_password, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m18486q2(Dialog dialog, View view) {
        C13706o.m87929f(dialog, "$dialog");
        dialog.cancel();
    }

    /* renamed from: a2 */
    public View mo29302a2(int i) {
        Map<Integer, View> map = this.f11958F;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d2 */
    public final C7328a mo29303d2() {
        C7328a aVar = this.f11959s;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("headingColorMapper");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_upload_template);
        setTitle(C17541R$string.add_macro);
        setSupportActionBar((Toolbar) mo29302a2(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.add_quick_run_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_expand_collapse_categories);
        C13706o.m87928e(findItem, "menu.findItem(R.id.menu_…pand_collapse_categories)");
        this.f11953A = findItem;
        MenuItem menuItem = null;
        if (findItem == null) {
            C13706o.m87945v("expandCollapseMenuItem");
            findItem = null;
        }
        findItem.setIcon(C5163j2.m20264t1(this) ? C17530R$drawable.unfold_less_horizontal : C17530R$drawable.unfold_more_horizontal);
        MenuItem menuItem2 = this.f11953A;
        if (menuItem2 == null) {
            C13706o.m87945v("expandCollapseMenuItem");
            menuItem2 = null;
        }
        menuItem2.setTitle(C5163j2.m20264t1(this) ? C17541R$string.collapse_categories : C17541R$string.expand_categories);
        MenuItem menuItem3 = this.f11953A;
        if (menuItem3 == null) {
            C13706o.m87945v("expandCollapseMenuItem");
        } else {
            menuItem = menuItem3;
        }
        menuItem.setVisible(this.f11956D);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        boolean z = true;
        if (itemId != 16908332) {
            if (itemId == 2131363229) {
                MenuItem menuItem2 = null;
                if (m18472b2()) {
                    C12454b<MacroListCategoryHeader> bVar = this.f11960z;
                    if (bVar == null) {
                        C13706o.m87945v("adapter");
                        bVar = null;
                    }
                    int itemCount = bVar.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        C12454b<MacroListCategoryHeader> bVar2 = this.f11960z;
                        if (bVar2 == null) {
                            C13706o.m87945v("adapter");
                            bVar2 = null;
                        }
                        bVar2.mo68843A0(i);
                    }
                    z = false;
                } else {
                    C12454b<MacroListCategoryHeader> bVar3 = this.f11960z;
                    if (bVar3 == null) {
                        C13706o.m87945v("adapter");
                        bVar3 = null;
                    }
                    bVar3.getItemCount();
                    C12454b<MacroListCategoryHeader> bVar4 = this.f11960z;
                    if (bVar4 == null) {
                        C13706o.m87945v("adapter");
                        bVar4 = null;
                    }
                    for (int itemCount2 = bVar4.getItemCount() - 1; -1 < itemCount2; itemCount2--) {
                        C12454b<MacroListCategoryHeader> bVar5 = this.f11960z;
                        if (bVar5 == null) {
                            C13706o.m87945v("adapter");
                            bVar5 = null;
                        }
                        MacroListCategoryHeader macroListCategoryHeader = bVar5.mo68869U0().get(itemCount2);
                        C13706o.m87928e(macroListCategoryHeader, "adapter.getCurrentItems()[i]");
                        C15608g gVar = macroListCategoryHeader;
                        if (gVar instanceof MacroListCategoryHeader) {
                            MacroListCategoryHeader macroListCategoryHeader2 = (MacroListCategoryHeader) gVar;
                            if (!macroListCategoryHeader2.mo29720z().isLocked() || this.f11954B.contains(macroListCategoryHeader2.mo29720z().getName())) {
                                C12454b<MacroListCategoryHeader> bVar6 = this.f11960z;
                                if (bVar6 == null) {
                                    C13706o.m87945v("adapter");
                                    bVar6 = null;
                                }
                                int b1 = bVar6.mo68881b1(gVar);
                                C12454b<MacroListCategoryHeader> bVar7 = this.f11960z;
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
                MenuItem menuItem3 = this.f11953A;
                if (menuItem3 == null) {
                    C13706o.m87945v("expandCollapseMenuItem");
                    menuItem3 = null;
                }
                menuItem3.setTitle(z ? C17541R$string.collapse_categories : C17541R$string.expand_categories);
                MenuItem menuItem4 = this.f11953A;
                if (menuItem4 == null) {
                    C13706o.m87945v("expandCollapseMenuItem");
                } else {
                    menuItem2 = menuItem4;
                }
                menuItem2.setIcon(C5163j2.m20264t1(this) ? C17530R$drawable.unfold_less_horizontal : C17530R$drawable.unfold_more_horizontal);
            }
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m18475f2();
    }
}
