package com.arlosoft.macrodroid.macrolist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.varunest.sparkbutton.SparkButton2;
import net.cachapa.expandablelayout.ExpandableLayout;

public class MacroListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MacroListFragment f12489a;

    @UiThread
    public MacroListFragment_ViewBinding(MacroListFragment macroListFragment, View view) {
        this.f12489a = macroListFragment;
        macroListFragment.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        macroListFragment.emptyView = Utils.findRequiredView(view, C17532R$id.macrolist_emptyView, "field 'emptyView'");
        macroListFragment.emptyTextView = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macrolist_emptyLabel, "field 'emptyTextView'", TextView.class);
        macroListFragment.toolbar = (Toolbar) Utils.findRequiredViewAsType(view, 2131364057, "field 'toolbar'", Toolbar.class);
        macroListFragment.nearbySharePanel = (ExpandableLayout) Utils.findRequiredViewAsType(view, C17532R$id.nearbySharePanel, "field 'nearbySharePanel'", ExpandableLayout.class);
        macroListFragment.dismissButton = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.dismissButton, "field 'dismissButton'", ImageView.class);
        macroListFragment.titleText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.titleText, "field 'titleText'", TextView.class);
        macroListFragment.favouriteButton = (SparkButton2) Utils.findRequiredViewAsType(view, C17532R$id.favouriteButton, "field 'favouriteButton'", SparkButton2.class);
        macroListFragment.titleContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.titleContainer, "field 'titleContainer'", ViewGroup.class);
        macroListFragment.favouritesHint = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.favouritesHint, "field 'favouritesHint'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        MacroListFragment macroListFragment = this.f12489a;
        if (macroListFragment != null) {
            this.f12489a = null;
            macroListFragment.recyclerView = null;
            macroListFragment.emptyView = null;
            macroListFragment.emptyTextView = null;
            macroListFragment.toolbar = null;
            macroListFragment.nearbySharePanel = null;
            macroListFragment.dismissButton = null;
            macroListFragment.titleText = null;
            macroListFragment.favouriteButton = null;
            macroListFragment.titleContainer = null;
            macroListFragment.favouritesHint = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
