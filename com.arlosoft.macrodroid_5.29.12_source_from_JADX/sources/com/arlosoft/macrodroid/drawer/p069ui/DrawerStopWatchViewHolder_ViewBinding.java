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

/* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerStopWatchViewHolder_ViewBinding */
public class DrawerStopWatchViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DrawerStopWatchViewHolder f11400a;

    /* renamed from: b */
    private View f11401b;

    /* renamed from: c */
    private View f11402c;

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerStopWatchViewHolder_ViewBinding$a */
    class C4476a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerStopWatchViewHolder f11403a;

        C4476a(DrawerStopWatchViewHolder drawerStopWatchViewHolder) {
            this.f11403a = drawerStopWatchViewHolder;
        }

        public void doClick(View view) {
            this.f11403a.onPlayPauseClicked();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.ui.DrawerStopWatchViewHolder_ViewBinding$b */
    class C4477b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrawerStopWatchViewHolder f11405a;

        C4477b(DrawerStopWatchViewHolder drawerStopWatchViewHolder) {
            this.f11405a = drawerStopWatchViewHolder;
        }

        public void doClick(View view) {
            this.f11405a.onClearButton();
        }
    }

    @UiThread
    public DrawerStopWatchViewHolder_ViewBinding(DrawerStopWatchViewHolder drawerStopWatchViewHolder, View view) {
        this.f11400a = drawerStopWatchViewHolder;
        drawerStopWatchViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        drawerStopWatchViewHolder.stopWatchName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_name, "field 'stopWatchName'", TextView.class);
        drawerStopWatchViewHolder.stopWatchTime = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_time, "field 'stopWatchTime'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.play_pause_button, "field 'playPauseButton' and method 'onPlayPauseClicked'");
        drawerStopWatchViewHolder.playPauseButton = (ImageView) Utils.castView(findRequiredView, C17532R$id.play_pause_button, "field 'playPauseButton'", ImageView.class);
        this.f11401b = findRequiredView;
        findRequiredView.setOnClickListener(new C4476a(drawerStopWatchViewHolder));
        View findRequiredView2 = Utils.findRequiredView(view, C17532R$id.clear_button, "field 'clearButton' and method 'onClearButton'");
        drawerStopWatchViewHolder.clearButton = (ImageView) Utils.castView(findRequiredView2, C17532R$id.clear_button, "field 'clearButton'", ImageView.class);
        this.f11402c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C4477b(drawerStopWatchViewHolder));
        drawerStopWatchViewHolder.dragHandle = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.drag_handle, "field 'dragHandle'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        DrawerStopWatchViewHolder drawerStopWatchViewHolder = this.f11400a;
        if (drawerStopWatchViewHolder != null) {
            this.f11400a = null;
            drawerStopWatchViewHolder.icon = null;
            drawerStopWatchViewHolder.stopWatchName = null;
            drawerStopWatchViewHolder.stopWatchTime = null;
            drawerStopWatchViewHolder.playPauseButton = null;
            drawerStopWatchViewHolder.clearButton = null;
            drawerStopWatchViewHolder.dragHandle = null;
            this.f11401b.setOnClickListener((View.OnClickListener) null);
            this.f11401b = null;
            this.f11402c.setOnClickListener((View.OnClickListener) null);
            this.f11402c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
