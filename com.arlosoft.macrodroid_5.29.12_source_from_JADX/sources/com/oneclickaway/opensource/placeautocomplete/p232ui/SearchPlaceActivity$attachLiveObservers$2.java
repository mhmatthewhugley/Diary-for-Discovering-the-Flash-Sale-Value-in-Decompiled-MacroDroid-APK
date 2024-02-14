package com.oneclickaway.opensource.placeautocomplete.p232ui;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.utils.SearchPlacesStatusCodes;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "it", "Lja/u;", "onChanged", "(Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$attachLiveObservers$2 */
/* compiled from: SearchPlaceActivity.kt */
final class SearchPlaceActivity$attachLiveObservers$2<T> implements Observer<PlaceDetails> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$attachLiveObservers$2(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public final void onChanged(PlaceDetails placeDetails) {
        if (placeDetails != null) {
            Intent intent = new Intent();
            intent.putExtra(SearchPlacesStatusCodes.INSTANCE.getPLACE_DATA(), placeDetails);
            this.this$0.setResult(-1, intent);
        }
        this.this$0.finishAfterTransition();
    }
}
