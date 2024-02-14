package com.arlosoft.macrodroid.celltowers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.CellTowerConstraint;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.CellTowerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p112j2.C7439d0;
import p135n1.C7964a;
import p161s1.C10180a;

public class CellTowerListActivity extends MacroDroidBaseActivity {
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;
    @BindView(2131362190)
    FloatingActionButton m_addCellTowerButton;
    @BindView(2131362193)
    ListView m_groupList;

    /* renamed from: o */
    private C3932l f10146o;

    /* renamed from: p */
    private boolean f10147p;

    /* renamed from: s */
    private C3910d f10148s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f10149z;

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerListActivity$a */
    class C3907a implements View.OnClickListener {
        C3907a() {
        }

        public void onClick(View view) {
            CellTowerListActivity.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerListActivity$b */
    class C3908b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10151a;

        /* renamed from: c */
        final /* synthetic */ EditText f10152c;

        C3908b(Button button, EditText editText) {
            this.f10151a = button;
            this.f10152c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f10151a.setEnabled(this.f10152c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerListActivity$c */
    class C3909c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10154a;

        C3909c(Button button) {
            this.f10154a = button;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10154a.setEnabled(i3 > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerListActivity$d */
    private class C3910d extends BaseAdapter {

        /* renamed from: a */
        private List<C7964a> f10156a;

        /* renamed from: c */
        private final WeakReference<Context> f10157c;

        public C3910d(Context context, List<C7964a> list) {
            this.f10156a = list;
            this.f10157c = new WeakReference<>(context);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m15253c(C7964a aVar, View view) {
            CellTowerListActivity.this.mo27568d2(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ boolean m15254d(C7964a aVar, View view) {
            CellTowerListActivity.this.mo27569e2(aVar);
            return true;
        }

        public int getCount() {
            return this.f10156a.size();
        }

        public Object getItem(int i) {
            return this.f10156a.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C7964a aVar = (C7964a) getItem(i);
            Context context = (Context) this.f10157c.get();
            if (context == null) {
                return view;
            }
            if (view == null) {
                view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C17535R$layout.cell_tower_group_list_item, (ViewGroup) null);
            }
            CardView cardView = (CardView) view.findViewById(2131362381);
            ImageView imageView = (ImageView) view.findViewById(C17532R$id.cell_tower_group_list_item_icon);
            TextView textView = (TextView) view.findViewById(C17532R$id.cell_tower_group_list_towers_label);
            ((TextView) view.findViewById(C17532R$id.cell_tower_group_list_item_name)).setText(aVar.getName());
            int size = aVar.getCellTowerIds().size();
            if (size == 1) {
                textView.setText(C17541R$string.trigger_cell_tower_one_tower);
            } else {
                textView.setText(size + " " + context.getString(C17541R$string.trigger_cell_tower_towers));
            }
            if (CellTowerListActivity.this.f10149z != 0) {
                int W1 = CellTowerListActivity.this.f10149z;
                if (W1 == 1) {
                    cardView.setCardBackgroundColor(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.trigger_primary));
                    imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.trigger_primary)));
                } else if (W1 == 2) {
                    cardView.setCardBackgroundColor(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.constraints_primary));
                    imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.constraints_primary)));
                } else if (W1 == 3) {
                    cardView.setCardBackgroundColor(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.actions_primary));
                    imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(CellTowerListActivity.this, C17528R$color.actions_primary)));
                }
            }
            cardView.setOnClickListener(new C3940s(this, aVar));
            cardView.setOnLongClickListener(new C3941t(this, aVar));
            return view;
        }
    }

    /* renamed from: X1 */
    private void m15234X1() {
        if (C5163j2.m20277u6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        int i = C17528R$color.cell_towers_primary;
        int i2 = this.f10149z;
        if (i2 != 0) {
            if (i2 == 1) {
                i = C17528R$color.trigger_primary;
            } else if (i2 == 2) {
                i = C17528R$color.constraints_primary;
            } else if (i2 == 3) {
                i = C17528R$color.condition_primary;
            }
        }
        this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, i));
        this.infoCardTitle.setText(C17541R$string.cell_tower_groups);
        this.infoCardDetail.setText(C17541R$string.cell_towers_info_card);
        this.infoCardGotIt.setOnClickListener(new C3938q(this));
    }

    /* renamed from: Y1 */
    private void m15235Y1(C7964a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, m15239c2());
        builder.setTitle((int) C17541R$string.delete_cell_tower_group);
        builder.setMessage((CharSequence) getString(C17541R$string.are_you_sure_delete_cell_tower_group) + ": " + aVar.getName());
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3936o(this, aVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: Z1 */
    private void m15236Z1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, m15239c2());
        builder.setTitle((int) C17541R$string.trigger_cell_tower_add_group);
        AppCompatEditText appCompatEditText = new AppCompatEditText(this);
        appCompatEditText.setInputType(524289);
        appCompatEditText.setHint(C17541R$string.trigger_cell_tower_enter_group_name_hint);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        builder.setView(appCompatEditText, dimensionPixelOffset, getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin), dimensionPixelOffset, 0);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3934m(this, appCompatEditText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        Button button = show.getButton(-1);
        button.setEnabled(false);
        appCompatEditText.addTextChangedListener(new C3909c(button));
    }

    /* renamed from: a2 */
    private void m15237a2(C7964a aVar) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, m15239c2());
        appCompatDialog.setContentView((int) C17535R$layout.edit_cell_tower_group_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_cell_tower_rename_group);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.edit_cell_tower_group_name_dialog_name);
        String name = aVar.getName();
        editText.setText(aVar.getName());
        editText.addTextChangedListener(new C3908b(button, editText));
        button.setOnClickListener(new C3939r(this, editText, aVar, name, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3937p(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: b2 */
    private int m15238b2() {
        int i = this.f10149z;
        if (i == 1) {
            return ContextCompat.getColor(this, C17528R$color.trigger_primary_dark);
        }
        if (i == 2) {
            return ContextCompat.getColor(this, C17528R$color.constraints_primary_dark);
        }
        if (i != 3) {
            return ContextCompat.getColor(this, C17528R$color.cell_towers_primary);
        }
        return ContextCompat.getColor(this, C17528R$color.condition_primary_dark);
    }

    /* renamed from: c2 */
    private int m15239c2() {
        int i = this.f10149z;
        return i != 1 ? i != 2 ? i != 3 ? C17542R$style.Theme_App_Dialog_CellTowers : C17542R$style.Theme_App_Condition : C17542R$style.Theme_App_Constraint : C17542R$style.Theme_App_Dialog_Trigger;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m15240f2(View view) {
        C5163j2.m20001K2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m15241g2(C7964a aVar, DialogInterface dialogInterface, int i) {
        if (CellTowerBackgroundScanService.m15185c() != null && CellTowerBackgroundScanService.m15185c().equals(aVar.getName())) {
            CellTowerBackgroundScanService.m15184b(this);
        }
        this.f10146o.mo27634i(aVar);
        this.f10146o.mo27633h();
        m15246l2();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m15242h2(AppCompatEditText appCompatEditText, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this, CellTowerGroupActivity.class);
        intent.putExtra("NewGroupName", appCompatEditText.getText().toString());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m15243i2(EditText editText, C7964a aVar, String str, AppCompatDialog appCompatDialog, View view) {
        String obj = editText.getText().toString();
        aVar.setName(obj);
        this.f10146o.mo27633h();
        m15246l2();
        m15247m2(str, obj);
        C4934n.m18998M().mo29702s0();
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m15245k2(C7964a aVar, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m15237a2(aVar);
        } else if (i == 1) {
            Intent intent = new Intent(this, CellTowerGroupActivity.class);
            intent.putExtra("CellTowerGroupName", aVar.getName());
            startActivityForResult(intent, 22);
        } else if (i == 2) {
            m15235Y1(aVar);
        }
    }

    /* renamed from: l2 */
    private void m15246l2() {
        C3910d dVar = new C3910d(this, this.f10146o.mo27630c());
        this.f10148s = dVar;
        this.m_groupList.setAdapter(dVar);
    }

    /* renamed from: m2 */
    private void m15247m2(String str, String str2) {
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if (next2 instanceof CellTowerTrigger) {
                    CellTowerTrigger cellTowerTrigger = (CellTowerTrigger) next2;
                    if (cellTowerTrigger.mo31042i3().equals(str)) {
                        cellTowerTrigger.mo31046q3(str2);
                    }
                }
                for (Constraint n2 : next2.mo27826J0()) {
                    m15248n2(n2, str, str2);
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                for (Constraint n22 : it2.next().mo27826J0()) {
                    m15248n2(n22, str, str2);
                }
            }
            for (Constraint n23 : next.getConstraints()) {
                m15248n2(n23, str, str2);
            }
        }
    }

    /* renamed from: n2 */
    private void m15248n2(Constraint constraint, String str, String str2) {
        if (constraint instanceof CellTowerConstraint) {
            CellTowerConstraint cellTowerConstraint = (CellTowerConstraint) constraint;
            if (cellTowerConstraint.mo28100g3().equals(str)) {
                cellTowerConstraint.mo28102k3(str2);
            }
        }
        if (constraint instanceof LogicConstraint) {
            for (Constraint n2 : ((LogicConstraint) constraint).mo27826J0()) {
                m15248n2(n2, str, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362190})
    public void addGeofenceButtonClick() {
        m15236Z1();
    }

    /* renamed from: d2 */
    public void mo27568d2(@NonNull C7964a aVar) {
        if (this.f10147p) {
            Intent intent = new Intent(this, CellTowerGroupActivity.class);
            intent.putExtra("CellTowerGroupName", aVar.getName());
            startActivityForResult(intent, 22);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("CellTowerGroupName", aVar.getName());
        intent2.putExtra("CellTowerList", aVar.getCellTowerIds());
        setResult(-1, intent2);
        finish();
    }

    /* renamed from: e2 */
    public void mo27569e2(@NonNull C7964a aVar) {
        String[] strArr = {getString(C17541R$string.trigger_cell_tower_rename_group), getString(C17541R$string.trigger_cell_tower_edit_towers), getString(C17541R$string.delete)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) aVar.getName()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3935n(this, aVar));
        builder.create().show();
    }

    public void onCreate(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("ThemeType", 0);
        this.f10149z = intExtra;
        if (intExtra != 0) {
            if (intExtra == 1) {
                setTheme(C17542R$style.Theme_App_Trigger_ColoredButton);
            } else if (intExtra == 2) {
                setTheme(C17542R$style.Theme_App_Constraint_ColoredButton);
            } else if (intExtra == 3) {
                setTheme(C17542R$style.Theme_App_Constraint_ColoredButton);
            }
        }
        super.onCreate(bundle);
        setContentView(C17535R$layout.configure_cell_tower);
        ButterKnife.bind((Activity) this);
        this.f10146o = C3932l.m15307e();
        this.m_groupList.setEmptyView(findViewById(C17532R$id.celltowers_emptyView));
        this.f10147p = getIntent().getBooleanExtra("EditModeOn", false);
        this.m_addCellTowerButton.setBackgroundTintList(ColorStateList.valueOf(m15238b2()));
        m15234X1();
        if (!this.f10147p) {
            setTitle(C17541R$string.select_cell_tower_group);
        } else {
            setTitle(C17541R$string.cell_tower_groups);
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            C7439d0.m30897i0(this, (SelectableItem) null, false);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.cell_tower_configure_menu, menu);
        return true;
    }

    public void onEventMainThread(CellTowerUpdateEvent cellTowerUpdateEvent) {
        m15246l2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == 2131363234) {
            startActivity(new Intent(this, IgnoredCellTowersActivity.class));
            return true;
        } else if (itemId != 2131363251) {
            return true;
        } else {
            startActivity(new Intent(this, RecentCellTowersActivity.class));
            return true;
        }
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        m15246l2();
        if (Build.VERSION.SDK_INT >= 27) {
            try {
                if (Settings.Secure.getInt(getContentResolver(), "location_mode") == 0) {
                    SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById(C17532R$id.coordinator_layout), getString(C17541R$string.location_services_must_be_enabled), -2);
                    i.mo58926l(C17541R$string.configure, new C3907a());
                    i.mo58928n(-1);
                    i.mo58921e().setBackgroundResource(C17528R$color.macro_error);
                    i.mo58932r();
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
    }
}
