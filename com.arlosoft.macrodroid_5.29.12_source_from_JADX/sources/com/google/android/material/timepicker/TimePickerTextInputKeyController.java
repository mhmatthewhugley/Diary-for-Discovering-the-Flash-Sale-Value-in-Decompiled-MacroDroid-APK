package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    private final ChipTextInputComboView f50693a;

    /* renamed from: c */
    private final ChipTextInputComboView f50694c;

    /* renamed from: d */
    private final TimeModel f50695d;

    /* renamed from: f */
    private boolean f50696f = false;

    TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f50693a = chipTextInputComboView;
        this.f50694c = chipTextInputComboView2;
        this.f50695d = timeModel;
    }

    /* renamed from: b */
    private void m70039b(int i) {
        boolean z = true;
        this.f50694c.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f50693a;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.f50695d.f50683o = i;
    }

    /* renamed from: c */
    private boolean m70040c(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        m70039b(12);
        return true;
    }

    /* renamed from: d */
    private boolean m70041d(int i, KeyEvent keyEvent, EditText editText) {
        if (!(i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        m70039b(10);
        return true;
    }

    /* renamed from: a */
    public void mo59402a() {
        TextInputLayout e = this.f50693a.mo59341e();
        TextInputLayout e2 = this.f50694c.mo59341e();
        EditText editText = e.getEditText();
        EditText editText2 = e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            m70039b(12);
        }
        return z;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        if (this.f50696f) {
            return false;
        }
        this.f50696f = true;
        EditText editText = (EditText) view;
        if (this.f50695d.f50683o == 12) {
            z = m70041d(i, keyEvent, editText);
        } else {
            z = m70040c(i, keyEvent, editText);
        }
        this.f50696f = false;
        return z;
    }
}
