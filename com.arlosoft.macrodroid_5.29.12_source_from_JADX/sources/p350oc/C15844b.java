package p350oc;

import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import net.oneclickaway.opensource.placeautomcomplete.p340ui.SearchPlaceActivity2;

/* renamed from: oc.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15844b implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SearchPlaceActivity2 f65294a;

    public /* synthetic */ C15844b(SearchPlaceActivity2 searchPlaceActivity2) {
        this.f65294a = searchPlaceActivity2;
    }

    public final void onChanged(Object obj) {
        SearchPlaceActivity2.m95353b2(this.f65294a, (LoadingManager) obj);
    }
}
