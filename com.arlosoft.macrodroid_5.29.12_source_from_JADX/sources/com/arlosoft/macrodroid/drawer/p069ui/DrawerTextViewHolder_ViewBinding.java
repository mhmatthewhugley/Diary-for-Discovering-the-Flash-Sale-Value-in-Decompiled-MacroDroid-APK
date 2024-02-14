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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerTextViewHolder_ViewBinding */
public class DrawerTextViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerTextViewHolder f11408a;

    /* renamed from: b */
    private View f11409b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerTextViewHolder_ViewBinding$a */
    class C4478a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerTextViewHolder f11410a;

        C4478a(DrawerTextViewHolder drawerTextViewHolder) {
            this.f11410a = drawerTextViewHolder;
        }

        public void doClick(View view) {
            this.f11410a.handleClick();
        }
    }

    @UiThread
    public DrawerTextViewHolder_ViewBinding(DrawerTextViewHolder drawerTextViewHolder, View view) {
        this.f11408a = drawerTextViewHolder;
        drawerTextViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerTextViewHolder.text = (TextView) Utils.findRequiredViewAsType(view, 2131363972, "field 'text'", TextView.class);
        drawerTextViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.macro_container, "method 'handleClick'");
        this.f11409b = findRequiredView;
        findRequiredView.setOnClickListener(new C4478a(drawerTextViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerTextViewHolder drawerTextViewHolder = this.f11408a;
        if (drawerTextViewHolder != null) {
            this.f11408a = null;
            drawerTextViewHolder.icon = null;
            drawerTextViewHolder.text = null;
            drawerTextViewHolder.dragHandle = null;
            this.f11409b.setOnClickListener((View.OnClickListener) null);
            this.f11409b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
