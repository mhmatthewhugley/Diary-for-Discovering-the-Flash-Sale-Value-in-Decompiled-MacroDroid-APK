package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.C10462R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;

class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {

    /* renamed from: A */
    private MaterialButtonToggleGroup f50697A;

    /* renamed from: a */
    private final LinearLayout f50698a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final TimeModel f50699c;

    /* renamed from: d */
    private final TextWatcher f50700d = new TextWatcherAdapter() {
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.f50699c.mo59387h(0);
                    return;
                }
                TimePickerTextInputPresenter.this.f50699c.mo59387h(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* renamed from: f */
    private final TextWatcher f50701f = new TextWatcherAdapter() {
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.f50699c.mo59386g(0);
                    return;
                }
                TimePickerTextInputPresenter.this.f50699c.mo59386g(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* renamed from: g */
    private final ChipTextInputComboView f50702g;

    /* renamed from: o */
    private final ChipTextInputComboView f50703o;

    /* renamed from: p */
    private final TimePickerTextInputKeyController f50704p;

    /* renamed from: s */
    private final EditText f50705s;

    /* renamed from: z */
    private final EditText f50706z;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
        this.f50698a = linearLayout;
        this.f50699c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C10462R.C10465id.material_minute_text_input);
        this.f50702g = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C10462R.C10465id.material_hour_text_input);
        this.f50703o = chipTextInputComboView2;
        int i = C10462R.C10465id.material_label;
        ((TextView) chipTextInputComboView.findViewById(i)).setText(resources.getString(C10462R.string.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(i)).setText(resources.getString(C10462R.string.material_timepicker_hour));
        int i2 = C10462R.C10465id.selection_type;
        chipTextInputComboView.setTag(i2, 12);
        chipTextInputComboView2.setTag(i2, 10);
        if (timeModel.f50680d == 0) {
            m70047k();
        }
        C107103 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                TimePickerTextInputPresenter.this.mo59397d(((Integer) view.getTag(C10462R.C10465id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(r0);
        chipTextInputComboView.setOnClickListener(r0);
        chipTextInputComboView2.mo59340c(timeModel.mo59382d());
        chipTextInputComboView.mo59340c(timeModel.mo59384e());
        this.f50705s = chipTextInputComboView2.mo59341e().getEditText();
        this.f50706z = chipTextInputComboView.mo59341e().getEditText();
        this.f50704p = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.mo59342f(new ClickActionDelegate(linearLayout.getContext(), C10462R.string.material_hour_selection));
        chipTextInputComboView.mo59342f(new ClickActionDelegate(linearLayout.getContext(), C10462R.string.material_minute_selection));
        mo59406g();
    }

    /* renamed from: c */
    private void m70044c() {
        this.f50705s.addTextChangedListener(this.f50701f);
        this.f50706z.addTextChangedListener(this.f50700d);
    }

    /* renamed from: h */
    private void m70045h() {
        this.f50705s.removeTextChangedListener(this.f50701f);
        this.f50706z.removeTextChangedListener(this.f50700d);
    }

    /* renamed from: j */
    private void m70046j(TimeModel timeModel) {
        m70045h();
        Locale locale = this.f50698a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.f50682g)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(timeModel.mo59381c())});
        this.f50702g.mo59343g(format);
        this.f50703o.mo59343g(format2);
        m70044c();
        m70048l();
    }

    /* renamed from: k */
    private void m70047k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f50698a.findViewById(C10462R.C10465id.material_clock_period_toggle);
        this.f50697A = materialButtonToggleGroup;
        materialButtonToggleGroup.mo57076g(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            /* renamed from: a */
            public void mo57094a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
                TimePickerTextInputPresenter.this.f50699c.mo59389i(i == C10462R.C10465id.material_clock_period_pm_button ? 1 : 0);
            }
        });
        this.f50697A.setVisibility(0);
        m70048l();
    }

    /* renamed from: l */
    private void m70048l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f50697A;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.mo57081j(this.f50699c.f50684p == 0 ? C10462R.C10465id.material_clock_period_am_button : C10462R.C10465id.material_clock_period_pm_button);
        }
    }

    /* renamed from: a */
    public void mo59395a() {
        m70046j(this.f50699c);
    }

    /* renamed from: d */
    public void mo59397d(int i) {
        this.f50699c.f50683o = i;
        boolean z = true;
        this.f50702g.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f50703o;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        m70048l();
    }

    /* renamed from: e */
    public void mo59405e() {
        this.f50702g.setChecked(false);
        this.f50703o.setChecked(false);
    }

    /* renamed from: f */
    public void mo59398f() {
        View focusedChild = this.f50698a.getFocusedChild();
        if (focusedChild == null) {
            this.f50698a.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.f50698a.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f50698a.setVisibility(8);
    }

    /* renamed from: g */
    public void mo59406g() {
        m70044c();
        m70046j(this.f50699c);
        this.f50704p.mo59402a();
    }

    /* renamed from: i */
    public void mo59407i() {
        boolean z = true;
        this.f50702g.setChecked(this.f50699c.f50683o == 12);
        ChipTextInputComboView chipTextInputComboView = this.f50703o;
        if (this.f50699c.f50683o != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
    }

    public void show() {
        this.f50698a.setVisibility(0);
    }
}
