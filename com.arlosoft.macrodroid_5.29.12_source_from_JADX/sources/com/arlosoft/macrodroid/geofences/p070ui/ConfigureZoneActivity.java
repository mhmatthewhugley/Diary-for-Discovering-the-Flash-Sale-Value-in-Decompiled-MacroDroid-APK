package com.arlosoft.macrodroid.geofences.p070ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.geofences.C4720l;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.p232ui.SearchPlaceActivity;
import com.oneclickaway.opensource.placeautocomplete.utils.SearchPlacesStatusCodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import net.oneclickaway.opensource.placeautomcomplete.p340ui.SearchPlaceActivity2;
import p037m.C2009f;
import p081e1.C7264a;
import p167t1.C10248k;
import p167t1.C10249l;
import p167t1.C17444b;
import p167t1.C17445c;
import p167t1.C17446d;
import p167t1.C17447e;
import p167t1.C17448f;
import p167t1.C17449g;
import p167t1.C17450h;
import p167t1.C17451i;
import p167t1.C17452j;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity */
public class ConfigureZoneActivity extends MacroDroidBaseActivity implements C10249l {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public GeofenceInfo f11863A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public LocationManager f11864B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C2009f f11865C;

    /* renamed from: D */
    private final LocationListener f11866D = new C4723a();
    @BindView(2131362003)
    View areaRadius;
    @BindView(2131362004)
    SeekBar areaSeekBar;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10248k f11867o;

    /* renamed from: p */
    private String f11868p;
    @BindView(2131363580)
    TextView radiusValueText;

