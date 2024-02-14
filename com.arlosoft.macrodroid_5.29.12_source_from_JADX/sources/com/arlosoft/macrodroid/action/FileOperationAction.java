package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.FileOperationService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.AndroidExplorer;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7888z0;

public class FileOperationAction extends Action {
    public static final Parcelable.Creator<FileOperationAction> CREATOR = new C2436b();
    private static final int FROM_PICKER_ID = 9876;
    private static final int TO_PICKER_ID = 9877;

    /* renamed from: d */
    public static final String f7241d;

    /* renamed from: f */
    public static final String f7242f;

    /* renamed from: g */
    public static final String f7243g;
    private static final String[] s_options;
    private static final String[] s_optionsFixed = {"Copy", "Move", "Delete"};
    private transient boolean m_displayPatternDialog;
    private String[] m_fileExtensions;
    private String m_fileOption;
    private String m_filePattern;
    private String m_fromPath;
    private String m_option;
    private String m_optionFixed;
    private String m_toPath;

    /* renamed from: com.arlosoft.macrodroid.action.FileOperationAction$a */
    class C2435a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7244a;

        /* renamed from: c */
        final /* synthetic */ EditText f7245c;

        C2435a(Button button, EditText editText) {
            this.f7244a = button;
            this.f7245c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7244a.setEnabled(this.f7245c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.FileOperationAction$b */
    class C2436b implements Parcelable.Creator<FileOperationAction> {
        C2436b() {
        }

        /* renamed from: a */
        public FileOperationAction createFromParcel(Parcel parcel) {
            return new FileOperationAction(parcel, (C2435a) null);
        }

        /* renamed from: b */
        public FileOperationAction[] newArray(int i) {
            return new FileOperationAction[i];
        }
    }

    static {
        String string = MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_copy);
        f7241d = string;
        String string2 = MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_move);
        f7242f = string2;
        String string3 = MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_delete);
        f7243g = string3;
        s_options = new String[]{string, string2, string3};
    }

    /* synthetic */ FileOperationAction(Parcel parcel, C2435a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m10644A3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: p3 */
    private void m10651p3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, AndroidExplorer.class);
        intent.putExtra("Title", this.m_option + " " + mo27827K0().getString(C17541R$string.action_file_operation_from_directory));
        intent.putExtra("Folder", true);
        intent.putExtra("Path", this.m_fromPath);
        j0.startActivityForResult(intent, FROM_PICKER_ID);
    }

    /* renamed from: q3 */
    private void m10652q3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, AndroidExplorer.class);
        intent.putExtra("Title", this.m_option + " " + mo27827K0().getString(C17541R$string.action_file_operation_to_directory));
        intent.putExtra("Folder", true);
        intent.putExtra("Path", this.m_toPath);
        j0.startActivityForResult(intent, TO_PICKER_ID);
    }

    /* renamed from: r3 */
    private void m10653r3(int i) {
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
                this.m_fromPath += "/";
                this.m_displayPatternDialog = false;
                this.m_filePattern = null;
                this.m_fileExtensions = new String[0];
                return;
            default:
                return;
        }
    }

    /* renamed from: s3 */
    private void m10654s3() {
        int i = 0;
        for (int i2 = 0; i2 < m10656u3().length; i2++) {
            if (m10656u3()[i2].equals(this.m_fileOption)) {
                i = i2;
            }
        }
        m10653r3(i);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_file_operation_select_file));
        builder.setSingleChoiceItems((CharSequence[]) m10656u3(), i, (DialogInterface.OnClickListener) new C3615y4(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3642z4(this));
        builder.create().show();
    }

    /* renamed from: t3 */
    private void m10655t3() {
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
        editText.addTextChangedListener(new C2435a(button, editText));
        button.setOnClickListener(new C2964c5(this, appCompatDialog, editText));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C2808a5(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.magic_text_button)).setOnClickListener(new C2936b5(this, j0, new C2992d5(editText)));
        appCompatDialog.show();
    }

    /* renamed from: u3 */
    private String[] m10656u3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_all_files), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_media_files), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_images), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_audio), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_videos), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_specify), MacroDroidApplication.m14845u().getString(C17541R$string.action_file_operation_folder)};
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m10657v3(DialogInterface dialogInterface, int i) {
        this.m_fileOption = m10656u3()[i];
        m10653r3(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m10658w3(DialogInterface dialogInterface, int i) {
        if (this.m_displayPatternDialog) {
            m10655t3();
        } else if (!this.m_option.equals(f7243g)) {
            m10652q3();
        } else {
            this.m_toPath = null;
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m10659x3(AppCompatDialog appCompatDialog, EditText editText, View view) {
        appCompatDialog.cancel();
        this.m_filePattern = editText.getText().toString();
        if (!this.m_option.equals(f7243g)) {
            m10652q3();
        } else {
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static /* synthetic */ void m10661z3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = 0;
        while (true) {
            String[] strArr = s_options;
            if (i >= strArr.length) {
                return 0;
            }
            if (this.m_option.equals(strArr[i])) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_fileOption.equals(mo27827K0().getString(C17541R$string.action_file_operation_specify_pattern))) {
            return this.m_option + " " + this.m_filePattern;
        }
        return this.m_option + " " + this.m_fileOption;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_fromPath;
        if (str.endsWith("//")) {
            str = str.substring(0, str.length() - 2);
        }
        String str2 = this.m_toPath;
        if (str2 == null || str2.length() <= 0) {
            return str;
        }
        return str + " " + mo27827K0().getString(C17541R$string.action_file_operation_to) + ": " + this.m_toPath;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7888z0.m33008u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Intent intent = new Intent(mo27827K0(), FileOperationService.class);
        String t0 = this.m_filePattern != null ? C4023j0.m15760t0(mo27827K0(), this.m_filePattern, triggerContextInfo, mo27837X0()) : null;
        intent.putExtra("FromPath", this.m_fromPath);
        intent.putExtra("ToPath", this.m_toPath);
        intent.putExtra("FilePattern", t0);
        intent.putExtra("FileExtensions", this.m_fileExtensions);
        intent.putExtra("FileOption", this.m_option);
        intent.putExtra("FileOptionFixed", this.m_option);
        mo27827K0().startService(intent);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return s_options;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_file_operation);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 != -1) {
            return;
        }
        if (i == FROM_PICKER_ID) {
            this.m_fromPath = intent.getExtras().getString("FileSelection");
            m10654s3();
        } else if (i == TO_PICKER_ID) {
            this.m_toPath = intent.getExtras().getString("FileSelection");
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m10651p3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_option);
        parcel.writeString(this.m_optionFixed);
        parcel.writeString(this.m_fromPath);
        parcel.writeString(this.m_toPath);
        parcel.writeString(this.m_fileOption);
        parcel.writeString(this.m_filePattern);
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
        this.m_option = s_options[i];
        this.m_optionFixed = s_optionsFixed[i];
    }

    public FileOperationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private FileOperationAction() {
        this.m_displayPatternDialog = false;
        this.m_option = s_options[0];
        this.m_optionFixed = s_optionsFixed[0];
        this.m_fileOption = m10656u3()[0];
        this.m_filePattern = null;
        this.m_fileExtensions = new String[0];
    }

    private FileOperationAction(Parcel parcel) {
        super(parcel);
        this.m_displayPatternDialog = false;
        this.m_option = parcel.readString();
        this.m_optionFixed = parcel.readString();
        this.m_fromPath = parcel.readString();
        this.m_toPath = parcel.readString();
        this.m_fileOption = parcel.readString();
        this.m_filePattern = parcel.readString();
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
