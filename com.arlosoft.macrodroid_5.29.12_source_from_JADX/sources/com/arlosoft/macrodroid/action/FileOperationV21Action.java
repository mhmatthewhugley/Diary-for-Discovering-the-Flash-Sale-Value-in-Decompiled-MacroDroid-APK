package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.FileOperationV21Service;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6459y0;
import p057a2.C2213b;
import p057a2.C2224m;
import p128m0.C7694a1;
import p319lc.C15626c;

public class FileOperationV21Action extends Action implements C2224m, C2213b {
    public static final Parcelable.Creator<FileOperationV21Action> CREATOR = new C2439c();
    private static final int FILE_OPTION_ALL_FILES = 0;
    private static final int FILE_OPTION_AUDIO = 3;
    private static final int FILE_OPTION_FOLDER = 6;
    private static final int FILE_OPTION_IMAGES = 2;
    private static final int FILE_OPTION_MEDIA_FILES = 1;
    private static final int FILE_OPTION_SPECIFY_FILE_PATTERN = 5;
    private static final int FILE_OPTION_VIDEOS = 4;
    private static final int FROM_PICKER_ID = 9876;
    private static final int TO_PICKER_ID = 9877;
    private transient boolean m_displayPatternDialog;
    private String[] m_fileExtensions;
    private int m_fileOption;
    private String m_filePattern;
    private String m_folderName;
    private String m_fromName;
    private String m_fromUriString;
    private int m_option;
    private String m_toName;
    private String m_toUriString;
    private transient boolean needsFileReconfiguration;

    /* renamed from: com.arlosoft.macrodroid.action.FileOperationV21Action$a */
    class C2437a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7247a;

        /* renamed from: c */
        final /* synthetic */ EditText f7248c;

        C2437a(Button button, EditText editText) {
            this.f7247a = button;
            this.f7248c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7247a.setEnabled(this.f7248c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FileOperationV21Action$b */
    class C2438b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7250a;

        /* renamed from: c */
        final /* synthetic */ EditText f7251c;

        C2438b(Button button, EditText editText) {
            this.f7250a = button;
            this.f7251c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7250a.setEnabled(this.f7251c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FileOperationV21Action$c */
    class C2439c implements Parcelable.Creator<FileOperationV21Action> {
        C2439c() {
        }

        /* renamed from: a */
        public FileOperationV21Action createFromParcel(Parcel parcel) {
            return new FileOperationV21Action(parcel, (C2437a) null);
        }

        /* renamed from: b */
        public FileOperationV21Action[] newArray(int i) {
            return new FileOperationV21Action[i];
        }
    }

    /* synthetic */ FileOperationV21Action(Parcel parcel, C2437a aVar) {
        this(parcel);
    }

    /* renamed from: B3 */
    public static final String[] m10675B3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_file_operation_copy), SelectableItem.m15535j1(C17541R$string.action_file_operation_move), SelectableItem.m15535j1(C17541R$string.action_file_operation_delete), SelectableItem.m15535j1(C17541R$string.action_file_operation_create_folder)};
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m10676D3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        this.needsFileReconfiguration = false;
        appCompatDialog.cancel();
        this.m_folderName = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m10678F3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m10679G3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m10680H3(DialogInterface dialogInterface, int i) {
        this.m_fileOption = i;
        m10698v3(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m10681I3(DialogInterface dialogInterface, int i) {
        if (this.m_displayPatternDialog) {
            m10701y3();
        } else if (this.m_option != 2) {
            m10697u3();
        } else {
            this.m_toUriString = null;
            this.needsFileReconfiguration = false;
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m10682J3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.cancel();
        this.m_filePattern = editText.getText().toString();
        if (this.m_option == 2) {
            this.needsFileReconfiguration = false;
            mo24689O1();
            return;
        }
        m10697u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static /* synthetic */ void m10684L3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m10685M3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: t3 */
    private void m10696t3() {
        try {
            mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), FROM_PICKER_ID);
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.action_file_operation_from_directory) + "   ", 1).show();
        } catch (Exception unused) {
            Context applicationContext2 = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext2, "ACTION_OPEN_DOCUMENT_TREE " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    /* renamed from: u3 */
    private void m10697u3() {
        mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), TO_PICKER_ID);
        Context applicationContext = mo27827K0().getApplicationContext();
        C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.action_file_operation_to_directory) + "   ", 1).show();
    }

