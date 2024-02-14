package com.arlosoft.macrodroid.drawer.p069ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.common.C3666b;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4022j;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.drawer.p069ui.C4495e1;
import com.arlosoft.macrodroid.events.DrawerRefreshEvent;
import com.arlosoft.macrodroid.events.IconSelectedEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p135n1.C7967d;
import p149q1.C8152a;
import p149q1.C8153b;
import p149q1.C8154c;
import p149q1.C8155d;
import p149q1.C8156e;
import p149q1.C8157f;
import p149q1.C8158g;
import p149q1.C8160i;
import p149q1.C8161j;
import p149q1.C8162k;
import p161s1.C10180a;
import p183w2.C10330a;
import p187x0.C10351d;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity */
public class DrawerOptionsActivity extends MacroDroidBaseActivity implements C4049q.C4050a {

    /* renamed from: A */
    AlertDialog f11371A;

    /* renamed from: B */
    private int f11372B;

    /* renamed from: o */
    private C8153b f11373o;

    /* renamed from: p */
    private C4490d f11374p;

    /* renamed from: s */
    private AlertDialog f11375s;

    /* renamed from: z */
    private C10351d.C10353b f11376z;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$a */
    class C4468a implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f11377a;

        C4468a(C10351d dVar) {
            this.f11377a = dVar;
        }

