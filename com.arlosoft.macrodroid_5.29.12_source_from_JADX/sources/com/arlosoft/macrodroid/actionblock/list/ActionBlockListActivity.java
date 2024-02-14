package com.arlosoft.macrodroid.actionblock.list;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.araujo.jordan.excuseme.C1624a;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity;
import com.arlosoft.macrodroid.actionblock.list.C3752c;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6409o;
import com.arlosoft.macrodroid.utils.C6422r0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p018c0.C1423a;
import p081e1.C7264a;
import p100h2.C7366i;
import p139o1.C7991b;
import p172u1.C10283c;
import p190x3.C10378a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16270q;

/* compiled from: ActionBlockListActivity.kt */
public final class ActionBlockListActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: G */
    public static final C3741a f9803G = new C3741a((C13695i) null);

    /* renamed from: A */
    public C4915a f9804A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C3750a f9805B;

    /* renamed from: C */
    private MenuItem f9806C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C7991b f9807D;

    /* renamed from: E */
    private boolean f9808E;

    /* renamed from: F */
    public Map<Integer, View> f9809F = new LinkedHashMap();

    /* renamed from: s */
    public ActionBlockListViewModel f9810s;

    /* renamed from: z */
    public C7366i f9811z;

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$a */
    /* compiled from: ActionBlockListActivity.kt */
    public static final class C3741a {
        private C3741a() {
        }

        public /* synthetic */ C3741a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo27228a(Activity activity, boolean z) {
            C13706o.m87929f(activity, "activity");
            Intent intent = new Intent(activity, ActionBlockListActivity.class);
            intent.putExtra("is_select_mode", z);
            return intent;
        }

        /* renamed from: b */
        public final void mo27229b(Activity activity, boolean z, int i) {
            C13706o.m87929f(activity, "activity");
            activity.startActivityForResult(mo27228a(activity, z), i);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$b */
    /* compiled from: View.kt */
    public static final class C3742b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ ActionBlockListActivity f9812a;

        public C3742b(ActionBlockListActivity actionBlockListActivity) {
            this.f9812a = actionBlockListActivity;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C13706o.m87929f(view, "view");
            view.removeOnLayoutChangeListener(this);
            C7991b e2 = this.f9812a.f9807D;
            C7991b bVar = null;
            if (e2 == null) {
                C13706o.m87945v("binding");
                e2 = null;
            }
            CardView cardView = e2.f19215i.f19257f;
            C13706o.m87928e(cardView, "binding.infoCard.infoCardView");
            if (!(cardView.getVisibility() == 0)) {
                C7991b e22 = this.f9812a.f9807D;
                if (e22 == null) {
                    C13706o.m87945v("binding");
                    e22 = null;
                }
                ViewGroup.LayoutParams layoutParams = e22.f19211e.getLayoutParams();
                C7991b e23 = this.f9812a.f9807D;
                if (e23 == null) {
                    C13706o.m87945v("binding");
                    e23 = null;
                }
                layoutParams.height = e23.f19220n.getHeight();
            }
            C7991b e24 = this.f9812a.f9807D;
            if (e24 == null) {
                C13706o.m87945v("binding");
            } else {
                bVar = e24;
            }
            FrameLayout frameLayout = bVar.f19211e;
            C13706o.m87928e(frameLayout, "binding.emptyView");
            frameLayout.setVisibility(0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$c */
    /* compiled from: ActionBlockListActivity.kt */
    static final class C3743c extends C13708q implements C16265l<C1423a, C13339u> {
        final /* synthetic */ String $permissionRequired;
        final /* synthetic */ ActionBlockListActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$c$a */
        /* compiled from: ActionBlockListActivity.kt */
        public static final class C3744a implements C7366i.C7368b {

            /* renamed from: a */
            final /* synthetic */ ActionBlockListActivity f9813a;

            C3744a(ActionBlockListActivity actionBlockListActivity) {
                this.f9813a = actionBlockListActivity;
            }

            /* renamed from: a */
            public void mo27232a(String str) {
                C13706o.m87929f(str, "jsonString");
                C7991b e2 = this.f9813a.f9807D;
                if (e2 == null) {
                    C13706o.m87945v("binding");
                    e2 = null;
                }
                e2.f19218l.mo75513c();
                this.f9813a.mo27226q2().mo37357O();
                this.f9813a.mo27226q2().mo37363x();
                this.f9813a.m14729t2(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3743c(String str, ActionBlockListActivity actionBlockListActivity) {
            super(1);
            this.$permissionRequired = str;
            this.this$0 = actionBlockListActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m14742c(ActionBlockListActivity actionBlockListActivity, View view) {
            C13706o.m87929f(actionBlockListActivity, "this$0");
            C7991b e2 = actionBlockListActivity.f9807D;
            if (e2 == null) {
                C13706o.m87945v("binding");
                e2 = null;
            }
            e2.f19218l.mo75513c();
            actionBlockListActivity.mo27226q2().mo37357O();
            actionBlockListActivity.mo27226q2().mo37363x();
        }

        /* renamed from: b */
        public final void mo27231b(C1423a aVar) {
            C13706o.m87929f(aVar, "it");
            if (aVar.mo16888b().contains(this.$permissionRequired)) {
                C7991b e2 = this.this$0.f9807D;
                C7991b bVar = null;
                if (e2 == null) {
                    C13706o.m87945v("binding");
                    e2 = null;
                }
                e2.f19218l.mo75515e();
                this.this$0.mo27226q2().mo37352C(new C3744a(this.this$0));
                C7991b e22 = this.this$0.f9807D;
                if (e22 == null) {
                    C13706o.m87945v("binding");
                } else {
                    bVar = e22;
                }
                bVar.f19210d.setOnClickListener(new C3768p(this.this$0));
                this.this$0.mo27226q2().mo37355I("com.arlosoft.macrodroid.ACTION_BLOCK_SHARE");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27231b((C1423a) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$d */
    /* compiled from: ActionBlockListActivity.kt */
    public static final class C3745d implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ ActionBlockListActivity f9814a;

        /* renamed from: b */
        final /* synthetic */ Macro f9815b;

        C3745d(ActionBlockListActivity actionBlockListActivity, Macro macro) {
            this.f9814a = actionBlockListActivity;
            this.f9815b = macro;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            this.f9814a.m14734y2(this.f9815b);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$e */
    /* compiled from: ActionBlockListActivity.kt */
    static final class C3746e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3746e(ActionBlockListActivity actionBlockListActivity, C13635d<? super C3746e> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockListActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3746e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo27227r2().mo27242m();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity$f */
    /* compiled from: ActionBlockListActivity.kt */
    public static final class C3747f implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ ActionBlockListActivity f9816a;

        C3747f(ActionBlockListActivity actionBlockListActivity) {
            this.f9816a = actionBlockListActivity;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            C3750a d2 = this.f9816a.f9805B;
            if (d2 == null) {
                return true;
            }
            d2.mo27253G(str);
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* renamed from: A2 */
    private final void m14694A2(ActionBlock actionBlock) {
        Intent intent = new Intent();
        intent.putExtra("ActionBlockGuid", actionBlock.getGUID());
        intent.putExtra("ActionBlockName", actionBlock.getName());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: B2 */
    private final void m14695B2(ActionBlock actionBlock) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) getString(C17541R$string.delete) + ' ' + actionBlock.getName());
        builder.setMessage((int) C17541R$string.are_you_sure_delete_action_block);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3759g(this, actionBlock));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3762j.f9839a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m14696C2(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m14697D2(ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        C13706o.m87929f(actionBlock, "$actionBlock");
        actionBlockListActivity.mo27227r2().mo27244o(actionBlock);
    }

    /* renamed from: E2 */
    private final void m14698E2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.delete_all);
        builder.setMessage((int) C17541R$string.are_you_sure_remove_all_action_blocks);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3756d(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3761i.f9838a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m14699F2(ActionBlockListActivity actionBlockListActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        actionBlockListActivity.mo27227r2().mo27237h();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m14700G2(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* renamed from: H2 */
    private final void m14701H2(ActionBlock actionBlock) {
        C6422r0 r0Var = C6422r0.f15045a;
        File filesDir = getFilesDir();
        C13706o.m87928e(filesDir, "filesDir");
        File b = r0Var.mo32452b(filesDir, actionBlock, mo27225p2());
        if (b != null) {
            try {
                ArrayList arrayList = new ArrayList();
                C10378a aVar = C10378a.f23596a;
                MacroDroidApplication a = aVar.mo41059a();
                arrayList.add(FileProvider.getUriForFile(a, aVar.mo41059a().getPackageName() + ".provider", b));
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.addFlags(268435456);
                intent.setType("text/plain");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                startActivity(Intent.createChooser(intent, getString(C17541R$string.menu_share)));
            } catch (Exception e) {
                C15626c.makeText(getApplicationContext(), C17541R$string.export_failed, 0).show();
                C4878b.m18868g("Failed to export file: " + e);
            }
        }
    }

    /* renamed from: I2 */
    private final void m14702I2(ActionBlock actionBlock) {
        String[] strArr = {getString(C17541R$string.edit), getString(C17541R$string.menu_run), getString(C17541R$string.delete), getString(C17541R$string.share_action_block), getString(C17541R$string.clone_action_block)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((CharSequence) actionBlock.getName()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3760h(this, actionBlock));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m14703J2(ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        C13706o.m87929f(actionBlock, "$actionBlock");
        if (i == 0) {
            actionBlockListActivity.mo27227r2().mo27235b(actionBlock);
        } else if (i == 1) {
            actionBlockListActivity.mo27227r2().mo27246p(actionBlock);
        } else if (i == 2) {
            actionBlockListActivity.m14695B2(actionBlock);
        } else if (i == 3) {
            actionBlockListActivity.m14701H2(actionBlock);
        } else if (i == 4) {
            actionBlockListActivity.mo27227r2().mo27243n(actionBlock);
        }
    }

    /* renamed from: h2 */
    private final void m14720h2(List<ActionBlock> list) {
        C7991b bVar = this.f9807D;
        C7991b bVar2 = null;
        if (bVar == null) {
            C13706o.m87945v("binding");
            bVar = null;
        }
        bVar.f19208b.setItemAnimator((RecyclerView.ItemAnimator) null);
        boolean z = true;
        if (list.isEmpty()) {
            C7991b bVar3 = this.f9807D;
            if (bVar3 == null) {
                C13706o.m87945v("binding");
                bVar3 = null;
            }
            NestedScrollView nestedScrollView = bVar3.f19220n;
            C13706o.m87928e(nestedScrollView, "binding.scrollView");
            if (!ViewCompat.isLaidOut(nestedScrollView) || nestedScrollView.isLayoutRequested()) {
                nestedScrollView.addOnLayoutChangeListener(new C3742b(this));
            } else {
                C7991b e2 = this.f9807D;
                if (e2 == null) {
                    C13706o.m87945v("binding");
                    e2 = null;
                }
                CardView cardView = e2.f19215i.f19257f;
                C13706o.m87928e(cardView, "binding.infoCard.infoCardView");
                if (cardView.getVisibility() != 0) {
                    z = false;
                }
                if (!z) {
                    C7991b e22 = this.f9807D;
                    if (e22 == null) {
                        C13706o.m87945v("binding");
                        e22 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = e22.f19211e.getLayoutParams();
                    C7991b e23 = this.f9807D;
                    if (e23 == null) {
                        C13706o.m87945v("binding");
                        e23 = null;
                    }
                    layoutParams.height = e23.f19220n.getHeight();
                }
                C7991b e24 = this.f9807D;
                if (e24 == null) {
                    C13706o.m87945v("binding");
                    e24 = null;
                }
                FrameLayout frameLayout = e24.f19211e;
                C13706o.m87928e(frameLayout, "binding.emptyView");
                frameLayout.setVisibility(0);
            }
            C7991b bVar4 = this.f9807D;
            if (bVar4 == null) {
                C13706o.m87945v("binding");
            } else {
                bVar2 = bVar4;
            }
            RecyclerView recyclerView = bVar2.f19208b;
            C13706o.m87928e(recyclerView, "binding.actionBlocksList");
            recyclerView.setVisibility(8);
            return;
        }
        C7991b bVar5 = this.f9807D;
        if (bVar5 == null) {
            C13706o.m87945v("binding");
            bVar5 = null;
        }
        RecyclerView recyclerView2 = bVar5.f19208b;
        C13706o.m87928e(recyclerView2, "binding.actionBlocksList");
        recyclerView2.setVisibility(0);
        C7991b bVar6 = this.f9807D;
        if (bVar6 == null) {
            C13706o.m87945v("binding");
            bVar6 = null;
        }
        FrameLayout frameLayout2 = bVar6.f19211e;
        C13706o.m87928e(frameLayout2, "binding.emptyView");
        frameLayout2.setVisibility(8);
        this.f9805B = new C3750a(list, true ^ this.f9808E, mo27227r2());
        C7991b bVar7 = this.f9807D;
        if (bVar7 == null) {
            C13706o.m87945v("binding");
        } else {
            bVar2 = bVar7;
        }
        bVar2.f19208b.setAdapter(this.f9805B);
        MenuItem menuItem = this.f9806C;
        if (menuItem != null) {
            View actionView = MenuItemCompat.getActionView(menuItem);
            C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            SearchView searchView = (SearchView) actionView;
            if (!searchView.isIconified()) {
                C3750a aVar = this.f9805B;
                C13706o.m87926c(aVar);
                StringBuilder sb = new StringBuilder();
                sb.append(searchView.getQuery());
                sb.append('_');
                aVar.mo27253G(sb.toString());
            }
        }
    }

    /* renamed from: i2 */
    private final void m14721i2() {
        C7991b bVar = null;
        if (C5163j2.m20261s6(this)) {
            C7991b bVar2 = this.f9807D;
            if (bVar2 == null) {
                C13706o.m87945v("binding");
            } else {
                bVar = bVar2;
            }
            bVar.f19215i.f19257f.setVisibility(8);
            return;
        }
        C7991b bVar3 = this.f9807D;
        if (bVar3 == null) {
            C13706o.m87945v("binding");
            bVar3 = null;
        }
        bVar3.f19215i.f19257f.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.actions_primary));
        C7991b bVar4 = this.f9807D;
        if (bVar4 == null) {
            C13706o.m87945v("binding");
            bVar4 = null;
        }
        bVar4.f19215i.f19256e.setText(C17541R$string.action_blocks);
        C7991b bVar5 = this.f9807D;
        if (bVar5 == null) {
            C13706o.m87945v("binding");
            bVar5 = null;
        }
        bVar5.f19215i.f19254c.setText(C17541R$string.action_block_help_info);
        C7991b bVar6 = this.f9807D;
        if (bVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            bVar = bVar6;
        }
        bVar.f19215i.f19255d.setOnClickListener(new C3765m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m14722j2(ActionBlockListActivity actionBlockListActivity, View view) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        C5163j2.m19980H2(actionBlockListActivity.getApplicationContext());
        C7991b bVar = actionBlockListActivity.f9807D;
        C7991b bVar2 = null;
        if (bVar == null) {
            C13706o.m87945v("binding");
            bVar = null;
        }
        bVar.f19215i.f19257f.setVisibility(8);
        C7991b bVar3 = actionBlockListActivity.f9807D;
        if (bVar3 == null) {
            C13706o.m87945v("binding");
            bVar3 = null;
        }
        FrameLayout frameLayout = bVar3.f19211e;
        C13706o.m87928e(frameLayout, "binding.emptyView");
        if (frameLayout.getVisibility() == 0) {
            C7991b bVar4 = actionBlockListActivity.f9807D;
            if (bVar4 == null) {
                C13706o.m87945v("binding");
                bVar4 = null;
            }
            ViewGroup.LayoutParams layoutParams = bVar4.f19211e.getLayoutParams();
            C7991b bVar5 = actionBlockListActivity.f9807D;
            if (bVar5 == null) {
                C13706o.m87945v("binding");
            } else {
                bVar2 = bVar5;
            }
            layoutParams.height = bVar2.f19220n.getHeight();
        }
    }

    /* renamed from: k2 */
    private final void m14723k2() {
        mo27227r2().mo27239j().observe(this, new C3758f(this));
        mo27227r2().mo27238i().observe(this, new C3767o(this));
        mo27227r2().mo27240k().observe(this, new C3766n(this));
        mo27227r2().mo27241l().observe(this, new C3757e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m14724l2(ActionBlockListActivity actionBlockListActivity, List list) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        C13706o.m87928e(list, "actionBlocks");
        actionBlockListActivity.m14720h2(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m14725m2(ActionBlockListActivity actionBlockListActivity, C3752c cVar) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        if (cVar != null) {
            actionBlockListActivity.m14728s2(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m14726n2(ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        if (actionBlock != null) {
            actionBlockListActivity.m14694A2(actionBlock);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m14727o2(ActionBlockListActivity actionBlockListActivity, Macro macro) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        if (macro != null) {
            actionBlockListActivity.m14735z2(macro);
        }
    }

    /* renamed from: s2 */
    private final void m14728s2(C3752c cVar) {
        if (cVar instanceof C3752c.C3753a) {
            m14733x2(cVar.mo27255a(), true);
        } else if (cVar instanceof C3752c.C3754b) {
            m14733x2(cVar.mo27255a(), false);
        } else if (cVar instanceof C3752c.C3755c) {
            m14702I2(cVar.mo27255a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m14729t2(String str) {
        Object j = C10283c.m40416f().mo63976j(str, Macro.class);
        C13706o.m87927d(j, "null cannot be cast to non-null type com.arlosoft.macrodroid.actionblock.data.ActionBlock");
        ActionBlock actionBlock = (ActionBlock) j;
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_add_action_block_from_nearby);
        appCompatDialog.setTitle((int) C17541R$string.add_action_block);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.descriptionText);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.nameText);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(editText2);
        editText2.setText(actionBlock.getName());
        C13706o.m87926c(editText);
        editText.setText(TextUtils.isEmpty(actionBlock.getDescription()) ? "" : actionBlock.getDescription());
        C13706o.m87926c(button);
        button.setOnClickListener(new C3763k(editText2, this, actionBlock, editText, appCompatDialog));
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C3764l(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m14730u2(EditText editText, ActionBlockListActivity actionBlockListActivity, ActionBlock actionBlock, EditText editText2, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(actionBlockListActivity, "this$0");
        C13706o.m87929f(actionBlock, "$actionBlock");
        C13706o.m87929f(appCompatDialog, "$dialog");
        if (editText.getText().toString().length() == 0) {
            C15626c.makeText(actionBlockListActivity, C17541R$string.trigger_cell_tower_enter_group_name_hint, 1).show();
        } else if (actionBlockListActivity.mo27225p2().mo29650h(editText.getText().toString()) != null) {
            C15626c.makeText(actionBlockListActivity, C17541R$string.action_block_name_already_exists, 1).show();
        } else {
            ActionBlock cloneActionBlock = actionBlock.cloneActionBlock(false);
            cloneActionBlock.setName(editText.getText().toString());
            cloneActionBlock.setDescription(editText2.getText().toString());
            actionBlockListActivity.mo27225p2().mo29647e(cloneActionBlock);
            actionBlockListActivity.mo27227r2().mo27247q();
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m14731v2(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: w2 */
    private final void m14732w2() {
        String str = Build.VERSION.SDK_INT < 31 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.BLUETOOTH_CONNECT";
        C1624a.f1072f.mo19234c(this).mo19240i(new String[]{str}, new C3743c(str, this));
    }

    /* renamed from: x2 */
    private final void m14733x2(ActionBlock actionBlock, boolean z) {
        startActivity(ActionBlockEditActivity.f9722X.mo27148a(this, this.f9808E, actionBlock, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m14734y2(Macro macro) {
        if (macro.isActionBlock) {
            ActionBlockEditActivity.C3674a aVar = ActionBlockEditActivity.f9722X;
            C13706o.m87927d(macro, "null cannot be cast to non-null type com.arlosoft.macrodroid.actionblock.data.ActionBlock");
            startActivity(aVar.mo27148a(this, true, (ActionBlock) macro, false));
            return;
        }
        Intent intent = new Intent(this, EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        startActivity(intent);
    }

    /* renamed from: z2 */
    private final void m14735z2(Macro macro) {
        C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE);
        CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList == null) {
            categoryList = new CategoryList(new ArrayList());
        }
        String category = macro.getCategory();
        C13706o.m87928e(category, "macro.category");
        Category categoryByName = categoryList.getCategoryByName(category);
        if (categoryByName == null || !categoryByName.isLocked()) {
            m14734y2(macro);
            return;
        }
        new C6409o(q, (C6409o.C6411b) null).mo32449u(this, getString(C17541R$string.enter_category_lock_password), "", C5163j2.m19992J0(this), 0, new C3745d(this, macro));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7991b c = C7991b.m33293c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f9807D = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        this.f9808E = getIntent().getBooleanExtra("is_select_mode", false);
        mo27227r2().mo27248r(this.f9808E);
        getLifecycle().addObserver(mo27227r2());
        C7991b bVar = this.f9807D;
        if (bVar == null) {
            C13706o.m87945v("binding");
            bVar = null;
        }
        setSupportActionBar(bVar.f19222p);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (this.f9808E) {
            ActionBar supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.setTitle((int) C17541R$string.select_action_block);
            }
        } else {
            ActionBar supportActionBar3 = getSupportActionBar();
            if (supportActionBar3 != null) {
                supportActionBar3.setTitle((int) C17541R$string.action_blocks);
            }
        }
        C7991b bVar2 = this.f9807D;
        if (bVar2 == null) {
            C13706o.m87945v("binding");
            bVar2 = null;
        }
        FloatingActionButton floatingActionButton = bVar2.f19213g;
        C13706o.m87928e(floatingActionButton, "binding.fab");
        C4666m.m18147o(floatingActionButton, (C13640g) null, new C3746e(this, (C13635d<? super C3746e>) null), 1, (Object) null);
        m14723k2();
        m14721i2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.action_blocks_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_search);
        this.f9806C = findItem;
        View actionView = MenuItemCompat.getActionView(findItem);
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        ((SearchView) actionView).setOnQueryTextListener(new C3747f(this));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == 2131363223) {
            m14698E2();
            return true;
        } else if (itemId != 2131363235) {
            return true;
        } else {
            m14732w2();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        mo27226q2().mo37357O();
        mo27226q2().mo37363x();
        mo27226q2().mo37359r();
        super.onPause();
    }

    /* renamed from: p2 */
    public final C4915a mo27225p2() {
        C4915a aVar = this.f9804A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("actionBlockStore");
        return null;
    }

    /* renamed from: q2 */
    public final C7366i mo27226q2() {
        C7366i iVar = this.f9811z;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("nearbyHelper");
        return null;
    }

    /* renamed from: r2 */
    public final ActionBlockListViewModel mo27227r2() {
        ActionBlockListViewModel actionBlockListViewModel = this.f9810s;
        if (actionBlockListViewModel != null) {
            return actionBlockListViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }
}
