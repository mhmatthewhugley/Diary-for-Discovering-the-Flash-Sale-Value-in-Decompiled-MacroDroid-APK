package com.oneclickaway.opensource.placeautocomplete.p232ui;

import androidx.lifecycle.Observer;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "it", "Lja/u;", "onChanged", "(Ljava/util/List;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$attachLiveObservers$1 */
/* compiled from: SearchPlaceActivity.kt */
final class SearchPlaceActivity$attachLiveObservers$1<T> implements Observer<List<? extends PredictionsItem>> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$attachLiveObservers$1(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public final void onChanged(List<PredictionsItem> list) {
        SearchPlaceActivity.access$getSearchListAdapter$p(this.this$0).setSearchCandidates(list);
    }
}
