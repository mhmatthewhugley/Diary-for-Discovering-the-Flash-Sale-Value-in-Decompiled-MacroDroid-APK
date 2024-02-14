package com.arlosoft.macrodroid.geofences;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.geofences.ZonesAdapter;
import com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import p081e1.C7264a;
import p161s1.C10180a;

public class GeofenceListActivity extends MacroDroidBaseActivity implements ZonesAdapter.C4707a {
    @BindView(2131362843)
    FloatingActionButton addGeofenceButton;
    @BindView(2131362844)
    View emptyView;
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;

    /* renamed from: o */
    private int f11823o;

    /* renamed from: p */
    private final C7264a f11824p = MacroDroidApplication.m14845u().mo27293q("GeofenceInfo");
    @BindView(2131363593)
    RecyclerView recyclerView;

    /* renamed from: s */
    private GeofenceStore f11825s;

    /* renamed from: z */
    private boolean f11826z;

    /* renamed from: T1 */
    private void m18236T1() {
        if (C5163j2.m20301x6(this)) {
            this.infoCardView.setVisibility(8);
            return;
        }
        int i = this.f11823o;
        if (i == 1) {
            this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.trigger_primary));
        } else if (i == 2) {
            this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.constraints_primary));
        } else {
            this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.geofences_primary));
        }
        this.infoCardTitle.setText(C17541R$string.geofences);
        this.infoCardDetail.setText(C17541R$string.geofences_info_card);
        this.infoCardGotIt.setOnClickListener(new C4711d(this));
    }

    /* renamed from: U1 */
    private void m18237U1(@NonNull GeofenceInfo geofenceInfo) {
        File file = new File(getFilesDir().getAbsolutePath(), "MacroDroid/maps");
        File file2 = new File(file, geofenceInfo.getId() + ".png");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* renamed from: V1 */
    private int m18238V1() {
        int i = this.f11823o;
        if (i == 1) {
            return ContextCompat.getColor(this, C17528R$color.trigger_primary);
        }
        if (i != 2) {
            return ContextCompat.getColor(this, C17528R$color.geofences_primary);
        }
        return ContextCompat.getColor(this, C17528R$color.constraints_primary);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m18239W1(View view) {
        C5163j2.m20022N2(getApplicationContext());
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m18240X1(GeofenceInfo geofenceInfo, DialogInterface dialogInterface, int i) {
        if (geofenceInfo != null) {
            C4878b.m18873l("Geofence Deleted - " + geofenceInfo.getName());
            this.f11825s.removeGeofence(geofenceInfo.getId());
            this.f11824p.mo37132b("GeofenceInfo", this.f11825s);
            C4708a.m18258a(geofenceInfo.getId());
            m18237U1(geofenceInfo);
        }
        m18243a2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m18241Y1(GeofenceInfo geofenceInfo, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            Intent intent = new Intent(this, ConfigureZoneActivity.class);
            intent.putExtra("geofence", geofenceInfo);
            startActivity(intent);
        } else if (i == 1) {
            m18242Z1(geofenceInfo);
        }
    }

    /* renamed from: Z1 */
    private void m18242Z1(@NonNull GeofenceInfo geofenceInfo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) getString(C17541R$string.delete) + " " + geofenceInfo.getName());
        builder.setMessage((int) C17541R$string.delete_zone_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4710c(this, geofenceInfo));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: a2 */
    private void m18243a2() {
        GeofenceStore geofenceStore = (GeofenceStore) this.f11824p.mo37133c("GeofenceInfo", GeofenceStore.class);
        this.f11825s = geofenceStore;
        if (geofenceStore == null) {
            this.f11825s = new GeofenceStore(new ArrayMap());
        }
        if (this.f11825s.getGeofenceList().size() == 0) {
            this.emptyView.setVisibility(0);
            this.recyclerView.setVisibility(8);
            return;
        }
        int i = this.f11823o;
        ZonesAdapter zonesAdapter = new ZonesAdapter(this.f11825s.getGeofenceList(), this, this, i == 0 ? C17528R$color.geofences_primary_transparent : i == 1 ? C17528R$color.trigger_primary_transparent : C17528R$color.constraint_primary_transparent);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.recyclerView.setAdapter(zonesAdapter);
        this.recyclerView.setVisibility(0);
        this.emptyView.setVisibility(8);
    }

    /* renamed from: T0 */
    public void mo29175T0(@NonNull GeofenceInfo geofenceInfo) {
        String[] strArr = {getString(C17541R$string.edit), getString(C17541R$string.delete)};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) geofenceInfo.getName()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4709b(this, geofenceInfo));
        builder.create().show();
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131362843})
    public void addGeofenceButtonClick() {
        startActivityForResult(new Intent(this, ConfigureZoneActivity.class), 11);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && this.f11826z) {
            String stringExtra = intent.getStringExtra("selected_geofence_id");
            Intent intent2 = new Intent();
            intent2.putExtra("selected_geofence_id", stringExtra);
            setResult(-1, intent2);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int intExtra = getIntent().getIntExtra("ThemeType", 0);
        this.f11823o = intExtra;
        if (intExtra != 0) {
            setTheme(intExtra == 1 ? C17542R$style.Theme_App_Trigger_ColoredButton : C17542R$style.Theme_App_Constraint_ColoredButton);
        }
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_geofences);
        ButterKnife.bind((Activity) this);
        this.addGeofenceButton.setBackgroundTintList(ColorStateList.valueOf(m18238V1()));
        this.f11826z = getIntent().getBooleanExtra("picker_mode", false);
        m18236T1();
        if (this.f11826z) {
            setTitle(C17541R$string.select_zone);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        m18243a2();
    }

    /* renamed from: u0 */
    public void mo29177u0(@NonNull GeofenceInfo geofenceInfo) {
        if (this.f11826z) {
            Intent intent = new Intent();
            intent.putExtra("selected_geofence_id", geofenceInfo.getId());
            setResult(-1, intent);
            finish();
            return;
        }
        Intent intent2 = new Intent(this, ConfigureZoneActivity.class);
        intent2.putExtra("geofence", geofenceInfo);
        startActivity(intent2);
    }
}
