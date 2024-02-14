package com.arlosoft.macrodroid.geofences;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GeofenceListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GeofenceListActivity f11827a;

    /* renamed from: b */
    private View f11828b;

    /* renamed from: com.arlosoft.macrodroid.geofences.GeofenceListActivity_ViewBinding$a */
    class C4705a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeofenceListActivity f11829a;

        C4705a(GeofenceListActivity geofenceListActivity) {
            this.f11829a = geofenceListActivity;
        }

        public void doClick(View view) {
            this.f11829a.addGeofenceButtonClick();
        }
    }

    @UiThread
    public GeofenceListActivity_ViewBinding(GeofenceListActivity geofenceListActivity, View view) {
        this.f11827a = geofenceListActivity;
        geofenceListActivity.emptyView = Utils.findRequiredView(view, C17532R$id.geofences_emptyView, "field 'emptyView'");
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.geofence_add_button, "field 'addGeofenceButton' and method 'addGeofenceButtonClick'");
        geofenceListActivity.addGeofenceButton = (FloatingActionButton) Utils.castView(findRequiredView, C17532R$id.geofence_add_button, "field 'addGeofenceButton'", FloatingActionButton.class);
        this.f11828b = findRequiredView;
        findRequiredView.setOnClickListener(new C4705a(geofenceListActivity));
        geofenceListActivity.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, 2131363593, "field 'recyclerView'", RecyclerView.class);
        geofenceListActivity.infoCardView = (CardView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardView, "field 'infoCardView'", CardView.class);
        geofenceListActivity.infoCardTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'infoCardTitle'", TextView.class);
        geofenceListActivity.infoCardDetail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'infoCardDetail'", TextView.class);
        geofenceListActivity.infoCardGotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'infoCardGotIt'", Button.class);
    }

    @CallSuper
    public void unbind() {
        GeofenceListActivity geofenceListActivity = this.f11827a;
        if (geofenceListActivity != null) {
            this.f11827a = null;
            geofenceListActivity.emptyView = null;
            geofenceListActivity.addGeofenceButton = null;
            geofenceListActivity.recyclerView = null;
            geofenceListActivity.infoCardView = null;
            geofenceListActivity.infoCardTitle = null;
            geofenceListActivity.infoCardDetail = null;
            geofenceListActivity.infoCardGotIt = null;
            this.f11828b.setOnClickListener((View.OnClickListener) null);
            this.f11828b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
