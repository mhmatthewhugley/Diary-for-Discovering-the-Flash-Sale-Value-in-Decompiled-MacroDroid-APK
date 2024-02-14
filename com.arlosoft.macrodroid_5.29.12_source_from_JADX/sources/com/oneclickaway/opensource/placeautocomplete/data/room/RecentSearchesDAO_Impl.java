package com.oneclickaway.opensource.placeautocomplete.data.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p010db.SupportSQLiteStatement;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import java.util.ArrayList;
import java.util.List;

public class RecentSearchesDAO_Impl implements RecentSearchesDAO {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfSearchSelectedItem;

    public RecentSearchesDAO_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSearchSelectedItem = new EntityInsertionAdapter<SearchSelectedItem>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SearchSelectedItem`(`placeId`,`mainText`,`secondaryText`,`searchCurrentMilliseconds`) VALUES (?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, SearchSelectedItem searchSelectedItem) {
                if (searchSelectedItem.getPlaceId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, searchSelectedItem.getPlaceId());
                }
                if (searchSelectedItem.getMainText() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, searchSelectedItem.getMainText());
                }
                if (searchSelectedItem.getSecondaryText() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, searchSelectedItem.getSecondaryText());
                }
                supportSQLiteStatement.bindLong(4, searchSelectedItem.getSearchCurrentMilliseconds());
            }
        };
    }

    public void addSearchItem(SearchSelectedItem searchSelectedItem) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSearchSelectedItem.insert(searchSelectedItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<SearchSelectedItem> getRecentSearches() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM SearchSelectedItem ORDER BY searchCurrentMilliseconds DESC", 0);
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("placeId");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("mainText");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("secondaryText");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("searchCurrentMilliseconds");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new SearchSelectedItem(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
