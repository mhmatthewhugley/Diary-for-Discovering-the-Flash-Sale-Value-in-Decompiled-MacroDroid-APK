package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4040n;
import com.arlosoft.macrodroid.common.C4072w0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6457x1;
import com.getpebble.android.kit.PebbleKit;
import com.getpebble.android.kit.util.PebbleDictionary;
import java.util.HashMap;
import org.apache.commons.p353io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p057a2.C2224m;
import p128m0.C7810o2;
import p148q0.C8151a;

public class PebbleAction extends Action implements C2224m {
    public static final Parcelable.Creator<PebbleAction> CREATOR = new C2578c();
    private static final int PEBBLE_COMMAND_CLOSE_APP = 2;
    private static final int PEBBLE_COMMAND_DISPLAY_NOTIFICATION = 0;
    private static final int PEBBLE_COMMAND_DISPLAY_TEXT = 5;
    private static final int PEBBLE_COMMAND_DISPLAY_TEXT_OPTION_KEY = 997;
    private static final int PEBBLE_COMMAND_START_APP = 1;
    private static final int PEBBLE_COMMAND_VIBRATE = 3;
    private static final int PEBBLE_COMMAND_VIBRATE_OPTION_KEY = 998;
    private static final int PEBBLE_DISPLAY_TEXT_DURATION_OPTION_KEY = 995;
    private static final int PEBBLE_DISPLAY_TEXT_SIZE_OPTION_KEY = 996;
    private int m_command;
    private String m_notificationMessage;
    private String m_notificationTitle;
    private String m_onScreenText;
    private int m_onScreenTextDurationSeconds;
    private int m_onScreenTextSize;
    private int m_vibrateOption;

    /* renamed from: com.arlosoft.macrodroid.action.PebbleAction$a */
    class C2576a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7446a;

        /* renamed from: c */
        final /* synthetic */ EditText f7447c;

        /* renamed from: d */
        final /* synthetic */ EditText f7448d;

        C2576a(Button button, EditText editText, EditText editText2) {
            this.f7446a = button;
            this.f7447c = editText;
            this.f7448d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7446a.setEnabled(this.f7447c.getText().length() > 0 && this.f7448d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.PebbleAction$b */
    class C2577b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7450a;

        /* renamed from: c */
        final /* synthetic */ RadioButton f7451c;

        /* renamed from: d */
        final /* synthetic */ EditText f7452d;

        C2577b(Button button, RadioButton radioButton, EditText editText) {
            this.f7450a = button;
            this.f7451c = radioButton;
            this.f7452d = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7450a.setEnabled(!this.f7451c.isChecked() || this.f7452d.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.PebbleAction$c */
    class C2578c implements Parcelable.Creator<PebbleAction> {
        C2578c() {
        }

        /* renamed from: a */
        public PebbleAction createFromParcel(Parcel parcel) {
            return new PebbleAction(parcel, (C2576a) null);
        }

        /* renamed from: b */
        public PebbleAction[] newArray(int i) {
            return new PebbleAction[i];
        }
    }

    /* synthetic */ PebbleAction(Parcel parcel, C2576a aVar) {
        this(parcel);
    }

    /* renamed from: C3 */
    private void m11799C3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.configure_pebble_notification);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_pebble_notification_text);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_pebble_subject_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.configure_pebble_magic_subject_button);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.configure_pebble_magic_text_button);
        String str = this.m_notificationMessage;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        String str2 = this.m_notificationTitle;
        if (str2 != null) {
            editText2.setText(str2);
            editText2.setSelection(editText2.length());
        }
        C2576a aVar = new C2576a(button, editText, editText2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(aVar);
        button.setOnClickListener(new C3569wc(this, appCompatDialog, editText, editText2));
        button.setEnabled(editText.getText().length() > 0 && editText2.getText().length() > 0);
        button2.setOnClickListener(new C3058fd(appCompatDialog));
        button3.setOnClickListener(new C3114hd(this, j0, new C3623yc(editText2)));
        button4.setOnClickListener(new C3142id(this, j0, new C2916ad(editText)));
        appCompatDialog.show();
    }

