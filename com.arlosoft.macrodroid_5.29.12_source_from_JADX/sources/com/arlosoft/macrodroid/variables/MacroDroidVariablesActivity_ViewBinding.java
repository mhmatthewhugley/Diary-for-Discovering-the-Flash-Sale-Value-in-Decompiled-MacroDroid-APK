package com.arlosoft.macrodroid.variables;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

public class MacroDroidVariablesActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MacroDroidVariablesActivity f15099a;

    /* renamed from: b */
    private View f15100b;

    /* renamed from: c */
    private View f15101c;

    /* renamed from: com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity_ViewBinding$a */
    class C6469a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariablesActivity f15102a;

        C6469a(MacroDroidVariablesActivity macroDroidVariablesActivity) {
            this.f15102a = macroDroidVariablesActivity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f15102a.onLocalVariableCheckboxChanged(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity_ViewBinding$b */
    class C6470b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariablesActivity f15104a;

        C6470b(MacroDroidVariablesActivity macroDroidVariablesActivity) {
            this.f15104a = macroDroidVariablesActivity;
        }

        public void doClick(View view) {
            this.f15104a.onPlusButtonClicked();
        }
    }

    @UiThread
    public MacroDroidVariablesActivity_ViewBinding(MacroDroidVariablesActivity macroDroidVariablesActivity, View view) {
        this.f15099a = macroDroidVariablesActivity;
        macroDroidVariablesActivity.localVariableOptionLayout = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.local_variable_option_layout, "field 'localVariableOptionLayout'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.local_variable_checkbox, "field 'localVariableCheckbox' and method 'onLocalVariableCheckboxChanged'");
        macroDroidVariablesActivity.localVariableCheckbox = (CheckBox) Utils.castView(findRequiredView, C17532R$id.local_variable_checkbox, "field 'localVariableCheckbox'", CheckBox.class);
        this.f15100b = findRequiredView;
        ((CompoundButton) findRequiredView).setOnCheckedChangeListener(new C6469a(macroDroidVariablesActivity));
        macroDroidVariablesActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        macroDroidVariablesActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        macroDroidVariablesActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        macroDroidVariablesActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
        macroDroidVariablesActivity.m_list = (ListView) Utils.findRequiredViewAsType(view, C17532R$id.variables_activity_list, "field 'm_list'", ListView.class);
        macroDroidVariablesActivity.toolbar = (Toolbar) Utils.findRequiredViewAsType(view, 2131364057, "field 'toolbar'", Toolbar.class);
        macroDroidVariablesActivity.filterPanel = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.filterPanel, "field 'filterPanel'", ViewGroup.class);
        macroDroidVariablesActivity.rootContainer = (LinearLayout) Utils.findRequiredViewAsType(view, C17532R$id.rootContainer, "field 'rootContainer'", LinearLayout.class);
        macroDroidVariablesActivity.variableTypeSpinner = (Spinner) Utils.findRequiredViewAsType(view, C17532R$id.variableTypeSpinner, "field 'variableTypeSpinner'", Spinner.class);
        View findRequiredView2 = Utils.findRequiredView(view, C17532R$id.fab, "method 'onPlusButtonClicked'");
        this.f15101c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C6470b(macroDroidVariablesActivity));
    }

    @CallSuper
    public void unbind() {
        MacroDroidVariablesActivity macroDroidVariablesActivity = this.f15099a;
        if (macroDroidVariablesActivity != null) {
            this.f15099a = null;
            macroDroidVariablesActivity.localVariableOptionLayout = null;
            macroDroidVariablesActivity.localVariableCheckbox = null;
            macroDroidVariablesActivity.infoCardView = null;
            macroDroidVariablesActivity.infoCardTitle = null;
            macroDroidVariablesActivity.infoCardDetail = null;
            macroDroidVariablesActivity.infoCardGotIt = null;
            macroDroidVariablesActivity.m_list = null;
            macroDroidVariablesActivity.toolbar = null;
            macroDroidVariablesActivity.filterPanel = null;
            macroDroidVariablesActivity.rootContainer = null;
            macroDroidVariablesActivity.variableTypeSpinner = null;
            ((CompoundButton) this.f15100b).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.f15100b = null;
            this.f15101c.setOnClickListener((View.OnClickListener) null);
            this.f15101c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
