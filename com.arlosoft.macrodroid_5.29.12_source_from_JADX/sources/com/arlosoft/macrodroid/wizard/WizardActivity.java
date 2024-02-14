package com.arlosoft.macrodroid.wizard;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.advert.AdvertActivity;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.events.CategoryModeUpdateEvent;
import com.arlosoft.macrodroid.events.FilterEvent;
import com.arlosoft.macrodroid.events.MacroUpdateEvent;
import com.arlosoft.macrodroid.events.SetHelpVisibilityEvent;
import com.arlosoft.macrodroid.events.WizardScrollToTopEvent;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.widget.C6637e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p149q1.C8157f;
import p161s1.C10180a;
import p215b8.C11102b;
import p236d4.C11938c;
import p236d4.C11939d;
import p236d4.C11940e;
import p236d4.C11941f;
import p236d4.C11942g;
import p236d4.C11943h;
import p236d4.C11944i;
import p236d4.C11945j;
import p440y9.C16971a;

public class WizardActivity extends MacroDroidBaseActivity implements C6637e {

    /* renamed from: A */
    int f15430A;
    @BindView(2131362762)
    FloatingActionButton fab;

    /* renamed from: o */
    private Macro f15431o;

    /* renamed from: p */
    private SearchView f15432p;

    /* renamed from: s */
    private boolean f15433s;
    @BindView(2131363920)
    TabLayout tabLayout;
    @BindView(2131364057)
    Toolbar toolBar;
    @BindView(2131364058)
    ViewGroup toolbarContainer;
    @BindView(2131364310)
    ViewPager viewPager;
    @BindDimen(2131165978)
    int wizardTabIconPadding;
    @BindDimen(2131165979)
    int wizardTabIconSize;

    /* renamed from: z */
    private C6650g f15434z;

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$a */
    class C6644a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ int[] f15435a;

        C6644a(int[] iArr) {
            this.f15435a = iArr;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (i < WizardActivity.this.viewPager.getAdapter().getCount() - 1) {
                int[] iArr = this.f15435a;
                int Z1 = WizardActivity.m25152Z1(iArr[i + 1], iArr[i], f);
                WizardActivity.this.toolbarContainer.setBackgroundColor(Z1);
                Drawable mutate = DrawableCompat.wrap(WizardActivity.this.fab.getDrawable()).mutate();
                DrawableCompat.setTint(mutate, Z1);
                WizardActivity.this.fab.setImageDrawable(mutate);
                mutate.invalidateSelf();
            }
        }

