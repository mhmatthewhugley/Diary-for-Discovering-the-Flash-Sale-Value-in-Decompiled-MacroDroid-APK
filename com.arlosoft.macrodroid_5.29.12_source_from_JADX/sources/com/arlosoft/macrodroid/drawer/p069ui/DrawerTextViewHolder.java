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
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.InvokedByDrawerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import org.apache.commons.p353io.IOUtils;
import p149q1.C8153b;
import p149q1.C8161j;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerTextViewHolder */
public class DrawerTextViewHolder extends C4490d {
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private C8161j f11407e;
    @BindView(2131362906)
    ImageView icon;
    @BindView(2131363972)
    TextView text;

    public DrawerTextViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        this.text.setTextSize(2, (float) i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.text};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (bVar instanceof C8161j) {
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            this.f11407e = (C8161j) bVar;
            String replace = C4023j0.m15760t0(mo28895x(), this.f11407e.getText(), (TriggerContextInfo) null, (Macro) null).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
            mo28888G(this.icon, bVar, C17530R$drawable.ic_format_text_white_24dp);
            mo28887F(this.f11407e.getColor());
            this.text.setText(replace);
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
                return;
            }
            this.dragHandle.setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemText required");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363108})
    public void handleClick() {
        if (this.f11407e.getMacroGuid() != 0) {
            Macro Q = C4934n.m18998M().mo29682Q(this.f11407e.getMacroGuid());
            mo28894w();
            if (Q != null) {
                TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) InvokedByDrawerTrigger.m22465g3());
                if (!this.f11407e.getEnforceConstraints() || Q.canInvoke(triggerContextInfo)) {
                    Q.setTriggerThatInvoked(InvokedByDrawerTrigger.m22465g3());
                    Q.invokeActions(new TriggerContextInfo(""));
                    return;
                }
                return;
            }
            C15626c.makeText(mo28895x().getApplicationContext(), C17541R$string.macro_not_found, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
