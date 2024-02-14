package com.arlosoft.macrodroid.celltowers;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.celltowers.C3943v;
import com.arlosoft.macrodroid.database.C4373a;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.SnackbarAnimate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p135n1.C7964a;
import p161s1.C10180a;
import p319lc.C15626c;

public class CellTowerGroupActivity extends MacroDroidBaseActivity {

    /* renamed from: A */
    private Set<String> f10116A;

    /* renamed from: B */
    private boolean f10117B;

    /* renamed from: C */
    private String f10118C;

    /* renamed from: D */
    private String f10119D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C4373a f10120E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C3902c f10121F;
    @BindView(2131362191)
    TextView m_cellTowerCountText;
    @BindView(2131362198)
    ListView m_cellTowerList;
    @BindView(2131362192)
    FloatingActionButton m_fab;
    @BindView(2131362203)
    Button m_scanBgButton;
    @BindView(2131362204)
    ViewGroup m_scanningLayout;
    @BindView(2131363668)
    TextView m_scanningText;

    /* renamed from: o */
    private C3932l f10122o;

    /* renamed from: p */
    private C7964a f10123p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f10124s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ArrayList<String> f10125z;

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity$a */
    class C3900a implements View.OnClickListener {
        C3900a() {
        }

        public void onClick(View view) {
            CellTowerGroupActivity.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity$b */
    class C3901b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10127a;

        C3901b(Button button) {
            this.f10127a = button;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f10127a.setEnabled(i3 > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity$c */
    private class C3902c extends BaseAdapter {

        /* renamed from: a */
        private final Context f10129a;

        /* renamed from: c */
        private ArrayList<String> f10130c;

        /* renamed from: d */
        private Set<String> f10131d;

        /* renamed from: f */
        private final Set<String> f10132f;

        public C3902c(Context context, ArrayList<String> arrayList, Set<String> set, Set<String> set2) {
            this.f10132f = set2;
            this.f10130c = arrayList;
            this.f10131d = set;
            this.f10129a = context;
        }

        /* renamed from: f */
        private void m15217f(String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(CellTowerGroupActivity.this, C17542R$style.Theme_App_Dialog_Settings);
            builder.setTitle((int) C17541R$string.delete_cell_tower_group);
            builder.setMessage((CharSequence) CellTowerGroupActivity.this.getString(C17541R$string.are_you_sure_delete_cell_tower) + ": " + str);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3927g(this, str));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.show();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m15218g(String str, DialogInterface dialogInterface, int i) {
            this.f10130c.remove(str);
            this.f10131d.remove(str);
            CellTowerGroupActivity.this.m15210n2();
            TextView textView = CellTowerGroupActivity.this.m_cellTowerCountText;
            textView.setText(this.f10130c.size() + " " + CellTowerGroupActivity.this.getString(C17541R$string.tower_ids_found));
            notifyDataSetChanged();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m15219h(String str, C3904e eVar, CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f10131d.remove(str);
            } else {
                this.f10131d.add(str);
            }
            eVar.f10137b.setAlpha(z ? 1.0f : 0.5f);
            Context applicationContext = CellTowerGroupActivity.this.getApplicationContext();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(CellTowerGroupActivity.this.getString(z ? C17541R$string.added_to_group : C17541R$string.excluded_from_group));
            C15626c.m94876a(applicationContext, sb.toString(), z ^ true ? 1 : 0).show();
            CellTowerGroupActivity.this.m15210n2();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m15220i(String str, boolean z, View view) {
            m15223l(str, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ boolean m15221j(String str, boolean z, View view) {
            m15223l(str, z);
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m15222k(String str, boolean z, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                m15217f(str);
            } else if (i == 1) {
                ((ClipboardManager) CellTowerGroupActivity.this.getSystemService("clipboard")).setText(str);
                C15626c.makeText(CellTowerGroupActivity.this.getApplicationContext(), C17541R$string.copied_to_clipboard, 0).show();
            } else if (i == 2) {
                CellTowerGroupActivity.this.f10120E.mo28651v(str, !z);
                CellTowerGroupActivity.this.m15208l2();
            }
        }

        /* renamed from: l */
        private void m15223l(String str, boolean z) {
            String str2;
            String[] strArr = new String[3];
            strArr[0] = this.f10129a.getString(C17541R$string.delete);
            strArr[1] = this.f10129a.getString(C17541R$string.copy_clipboard);
            if (z) {
                str2 = this.f10129a.getString(C17541R$string.remove_from_global_ignore);
            } else {
                str2 = this.f10129a.getString(C17541R$string.add_to_global_ignore);
            }
            strArr[2] = str2;
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10129a);
            builder.setTitle((CharSequence) str).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3928h(this, str, z));
            builder.create().show();
        }

        public int getCount() {
            return this.f10130c.size();
        }

        public Object getItem(int i) {
            return this.f10130c.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C3904e eVar;
            String str = (String) getItem(i);
            if (view == null) {
                view = ((LayoutInflater) this.f10129a.getSystemService("layout_inflater")).inflate(C17535R$layout.cell_tower_list_row, viewGroup, false);
                eVar = new C3904e();
                eVar.f10137b = (TextView) view.findViewById(C17532R$id.cellid_name);
                eVar.f10138c = (CheckBox) view.findViewById(C17532R$id.cell_tower_list_row_checkbox);
                eVar.f10136a = (TextView) view.findViewById(C17532R$id.cell_tower_list_row_item_count);
                view.setTag(eVar);
            } else {
                eVar = (C3904e) view.getTag();
            }
            boolean contains = this.f10131d.contains(str);
            boolean contains2 = this.f10132f.contains(str);
            eVar.f10136a.setText(String.valueOf(i + 1));
            if (str != null) {
                eVar.f10137b.setText(str);
                eVar.f10137b.setAlpha(contains ? 0.5f : 1.0f);
            }
            if (contains2) {
                eVar.f10136a.setBackgroundResource(C17530R$drawable.circular_icon_background_cell_tower_disabled);
                eVar.f10136a.setTextColor(ContextCompat.getColor(this.f10129a, 2131101114));
                eVar.f10137b.setTextColor(ContextCompat.getColor(this.f10129a, C17528R$color.white_very_transparent));
                eVar.f10138c.setVisibility(8);
            } else {
                eVar.f10136a.setBackgroundResource(C17530R$drawable.circular_icon_white);
                eVar.f10136a.setTextColor(ContextCompat.getColor(this.f10129a, C17528R$color.cell_towers_primary));
                eVar.f10137b.setTextColor(ContextCompat.getColor(this.f10129a, 2131101114));
                eVar.f10138c.setVisibility(0);
            }
            eVar.f10138c.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            eVar.f10138c.setChecked(!contains);
            eVar.f10138c.setOnCheckedChangeListener(new C3931k(this, str, eVar));
            eVar.f10137b.setOnClickListener(new C3929i(this, str, contains2));
            eVar.f10137b.setOnLongClickListener(new C3930j(this, str, contains2));
            return view;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity$d */
    private class C3903d extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final List<C3943v.C3944a> f10134a = new ArrayList();

        public C3903d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (CellTowerGroupActivity.this.f10124s) {
                List<C3943v.C3944a> a = C3943v.m15317a(CellTowerGroupActivity.this);
                if (a.size() == 0) {
                    C4878b.m18879r("Scan Towers - No towers found");
                } else {
                    C4878b.m18873l("Scan Towers - Cell towers found = " + a.size());
                    for (C3943v.C3944a aVar : a) {
                        C4878b.m18873l("-> " + aVar.f10258c);
                    }
                }
                for (C3943v.C3944a next : a) {
                    this.f10134a.remove(next);
                    this.f10134a.add(next);
                }
                publishProgress(new Void[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Void... voidArr) {
            if (CellTowerGroupActivity.this.f10124s) {
                ArrayList arrayList = new ArrayList();
                for (C3943v.C3944a next : this.f10134a) {
                    boolean z = false;
                    Iterator it = CellTowerGroupActivity.this.f10125z.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (next.f10258c.equals((String) it.next())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        arrayList.add(next.f10258c);
                    }
                }
                if (arrayList.size() > 0) {
                    CellTowerGroupActivity.this.f10125z.addAll(arrayList);
                    CellTowerGroupActivity.this.m15210n2();
                    CellTowerGroupActivity.this.f10121F.notifyDataSetChanged();
                }
                TextView textView = CellTowerGroupActivity.this.m_cellTowerCountText;
                textView.setText(CellTowerGroupActivity.this.f10125z.size() + " " + CellTowerGroupActivity.this.getString(C17541R$string.tower_ids_found));
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.celltowers.CellTowerGroupActivity$e */
    static class C3904e {

        /* renamed from: a */
        TextView f10136a;

        /* renamed from: b */
        TextView f10137b;

        /* renamed from: c */
        CheckBox f10138c;

        C3904e() {
        }
    }

    /* renamed from: c2 */
    private void m15199c2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Settings);
        builder.setTitle((int) C17541R$string.trigger_cell_tower_add_tower_id);
        EditText editText = new EditText(this);
        editText.setInputType(524289);
        editText.setHint(C17541R$string.trigger_cell_tower_enter_group_name_hint);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        builder.setView(editText, dimensionPixelOffset, getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin), dimensionPixelOffset, 0);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3920c(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        Button button = show.getButton(-1);
        button.setEnabled(false);
        editText.addTextChangedListener(new C3901b(button));
    }

    /* renamed from: d2 */
    private void m15200d2(String str) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Settings);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_background_cell_scan_configure);
        appCompatDialog.setTitle((int) C17541R$string.scan_in_background);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3926f(this, str, getResources().getIntArray(C17525R$array.cell_tower_background_scan_durations), (Spinner) appCompatDialog.findViewById(C17532R$id.dialog_background_scan_spinner)));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3922d(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: e2 */
    private void m15201e2(Intent intent) {
        this.f10118C = intent.getStringExtra("NewGroupName");
        this.f10122o = C3932l.m15307e();
        this.f10119D = intent.getStringExtra("CellTowerGroupName");
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public /* synthetic */ void m15202f2(EditText editText, DialogInterface dialogInterface, int i) {
        this.f10125z.add(editText.getText().toString());
        this.f10121F.notifyDataSetChanged();
        m15210n2();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public /* synthetic */ void m15203g2(String str, int[] iArr, Spinner spinner, View view) {
        m15209m2();
        finish();
        Intent intent = new Intent(this, CellTowerBackgroundScanService.class);
        intent.putExtra("cellTowerGroupName", str);
        intent.putExtra("endTime", CellTowerBackgroundScanService.m15183a(iArr[spinner.getSelectedItemPosition()]));
        startService(intent);
        C15626c.makeText(getApplicationContext(), C17541R$string.background_scanning_active, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m15205i2(DialogInterface dialogInterface, int i) {
        m15209m2();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m15206j2(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m15207k2(View view) {
        m15209m2();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m15208l2() {
        TextView textView = this.m_cellTowerCountText;
        textView.setText(this.f10125z.size() + " " + getString(C17541R$string.tower_ids_found));
        C3902c cVar = new C3902c(this, this.f10125z, this.f10116A, this.f10120E.mo28639f());
        this.f10121F = cVar;
        this.m_cellTowerList.setAdapter(cVar);
    }

    /* renamed from: m2 */
    private void m15209m2() {
        this.f10123p.updateCellTowerGroup(this.f10125z, this.f10116A);
        if (this.f10122o.mo27631d(this.f10123p.getName()) == null) {
            this.f10122o.mo27628a(this.f10123p);
        }
        this.f10122o.mo27633h();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m15210n2() {
        this.m_fab.setVisibility(0);
        this.f10117B = true;
    }

    /* renamed from: o2 */
    private void m15211o2() {
        this.f10124s = true;
        new C3903d().execute((Object[]) null);
        this.m_scanBgButton.setVisibility(0);
        this.m_scanningText.setText(C17541R$string.trigger_cell_tower_scanning);
        this.m_scanningLayout.setVisibility(0);
    }

    public void onBackPressed() {
        if (!this.f10117B) {
            super.onBackPressed();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Settings);
        builder.setTitle((int) C17541R$string.save_changes);
        builder.setMessage((int) C17541R$string.cell_tower_group_edited);
        builder.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C3916a(this));
        builder.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C3918b(this));
        builder.show();
    }

    @OnClick({2131362203})
    public void onCellTowerBgScanPressed(View view) {
        m15200d2(this.f10123p.getName());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_cell_tower_group);
        ButterKnife.bind((Activity) this);
        this.f10120E = C4373a.m17336h();
        m15201e2(getIntent());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.cell_group_menu, menu);
        return true;
    }

    public void onEventMainThread(CellTowerUpdateEvent cellTowerUpdateEvent) {
        m15208l2();
        m15210n2();
        this.m_fab.setVisibility(0);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m15201e2(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == 2131363210) {
            m15199c2();
            return true;
        } else if (itemId != 2131363257) {
            return true;
        } else {
            m15211o2();
            return true;
        }
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        this.m_scanningLayout.setVisibility(8);
        this.f10124s = false;
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C10180a.m40075a().mo80019m(this);
        this.f10125z = new ArrayList<>();
        this.f10116A = new HashSet();
        if (this.f10118C != null) {
            C7964a aVar = new C7964a();
            this.f10123p = aVar;
            aVar.setName(this.f10118C);
            setTitle(this.f10118C);
            this.m_fab.setVisibility(0);
        } else {
            this.f10123p = this.f10122o.mo27631d(this.f10119D);
            setTitle(this.f10119D);
        }
        C7964a aVar2 = this.f10123p;
        if (aVar2 == null) {
            finish();
        } else {
            this.f10125z.addAll(aVar2.getCellTowerIds());
            this.f10116A.addAll(this.f10123p.getIgnoreSet());
            m15208l2();
            this.m_fab.setOnClickListener(new C3924e(this));
            if (this.f10118C != null) {
                m15211o2();
            } else if (CellTowerBackgroundScanService.m15185c() != null && CellTowerBackgroundScanService.m15185c().equals(this.f10123p.getName())) {
                this.m_scanningLayout.setVisibility(0);
                this.m_scanningText.setText(C17541R$string.background_scan_in_progress);
                this.m_scanBgButton.setVisibility(8);
            }
        }
        if (Build.VERSION.SDK_INT >= 27) {
            try {
                if (Settings.Secure.getInt(getContentResolver(), "location_mode") == 0) {
                    SnackbarAnimate i = SnackbarAnimate.m69574i(findViewById(C17532R$id.coordinator_layout), getString(C17541R$string.location_services_must_be_enabled), -2);
                    i.mo58926l(C17541R$string.configure, new C3900a());
                    i.mo58928n(-1);
                    i.mo58921e().setBackgroundResource(C17528R$color.macro_error);
                    i.mo58932r();
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
    }

    @OnClick({2131362205})
    public void onScanningStopPressed(View view) {
        if (this.f10124s) {
            this.f10124s = false;
        } else {
            CellTowerBackgroundScanService.m15184b(this);
        }
        this.m_scanningLayout.setVisibility(8);
    }
}