    /* renamed from: s */
    private SupportMapFragment f11869s;
    @BindView(2131363690)
    TextView searchBox;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public GoogleMap f11870z;
    @BindView(2131364376)
    EditText zoneName;

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity$a */
    class C4723a implements LocationListener {
        C4723a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:0|1|2|3|(1:12)(2:7|9)) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0009 */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0039 A[Catch:{ Exception -> 0x0042 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLocationChanged(android.location.Location r6) {
            /*
                r5 = this;
                com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity r0 = com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.this     // Catch:{ SecurityException -> 0x0009 }
                android.location.LocationManager r0 = r0.f11864B     // Catch:{ SecurityException -> 0x0009 }
                r0.removeUpdates(r5)     // Catch:{ SecurityException -> 0x0009 }
            L_0x0009:
                com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng     // Catch:{ Exception -> 0x0042 }
                double r1 = r6.getLatitude()     // Catch:{ Exception -> 0x0042 }
                double r3 = r6.getLongitude()     // Catch:{ Exception -> 0x0042 }
                r0.<init>(r1, r3)     // Catch:{ Exception -> 0x0042 }
                com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity r6 = com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.this     // Catch:{ Exception -> 0x0042 }
                com.google.android.gms.maps.GoogleMap r6 = r6.f11870z     // Catch:{ Exception -> 0x0042 }
                r1 = 1097859072(0x41700000, float:15.0)
                com.google.android.gms.maps.CameraUpdate r0 = com.google.android.gms.maps.CameraUpdateFactory.m64878a(r0, r1)     // Catch:{ Exception -> 0x0042 }
                r6.mo54446b(r0)     // Catch:{ Exception -> 0x0042 }
                com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity r6 = com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.this     // Catch:{ Exception -> 0x0042 }
                m.f r6 = r6.f11865C     // Catch:{ Exception -> 0x0042 }
                if (r6 == 0) goto L_0x0042
                com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity r6 = com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.this     // Catch:{ Exception -> 0x0042 }
                m.f r6 = r6.f11865C     // Catch:{ Exception -> 0x0042 }
                boolean r6 = r6.isShowing()     // Catch:{ Exception -> 0x0042 }
                if (r6 == 0) goto L_0x0042
                com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity r6 = com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.this     // Catch:{ Exception -> 0x0042 }
                m.f r6 = r6.f11865C     // Catch:{ Exception -> 0x0042 }
                r6.dismiss()     // Catch:{ Exception -> 0x0042 }
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.C4723a.onLocationChanged(android.location.Location):void");
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity$b */
    class C4724b implements SeekBar.OnSeekBarChangeListener {
        C4724b() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ConfigureZoneActivity.this.f11867o.mo40864f(i + 30);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity$c */
    class C4725c implements TextWatcher {
        C4725c() {
        }

        public void afterTextChanged(Editable editable) {
            ConfigureZoneActivity.this.f11867o.mo40862d(editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity$d */
    class C4726d implements GoogleMap.SnapshotReadyCallback {
        C4726d() {
        }

        /* renamed from: C0 */
        public void mo29236C0(Bitmap bitmap) {
            FileOutputStream fileOutputStream;
            File file = new File(ConfigureZoneActivity.this.getFilesDir().getAbsolutePath(), "MacroDroid/maps");
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath() + "/" + ConfigureZoneActivity.this.f11863A.getId() + ".png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            ConfigureZoneActivity.this.mo29214F(true);
            return;
            throw th;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.ui.ConfigureZoneActivity$e */
    class C4727e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditText f11875a;

        /* renamed from: c */
        final /* synthetic */ Button f11876c;

        C4727e(EditText editText, Button button) {
            this.f11875a = editText;
            this.f11876c = button;
        }

        public void afterTextChanged(Editable editable) {
            try {
                int intValue = Integer.valueOf(this.f11875a.getText().toString()).intValue();
                if (intValue < 30 || intValue > 100000) {
                    this.f11876c.setEnabled(false);
                } else {
                    this.f11876c.setEnabled(true);
                }
            } catch (Exception unused) {
                this.f11876c.setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: f2 */
    private void m18303f2() {
        getWindow().setSoftInputMode(3);
    }

    /* renamed from: g2 */
    private void m18304g2(GeofenceInfo geofenceInfo, float f) {
        if (C5163j2.m20062T0(this)) {
            this.f11870z.mo54451g(2);
        }
        if (!(geofenceInfo.getLatitude() == 0.0d && geofenceInfo.getLongitude() == 0.0d)) {
            this.f11870z.mo54450f(CameraUpdateFactory.m64878a(new LatLng(geofenceInfo.getLatitude(), geofenceInfo.getLongitude()), f));
            mo29217P0(geofenceInfo.getRadius());
        }
        this.f11870z.mo54452h(new C17450h(this));
        this.f11870z.mo54453i(new C17451i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public /* synthetic */ void m18305h2(CameraPosition cameraPosition) {
        C10248k kVar = this.f11867o;
        LatLng latLng = cameraPosition.f46220a;
        kVar.mo40867j(latLng.f46263a, latLng.f46264c);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public /* synthetic */ void m18306i2() {
        this.f11867o.mo40859a();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public /* synthetic */ void m18307j2(Intent intent, View view) {
        startActivityForResult(intent, TypedValues.Transition.TYPE_DURATION, ActivityOptions.makeSceneTransitionAnimation(this, new Pair[]{Pair.create(this.searchBox, SearchPlacesStatusCodes.INSTANCE.getPLACEHOLDER_TRANSITION())}).toBundle());
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m18308k2(float f, GoogleMap googleMap) {
        this.f11870z = googleMap;
        googleMap.mo54449e().mo54564b(true);
        this.f11870z.mo54455k(0, getResources().getDimensionPixelOffset(C17529R$dimen.zoom_controls_padding_bottom), 0, getResources().getDimensionPixelOffset(C17529R$dimen.zoom_controls_padding_bottom));
        m18304g2(this.f11863A, f);
        this.areaSeekBar.setOnSeekBarChangeListener(new C4724b());
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m18309l2(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m18315r2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m18310m2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f11867o.mo40866i(this.f11868p, this.zoneName.getText().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m18311n2(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m18312o2(DialogInterface dialogInterface) {
        this.f11864B.removeUpdates(this.f11866D);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m18313p2(DialogInterface dialogInterface, int i) {
        this.f11867o.mo40860b();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void m18314q2(EditText editText, DialogInterface dialogInterface, int i) {
        if (editText.length() > 0) {
            this.f11867o.mo40868k(Integer.valueOf(editText.getText().toString()).intValue());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18315r2() {
        /*
            r13 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r13, r0)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r13, r0)
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            android.location.LocationManager r1 = r13.f11864B     // Catch:{ Exception -> 0x001d }
            java.lang.String r2 = "network"
            r3 = 0
            r5 = 0
            android.location.LocationListener r6 = r13.f11866D     // Catch:{ Exception -> 0x001d }
            r1.requestLocationUpdates(r2, r3, r5, r6)     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.location.LocationManager r7 = r13.f11864B     // Catch:{ Exception -> 0x0029 }
            java.lang.String r8 = "gps"
            r9 = 0
            r11 = 0
            android.location.LocationListener r12 = r13.f11866D     // Catch:{ Exception -> 0x0029 }
            r7.requestLocationUpdates(r8, r9, r11, r12)     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            m.f$d r0 = new m.f$d
            r0.<init>(r13)
            r1 = 2131954600(0x7f130ba8, float:1.9545704E38)
            m.f$d r0 = r0.mo24100t(r1)
            r1 = 2131954500(0x7f130b44, float:1.95455E38)
            m.f$d r0 = r0.mo24085e(r1)
            r1 = 0
            r2 = 1
            m.f$d r0 = r0.mo24098r(r2, r1)
            m.f$d r0 = r0.mo24084c(r2)
            m.f r0 = r0.mo24099s()
            r13.f11865C = r0
            t1.a r1 = new t1.a
            r1.<init>(r13)
            r0.setOnCancelListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.geofences.p070ui.ConfigureZoneActivity.m18315r2():void");
    }

    /* renamed from: D1 */
    public void mo29213D1() {
        C15626c.makeText(getApplicationContext(), C17541R$string.geofence_zone_name_already_exists, 0).show();
    }

    /* renamed from: F */
    public void mo29214F(boolean z) {
        Intent intent = new Intent();
        if (z) {
            setResult(0);
        } else {
            intent.putExtra("selected_geofence_id", this.f11863A.getId());
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: L */
    public void mo29215L() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.save_changes);
        builder.setMessage((int) C17541R$string.do_you_wish_to_save_changes_generic);
        builder.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C17444b(this));
        builder.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C17445c(this));
        builder.show();
    }

    /* renamed from: P */
    public void mo29216P(int i) {
        TextView textView = this.radiusValueText;
        textView.setText(i + getString(C17541R$string.meters).substring(0, 1));
    }

    /* renamed from: P0 */
    public void mo29217P0(int i) {
        int a = C4720l.m18287a(this.f11870z, new LatLng(this.f11870z.mo54447c().f46220a.f46263a, this.f11870z.mo54447c().f46220a.f46264c), (float) i) * 2;
        this.areaRadius.setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
    }

    /* renamed from: R */
    public void mo29218R() {
        GoogleMap googleMap = this.f11870z;
        if (googleMap == null) {
            mo29214F(true);
        } else {
            googleMap.mo54456l(new C4726d());
        }
    }

    /* renamed from: S */
    public void mo29219S(int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.radius);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C17535R$layout.dialog_geofence_radius, (ViewGroup) null);
        EditText editText = (EditText) viewGroup.findViewById(C17532R$id.radius_value);
        editText.setText(String.valueOf(i));
        builder.setView((View) viewGroup);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C17447e(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        editText.addTextChangedListener(new C4727e(editText, builder.show().getButton(-1)));
    }

    /* renamed from: W */
    public void mo29220W(boolean z) {
    }

    /* renamed from: d1 */
    public void mo29221d1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.delete_zone);
        builder.setMessage((int) C17541R$string.delete_zone_confirm);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C17446d(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* renamed from: i0 */
    public void mo29222i0() {
        C15626c.makeText(getApplicationContext(), C17541R$string.please_enter_a_name, 0).show();
    }

    /* renamed from: j0 */
    public void mo29223j0(int i) {
        this.areaSeekBar.setProgress(i - 30);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 700 && i2 == -1 && intent != null) {
            PlaceDetails placeDetails = (PlaceDetails) intent.getParcelableExtra(SearchPlacesStatusCodes.INSTANCE.getPLACE_DATA());
            this.searchBox.setText(placeDetails.getName());
            if (placeDetails.getGeometry() != null && placeDetails.getGeometry().getLocation() != null && placeDetails.getGeometry().getLocation().getLat() != null && placeDetails.getGeometry().getLocation().getLng() != null && this.f11870z != null && placeDetails.getGeometry() != null && placeDetails.getGeometry().getLocation() != null) {
                this.f11870z.mo54450f(CameraUpdateFactory.m64878a(new LatLng(placeDetails.getGeometry().getLocation().getLat().doubleValue(), placeDetails.getGeometry().getLocation().getLng().doubleValue()), 13.0f));
                this.f11867o.mo40867j(placeDetails.getGeometry().getLocation().getLat().doubleValue(), placeDetails.getGeometry().getLocation().getLat().doubleValue());
            }
        }
    }

    public void onBackPressed() {
        this.f11867o.mo40861c();
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_configure_zone);
        ButterKnife.bind((Activity) this);
        setTitle(C17541R$string.geofences);
        this.f11864B = (LocationManager) getSystemService("location");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        GeofenceInfo geofenceInfo = (GeofenceInfo) getIntent().getParcelableExtra("geofence");
        if (geofenceInfo != null) {
            str = geofenceInfo.getName();
        } else {
            str = "";
        }
        this.f11868p = str;
        LocationManager locationManager = (LocationManager) getSystemService("location");
        String str3 = null;
        Location lastKnownLocation = ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 ? locationManager.getLastKnownLocation("gps") : null;
        if (lastKnownLocation == null && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            lastKnownLocation = locationManager.getLastKnownLocation("network");
        }
        float f = 13.0f;
        if (geofenceInfo != null) {
            this.f11863A = geofenceInfo;
        } else if (lastKnownLocation != null) {
            this.f11863A = new GeofenceInfo(UUID.randomUUID().toString(), "", lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 500, 0);
        } else {
            f = 3.0f;
            this.f11863A = new GeofenceInfo(UUID.randomUUID().toString(), "", 0.0d, 0.0d, 500, 0);
        }
        if (lastKnownLocation != null) {
            str2 = lastKnownLocation.getLatitude() + "," + lastKnownLocation.getLongitude();
        } else {
            str2 = "";
        }
        Intent intent = new Intent(this, SearchPlaceActivity2.class);
        intent.putExtra(SearchPlacesStatusCodes.INSTANCE.getCONFIG(), new SearchPlaceActivity.Config(getString(C17541R$string.maps_key_v2), str2, "", getString(C17541R$string.search)));
        this.searchBox.setText(getString(C17541R$string.search));
        this.searchBox.setOnClickListener(new C17448f(this, intent));
        this.radiusValueText.setText(String.valueOf(this.f11863A.getRadius()));
        this.areaSeekBar.setProgress(this.f11863A.getRadius() - 30);
        C7264a q = MacroDroidApplication.m14845u().mo27293q("GeofenceInfo");
        if (geofenceInfo != null) {
            str3 = geofenceInfo.getId();
        }
        C10248k kVar = new C10248k(q, str3);
        this.f11867o = kVar;
        kVar.mo40870m(this, this.f11863A);
        this.zoneName.setText(this.f11863A.getName());
        this.areaSeekBar.setProgress(this.f11863A.getRadius() + 30);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(C17532R$id.map);
        this.f11869s = supportMapFragment;
        supportMapFragment.mo54559U(new C17452j(this, f));
        this.zoneName.addTextChangedListener(new C4725c());
        MapsInitializer.m64967a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.configure_zone, menu);
        menu.findItem(C17532R$id.menu_satellite_view).setChecked(C5163j2.m20062T0(this));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                this.f11867o.mo40861c();
                return true;
            case C17532R$id.menu_delete:
                this.f11867o.mo40865h();
                return true;
            case C17532R$id.menu_satellite_view:
                boolean z = !C5163j2.m20062T0(this);
                C5163j2.m19989I4(this, z);
                menuItem.setChecked(z);
                this.f11870z.mo54451g(z ? 2 : 1);
                return true;
            case C17532R$id.menu_user_location:
                new C11102b((FragmentActivity) this).mo62231o("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo79679I(C16971a.m100210a()).mo79685P(new C17449g(this));
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363580})
    public void onRadiusTextClicked() {
        this.f11867o.mo40863e();
    }

    public void onResume() {
        super.onResume();
        m18303f2();
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131363661})
    public void onSaveClicked() {
        this.f11867o.mo40866i(this.f11868p, this.zoneName.getText().toString());
    }
}
