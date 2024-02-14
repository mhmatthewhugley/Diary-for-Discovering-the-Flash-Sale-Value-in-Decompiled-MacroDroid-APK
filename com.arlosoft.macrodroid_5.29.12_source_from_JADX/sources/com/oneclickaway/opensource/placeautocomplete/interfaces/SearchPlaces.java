package com.oneclickaway.opensource.placeautocomplete.interfaces;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy;
import kotlin.Metadata;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces;", "", "PlaceItemSelectedListener", "RecentItemSelectedListener", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlaces.kt */
public interface SearchPlaces {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "candidateItem", "Lja/u;", "onPlaceItemSelected", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: SearchPlaces.kt */
    public interface PlaceItemSelectedListener {
        void onPlaceItemSelected(PredictionsItem predictionsItem);
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;", "", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "savedItem", "Lja/u;", "onRecantsItemSelected", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: SearchPlaces.kt */
    public interface RecentItemSelectedListener {
        void onRecantsItemSelected(GroupStrategy.ListItem listItem);
    }
}
