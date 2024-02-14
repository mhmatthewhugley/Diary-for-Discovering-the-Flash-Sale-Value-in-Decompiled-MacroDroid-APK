package com.google.android.gms.location.places.p205ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
/* renamed from: com.google.android.gms.location.places.ui.SupportPlaceAutocompleteFragment */
public class SupportPlaceAutocompleteFragment extends Fragment {

    /* renamed from: a */
    private View f46028a;

    /* renamed from: c */
    private View f46029c;

    /* renamed from: d */
    private EditText f46030d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f46031f;
    @Nullable

    /* renamed from: g */
    private LatLngBounds f46032g;
    @Nullable

    /* renamed from: o */
    private AutocompleteFilter f46033o;
    @Nullable

    /* renamed from: p */
    private PlaceSelectionListener f46034p;

    /* renamed from: X */
    private final void m64803X() {
        this.f46029c.setVisibility(this.f46030d.getText().toString().isEmpty() ^ true ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public final void m64804Z() {
        int i;
        try {
            Intent a = new PlaceAutocomplete.IntentBuilder(2).mo54348b(this.f46032g).mo54349c(this.f46033o).mo54351e(this.f46030d.getText().toString()).mo54350d(1).mo54347a(getActivity());
            this.f46031f = true;
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

    /* renamed from: U */
    public void mo54358U(CharSequence charSequence) {
        this.f46030d.setText(charSequence);
        m64803X();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f46031f = false;
        if (i == 30421) {
            if (i2 == -1) {
                Place a = PlaceAutocomplete.m64786a(getActivity(), intent);
                PlaceSelectionListener placeSelectionListener = this.f46034p;
                if (placeSelectionListener != null) {
                    placeSelectionListener.mo54356a(a);
                }
                mo54358U(a.getName().toString());
            } else if (i2 == 2) {
                Status b = PlaceAutocomplete.m64787b(getActivity(), intent);
                PlaceSelectionListener placeSelectionListener2 = this.f46034p;
                if (placeSelectionListener2 != null) {
                    placeSelectionListener2.mo54357b(b);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C10445R.C10449layout.place_autocomplete_fragment, viewGroup, false);
        this.f46028a = inflate.findViewById(C10445R.C10448id.place_autocomplete_search_button);
        this.f46029c = inflate.findViewById(C10445R.C10448id.place_autocomplete_clear_button);
        this.f46030d = (EditText) inflate.findViewById(C10445R.C10448id.place_autocomplete_search_input);
        zzg zzg = new zzg(this);
        this.f46028a.setOnClickListener(zzg);
        this.f46030d.setOnClickListener(zzg);
        this.f46029c.setOnClickListener(new zzf(this));
        m64803X();
        return inflate;
    }

    public void onDestroyView() {
        this.f46028a = null;
        this.f46029c = null;
        this.f46030d = null;
        super.onDestroyView();
    }
}
