package com.arlosoft.macrodroid.selectableitemlist;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.action.ConditionAction;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.widget.C6637e;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import p099h1.C7364d;
import p112j2.C7439d0;
import p286i9.C12454b;
import p316l9.C15608g;

/* compiled from: AddSelectableItemActivity.kt */
public abstract class AddSelectableItemActivity extends MacroDroidBaseActivity implements SelectableItemListItem.C5090a, C6637e, C5099g {

    /* renamed from: A */
    private long f12742A;

    /* renamed from: B */
    private long f12743B;

    /* renamed from: C */
    private SelectableItem f12744C;

    /* renamed from: D */
    private Macro f12745D;

    /* renamed from: E */
    private boolean f12746E;

    /* renamed from: F */
    private final boolean f12747F;

    /* renamed from: G */
    public Map<Integer, View> f12748G = new LinkedHashMap();

    /* renamed from: o */
    private int f12749o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C12454b<C15608g<?>> f12750p;

    /* renamed from: s */
    private SearchView f12751s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public List<C15608g<?>> f12752z;

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddSelectableItemActivity$a */
    /* compiled from: AddSelectableItemActivity.kt */
    public static final class C5086a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ AddSelectableItemActivity f12753a;

        C5086a(AddSelectableItemActivity addSelectableItemActivity) {
            this.f12753a = addSelectableItemActivity;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            C12454b U1 = this.f12753a.f12750p;
            if (U1 != null) {
                U1.mo68880a2(str);
            }
            C12454b U12 = this.f12753a.f12750p;
            if (U12 != null) {
                List V1 = this.f12753a.f12752z;
                C13706o.m87926c(V1);
                U12.mo68862P0(V1);
            }
            this.f12753a.mo30002Z1().getFilter().filter(str);
            C12454b U13 = this.f12753a.f12750p;
            if (U13 == null) {
                return true;
            }
            U13.notifyDataSetChanged();
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.AddSelectableItemActivity$b */
    /* compiled from: Comparisons.kt */
    public static final class C5087b<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ AddSelectableItemActivity f12754a;

        public C5087b(AddSelectableItemActivity addSelectableItemActivity) {
            this.f12754a = addSelectableItemActivity;
        }

        public final int compare(T t, T t2) {
            return C15612b.m94865a(this.f12754a.getString(((C4001c1) t).mo27893k()), this.f12754a.getString(((C4001c1) t2).mo27893k()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m19592f2(AddSelectableItemActivity addSelectableItemActivity, Menu menu, MenuItem menuItem, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C13706o.m87929f(addSelectableItemActivity, "this$0");
        C13706o.m87929f(menu, "$menu");
        SearchView searchView = addSelectableItemActivity.f12751s;
        boolean z = true;
        if (searchView == null || !searchView.isIconified()) {
            z = false;
        }
        int size = menu.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = menu.getItem(i9);
            if (item != menuItem) {
                item.setVisible(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m19593g2(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c8 A[EDGE_INSN: B:89:0x00c8->B:30:0x00c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: j2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19594j2() {
        /*
            r18 = this;
            r8 = r18
            r0 = 2131361921(0x7f0a0081, float:1.8343608E38)
            android.view.View r0 = r8.findViewById(r0)
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            com.arlosoft.macrodroid.wizard.MacroDroidSmoothScrollStaggeredLayoutManager r0 = new com.arlosoft.macrodroid.wizard.MacroDroidSmoothScrollStaggeredLayoutManager
            r1 = 2
            r0.<init>(r8, r1)
            r9.setLayoutManager(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f12752z = r0
            int r10 = r18.mo30004c2()
            java.util.List r0 = r18.mo30000X1()
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
            r0 = 0
        L_0x002a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r1 = r11.next()
            h1.d r1 = (p099h1.C7364d) r1
            com.arlosoft.macrodroid.selectableitemlist.SelectableItemCategoryHeader r14 = new com.arlosoft.macrodroid.selectableitemlist.SelectableItemCategoryHeader
            int r2 = r0 + 1
            int r3 = r18.mo30001Y1()
            r14.<init>(r1, r0, r3)
            r14.mo74945i(r12)
            java.util.List<l9.g<?>> r0 = r8.f12752z
            if (r0 == 0) goto L_0x004b
            r0.add(r14)
        L_0x004b:
            java.util.List r0 = r1.mo37345f()
            java.util.Iterator r15 = r0.iterator()
            r3 = r2
        L_0x0054:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r15.next()
            r7 = r0
            com.arlosoft.macrodroid.common.c1 r7 = (com.arlosoft.macrodroid.common.C4001c1) r7
            com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem r6 = new com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem
            int r16 = r3 + 1
            boolean r17 = r18.mo30009e2()
            r0 = r6
            r1 = r18
            r2 = r14
            r4 = r7
            r5 = r18
            r13 = r6
            r6 = r18
            r12 = r7
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.mo74963q(r14)
            boolean r0 = r12 instanceof p119k3.C7514i2
            java.lang.String r1 = "it.triggerList"
            if (r0 == 0) goto L_0x00a3
            com.arlosoft.macrodroid.macro.Macro r0 = r8.f12745D
            if (r0 == 0) goto L_0x00a3
            java.util.ArrayList r0 = r0.getTriggerList()
            java.util.Iterator r0 = r0.iterator()
        L_0x008e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r2 = r0.next()
            kotlin.jvm.internal.C13706o.m87928e(r2, r1)
            com.arlosoft.macrodroid.triggers.Trigger r2 = (com.arlosoft.macrodroid.triggers.Trigger) r2
            boolean r2 = r2 instanceof com.arlosoft.macrodroid.triggers.WidgetPressedTrigger
            if (r2 == 0) goto L_0x008e
            r0 = 0
            goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            boolean r2 = r12 instanceof p119k3.C7483c
            if (r2 == 0) goto L_0x00c8
            com.arlosoft.macrodroid.macro.Macro r2 = r8.f12745D
            if (r2 == 0) goto L_0x00c8
            java.util.ArrayList r2 = r2.getTriggerList()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r2.next()
            kotlin.jvm.internal.C13706o.m87928e(r3, r1)
            com.arlosoft.macrodroid.triggers.Trigger r3 = (com.arlosoft.macrodroid.triggers.Trigger) r3
            boolean r3 = r3 instanceof p119k3.C7483c
            if (r3 == 0) goto L_0x00b4
            r0 = 0
        L_0x00c8:
            if (r0 == 0) goto L_0x00cd
            r14.mo74947w(r13)
        L_0x00cd:
            r3 = r16
            r12 = 0
            goto L_0x0054
        L_0x00d1:
            r0 = r3
            goto L_0x002a
        L_0x00d4:
            boolean r0 = r18.mo30005o2()
            if (r0 != 0) goto L_0x00f9
            java.util.List<l9.g<?>> r11 = r8.f12752z
            if (r11 == 0) goto L_0x00f9
            com.arlosoft.macrodroid.selectableitemlist.h r12 = new com.arlosoft.macrodroid.selectableitemlist.h
            boolean r3 = r18.mo30009e2()
            com.arlosoft.macrodroid.selectableitemlist.c r4 = new com.arlosoft.macrodroid.selectableitemlist.c
            r4.<init>(r8)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r12
            r1 = r18
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            r11.add(r0, r12)
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            i9.b r1 = new i9.b
            java.util.List<l9.g<?>> r2 = r8.f12752z
            r3 = 0
            r4 = 1
            r1.<init>(r2, r3, r4)
            r8.f12750p = r1
            com.arlosoft.macrodroid.selectableitemlist.d r2 = com.arlosoft.macrodroid.selectableitemlist.C5095d.f12793a
            r1.mo68900o0(r2)
            i9.b<l9.g<?>> r1 = r8.f12750p
            if (r1 == 0) goto L_0x0114
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.mo68875Y1(r2)
        L_0x0114:
            i9.b<l9.g<?>> r1 = r8.f12750p
            r2 = 1
            if (r1 != 0) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r1.mo68877Z1(r2)
        L_0x011d:
            i9.b<l9.g<?>> r1 = r8.f12750p
            r9.setAdapter(r1)
            androidx.appcompat.widget.SearchView r1 = r8.f12751s
            if (r1 == 0) goto L_0x012e
            boolean r1 = r1.isIconified()
            if (r1 != r2) goto L_0x012e
            r1 = 1
            goto L_0x012f
        L_0x012e:
            r1 = 0
        L_0x012f:
            if (r1 == 0) goto L_0x017b
            androidx.appcompat.widget.SearchView r1 = r8.f12751s
            if (r1 == 0) goto L_0x0149
            java.lang.CharSequence r1 = r1.getQuery()
            if (r1 == 0) goto L_0x0149
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0143
            r1 = 1
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            r2 = 1
            if (r1 != r2) goto L_0x0149
            r4 = 1
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r4 == 0) goto L_0x017b
            androidx.appcompat.widget.SearchView r1 = r8.f12751s
            if (r1 == 0) goto L_0x0154
            java.lang.CharSequence r3 = r1.getQuery()
        L_0x0154:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            i9.b<l9.g<?>> r2 = r8.f12750p
            if (r2 == 0) goto L_0x0165
            boolean r2 = r2.mo68901o1(r1)
            r3 = 1
            if (r2 != r3) goto L_0x0165
            r12 = 1
            goto L_0x0166
        L_0x0165:
            r12 = 0
        L_0x0166:
            if (r12 == 0) goto L_0x017b
            i9.b<l9.g<?>> r0 = r8.f12750p
            if (r0 == 0) goto L_0x016f
            r0.mo68880a2(r1)
        L_0x016f:
            i9.b<l9.g<?>> r0 = r8.f12750p
            if (r0 == 0) goto L_0x017b
            java.util.List<l9.g<?>> r1 = r8.f12752z
            kotlin.jvm.internal.C13706o.m87926c(r1)
            r0.mo68862P0(r1)
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.selectableitemlist.AddSelectableItemActivity.m19594j2():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m19595k2(AddSelectableItemActivity addSelectableItemActivity) {
        C13706o.m87929f(addSelectableItemActivity, "this$0");
        C12454b<C15608g<?>> bVar = addSelectableItemActivity.f12750p;
        if (bVar != null) {
            bVar.mo68865R1(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final boolean m19596l2(View view, int i) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if ((r0.length() > 0) == true) goto L_0x0040;
     */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19597m2() {
        /*
            r3 = this;
            r0 = 2131361921(0x7f0a0081, float:1.8343608E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r3)
            r0.setLayoutManager(r1)
            com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter r1 = r3.mo30002Z1()
            r0.setAdapter(r1)
            androidx.appcompat.widget.SearchView r0 = r3.f12751s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isIconified()
            if (r0 != r1) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x0059
            androidx.appcompat.widget.SearchView r0 = r3.f12751s
            if (r0 == 0) goto L_0x003f
            java.lang.CharSequence r0 = r0.getQuery()
            if (r0 == 0) goto L_0x003f
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 != r1) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0059
            com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter r0 = r3.mo30002Z1()
            android.widget.Filter r0 = r0.getFilter()
            if (r0 == 0) goto L_0x0059
            androidx.appcompat.widget.SearchView r1 = r3.f12751s
            if (r1 == 0) goto L_0x0055
            java.lang.CharSequence r1 = r1.getQuery()
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            r0.filter(r1)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.selectableitemlist.AddSelectableItemActivity.m19597m2():void");
    }

    /* renamed from: n2 */
    private final void m19598n2() {
        if (C5163j2.m19964F1(this)) {
            m19594j2();
        } else {
            m19597m2();
        }
    }

    /* renamed from: C0 */
    public void mo27137C0(Object obj) {
        C13706o.m87929f(obj, "obj");
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null) {
            selectableItem.mo25307s1(obj);
        }
    }

    /* renamed from: I */
    public void mo30017I(C4001c1 c1Var) {
        C13706o.m87929f(c1Var, "itemInfo");
        AlertDialog.Builder builder = new AlertDialog.Builder(this, mo30003b2());
        builder.setTitle(c1Var.mo27893k());
        if (c1Var.mo27902t()) {
            builder.setMessage((CharSequence) C4061t1.m16007n(this, getString(c1Var.mo27891f())));
        } else {
            builder.setMessage(c1Var.mo27891f());
        }
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) C5091a.f12773a);
        C4061t1.m16026w0(builder.show());
    }

    /* renamed from: W0 */
    public void mo27140W0() {
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null) {
            selectableItem.mo27864r1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public abstract int mo29999W1();

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public abstract List<C7364d> mo30000X1();

    /* renamed from: Y0 */
    public boolean mo30018Y0() {
        return this.f12746E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public abstract int mo30001Y1();

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public abstract SelectableItemAdapter mo30002Z1();

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public final SelectableItem mo30019a2() {
        return this.f12744C;
    }

    /* access modifiers changed from: protected */
    @StyleRes
    /* renamed from: b2 */
    public abstract int mo30003b2();

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public abstract int mo30004c2();

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public final Macro mo30020d2() {
        return this.f12745D;
    }

    /* renamed from: e2 */
    public boolean mo30009e2() {
        return this.f12747F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public final void mo30021h2(SelectableItem selectableItem) {
        this.f12744C = selectableItem;
    }

    /* renamed from: i2 */
    public void mo30022i2(boolean z) {
        this.f12746E = z;
    }

    /* renamed from: o2 */
    public abstract boolean mo30005o2();

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null && selectableItem != null) {
            selectableItem.mo24713q1(this, i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(C17535R$layout.add_selectable_item_view);
        this.f12749o = -1;
        if (bundle != null) {
            this.f12744C = (SelectableItem) bundle.getParcelable("selectable_item");
            this.f12749o = bundle.getInt("MacroId");
        } else {
            Intent intent = getIntent();
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                this.f12749o = extras.getInt("MacroId", -1);
                this.f12742A = extras.getLong("ParentGUID", 0);
                this.f12743B = extras.getLong("ParentGUIDInsert", 0);
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(2131364057);
        toolbar.setBackgroundColor(ContextCompat.getColor(this, mo29999W1()));
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        Macro R = C4934n.m18998M().mo29683R(this.f12749o);
        this.f12745D = R;
        if (R == null) {
            finish();
            return;
        }
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null) {
            selectableItem.mo24687G2(R);
        }
        m19598n2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.add_selectable_item_menu, menu);
        menu.findItem(C17532R$id.menu_show_categories).setChecked(C5163j2.m19964F1(this));
        MenuItem findItem = menu.findItem(C17532R$id.menu_search);
        View actionView = findItem.getActionView();
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f12751s = searchView;
        if (searchView != null) {
            searchView.setMaxWidth(Integer.MAX_VALUE);
        }
        SearchView searchView2 = this.f12751s;
        if (searchView2 != null) {
            searchView2.setOnQueryTextListener(new C5086a(this));
        }
        SearchView searchView3 = this.f12751s;
        if (searchView3 == null) {
            return true;
        }
        searchView3.addOnLayoutChangeListener(new C5092b(this, menu, findItem));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f12751s = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == 2131363231) {
            mo30022i2(!mo30018Y0());
            C12454b<C15608g<?>> bVar = this.f12750p;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
            mo30002Z1().mo30055L(mo30018Y0());
            return true;
        } else if (itemId != 2131363267) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            boolean z = !C5163j2.m19964F1(this);
            C5163j2.m20268t5(this, z);
            menuItem.setChecked(z);
            m19598n2();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C13706o.m87929f(strArr, "permissions");
        C13706o.m87929f(iArr, "grantResults");
        if (i == 34) {
            SelectableItem selectableItem = this.f12744C;
            if (selectableItem != null) {
                C7439d0.m30856C(selectableItem, strArr, iArr);
                return;
            }
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C13706o.m87929f(bundle, "outState");
        bundle.putInt("MacroId", this.f12749o);
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null) {
            bundle.putParcelable("selectable_item", selectableItem);
        }
        Macro macro = this.f12745D;
        if (macro != null) {
            C13706o.m87926c(macro);
            bundle.putInt("MacroId", macro.getId());
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: p2 */
    public final List<C7364d> mo30023p2(List<? extends C7364d> list) {
        C13706o.m87929f(list, "categories");
        for (C7364d dVar : list) {
            List<C4001c1> f = dVar.mo37345f();
            C13706o.m87928e(f, "cat.items");
            dVar.mo37346g(C13566b0.m87450y0(f, new C5087b(this)));
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public void mo30010q2(SelectableItem selectableItem) {
    }

    public final void refresh() {
        C12454b<C15608g<?>> bVar = this.f12750p;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem instanceof ConditionAction) {
            C13706o.m87927d(selectableItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.ConditionAction");
            ((ConditionAction) selectableItem).mo24876r3();
        }
    }

    /* renamed from: v1 */
    public void mo30006v1(C4001c1 c1Var) {
        C13706o.m87929f(c1Var, "itemInfo");
        SelectableItem b = c1Var.mo27888b(this, this.f12745D);
        this.f12744C = b;
        mo30010q2(b);
        SelectableItem selectableItem = this.f12744C;
        if (selectableItem != null) {
            selectableItem.mo25540W1();
        }
    }
}
