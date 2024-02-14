package com.arlosoft.macrodroid.macrolist;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.content.p006pm.ShortcutManagerCompat;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.ShortcutActivity;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.events.CategoryEnabledStateChangeEvent;
import com.arlosoft.macrodroid.events.MacroDeletedEvent;
import com.arlosoft.macrodroid.events.MacroEnabledStateChangeEvent;
import com.arlosoft.macrodroid.events.MacroRunEvent;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.model.TemplateCategory;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.C6409o;
import com.arlosoft.macrodroid.utils.C6422r0;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import com.jaredrummler.android.colorpicker.C11680c;
import com.melnykov.fab.FloatingActionButton;
import com.varunest.sparkbutton.SparkButton2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.cachapa.expandablelayout.ExpandableLayout;
import org.apache.commons.cli.HelpFormatter;
import p081e1.C7264a;
import p093g2.C12264c;
import p093g2.C12266d;
import p093g2.C12268e;
import p093g2.C12269e0;
import p093g2.C12270f;
import p093g2.C12271f0;
import p093g2.C12272g;
import p093g2.C12273g0;
import p093g2.C12274h;
import p093g2.C12275h0;
import p093g2.C12276i;
import p093g2.C12277i0;
import p093g2.C12278j;
import p093g2.C12279j0;
import p093g2.C12280k;
import p093g2.C12281k0;
import p093g2.C12282l;
import p093g2.C12284m;
import p093g2.C12285n;
import p093g2.C12286o;
import p093g2.C12287p;
import p093g2.C12288q;
import p093g2.C12290s;
import p093g2.C12294w;
import p093g2.C12295x;
import p093g2.C12296y;
import p093g2.C12297z;
import p093g2.C7328a;
import p099h1.C7361a;
import p100h2.C7366i;
import p142p0.C8056a;
import p148q0.C8151a;
import p149q1.C8157f;
import p154r0.C8184d;
import p161s1.C10180a;
import p172u1.C10283c;
import p215b8.C11102b;
import p245de.greenrobot.event.EventBusException;
import p256eu.davidea.flexibleadapter.common.SmoothScrollLinearLayoutManager;
import p286i9.C12454b;
import p286i9.C12476d;
import p296j9.C13309a;
import p316l9.C15608g;
import p316l9.C15609h;
import p319lc.C15626c;
import p331n6.C15755a;
import p346o8.C15819a;
import p440y9.C16971a;
import p448z9.C17070a;

public class MacroListFragment extends C8184d implements C6409o.C6411b {

    /* renamed from: A */
    private MenuItem f12423A;

    /* renamed from: B */
    private MenuItem f12424B;

    /* renamed from: C */
    private MenuItem f12425C;

    /* renamed from: D */
    private MenuItem f12426D;

    /* renamed from: E */
    private MenuItem f12427E;

    /* renamed from: F */
    private MenuItem f12428F;

    /* renamed from: G */
    private boolean f12429G;

    /* renamed from: H */
    private boolean f12430H;

    /* renamed from: I */
    private boolean f12431I;

    /* renamed from: J */
    private SearchView f12432J;

    /* renamed from: K */
    private FloatingActionButton f12433K;

    /* renamed from: L */
    private TextView f12434L;

    /* renamed from: M */
    private ViewGroup f12435M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C12454b<C15608g> f12436N;

    /* renamed from: O */
    private int f12437O;

    /* renamed from: P */
    private C7264a f12438P;

    /* renamed from: Q */
    private CategoryList f12439Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public List<C15608g> f12440R;

    /* renamed from: S */
    private Set<String> f12441S;

    /* renamed from: T */
    private Collator f12442T;

    /* renamed from: U */
    private boolean f12443U = true;

    /* renamed from: V */
    private C7328a f12444V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public Set<String> f12445W = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public Set<String> f12446X = new HashSet();

    /* renamed from: Y */
    private C6409o f12447Y;

    /* renamed from: Z */
    private C17070a f12448Z = new C17070a();

    /* renamed from: a0 */
    private boolean f12449a0;

    /* renamed from: d */
    C5070a f12450d;
    @BindView(2131362568)
    ImageView dismissButton;
    @BindView(2131363127)
    TextView emptyTextView;
    @BindView(2131363128)
    View emptyView;

    /* renamed from: f */
    C4083b f12451f;
    @BindView(2131362778)
    SparkButton2 favouriteButton;
    @BindView(2131362779)
    TextView favouritesHint;

    /* renamed from: g */
    C7366i f12452g;
    @BindView(2131363357)
    ExpandableLayout nearbySharePanel;

    /* renamed from: o */
    C4915a f12453o;

    /* renamed from: p */
    C7361a f12454p;
    @BindView(2131363593)
    RecyclerView recyclerView;

    /* renamed from: s */
    private List<Macro> f12455s;
    @BindView(2131364039)
    ViewGroup titleContainer;
    @BindView(2131364042)
    TextView titleText;
    @BindView(2131364057)
    Toolbar toolbar;

    /* renamed from: z */
    private MenuItem f12456z;

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$a */
    class C4941a implements C15755a {

        /* renamed from: a */
        final /* synthetic */ Macro f12457a;

        C4941a(Macro macro) {
            this.f12457a = macro;
        }

        /* renamed from: U */
        public void mo24603U(int i, int i2) {
            this.f12457a.setHeadingColor(i2);
            C4934n.m18998M().mo29702s0();
            MacroListFragment.this.m19123M2();
        }

        /* renamed from: V0 */
        public void mo24604V0(int i) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$b */
    class C4942b implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ MacroListCategoryHeader f12459a;

        /* renamed from: b */
        final /* synthetic */ int f12460b;

        /* renamed from: c */
        final /* synthetic */ Category f12461c;

