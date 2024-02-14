package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.FileOperationV21Service;
import com.arlosoft.macrodroid.common.AndroidExplorer;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6459y0;
import p057a2.C2213b;
import p057a2.C2224m;
import p128m0.C7881y0;
import p135n1.C7967d;
import p148q0.C8151a;
import p319lc.C15626c;

public class ExportMacrosAction extends Action implements C2224m, C2213b {
    public static final Parcelable.Creator<ExportMacrosAction> CREATOR = new C2434d();
    private static final int FILE_EXPORT_PICKER_ID = 10;
    private static final int FILE_EXPORT_PICKER_ID_V21 = 20;
    private String m_displayPath;
    private String m_fileName;
    private String m_filePath;
    private String m_pathUri;
    private transient String m_workingPathUri;
    private boolean needsFileReconfiguration;
    private transient String temporaryPathName;

    /* renamed from: com.arlosoft.macrodroid.action.ExportMacrosAction$a */
    class C2431a extends Thread {

        /* renamed from: a */
        final /* synthetic */ DocumentFile f7233a;

        /* renamed from: c */
        final /* synthetic */ String f7234c;

        C2431a(DocumentFile documentFile, String str) {
            this.f7233a = documentFile;
            this.f7234c = str;
        }

        public void run() {
            C4934n M = C4934n.m18998M();
            DocumentFile documentFile = this.f7233a;
            M.mo29705u0(documentFile, this.f7234c + ".mdr", true, true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportMacrosAction$b */
    class C2432b extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f7236a;

        C2432b(String str) {
            this.f7236a = str;
        }

        public void run() {
            boolean v0 = C4934n.m18998M().mo29706v0(this.f7236a, true, true, true);
            if (!v0) {
                C4878b.m18869h("Failed to export macros: " + v0, ExportMacrosAction.this.mo27840Y0().longValue());
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportMacrosAction$c */
    class C2433c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7238a;

        /* renamed from: c */
        final /* synthetic */ EditText f7239c;

        C2433c(Button button, EditText editText) {
            this.f7238a = button;
            this.f7239c = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f7238a.setEnabled(this.f7239c.getText().length() > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExportMacrosAction$d */
    class C2434d implements Parcelable.Creator<ExportMacrosAction> {
        C2434d() {
        }

        /* renamed from: a */
        public ExportMacrosAction createFromParcel(Parcel parcel) {
            return new ExportMacrosAction(parcel, (C2431a) null);
        }

        /* renamed from: b */
        public ExportMacrosAction[] newArray(int i) {
            return new ExportMacrosAction[i];
        }
    }

    /* synthetic */ ExportMacrosAction(Parcel parcel, C2431a aVar) {
        this(parcel);
    }

    /* renamed from: o3 */
    private void m10622o3(String str) {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.export_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_export_macro);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.exportdialog_filename);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.export_dialog_export_path);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.export_dialog_folder_chooser);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.export_dialog_filename_magic_text_chooser);
        textView.setText(str);
        String str2 = this.m_fileName;
        if (str2 != null) {
            editText.setText(str2);
            editText.setSelection(editText.length());
        }
        button3.setOnClickListener(new C3561w4(this, appCompatDialog));
        button.setEnabled(editText.getText().length() > 0);
        editText.setSelection(editText.getText().length());
        editText.addTextChangedListener(new C2433c(button, editText));
        button.setOnClickListener(new C3533v4(this, editText, textView, appCompatDialog));
        button2.setOnClickListener(new C3470t4(appCompatDialog));
        button4.setOnClickListener(new C3506u4(this, j0, new C3588x4(editText)));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m10623p3(AppCompatDialog appCompatDialog, View view) {
        if (Build.VERSION.SDK_INT > 21) {
            m10629v3();
        } else {
            m10628u3();
        }
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m10624q3(EditText editText, TextView textView, AppCompatDialog appCompatDialog, View view) {
        String str = this.m_workingPathUri;
        if (str == null) {
            str = this.m_pathUri;
        }
        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), Uri.parse(str));
        if (!fromTreeUri.canRead() || !fromTreeUri.canWrite()) {
            C15626c.makeText(mo27827K0(), C17541R$string.please_reconigiure_file_path_to_accessible_location, 1).show();
            return;
        }
        this.needsFileReconfiguration = false;
        this.m_fileName = editText.getText().toString();
        this.m_filePath = textView.getText().toString();
        this.m_displayPath = textView.getText().toString();
        String str2 = this.m_workingPathUri;
        if (str2 != null) {
            this.m_pathUri = str2;
        }
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static /* synthetic */ void m10626s3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m10627t3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
    }

    /* renamed from: u3 */
    private void m10628u3() {
        Activity j0 = mo27850j0();
        String p0 = C5163j2.m20231p0(j0);
        Intent intent = new Intent(j0, AndroidExplorer.class);
        intent.putExtra("Title", SelectableItem.m15535j1(C17541R$string.select_export_directory));
        intent.putExtra("Folder", false);
        intent.putExtra("FileExtensionFilter", "mdr");
        intent.putExtra("Path", p0);
        intent.putExtra("Folder", true);
        j0.startActivityForResult(intent, 10);
    }

    /* renamed from: v3 */
    private void m10629v3() {
        try {
            mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 20);
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.select_export_directory, 1).show();
        } catch (ActivityNotFoundException unused) {
            m10628u3();
        }
    }