        public boolean onQueryTextChange(String str) {
            this.f11377a.getFilter().mo41019a(str, false);
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$b */
    class C4469b implements C16265l<List<String>, C13339u> {

        /* renamed from: a */
        final /* synthetic */ String[] f11379a;

        /* renamed from: c */
        final /* synthetic */ int f11380c;

        C4469b(String[] strArr, int i) {
            this.f11379a = strArr;
            this.f11380c = i;
        }

        /* renamed from: a */
        public C13339u invoke(List<String> list) {
            DrawerOptionsActivity.this.m17694g4(new C8162k(this.f11379a[this.f11380c], new DictionaryKeys(list)), true, C5163j2.m20012M(DrawerOptionsActivity.this));
            return null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$c */
    class C4470c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ CheckBox f11382a;

        C4470c(CheckBox checkBox) {
            this.f11382a = checkBox;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.f11382a.setVisibility(i == 0 ? 8 : 0);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$d */
    class C4471d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11384a;

        /* renamed from: c */
        final /* synthetic */ EditText f11385c;

        C4471d(AlertDialog alertDialog, EditText editText) {
            this.f11384a = alertDialog;
            this.f11385c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f11384a.getButton(-1).setEnabled(this.f11385c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$e */
    class C4472e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11387a;

        /* renamed from: c */
        final /* synthetic */ EditText f11388c;

        C4472e(AlertDialog alertDialog, EditText editText) {
            this.f11387a = alertDialog;
            this.f11388c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f11387a.getButton(-1).setEnabled(this.f11388c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$f */
    class C4473f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11390a;

        /* renamed from: c */
        final /* synthetic */ EditText f11391c;

        C4473f(AlertDialog alertDialog, EditText editText) {
            this.f11390a = alertDialog;
            this.f11391c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f11390a.getButton(-1).setEnabled(this.f11391c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$g */
    class C4474g implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f11393a;

        C4474g(TextView textView) {
            this.f11393a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f11393a.setText(String.valueOf(i + 3));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOptionsActivity$h */
    class C4475h implements C16265l<ActionBlockData, C13339u> {

        /* renamed from: a */
        final /* synthetic */ C8154c f11395a;

        C4475h(C8154c cVar) {
            this.f11395a = cVar;
        }

        /* renamed from: a */
        public C13339u invoke(ActionBlockData actionBlockData) {
            this.f11395a.setActionBlockData(actionBlockData);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static /* synthetic */ void m17613A3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m17615B3(C8161j jVar, EditText editText, long[] jArr, Spinner spinner, CheckBox checkBox, C8152a aVar, DialogInterface dialogInterface, int i) {
        C8161j jVar2;
        if (jVar != null) {
            jVar.setText(editText.getText().toString());
            jVar.setMacroGuid(jArr[spinner.getSelectedItemPosition()]);
        }
        if (jVar != null) {
            jVar2 = jVar;
        } else {
            jVar2 = new C8161j(editText.getText().toString(), jArr[spinner.getSelectedItemPosition()]);
        }
        boolean z = true;
        jVar2.setEnforceConstraints(!checkBox.isChecked());
        if (jVar != null) {
            z = false;
        }
        m17694g4(jVar2, z, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m17617C3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m17619D3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(this, eVar, (Macro) null, true, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m17621E3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m17623F3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m17625G3(C8155d dVar, EditText editText, C8152a aVar, DialogInterface dialogInterface, int i) {
        C8155d dVar2;
        if (dVar != null) {
            dVar.setText(editText.getText().toString());
        }
        if (dVar != null) {
            dVar2 = dVar;
        } else {
            dVar2 = new C8155d(dVar.getPackageName(), dVar.getName());
        }
        dVar2.setText(dVar.getText());
        m17694g4(dVar2, false, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m17627H3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m17629I3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(this, eVar, (Macro) null, true, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m17631J3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static /* synthetic */ void m17633K3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m17635L3(C8158g gVar, EditText editText, boolean z, C8152a aVar, DialogInterface dialogInterface, int i) {
        C8158g gVar2;
        if (gVar != null) {
            gVar.setText(editText.getText().toString());
        }
        if (gVar != null) {
            gVar2 = gVar;
        } else {
            gVar2 = new C8158g(gVar.getPackageName(), gVar.getName());
        }
        gVar2.setText(gVar.getText());
        m17694g4(gVar2, z, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m17637M3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void m17639N3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(this, eVar, (Macro) null, true, true, false, C17542R$style.Theme_App_Dialog_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m17641O3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m17643P3(List list, String[] strArr, DialogInterface dialogInterface, int i) {
        String[] strArr2 = strArr;
        List list2 = list;
        int i2 = i;
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(i2);
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            C6520o0.m24882J0(this, C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, (Macro) null, macroDroidVariable.mo27770n(), (C16265l<? super VariableValue, Boolean>) null, new ArrayList(), 0, C6520o0.C6538e.DONT_SHOW, false, (SelectableItem) null, new C4469b(strArr2, i2));
            return;
        }
        m17694g4(new C8162k(strArr2[i2], (DictionaryKeys) null), true, C5163j2.m20012M(this));
    }

    /* renamed from: Q2 */
    private void m17645Q2(C8153b bVar, C8152a aVar) {
        aVar.drawerItems.add(bVar);
        C5163j2.m19974G3(this, aVar);
        C10180a.m40075a().mo80018i(new DrawerRefreshEvent(1));
        C15626c.makeText(getApplicationContext(), C17541R$string.drawer_item_added, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void m17646Q3(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: R2 */
    private void m17648R2() {
        List<ActionBlock> c = C4934n.m18998M().mo29645c();
        if (c.size() == 0) {
            m17666X2(getString(C17541R$string.no_action_blocks_configured));
            return;
        }
        String[] strArr = new String[c.size()];
        for (int i = 0; i < c.size(); i++) {
            strArr[i] = c.get(i).getName();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.select_action_block);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4524r(this, c));
        AlertDialog create = builder.create();
        create.setOnCancelListener(new C4520p(this));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m17649R3(C8153b bVar, CompoundButton compoundButton, boolean z) {
        bVar.setHideIcon(!z);
        this.f11374p.mo28843D(bVar, false);
    }

    /* renamed from: S2 */
    private void m17651S2(List<C4013g> list) {
        if (!mo27315N1()) {
            View inflate = LayoutInflater.from(new ContextThemeWrapper((Context) this, (int) C17542R$style.Theme_App_Dialog)).inflate(C17535R$layout.dialog_app_chooser, (ViewGroup) null);
            ((ViewGroup) inflate.findViewById(C17532R$id.button_bar)).setVisibility(8);
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
            builder.setTitle((int) C17541R$string.select_application);
            builder.setView(inflate);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4504h(this));
            AlertDialog create = builder.create();
            this.f11375s = create;
            create.setOnCancelListener(new C4513l0(this));
            this.f11375s.getWindow().setLayout(-1, -2);
            this.f11376z = new C4537x0(this);
            C10351d dVar = new C10351d(this, list, (List<Boolean>) null, this.f11376z);
            ((ListView) inflate.findViewById(C17532R$id.application_list)).setAdapter(dVar);
            ((SearchView) inflate.findViewById(C17532R$id.search_view)).setOnQueryTextListener(new C4468a(dVar));
            this.f11375s.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void m17652S3(C8157f fVar, CompoundButton compoundButton, boolean z) {
        fVar.setEnforceConstraints(!z);
        this.f11374p.mo28843D(fVar, false);
    }

    /* renamed from: T2 */
    private void m17654T2() {
        new C4049q(this, this, true, true, ContextCompat.getColor(this, C17528R$color.accent), true).execute((Object[]) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public /* synthetic */ void m17655T3(C8162k kVar, CompoundButton compoundButton, boolean z) {
        kVar.setHideVariableName(z);
        this.f11374p.mo28843D(kVar, false);
    }

    /* renamed from: U2 */
    private void m17657U2() {
        Intent intent = new Intent(this, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", true);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m17658U3(C8160i iVar, CompoundButton compoundButton, boolean z) {
        iVar.setHideName(z);
        this.f11374p.mo28843D(iVar, false);
    }

    /* renamed from: V2 */
    private void m17660V2(C8153b bVar, boolean z, C8152a aVar) {
        boolean z2;
        C8156e eVar;
        if (bVar == null) {
            eVar = new C8156e(z, 10);
            z2 = true;
        } else {
            eVar = bVar;
            z2 = false;
        }
        this.f11373o = eVar;
        View inflate = LayoutInflater.from(this).inflate(C17535R$layout.dialog_configure_log, (ViewGroup) null);
        SeekBar seekBar = (SeekBar) inflate.findViewById(C17532R$id.seek_bar);
        TextView textView = (TextView) inflate.findViewById(C17532R$id.num_lines);
        Button button = (Button) inflate.findViewById(C17532R$id.set_color_button);
        button.getBackground().setColorFilter(eVar.getColor(), PorterDuff.Mode.MULTIPLY);
        button.setOnClickListener(new C4505h0(this, eVar, button));
        int maxLines = ((C8156e) eVar).getMaxLines();
        textView.setText(String.valueOf(maxLines));
        seekBar.setProgress(maxLines - 3);
        seekBar.setOnSeekBarChangeListener(new C4474g(textView));
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((CharSequence) eVar.getName());
        builder.setView(inflate);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4518o(this));
        AlertDialog create = builder.create();
        create.setButton(-1, (CharSequence) getString(17039370), (DialogInterface.OnClickListener) new C4532v(this, eVar, seekBar, z2, aVar));
        create.setOnCancelListener(new C4539y0(this));
        create.getWindow().setLayout(-1, -2);
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m17661V3(C8153b bVar, C8152a aVar, View view) {
        m17675a3((C8161j) bVar, aVar);
    }

    /* renamed from: W2 */
    private void m17663W2() {
        String str;
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        if (B.size() == 0) {
            m17666X2(getString(C17541R$string.no_macros_configured));
            return;
        }
        String[] strArr = new String[B.size()];
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i).getIsFavourite()) {
                str = "⭐ " + B.get(i).getName();
            } else {
                str = B.get(i).getName();
            }
            strArr[i] = str;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.select_macro);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4522q(this, B));
        AlertDialog create = builder.create();
        create.setOnCancelListener(new C4489c1(this));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void m17664W3(C8161j jVar, CompoundButton compoundButton, boolean z) {
        jVar.setEnforceConstraints(!z);
        this.f11374p.mo28843D(jVar, false);
    }

    /* renamed from: X2 */
    private void m17666X2(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setMessage((CharSequence) str).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4502g(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m17667X3(C8153b bVar, C8152a aVar, View view) {
        m17678b3((C8155d) bVar, aVar);
    }

    /* renamed from: Y2 */
    private void m17669Y2() {
        try {
            PackageManager packageManager = getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.CREATE_SHORTCUT"), 0);
            Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
            String[] strArr = new String[queryIntentActivities.size()];
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                strArr[i] = queryIntentActivities.get(i).loadLabel(packageManager).toString();
            }
            C4022j jVar = new C4022j(this, C17535R$layout.application_item, queryIntentActivities, new C4514m(this));
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
            builder.setTitle((int) C17541R$string.action_launch_shortcut_select);
            builder.setSingleChoiceItems((ListAdapter) jVar, 0, (DialogInterface.OnClickListener) null);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4506i(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4528t(this, queryIntentActivities, strArr));
            AlertDialog create = builder.create();
            create.show();
            create.setOnCancelListener(new C4541z0(this));
        } catch (Exception e) {
            C4878b.m18868g("Could not query for packages that support shortcut, maybe too many apps installed? " + e.toString());
            C15626c.makeText(this, C17541R$string.too_many_apps_installed, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void m17670Y3(C8153b bVar, C8152a aVar, boolean z, View view) {
        m17681c3((C8158g) bVar, aVar, z);
    }

    /* renamed from: Z2 */
    private void m17672Z2() {
        List<String> e = C10330a.m40553e(this);
        if (e.size() == 0) {
            m17666X2(getString(C17541R$string.no_stopwatches_defined));
            return;
        }
        String[] strArr = (String[]) e.toArray(new String[0]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.stopwatches);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4540z(this, strArr));
        AlertDialog create = builder.create();
        create.setOnCancelListener(new C4483a1(this));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m17673Z3(ActionBlock actionBlock, C8154c cVar, View view) {
        C3666b.m14512c(this, actionBlock, cVar.getActionBlockData(), (SelectableItem) null, new C4475h(cVar));
    }

    /* renamed from: a3 */
    private void m17675a3(@Nullable C8161j jVar, C8152a aVar) {
        int i;
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.text);
        View inflate = LayoutInflater.from(new ContextThemeWrapper((Context) this, (int) C17542R$style.Theme_App_Dialog)).inflate(C17535R$layout.dialog_enter_text, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(2131363972);
        Button button = (Button) inflate.findViewById(C17532R$id.special_text_button);
        Spinner spinner = (Spinner) inflate.findViewById(C17532R$id.macro_spinner);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C17532R$id.ignore_constraints);
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        String[] strArr = new String[(B.size() + 1)];
        long[] jArr = new long[(B.size() + 1)];
        strArr[0] = getString(C17541R$string.none);
        jArr[0] = 0;
        if (B.size() > 0) {
            int i2 = 0;
            i = 0;
            while (i2 < B.size()) {
                int i3 = i2 + 1;
                strArr[i3] = B.get(i2).getName();
                jArr[i3] = B.get(i2).getGUID();
                if (jVar != null && jArr[i3] == jVar.getMacroGuid()) {
                    i = i3;
                }
                i2 = i3;
            }
        } else {
            i = 0;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, C17535R$layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(i);
        spinner.setOnItemSelectedListener(new C4470c(checkBox));
        C4527s0 s0Var = new C4527s0(editText);
        if (jVar != null) {
            editText.setText(jVar.getText());
        }
        C4538y yVar = r0;
        C4538y yVar2 = new C4538y(this, jVar, editText, jArr, spinner, checkBox, aVar);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) yVar);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4516n(this));
        button.setOnClickListener(new C4501f0(this, s0Var));
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        show.setOnCancelListener(new C4482a0(this));
        show.getButton(-1).setEnabled(editText.getText().length() > 0);
        editText.addTextChangedListener(new C4471d(show, editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m17676a4(C8153b bVar, CheckBox checkBox, boolean z, C8152a aVar, DialogInterface dialogInterface, int i) {
        bVar.setHideIcon(!checkBox.isChecked());
        if (z) {
            m17645Q2(bVar, aVar);
        } else {
            C5163j2.m19974G3(this, aVar);
            C10180a.m40075a().mo80018i(new DrawerRefreshEvent(0));
        }
        this.f11371A.dismiss();
        finish();
    }

    /* renamed from: b3 */
    private void m17678b3(@Nullable C8155d dVar, C8152a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.text);
        View inflate = LayoutInflater.from(new ContextThemeWrapper((Context) this, (int) C17542R$style.Theme_App_Dialog)).inflate(C17535R$layout.dialog_enter_text, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(2131363972);
        Button button = (Button) inflate.findViewById(C17532R$id.special_text_button);
        ((Spinner) inflate.findViewById(C17532R$id.macro_spinner)).setVisibility(8);
        ((TextView) inflate.findViewById(C17532R$id.invoke_macro_label)).setVisibility(8);
        C4529t0 t0Var = new C4529t0(editText);
        if (dVar != null) {
            editText.setText(dVar.getText());
        }
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4534w(this, dVar, editText, aVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4512l(this));
        button.setOnClickListener(new C4494e0(this, t0Var));
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        show.setOnCancelListener(new C4500f(this));
        show.getButton(-1).setEnabled(editText.getText().length() > 0);
        editText.addTextChangedListener(new C4472e(show, editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m17679b4(DialogInterface dialogInterface, int i) {
        this.f11371A.dismiss();
        finish();
    }

    /* renamed from: c3 */
    private void m17681c3(@Nullable C8158g gVar, C8152a aVar, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.text);
        View inflate = LayoutInflater.from(new ContextThemeWrapper((Context) this, (int) C17542R$style.Theme_App_Dialog)).inflate(C17535R$layout.dialog_enter_text, (ViewGroup) null);
        builder.setView(inflate);
        EditText editText = (EditText) inflate.findViewById(2131363972);
        Button button = (Button) inflate.findViewById(C17532R$id.special_text_button);
        ((Spinner) inflate.findViewById(C17532R$id.macro_spinner)).setVisibility(8);
        ((TextView) inflate.findViewById(C17532R$id.invoke_macro_label)).setVisibility(8);
        C4525r0 r0Var = new C4525r0(editText);
        if (gVar != null) {
            editText.setText(gVar.getText());
        }
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4536x(this, gVar, editText, z, aVar));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4508j(this));
        button.setOnClickListener(new C4491d0(this, r0Var));
        AlertDialog show = builder.show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(show.getWindow().getAttributes());
        layoutParams.width = -1;
        show.getWindow().setAttributes(layoutParams);
        show.setOnCancelListener(new C4493e(this));
        show.getButton(-1).setEnabled(editText.getText().length() > 0);
        editText.addTextChangedListener(new C4473f(show, editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public /* synthetic */ void m17682c4(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: d3 */
    private void m17684d3() {
        List<MacroDroidVariable> r = C4064u.m16048t().mo27993r(true);
        if (r.size() == 0) {
            m17666X2(getString(C17541R$string.no_variables_configured));
            return;
        }
        String[] strArr = new String[r.size()];
        for (int i = 0; i < r.size(); i++) {
            strArr[i] = r.get(i).getName();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4526s(this, r, strArr));
        AlertDialog create = builder.create();
        create.setOnCancelListener(new C4535w0(this));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public /* synthetic */ void m17685d4(C8153b bVar, View view, boolean z, int i) {
        if (z) {
            bVar.setColor(i);
            if (!mo27315N1()) {
                this.f11374p.mo28843D(bVar, false);
                view.setBackgroundColor(i);
            }
        }
    }

    /* renamed from: e3 */
    public static Intent m17687e3(Context context, long j) {
        Intent intent = new Intent(context, DrawerOptionsActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("drawer_item_id", j);
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public /* synthetic */ void m17688e4(C8153b bVar, View view, View view2) {
        if (mo27314M1()) {
            this.f11371A.dismiss();
        } else {
            new C4495e1.C4498c(this).mo28911g(C17541R$string.select_color).mo28906b(C17525R$array.toast_colors).mo28910f(bVar.getColor()).mo28907c(true).mo28909e(1).mo28908d(new C4531u0(this, bVar, view)).mo28905a().show(getSupportFragmentManager(), "ColorDialog");
        }
    }

    /* renamed from: f3 */
    public static Intent m17690f3(Context context, int i) {
        Intent intent = new Intent(context, DrawerOptionsActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("option_type", i);
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public /* synthetic */ void m17691f4(View view) {
        if (mo27314M1()) {
            this.f11371A.dismiss();
        } else if (!mo27315N1()) {
            m17657U2();
        }
    }

    /* renamed from: g3 */
    public static Intent m17693g3(Context context, long j, boolean z) {
        Intent intent = new Intent(context, DrawerOptionsActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("user_log", z);
        intent.putExtra("drawer_item_id", j);
        intent.putExtra("option_type", 6);
        return intent;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0164  */
    /* renamed from: g4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m17694g4(p149q1.C8153b r17, boolean r18, p149q1.C8152a r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r5 = r19
            if (r7 != 0) goto L_0x0009
            return
        L_0x0009:
            r6.f11373o = r7
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r16)
            r1 = 2131558563(0x7f0d00a3, float:1.8742445E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131363759(0x7f0a07af, float:1.8347336E38)
            android.view.View r1 = r0.findViewById(r1)
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 2131363758(0x7f0a07ae, float:1.8347334E38)
            android.view.View r1 = r0.findViewById(r1)
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 2131362609(0x7f0a0331, float:1.8345003E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 2131362882(0x7f0a0442, float:1.8345557E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r4 = 2131362927(0x7f0a046f, float:1.8345648E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r10 = 2131363787(0x7f0a07cb, float:1.8347393E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r11 = 2131363976(0x7f0a0888, float:1.8347776E38)
            android.view.View r11 = r0.findViewById(r11)
            int r12 = r17.getLayoutResId()
            com.arlosoft.macrodroid.drawer.ui.d r2 = p143p1.C8057k.m33603D(r2, r1, r12, r2)
            r6.f11374p = r2
            r12 = 0
            r2.mo28843D(r7, r12)
            com.arlosoft.macrodroid.drawer.ui.d r2 = r6.f11374p
            android.view.View r2 = r2.itemView
            r1.addView(r2)
            int r2 = r17.getColor()
            r11.setBackgroundColor(r2)
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            r13 = 2132017801(0x7f140289, float:1.967389E38)
            r2.<init>(r6, r13)
            java.lang.String r13 = r17.getName()
            r2.setTitle((java.lang.CharSequence) r13)
            r2.setView((android.view.View) r0)
            boolean r13 = r17.hideIcon()
            r13 = r13 ^ 1
            r10.setChecked(r13)
            androidx.appcompat.app.AlertDialog r2 = r2.create()
            r6.f11371A = r2
            com.arlosoft.macrodroid.drawer.ui.m0 r2 = new com.arlosoft.macrodroid.drawer.ui.m0
            r2.<init>(r6, r7)
            r10.setOnCheckedChangeListener(r2)
            int r2 = r5.backgroundColor
            r1.setBackgroundColor(r2)
            boolean r1 = r7 instanceof p149q1.C8157f
            if (r1 == 0) goto L_0x00bc
            r1 = r7
            q1.f r1 = (p149q1.C8157f) r1
            r4.setVisibility(r12)
            boolean r2 = r1.getEnforceConstraints()
            r2 = r2 ^ 1
            r4.setChecked(r2)
            com.arlosoft.macrodroid.drawer.ui.n0 r2 = new com.arlosoft.macrodroid.drawer.ui.n0
            r2.<init>(r6, r1)
            r4.setOnCheckedChangeListener(r2)
            goto L_0x00db
        L_0x00bc:
            boolean r1 = r7 instanceof p149q1.C8162k
            if (r1 == 0) goto L_0x00df
            r3.setVisibility(r12)
            r1 = 2131953837(0x7f1308ad, float:1.9544156E38)
            r3.setText(r1)
            r1 = r7
            q1.k r1 = (p149q1.C8162k) r1
            boolean r2 = r1.getHideName()
            r3.setChecked(r2)
            com.arlosoft.macrodroid.drawer.ui.q0 r2 = new com.arlosoft.macrodroid.drawer.ui.q0
            r2.<init>(r6, r1)
            r3.setOnCheckedChangeListener(r2)
        L_0x00db:
            r4 = r18
            goto L_0x0160
        L_0x00df:
            boolean r1 = r7 instanceof p149q1.C8160i
            if (r1 == 0) goto L_0x00f9
            r3.setVisibility(r12)
            r1 = r7
            q1.i r1 = (p149q1.C8160i) r1
            boolean r2 = r1.getHideName()
            r3.setChecked(r2)
            com.arlosoft.macrodroid.drawer.ui.o0 r2 = new com.arlosoft.macrodroid.drawer.ui.o0
            r2.<init>(r6, r1)
            r3.setOnCheckedChangeListener(r2)
            goto L_0x00db
        L_0x00f9:
            boolean r1 = r7 instanceof p149q1.C8161j
            r2 = 2131363760(0x7f0a07b0, float:1.8347338E38)
            if (r1 == 0) goto L_0x0133
            android.view.View r1 = r0.findViewById(r2)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r12)
            com.arlosoft.macrodroid.drawer.ui.j0 r2 = new com.arlosoft.macrodroid.drawer.ui.j0
            r2.<init>(r6, r7, r5)
            r1.setOnClickListener(r2)
            r1 = r7
            q1.j r1 = (p149q1.C8161j) r1
            long r2 = r1.getMacroGuid()
            r13 = 0
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x00db
            r4.setVisibility(r12)
            boolean r2 = r1.getEnforceConstraints()
            r2 = r2 ^ 1
            r4.setChecked(r2)
            com.arlosoft.macrodroid.drawer.ui.p0 r2 = new com.arlosoft.macrodroid.drawer.ui.p0
            r2.<init>(r6, r1)
            r4.setOnCheckedChangeListener(r2)
            goto L_0x00db
        L_0x0133:
            boolean r1 = r7 instanceof p149q1.C8155d
            if (r1 == 0) goto L_0x0149
            android.view.View r1 = r0.findViewById(r2)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r12)
            com.arlosoft.macrodroid.drawer.ui.i0 r2 = new com.arlosoft.macrodroid.drawer.ui.i0
            r2.<init>(r6, r7, r5)
            r1.setOnClickListener(r2)
            goto L_0x00db
        L_0x0149:
            boolean r1 = r7 instanceof p149q1.C8158g
            if (r1 == 0) goto L_0x00db
            android.view.View r1 = r0.findViewById(r2)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r12)
            com.arlosoft.macrodroid.drawer.ui.k0 r2 = new com.arlosoft.macrodroid.drawer.ui.k0
            r4 = r18
            r2.<init>(r6, r7, r5, r4)
            r1.setOnClickListener(r2)
        L_0x0160:
            boolean r1 = r7 instanceof p149q1.C8154c
            if (r1 == 0) goto L_0x0187
            r1 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r0.setVisibility(r12)
            r1 = r7
            q1.c r1 = (p149q1.C8154c) r1
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            long r12 = r1.getActionBlockGuid()
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r2.mo29649g(r12)
            com.arlosoft.macrodroid.drawer.ui.c0 r3 = new com.arlosoft.macrodroid.drawer.ui.c0
            r3.<init>(r6, r2, r1)
            r0.setOnClickListener(r3)
        L_0x0187:
            androidx.appcompat.app.AlertDialog r12 = r6.f11371A
            r0 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r13 = r6.getString(r0)
            com.arlosoft.macrodroid.drawer.ui.u r14 = new com.arlosoft.macrodroid.drawer.ui.u
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r10
            r4 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r12.setButton((int) r0, (java.lang.CharSequence) r13, (android.content.DialogInterface.OnClickListener) r14)
            androidx.appcompat.app.AlertDialog r1 = r6.f11371A
            r2 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r2 = r6.getString(r2)
            com.arlosoft.macrodroid.drawer.ui.k r3 = new com.arlosoft.macrodroid.drawer.ui.k
            r3.<init>(r6)
            r4 = -2
            r1.setButton((int) r4, (java.lang.CharSequence) r2, (android.content.DialogInterface.OnClickListener) r3)
            androidx.appcompat.app.AlertDialog r1 = r6.f11371A
            com.arlosoft.macrodroid.drawer.ui.b1 r2 = new com.arlosoft.macrodroid.drawer.ui.b1
            r2.<init>(r6)
            r1.setOnCancelListener(r2)
            androidx.appcompat.app.AlertDialog r1 = r6.f11371A
            android.view.Window r1 = r1.getWindow()
            r1.setLayout(r0, r4)
            androidx.appcompat.app.AlertDialog r0 = r6.f11371A
            r0.show()
            com.arlosoft.macrodroid.drawer.ui.g0 r0 = new com.arlosoft.macrodroid.drawer.ui.g0
            r0.<init>(r6, r7, r11)
            r9.setOnClickListener(r0)
            com.arlosoft.macrodroid.drawer.ui.b0 r0 = new com.arlosoft.macrodroid.drawer.ui.b0
            r0.<init>(r6)
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.drawer.p069ui.DrawerOptionsActivity.m17694g4(q1.b, boolean, q1.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void m17696h3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m17698i3(List list, DialogInterface dialogInterface, int i) {
        ActionBlock actionBlock = (ActionBlock) list.get(i);
        m17694g4(new C8154c(new ActionBlockData(actionBlock.getName(), actionBlock.getGUID(), new HashMap(), new HashMap())), true, C5163j2.m20012M(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m17700j3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m17702k3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m17704l3(C4013g gVar) {
        m17694g4(new C8155d(gVar.f10397b, gVar.f10396a), true, C5163j2.m20012M(getApplicationContext()));
        this.f11375s.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static /* synthetic */ void m17706m3(C8153b bVar, Button button, boolean z, int i) {
        if (z) {
            bVar.setColor(i);
            button.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m17708n3(C8153b bVar, Button button, View view) {
        new C4495e1.C4498c(this).mo28911g(C17541R$string.select_color).mo28906b(C17525R$array.toast_colors).mo28910f(bVar.getColor()).mo28907c(true).mo28909e(1).mo28908d(new C4533v0(bVar, button)).mo28905a().show(getSupportFragmentManager(), "ColorDialog");
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m17710o3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m17712p3(C8153b bVar, SeekBar seekBar, boolean z, C8152a aVar, DialogInterface dialogInterface, int i) {
        ((C8156e) bVar).setMaxLines(seekBar.getProgress() + 3);
        if (z) {
            m17645Q2(bVar, C5163j2.m20012M(this));
        } else {
            C5163j2.m19974G3(this, aVar);
            C10180a.m40075a().mo80018i(new DrawerRefreshEvent(0));
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m17714q3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m17716r3(List list, DialogInterface dialogInterface, int i) {
        m17694g4(new C8157f(((Macro) list.get(i)).getGUID()), true, C5163j2.m20012M(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m17718s3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m17720t3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m17722u3(DialogInterface dialogInterface, int i) {
        this.f11372B = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m17724v3(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m17726w3(List list, String[] strArr, DialogInterface dialogInterface, int i) {
        ResolveInfo resolveInfo = (ResolveInfo) list.get(this.f11372B);
        Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.putExtra("extra_pick_icon", false);
        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
        this.f11373o = new C8158g(activityInfo2.packageName, activityInfo2.name);
        try {
            startActivityForResult(intent, 0);
        } catch (Exception unused) {
            C15626c.makeText(getApplicationContext(), C17541R$string.error, 0).show();
        }
        String str = strArr[this.f11372B];
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m17728x3(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m17730y3(String[] strArr, DialogInterface dialogInterface, int i) {
        m17694g4(new C8160i(strArr[i]), true, C5163j2.m20012M(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m17732z3(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: B0 */
    public void mo24816B0(List<C4013g> list, boolean z) {
        m17651S2(list);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            return;
        }
        if (i == 0) {
            if (this.f11373o != null) {
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT");
                ((C8158g) this.f11373o).setShortcutName(intent.getStringExtra("android.intent.extra.shortcut.NAME"));
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                if (intent2 != null) {
                    ((C8158g) this.f11373o).setIntent(intent2.toURI());
                    m17694g4(this.f11373o, true, C5163j2.m20012M(getApplicationContext()));
                    return;
                }
                C15626c.makeText(getApplicationContext(), C17541R$string.shortcut_not_compatible, 0).show();
            }
        } else if (this.f11373o != null) {
            String stringExtra = intent.getStringExtra("drawableName");
            this.f11373o.setIcon(intent.getStringExtra("drawablePackageName"), stringExtra);
            C4490d dVar = this.f11374p;
            if (dVar != null) {
                dVar.mo28843D(this.f11373o, false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("drawer_item_id", 0);
        int intExtra = getIntent().getIntExtra("option_type", 0);
        C8152a M = C5163j2.m20012M(this);
        C8153b itemByGuid = M.getItemByGuid(longExtra);
        switch (intExtra) {
            case 0:
                if (!(itemByGuid instanceof C8156e)) {
                    m17694g4(itemByGuid, false, M);
                    break;
                } else {
                    m17660V2(itemByGuid, ((C8156e) itemByGuid).isUserLog(), M);
                    break;
                }
            case 1:
                m17654T2();
                break;
            case 2:
                m17663W2();
                break;
            case 3:
                m17648R2();
                break;
            case 4:
                m17684d3();
                break;
            case 5:
                m17672Z2();
                break;
            case 6:
                m17660V2(itemByGuid, getIntent().getBooleanExtra("user_log", false), M);
                break;
            case 7:
                m17675a3((C8161j) null, M);
                break;
            case 8:
                m17669Y2();
                break;
        }
        C10180a.m40075a().mo80019m(this);
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        this.f11376z = null;
        super.onDestroy();
    }

    public void onEventMainThread(IconSelectedEvent iconSelectedEvent) {
        C8153b bVar = this.f11373o;
        if (bVar != null) {
            bVar.setIcon(iconSelectedEvent.f11747a, iconSelectedEvent.f11748b);
            C4490d dVar = this.f11374p;
            if (dVar != null) {
                dVar.mo28843D(this.f11373o, false);
            }
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        AlertDialog alertDialog = this.f11375s;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f11375s.dismiss();
        }
        super.onStop();
    }
}
