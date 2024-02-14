package com.arlosoft.macrodroid.variables;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.events.VariableUpdatedEvent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.variables.C6520o0;
import java.util.HashMap;
import java.util.List;
import p161s1.C10180a;

public class MacroDroidVariablesActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: A */
    private Macro f15093A;
    @BindView(2131362791)
    ViewGroup filterPanel;
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;
    @BindView(2131363069)
    CheckBox localVariableCheckbox;
    @BindView(2131363070)
    ViewGroup localVariableOptionLayout;
    @BindView(2131364287)
    ListView m_list;
    @BindView(2131363641)
    LinearLayout rootContainer;

    /* renamed from: s */
    C4083b f15094s;
    @BindView(2131364057)
    Toolbar toolbar;
    @BindView(2131364215)
    Spinner variableTypeSpinner;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C6588r f15095z;

    /* renamed from: com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity$a */
    class C6466a implements AdapterView.OnItemSelectedListener {
        C6466a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MacroDroidVariablesActivity.this.f15095z.mo32800H(i - 1);
            MacroDroidVariablesActivity.this.refresh();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity$b */
    class C6467b implements C6520o0.C6530d {
        C6467b() {
        }

        /* renamed from: a */
        public void mo25509a(@NonNull MacroDroidVariable macroDroidVariable, boolean z) {
            C4064u.m16048t().mo27983f(macroDroidVariable);
            MacroDroidVariablesActivity.this.m24815j2(macroDroidVariable);
        }

        /* renamed from: b */
        public boolean mo25510b(String str) {
            return C4064u.m16048t().mo27996w(str) == null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity$c */
    class C6468c implements SearchView.OnQueryTextListener {
        C6468c() {
        }

        public boolean onQueryTextChange(String str) {
            MacroDroidVariablesActivity.this.f15095z.mo32799G(str);
            MacroDroidVariablesActivity.this.refresh();
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: Z1 */
    private void m24805Z1() {
        if (C5163j2.m19961E6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.variables_primary));
        this.infoCardTitle.setText(C17541R$string.variables);
        this.infoCardDetail.setText(C17541R$string.variables_info_card);
        this.infoCardGotIt.setOnClickListener(new C6503g(this));
    }

    /* renamed from: a2 */
    public static Intent m24806a2(@NonNull Context context, @Nullable long j) {
        Intent intent = new Intent(context, MacroDroidVariablesActivity.class);
        intent.putExtra("localMacro", j);
        return intent;
    }

    /* renamed from: b2 */
    private void m24807b2() {
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(false);
        HashMap<String, List<Macro>> r2 = this.f15095z.mo32805r();
        for (MacroDroidVariable next : r) {
            if (!r2.containsKey(next.getName())) {
                C4064u.m16048t().mo27976K(next.getName());
            }
        }
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ void m24808c2(View view) {
        C5163j2.m20078V2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ void m24809d2(DialogInterface dialogInterface, int i) {
        C4064u.m16048t().mo27984h();
        refresh();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m24811f2(DialogInterface dialogInterface, int i) {
        m24807b2();
    }

    /* renamed from: h2 */
    private void m24813h2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.delete_all_variables);
        builder.setMessage((int) C17541R$string.please_confirm_operation);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6497d(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C6499e.f15122a);
        builder.show();
    }

    /* renamed from: i2 */
    private void m24814i2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.delete_unused_variables);
        builder.setMessage((int) C17541R$string.please_confirm_operation);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6495c(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C6501f.f15124a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m24815j2(MacroDroidVariable macroDroidVariable) {
        refresh();
        this.m_list.smoothScrollToPosition(this.f15095z.mo32806s(macroDroidVariable));
    }

    /* renamed from: k2 */
    private void m24816k2() {
        ViewGroup viewGroup = this.filterPanel;
        int i = 8;
        if (viewGroup.getVisibility() == 8) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public void refresh() {
        if (!this.localVariableCheckbox.isChecked()) {
            this.f15095z.mo32798E((Macro) null);
        } else {
            this.f15095z.mo32798E(this.f15093A);
        }
        this.f15095z.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.variables_activity);
        ButterKnife.bind((Activity) this);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(C17541R$string.variables_title);
        this.variableTypeSpinner.setOnItemSelectedListener(new C6466a());
        this.rootContainer.getLayoutTransition().enableTransitionType(4);
        Macro Q = C4934n.m18998M().mo29682Q(getIntent().getLongExtra("localMacro", -1));
        this.f15093A = Q;
        if (Q != null) {
            CheckBox checkBox = this.localVariableCheckbox;
            checkBox.setText(getString(C17541R$string.this_macro_only) + " (" + this.f15093A.getName() + ")");
            this.localVariableOptionLayout.setVisibility(0);
            this.localVariableCheckbox.setChecked(true);
        } else {
            this.localVariableOptionLayout.setVisibility(8);
        }
        m24805Z1();
        this.m_list.setEmptyView(findViewById(C17532R$id.variables_emptyView));
        C6588r rVar = new C6588r(this, this.f15093A);
        this.f15095z = rVar;
        this.m_list.setAdapter(rVar);
        C10180a.m40075a().mo80019m(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.variable_activity_menu, menu);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(C17532R$id.menu_search));
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setElevation(0.0f);
        searchView.setOnQueryTextListener(new C6468c());
        return true;
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        super.onDestroy();
    }

    public void onEventMainThread(VariableUpdatedEvent variableUpdatedEvent) {
        refresh();
    }

    /* access modifiers changed from: package-private */
    @OnCheckedChanged({2131363069})
    public void onLocalVariableCheckboxChanged(boolean z) {
        C6588r rVar = this.f15095z;
        if (rVar != null) {
            rVar.mo32798E(z ? this.f15093A : null);
            this.f15095z.notifyDataSetChanged();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case C17532R$id.menu_delete_all:
                m24813h2();
                return true;
            case C17532R$id.menu_delete_unused:
                m24814i2();
                return true;
            case C17532R$id.menu_filter:
                m24816k2();
                return true;
            default:
                return true;
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362762})
    public void onPlusButtonClicked() {
        C6520o0.m24897U(this, this.f15094s.mo28009e().mo28008a(), false, C17542R$style.Theme_App_Dialog_Variables, false, false, C17535R$layout.simple_spinner_dropdown_item_2_lines, "#999999", false, (Macro) null, (Integer) null, new C6467b());
    }

    public void onResume() {
        super.onResume();
        refresh();
    }
}
