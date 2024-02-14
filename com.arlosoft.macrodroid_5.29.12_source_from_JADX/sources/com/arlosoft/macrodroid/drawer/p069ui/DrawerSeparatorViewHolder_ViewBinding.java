package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerSeparatorViewHolder_ViewBinding */
public class DrawerSeparatorViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerSeparatorViewHolder f11397a;

    @UiThread
    public DrawerSeparatorViewHolder_ViewBinding(DrawerSeparatorViewHolder drawerSeparatorViewHolder, View view) {
        this.f11397a = drawerSeparatorViewHolder;
        drawerSeparatorViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        DrawerSeparatorViewHolder drawerSeparatorViewHolder = this.f11397a;
        if (drawerSeparatorViewHolder != null) {
            this.f11397a = null;
            drawerSeparatorViewHolder.dragHandle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