    /* renamed from: D3 */
    private void m11800D3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.configure_pebble_text);
        appCompatDialog.setTitle((int) C17541R$string.action_pebble_display_text);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_text);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_set_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_clear_radio_button);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_spinner_duration);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_spinner_size);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.configure_pebble_text_magic_text_button);
        boolean z = true;
        radioButton.setChecked(this.m_onScreenText != null);
        radioButton2.setChecked(false);
        String str = this.m_onScreenText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        spinner.setSelection(this.m_onScreenTextDurationSeconds);
        spinner2.setSelection(this.m_onScreenTextSize);
        editText.setEnabled(radioButton.isChecked());
        spinner.setEnabled(radioButton.isChecked());
        spinner2.setEnabled(radioButton.isChecked());
        if (radioButton.isChecked() && editText.length() <= 0) {
            z = false;
        }
        button.setEnabled(z);
        radioButton.setOnCheckedChangeListener(new C3596xc(editText, spinner, spinner2, button));
        editText.addTextChangedListener(new C2577b(button, radioButton, editText));
        button3.setOnClickListener(new C3170jd(this, j0, new C3650zc(editText)));
        button.setOnClickListener(new C3198kd(this, radioButton2, editText, spinner2, spinner, appCompatDialog));
        button2.setOnClickListener(new C3086gd(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: E3 */
    private void m11801E3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_pebble_vibrate_pattern);
        builder.setSingleChoiceItems((CharSequence[]) C6457x1.m24785a(), this.m_vibrateOption, (DialogInterface.OnClickListener) new C3029ed(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2972cd(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3001dd(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3541vc(this));
    }

    /* renamed from: F3 */
    private String[] m11802F3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_notification), MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_open_app), MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_close_app), MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_vibrate), MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_light_on), MacroDroidApplication.m14845u().getString(C17541R$string.action_pebble_display_text)};
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m11803G3(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, View view) {
        appCompatDialog.cancel();
        this.m_notificationMessage = editText.getText().toString();
        this.m_notificationTitle = editText2.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static /* synthetic */ void m11805I3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m11806J3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static /* synthetic */ void m11807K3(EditText editText, C4023j0.C4029f fVar) {
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
    public /* synthetic */ void m11808L3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static /* synthetic */ void m11809M3(EditText editText, Spinner spinner, Spinner spinner2, Button button, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(z);
        spinner.setEnabled(z);
        spinner2.setEnabled(z);
        button.setEnabled(!z || editText.length() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static /* synthetic */ void m11810N3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m11811O3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m11812P3(RadioButton radioButton, EditText editText, Spinner spinner, Spinner spinner2, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_onScreenText = null;
        } else {
            this.m_onScreenText = editText.getText().toString();
            this.m_onScreenTextSize = spinner.getSelectedItemPosition();
            this.m_onScreenTextDurationSeconds = spinner2.getSelectedItemPosition();
        }
        super.mo24677v2();
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m11814R3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void m11815S3(DialogInterface dialogInterface, int i) {
        this.m_vibrateOption = i;
        C6457x1.m24786b(mo27827K0(), this.m_vibrateOption);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public /* synthetic */ void m11816T3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m11817U3(DialogInterface dialogInterface, int i) {
        super.mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m11818V3() {
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_command;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_notificationTitle, this.m_notificationMessage, this.m_onScreenText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 3) {
            this.m_notificationTitle = strArr[0];
            this.m_notificationMessage = strArr[1];
            this.m_onScreenText = strArr[2];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_command;
        if (i == 3) {
            return m11802F3()[this.m_command] + ": " + C6457x1.m24785a()[this.m_vibrateOption];
        } else if (i != 5) {
            return m11802F3()[this.m_command];
        } else {
            return m11802F3()[this.m_command] + ": " + this.m_onScreenText;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7810o2.m32632u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_command;
        if (i == 0) {
            Intent intent = new Intent("com.getpebble.action.SEND_NOTIFICATION");
            String t0 = C4023j0.m15760t0(mo27827K0(), this.m_notificationTitle, triggerContextInfo, mo27837X0());
            String t02 = C4023j0.m15760t0(mo27827K0(), this.m_notificationMessage, triggerContextInfo, mo27837X0());
            HashMap hashMap = new HashMap();
            hashMap.put("title", t0);
            hashMap.put("body", t02);
            String jSONArray = new JSONArray().put(new JSONObject(hashMap)).toString();
            intent.putExtra("messageType", "PEBBLE_ALERT");
            intent.putExtra("sender", "MyAndroidApp");
            intent.putExtra("notificationData", jSONArray);
            mo27827K0().sendBroadcast(intent);
        } else if (i == 1) {
            PebbleKit.m26090k(mo27827K0(), C4040n.f10591a);
        } else if (i == 2) {
            PebbleKit.m26080a(mo27827K0(), C4040n.f10591a);
        } else {
            PebbleDictionary pebbleDictionary = new PebbleDictionary();
            pebbleDictionary.mo34298m(999, (byte) this.m_command);
            if (this.m_command == 3) {
                pebbleDictionary.mo34298m(PEBBLE_COMMAND_VIBRATE_OPTION_KEY, (byte) this.m_vibrateOption);
            }
            if (this.m_command == 5) {
                try {
                    pebbleDictionary.mo34293i(PEBBLE_COMMAND_DISPLAY_TEXT_OPTION_KEY, C4023j0.m15760t0(mo27827K0(), this.m_onScreenText, triggerContextInfo, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX));
                    pebbleDictionary.mo34298m(PEBBLE_DISPLAY_TEXT_SIZE_OPTION_KEY, (byte) this.m_onScreenTextSize);
                    TypedArray obtainTypedArray = mo27827K0().getResources().obtainTypedArray(C17525R$array.set_pebble_text_duration_values);
                    pebbleDictionary.mo34291f(PEBBLE_DISPLAY_TEXT_DURATION_OPTION_KEY, obtainTypedArray.getInt(this.m_onScreenTextDurationSeconds, 5));
                    obtainTypedArray.recycle();
                } catch (Exception e) {
                    C8151a.m33873n(new RuntimeException("PebbleAction: Error encoding UTF-8: " + e.toString()));
                }
            }
            PebbleKit.m26088i(mo27827K0(), C4040n.f10591a, pebbleDictionary);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11802F3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20091X1(mo27827K0())) {
            super.mo24714u1();
        } else {
            C4072w0.m16080d(mo27850j0(), new C2944bd(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_command;
        if (i == 0) {
            m11799C3();
        } else if (i == 3) {
            m11801E3();
        } else if (i == 5) {
            m11800D3();
        } else {
            super.mo24677v2();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_command);
        parcel.writeString(this.m_notificationTitle);
        parcel.writeString(this.m_notificationMessage);
        parcel.writeString(this.m_onScreenText);
        parcel.writeInt(this.m_vibrateOption);
        parcel.writeInt(this.m_onScreenTextDurationSeconds);
        parcel.writeInt(this.m_onScreenTextSize);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_command = i;
    }

    public PebbleAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private PebbleAction() {
        this.m_onScreenText = "";
    }

    private PebbleAction(Parcel parcel) {
        super(parcel);
        this.m_command = parcel.readInt();
        this.m_notificationTitle = parcel.readString();
        this.m_notificationMessage = parcel.readString();
        this.m_onScreenText = parcel.readString();
        this.m_vibrateOption = parcel.readInt();
        this.m_onScreenTextDurationSeconds = parcel.readInt();
        this.m_onScreenTextSize = parcel.readInt();
    }
}
