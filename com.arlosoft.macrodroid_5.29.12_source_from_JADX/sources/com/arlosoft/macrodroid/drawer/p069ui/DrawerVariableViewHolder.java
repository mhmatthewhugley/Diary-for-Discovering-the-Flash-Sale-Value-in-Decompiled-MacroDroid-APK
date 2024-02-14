package com.arlosoft.macrodroid.drawer.p069ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import p149q1.C8153b;
import p149q1.C8162k;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerVariableViewHolder */
public class DrawerVariableViewHolder extends C4490d {
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private MacroDroidVariable f11414e;

    /* renamed from: f */
    private VariableValue f11415f;

    /* renamed from: g */
    private DictionaryKeys f11416g;

    /* renamed from: h */
    private C8162k f11417h;
    @BindView(2131362906)
    ImageView icon;
    @BindView(2131364207)
    TextView varName;
    @BindView(2131364208)
    TextView varValue;

    public DrawerVariableViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        float f = (float) i;
        this.varName.setTextSize(2, f);
        this.varValue.setTextSize(2, f);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.varName, this.varValue};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        VariableValue.DictionaryEntry o;
        super.mo28843D(bVar, z);
        if (bVar instanceof C8162k) {
            int i = 8;
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            C8162k kVar = (C8162k) bVar;
            MacroDroidVariable w = C4064u.m16048t().mo27996w(kVar.getVariableName());
            this.f11414e = w;
            if (w != null) {
                this.f11415f = w.mo27746V();
                DictionaryKeys dictionaryKeys = kVar.getDictionaryKeys();
                this.f11416g = dictionaryKeys;
                if (!(dictionaryKeys == null || (o = this.f11414e.mo27771o(dictionaryKeys.getKeys())) == null)) {
                    this.f11415f = o.getVariable();
                }
            }
            this.f11417h = kVar;
            mo28888G(this.icon, bVar, C17530R$drawable.ic_help_white_24dp);
            mo28887F(this.f11417h.getColor());
            this.varName.setText(bVar.getName());
            this.varName.setVisibility(this.f11417h.getHideName() ? 8 : 0);
            mo28847E();
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
            } else {
                this.dragHandle.setVisibility(8);
            }
            boolean isValid = bVar.isValid();
            TextView textView = this.varValue;
            if (isValid) {
                i = 0;
            }
            textView.setVisibility(i);
            this.varName.setMaxWidth(isValid ? MacroDroidApplication.m14845u().getResources().getDimensionPixelSize(C17529R$dimen.max_var_name_width) : 9999);
            return;
        }
        throw new IllegalArgumentException("DrawerItemVariable required");
    }

    /* renamed from: E */
    public void mo28847E() {
        VariableValue.DictionaryEntry o;
        MacroDroidVariable macroDroidVariable = this.f11414e;
        if (macroDroidVariable != null) {
            this.f11415f = macroDroidVariable.mo27746V();
            DictionaryKeys dictionaryKeys = this.f11416g;
            if (!(dictionaryKeys == null || (o = this.f11414e.mo27771o(dictionaryKeys.getKeys())) == null)) {
                this.f11415f = o.getVariable();
            }
            VariableValue variableValue = this.f11415f;
            if (variableValue != null) {
                String valueAsText = variableValue.getValueAsText();
                if (TextUtils.isEmpty(valueAsText)) {
                    TextView textView = this.varValue;
                    textView.setText("<" + this.itemView.getContext().getString(C17541R$string.empty) + ">");
                    return;
                }
                this.varValue.setText(valueAsText);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131364248})
    public void onClicked() {
        if (this.f11417h.isValid()) {
            DrawerUpdateVariableActivity.m17745R1(this.itemView.getContext(), this.f11414e.getName(), this.f11416g);
            mo28894w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
