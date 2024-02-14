package com.google.android.gms.location.places.p205ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.C10445R;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.p205ui.PlaceAutocomplete;
import com.google.android.gms.maps.model.LatLngBounds;

@Deprecated
/* renamed from: com.google.android.gms.location.places.ui.PlaceAutocompleteFragment */
public class PlaceAutocompleteFragment extends Fragment {

    /* renamed from: a */
    private View f46021a;

    /* renamed from: c */
    private View f46022c;

    /* renamed from: d */
    private EditText f46023d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f46024f;
    @Nullable

    /* renamed from: g */
    private LatLngBounds f46025g;
    @Nullable

    /* renamed from: o */
    private AutocompleteFilter f46026o;
    @Nullable

    /* renamed from: p */
    private PlaceSelectionListener f46027p;

    /* renamed from: d */
    private final void m64795d() {
        this.f46022c.setVisibility(this.f46023d.getText().toString().isEmpty() ^ true ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m64796e() {
        int i;
        try {
            Intent a = new PlaceAutocomplete.IntentBuilder(2).mo54348b(this.f46025g).mo54349c(this.f46026o).mo54351e(this.f46023d.getText().toString()).mo54350d(1).mo54347a(getActivity());
            this.f46024f = true;
            startActivityForResult(a, 30421);
            i = -1;
        } catch (GooglePlayServicesRepairableException e) {
            i = e.mo21177b();
            Log.e("Places", "Could not open autocomplete activity", e);
        } catch (GooglePlayServicesNotAvailableException e2) {
            i = e2.errorCode;
            Log.e("Places", "Could not open autocomplete activity", e2);
        }
        if (i != -1) {
            GoogleApiAvailability.m3521q().mo21162s(getActivity(), i, 30422);
        }
    }

    /* renamed from: a */
    public void mo54352a(CharSequence charSequence) {
        this.f46023d.setText(charSequence);
        m64795d();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f46024f = false;
        if (i == 30421) {
            if (i2 == -1) {
                Place a = PlaceAutocomplete.m64786a(getActivity(), intent);
                PlaceSelectionListener placeSelectionListener = this.f46027p;
                if (placeSelectionListener != null) {
                    placeSelectionListener.mo54356a(a);
                }
                mo54352a(a.getName().toString());
            } else if (i2 == 2) {
                Status b = PlaceAutocomplete.m64787b(getActivity(), intent);
                PlaceSelectionListener placeSelectionListener2 = this.f46027p;
                if (placeSelectionListener2 != null) {
                    placeSelectionListener2.mo54357b(b);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C10445R.C10449layout.place_autocomplete_fragment, viewGroup, false);
        this.f46021a = inflate.findViewById(C10445R.C10448id.place_autocomplete_search_button);
        this.f46022c = inflate.findViewById(C10445R.C10448id.place_autocomplete_clear_button);
        this.f46023d = (EditText) inflate.findViewById(C10445R.C10448id.place_autocomplete_search_input);
        zze zze = new zze(this);
        this.f46021a.setOnClickListener(zze);
        this.f46023d.setOnClickListener(zze);
        this.f46022c.setOnClickListener(new zzd(this));
        m64795d();
        return inflate;
    }

    public void onDestroyView() {
        this.f46021a = null;
        this.f46022c = null;
        this.f46023d = null;
        super.onDestroyView();
    }
}
