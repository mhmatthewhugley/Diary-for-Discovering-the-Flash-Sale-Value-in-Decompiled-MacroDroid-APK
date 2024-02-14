package com.oneclickaway.opensource.placeautocomplete.data.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import java.util.List;
import kotlin.Metadata;

@Dao
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H'¨\u0006\b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDAO;", "", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "getRecentSearches", "searchSelectedItem", "Lja/u;", "addSearchItem", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: RecentSearchesDAO.kt */
public interface RecentSearchesDAO {
    @Insert(onConflict = 1)
    void addSearchItem(SearchSelectedItem searchSelectedItem);

    @Query("SELECT * FROM SearchSelectedItem ORDER BY searchCurrentMilliseconds DESC")
    List<SearchSelectedItem> getRecentSearches();
}
