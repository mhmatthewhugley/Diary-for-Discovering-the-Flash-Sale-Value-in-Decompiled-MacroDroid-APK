package com.arlosoft.macrodroid.geofences;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import java.io.File;
import java.util.List;
import p063b5.C2253f;
import p083e4.C7271c;
import p083e4.C7276h;
import p120k4.C7580a;

public class ZonesAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private List<GeofenceInfo> f11831a;

    /* renamed from: b */
    private Context f11832b;

    /* renamed from: c */
    private C4707a f11833c;

    /* renamed from: d */
    private int f11834d;

    /* renamed from: e */
    private int f11835e;

    /* renamed from: f */
    private int f11836f;
    @ColorRes

    /* renamed from: g */
    int f11837g;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362381)
        ViewGroup container;
        @BindView(2131363578)
        TextView radiusInfo;
        @BindView(2131364070)
        View topBar;
        @BindView(2131364375)
        ImageView zoneImage;
        @BindView(2131364376)
        TextView zoneName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f11838a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f11838a = viewHolder;
            viewHolder.topBar = Utils.findRequiredView(view, C17532R$id.top_bar, "field 'topBar'");
            viewHolder.zoneImage = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.zone_image, "field 'zoneImage'", ImageView.class);
            viewHolder.container = (ViewGroup) Utils.findRequiredViewAsType(view, 2131362381, "field 'container'", ViewGroup.class);
            viewHolder.zoneName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.zone_name, "field 'zoneName'", TextView.class);
            viewHolder.radiusInfo = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.radius_info, "field 'radiusInfo'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f11838a;
            if (viewHolder != null) {
                this.f11838a = null;
                viewHolder.topBar = null;
                viewHolder.zoneImage = null;
                viewHolder.container = null;
                viewHolder.zoneName = null;
                viewHolder.radiusInfo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ZonesAdapter$a */
    public interface C4707a {
        /* renamed from: T0 */
        void mo29175T0(@NonNull GeofenceInfo geofenceInfo);

        /* renamed from: u0 */
        void mo29177u0(@NonNull GeofenceInfo geofenceInfo);
    }

    public ZonesAdapter(@NonNull List<GeofenceInfo> list, @NonNull Context context, @NonNull C4707a aVar, @ColorRes int i) {
        this.f11831a = list;
        this.f11832b = context;
        this.f11833c = aVar;
        this.f11837g = i;
        this.f11834d = context.getResources().getDimensionPixelSize(C17529R$dimen.zone_map_preview_image_size);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f11835e = displayMetrics.widthPixels;
        this.f11836f = context.getResources().getDimensionPixelOffset(C17529R$dimen.zone_list_map_height);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m18252D(GeofenceInfo geofenceInfo, View view) {
        this.f11833c.mo29177u0(geofenceInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ boolean m18253E(GeofenceInfo geofenceInfo, View view) {
        this.f11833c.mo29175T0(geofenceInfo);
        return true;
    }

    /* renamed from: F */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GeofenceInfo geofenceInfo = this.f11831a.get(i);
        viewHolder.topBar.setBackgroundResource(this.f11837g);
        viewHolder.zoneName.setText(geofenceInfo.getName());
        TextView textView = viewHolder.radiusInfo;
        textView.setText(geofenceInfo.getRadius() + " " + this.f11832b.getString(C17541R$string.meters));
        viewHolder.container.setOnClickListener(new C4721m(this, geofenceInfo));
        viewHolder.container.setOnLongClickListener(new C4722n(this, geofenceInfo));
        int i2 = this.f11835e;
        int i3 = i2 > 900 ? i2 / 2 : i2;
        int i4 = i2 > 900 ? this.f11836f / 2 : this.f11836f;
        File file = new File(this.f11832b.getFilesDir().getAbsolutePath(), "MacroDroid/maps");
        File file2 = new File(file, geofenceInfo.getId() + ".png");
        if (file2.exists()) {
            ((C7276h) ((C7276h) C7271c.m30017t(this.f11832b).mo37189s(file2).mo24506j0(true)).mo24499f(C7580a.f18489b)).mo37169G0(viewHolder.zoneImage);
            return;
        }
        C7271c.m30017t(this.f11832b).mo37190t("https://maps.google.com/maps/api/staticmap?center=" + geofenceInfo.getLatitude() + "," + geofenceInfo.getLongitude() + "&zoom=15&size=" + i3 + "x" + i4 + "&sensor=false&key=AIzaSyBQzAX2Z2M1gQlXTKqkP-d0BvUcaPBBdas").mo24491a(new C2253f().mo24503h()).mo37169G0(viewHolder.zoneImage);
    }

    /* renamed from: G */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_zone, viewGroup, false));
    }

    public int getItemCount() {
        return this.f11831a.size();
    }
}
