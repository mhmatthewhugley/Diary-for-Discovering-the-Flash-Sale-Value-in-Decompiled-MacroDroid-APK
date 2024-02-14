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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOpenShortcutViewHolder_ViewBinding */
public class DrawerOpenShortcutViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerOpenShortcutViewHolder f11367a;

    /* renamed from: b */
    private View f11368b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerOpenShortcutViewHolder_ViewBinding$a */
    class C4467a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerOpenShortcutViewHolder f11369a;

        C4467a(DrawerOpenShortcutViewHolder drawerOpenShortcutViewHolder) {
            this.f11369a = drawerOpenShortcutViewHolder;
        }

        public void doClick(View view) {
            this.f11369a.handleClick();
        }
    }

    @UiThread
    public DrawerOpenShortcutViewHolder_ViewBinding(DrawerOpenShortcutViewHolder drawerOpenShortcutViewHolder, View view) {
        this.f11367a = drawerOpenShortcutViewHolder;
        drawerOpenShortcutViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerOpenShortcutViewHolder.appName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.app_name, "field 'appName'", TextView.class);
        drawerOpenShortcutViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.macro_container, "method 'handleClick'");
        this.f11368b = findRequiredView;
        findRequiredView.setOnClickListener(new C4467a(drawerOpenShortcutViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerOpenShortcutViewHolder drawerOpenShortcutViewHolder = this.f11367a;
        if (drawerOpenShortcutViewHolder != null) {
            this.f11367a = null;
            drawerOpenShortcutViewHolder.icon = null;
            drawerOpenShortcutViewHolder.appName = null;
            drawerOpenShortcutViewHolder.dragHandle = null;
            this.f11368b.setOnClickListener((View.OnClickListener) null);
            this.f11368b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
