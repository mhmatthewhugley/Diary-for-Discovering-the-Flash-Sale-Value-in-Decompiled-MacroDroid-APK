package p350oc;

import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import net.oneclickaway.opensource.placeautomcomplete.p340ui.SearchPlaceActivity2;

/* renamed from: oc.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15843a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SearchPlaceActivity2 f65293a;

    public /* synthetic */ C15843a(SearchPlaceActivity2 searchPlaceActivity2) {
        this.f65293a = searchPlaceActivity2;
    }

    public final void onChanged(Object obj) {
        SearchPlaceActivity2.m95350Y1(this.f65293a, (PlaceDetails) obj);
    }
}
