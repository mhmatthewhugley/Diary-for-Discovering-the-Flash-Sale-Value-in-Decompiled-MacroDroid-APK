package com.arlosoft.macrodroid.triggers.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuItemCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import p037m.C2009f;
import p319lc.C15626c;
import p459ef.C17153c;
import p459ef.C17163i;
import p462hf.C17171a;
import p469of.C17220a;

public class LocationChooserActivity extends MacroDroidBaseActivity {

    /* renamed from: A */
    private boolean f13779A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Marker f13780B;

    /* renamed from: C */
    private FloatingActionButton f13781C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public SearchView f13782D;

    /* renamed from: E */
    private C17163i f13783E;

    /* renamed from: F */
    private final LocationListener f13784F = new C5817a();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public LocationManager f13785o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2009f f13786p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public GoogleMap f13787s;

    /* renamed from: z */
    private LatLng f13788z;

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity$a */
    class C5817a implements LocationListener {
        C5817a() {
        }

        public void onLocationChanged(Location location) {
            try {
                LocationChooserActivity.this.f13785o.removeUpdates(this);
            } catch (SecurityException unused) {
            }
            if (!LocationChooserActivity.this.mo27315N1()) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                LocationChooserActivity.this.f13787s.mo54446b(CameraUpdateFactory.m64878a(latLng, 15.0f));
                if (LocationChooserActivity.this.f13780B != null) {
                    LocationChooserActivity.this.f13780B.mo54723a();
                    Marker unused2 = LocationChooserActivity.this.f13780B = null;
                }
                LocationChooserActivity.this.m23859t2(latLng);
                if (LocationChooserActivity.this.f13786p != null && LocationChooserActivity.this.f13786p.isShowing()) {
                    LocationChooserActivity.this.f13786p.dismiss();
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity$b */
    class C5818b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ MenuItem f13790a;

        C5818b(MenuItem menuItem) {
            this.f13790a = menuItem;
        }

        public boolean onQueryTextChange(String str) {
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            LocationChooserActivity.this.m23858s2(str);
            LocationChooserActivity.this.f13782D.clearFocus();
            this.f13790a.collapseActionView();
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity$c */
    class C5819c implements MenuItemCompat.OnActionExpandListener {

        /* renamed from: a */
        final /* synthetic */ Menu f13792a;

        /* renamed from: b */
        final /* synthetic */ MenuItem f13793b;

        C5819c(Menu menu, MenuItem menuItem) {
            this.f13792a = menu;
            this.f13793b = menuItem;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            for (int i = 0; i < this.f13792a.size(); i++) {
                MenuItem item = this.f13792a.getItem(i);
                if (item != this.f13793b) {
                    item.setVisible(true);
                }
            }
            return true;
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    /* renamed from: g2 */
    private void m23846g2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.trigger_weather_set_location);
        builder.setMessage((int) C17541R$string.trigger_weather_usage_instructions);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C5839f.f13849a);
        builder.show();
    }

    /* renamed from: h2 */
    private C17153c<Address> m23847h2(String str) throws IOException {
        return C17153c.m100631c(new Geocoder(this).getFromLocationName(str, 1));
    }

    /* renamed from: i2 */
    private void m23848i2() {
        Location location;
        ((ViewGroup) findViewById(C17532R$id.activity_location_trigger_v2_radius_container)).setVisibility(8);
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (C5163j2.m20062T0(this)) {
            this.f13787s.mo54451g(2);
        }
        double doubleExtra = getIntent().getDoubleExtra("lat", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("lon", 0.0d);
        if (doubleExtra == 0.0d || doubleExtra2 == 0.0d) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                location = locationManager.getLastKnownLocation("gps");
                if (location == null) {
                    location = locationManager.getLastKnownLocation("network");
                }
            } else {
                location = null;
            }
            if (location != null) {
                this.f13787s.mo54446b(CameraUpdateFactory.m64878a(new LatLng(location.getLatitude(), location.getLongitude()), 13.0f));
            }
        } else {
            this.f13787s.mo54450f(CameraUpdateFactory.m64878a(new LatLng(doubleExtra, doubleExtra2), 13.0f));
        }
        this.f13787s.mo54454j(new C5844i(this));
        m23846g2();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public /* synthetic */ void m23850k2(LatLng latLng) {
        if (this.f13779A) {
            m23859t2(latLng);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public /* synthetic */ void m23851l2(View view) {
        this.f13781C.setVisibility(8);
        GoogleMap googleMap = this.f13787s;
        if (!(googleMap == null || googleMap.mo54449e() == null)) {
            this.f13787s.mo54449e().mo54563a(false);
        }
        Marker marker = this.f13780B;
        if (marker != null) {
            marker.mo54723a();
            this.f13780B = null;
        }
        this.f13779A = true;
        getSupportActionBar().setCustomView((int) C17535R$layout.activity_location_trigger_action_bar_set_location);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public /* synthetic */ void m23852m2(Menu menu, MenuItem menuItem, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean isIconified = this.f13782D.isIconified();
        for (int i9 = 0; i9 < menu.size(); i9++) {
            MenuItem item = menu.getItem(i9);
            if (item != menuItem) {
                item.setVisible(isIconified);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public /* synthetic */ void m23853n2(GoogleMap googleMap) {
        this.f13787s = googleMap;
        m23848i2();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public /* synthetic */ void m23854o2(DialogInterface dialogInterface) {
        this.f13785o.removeUpdates(this.f13784F);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public /* synthetic */ void m23855p2(Address address) {
        if (address != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Search Location: ");
            sb.append(address.getLatitude());
            sb.append(",");
            sb.append(address.getLongitude());
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
            GoogleMap googleMap = this.f13787s;
            googleMap.mo54446b(CameraUpdateFactory.m64878a(latLng, googleMap.mo54447c().f46221c));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void m23856q2(Throwable th) {
        C15626c.makeText(getApplicationContext(), C17541R$string.no_location_found, 0).show();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23857r2() {
        /*
            r13 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r13, r0)     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.location.LocationManager r1 = r13.f13785o     // Catch:{ Exception -> 0x0015 }
            java.lang.String r2 = "network"
            r3 = 0
            r5 = 0
            android.location.LocationListener r6 = r13.f13784F     // Catch:{ Exception -> 0x0015 }
            r1.requestLocationUpdates(r2, r3, r5, r6)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            android.location.LocationManager r7 = r13.f13785o     // Catch:{ Exception -> 0x0021 }
            java.lang.String r8 = "gps"
            r9 = 0
            r11 = 0
            android.location.LocationListener r12 = r13.f13784F     // Catch:{ Exception -> 0x0021 }
            r7.requestLocationUpdates(r8, r9, r11, r12)     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
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
            r13.f13786p = r0
            com.arlosoft.macrodroid.triggers.activities.e r1 = new com.arlosoft.macrodroid.triggers.activities.e
            r1.<init>(r13)
            r0.setOnCancelListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.activities.LocationChooserActivity.m23857r2():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public void m23858s2(String str) {
        try {
            this.f13783E = m23847h2(str).mo80436l(C17220a.m100795c()).mo80430e(C17171a.m100674a()).mo80428b().mo80435k(new C5846k(this), new C5847l(this));
        } catch (IOException e) {
            Log.e("LocationChooserActivity", "Search exception: " + e.toString());
            C15626c.makeText(getApplicationContext(), C17541R$string.no_location_found, 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public void m23859t2(LatLng latLng) {
        this.f13788z = new LatLng(latLng.f46263a, latLng.f46264c);
        MarkerOptions v2 = new MarkerOptions().mo54736v2(BitmapDescriptorFactory.m65198a(C17530R$drawable.map_pin));
        v2.mo54741z2(this.f13788z);
        this.f13780B = this.f13787s.mo54445a(v2);
        this.f13779A = false;
        getSupportActionBar().setDisplayShowCustomEnabled(false);
        invalidateOptionsMenu();
        this.f13781C.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(9);
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_location_trigger_v2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra != null) {
            getSupportActionBar().setTitle((CharSequence) stringExtra);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C17532R$id.activity_location_trigger_v2_set_location_button);
        this.f13781C = floatingActionButton;
        floatingActionButton.setOnClickListener(new C5841g(this));
        MapsInitializer.m64967a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f13779A) {
            return true;
        }
        getMenuInflater().inflate(C17536R$menu.location_trigger_menu, menu);
        menu.findItem(C17532R$id.menu_satellite_view).setChecked(C5163j2.m20062T0(this));
        MenuItem findItem = menu.findItem(C17532R$id.menu_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(findItem);
        this.f13782D = searchView;
        searchView.setOnQueryTextListener(new C5818b(findItem));
        this.f13782D.addOnLayoutChangeListener(new C5843h(this, menu, findItem));
        MenuItemCompat.setOnActionExpandListener(findItem, new C5819c(menu, findItem));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C17163i iVar = this.f13783E;
        if (iVar != null) {
            iVar.mo80450d();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                break;
            case C17532R$id.menu_current_location:
                if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    m23857r2();
                    break;
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 34);
                    return true;
                }
            case C17532R$id.menu_done:
                LatLng latLng = this.f13788z;
                if (latLng != null) {
                    C5163j2.m20211m4(this, latLng);
                    Intent intent = new Intent();
                    intent.putExtra("Latitude", this.f13788z.f46263a);
                    intent.putExtra("Longitude", this.f13788z.f46264c);
                    setResult(-1, intent);
                    finish();
                    break;
                } else {
                    C15626c.m94876a(getApplicationContext(), getString(C17541R$string.please_set_location), 0).show();
                    break;
                }
            case C17532R$id.menu_satellite_view:
                boolean z = !C5163j2.m20062T0(this);
                C5163j2.m19989I4(this, z);
                menuItem.setChecked(z);
                this.f13787s.mo54451g(z ? 2 : 1);
                return true;
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 34) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr[0] == 0) {
            m23857r2();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f13785o = (LocationManager) getSystemService("location");
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(C17532R$id.map)).mo54559U(new C5845j(this));
    }
}