    /* renamed from: E */
    public boolean mo24422E() {
        return this.needsFileReconfiguration;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_fileName};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_fileName = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return !this.needsFileReconfiguration;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.please_reconigiure_file_path_to_accessible_location);
        }
        return null;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7881y0.m32973u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        String str = this.m_pathUri;
        if (str != null) {
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), Uri.parse(str));
            if (SystemClock.elapsedRealtime() / 1000 > 90 && !fromTreeUri.canWrite()) {
                this.needsFileReconfiguration = true;
                C4878b.m18868g("Cannot access export path: " + this.m_displayPath);
                C6459y0.m24788b(mo27827K0(), mo27837X0().getName());
            }
        }
    }

    /* renamed from: W */
    public boolean mo25030W() {
        return true;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_fileName, triggerContextInfo, mo27837X0());
        String str = this.m_pathUri;
        if (str != null) {
            Uri parse = Uri.parse(str);
            DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), parse);
            C4878b.m18879r("Attempting to export: " + parse);
            if ((!fromTreeUri.canRead() || !fromTreeUri.canWrite()) && ((fromTreeUri = FileOperationV21Service.m14334c(mo27827K0(), parse)) == null || !fromTreeUri.canWrite())) {
                C4878b.m18869h("Cannot access export directory, exportDir = " + fromTreeUri, mo27840Y0().longValue());
                this.needsFileReconfiguration = true;
                C4934n.m18998M().mo29695o0(mo27837X0());
                C6459y0.m24788b(mo27827K0(), mo27837X0().getName());
                return;
            }
            new C2431a(fromTreeUri, t0).start();
            return;
        }
        new C2432b(this.m_filePath + "/" + t0 + ".mdr").start();
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i2 == -1) {
            mo27877y2(activity);
            if (i == 10) {
                m10622o3(intent.getExtras().getString("FileSelection"));
            } else if (i == 20) {
                Uri data = intent.getData();
                mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
                this.m_workingPathUri = data.toString();
                DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), data);
                DocumentFile G = C4061t1.m15956G(fromTreeUri);
                StringBuilder sb = new StringBuilder();
                sb.append(G != null ? G.getName() : "");
                sb.append("/");
                sb.append(fromTreeUri.getName());
                String sb2 = sb.toString();
                this.temporaryPathName = sb2;
                m10622o3(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27827K0().getPackageManager().queryIntentActivities(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 0).size() > 0) {
            String str = this.m_pathUri;
            if (str == null) {
                m10629v3();
                return;
            }
            String str2 = this.m_displayPath;
            if (str2 != null) {
                m10622o3(Uri.decode(str2));
            } else {
                m10622o3(Uri.decode(str));
            }
        } else {
            Activity j0 = mo27850j0();
            String str3 = this.m_filePath;
            if (str3 == null) {
                str3 = C5163j2.m20231p0(j0);
            }
            m10622o3(str3);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_filePath);
        parcel.writeString(this.m_fileName);
        parcel.writeString(this.m_pathUri);
        parcel.writeString(this.m_displayPath);
        parcel.writeInt(this.needsFileReconfiguration ? 1 : 0);
    }

    public ExportMacrosAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ExportMacrosAction() {
    }

    private ExportMacrosAction(Parcel parcel) {
        super(parcel);
        this.m_filePath = parcel.readString();
        this.m_fileName = parcel.readString();
        this.m_pathUri = parcel.readString();
        this.m_displayPath = parcel.readString();
        this.needsFileReconfiguration = parcel.readInt() != 0;
    }
}
