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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerVariableViewHolder_ViewBinding */
public class DrawerVariableViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerVariableViewHolder f11418a;

    /* renamed from: b */
    private View f11419b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerVariableViewHolder_ViewBinding$a */
    class C4480a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerVariableViewHolder f11420a;

        C4480a(DrawerVariableViewHolder drawerVariableViewHolder) {
            this.f11420a = drawerVariableViewHolder;
        }

        public void doClick(View view) {
            this.f11420a.onClicked();
        }
    }

    @UiThread
    public DrawerVariableViewHolder_ViewBinding(DrawerVariableViewHolder drawerVariableViewHolder, View view) {
        this.f11418a = drawerVariableViewHolder;
        drawerVariableViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerVariableViewHolder.varName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.var_name, "field 'varName'", TextView.class);
        drawerVariableViewHolder.varValue = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.var_value, "field 'varValue'", TextView.class);
        drawerVariableViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.variable_container, "method 'onClicked'");
        this.f11419b = findRequiredView;
        findRequiredView.setOnClickListener(new C4480a(drawerVariableViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerVariableViewHolder drawerVariableViewHolder = this.f11418a;
        if (drawerVariableViewHolder != null) {
            this.f11418a = null;
            drawerVariableViewHolder.icon = null;
            drawerVariableViewHolder.varName = null;
            drawerVariableViewHolder.varValue = null;
            drawerVariableViewHolder.dragHandle = null;
            this.f11419b.setOnClickListener((View.OnClickListener) null);
            this.f11419b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
