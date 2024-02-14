package com.oneclickaway.opensource.placeautocomplete.data.adapter;

import com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.interfaces.SearchPlaces;
import java.util.List;
import kotlin.Metadata;
import p216ba.C11113d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "kotlin.jvm.PlatformType", "it", "Lja/u;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: SearchResultAdapter.kt */
final class SearchResultAdapter$ViewHolder$setItemClickListener$1<T> implements C11113d<Object> {
    final /* synthetic */ SearchResultAdapter.ViewHolder this$0;

    SearchResultAdapter$ViewHolder$setItemClickListener$1(SearchResultAdapter.ViewHolder viewHolder) {
        this.this$0 = viewHolder;
    }

    public final void accept(Object obj) {
        SearchPlaces.PlaceItemSelectedListener placeItemSelectedListener = this.this$0.this$0.getPlaceItemSelectedListener();
        List<PredictionsItem> listOfCandidatesItem = this.this$0.this$0.getListOfCandidatesItem();
        placeItemSelectedListener.onPlaceItemSelected(listOfCandidatesItem != null ? listOfCandidatesItem.get(this.this$0.getAdapterPosition()) : null);
    }
}
