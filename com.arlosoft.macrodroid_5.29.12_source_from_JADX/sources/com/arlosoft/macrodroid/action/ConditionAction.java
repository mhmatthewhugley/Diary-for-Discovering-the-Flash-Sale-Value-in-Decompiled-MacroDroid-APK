package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddConditionActivity;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.util.ArrayList;
import java.util.List;

public abstract class ConditionAction extends Action {
    private static final int REQUEST_CODE_ADD_CONDITION = 0;
    private transient int m_childLevelOffset;
    private transient AppCompatDialog m_dialog;
    private transient List<Constraint> m_originalConstraintList;
    private transient Constraint selectedConstraint;
    /* access modifiers changed from: private */
    public transient boolean tempIsOrCondition;

    /* renamed from: com.arlosoft.macrodroid.action.ConditionAction$a */
    class C2372a implements AdapterView.OnItemSelectedListener {
        C2372a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ConditionAction conditionAction = ConditionAction.this;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            boolean unused = conditionAction.tempIsOrCondition = z;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    ConditionAction() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m10157A3(View view) {
        AppCompatDialog appCompatDialog = this.m_dialog;
        if (appCompatDialog != null) {
            this.m_originalConstraintList = null;
            appCompatDialog.dismiss();
            this.m_dialog = null;
        }
        mo24689O1();
        mo27816B2(this.tempIsOrCondition);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m10158B3(View view) {
        mo27817C2(this.m_originalConstraintList);
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
        AppCompatDialog appCompatDialog = this.m_dialog;
        if (appCompatDialog != null) {
            this.m_originalConstraintList = null;
            appCompatDialog.dismiss();
            this.m_dialog = null;
        }
        mo27864r1();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m10159C3(DialogInterface dialogInterface) {
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
        if (this.m_dialog != null) {
            this.m_dialog = null;
        }
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m10160D3(Activity activity, View view) {
        AppCompatDialog appCompatDialog = this.m_dialog;
        if (appCompatDialog != null) {
            appCompatDialog.dismiss();
            this.m_dialog = null;
        }
        if (activity != null) {
            Intent intent = new Intent(activity, AddConditionActivity.class);
            intent.putExtra("MacroId", this.m_macro.getId());
            intent.putExtra("ParentGUID", mo27847f1());
            activity.startActivityForResult(intent, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m10161E3(Constraint constraint, View view) {
        if (this.m_macro.getActions() != null && this.m_macro.getActions().size() > 0) {
            m10164H3(constraint);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m10162F3(String[] strArr, Activity activity, Constraint constraint, DialogInterface dialogInterface, int i) {
        String str = strArr[i];
        if (str.equals(SelectableItem.m15535j1(C17541R$string.add_constraint))) {
            Intent intent = new Intent(activity, AddConditionActivity.class);
            intent.putExtra("MacroId", this.m_macro.getId());
            intent.putExtra("ParentGUID", constraint.mo27847f1());
            activity.startActivityForResult(intent, 0);
        } else if (str.equals(SelectableItem.m15535j1(C17541R$string.configure))) {
            constraint.mo24687G2(this.m_macro);
            constraint.mo27877y2(activity);
            constraint.mo25540W1();
            this.selectedConstraint = constraint;
        } else if (str.equals(SelectableItem.m15535j1(C17541R$string.help))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle((CharSequence) constraint.mo25559a1());
            if (constraint.mo24673T0().mo27902t()) {
                builder.setMessage((CharSequence) C4061t1.m16007n(mo27827K0(), mo27827K0().getString(constraint.mo24673T0().mo27891f())));
            } else {
                builder.setMessage((CharSequence) constraint.mo25557Q0());
            }
            builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) null);
            builder.show();
        } else if (str.equals(SelectableItem.m15535j1(C17541R$string.delete))) {
            if (mo27826J0().contains(constraint)) {
                mo27843d2(constraint);
            } else {
                for (Constraint s3 : mo27826J0()) {
                    m10173s3(s3, constraint);
                }
            }
            mo24876r3();
        }
    }

    /* renamed from: G3 */
    private void m10163G3(Constraint constraint, View view, boolean z, int i, boolean z2) {
        View view2 = view;
        int i2 = i;
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(C17532R$id.topLevelExtrasContainer);
        ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(C17532R$id.constraintContainer);
        View findViewById = view2.findViewById(C17532R$id.constraintLinkUnderAction);
        View findViewById2 = view2.findViewById(C17532R$id.macro_edit_entry_extras_joiner);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin += i2;
        findViewById.setLayoutParams(layoutParams);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(z2 ? 0 : 8);
        viewGroup2.removeAllViews();
        Activity j0 = mo27850j0();
        int i3 = 0;
        for (Constraint next : constraint.mo27826J0()) {
            boolean z3 = true;
            i3++;
            View inflate = j0.getLayoutInflater().inflate(C17535R$layout.macro_edit_entry, viewGroup2, false);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            layoutParams2.leftMargin = i2;
            inflate.setLayoutParams(layoutParams2);
            m10174u3(inflate, next, i3 == constraint.mo27826J0().size(), false, z);
            viewGroup2.addView(inflate);
            if (next.mo27826J0() != null && next.mo27826J0().size() > 0) {
                int i4 = this.m_childLevelOffset;
                if (i3 >= constraint.mo27826J0().size()) {
                    z3 = false;
                }
                m10163G3(next, inflate, z, i4, z3);
            }
        }
        viewGroup.setVisibility(0);
        viewGroup2.setVisibility(0);
    }

    /* renamed from: H3 */
    private void m10164H3(Constraint constraint) {
        if (mo27836X()) {
            this.selectedConstraint = null;
            String[] strArr = constraint instanceof LogicConstraint ? new String[]{SelectableItem.m15535j1(C17541R$string.add_constraint), SelectableItem.m15535j1(C17541R$string.configure), SelectableItem.m15535j1(C17541R$string.delete), SelectableItem.m15535j1(C17541R$string.help)} : new String[]{SelectableItem.m15535j1(C17541R$string.configure), SelectableItem.m15535j1(C17541R$string.delete), SelectableItem.m15535j1(C17541R$string.help)};
            Activity j0 = mo27850j0();
            AlertDialog.Builder builder = new AlertDialog.Builder(j0);
            builder.setTitle((CharSequence) constraint.mo27831M0()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3504u2(this, strArr, j0, constraint));
            builder.create().show();
        }
    }

    /* renamed from: s3 */
    private boolean m10173s3(Constraint constraint, Constraint constraint2) {
        if (constraint.mo27826J0() == null) {
            return false;
        }
        for (Constraint next : constraint.mo27826J0()) {
            if (constraint2 == next) {
                constraint.mo27843d2(next);
                return true;
            } else if (m10173s3(next, constraint2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u3 */
    private void m10174u3(View view, Constraint constraint, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) view.findViewById(C17532R$id.macro_edit_entry_icon);
        TextView textView = (TextView) view.findViewById(C17532R$id.macro_edit_entry_name);
        TextView textView2 = (TextView) view.findViewById(C17532R$id.macro_edit_entry_detail);
        View findViewById = view.findViewById(C17532R$id.start_spacing);
        imageView.setImageDrawable(mo27850j0().getResources().getDrawable(constraint.mo25558S0()));
        imageView.setVisibility(0);
        textView.setText(constraint.mo27831M0());
        textView.setGravity(8388627);
        if (z3) {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_constraint_dark);
        } else {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_constraint);
        }
        findViewById.setVisibility(0);
        if (!z2) {
            view.setOnClickListener(new C3640z2(this, constraint));
        }
        if (z) {
            findViewById.setBackgroundResource(C17530R$drawable.constraint_link_end);
        } else {
            findViewById.setBackgroundResource(C17530R$drawable.constraint_link_joiner);
        }
        if (constraint.mo24672O0() == null || constraint.mo24672O0().length() <= 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(constraint.mo24672O0());
    }

    /* renamed from: v3 */
    private List<Action> m10175v3() {
        ArrayList arrayList = new ArrayList();
        Macro X0 = mo27837X0();
        if (X0 == null) {
            return arrayList;
        }
        ArrayList<Action> actions = X0.getActions();
        int indexOf = actions.indexOf(this);
        int i = 0;
        if (this instanceof IfConditionAction) {
            i = C6416p0.m24705b(actions, indexOf);
        } else if (this instanceof LoopAction) {
            i = C6416p0.m24706c(actions, indexOf);
        }
        while (true) {
            indexOf++;
            if (indexOf >= i) {
                return arrayList;
            }
            arrayList.add(actions.get(indexOf));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m10176z3(Constraint constraint, View view) {
        m10164H3(constraint);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        for (Constraint M1 : mo27826J0()) {
            if (!M1.mo24824M1()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.setActionBeingConfigured((Action) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
        for (Constraint U2 : mo27826J0()) {
            U2.mo28113U2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        for (Constraint W2 : mo27826J0()) {
            W2.mo28114W2();
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == 0) {
            Constraint constraint = this.selectedConstraint;
            if (constraint != null) {
                constraint.mo24713q1(activity, i, i2, intent);
            }
            mo27877y2(activity);
            mo24877t3(false, false);
            mo24876r3();
            return;
        }
        Constraint constraint2 = this.selectedConstraint;
        if (constraint2 != null) {
            constraint2.mo24713q1(activity, i, i2, intent);
        }
    }

    /* renamed from: r3 */
    public void mo24876r3() {
        ViewGroup viewGroup;
        int i;
        if (this.m_dialog != null && mo27836X()) {
            Spinner spinner = (Spinner) this.m_dialog.findViewById(C17532R$id.conditions_and_or_selection);
            Button button = (Button) this.m_dialog.findViewById(C17532R$id.okButton);
            LinearLayout linearLayout = (LinearLayout) this.m_dialog.findViewById(C17532R$id.conditions_layout);
            linearLayout.removeAllViews();
            int i2 = 1;
            int i3 = 0;
            spinner.setVisibility(mo27826J0().size() > 1 ? 0 : 4);
            button.setEnabled(mo27826J0().size() > 0);
            Activity j0 = mo27850j0();
            int size = mo27826J0().size();
            int i4 = C17532R$id.macro_edit_entry_icon;
            int i5 = C17532R$id.macro_edit_entry_detail;
            int i6 = 8;
            if (size == 0) {
                ViewGroup viewGroup2 = (ViewGroup) j0.getLayoutInflater().inflate(C17535R$layout.macro_edit_entry, (ViewGroup) null);
                TextView textView = (TextView) viewGroup2.findViewById(C17532R$id.macro_edit_entry_name);
                textView.setText("[" + SelectableItem.m15535j1(C17541R$string.no_conditions) + "]");
                textView.setGravity(17);
                int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.no_constraints_padding);
                textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                ((ImageView) viewGroup2.findViewById(C17532R$id.macro_edit_entry_icon)).setVisibility(8);
                ((TextView) viewGroup2.findViewById(C17532R$id.macro_edit_entry_detail)).setVisibility(8);
                linearLayout.addView(viewGroup2);
                return;
            }
            int i7 = 0;
            while (i7 < mo27826J0().size()) {
                ViewGroup viewGroup3 = (ViewGroup) j0.getLayoutInflater().inflate(C17535R$layout.macro_edit_entry, (ViewGroup) null);
                TextView textView2 = (TextView) viewGroup3.findViewById(C17532R$id.macro_edit_entry_name);
                TextView textView3 = (TextView) viewGroup3.findViewById(i5);
                ImageView imageView = (ImageView) viewGroup3.findViewById(i4);
                if (i7 >= i2) {
                    linearLayout.addView(j0.getLayoutInflater().inflate(C17535R$layout.divider, (ViewGroup) null));
                }
                ImageView imageView2 = (ImageView) viewGroup3.findViewById(C17532R$id.macro_edit_warning_icon);
                viewGroup3.setTag(mo27826J0().get(i7));
                imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_condition);
                imageView.setImageDrawable(j0.getResources().getDrawable(mo27826J0().get(i7).mo25558S0()));
                imageView.setVisibility(i3);
                textView2.setText(mo27826J0().get(i7).mo27831M0());
                textView2.setGravity(8388627);
                Constraint constraint = mo27826J0().get(i7);
                viewGroup3.setTag(constraint);
                if (constraint.mo24824M1()) {
                    imageView2.setVisibility(i6);
                } else {
                    imageView2.setVisibility(i3);
                }
                if (constraint.mo24672O0() == null || constraint.mo24672O0().length() <= 0) {
                    textView3.setVisibility(i6);
                } else {
                    textView3.setVisibility(i3);
                    textView3.setText(mo27826J0().get(i7).mo24672O0());
                }
                viewGroup3.setOnClickListener(new C3613y2(this, constraint));
                if (constraint.mo27826J0() == null || constraint.mo27826J0().size() <= 0) {
                    viewGroup = viewGroup3;
                    i = i7;
                } else {
                    viewGroup = viewGroup3;
                    i = i7;
                    m10163G3(constraint, viewGroup3, true, 0, false);
                }
                linearLayout.addView(viewGroup);
                i7 = i + 1;
                i6 = 8;
                i2 = 1;
                i3 = 0;
                i4 = C17532R$id.macro_edit_entry_icon;
                i5 = C17532R$id.macro_edit_entry_detail;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t3 */
    public void mo24877t3(boolean z, boolean z2) {
        Activity j0 = mo27850j0();
        if (z && this.m_originalConstraintList == null) {
            this.m_originalConstraintList = new ArrayList();
            for (Constraint S2 : mo27826J0()) {
                Constraint S22 = S2.mo28112S2();
                S22.mo24687G2(mo27837X0());
                this.m_originalConstraintList.add(S22);
            }
        }
        if (mo27836X()) {
            Macro macro = this.m_macro;
            if (macro != null) {
                macro.setActionBeingConfigured(this);
            }
            AppCompatDialog appCompatDialog = this.m_dialog;
            if (appCompatDialog != null && appCompatDialog.isShowing()) {
                try {
                    this.m_dialog.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            if (z2) {
                this.tempIsOrCondition = mo27825I0();
            }
            AppCompatDialog appCompatDialog2 = new AppCompatDialog(j0, mo24688L0());
            this.m_dialog = appCompatDialog2;
            appCompatDialog2.setContentView((int) C17535R$layout.dialog_parent_condition_configure);
            this.m_dialog.setTitle((CharSequence) mo25559a1());
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.m_dialog.getWindow().getAttributes());
            layoutParams.width = -1;
            this.m_dialog.getWindow().setAttributes(layoutParams);
            this.m_childLevelOffset = j0.getResources().getDimensionPixelOffset(C17529R$dimen.constraint_level_offset);
            Spinner spinner = (Spinner) this.m_dialog.findViewById(C17532R$id.conditions_and_or_selection);
            ((TextView) this.m_dialog.findViewById(C17532R$id.dialog_parent_condition_detail_text)).setText(mo24878w3());
            ArrayList arrayList = new ArrayList();
            arrayList.add(SelectableItem.m15535j1(C17541R$string.and));
            arrayList.add(SelectableItem.m15535j1(C17541R$string.f7057or));
            ArrayAdapter arrayAdapter = new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item_white_text, arrayList);
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
            spinner.setSelection(this.tempIsOrCondition ? 1 : 0);
            spinner.setOnItemSelectedListener(new C2372a());
            mo24876r3();
            ((Button) this.m_dialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3559w2(this));
            ((Button) this.m_dialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3531v2(this));
            this.m_dialog.setOnCancelListener(new C3468t2(this));
            ((ImageButton) this.m_dialog.findViewById(C17532R$id.conditons_add_condition_button)).setOnClickListener(new C3586x2(this, j0));
            this.m_dialog.setCanceledOnTouchOutside(false);
            this.m_dialog.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w3 */
    public abstract String mo24878w3();

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: x3 */
    public SpannableString mo24875V0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mo24880y3());
        spannableStringBuilder.append("{");
        List<Action> v3 = m10175v3();
        int size = v3.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Action action = v3.get(i);
            if (z) {
                if (action instanceof EndParentAction) {
                    z = false;
                }
            } else if (action instanceof ElseAction) {
                if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append("} ");
                spannableStringBuilder.append(SelectableItem.m15535j1(C17541R$string.action_if_else));
                spannableStringBuilder.append(" {");
            } else if (action instanceof ElseIfConditionAction) {
                if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append("} ");
                spannableStringBuilder.append(((ElseIfConditionAction) action).mo24880y3());
                spannableStringBuilder.append(" {");
            } else if (action instanceof ParentAction) {
                spannableStringBuilder.append(action.mo24674U0());
                z = true;
            } else {
                String U0 = action.mo24674U0();
                if (action.mo27822G1()) {
                    spannableStringBuilder.append(U0);
                } else {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(U0);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo27850j0() != null ? mo27850j0() : mo27827K0(), C17528R$color.disabled_action_color)), length, spannableStringBuilder.length(), 33);
                }
                if (i < size - 1) {
                    spannableStringBuilder.append(", ");
                }
            }
        }
        spannableStringBuilder.append("}");
        return SpannableString.valueOf(spannableStringBuilder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public abstract String mo24880y3();

    ConditionAction(Parcel parcel) {
        super(parcel);
    }
}