        public void onPageSelected(int i) {
            if (i == 0) {
                WizardActivity.this.f15430A = C17542R$style.Theme_App_Dialog_Trigger;
            } else if (i == 1) {
                WizardActivity.this.f15430A = C17542R$style.Theme_App_Dialog_Action;
            } else if (i == 2) {
                WizardActivity.this.f15430A = C17542R$style.Theme_App_Dialog_Constraint;
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$b */
    class C6645b implements TabLayout.OnTabSelectedListener {
        C6645b() {
        }

        /* renamed from: a */
        public void mo30427a(TabLayout.Tab tab) {
        }

        /* renamed from: b */
        public void mo30428b(TabLayout.Tab tab) {
        }

        /* renamed from: c */
        public void mo30429c(TabLayout.Tab tab) {
            C10180a.m40075a().mo80018i(new WizardScrollToTopEvent(tab.mo59065g()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$c */
    class C6646c implements SearchView.OnQueryTextListener {
        C6646c() {
        }

        public boolean onQueryTextChange(String str) {
            C10180a.m40075a().mo80018i(new FilterEvent(str));
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$d */
    class C6647d implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Spinner f15439a;

        C6647d(Spinner spinner) {
            this.f15439a = spinner;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == this.f15439a.getCount() - 1) {
                WizardActivity.this.m25163l2(this.f15439a);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$e */
    class C6648e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15441a;

        /* renamed from: c */
        final /* synthetic */ EditText f15442c;

        C6648e(Button button, EditText editText) {
            this.f15441a = button;
            this.f15442c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f15441a.setEnabled(this.f15442c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$f */
    class C6649f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f15444a;

        /* renamed from: c */
        final /* synthetic */ EditText f15445c;

        C6649f(Button button, EditText editText) {
            this.f15444a = button;
            this.f15445c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f15444a.setEnabled(this.f15445c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardActivity$g */
    private class C6650g extends FragmentPagerAdapter {

        /* renamed from: a */
        private Fragment f15447a;

        public C6650g(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* renamed from: a */
        public Fragment mo32938a() {
            return this.f15447a;
        }

        public int getCount() {
            return 3;
        }

        public Fragment getItem(int i) {
            if (i == 0) {
                return WizardFragment.f15453B.mo32950a(0);
            }
            if (i == 1) {
                return WizardFragment.f15453B.mo32950a(1);
            }
            if (i != 2) {
                return null;
            }
            return WizardFragment.f15453B.mo32950a(2);
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return WizardActivity.this.getString(C17541R$string.triggers);
            }
            if (i == 1) {
                return WizardActivity.this.getString(C17541R$string.actions);
            }
            if (i != 2) {
                return null;
            }
            return WizardActivity.this.getString(C17541R$string.constraints);
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            if (mo32938a() != obj) {
                this.f15447a = (Fragment) obj;
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* renamed from: Z1 */
    static int m25152Z1(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    /* renamed from: a2 */
    private void m25153a2() {
        HashSet hashSet = new HashSet();
        Iterator<Trigger> it = this.f15431o.getTriggerListWithAwaitingActions().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            hashSet.addAll(Arrays.asList(next.mo24700e1()));
            if (!next.mo27876y1(this)) {
                return;
            }
        }
        Iterator<Action> it2 = this.f15431o.getActions().iterator();
        while (it2.hasNext()) {
            Action next2 = it2.next();
            hashSet.addAll(Arrays.asList(next2.mo24700e1()));
            if (!next2.mo27876y1(this)) {
                return;
            }
        }
        for (Constraint next3 : this.f15431o.getConstraints()) {
            hashSet.addAll(Arrays.asList(next3.mo24700e1()));
            if (!next3.mo27876y1(this)) {
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 23 || hashSet.size() == 0) {
            m25165n2();
            return;
        }
        new C11102b((FragmentActivity) this).mo62231o((String[]) hashSet.toArray(new String[0])).mo79679I(C16971a.m100210a()).mo79685P(new C11945j(this));
    }

    /* renamed from: c2 */
    private void m25154c2() {
        Intent intent = new Intent();
        intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", this.f15431o.getName());
        setResult(-1, intent);
        AdvertActivity.m14795d2((Intent) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m25155d2(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m25165n2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m25156e2(DialogInterface dialogInterface, int i) {
        C4934n.m18998M().mo29692k0(this.f15431o, true);
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m25157f2(Menu menu, MenuItem menuItem, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean isIconified = this.f15432p.isIconified();
        for (int i9 = 0; i9 < menu.size(); i9++) {
            MenuItem item = menu.getItem(i9);
            if (item != menuItem) {
                item.setVisible(isIconified);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m25158g2(Spinner spinner, EditText editText, AppCompatDialog appCompatDialog, View view) {
        m25166o2(spinner, editText.getText().toString());
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static /* synthetic */ void m25159h2(Spinner spinner, AppCompatDialog appCompatDialog, View view) {
        spinner.setSelection(0);
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m25160i2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.category);
        builder.setMessage((int) C17541R$string.to_help_organise_macros);
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m25161j2(AppCompatDialog appCompatDialog, EditText editText, Spinner spinner, View view) {
        appCompatDialog.dismiss();
        boolean isConfiguringShortcut = this.f15431o.isConfiguringShortcut();
        this.f15431o.setName(editText.getText().toString());
        this.f15431o.setCategory((String) spinner.getSelectedItem());
        this.f15431o.setCompleted(true);
        this.f15431o.setConfiguringShortcut(false);
        C4934n.m18998M().mo29699r(this.f15431o);
        C4934n.m18998M().mo29702s0();
        C5163j2.m20187j4(this, this.f15431o.getGUID());
        C5163j2.m20219n4(this, this.f15431o.getGUID());
        if (isConfiguringShortcut) {
            m25154c2();
            return;
        }
        Intent intent = new Intent(this, NewHomeScreenActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        AdvertActivity.m14795d2((Intent) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m25163l2(Spinner spinner) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, this.f15430A);
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
        editText.addTextChangedListener(new C6649f(button, editText));
        button.setOnClickListener(new C11942g(this, spinner, editText, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C11939d(spinner, appCompatDialog));
        appCompatDialog.show();
        C4666m.m18141i(editText);
    }

    /* renamed from: m2 */
    private void m25164m2(boolean z) {
        this.fab.setAlpha(z ? 1.0f : 0.8f);
    }

    /* renamed from: n2 */
    private void m25165n2() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, this.f15430A);
        appCompatDialog.setContentView((int) C17535R$layout.enter_name_and_category);
        appCompatDialog.setTitle((int) C17541R$string.macro_name_and_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_name_and_category_name);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.enter_name_and_category_spinner);
        m25166o2(spinner, (String) null);
        spinner.setOnItemSelectedListener(new C6647d(spinner));
        editText.addTextChangedListener(new C6648e(button, editText));
        ((ImageView) appCompatDialog.findViewById(C17532R$id.enter_name_and_category_help)).setOnClickListener(new C11941f(this));
        button.setOnClickListener(new C11943h(this, appCompatDialog, editText, spinner));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C11940e(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: o2 */
    private void m25166o2(Spinner spinner, String str) {
        List<String> A = C4061t1.m15944A(this);
        if (str != null) {
            A.add(str);
        }
        A.add("[" + getString(C17541R$string.new_category) + "]");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, A);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        if (str != null) {
            spinner.setSelection(spinner.getCount() - 2);
        }
    }

    /* renamed from: C0 */
    public void mo27137C0(Object obj) {
        WizardFragment wizardFragment = (WizardFragment) this.f15434z.mo32938a();
        if (wizardFragment != null) {
            wizardFragment.mo32943j0(obj);
        }
    }

    /* renamed from: W0 */
    public void mo27140W0() {
        WizardFragment wizardFragment = (WizardFragment) this.f15434z.mo32938a();
        if (wizardFragment != null) {
            wizardFragment.mo32942i0();
        }
    }

    /* renamed from: b2 */
    public Macro mo32926b2() {
        return this.f15431o;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        WizardFragment wizardFragment = (WizardFragment) this.f15434z.mo32938a();
        if (wizardFragment != null) {
            wizardFragment.mo32941h0(i, i2, intent);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            DisplayCutout displayCutout = getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                this.toolbarContainer.setPadding(this.toolBar.getPaddingLeft(), displayCutout.getSafeInsetTop(), this.toolBar.getPaddingRight(), this.toolBar.getPaddingBottom());
            } else {
                this.toolbarContainer.setPadding(this.toolBar.getPaddingLeft(), mo27313L1(), this.toolBar.getPaddingRight(), this.toolBar.getPaddingBottom());
            }
        } else {
            this.toolbarContainer.setPadding(this.toolBar.getPaddingLeft(), mo27313L1(), this.toolBar.getPaddingRight(), this.toolBar.getPaddingBottom());
        }
    }

    public void onBackPressed() {
        if (this.f15431o.getTriggerListWithAwaitingActions().size() > 0 || this.f15431o.getActions().size() > 0 || this.f15431o.getConstraints().size() > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, this.f15430A);
            builder.setMessage((int) C17541R$string.discard_confirm);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C11938c(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.show();
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_wizard);
        ButterKnife.bind((Activity) this);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        getWindow().setStatusBarColor(0);
        setSupportActionBar(this.toolBar);
        getSupportActionBar().setTitle((int) C17541R$string.create_macro);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.f15430A = C17542R$style.Theme_App_Dialog_Trigger;
        if (bundle != null) {
            this.f15431o = (Macro) bundle.getParcelable(C8157f.ITEM_TYPE);
        } else {
            Macro macro = (Macro) getIntent().getParcelableExtra(C8157f.ITEM_TYPE);
            this.f15431o = macro;
            if (macro == null) {
                this.f15431o = new Macro();
            }
        }
        int[] iArr = {ContextCompat.getColor(this, C17528R$color.trigger_primary), ContextCompat.getColor(this, C17528R$color.actions_primary), ContextCompat.getColor(this, C17528R$color.constraints_primary)};
        C6650g gVar = new C6650g(getSupportFragmentManager());
        this.f15434z = gVar;
        this.viewPager.setAdapter(gVar);
        this.viewPager.setOffscreenPageLimit(3);
        this.viewPager.addOnPageChangeListener(new C6644a(iArr));
        this.toolbarContainer.setBackgroundColor(iArr[bundle != null ? bundle.getInt("tab_position", 0) : 0]);
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.tabLayout.setOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C6645b());
        for (int i = 0; i < this.tabLayout.getTabCount(); i++) {
            TabLayout.Tab x = this.tabLayout.mo59045x(i);
            View inflate = LayoutInflater.from(this).inflate(C17535R$layout.wizard_tab, (ViewGroup) null);
            x.mo59073o(inflate);
            ((TextView) inflate.findViewById(2131364038)).setText(x.mo59067i());
        }
        m25164m2(this.f15431o.isValid());
        C10180a.m40075a().mo80019m(this);
        if (getIntent().getBooleanExtra("add_wear_trigger", false)) {
            new AndroidWearTrigger((Activity) this, this.f15431o).mo30906l3();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.wizard_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(findItem);
        this.f15432p = searchView;
        searchView.setMaxWidth(Integer.MAX_VALUE);
        this.f15432p.setOnQueryTextListener(new C6646c());
        menu.findItem(C17532R$id.menu_show_categories).setChecked(C5163j2.m19964F1(this));
        this.f15432p.addOnLayoutChangeListener(new C11944i(this, menu, findItem));
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        C10180a.m40075a().mo80020p(this);
    }

    public void onEventMainThread(MacroUpdateEvent macroUpdateEvent) {
        TabLayout.Tab tab;
        m25164m2(this.f15431o.isValid());
        ArrayList arrayList = new ArrayList();
        int i = macroUpdateEvent.f11755b;
        int i2 = 0;
        if (i == 0) {
            tab = this.tabLayout.mo59045x(0);
            arrayList.addAll(this.f15431o.getTriggerListWithAwaitingActions());
        } else if (i == 1) {
            tab = this.tabLayout.mo59045x(1);
            arrayList.addAll(this.f15431o.getActions());
        } else if (i == 2) {
            tab = this.tabLayout.mo59045x(2);
            arrayList.addAll(this.f15431o.getConstraints());
        } else {
            tab = null;
        }
        LinearLayout linearLayout = (LinearLayout) tab.mo59063e().findViewById(C17532R$id.icons_layout);
        int i3 = macroUpdateEvent.f11754a;
        if (i3 == 0) {
            ImageView imageView = new ImageView(this);
            int i4 = this.wizardTabIconSize;
            imageView.setLayoutParams(new LinearLayoutCompat.LayoutParams(i4, i4));
            int i5 = this.wizardTabIconPadding;
            imageView.setPadding(i5, i5, i5, 0);
            imageView.setImageResource(((SelectableItem) arrayList.get(macroUpdateEvent.f11756c)).mo25558S0());
            linearLayout.addView(imageView);
        } else if (i3 == 1) {
            linearLayout.removeViewAt(macroUpdateEvent.f11756c);
        } else if (i3 == 2) {
            View childAt = linearLayout.getChildAt(macroUpdateEvent.f11756c);
            linearLayout.removeViewAt(macroUpdateEvent.f11756c);
            linearLayout.addView(childAt, macroUpdateEvent.f11757d);
        }
        if (linearLayout.getChildCount() == 0) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362762})
    public void onFabClicked() {
        String str;
        if (!this.f15431o.isValid()) {
            if (this.f15431o.getTriggerListWithAwaitingActions().size() == 0) {
                str = getString(C17541R$string.please_add_a_trigger);
            } else if (this.f15431o.getActions().size() == 0) {
                str = getString(C17541R$string.please_add_an_action);
            } else {
                str = getString(C17541R$string.ensure_valid_macro);
            }
            C4061t1.m16021u(this, getString(C17541R$string.invalid_macro), str, this.f15430A);
            return;
        }
        m25153a2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == 2131363231) {
            this.f15433s = !this.f15433s;
            C10180a.m40075a().mo80018i(new SetHelpVisibilityEvent(this.f15433s));
            return true;
        } else if (itemId != 2131363267) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            boolean z = !C5163j2.m19964F1(this);
            C5163j2.m20268t5(this, z);
            menuItem.setChecked(z);
            C10180a.m40075a().mo80018i(new CategoryModeUpdateEvent());
            return true;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(C8157f.ITEM_TYPE, this.f15431o);
        bundle.putInt("tab_position", this.viewPager.getCurrentItem());
    }
}
