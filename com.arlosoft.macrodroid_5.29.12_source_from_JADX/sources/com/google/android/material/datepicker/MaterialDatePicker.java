package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.C10462R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: I */
    static final Object f49199I = "CONFIRM_BUTTON_TAG";

    /* renamed from: J */
    static final Object f49200J = "CANCEL_BUTTON_TAG";

    /* renamed from: K */
    static final Object f49201K = "TOGGLE_BUTTON_TAG";
    @StringRes

    /* renamed from: A */
    private int f49202A;

    /* renamed from: B */
    private CharSequence f49203B;

    /* renamed from: C */
    private boolean f49204C;

    /* renamed from: D */
    private int f49205D;

    /* renamed from: E */
    private TextView f49206E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public CheckableImageButton f49207F;
    @Nullable

    /* renamed from: G */
    private MaterialShapeDrawable f49208G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Button f49209H;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> f49210a = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LinkedHashSet<View.OnClickListener> f49211c = new LinkedHashSet<>();

    /* renamed from: d */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f49212d = new LinkedHashSet<>();

    /* renamed from: f */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f49213f = new LinkedHashSet<>();
    @StyleRes

    /* renamed from: g */
    private int f49214g;
    @Nullable

    /* renamed from: o */
    private DateSelector<S> f49215o;

    /* renamed from: p */
    private PickerFragment<S> f49216p;
    @Nullable

    /* renamed from: s */
    private CalendarConstraints f49217s;

    /* renamed from: z */
    private MaterialCalendar<S> f49218z;

    public static final class Builder<S> {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    @NonNull
    /* renamed from: g0 */
    private static Drawable m68215g0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AppCompatResources.getDrawable(context, C10462R.C10464drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, C10462R.C10464drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public DateSelector<S> m68216h0() {
        if (this.f49215o == null) {
            this.f49215o = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f49215o;
    }

    /* renamed from: j0 */
    private static int m68217j0(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_content_padding);
        int i = Month.m68236f().f49233f;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C10462R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: n0 */
    private int m68218n0(Context context) {
        int i = this.f49214g;
        if (i != 0) {
            return i;
        }
        return m68216h0().mo57591z0(context);
    }

    /* renamed from: o0 */
    private void m68219o0(Context context) {
        this.f49207F.setTag(f49201K);
        this.f49207F.setImageDrawable(m68215g0(context));
        this.f49207F.setChecked(this.f49205D != 0);
        ViewCompat.setAccessibilityDelegate(this.f49207F, (AccessibilityDelegateCompat) null);
        m68225v0(this.f49207F);
        this.f49207F.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MaterialDatePicker.this.f49209H.setEnabled(MaterialDatePicker.this.m68216h0().mo57585Y1());
                MaterialDatePicker.this.f49207F.toggle();
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.m68225v0(materialDatePicker.f49207F);
                MaterialDatePicker.this.m68223s0();
            }
        });
    }

    /* renamed from: p0 */
    static boolean m68220p0(@NonNull Context context) {
        return m68222r0(context, 16843277);
    }

    /* renamed from: q0 */
    static boolean m68221q0(@NonNull Context context) {
        return m68222r0(context, C10462R.attr.nestedScrollable);
    }

    /* renamed from: r0 */
    static boolean m68222r0(@NonNull Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m69119d(context, C10462R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m68223s0() {
        int n0 = m68218n0(requireContext());
        this.f49218z = MaterialCalendar.m68189s0(m68216h0(), n0, this.f49217s);
        this.f49216p = this.f49207F.isChecked() ? MaterialTextInputPicker.m68231W(m68216h0(), n0, this.f49217s) : this.f49218z;
        m68224u0();
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(C10462R.C10465id.mtrl_calendar_frame, this.f49216p);
        beginTransaction.commitNow();
        this.f49216p.mo57614U(new OnSelectionChangedListener<S>() {
            /* renamed from: a */
            public void mo57641a() {
                MaterialDatePicker.this.f49209H.setEnabled(false);
            }

            /* renamed from: b */
            public void mo57642b(S s) {
                MaterialDatePicker.this.m68224u0();
                MaterialDatePicker.this.f49209H.setEnabled(MaterialDatePicker.this.m68216h0().mo57585Y1());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m68224u0() {
        String i0 = mo57637i0();
        this.f49206E.setContentDescription(String.format(getString(C10462R.string.mtrl_picker_announce_current_selection), new Object[]{i0}));
        this.f49206E.setText(i0);
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m68225v0(@NonNull CheckableImageButton checkableImageButton) {
        String str;
        if (this.f49207F.isChecked()) {
            str = checkableImageButton.getContext().getString(C10462R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(C10462R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f49207F.setContentDescription(str);
    }

    /* renamed from: i0 */
    public String mo57637i0() {
        return m68216h0().mo57589l1(getContext());
    }

    @Nullable
    /* renamed from: m0 */
    public final S mo57638m0() {
        return m68216h0().mo57587b2();
    }

    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f49212d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49214g = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f49215o = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f49217s = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f49202A = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f49203B = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f49205D = bundle.getInt("INPUT_MODE_KEY");
    }

    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m68218n0(requireContext()));
        Context context = dialog.getContext();
        this.f49204C = m68220p0(context);
        int d = MaterialAttributes.m69119d(context, C10462R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, (AttributeSet) null, C10462R.attr.materialCalendarStyle, C10462R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f49208G = materialShapeDrawable;
        materialShapeDrawable.mo58649P(context);
        this.f49208G.mo58656a0(ColorStateList.valueOf(d));
        this.f49208G.mo58655Z(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f49204C ? C10462R.C10467layout.mtrl_picker_fullscreen : C10462R.C10467layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f49204C) {
            inflate.findViewById(C10462R.C10465id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m68217j0(context), -2));
        } else {
            inflate.findViewById(C10462R.C10465id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m68217j0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C10462R.C10465id.mtrl_picker_header_selection_text);
        this.f49206E = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.f49207F = (CheckableImageButton) inflate.findViewById(C10462R.C10465id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C10462R.C10465id.mtrl_picker_title_text);
        CharSequence charSequence = this.f49203B;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f49202A);
        }
        m68219o0(context);
        this.f49209H = (Button) inflate.findViewById(C10462R.C10465id.confirm_button);
        if (m68216h0().mo57585Y1()) {
            this.f49209H.setEnabled(true);
        } else {
            this.f49209H.setEnabled(false);
        }
        this.f49209H.setTag(f49199I);
        this.f49209H.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Iterator it = MaterialDatePicker.this.f49210a.iterator();
                while (it.hasNext()) {
                    ((MaterialPickerOnPositiveButtonClickListener) it.next()).mo57644a(MaterialDatePicker.this.mo57638m0());
                }
                MaterialDatePicker.this.dismiss();
            }
        });
        Button button = (Button) inflate.findViewById(C10462R.C10465id.cancel_button);
        button.setTag(f49200J);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Iterator it = MaterialDatePicker.this.f49211c.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialDatePicker.this.dismiss();
            }
        });
        return inflate;
    }

    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f49213f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f49214g);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f49215o);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(this.f49217s);
        if (this.f49218z.mo57617n0() != null) {
            builder.mo57563b(this.f49218z.mo57617n0().f49235o);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.mo57562a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f49202A);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f49203B);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f49204C) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f49208G);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C10462R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f49208G, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        m68223s0();
    }

    public void onStop() {
        this.f49216p.mo57684V();
        super.onStop();
    }
}
