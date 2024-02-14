package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.activities.ScanTagActivity;
import p119k3.C7480b1;

public class NFCTrigger extends Trigger {
    public static final Parcelable.Creator<NFCTrigger> CREATOR = new C5704b();
    private static final int SCAN_REQUEST = 4455;
    private String m_tagName;
    private transient String m_tagNameToWrite;
    private transient boolean m_writeTag;

    /* renamed from: com.arlosoft.macrodroid.triggers.NFCTrigger$a */
    class C5703a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13655a;

        /* renamed from: c */
        final /* synthetic */ EditText f13656c;

        C5703a(Button button, EditText editText) {
            this.f13655a = button;
            this.f13656c = editText;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f13655a.setEnabled(this.f13656c.getText().length() > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.NFCTrigger$b */
    class C5704b implements Parcelable.Creator<NFCTrigger> {
        C5704b() {
        }

        /* renamed from: a */
        public NFCTrigger createFromParcel(Parcel parcel) {
            return new NFCTrigger(parcel, (C5703a) null);
        }

        /* renamed from: b */
        public NFCTrigger[] newArray(int i) {
            return new NFCTrigger[i];
        }
    }

    /* synthetic */ NFCTrigger(Parcel parcel, C5703a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m22770l3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_nfc_write_tag), SelectableItem.m15535j1(C17541R$string.trigger_nfc_existing_tag)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m22771n3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m22772o3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m22774q3(EditText editText, Activity activity, DialogInterface dialogInterface, int i) {
        this.m_tagNameToWrite = editText.getText().toString();
        Intent intent = new Intent(activity, ScanTagActivity.class);
        intent.putExtra("TagName", this.m_tagNameToWrite);
        activity.startActivityForResult(intent, SCAN_REQUEST);
    }

    /* renamed from: s3 */
    private void m22776s3() {
        Activity j0 = mo27850j0();
        EditText editText = new EditText(new ContextThemeWrapper((Context) j0, mo24705l0()));
        editText.setSingleLine();
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(25)});
        editText.setHint(C17541R$string.trigger_nfc_enter_tag_name);
        editText.setInputType(524288);
        editText.setMinimumWidth(mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.alert_dialog_input_min_width));
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin);
        AlertDialog create = new AlertDialog.Builder(j0, mo24705l0()).setTitle((int) C17541R$string.trigger_nfc_write_tag).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5982k5(this, editText, j0)).setNegativeButton(17039360, (DialogInterface.OnClickListener) C5994l5.f14174a).create();
        create.setView(editText, dimensionPixelOffset, dimensionPixelSize, dimensionPixelOffset, 0);
        create.show();
        Button button = create.getButton(-1);
        button.setEnabled(false);
        editText.addTextChangedListener(new C5703a(button, editText));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        String str = this.m_tagName;
        return str != null && str.length() > 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_tagName;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7480b1.m31089u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        this.m_writeTag = true;
        return m22770l3();
    }

    /* renamed from: m3 */
    public String mo31347m3() {
        return this.m_tagName;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SCAN_REQUEST) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
            if (i2 == -1) {
                String str = this.m_tagNameToWrite;
                this.m_tagName = str;
                if (str != null) {
                    builder.setMessage((int) C17541R$string.trigger_nfc_tag_configured).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5958i5(this));
                } else {
                    this.m_tagName = intent.getExtras().getString("TagName");
                    builder.setMessage((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_nfc_using_nfc_tag) + this.m_tagName).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5970j5(this));
                }
            } else {
                this.m_tagName = "";
                builder.setMessage((int) C17541R$string.trigger_nfc_failed_to_write).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) C6006m5.f14193a);
                if (this.m_tagNameToWrite == null) {
                    builder.setMessage((int) C17541R$string.trigger_nfc_failed_to_read);
                }
            }
            builder.create().show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_writeTag) {
            m22776s3();
            return;
        }
        Activity j0 = mo27850j0();
        j0.startActivityForResult(new Intent(j0, ScanTagActivity.class), SCAN_REQUEST);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_tagName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_writeTag = i == 0;
    }

    public NFCTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private NFCTrigger() {
    }

    private NFCTrigger(Parcel parcel) {
        super(parcel);
        this.m_tagName = parcel.readString();
    }
}
