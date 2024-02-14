package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17528R$color;
import p149q1.C8153b;
import p149q1.C8159h;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerSeparatorViewHolder */
public class DrawerSeparatorViewHolder extends C4490d {
    @BindView(2131362592)
    ImageView dragHandle;

    public DrawerSeparatorViewHolder(@NonNull View view, C4481a aVar) {
        super(view, aVar);
        ButterKnife.bind((Object) this, view);
        mo28887F(ContextCompat.getColor(mo28895x(), C17528R$color.drawer_text_color));
    }

    /* renamed from: D */
    public void mo28843D(@NonNull C8153b bVar, boolean z) {
        super.mo28843D(bVar, z);
        if (!(bVar instanceof C8159h)) {
            throw new IllegalArgumentException("DrawerItemSeparator required");
        } else if (z) {
            this.dragHandle.setVisibility(0);
            mo28890I(this.dragHandle);
        } else {
            this.dragHandle.setVisibility(8);
        }
    }
}
