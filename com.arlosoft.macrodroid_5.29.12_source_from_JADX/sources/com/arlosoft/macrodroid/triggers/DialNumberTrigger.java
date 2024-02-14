package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.DialNumberTriggerReceiver;
import p119k3.C7574y;
import p148q0.C8151a;

public class DialNumberTrigger extends Trigger {
    public static final Parcelable.Creator<DialNumberTrigger> CREATOR = new C5637b();
    private static DialNumberTriggerReceiver s_dialNumberTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_makeCall;
    private String m_numberToDial;

    /* renamed from: com.arlosoft.macrodroid.triggers.DialNumberTrigger$a */
    class C5636a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13608a;

        /* renamed from: c */
        final /* synthetic */ EditText f13609c;

        C5636a(Button button, EditText editText) {
            this.f13608a = button;
            this.f13609c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13608a.setEnabled(this.f13609c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.DialNumberTrigger$b */
    class C5637b implements Parcelable.Creator<DialNumberTrigger> {
        C5637b() {
        }

        /* renamed from: a */
        public DialNumberTrigger createFromParcel(Parcel parcel) {
            return new DialNumberTrigger(parcel, (C5636a) null);
        }

        /* renamed from: b */
        public DialNumberTrigger[] newArray(int i) {
            return new DialNumberTrigger[i];
        }
    }

    /* synthetic */ DialNumberTrigger(Parcel parcel, C5636a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m22075j3(EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
        this.m_numberToDial = editText.getText().toString();
        this.m_makeCall = radioButton.isChecked();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.trigger_dial_number) + " " + this.m_numberToDial;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_dialNumberTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_dialNumberTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7574y.m31533u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_dialNumberTriggerReceiver = new DialNumberTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_dialNumberTriggerReceiver, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.PROCESS_OUTGOING_CALLS"};
    }

    /* renamed from: i3 */
    public String mo31086i3() {
        return this.m_numberToDial;
    }

    /* renamed from: l3 */
    public boolean mo31087l3() {
        return this.m_makeCall;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dial_number_dialog);
        appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_dial_number_title));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dial_number_dialog_phone_number);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.dial_number_dialog_make_call);
        editText.setText(this.m_numberToDial);
        editText.setSelection(editText.length());
        radioButton.setChecked(this.m_makeCall);
        editText.addTextChangedListener(new C5636a(button, editText));
        button.setOnClickListener(new C6003m2(this, editText, radioButton, appCompatDialog));
        button.setEnabled(editText.getText().length() > 0);
        button2.setOnClickListener(new C5991l2(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_numberToDial);
        parcel.writeInt(this.m_makeCall ? 1 : 0);
    }

    public DialNumberTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DialNumberTrigger() {
        this.m_makeCall = false;
    }

    private DialNumberTrigger(Parcel parcel) {
        super(parcel);
        this.m_numberToDial = parcel.readString();
        this.m_makeCall = parcel.readInt() != 0;
    }
}