    /* renamed from: v3 */
    private void m10698v3(int i) {
        switch (i) {
            case 0:
                this.m_filePattern = ProxyConfig.MATCH_ALL_SCHEMES;
                this.m_fileExtensions = new String[0];
                this.m_displayPatternDialog = false;
                return;
            case 1:
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                String[] strArr = C4061t1.f10628h;
                int length = strArr.length;
                String[] strArr2 = C4061t1.f10629i;
                int length2 = length + strArr2.length;
                String[] strArr3 = C4061t1.f10630j;
                String[] strArr4 = new String[(length2 + strArr3.length)];
                System.arraycopy(strArr2, 0, strArr4, 0, strArr2.length);
                System.arraycopy(strArr, 0, strArr4, strArr2.length, strArr.length);
                System.arraycopy(strArr3, 0, strArr4, strArr2.length + strArr.length, strArr3.length);
                this.m_fileExtensions = strArr4;
                return;
            case 2:
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                this.m_fileExtensions = C4061t1.f10629i;
                return;
            case 3:
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                this.m_fileExtensions = C4061t1.f10628h;
                return;
            case 4:
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                this.m_fileExtensions = C4061t1.f10630j;
                return;
            case 5:
                this.m_displayPatternDialog = true;
                this.m_fileExtensions = new String[0];
                return;
            case 6:
                this.m_fromName += "/";
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                this.m_fileExtensions = new String[0];
                return;
            default:
                return;
        }
    }

