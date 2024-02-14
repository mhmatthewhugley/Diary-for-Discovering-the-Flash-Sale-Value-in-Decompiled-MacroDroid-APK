package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByDrawerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p149q1.C8153b;
import p149q1.C8157f;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerMacroViewHolder */
public class DrawerMacroViewHolder extends C4490d {
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private Macro f11360e;

    /* renamed from: f */
    private C8157f f11361f;
    @BindView(2131362906)
    ImageView icon;
    @BindView(2131363121)
    TextView macroName;

    public DrawerMacroViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        this.macroName.setTextSize(2, (float) i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.macroName};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (bVar instanceof C8157f) {
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            this.f11361f = (C8157f) bVar;
            mo28888G(this.icon, bVar, C17530R$drawable.launcher_no_border);
            mo28887F(this.f11361f.getColor());
            this.f11360e = C4934n.m18998M().mo29682Q(this.f11361f.getMacroGuid());
            this.macroName.setText(this.f11361f.getName());
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
                return;
            }
            this.dragHandle.setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemMacro required");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363108})
    public void handleClick() {
        if (this.f11361f.isValid()) {
            TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) InvokedByDrawerTrigger.m22465g3());
            if (!this.f11361f.getEnforceConstraints() || this.f11360e.canInvoke(triggerContextInfo)) {
                mo28894w();
                C4878b.m18873l("Invoking macro from drawer: " + this.f11360e.getName());
                this.f11360e.setTriggerThatInvoked(InvokedByDrawerTrigger.m22465g3());
                this.f11360e.invokeActions(new TriggerContextInfo(""));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
