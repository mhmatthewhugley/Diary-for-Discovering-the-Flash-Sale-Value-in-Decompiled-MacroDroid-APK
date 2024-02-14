package p350oc;

import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import net.oneclickaway.opensource.placeautomcomplete.p340ui.SearchPlaceActivity2;

/* renamed from: oc.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15845c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ SearchPlaceActivity2 f65295a;

    public /* synthetic */ C15845c(SearchPlaceActivity2 searchPlaceActivity2) {
        this.f65295a = searchPlaceActivity2;
    }

    public final void onChanged(Object obj) {
        SearchPlaceActivity2.m95352a2(this.f65295a, (LoadingManager) obj);
    }
}