    /* renamed from: w3 */
    private void m10699w3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_folder_name);
        appCompatDialog.setTitle((int) C17541R$string.action_file_operation_create_folder);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.folder_name);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magic_text_button);
        String str = this.m_folderName;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.getText().length());
        }
        editText.addTextChangedListener(new C2437a(button, editText));
        button.setOnClickListener(new C3218l5(this, appCompatDialog, editText));
        button.setEnabled(editText.getText().length() > 0);
        button2.setOnClickListener(new C3106h5(appCompatDialog));
        button3.setOnClickListener(new C3134i5(this, j0, new C3246m5(editText)));
        appCompatDialog.show();
    }

    /* renamed from: x3 */
    private void m10700x3() {
        m10698v3(this.m_fileOption);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_file_operation_select_file));
        builder.setSingleChoiceItems((CharSequence[]) m10702z3(), this.m_fileOption, (DialogInterface.OnClickListener) new C3050f5(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3021e5(this));
        builder.create().show();
    }

    /* renamed from: y3 */
    private void m10701y3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.file_pattern_dialog);
        appCompatDialog.setTitle((int) C17541R$string.file_pattern);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.file_pattern_dialog_file_pattern);
        editText.setText(this.m_filePattern);
        editText.setSelection(editText.length());
        editText.addTextChangedListener(new C2438b(button, editText));
        button.setOnClickListener(new C3190k5(this, appCompatDialog, editText));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3078g5(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.magic_text_button)).setOnClickListener(new C3162j5(this, j0, new C3274n5(editText)));
        appCompatDialog.show();
    }

    /* renamed from: z3 */
    private String[] m10702z3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_all_files), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_media_files), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_images), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_audio), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_videos), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_specify), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_folder)};
    }

    /* renamed from: A3 */
    public String mo25047A3() {
        return this.m_fromUriString;
    }

    /* renamed from: C3 */
    public String mo25048C3() {
        return this.m_toUriString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: E */
    public boolean mo24422E() {
        return this.needsFileReconfiguration;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        String[] strArr = new String[2];
        String str = this.m_folderName;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        strArr[0] = str;
        String str3 = this.m_filePattern;
        if (str3 != null) {
            str2 = str3;
        }
        strArr[1] = str2;
        return strArr;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_fileOption == 5) {
            return m10675B3()[this.m_option] + " " + this.m_filePattern;
        }
        return m10675B3()[this.m_option] + " " + m10702z3()[this.m_fileOption];
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        this.m_folderName = strArr[0];
        this.m_filePattern = strArr[1];
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

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_fromName;
        if (this.m_toName == null) {
            return str;
        }
        return str + " " + mo27827K0().getString(C17541R$string.action_file_operation_to) + ": " + this.m_toName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7694a1.m32081u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), Uri.parse(this.m_fromUriString));
        if (SystemClock.elapsedRealtime() / 1000 <= 90) {
            return;
        }
        if (!fromTreeUri.canRead()) {
            this.needsFileReconfiguration = true;
            C4878b.m18868g("Cannot access from path: " + this.m_fromName);
            C6459y0.m24788b(mo27827K0(), mo24798Z0());
            return;
        }
        String str = this.m_toUriString;
        if (str != null) {
            if (!DocumentFile.fromTreeUri(mo27827K0(), Uri.parse(str)).canWrite()) {
                this.needsFileReconfiguration = true;
                C4878b.m18868g("Cannot access to path: " + this.m_toName);
                C6459y0.m24788b(mo27827K0(), mo24798Z0());
            }
        }
    }

    /* renamed from: W */
    public boolean mo25030W() {
        return true;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String str = null;
        String t0 = this.m_folderName != null ? C4023j0.m15760t0(mo27827K0(), this.m_folderName, triggerContextInfo, mo27837X0()) : null;
        Intent intent = new Intent(mo27827K0(), FileOperationV21Service.class);
        if (this.m_filePattern != null) {
            str = C4023j0.m15760t0(mo27827K0(), this.m_filePattern, triggerContextInfo, mo27837X0());
        }
        intent.putExtra("FromUri", this.m_fromUriString);
        intent.putExtra("ToUri", this.m_toUriString);
        intent.putExtra("FilePattern", str);
        intent.putExtra("FileExtensions", this.m_fileExtensions);
        intent.putExtra("option", this.m_option);
        intent.putExtra("fromPath", this.m_fromName);
        intent.putExtra("folderName", t0);
        intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", mo24798Z0());
        mo27827K0().startService(intent);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10675B3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_file_operation_v2);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 != -1) {
            return;
        }
        if (i == FROM_PICKER_ID) {
            Uri data = intent.getData();
            mo27827K0().getContentResolver().takePersistableUriPermission(data, 3);
            this.m_fromUriString = data.toString();
            this.m_fromName = DocumentFile.fromTreeUri(mo27827K0(), data).getName();
            if (this.m_option == 3) {
                m10699w3();
            } else {
                m10700x3();
            }
        } else if (i == TO_PICKER_ID) {
            Uri data2 = intent.getData();
            mo27827K0().getContentResolver().takePersistableUriPermission(data2, 3);
            this.m_toUriString = data2.toString();
            this.m_toName = DocumentFile.fromTreeUri(mo27827K0(), data2).getName();
            DocumentFile.fromTreeUri(mo27827K0(), data2);
            this.needsFileReconfiguration = false;
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m10696t3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_fileOption);
        parcel.writeString(this.m_fromName);
        parcel.writeString(this.m_toName);
        parcel.writeString(this.m_filePattern);
        parcel.writeString(this.m_fromUriString);
        parcel.writeString(this.m_toUriString);
        parcel.writeString(this.m_folderName);
        String[] strArr = this.m_fileExtensions;
        parcel.writeInt(strArr != null ? strArr.length : 0);
        String[] strArr2 = this.m_fileExtensions;
        if (strArr2 != null && strArr2.length > 0) {
            parcel.writeStringArray(strArr2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public FileOperationV21Action(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private FileOperationV21Action() {
        this.m_displayPatternDialog = false;
        this.m_filePattern = null;
        this.m_fileExtensions = new String[0];
    }

    private FileOperationV21Action(Parcel parcel) {
        super(parcel);
        this.m_displayPatternDialog = false;
        this.m_option = parcel.readInt();
        this.m_fileOption = parcel.readInt();
        this.m_fromName = parcel.readString();
        this.m_toName = parcel.readString();
        this.m_filePattern = parcel.readString();
        this.m_fromUriString = parcel.readString();
        this.m_toUriString = parcel.readString();
        this.m_folderName = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            String[] strArr = new String[readInt];
            this.m_fileExtensions = strArr;
            parcel.readStringArray(strArr);
            return;
        }
        this.m_fileExtensions = new String[0];
    }
}
