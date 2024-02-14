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
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Collections;
import java.util.Stack;
import p149q1.C8153b;
import p149q1.C8154c;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerActionBlockViewHolder */
public class DrawerActionBlockViewHolder extends C4490d {
    @BindView(2131361871)
    TextView actionBlockName;
    @BindView(2131362592)
    ImageView dragHandle;

    /* renamed from: e */
    private ActionBlock f11343e;

    /* renamed from: f */
    private C8154c f11344f;
    @BindView(2131362906)
    ImageView icon;

    public DrawerActionBlockViewHolder(@NonNull View view, C4481a aVar, int i) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        this.actionBlockName.setTextSize(2, (float) i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public TextView[] mo28842A() {
        return new TextView[]{this.actionBlockName};
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (bVar instanceof C8154c) {
            this.icon.setVisibility(bVar.hideIcon() ? 8 : 0);
            this.f11344f = (C8154c) bVar;
            mo28888G(this.icon, bVar, C17530R$drawable.launcher_no_border);
            mo28887F(this.f11344f.getColor());
            this.f11343e = C4934n.m18998M().mo29649g(this.f11344f.getActionBlockGuid());
            this.actionBlockName.setText(this.f11344f.getName());
            if (z) {
                this.dragHandle.setVisibility(0);
                mo28890I(this.dragHandle);
                return;
            }
            this.dragHandle.setVisibility(8);
            return;
        }
        throw new IllegalArgumentException("DrawerItemActionBlock required");
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363108})
    public void handleClick() {
        if (this.f11343e.isValid()) {
            mo28894w();
            C4878b.m18873l("Invoking action block from drawer: " + this.f11343e.getName());
            ActionBlock cloneActionBlock = this.f11343e.cloneActionBlock(false);
            cloneActionBlock.setIsClonedInstance(true);
            C4934n.m18998M().mo29647e(cloneActionBlock);
            cloneActionBlock.invokeActions((TriggerContextInfo) null, true, new ResumeMacroInfo(cloneActionBlock.getGUID(), -1, (TriggerContextInfo) null, true, new Stack(), (ResumeMacroInfo) null, this.f11344f.getActionBlockData().mo27087f()), this.f11344f.getActionBlockData().mo27085e(), Collections.emptyMap(), (Macro) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ImageView[] mo28845z() {
        return new ImageView[]{this.icon};
    }
}
