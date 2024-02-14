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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerMacroViewHolder_ViewBinding */
public class DrawerMacroViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerMacroViewHolder f11362a;

    /* renamed from: b */
    private View f11363b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerMacroViewHolder_ViewBinding$a */
    class C4466a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerMacroViewHolder f11364a;

        C4466a(DrawerMacroViewHolder drawerMacroViewHolder) {
            this.f11364a = drawerMacroViewHolder;
        }

        public void doClick(View view) {
            this.f11364a.handleClick();
        }
    }

    @UiThread
    public DrawerMacroViewHolder_ViewBinding(DrawerMacroViewHolder drawerMacroViewHolder, View view) {
        this.f11362a = drawerMacroViewHolder;
        drawerMacroViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerMacroViewHolder.macroName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macro_name, "field 'macroName'", TextView.class);
        drawerMacroViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.macro_container, "method 'handleClick'");
        this.f11363b = findRequiredView;
        findRequiredView.setOnClickListener(new C4466a(drawerMacroViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerMacroViewHolder drawerMacroViewHolder = this.f11362a;
        if (drawerMacroViewHolder != null) {
            this.f11362a = null;
            drawerMacroViewHolder.icon = null;
            drawerMacroViewHolder.macroName = null;
            drawerMacroViewHolder.dragHandle = null;
            this.f11363b.setOnClickListener((View.OnClickListener) null);
            this.f11363b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
