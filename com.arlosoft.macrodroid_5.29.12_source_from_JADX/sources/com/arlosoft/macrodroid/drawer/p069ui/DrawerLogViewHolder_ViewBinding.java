package com.arlosoft.macrodroid.drawer.p069ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder_ViewBinding */
public final class DrawerLogViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerLogViewHolder f11356a;

    /* renamed from: b */
    private View f11357b;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerLogViewHolder_ViewBinding$a */
    class C4465a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerLogViewHolder f11358a;

        C4465a(DrawerLogViewHolder drawerLogViewHolder) {
            this.f11358a = drawerLogViewHolder;
        }

        public void doClick(View view) {
            this.f11358a.handleClick();
        }
    }

    @UiThread
    public DrawerLogViewHolder_ViewBinding(DrawerLogViewHolder drawerLogViewHolder, View view) {
        this.f11356a = drawerLogViewHolder;
        drawerLogViewHolder.logText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.log_text, "field 'logText'", TextView.class);
        drawerLogViewHolder.title = (TextView) Utils.findRequiredViewAsType(view, 2131364038, "field 'title'", TextView.class);
        drawerLogViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.log_container, "method 'handleClick'");
        this.f11357b = findRequiredView;
        findRequiredView.setOnClickListener(new C4465a(drawerLogViewHolder));
    }

    public void unbind() {
        DrawerLogViewHolder drawerLogViewHolder = this.f11356a;
        if (drawerLogViewHolder != null) {
            this.f11356a = null;
            drawerLogViewHolder.logText = null;
            drawerLogViewHolder.title = null;
            drawerLogViewHolder.dragHandle = null;
            this.f11357b.setOnClickListener((View.OnClickListener) null);
            this.f11357b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
