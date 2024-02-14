package com.arlosoft.macrodroid.geofences.p070ui;

import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;

/* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity_ViewBinding */
public class ConfigureZoneActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ConfigureZoneActivity f11878a;

    /* renamed from: b */
    private View f11879b;

    /* renamed from: c */
    private View f11880c;

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity_ViewBinding$a */
    class C4728a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConfigureZoneActivity f11881a;

        C4728a(ConfigureZoneActivity configureZoneActivity) {
            this.f11881a = configureZoneActivity;
        }

        public void doClick(View view) {
            this.f11881a.onRadiusTextClicked();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity_ViewBinding$b */
    class C4729b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConfigureZoneActivity f11883a;

        C4729b(ConfigureZoneActivity configureZoneActivity) {
            this.f11883a = configureZoneActivity;
        }

        public void doClick(View view) {
            this.f11883a.onSaveClicked();
        }
    }

    @UiThread
    public ConfigureZoneActivity_ViewBinding(ConfigureZoneActivity configureZoneActivity, View view) {
        this.f11878a = configureZoneActivity;
        configureZoneActivity.zoneName = (EditText) Utils.findRequiredViewAsType(view, C17532R$id.zone_name, "field 'zoneName'", EditText.class);
        configureZoneActivity.areaSeekBar = (SeekBar) Utils.findRequiredViewAsType(view, C17532R$id.area_seek_bar, "field 'areaSeekBar'", SeekBar.class);
        View findRequiredView = Utils.findRequiredView(view, C17532R$id.radius_value_text, "field 'radiusValueText' and method 'onRadiusTextClicked'");
        configureZoneActivity.radiusValueText = (TextView) Utils.castView(findRequiredView, C17532R$id.radius_value_text, "field 'radiusValueText'", TextView.class);
        this.f11879b = findRequiredView;
        findRequiredView.setOnClickListener(new C4728a(configureZoneActivity));
        configureZoneActivity.areaRadius = Utils.findRequiredView(view, C17532R$id.area_radius, "field 'areaRadius'");
        configureZoneActivity.searchBox = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.search_box, "field 'searchBox'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C17532R$id.save_button, "method 'onSaveClicked'");
        this.f11880c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C4729b(configureZoneActivity));
    }

    @CallSuper
    public void unbind() {
        ConfigureZoneActivity configureZoneActivity = this.f11878a;
        if (configureZoneActivity != null) {
            this.f11878a = null;
            configureZoneActivity.zoneName = null;
            configureZoneActivity.areaSeekBar = null;
            configureZoneActivity.radiusValueText = null;
            configureZoneActivity.areaRadius = null;
            configureZoneActivity.searchBox = null;
            this.f11879b.setOnClickListener((View.OnClickListener) null);
            this.f11879b = null;
            this.f11880c.setOnClickListener((View.OnClickListener) null);
            this.f11880c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
