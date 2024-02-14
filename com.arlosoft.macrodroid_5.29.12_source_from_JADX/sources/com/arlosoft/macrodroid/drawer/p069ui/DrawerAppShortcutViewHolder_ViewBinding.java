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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerAppShortcutViewHolder_ViewBinding */
public class DrawerAppShortcutViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerAppShortcutViewHolder f11350a;

    /* renamed from: b */
    private View f11351b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerAppShortcutViewHolder_ViewBinding$a */
    class C4461a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerAppShortcutViewHolder f11352a;

        C4461a(DrawerAppShortcutViewHolder drawerAppShortcutViewHolder) {
            this.f11352a = drawerAppShortcutViewHolder;
        }

        public void doClick(View view) {
            this.f11352a.handleClick();
        }
    }

    @UiThread
    public DrawerAppShortcutViewHolder_ViewBinding(DrawerAppShortcutViewHolder drawerAppShortcutViewHolder, View view) {
        this.f11350a = drawerAppShortcutViewHolder;
        drawerAppShortcutViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerAppShortcutViewHolder.appName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.app_name, "field 'appName'", TextView.class);
        drawerAppShortcutViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.macro_container, "method 'handleClick'");
        this.f11351b = findRequiredView;
        findRequiredView.setOnClickListener(new C4461a(drawerAppShortcutViewHolder));
    }

    @CallSuper
    public void unbind() {
        DrawerAppShortcutViewHolder drawerAppShortcutViewHolder = this.f11350a;
        if (drawerAppShortcutViewHolder != null) {
            this.f11350a = null;
            drawerAppShortcutViewHolder.icon = null;
            drawerAppShortcutViewHolder.appName = null;
            drawerAppShortcutViewHolder.dragHandle = null;
            this.f11351b.setOnClickListener((View.OnClickListener) null);
            this.f11351b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
