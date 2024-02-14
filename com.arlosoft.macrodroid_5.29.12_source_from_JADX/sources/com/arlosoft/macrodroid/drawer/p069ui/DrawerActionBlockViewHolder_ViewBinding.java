package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerActionBlockViewHolder_ViewBinding */
public class DrawerActionBlockViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerActionBlockViewHolder f11345a;

    /* renamed from: b */
    private View f11346b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerActionBlockViewHolder_ViewBinding$a */
    class C4460a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerActionBlockViewHolder f11347a;

        C4460a(DrawerActionBlockViewHolder drawerActionBlockViewHolder) {
            this.f11347a = drawerActionBlockViewHolder;
        }

        public void doClick(View view) {
            this.f11347a.handleClick();
        }
    }

    @UiThread
    public DrawerActionBlockViewHolder_ViewBinding(DrawerActionBlockViewHolder drawerActionBlockViewHolder, View view) {
        this.f11345a = drawerActionBlockViewHolder;
        drawerActionBlockViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerActionBlockViewHolder.actionBlockName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.action_block_name, "field 'actionBlockName'", TextView.class);
        drawerActionBlockViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.macro_container, "method 'handleClick'");
        this.f11346b = findRequiredView;
        findRequiredView.setOnClickListener(new C4460a(drawerActionBlockViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerActionBlockViewHolder drawerActionBlockViewHolder = this.f11345a;
        if (drawerActionBlockViewHolder != null) {
            this.f11345a = null;
            drawerActionBlockViewHolder.icon = null;
            drawerActionBlockViewHolder.actionBlockName = null;
            drawerActionBlockViewHolder.dragHandle = null;
            this.f11346b.setOnClickListener((View.OnClickListener) null);
            this.f11346b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