        C4942b(MacroListCategoryHeader macroListCategoryHeader, int i, Category category) {
            this.f12459a = macroListCategoryHeader;
            this.f12460b = i;
            this.f12461c = category;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            MacroListFragment.this.f12446X.add(this.f12459a.mo29720z().getName());
            this.f12459a.mo29715E(true);
            MacroListFragment.this.f12436N.notifyItemChanged(MacroListFragment.this.f12436N.mo68881b1(this.f12459a));
            MacroListFragment.this.f12436N.mo68856J0(this.f12460b);
            MacroListFragment.this.f12445W.add(this.f12461c.getName());
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$c */
    class C4943c implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ String f12463a;

        C4943c(String str) {
            this.f12463a = str;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            MacroListFragment.this.m19208y1(this.f12463a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$d */
    class C4944d implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ String f12465a;

        C4944d(String str) {
            this.f12465a = str;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            MacroListFragment.this.m19205x1(this.f12465a, true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$e */
    class C4945e implements C15755a {

        /* renamed from: a */
        final /* synthetic */ int f12467a;

        /* renamed from: c */
        final /* synthetic */ String f12468c;

        /* renamed from: d */
        final /* synthetic */ Category f12469d;

        C4945e(int i, String str, Category category) {
            this.f12467a = i;
            this.f12468c = str;
            this.f12469d = category;
        }

        /* renamed from: U */
        public void mo24603U(int i, int i2) {
            MacroListFragment macroListFragment = MacroListFragment.this;
            int i3 = this.f12467a;
            String str = this.f12468c;
            Category category = this.f12469d;
            boolean isExpanded = category != null ? category.isExpanded() : true;
            Category category2 = this.f12469d;
            macroListFragment.m19109H2(i3, i2, str, isExpanded, category2 != null ? category2.isLocked() : false);
        }

        /* renamed from: V0 */
        public void mo24604V0(int i) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$f */
    class C4946f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12471a;

        /* renamed from: c */
        final /* synthetic */ EditText f12472c;

        C4946f(Button button, EditText editText) {
            this.f12471a = button;
            this.f12472c = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12471a.setEnabled(!TextUtils.isEmpty(this.f12472c.getText()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$g */
    class C4947g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f12474a;

        /* renamed from: c */
        final /* synthetic */ EditText f12475c;

        C4947g(Button button, EditText editText) {
            this.f12474a = button;
            this.f12475c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f12474a.setEnabled(this.f12475c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$h */
    class C4948h extends C12454b {
        C4948h(List list, Object obj, boolean z) {
            super(list, obj, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: K1 */
        public void mo29732K1() {
            super.mo29732K1();
            MacroListFragment.this.m19121L2();
            MacroListFragment.this.f12436N.notifyDataSetChanged();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$i */
    class C4949i implements C15819a {
        C4949i() {
        }

        /* renamed from: a */
        public void mo29733a(ImageView imageView, boolean z) {
            C5163j2.m20284v5(MacroListFragment.this.requireActivity(), z);
            MacroListFragment.this.refresh();
        }

        /* renamed from: b */
        public void mo29734b(ImageView imageView, boolean z) {
        }

        /* renamed from: c */
        public void mo29735c(ImageView imageView, boolean z) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$j */
    class C4950j extends RecyclerView.AdapterDataObserver {
        C4950j() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            if (obj == C12476d.COLLAPSED) {
                MacroListFragment.this.m19103F2();
            } else if (obj == C12476d.EXPANDED) {
                MacroListFragment.this.m19103F2();
            }
            MacroListFragment macroListFragment = MacroListFragment.this;
            macroListFragment.m19187p1(macroListFragment.toolbar.getMenu(), false);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$k */
    class C4951k implements C7366i.C7368b {
        C4951k() {
        }

        /* renamed from: a */
        public void mo27232a(String str) {
            MacroListFragment.this.nearbySharePanel.mo75513c();
            MacroListFragment.this.m19117K1(str);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$l */
    class C4952l implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ MacroListCategoryHeader f12481a;

        /* renamed from: b */
        final /* synthetic */ boolean f12482b;

        C4952l(MacroListCategoryHeader macroListCategoryHeader, boolean z) {
            this.f12481a = macroListCategoryHeader;
            this.f12482b = z;
        }

        /* renamed from: a */
        public void mo24616a() {
            MacroListFragment.this.m19184o1(this.f12481a, !this.f12482b);
        }

        /* renamed from: b */
        public void mo24617b() {
            MacroListFragment.this.f12446X.add(this.f12481a.mo29720z().getName());
            MacroListFragment.this.m19184o1(this.f12481a, this.f12482b);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$m */
    class C4953m implements SearchView.OnCloseListener {
        C4953m() {
        }

        public boolean onClose() {
            MacroListFragment.this.titleContainer.setVisibility(0);
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$n */
    class C4954n implements View.OnClickListener {
        C4954n() {
        }

        public void onClick(View view) {
            MacroListFragment.this.titleContainer.setVisibility(8);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$o */
    class C4955o implements SearchView.OnQueryTextListener {
        C4955o() {
        }

        public boolean onQueryTextChange(String str) {
            MacroListFragment.this.f12436N.mo68880a2(str);
            if (MacroListFragment.this.f12440R != null) {
                MacroListFragment.this.f12436N.mo68862P0(new ArrayList(MacroListFragment.this.f12440R));
            }
            MacroListFragment.this.f12436N.notifyDataSetChanged();
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListFragment$p */
    class C4956p implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f12487a;

        C4956p(AlertDialog alertDialog) {
            this.f12487a = alertDialog;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12487a.getButton(-1).setEnabled(charSequence.length() > 0);
        }
    }

    /* renamed from: A1 */
    private void m19088A1() {
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(requireActivity());
        if (!this.f12451f.mo28009e().mo28008a() && size >= f0) {
            C4061t1.m15957G0(requireActivity(), this.f12450d);
        } else if (C5163j2.m20122b3(requireActivity())) {
            m19171i1();
        } else {
            m19193r1();
        }
    }

    /* renamed from: A2 */
    private void m19089A2(Macro macro) {
        int i;
        if (macro.getHeadingColor() != 0) {
            i = macro.getHeadingColor();
        } else {
            Category categoryByName = this.f12439Q.getCategoryByName(macro.getCategory());
            if (categoryByName != null) {
                i = categoryByName.getColor();
            } else {
                i = ContextCompat.getColor(requireActivity(), C17528R$color.default_macro_tile_color);
            }
        }
        C11680c a = C11680c.m81798g0().mo65734d(i).mo65739i(getContext().getResources().getIntArray(C17525R$array.macro_list_heading_colors)).mo65737g(C17541R$string.select_color).mo65741k(17039370).mo65740j(C17541R$string.icon_tint_color_presets).mo65736f(C17541R$string.color_picker_custom_color_short_label).mo65731a();
        a.mo65718m0(new C4941a(macro));
        a.show(getChildFragmentManager(), "");
    }

    /* renamed from: B2 */
    private void m19091B2(Macro macro) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.enter_category);
        appCompatDialog.setTitle((int) C17541R$string.new_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_category_text);
        editText.addTextChangedListener(new C4947g(button, editText));
        button.setOnClickListener(new C12290s(this, macro, editText, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C12280k(appCompatDialog));
        appCompatDialog.show();
        C4666m.m18141i(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public void m19198t2(MacroListCategoryHeader macroListCategoryHeader) {
        int b1 = this.f12436N.mo68881b1(macroListCategoryHeader);
        Category categoryByName = this.f12439Q.getCategoryByName(macroListCategoryHeader.mo29720z().getName());
        if (categoryByName == null) {
            categoryByName = macroListCategoryHeader.mo29720z();
        }
        boolean z = true;
        if (!macroListCategoryHeader.mo74943c()) {
            if (categoryByName == null || !categoryByName.isLocked() || this.f12446X.contains(categoryByName.getName())) {
                z = false;
            }
            if (z) {
                this.f12447Y.mo32449u(requireActivity(), getString(C17541R$string.unlock_category), macroListCategoryHeader.mo29720z().getName(), C5163j2.m19992J0(requireContext()), 0, new C4942b(macroListCategoryHeader, b1, categoryByName));
                return;
            }
            this.f12436N.mo68856J0(b1);
            m19204w2(categoryByName, Boolean.TRUE);
            return;
        }
        this.f12436N.mo68845B0(b1, true);
        if (categoryByName != null && this.f12445W.contains(categoryByName.getName())) {
            this.f12445W.remove(categoryByName.getName());
        }
        m19204w2(categoryByName, Boolean.FALSE);
    }

    /* renamed from: C2 */
    private void m19094C2() {
        this.f12424B.setVisible(m19111I1(1));
    }

    /* renamed from: D1 */
    private void m19096D1(@NonNull String str) {
        Category categoryByName = this.f12439Q.getCategoryByName(str);
        boolean z = categoryByName != null && categoryByName.isLocked();
        String[] strArr = new String[6];
        strArr[0] = getString(C17541R$string.select_color);
        strArr[1] = getString(C17541R$string.rename_category);
        strArr[2] = getString(C17541R$string.export_category);
        strArr[3] = getString(z ? C17541R$string.remove_category_lock : C17541R$string.lock_category);
        strArr[4] = getString(C17541R$string.delete_category);
        strArr[5] = getString(C17541R$string.add_macro);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((CharSequence) str).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C12279j0(this, str, z, categoryByName));
        builder.create().show();
    }

    /* renamed from: D2 */
    private void m19097D2(long j, long j2) {
        Iterator<C15609h> it = this.f12436N.mo68882c1().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((MacroListCategoryHeader) it.next()).mo74946n().iterator();
            while (true) {
                if (it2.hasNext()) {
                    MacroListItem macroListItem = (MacroListItem) it2.next();
                    if (macroListItem.mo29740A().getGUID() == j) {
                        macroListItem.mo29743E(j2);
                        this.f12436N.mo68881b1(macroListItem);
                        this.f12436N.mo68894i2(macroListItem);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: E1 */
    private void m19099E1(@NonNull MacroListCategoryHeader macroListCategoryHeader, boolean z) {
        if (macroListCategoryHeader.mo74943c() || !macroListCategoryHeader.mo29720z().isLocked() || this.f12446X.contains(macroListCategoryHeader.mo29720z().getName())) {
            m19184o1(macroListCategoryHeader, z);
        } else {
            this.f12447Y.mo32449u(requireActivity(), getString(C17541R$string.enter_password), macroListCategoryHeader.mo29720z().getName(), C5163j2.m19992J0(requireContext()), 0, new C4952l(macroListCategoryHeader, z));
        }
    }

    /* renamed from: E2 */
    private void m19100E2(@NonNull String str) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.enter_category);
        appCompatDialog.setTitle((int) C17541R$string.rename_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_category_text);
        editText.setText(str);
        editText.setSelection(str.length());
        editText.addTextChangedListener(new C4946f(button, editText));
        button.setOnClickListener(new C12288q(this, appCompatDialog, editText, str));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C12276i(appCompatDialog));
        appCompatDialog.show();
        C4666m.m18141i(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public void m19191q2(MacroListItem macroListItem) {
        if (C5163j2.m19986I1(requireContext())) {
            C12454b<C15608g> bVar = this.f12436N;
            bVar.mo68865R1(bVar.mo68881b1(macroListItem));
            if (this.f12436N.getItemCount() <= 1) {
                refresh();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public void m19103F2() {
        if (this.f12439Q != null) {
            for (C15608g next : this.f12436N.mo68869U0()) {
                if (next instanceof MacroListCategoryHeader) {
                    MacroListCategoryHeader macroListCategoryHeader = (MacroListCategoryHeader) next;
                    Category z = macroListCategoryHeader.mo29720z();
                    this.f12439Q.setCategory(new Category(z.getName(), z.getColor(), macroListCategoryHeader.mo74943c(), z.isLocked()));
                }
            }
            this.f12438P.mo37132b(Category.CATEGORIES_KEY, this.f12439Q);
        }
    }

    /* renamed from: G1 */
    private void m19105G1(@NonNull Macro macro) {
        m19200u2(macro, false);
    }

    /* renamed from: G2 */
    private void m19106G2(@NonNull String str) {
        int i;
        Category categoryByName = this.f12439Q.getCategoryByName(str);
        if (categoryByName != null) {
            i = categoryByName.getColor();
        } else {
            i = ContextCompat.getColor(requireActivity(), C17528R$color.default_macro_tile_color);
        }
        C11680c a = C11680c.m81798g0().mo65734d(i).mo65739i(getContext().getResources().getIntArray(C17525R$array.macro_list_heading_colors)).mo65737g(C17541R$string.select_color).mo65740j(C17541R$string.icon_tint_color_presets).mo65741k(17039370).mo65736f(C17541R$string.color_picker_custom_color_short_label).mo65731a();
        a.mo65718m0(new C4945e(i, str, categoryByName));
        a.show(getChildFragmentManager(), "");
    }

    /* renamed from: H1 */
    private void m19108H1(@NonNull Macro macro) {
        String[] strArr = {getString(C17541R$string.edit), getString(C17541R$string.delete), getString(C17541R$string.select_category), getString(C17541R$string.select_color), getString(C17541R$string.menu_run), getString(C17541R$string.clone_macro), getString(C17541R$string.menu_share)};
        String[] strArr2 = {getString(C17541R$string.edit), getString(C17541R$string.delete), getString(C17541R$string.select_category), getString(C17541R$string.select_color), getString(C17541R$string.menu_run), getString(C17541R$string.clone_macro), getString(C17541R$string.menu_share), getString(C17541R$string.create_home_screen_shortcut), getString(C17541R$string.edit_macro_screen_show_log)};
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C17542R$style.Theme_App_Dialog);
        AlertDialog.Builder title = builder.setTitle((CharSequence) macro.getName());
        if (Build.VERSION.SDK_INT >= 23 && ShortcutManagerCompat.isRequestPinShortcutSupported(requireActivity())) {
            strArr = strArr2;
        }
        title.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C12269e0(this, macro));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public void m19109H2(int i, int i2, String str, boolean z, boolean z2) {
        String[] strArr = {getString(C17541R$string.category_only), getString(C17541R$string.category_plus_macros)};
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C12275h0(this, str, i2, z, z2, i));
        builder.create().show();
    }

    /* renamed from: I1 */
    private boolean m19111I1(int i) {
        List<Macro> z = C4934n.m18998M().mo29710z();
        ArraySet arraySet = new ArraySet();
        for (Macro category : z) {
            arraySet.add(category.getCategory());
            if (arraySet.size() > i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I2 */
    private void m19112I2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        View inflate = getLayoutInflater().inflate(C17535R$layout.dialog_set_max_lines, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.max_lines);
        editText.setText(String.valueOf(C5163j2.m19947D0(requireActivity())));
        editText.setSelection(editText.getText().length());
        builder.setTitle((int) C17541R$string.set_max_lines);
        builder.setView(inflate);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12296y(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12268e.f58903a);
        AlertDialog show = builder.show();
        editText.addTextChangedListener(new C4956p(show));
        show.getButton(-1).setEnabled(editText.getText().length() > 0);
        show.getWindow().setSoftInputMode(5);
    }

    /* renamed from: J1 */
    private void m19114J1() {
        String str = Build.VERSION.SDK_INT < 31 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.BLUETOOTH_CONNECT";
        this.f12448Z.mo62358a(new C11102b((Fragment) this).mo62231o(str).mo79679I(C16971a.m100210a()).mo79685P(new C12295x(this)));
    }

    /* renamed from: J2 */
    private void m19115J2() {
        startActivity(new Intent(requireActivity(), UpgradeActivity2.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public void m19117K1(String str) {
        Macro macro = (Macro) C10283c.m40416f().mo63976j(str, Macro.class);
        macro.setNewRandomGUID();
        C8056a.m33601a(this.f12453o, macro, macro.getActionBlocksToImport(), true);
        AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_add_macro_from_nearby);
        appCompatDialog.setTitle((int) C17541R$string.add_macro);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.descriptionText);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.catgorySpinner);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.nameText);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        editText2.setText(macro.getName());
        editText.setText(TextUtils.isEmpty(macro.getDescription()) ? "" : macro.getDescription());
        int i = 0;
        List<TemplateCategory> allCategories = TemplateCategory.getAllCategories(requireContext(), false);
        ArrayList arrayList = new ArrayList();
        for (TemplateCategory name : allCategories) {
            arrayList.add(name.getName());
        }
        arrayList.add(0, getString(C17541R$string.uncategorized));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        while (true) {
            if (i >= arrayList.size()) {
                break;
            } else if (((String) arrayList.get(i)).equals(macro.getCategory())) {
                spinner.setSelection(i);
                break;
            } else {
                i++;
            }
        }
        button.setOnClickListener(new C12287p(this, editText2, macro, spinner, editText, appCompatDialog));
        button2.setOnClickListener(new C12278j(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public boolean m19145W1(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C17532R$id.categories_collapsed_default:
                boolean z = !this.f12424B.isChecked();
                this.f12424B.setChecked(z);
                C5163j2.m20306y3(requireActivity(), z);
                break;
            case C17532R$id.menu_delete_all:
                m19211z2();
                break;
            case C17532R$id.menu_descriptions:
                this.f12431I = !this.f12431I;
                C5163j2.m20276u5(requireActivity(), this.f12431I);
                this.f12428F.setTitle(this.f12431I ? C17541R$string.hide_descriptions : C17541R$string.show_descriptions);
                m19123M2();
                break;
            case C17532R$id.menu_expand_collapse_categories:
                CharSequence title = this.f12423A.getTitle();
                int i = C17541R$string.collapse_categories;
                int i2 = 0;
                if (title.equals(getString(C17541R$string.collapse_categories))) {
                    for (int i3 = 0; i3 < this.f12436N.getItemCount(); i3++) {
                        this.f12436N.mo68843A0(i3);
                    }
                    this.f12445W.clear();
                } else {
                    while (i2 < this.f12436N.getItemCount()) {
                        C15608g gVar = this.f12436N.mo68869U0().get(i2);
                        if (gVar instanceof MacroListCategoryHeader) {
                            MacroListCategoryHeader macroListCategoryHeader = (MacroListCategoryHeader) gVar;
                            if (!macroListCategoryHeader.mo29720z().isLocked() || this.f12446X.contains(macroListCategoryHeader.mo29720z().getName())) {
                                this.f12436N.mo68856J0(this.f12436N.mo68881b1(macroListCategoryHeader));
                            }
                        }
                        i2++;
                    }
                    i2 = 1;
                }
                MenuItem menuItem2 = this.f12423A;
                if (i2 == 0) {
                    i = C17541R$string.expand_categories;
                }
                menuItem2.setTitle(i);
                this.f12423A.setIcon(m19181n1() ? C17530R$drawable.unfold_less_horizontal : C17530R$drawable.unfold_more_horizontal);
                m19103F2();
                break;
            case C17532R$id.menu_import_from_nearby:
                m19114J1();
                break;
            case C17532R$id.menu_last_edited:
                this.f12430H = !this.f12430H;
                C5163j2.m20300x5(requireActivity(), this.f12430H);
                this.f12427E.setChecked(this.f12430H);
                m19123M2();
                break;
            case C17532R$id.menu_last_invoked:
                this.f12429G = !this.f12429G;
                C5163j2.m20292w5(requireActivity(), this.f12429G);
                this.f12426D.setChecked(this.f12429G);
                m19123M2();
                break;
            case C17532R$id.menu_set_max_lines:
                m19112I2();
                break;
            case C17532R$id.menu_show_macro_details:
                boolean z2 = !this.f12425C.isChecked();
                this.f12425C.setChecked(z2);
                C5163j2.m19975G4(requireActivity(), z2);
                refresh();
                break;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ void m19120L1(String str, boolean z, DialogInterface dialogInterface, int i) {
        ArrayList<Macro> arrayList = new ArrayList<>();
        for (Macro next : C4934n.m18998M().mo29710z()) {
            if (next.getCategory().equals(str)) {
                arrayList.add(next);
            }
        }
        for (Macro k0 : arrayList) {
            C4934n.m18998M().mo29692k0(k0, false);
        }
        C4934n.m18998M().mo29702s0();
        List<String> A = C4061t1.m15944A(requireActivity());
        if (A != null) {
            A.remove(str);
            C5163j2.m20258s3(requireActivity(), A);
            refresh();
        }
        CategoryList k = this.f12447Y.mo32447k();
        k.deleteCategory(str);
        this.f12438P.mo37132b(Category.CATEGORIES_KEY, k);
        if (z) {
            this.f12447Y.mo32446j(requireContext());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public void m19121L2() {
        if (this.f12436N.getItemCount() == 0) {
            if (this.f12455s.size() != 0) {
                this.emptyTextView.setText(C17541R$string.no_macros_found);
            } else if (C5163j2.m19986I1(getContext())) {
                this.emptyTextView.setText(C17541R$string.no_favourites_selected);
            } else {
                this.emptyTextView.setText(C17541R$string.no_macros_configured);
            }
            this.emptyView.setVisibility(0);
            return;
        }
        this.emptyView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d5  */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m19123M2() {
        /*
            r37 = this;
            r0 = r37
            e1.a r1 = r0.f12438P
            java.lang.Class<com.arlosoft.macrodroid.categories.CategoryList> r2 = com.arlosoft.macrodroid.categories.CategoryList.class
            java.lang.String r3 = "CategoryList"
            java.lang.Object r1 = r1.mo37133c(r3, r2)
            com.arlosoft.macrodroid.categories.CategoryList r1 = (com.arlosoft.macrodroid.categories.CategoryList) r1
            r0.f12439Q = r1
            if (r1 == 0) goto L_0x0018
            java.util.List r1 = r1.getCategories()
            if (r1 != 0) goto L_0x0024
        L_0x0018:
            com.arlosoft.macrodroid.categories.CategoryList r1 = new com.arlosoft.macrodroid.categories.CategoryList
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.<init>(r2)
            r0.f12439Q = r1
        L_0x0024:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<l9.g> r2 = r0.f12440R
            if (r2 == 0) goto L_0x0041
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r2.next()
            l9.g r3 = (p316l9.C15608g) r3
            r1.add(r3)
            goto L_0x0031
        L_0x0041:
            com.arlosoft.macrodroid.database.a r1 = com.arlosoft.macrodroid.database.C4373a.m17336h()
            java.util.HashMap r1 = r1.mo28642k()
            android.content.Context r2 = r37.requireContext()
            boolean r2 = com.arlosoft.macrodroid.settings.C5163j2.m19986I1(r2)
            java.lang.String r3 = ")</small>"
            java.lang.String r4 = " <small>("
            r5 = 2131954066(0x7f130992, float:1.954462E38)
            r6 = 0
            if (r2 == 0) goto L_0x00af
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r2 = r2.mo29681L()
            r0.f12455s = r2
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.HashMap r2 = r2.mo29678H()
            android.widget.TextView r7 = r0.favouritesHint
            r7.setVisibility(r6)
            com.arlosoft.macrodroid.macro.n r7 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r7 = r7.mo29710z()
            int r7 = r7.size()
            android.widget.TextView r8 = r0.titleText
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = r0.getString(r5)
            r9.append(r5)
            r9.append(r4)
            java.util.List<com.arlosoft.macrodroid.macro.Macro> r4 = r0.f12455s
            int r4 = r4.size()
            r9.append(r4)
            java.lang.String r4 = "/"
            r9.append(r4)
            r9.append(r7)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            r8.setText(r3)
            goto L_0x00f0
        L_0x00af:
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r2 = r2.mo29672B(r6)
            r0.f12455s = r2
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.HashMap r2 = r2.mo29677G()
            android.widget.TextView r7 = r0.favouritesHint
            r8 = 8
            r7.setVisibility(r8)
            android.widget.TextView r7 = r0.titleText
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = r0.getString(r5)
            r8.append(r5)
            r8.append(r4)
            java.util.List<com.arlosoft.macrodroid.macro.Macro> r4 = r0.f12455s
            int r4 = r4.size()
            r8.append(r4)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            r7.setText(r3)
        L_0x00f0:
            android.view.MenuItem r3 = r0.f12456z
            r4 = 1
            if (r3 == 0) goto L_0x0103
            java.util.List<com.arlosoft.macrodroid.macro.Macro> r5 = r0.f12455s
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00ff
            r5 = 1
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            r3.setEnabled(r5)
        L_0x0103:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f12440R = r3
            androidx.fragment.app.FragmentActivity r3 = r37.requireActivity()
            java.util.Set r3 = com.arlosoft.macrodroid.settings.C5163j2.m19991J(r3)
            r5 = 100000(0x186a0, float:1.4013E-40)
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Set r8 = r2.keySet()
            r7.<init>(r8)
            g2.d0 r8 = new g2.d0
            r8.<init>(r0)
            java.util.Collections.sort(r7, r8)
            androidx.fragment.app.FragmentActivity r8 = r37.requireActivity()
            boolean r8 = com.arlosoft.macrodroid.settings.C5163j2.m20048R0(r8)
            java.util.Iterator r7 = r7.iterator()
            r5 = 0
            r11 = 100000(0x186a0, float:1.4013E-40)
        L_0x0136:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0270
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            com.arlosoft.macrodroid.categories.CategoryList r10 = r0.f12439Q
            com.arlosoft.macrodroid.categories.Category r10 = r0.m19210z1(r10, r9)
            if (r10 != 0) goto L_0x015b
            com.arlosoft.macrodroid.categories.Category r10 = new com.arlosoft.macrodroid.categories.Category
            androidx.fragment.app.FragmentActivity r12 = r37.requireActivity()
            r13 = 2131099869(0x7f0600dd, float:1.7812103E38)
            int r12 = androidx.core.content.ContextCompat.getColor(r12, r13)
            r10.<init>(r9, r12, r4, r6)
            goto L_0x017d
        L_0x015b:
            boolean r12 = r10.isLocked()
            if (r12 == 0) goto L_0x017d
            java.util.Set<java.lang.String> r12 = r0.f12446X
            boolean r12 = r12.contains(r9)
            if (r12 != 0) goto L_0x017d
            com.arlosoft.macrodroid.categories.Category r12 = new com.arlosoft.macrodroid.categories.Category
            java.lang.String r13 = r10.getName()
            int r14 = r10.getColor()
            boolean r10 = r10.isLocked()
            r12.<init>(r13, r14, r6, r10)
            r29 = r12
            goto L_0x017f
        L_0x017d:
            r29 = r10
        L_0x017f:
            boolean r10 = r3.contains(r9)
            r30 = r10 ^ 1
            java.lang.Object r10 = r2.get(r9)
            r15 = r10
            java.util.List r15 = (java.util.List) r15
            g2.c0 r10 = new g2.c0
            r10.<init>(r0)
            java.util.Collections.sort(r15, r10)
            com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader r14 = new com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader
            int r31 = r11 + 1
            r13 = 1
            java.util.Set<java.lang.String> r10 = r0.f12446X
            boolean r16 = r10.contains(r9)
            g2.a0 r12 = new g2.a0
            r12.<init>(r0)
            g2.u r10 = new g2.u
            r10.<init>(r0, r9)
            g2.a r9 = r0.f12444V
            r17 = r9
            r9 = r14
            r18 = r10
            r10 = r29
            r19 = r12
            r12 = r30
            r6 = r14
            r14 = r16
            r32 = r15
            r15 = r19
            r16 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            g2.v r9 = new g2.v
            r9.<init>(r0, r6)
            r6.mo29716F(r9)
            java.util.Iterator r33 = r32.iterator()
            r14 = 0
        L_0x01cf:
            boolean r9 = r33.hasNext()
            if (r9 == 0) goto L_0x0262
            java.lang.Object r9 = r33.next()
            r12 = r9
            com.arlosoft.macrodroid.macro.Macro r12 = (com.arlosoft.macrodroid.macro.Macro) r12
            r9 = 0
            long r15 = r12.getGUID()
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
            boolean r11 = r1.containsKey(r11)
            if (r11 == 0) goto L_0x01fe
            long r9 = r12.getGUID()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r9 = r1.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
        L_0x01fe:
            r15 = r9
            com.arlosoft.macrodroid.macrolist.MacroListItem r13 = new com.arlosoft.macrodroid.macrolist.MacroListItem
            int r34 = r5 + 1
            boolean r11 = r0.f12429G
            long r17 = r12.getLastEditedTimestamp()
            boolean r10 = r0.f12430H
            boolean r9 = r0.f12431I
            int r19 = r32.size()
            r35 = r1
            int r1 = r19 + -1
            if (r14 != r1) goto L_0x021a
            r21 = 1
            goto L_0x021c
        L_0x021a:
            r21 = 0
        L_0x021c:
            g2.r r1 = new g2.r
            r22 = r1
            r1.<init>(r0, r12)
            g2.t r1 = new g2.t
            r23 = r1
            r1.<init>(r0, r12)
            g2.b0 r1 = new g2.b0
            r24 = r1
            r1.<init>(r0)
            r25 = 1
            g2.a r1 = r0.f12444V
            r26 = r1
            java.util.Set<java.lang.String> r1 = r0.f12446X
            r28 = r1
            r1 = r9
            r9 = r13
            r19 = r10
            r10 = r6
            r20 = r11
            r11 = r5
            r5 = r13
            r13 = r29
            r36 = r14
            r14 = r15
            r16 = r20
            r20 = r1
            r27 = r8
            r9.<init>(r10, r11, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1 = r30 ^ 1
            r5.mo29742D(r1)
            r6.mo74947w(r5)
            int r14 = r36 + 1
            r5 = r34
            r1 = r35
            goto L_0x01cf
        L_0x0262:
            r35 = r1
            java.util.List<l9.g> r1 = r0.f12440R
            r1.add(r6)
            r11 = r31
            r1 = r35
            r6 = 0
            goto L_0x0136
        L_0x0270:
            androidx.appcompat.widget.SearchView r1 = r0.f12432J
            boolean r1 = r1.isIconified()
            if (r1 != 0) goto L_0x02aa
            i9.b<l9.g> r1 = r0.f12436N
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            androidx.appcompat.widget.SearchView r3 = r0.f12432J
            java.lang.CharSequence r3 = r3.getQuery()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo68880a2(r2)
            i9.b<l9.g> r1 = r0.f12436N
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<l9.g> r3 = r0.f12440R
            r2.<init>(r3)
            r1.mo68862P0(r2)
            i9.b<l9.g> r1 = r0.f12436N
            r1.notifyDataSetChanged()
            goto L_0x02b1
        L_0x02aa:
            i9.b<l9.g> r1 = r0.f12436N
            java.util.List<l9.g> r2 = r0.f12440R
            r1.mo68889f2(r2)
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macrolist.MacroListFragment.m19123M2():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ void m19125N1(String str, Boolean bool) throws Exception {
        File w1;
        if (bool.booleanValue() && (w1 = m19203w1(str)) != null) {
            ArrayList arrayList = new ArrayList();
            Context requireContext = requireContext();
            arrayList.add(FileProvider.getUriForFile(requireContext, requireContext().getPackageName() + ".provider", w1));
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.addFlags(268435456);
            intent.setType("text/plain");
            try {
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                startActivity(Intent.createChooser(intent, getString(C17541R$string.export_category)));
            } catch (Exception e) {
                C15626c.makeText(requireActivity(), C17541R$string.export_failed, 0).show();
                C4878b.m18868g("Failed to export file: " + e.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m19127O1(String str, boolean z, Category category, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m19106G2(str);
        } else if (i == 1) {
            m19100E2(str);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        m19197t1(str);
                    }
                } else if (!z || this.f12446X.contains(category.getName())) {
                    m19205x1(str, false);
                } else {
                    this.f12447Y.mo32449u(requireActivity(), getString(C17541R$string.delete_category), str, C5163j2.m19992J0(requireContext()), 0, new C4944d(str));
                }
            } else if (z) {
                this.f12447Y.mo32450v(requireActivity(), str);
            } else {
                this.f12447Y.mo32448t(requireActivity(), str);
            }
        } else if (!z || this.f12446X.contains(category.getName())) {
            m19208y1(str);
        } else {
            this.f12447Y.mo32449u(requireActivity(), getString(C17541R$string.export_category), str, C5163j2.m19992J0(requireContext()), 0, new C4943c(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m19129P1(Macro macro, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m19200u2(macro, false);
        } else if (i == 1) {
            m19209y2(macro);
        } else if (i == 2) {
            m19206x2(macro);
        } else if (i == 3) {
            m19089A2(macro);
        } else if (i == 4) {
            m19202v2(macro);
        } else if (i == 5) {
            int size = C4934n.m18998M().mo29710z().size();
            int f0 = C5163j2.m20151f0(requireActivity());
            if (this.f12451f.mo28009e().mo28008a() || size < f0) {
                m19200u2(macro.cloneMacro(true, true), true);
            } else {
                C4061t1.m15957G0(requireActivity(), this.f12450d);
            }
        } else if (i == 6) {
            C6422r0.m24730d(requireActivity(), macro, this.f12453o);
        } else if (i == 7) {
            Intent intent = new Intent(requireActivity(), ShortcutActivity.class);
            intent.putExtra(C8157f.ITEM_TYPE, macro);
            startActivity(intent);
        } else if (i == 8) {
            SystemLogActivity.f12221H.mo29423a(requireActivity(), macro.getGUID());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void m19131Q1(View view) {
        this.nearbySharePanel.mo75513c();
        this.f12452g.mo37357O();
        this.f12452g.mo37363x();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ void m19133R1(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            this.nearbySharePanel.mo75515e();
            this.f12452g.mo37352C(new C4951k());
            this.dismissButton.setOnClickListener(new C12286o(this));
            this.f12452g.mo37355I("com.arlosoft.macrodroid.MACRO_SHARE");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m19135S1(EditText editText, Macro macro, Spinner spinner, EditText editText2, AppCompatDialog appCompatDialog, View view) {
        if (editText.getText().toString().isEmpty()) {
            C15626c.makeText(requireContext(), C17541R$string.enter_macro_name, 1).show();
        } else if (C4934n.m18998M().mo29684S(editText.getText().toString()) != null) {
            C15626c.makeText(requireContext(), C17541R$string.macro_name_already_exists, 1).show();
        } else {
            Macro cloneMacro = macro.cloneMacro(false, true);
            cloneMacro.setCategory(spinner.getSelectedItem().toString());
            cloneMacro.setName(editText.getText().toString());
            cloneMacro.setDescription(editText2.getText().toString());
            C4934n.m18998M().mo29699r(cloneMacro);
            for (ActionBlock next : this.f12453o.mo29648f()) {
                next.setIsBeingImported(false);
                this.f12453o.mo29652j(next);
            }
            refresh();
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m19139U1(View view) {
        m19088A1();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m19142V1(View view) {
        m19115J2();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static /* synthetic */ void m19148X1(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m19149Y1(DialogInterface dialogInterface, int i) {
        this.f12437O = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static /* synthetic */ void m19152Z1(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m19154a2(Macro macro, String[] strArr, DialogInterface dialogInterface, int i) {
        int i2 = this.f12437O;
        if (i2 == 0) {
            m19091B2(macro);
            return;
        }
        macro.setCategory(strArr[i2]);
        Category categoryByName = this.f12439Q.getCategoryByName(macro.getCategory());
        macro.setHeadingColor(0);
        if (categoryByName != null) {
            macro.setHeadingColor(categoryByName.getColor());
        }
        C4934n.m18998M().mo29702s0();
        m19123M2();
        m19094C2();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m19155b2(Macro macro, DialogInterface dialogInterface, int i) {
        if (macro != null) {
            C4878b.m18873l("Macro Deleted - " + macro.getName());
            C4934n.m18998M().mo29692k0(macro, true);
        }
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m19158d2(DialogInterface dialogInterface, int i) {
        C4934n.m18998M().mo29691j0();
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m19164f2(Macro macro, EditText editText, AppCompatDialog appCompatDialog, View view) {
        macro.setCategory(editText.getText().toString());
        C4934n.m18998M().mo29702s0();
        m19123M2();
        appCompatDialog.dismiss();
        m19094C2();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m19169h2(AppCompatDialog appCompatDialog, EditText editText, String str, View view) {
        appCompatDialog.dismiss();
        this.f12454p.mo37340e(requireContext(), str, editText.getText().toString());
        refresh();
    }

    /* renamed from: i1 */
    private void m19171i1() {
        startActivity(new Intent(requireActivity(), WizardActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m19174j2(String str, int i, boolean z, boolean z2, int i2, DialogInterface dialogInterface, int i3) {
        this.f12439Q.setCategory(new Category(str, i, z, z2));
        this.f12438P.mo37132b(Category.CATEGORIES_KEY, this.f12439Q);
        if (i3 == 0) {
            for (Macro next : C4934n.m18998M().mo29710z()) {
                if (next.getCategory().equals(str) && next.getHeadingColor() == 0) {
                    next.setHeadingColor(i2);
                }
            }
        } else if (i3 == 1) {
            for (Macro next2 : C4934n.m18998M().mo29710z()) {
                if (next2.getCategory().equals(str)) {
                    next2.setHeadingColor(i);
                }
            }
        }
        C4934n.m18998M().mo29702s0();
        m19123M2();
    }

    /* renamed from: k1 */
    private boolean m19175k1() {
        for (C15608g next : this.f12436N.mo68869U0()) {
            if ((next instanceof MacroListCategoryHeader) && !((MacroListCategoryHeader) next).mo74943c()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m19176k2(EditText editText, DialogInterface dialogInterface, int i) {
        int i2 = 1;
        try {
            int intValue = Integer.valueOf(editText.getText().toString()).intValue();
            if (intValue != 0) {
                i2 = intValue;
            }
        } catch (Exception unused) {
        }
        C5163j2.m20267t4(requireActivity(), i2);
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ boolean m19179m2(String str, View view) {
        m19096D1(str);
        return true;
    }

    /* renamed from: n1 */
    private boolean m19181n1() {
        for (C15608g next : this.f12436N.mo68869U0()) {
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

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m19182n2(MacroListCategoryHeader macroListCategoryHeader, CompoundButton compoundButton, boolean z) {
        m19099E1(macroListCategoryHeader, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public void m19184o1(@NonNull MacroListCategoryHeader macroListCategoryHeader, boolean z) {
        Set<String> J = C5163j2.m19991J(requireActivity());
        if (z) {
            J.remove(macroListCategoryHeader.mo29720z().getName());
        } else {
            J.add(macroListCategoryHeader.mo29720z().getName());
        }
        C5163j2.m19966F3(requireActivity(), J);
        macroListCategoryHeader.mo29714D(z);
        List<MacroListItem> n = macroListCategoryHeader.mo74946n();
        if (n != null) {
            for (MacroListItem A : n) {
                Macro A2 = A.mo29740A();
                if (A2 != null) {
                    boolean isEnabled = A2.isEnabled();
                    if (z && isEnabled) {
                        C4934n.m18998M().mo29708x(A2, false);
                    } else if (!z && isEnabled) {
                        C4934n.m18998M().mo29707w(A2, false);
                        A2.setEnabledFlag(true);
                    }
                }
            }
            C4934n.m18998M().mo29702s0();
        }
        for (MacroListItem D : macroListCategoryHeader.mo74946n()) {
            D.mo29742D(!z);
        }
        m19123M2();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m19185o2(Macro macro, View view) {
        m19105G1(macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public void m19187p1(Menu menu, boolean z) {
        try {
            this.f12423A = menu.findItem(C17532R$id.menu_expand_collapse_categories);
            boolean n1 = m19181n1();
            boolean k1 = m19175k1();
            int i = C17530R$drawable.unfold_less_horizontal;
            int i2 = C17541R$string.collapse_categories;
            if (z) {
                MenuItem menuItem = this.f12423A;
                if (!n1) {
                    i2 = C17541R$string.expand_categories;
                }
                menuItem.setTitle(i2);
                MenuItem menuItem2 = this.f12423A;
                if (!n1) {
                    i = C17530R$drawable.unfold_more_horizontal;
                }
                menuItem2.setIcon(i);
                return;
            }
            boolean equals = this.f12423A.getTitle().equals(getString(C17541R$string.expand_categories));
            if (equals && k1) {
                this.f12423A.setTitle(C17541R$string.collapse_categories);
                this.f12423A.setIcon(C17530R$drawable.unfold_less_horizontal);
            } else if (!equals && !n1) {
                this.f12423A.setTitle(C17541R$string.expand_categories);
                this.f12423A.setIcon(C17530R$drawable.unfold_more_horizontal);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ boolean m19188p2(Macro macro, View view) {
        m19108H1(macro);
        return true;
    }

    /* renamed from: q1 */
    private void m19190q1(Menu menu) {
        List<Macro> list;
        boolean z = true;
        m19187p1(menu, true);
        this.f12456z = menu.findItem(C17532R$id.menu_delete_all);
        MenuItem findItem = menu.findItem(C17532R$id.menu_descriptions);
        this.f12428F = findItem;
        findItem.setTitle(this.f12431I ? C17541R$string.hide_descriptions : C17541R$string.show_descriptions);
        MenuItem findItem2 = menu.findItem(C17532R$id.menu_last_invoked);
        this.f12426D = findItem2;
        findItem2.setChecked(this.f12429G);
        MenuItem findItem3 = menu.findItem(C17532R$id.menu_last_edited);
        this.f12427E = findItem3;
        findItem3.setChecked(this.f12430H);
        MenuItem findItem4 = menu.findItem(C17532R$id.menu_show_macro_details);
        this.f12425C = findItem4;
        findItem4.setChecked(C5163j2.m20048R0(requireActivity()));
        MenuItem findItem5 = menu.findItem(C17532R$id.categories_collapsed_default);
        this.f12424B = findItem5;
        findItem5.setChecked(C5163j2.m19930B(requireActivity()));
        this.f12424B.setVisible(this.f12441S.size() > 1);
        MenuItem menuItem = this.f12456z;
        if (!(menuItem == null || (list = this.f12455s) == null)) {
            if (list.size() <= 0) {
                z = false;
            }
            menuItem.setEnabled(z);
        }
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(C17532R$id.menu_search));
        this.f12432J = searchView;
        searchView.setOnCloseListener(new C4953m());
        this.f12432J.setOnSearchClickListener(new C4954n());
        this.f12432J.setMaxWidth(Integer.MAX_VALUE);
        this.f12432J.setElevation(0.0f);
        this.f12432J.setOnQueryTextListener(new C4955o());
        this.f12436N.notifyDataSetChanged();
    }

    /* renamed from: r1 */
    private void m19193r1() {
        m19197t1((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ int m19194r2(String str, String str2) {
        return this.f12442T.compare(str, str2);
    }

    /* access modifiers changed from: private */
    public void refresh() {
        m19123M2();
        m19121L2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ int m19196s2(Macro macro, Macro macro2) {
        return this.f12442T.compare(macro.getName(), macro2.getName());
    }

    /* renamed from: t1 */
    private void m19197t1(String str) {
        Macro macro = new Macro();
        macro.setCompleted(false);
        macro.setName("");
        if (str != null) {
            macro.setCategory(str);
        }
        C4934n.m18998M().mo29699r(macro);
        Intent intent = new Intent(requireActivity(), EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        intent.putExtra("adding_new_macro", true);
        startActivity(intent);
    }

    /* renamed from: u2 */
    private void m19200u2(@NonNull Macro macro, boolean z) {
        Intent intent = new Intent(requireActivity(), EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        intent.putExtra("IsClone", z);
        startActivity(intent);
    }

    /* renamed from: v2 */
    private void m19202v2(Macro macro) {
        try {
            if (macro.getTriggerList().size() > 0) {
                C4878b.m18873l("TESTING MACRO:" + macro.getName());
                macro.invokeActions(new TriggerContextInfo(macro.getTriggerList().get(0)), true);
                return;
            }
            C4878b.m18869h("Macro cannot be tested as it has no triggers.", macro.getGUID());
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            builder.setTitle((int) C17541R$string.macro_test_failed);
            builder.setMessage((int) C17541R$string.macro_cannot_be_run_without_trigger);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C12281k0.f58930a);
            builder.show();
        }
    }

    /* renamed from: w1 */
    private File m19203w1(@NonNull String str) {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter2;
        ActionBlock g;
        List<Macro> B = C4934n.m18998M().mo29672B(false);
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (Macro next : B) {
            if (next.getCategory().equals(str)) {
                arrayList.add(next);
            }
            Iterator<Action> it = next.getActions().iterator();
            while (it.hasNext()) {
                Action next2 = it.next();
                if ((next2 instanceof ActionBlockAction) && (g = this.f12453o.mo29649g(((ActionBlockAction) next2).mo24715x3())) != null) {
                    arraySet.add(g);
                }
            }
        }
        arrayList.addAll(arraySet);
        String s = C10283c.m40413c().mo64006e(Macro.class, new C4921g(requireActivity(), true, true, true)).mo64004c().mo63984s(arrayList);
        String replaceAll = str.replace(' ', '_').replaceAll("[\\\\/:*?\"<>|]", HelpFormatter.DEFAULT_OPT_PREFIX);
        File file = new File(requireContext().getFilesDir(), replaceAll + ".category");
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                outputStreamWriter2 = new OutputStreamWriter(fileOutputStream, "UTF8");
            } catch (Exception e) {
                e = e;
                outputStreamWriter2 = null;
                try {
                    C8151a.m33873n(new RuntimeException("Failed to write macro when sharing: " + e.getMessage()));
                    try {
                        outputStreamWriter.close();
                        fileOutputStream.close();
                    } catch (Exception unused) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        outputStreamWriter.close();
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
                th = th;
                outputStreamWriter.close();
                fileOutputStream.close();
                throw th;
            }
            try {
                outputStreamWriter2.write(s);
                outputStreamWriter2.close();
                try {
                    outputStreamWriter2.close();
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
                return file;
            } catch (Exception e2) {
                e = e2;
                C8151a.m33873n(new RuntimeException("Failed to write macro when sharing: " + e.getMessage()));
                outputStreamWriter.close();
                fileOutputStream.close();
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
            outputStreamWriter2 = null;
            C8151a.m33873n(new RuntimeException("Failed to write macro when sharing: " + e.getMessage()));
            outputStreamWriter.close();
            fileOutputStream.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            outputStreamWriter = null;
            th = th;
            outputStreamWriter.close();
            fileOutputStream.close();
            throw th;
        }
    }

    /* renamed from: w2 */
    private void m19204w2(Category category, Boolean bool) {
        this.f12439Q.setCategory(new Category(category.getName(), category.getColor(), bool.booleanValue(), category.isLocked()));
        this.f12438P.mo37132b(Category.CATEGORIES_KEY, this.f12439Q);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public void m19205x1(@NonNull String str, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((int) C17541R$string.delete_category);
        builder.setMessage((CharSequence) getString(C17541R$string.confirm_delete_category_confirm));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12277i0(this, str, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12270f.f58906a);
        builder.show();
    }

    /* renamed from: x2 */
    private void m19206x2(Macro macro) {
        this.f12437O = 0;
        List<String> A = C4061t1.m15944A(requireActivity());
        A.add(0, "[" + getString(C17541R$string.new_category) + "]");
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).equals(macro.getCategory())) {
                this.f12437O = i;
            }
        }
        String[] strArr = (String[]) A.toArray(new String[0]);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((int) C17541R$string.select_category);
        builder.setSingleChoiceItems((CharSequence[]) strArr, this.f12437O, (DialogInterface.OnClickListener) new C12285n(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12272g.f58909a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12273g0(this, macro, strArr));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public void m19208y1(@NonNull String str) {
        new C11102b(requireActivity()).mo62231o("android.permission.WRITE_EXTERNAL_STORAGE").mo79679I(C16971a.m100210a()).mo79685P(new C12297z(this, str));
    }

    /* renamed from: y2 */
    private void m19209y2(Macro macro) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((CharSequence) getString(C17541R$string.delete) + " " + macro.getName());
        builder.setMessage((int) C17541R$string.are_you_sure_delete_macro);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12271f0(this, macro));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12266d.f58901a);
        builder.show();
    }

    /* renamed from: z1 */
    private Category m19210z1(CategoryList categoryList, String str) {
        Category categoryByName = categoryList.getCategoryByName(str);
        return this.f12445W.contains(str) ? new Category(categoryByName.getName(), categoryByName.getColor(), true, categoryByName.isLocked()) : categoryByName;
    }

    /* renamed from: z2 */
    private void m19211z2() {
        boolean z;
        Iterator<Category> it = this.f12439Q.getCategories().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Category next = it.next();
            if (next.isLocked() && !this.f12446X.contains(next.getName())) {
                z = true;
                break;
            }
        }
        if (z) {
            C15626c.makeText(requireContext(), C17541R$string.delete_all_macros_remove_category_locks, 1).show();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle((int) C17541R$string.delete_all_macros);
        builder.setMessage((int) C17541R$string.are_you_sure_remove_all_macros);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12264c(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12274h.f58913a);
        builder.show();
    }

    /* renamed from: k0 */
    public void mo24615k0() {
        refresh();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C8151a.m33856E(requireActivity(), "MacroListFrament");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12449a0 = C5163j2.m19930B(requireActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C17535R$layout.macro_list_view_new, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        setHasOptionsMenu(true);
        this.f12444V = new C7328a(requireActivity());
        Collator instance = Collator.getInstance(C5163j2.m19963F0(requireActivity()));
        this.f12442T = instance;
        instance.setStrength(0);
        C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
        this.f12438P = q;
        this.f12447Y = new C6409o(q, this);
        this.recyclerView.setLayoutManager(new SmoothScrollLinearLayoutManager(requireActivity()));
        this.f12429G = C5163j2.m19993J1(requireActivity());
        this.f12430H = C5163j2.m20000K1(requireActivity());
        this.f12431I = C5163j2.m19972G1(requireActivity());
        FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(C17532R$id.macro_list_add_button);
        this.f12433K = floatingActionButton;
        floatingActionButton.mo65771d(this.recyclerView);
        this.f12433K.setOnClickListener(new C12284m(this));
        this.f12434L = (TextView) inflate.findViewById(C17532R$id.macro_list_limit_text);
        this.f12435M = (ViewGroup) inflate.findViewById(C17532R$id.macro_list_limit_container);
        ((Button) inflate.findViewById(C17532R$id.macro_list_get_more_macros)).setOnClickListener(new C12282l(this));
        this.f12436N = new C4948h(new ArrayList(), (Object) null, true);
        List<Macro> z = C4934n.m18998M().mo29710z();
        this.f12441S = new ArraySet();
        for (Macro category : z) {
            this.f12441S.add(category.getCategory());
        }
        this.favouriteButton.setChecked(C5163j2.m19986I1(requireContext()));
        this.favouriteButton.setEventListener(new C4949i());
        this.f12436N.mo68875Y1(Integer.MAX_VALUE);
        this.f12436N.mo68877Z1(true);
        this.f12436N.registerAdapterDataObserver(new C4950j());
        this.recyclerView.setLayoutManager(new SmoothScrollLinearLayoutManager(requireActivity()));
        this.recyclerView.setAdapter(this.f12436N);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.addItemDecoration(new C13309a(requireActivity()).mo70136a(C17535R$layout.macro_list_row, 0, 3, 0, 0).mo70142i(true).mo70141h(false).mo70143j(0));
        this.toolbar.inflateMenu(C17536R$menu.macro_list_menu);
        this.toolbar.setOnMenuItemClickListener(new C12294w(this));
        m19190q1(this.toolbar.getMenu());
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12448Z.mo80337d();
    }

    public void onEventMainThread(CategoryEnabledStateChangeEvent categoryEnabledStateChangeEvent) {
        refresh();
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        this.f12452g.mo37357O();
        this.f12452g.mo37363x();
        this.f12452g.mo37359r();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        CategoryList categoryList = (CategoryList) this.f12438P.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        this.f12439Q = categoryList;
        if (categoryList == null || categoryList.getCategories() == null) {
            this.f12439Q = new CategoryList(new ArrayList());
        }
        List<Macro> z = C4934n.m18998M().mo29710z();
        ArraySet arraySet = new ArraySet();
        for (Macro category : z) {
            arraySet.add(category.getCategory());
        }
        if (this.f12449a0 && arraySet.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (Category next : this.f12439Q.getCategories()) {
                arrayList.add(new Category(next.getName(), next.getColor(), false, next.isLocked()));
            }
            Iterator it = arraySet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f12439Q.getCategoryByName(str) == null) {
                    Category category2 = new Category(str, ContextCompat.getColor(requireActivity(), C17528R$color.default_macro_tile_color), false, false);
                    this.f12439Q.setCategory(category2);
                    arrayList.add(category2);
                }
            }
            CategoryList categoryList2 = new CategoryList(arrayList);
            this.f12438P.mo37132b(Category.CATEGORIES_KEY, categoryList2);
            this.f12439Q = categoryList2;
        }
        refresh();
        this.f12443U = false;
        try {
            C10180a.m40075a().mo80019m(this);
        } catch (EventBusException unused) {
        }
        this.f12435M.setVisibility(8);
        this.f12449a0 = false;
        m19094C2();
        m19190q1(this.toolbar.getMenu());
    }

    public void onEventMainThread(MacroEnabledStateChangeEvent macroEnabledStateChangeEvent) {
        refresh();
    }

    public void onEventMainThread(MacroDeletedEvent macroDeletedEvent) {
        refresh();
    }

    public void onEventMainThread(MacroRunEvent macroRunEvent) {
        if (TextUtils.isEmpty(this.f12432J.getQuery().toString())) {
            m19097D2(macroRunEvent.f11752a, macroRunEvent.f11753b);
        }
    }
}
