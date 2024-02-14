package com.arlosoft.macrodroid;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.events.RefreshHomeScreenEvent;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.permissions.MacroImportPermissionsActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6409o;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p037m.C2009f;
import p081e1.C7264a;
import p112j2.C7439d0;
import p148q0.C8151a;
import p161s1.C10180a;
import p172u1.C10283c;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

public class ExportImportActivity extends MacroDroidDialogDaggerBaseActivity implements C6409o.C6411b {

    /* renamed from: A */
    private ViewGroup f7009A;

    /* renamed from: B */
    private C6409o f7010B;

    /* renamed from: C */
    private CategoryList f7011C;

    /* renamed from: o */
    C4083b f7012o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient C2009f f7013p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f7014s = null;

    /* renamed from: z */
    private CheckBox f7015z;

    /* renamed from: com.arlosoft.macrodroid.ExportImportActivity$a */
    class C2290a implements C6409o.C6412c {
        C2290a() {
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            ExportImportActivity.this.m9455h2();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.ExportImportActivity$b */
    class C2291b implements C6409o.C6412c {
        C2291b() {
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            ExportImportActivity.this.m9461n2();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.ExportImportActivity$c */
    class C2292c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7018a;

        /* renamed from: c */
        final /* synthetic */ EditText f7019c;

        C2292c(Button button, EditText editText) {
            this.f7018a = button;
            this.f7019c = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f7018a.setEnabled(this.f7019c.getText().length() > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.ExportImportActivity$d */
    class C2293d implements DialogInterface.OnCancelListener {
        C2293d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
            ExportImportActivity.this.finish();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.ExportImportActivity$e */
    private class C2294e extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private int f7022a = 0;

        /* renamed from: b */
        private List<Macro> f7023b;

        /* renamed from: c */
        private long f7024c;

        /* renamed from: d */
        private final boolean f7025d;

        /* renamed from: e */
        private Uri f7026e = null;

        /* renamed from: f */
        private boolean f7027f;

        /* renamed from: g */
        private boolean f7028g;

        /* renamed from: h */
        private boolean f7029h;

        /* renamed from: i */
        private boolean f7030i;

        /* renamed from: j */
        private boolean f7031j;

        public C2294e(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            String unused = ExportImportActivity.this.f7014s = str;
            this.f7025d = z;
            this.f7029h = z2;
            this.f7027f = z3;
            this.f7031j = z4;
        }

        /* renamed from: b */
        private boolean m9480b(SelectableItem selectableItem) {
            return !C7439d0.m30925z(ExportImportActivity.this, selectableItem, true);
        }

        /* renamed from: c */
        private boolean m9481c(SelectableItem selectableItem) {
            boolean A = C7439d0.m30854A(ExportImportActivity.this, selectableItem, false, false);
            if (A) {
                A = C7439d0.m30925z(ExportImportActivity.this, selectableItem, false);
            }
            return !A;
        }

        /* renamed from: d */
        private boolean m9482d(List<Macro> list) {
            for (Macro next : list) {
                Iterator<Trigger> it = next.getTriggerList().iterator();
                while (it.hasNext()) {
                    if (m9481c(it.next())) {
                        return true;
                    }
                }
                Iterator<Action> it2 = next.getActions().iterator();
                while (it2.hasNext()) {
                    if (m9481c(it2.next())) {
                        return true;
                    }
                }
                Iterator<Constraint> it3 = next.getConstraints().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (m9481c(it3.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        private boolean m9483e(List<Macro> list) {
            for (Macro next : list) {
                Iterator<Trigger> it = next.getTriggerList().iterator();
                while (it.hasNext()) {
                    if (m9480b(it.next())) {
                        return true;
                    }
                }
                Iterator<Action> it2 = next.getActions().iterator();
                while (it2.hasNext()) {
                    if (m9480b(it2.next())) {
                        return true;
                    }
                }
                Iterator<Constraint> it3 = next.getConstraints().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (m9480b(it3.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m9484g(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ExportImportActivity.this.finish();
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public Integer doInBackground(Void... voidArr) {
            if (this.f7026e != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ExportImportActivity.this.getContentResolver().openInputStream(this.f7026e)));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String unused = ExportImportActivity.this.f7014s = sb.toString();
                } catch (Exception unused2) {
                    return null;
                }
            }
            if (this.f7027f) {
                C4934n.m18998M().mo29691j0();
            }
            try {
                if (this.f7025d) {
                    this.f7023b = C4934n.m18998M().mo29685T(ExportImportActivity.this.f7014s, true);
                } else {
                    this.f7023b = C4934n.m18998M().mo29686U(ExportImportActivity.this.f7014s, true);
                }
                if (this.f7029h) {
                    C4064u.m16048t().mo27977L();
                }
                int f0 = C5163j2.m20151f0(ExportImportActivity.this);
                List<Macro> list = this.f7023b;
                if (list != null && list.size() > 0) {
                    List<Macro> z = C4934n.m18998M().mo29710z();
                    for (Macro next : this.f7023b) {
                        if (!ExportImportActivity.this.f7012o.mo28009e().mo28008a()) {
                            if (z.size() > f0) {
                                this.f7028g = true;
                            }
                        }
                        Iterator<Macro> it = z.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Macro next2 = it.next();
                                if (next2.getName().equals(next.getName()) && next2.getGUID() == next.getGUID()) {
                                    this.f7030i = true;
                                    break;
                                } else if (next2.getName().equals(next.getName())) {
                                    next.setName(next.getName() + " (2)");
                                }
                            } else {
                                z.add(next);
                                if (!next.isActionBlock) {
                                    this.f7022a++;
                                }
                            }
                        }
                    }
                    C4934n.m18998M().mo29693m0(z);
                    C4934n.m18998M().mo29702s0();
                    C10180a.m40075a().mo80018i(new RefreshHomeScreenEvent());
                }
            } catch (Exception unused3) {
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void onPostExecute(Integer num) {
            String str;
            Class<MacroImportPermissionsActivity> cls = MacroImportPermissionsActivity.class;
            long currentTimeMillis = (System.currentTimeMillis() - this.f7024c) / 1000;
            if (this.f7028g) {
                C15626c.makeText(ExportImportActivity.this.getApplicationContext(), C17541R$string.macro_limit_reached, 0).show();
            }
            if (this.f7030i) {
                C15626c.makeText(ExportImportActivity.this.getApplicationContext(), C17541R$string.duplicate_detected, 0).show();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("IMPORT TIME: ");
            sb.append(currentTimeMillis);
            sb.append("s");
            if (this.f7022a > 0) {
                if (ExportImportActivity.this.f7013p != null) {
                    try {
                        ExportImportActivity.this.f7013p.dismiss();
                    } catch (Exception unused) {
                    }
                }
                List<Macro> list = this.f7023b;
                if (list != null) {
                    for (Macro c2 : list) {
                        ExportImportActivity.this.m9453f2(c2);
                    }
                    if (m9483e(this.f7023b)) {
                        num = 1;
                    } else {
                        num = Integer.valueOf(m9482d(this.f7023b) ? 2 : 0);
                    }
                }
                if (num.intValue() != 1) {
                    try {
                        str = this.f7022a == 1 ? ExportImportActivity.this.getString(C17541R$string.macro_imported) : String.format(ExportImportActivity.this.getString(C17541R$string.x_macros_imported), new Object[]{Integer.valueOf(this.f7022a)});
                    } catch (Exception unused2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ExportImportActivity.this.getString(C17541R$string.imported));
                        sb2.append(" ");
                        sb2.append(this.f7022a);
                        sb2.append(" ");
                        sb2.append(ExportImportActivity.this.getString(this.f7022a == 1 ? C17541R$string.action_disable_macro_macro : C17541R$string.macros).toLowerCase(Locale.getDefault()));
                        str = sb2.toString();
                    }
                    C15626c.m94876a(ExportImportActivity.this.getApplicationContext(), str, 1).show();
                }
                if (num.intValue() == 2) {
                    ExportImportActivity.this.finish();
                    ExportImportActivity.this.startActivity(new Intent(ExportImportActivity.this.getApplicationContext(), cls));
                } else if (num.intValue() == 1) {
                    C15626c.m94876a(ExportImportActivity.this.getApplicationContext(), ExportImportActivity.this.getString(C17541R$string.requires_permission_to_import), 1).show();
                    Intent intent = new Intent(ExportImportActivity.this, cls);
                    intent.putExtra("check_import_permissions", true);
                    ExportImportActivity.this.startActivityForResult(intent, 2);
                } else {
                    ExportImportActivity.this.finish();
                    C4934n.m18998M().mo29694n0();
                    if (this.f7031j) {
                        ExportImportActivity.this.startActivity(NewHomeScreenActivity.f11920O.mo29282a(ExportImportActivity.this));
                    }
                }
            } else {
                if (ExportImportActivity.this.f7013p != null) {
                    try {
                        ExportImportActivity.this.f7013p.dismiss();
                    } catch (Exception unused3) {
                    }
                }
                if (this.f7028g || this.f7030i) {
                    if (this.f7031j) {
                        ExportImportActivity.this.startActivity(NewHomeScreenActivity.f11920O.mo29282a(ExportImportActivity.this));
                    }
                    ExportImportActivity.this.finish();
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ExportImportActivity.this, C17542R$style.Theme_App_Dialog_ExportImport);
                builder.setTitle((int) C17541R$string.import_failed);
                builder.setMessage((int) C17541R$string.could_not_import).setCancelable(false).setNegativeButton(17039370, (DialogInterface.OnClickListener) new C6656x(this));
                if (!ExportImportActivity.this.mo24633L1()) {
                    builder.create().show();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f7024c = System.currentTimeMillis();
            ExportImportActivity exportImportActivity = ExportImportActivity.this;
            exportImportActivity.m9433H2(exportImportActivity.getString(C17541R$string.importing_macros));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void m9426A2(DialogInterface dialogInterface, int i) {
        m9465r2();
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m9427B2(View view) {
        if (m9462o2()) {
            this.f7010B.mo32449u(this, getString(C17541R$string.enter_category_lock_password), "", C5163j2.m19992J0(this), 0, new C2290a());
            return;
        }
        m9455h2();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m9428C2(View view) {
        if (m9462o2()) {
            this.f7010B.mo32449u(this, getString(C17541R$string.enter_category_lock_password), "", C5163j2.m19992J0(this), 0, new C2291b());
            return;
        }
        m9461n2();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void m9429D2(View view) {
        if (m9454g2("android.permission.WRITE_EXTERNAL_STORAGE", 0)) {
            this.f7009A.setVisibility(4);
            m9432G2();
        }
    }

    /* renamed from: E2 */
    private void m9430E2(String str, boolean z, boolean z2, boolean z3) {
        new C2294e(str, z, this.f7015z.isChecked(), z2, z3).execute((Object[]) null);
    }

    /* renamed from: F2 */
    private void m9431F2() {
        try {
            startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 20);
            C15626c.makeText(getApplicationContext(), C17541R$string.select_export_directory, 1).show();
        } catch (ActivityNotFoundException e) {
            C4878b.m18868g("No activity to handle ACTION_OPEN_DOCUMENT_TREE intent: " + e.toString());
            C8151a.m33873n(e);
        }
    }

    /* renamed from: G2 */
    private void m9432G2() {
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("*/*");
            startActivityForResult(intent, 19);
        } catch (ActivityNotFoundException e) {
            C4878b.m18868g("Failed to import file: " + e.toString());
            C8151a.m33873n(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public void m9433H2(String str) {
        this.f7013p = new C2009f.C2014d(this).mo24100t(C17541R$string.please_wait).mo24103w(ContextCompat.getColor(this, C17528R$color.upgrade_primary)).mo24087g(str).mo24098r(true, 0).mo24084c(false).mo24099s();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m9453f2(Macro macro) {
        Iterator<Trigger> it = macro.getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            next.mo25810V();
            for (Constraint next2 : next.mo27826J0()) {
                next2.mo24687G2(macro);
                next2.mo25810V();
            }
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            next3.mo25810V();
            for (Constraint next4 : next3.mo27826J0()) {
                next4.mo24687G2(macro);
                next4.mo25810V();
            }
        }
        for (Constraint next5 : macro.getConstraints()) {
            next5.mo24687G2(macro);
            next5.mo25810V();
        }
    }

    /* renamed from: g2 */
    private boolean m9454g2(String str, int i) {
        if (ContextCompat.checkSelfPermission(this, str) == 0) {
            return true;
        }
        ActivityCompat.requestPermissions(this, new String[]{str}, i);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public void m9455h2() {
        if (C4934n.m18998M().mo29710z().size() <= 0) {
            C15626c.makeText(getApplicationContext(), C17541R$string.no_macros_to_export, 1).show();
        } else if (m9454g2("android.permission.WRITE_EXTERNAL_STORAGE", 1)) {
            this.f7009A.setVisibility(4);
            if (getPackageManager().queryIntentActivities(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 0).size() > 0) {
                Uri q0 = C5163j2.m20239q0(this);
                if (q0 == null) {
                    m9431F2();
                    return;
                }
                DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, q0);
                if (fromTreeUri.canWrite()) {
                    m9457j2(fromTreeUri);
                } else {
                    m9431F2();
                }
            } else {
                m9458k2(C5163j2.m20231p0(this));
            }
        }
    }

    /* renamed from: i2 */
    private void m9456i2(Dialog dialog, String str, DocumentFile documentFile, String str2) {
        boolean z;
        String str3 = C5163j2.m20231p0(this) + "/" + str2 + ".mdr";
        C5163j2.m20203l4(this, str2);
        if (str != null) {
            z = C4934n.m18998M().mo29706v0(str3, true, true, true);
        } else if (documentFile != null) {
            z = C4934n.m18998M().mo29705u0(documentFile, str2 + ".mdr", true, true);
        } else {
            z = false;
        }
        dialog.dismiss();
        if (z) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.exported) + " " + str3, 1).show();
            finish();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_ExportImport);
        builder.setTitle((int) C17541R$string.export_failed);
        builder.setMessage((CharSequence) getString(C17541R$string.failed_to_export_to) + " " + str3).setCancelable(false).setNegativeButton(17039370, (DialogInterface.OnClickListener) new C4832l(this));
        builder.create().show();
    }

    /* renamed from: j2 */
    private void m9457j2(DocumentFile documentFile) {
        m9459l2((String) null, documentFile);
    }

    /* renamed from: k2 */
    private void m9458k2(String str) {
        m9459l2(str, (DocumentFile) null);
    }

    /* renamed from: l2 */
    private void m9459l2(String str, DocumentFile documentFile) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_ExportImport);
        appCompatDialog.setContentView((int) C17535R$layout.export_dialog);
        appCompatDialog.setTitle((int) C17541R$string.export_macro_list);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        boolean z = false;
        appCompatDialog.setCanceledOnTouchOutside(false);
        appCompatDialog.setCancelable(false);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.exportdialog_filename);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.export_dialog_export_path);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.export_dialog_folder_chooser);
        ((Button) appCompatDialog.findViewById(C17532R$id.export_dialog_filename_magic_text_chooser)).setVisibility(8);
        if (str != null) {
            textView.setText(str);
        } else if (documentFile != null) {
            DocumentFile G = C4061t1.m15956G(documentFile);
            StringBuilder sb = new StringBuilder();
            sb.append(G != null ? G.getName() : "");
            sb.append("/");
            sb.append(documentFile.getName());
            textView.setText(sb.toString());
        }
        button3.setOnClickListener(new C6464v(this, editText, appCompatDialog));
        editText.setText(C5163j2.m20279v0(this));
        if (editText.getText().length() > 0) {
            z = true;
        }
        button.setEnabled(z);
        editText.setSelection(editText.getText().length());
        editText.addTextChangedListener(new C2292c(button, editText));
        button.setOnClickListener(new C4912m(this, documentFile, editText, appCompatDialog, str));
        button2.setOnClickListener(new C6627w(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: m2 */
    private void m9460m2(String str, boolean z, @Nullable Uri uri) {
        boolean contains = str.contains("exportFormat");
        if (!contains || C4934n.m18998M().mo29710z().size() <= 0) {
            if (uri != null) {
                try {
                    Macro macro = (Macro) C10283c.m40413c().mo64006e(Macro.class, new C4921g(getApplicationContext(), true, true, true)).mo64004c().mo63976j(str, Macro.class);
                    if (macro != null && !TextUtils.isEmpty(macro.getName())) {
                        Intent intent = new Intent(this, EditMacroActivity.class);
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(uri);
                        startActivity(intent);
                        finish();
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            m9430E2(str, z, contains, false);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_ExportImport);
        builder.setTitle((int) C17541R$string.existing_macros_configured);
        builder.setMessage((int) C17541R$string.importing_macros_will_release);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4964o(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5069r(this, str, z, contains));
        builder.setOnCancelListener(new C2293d());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m9461n2() {
        String format = new SimpleDateFormat("yy_MM_dd_HH_mm").format(new Date());
        File file = new File(getExternalFilesDir((String) null), "MacroDroid_" + format + ".mdr");
        C4934n.m18998M().mo29706v0(file.getAbsolutePath(), true, true, true);
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            C6362a0.m24598d(this, intent, file);
            startActivityForResult(Intent.createChooser(intent, getString(C17541R$string.menu_share)), 41);
        } catch (ActivityNotFoundException unused) {
            C15626c.makeText(getApplicationContext(), C17541R$string.no_app_found_to_share, 0).show();
        } catch (Exception e) {
            C15626c.makeText(getApplicationContext(), C17541R$string.export_failed, 0).show();
            C4878b.m18868g("Failed to export file: " + e.toString());
        }
    }

    /* renamed from: o2 */
    private boolean m9462o2() {
        for (Category isLocked : this.f7011C.getCategories()) {
            if (isLocked.isLocked()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p2 */
    private void m9463p2() {
        C2009f fVar = this.f7013p;
        if (fVar != null && fVar.isShowing()) {
            this.f7013p.hide();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:2|3)(2:10|11)|12|13|14|15|(2:16|(1:18)(1:45))|19|20|21|22|23|47) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9464q2() {
        /*
            r7 = this;
            android.view.ViewGroup r0 = r7.f7009A
            r1 = 4
            r0.setVisibility(r1)
            android.content.Intent r0 = r7.getIntent()
            android.net.Uri r0 = r0.getData()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r3 = 2131952970(0x7f13054a, float:1.9542398E38)
            r4 = 0
            if (r1 == 0) goto L_0x0056
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x0028 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x0028 }
            goto L_0x005f
        L_0x0028:
            r0 = move-exception
            android.content.Context r1 = r7.getApplicationContext()
            android.widget.Toast r1 = p319lc.C15626c.makeText(r1, r3, r2)
            r1.show()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to import macro list from input stream: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            p148q0.C8151a.m33873n(r1)
            r7.finish()
            throw r4     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return
        L_0x0056:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x00c3 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x00c3 }
        L_0x005f:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x008a }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x008a }
            r6.<init>(r1)     // Catch:{ all -> 0x008a }
            r5.<init>(r6)     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r4.<init>()     // Catch:{ all -> 0x0087 }
        L_0x006e:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0087 }
            if (r6 == 0) goto L_0x0078
            r4.append(r6)     // Catch:{ all -> 0x0087 }
            goto L_0x006e
        L_0x0078:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0087 }
            r6 = 0
            r7.m9460m2(r4, r6, r0)     // Catch:{ all -> 0x0087 }
            r5.close()     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            r1.close()     // Catch:{ Exception -> 0x00ba }
            goto L_0x00ba
        L_0x0087:
            r0 = move-exception
            r4 = r5
            goto L_0x008b
        L_0x008a:
            r0 = move-exception
        L_0x008b:
            android.content.Context r5 = r7.getApplicationContext()     // Catch:{ all -> 0x00bb }
            android.widget.Toast r2 = p319lc.C15626c.makeText(r5, r3, r2)     // Catch:{ all -> 0x00bb }
            r2.show()     // Catch:{ all -> 0x00bb }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r3.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "Failed to import macro: "
            r3.append(r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00bb }
            r3.append(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00bb }
            r2.<init>(r0)     // Catch:{ all -> 0x00bb }
            p148q0.C8151a.m33873n(r2)     // Catch:{ all -> 0x00bb }
            r7.finish()     // Catch:{ all -> 0x00bb }
            r4.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0083
        L_0x00ba:
            return
        L_0x00bb:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            r1.close()     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            throw r0
        L_0x00c3:
            r0 = move-exception
            android.content.Context r1 = r7.getApplicationContext()
            android.widget.Toast r1 = p319lc.C15626c.makeText(r1, r3, r2)
            r1.show()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to import macro list from file: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            p148q0.C8151a.m33873n(r1)
            r7.finish()
            throw r4     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.ExportImportActivity.m9464q2():void");
    }

    /* renamed from: r2 */
    private void m9465r2() {
        new C11102b((FragmentActivity) this).mo62231o("android.permission.READ_EXTERNAL_STORAGE").mo79679I(C16971a.m100210a()).mo79685P(new C4962n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void m9466s2(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m9467t2(EditText editText, AppCompatDialog appCompatDialog, View view) {
        C5163j2.m20203l4(this, editText.getText().toString());
        m9431F2();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m9468u2(AppCompatDialog appCompatDialog, String str, DocumentFile documentFile, EditText editText, DialogInterface dialogInterface, int i) {
        m9456i2(appCompatDialog, str, documentFile, editText.getText().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void m9469v2(DocumentFile documentFile, EditText editText, AppCompatDialog appCompatDialog, String str, View view) {
        boolean z;
        if (documentFile != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(editText.getText().toString());
            sb.append(".mdr");
            z = documentFile.findFile(sb.toString()) != null;
        } else {
            z = new File(C5163j2.m20231p0(this) + "/" + editText.getText().toString() + ".mdr").exists();
        }
        if (z) {
            new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_ExportImport).setTitle((int) C17541R$string.file_already_exists).setMessage((int) C17541R$string.overwrite_file_confirm).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5064q(this, appCompatDialog, str, documentFile, editText)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
        } else {
            m9456i2(appCompatDialog, str, documentFile, editText.getText().toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void m9470w2(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m9471x2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void m9472y2(String str, boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m9430E2(str, z, z2, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void m9473z2(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m9464q2();
        }
    }

    /* renamed from: k0 */
    public void mo24615k0() {
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r4.m9463p2()
            r0 = -1
            r1 = 0
            r2 = 41
            if (r5 != r2) goto L_0x003b
            if (r6 != r0) goto L_0x0025
            android.content.Context r5 = r4.getApplicationContext()
            r6 = 2131954146(0x7f1309e2, float:1.9544783E38)
            java.lang.String r6 = r4.getString(r6)
            lc.c r5 = p319lc.C15626c.m94876a(r5, r6, r1)
            r5.show()
            r4.finish()
            goto L_0x0141
        L_0x0025:
            if (r6 == 0) goto L_0x0141
            android.content.Context r5 = r4.getApplicationContext()
            r6 = 2131953212(0x7f13063c, float:1.9542889E38)
            java.lang.String r6 = r4.getString(r6)
            lc.c r5 = p319lc.C15626c.m94876a(r5, r6, r1)
            r5.show()
            goto L_0x0141
        L_0x003b:
            r2 = 2
            r3 = 1
            if (r5 != r2) goto L_0x0058
            if (r6 != r0) goto L_0x0048
            java.lang.String r5 = r4.f7014s
            r4.m9430E2(r5, r1, r3, r1)
            goto L_0x0141
        L_0x0048:
            android.content.Context r5 = r4.getApplicationContext()
            r6 = 2131953922(0x7f130902, float:1.9544329E38)
            android.widget.Toast r5 = p319lc.C15626c.makeText(r5, r6, r3)
            r5.show()
            goto L_0x0141
        L_0x0058:
            if (r6 != r0) goto L_0x013e
            r6 = 20
            if (r5 != r6) goto L_0x0081
            android.net.Uri r5 = r7.getData()
            android.content.ContentResolver r6 = r4.getContentResolver()
            r7 = 3
            r6.takePersistableUriPermission(r5, r7)
            androidx.documentfile.provider.DocumentFile r6 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r4, r5)
            java.lang.String r7 = r5.toString()
            java.lang.String r7 = android.net.Uri.decode(r7)
            com.arlosoft.macrodroid.settings.C5163j2.m20147e4(r4, r7)
            com.arlosoft.macrodroid.settings.C5163j2.m20155f4(r4, r5)
            r4.m9457j2(r6)
            goto L_0x0141
        L_0x0081:
            r6 = 19
            if (r5 != r6) goto L_0x0141
            android.net.Uri r5 = r7.getData()
            java.lang.String r6 = com.arlosoft.macrodroid.utils.C6420q1.m24719a(r4, r5)
            java.lang.String r7 = ".ablock"
            boolean r0 = r6.endsWith(r7)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r0 != 0) goto L_0x012a
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto L_0x009f
            goto L_0x012a
        L_0x009f:
            java.lang.String r7 = ".macro"
            boolean r0 = r6.endsWith(r7)
            if (r0 != 0) goto L_0x0116
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x00ae
            goto L_0x0116
        L_0x00ae:
            r6 = 0
            android.content.ContentResolver r7 = r4.getContentResolver()     // Catch:{ all -> 0x00de }
            java.io.InputStream r5 = r7.openInputStream(r5)     // Catch:{ all -> 0x00de }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x00de }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00de }
            r0.<init>(r5)     // Catch:{ all -> 0x00de }
            r7.<init>(r0)     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
            r5.<init>()     // Catch:{ all -> 0x00db }
        L_0x00c6:
            java.lang.String r0 = r7.readLine()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00d0
            r5.append(r0)     // Catch:{ all -> 0x00db }
            goto L_0x00c6
        L_0x00d0:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00db }
            r4.m9460m2(r5, r1, r6)     // Catch:{ all -> 0x00db }
            r7.close()     // Catch:{ Exception -> 0x0141 }
            goto L_0x0141
        L_0x00db:
            r5 = move-exception
            r6 = r7
            goto L_0x00df
        L_0x00de:
            r5 = move-exception
        L_0x00df:
            android.content.Context r7 = r4.getApplicationContext()     // Catch:{ all -> 0x0111 }
            r0 = 2131952970(0x7f13054a, float:1.9542398E38)
            android.widget.Toast r7 = p319lc.C15626c.makeText(r7, r0, r3)     // Catch:{ all -> 0x0111 }
            r7.show()     // Catch:{ all -> 0x0111 }
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0111 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0111 }
            r0.<init>()     // Catch:{ all -> 0x0111 }
            java.lang.String r1 = "Failed to import macro: "
            r0.append(r1)     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0111 }
            r0.append(r5)     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0111 }
            r7.<init>(r5)     // Catch:{ all -> 0x0111 }
            p148q0.C8151a.m33873n(r7)     // Catch:{ all -> 0x0111 }
            r4.finish()     // Catch:{ all -> 0x0111 }
            r6.close()     // Catch:{ Exception -> 0x0141 }
            goto L_0x0141
        L_0x0111:
            r5 = move-exception
            r6.close()     // Catch:{ Exception -> 0x0115 }
        L_0x0115:
            throw r5
        L_0x0116:
            r4.finish()
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.arlosoft.macrodroid.editscreen.EditMacroActivity> r7 = com.arlosoft.macrodroid.editscreen.EditMacroActivity.class
            r6.<init>(r4, r7)
            r6.setAction(r2)
            r6.setData(r5)
            r4.startActivity(r6)
            goto L_0x0141
        L_0x012a:
            r4.finish()
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity> r7 = com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.class
            r6.<init>(r4, r7)
            r6.setAction(r2)
            r6.setData(r5)
            r4.startActivity(r6)
            goto L_0x0141
        L_0x013e:
            r4.finish()
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.ExportImportActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.exportimport_view);
        setSupportActionBar((Toolbar) findViewById(2131364057));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(C17541R$string.export_import_macros);
        C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
        this.f7010B = new C6409o(q, this);
        CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        this.f7011C = categoryList;
        if (categoryList == null || categoryList.getCategories() == null) {
            this.f7011C = new CategoryList(new ArrayList());
        }
        this.f7015z = (CheckBox) findViewById(C17532R$id.exportimport_reset_variables);
        this.f7009A = (ViewGroup) findViewById(C17532R$id.root_layout);
        if (getIntent() == null || getIntent().getAction() == null || !getIntent().getAction().equals("android.intent.action.VIEW") || getIntent().getData() == null) {
            ((FloatingActionButton) findViewById(C17532R$id.exportimport_export_button)).setOnClickListener(new C5077s(this));
            ((FloatingActionButton) findViewById(C17532R$id.exportimport_export_share_button)).setOnClickListener(new C6287u(this));
            ((FloatingActionButton) findViewById(C17532R$id.exportimport_import_button)).setOnClickListener(new C5221t(this));
            return;
        }
        new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog).setTitle((int) C17541R$string.importing_macros).setMessage((int) C17541R$string.confirm_import).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4966p(this)).show();
    }

    public void onDestroy() {
        super.onDestroy();
        m9463p2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 0) {
            if (i != 1) {
                super.onRequestPermissionsResult(i, strArr, iArr);
            } else if (iArr.length > 0 && iArr[0] == 0) {
                if (getPackageManager().queryIntentActivities(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 0).size() > 0) {
                    Uri q0 = C5163j2.m20239q0(this);
                    if (q0 == null) {
                        m9431F2();
                    } else {
                        m9457j2(DocumentFile.fromTreeUri(this, q0));
                    }
                } else {
                    m9458k2(C5163j2.m20231p0(this));
                }
            } else if (strArr.length != 0 && !ActivityCompat.shouldShowRequestPermissionRationale(this, strArr[0])) {
                Context applicationContext = getApplicationContext();
                C15626c.m94876a(applicationContext, getString(C17541R$string.enable_permission_after_dont_ask_again) + " " + getString(C17541R$string.permission_storage), 1).show();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
                startActivityForResult(intent, 0);
            }
        } else if (iArr.length > 0 && iArr[0] == 0) {
            m9432G2();
        } else if (strArr.length != 0 && !ActivityCompat.shouldShowRequestPermissionRationale(this, strArr[0])) {
            Context applicationContext2 = getApplicationContext();
            C15626c.m94876a(applicationContext2, getString(C17541R$string.enable_permission_after_dont_ask_again) + " " + getString(C17541R$string.permission_storage), 1).show();
            try {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", getPackageName(), (String) null));
                startActivityForResult(intent2, 0);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
