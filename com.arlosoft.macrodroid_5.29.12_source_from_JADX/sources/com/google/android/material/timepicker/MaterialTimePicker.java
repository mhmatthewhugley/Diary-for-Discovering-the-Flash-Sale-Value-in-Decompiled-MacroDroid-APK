package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.C10462R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    @DrawableRes

    /* renamed from: A */
    private int f50643A;
    @DrawableRes

    /* renamed from: B */
    private int f50644B;
    @StringRes

    /* renamed from: C */
    private int f50645C = 0;

    /* renamed from: D */
    private CharSequence f50646D;
    @StringRes

    /* renamed from: E */
    private int f50647E = 0;

    /* renamed from: F */
    private CharSequence f50648F;
    @StringRes

    /* renamed from: G */
    private int f50649G = 0;

    /* renamed from: H */
    private CharSequence f50650H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public MaterialButton f50651I;

    /* renamed from: J */
    private Button f50652J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f50653K = 0;

    /* renamed from: L */
    private TimeModel f50654L;

    /* renamed from: M */
    private int f50655M = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set<View.OnClickListener> f50656a = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Set<View.OnClickListener> f50657c = new LinkedHashSet();

    /* renamed from: d */
    private final Set<DialogInterface.OnCancelListener> f50658d = new LinkedHashSet();

    /* renamed from: f */
    private final Set<DialogInterface.OnDismissListener> f50659f = new LinkedHashSet();

    /* renamed from: g */
    private TimePickerView f50660g;

    /* renamed from: o */
    private ViewStub f50661o;
    @Nullable

    /* renamed from: p */
    private TimePickerClockPresenter f50662p;
    @Nullable

    /* renamed from: s */
    private TimePickerTextInputPresenter f50663s;
    @Nullable

    /* renamed from: z */
    private TimePickerPresenter f50664z;

    public static final class Builder {

        /* renamed from: a */
        private TimeModel f50668a = new TimeModel();
        @StringRes

        /* renamed from: b */
        private int f50669b = 0;
        @StringRes

        /* renamed from: c */
        private int f50670c = 0;
        @StringRes

        /* renamed from: d */
        private int f50671d = 0;

        /* renamed from: e */
        private int f50672e = 0;
    }

    /* renamed from: e0 */
    private Pair<Integer, Integer> m69999e0(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.f50643A), Integer.valueOf(C10462R.string.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.f50644B), Integer.valueOf(C10462R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    /* renamed from: f0 */
    private int m70000f0() {
        int i = this.f50655M;
        if (i != 0) {
            return i;
        }
        TypedValue a = MaterialAttributes.m69116a(requireContext(), C10462R.attr.materialTimePickerTheme);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    /* renamed from: g0 */
    private TimePickerPresenter m70001g0(int i, @NonNull TimePickerView timePickerView, @NonNull ViewStub viewStub) {
        if (i == 0) {
            TimePickerClockPresenter timePickerClockPresenter = this.f50662p;
            if (timePickerClockPresenter == null) {
                timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.f50654L);
            }
            this.f50662p = timePickerClockPresenter;
            return timePickerClockPresenter;
        }
        if (this.f50663s == null) {
            this.f50663s = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.f50654L);
        }
        this.f50663s.mo59405e();
        return this.f50663s;
    }

    /* renamed from: h0 */
    private void m70002h0(@Nullable Bundle bundle) {
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
            this.f50654L = timeModel;
            if (timeModel == null) {
                this.f50654L = new TimeModel();
            }
            this.f50653K = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
            this.f50645C = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
            this.f50646D = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.f50647E = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.f50648F = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.f50649G = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.f50650H = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.f50655M = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    /* renamed from: i0 */
    private void m70003i0() {
        Button button = this.f50652J;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m70004j0(MaterialButton materialButton) {
        if (materialButton != null && this.f50660g != null && this.f50661o != null) {
            TimePickerPresenter timePickerPresenter = this.f50664z;
            if (timePickerPresenter != null) {
                timePickerPresenter.mo59398f();
            }
            TimePickerPresenter g0 = m70001g0(this.f50653K, this.f50660g, this.f50661o);
            this.f50664z = g0;
            g0.show();
            this.f50664z.mo59395a();
            Pair<Integer, Integer> e0 = m69999e0(this.f50653K);
            materialButton.setIconResource(((Integer) e0.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) e0.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f50658d) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        m70002h0(bundle);
    }

    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m70000f0());
        Context context = dialog.getContext();
        int d = MaterialAttributes.m69119d(context, C10462R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        int i = C10462R.attr.materialTimePickerStyle;
        int i2 = C10462R.style.Widget_MaterialComponents_TimePicker;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, (AttributeSet) null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C10462R.styleable.MaterialTimePicker, i, i2);
        this.f50644B = obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f50643A = obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.mo58649P(context);
        materialShapeDrawable.mo58656a0(ColorStateList.valueOf(d));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.mo58655Z(ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C10462R.C10467layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C10462R.C10465id.material_timepicker_view);
        this.f50660g = timePickerView;
        timePickerView.mo59416l(this);
        this.f50661o = (ViewStub) viewGroup2.findViewById(C10462R.C10465id.material_textinput_timepicker);
        this.f50651I = (MaterialButton) viewGroup2.findViewById(C10462R.C10465id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C10462R.C10465id.header_title);
        int i = this.f50645C;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f50646D)) {
            textView.setText(this.f50646D);
        }
        m70004j0(this.f50651I);
        Button button = (Button) viewGroup2.findViewById(C10462R.C10465id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (View.OnClickListener onClick : MaterialTimePicker.this.f50656a) {
                    onClick.onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i2 = this.f50647E;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f50648F)) {
            button.setText(this.f50648F);
        }
        Button button2 = (Button) viewGroup2.findViewById(C10462R.C10465id.material_timepicker_cancel_button);
        this.f50652J = button2;
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (View.OnClickListener onClick : MaterialTimePicker.this.f50657c) {
                    onClick.onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        int i3 = this.f50649G;
        if (i3 != 0) {
            this.f50652J.setText(i3);
        } else if (!TextUtils.isEmpty(this.f50650H)) {
            this.f50652J.setText(this.f50650H);
        }
        m70003i0();
        this.f50651I.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                int unused = materialTimePicker.f50653K = materialTimePicker.f50653K == 0 ? 1 : 0;
                MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
                materialTimePicker2.m70004j0(materialTimePicker2.f50651I);
            }
        });
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f50664z = null;
        this.f50662p = null;
        this.f50663s = null;
        TimePickerView timePickerView = this.f50660g;
        if (timePickerView != null) {
            timePickerView.mo59416l((TimePickerView.OnDoubleTapListener) null);
            this.f50660g = null;
        }
    }

    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f50659f) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f50654L);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f50653K);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f50645C);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f50646D);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f50647E);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f50648F);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f50649G);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f50650H);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f50655M);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        m70003i0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public void mo59370y() {
        this.f50653K = 1;
        m70004j0(this.f50651I);
        this.f50663s.mo59407i();
    }
}
