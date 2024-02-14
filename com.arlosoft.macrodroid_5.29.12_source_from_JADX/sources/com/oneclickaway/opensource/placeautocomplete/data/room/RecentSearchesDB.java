package com.oneclickaway.opensource.placeautocomplete.data.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Database(entities = {SearchSelectedItem.class}, exportSchema = false, version = 1)
@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "Landroidx/room/RoomDatabase;", "()V", "repDao", "Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDAO;", "Companion", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: RecentSearchesDB.kt */
public abstract class RecentSearchesDB extends RoomDatabase {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static RecentSearchesDB INSTANCE;

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB$Companion;", "", "()V", "INSTANCE", "Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "getINSTANCE", "()Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "setINSTANCE", "(Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;)V", "getInstance", "context", "Landroid/content/Context;", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: RecentSearchesDB.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final RecentSearchesDB getINSTANCE() {
            return RecentSearchesDB.INSTANCE;
        }

        public final RecentSearchesDB getInstance(Context context) {
            C13706o.m87930g(context, "context");
            if (getINSTANCE() == null) {
                setINSTANCE(Room.databaseBuilder(context.getApplicationContext(), RecentSearchesDB.class, "recent_searches").build());
            } else {
                getINSTANCE();
            }
            return getINSTANCE();
        }

        public final void setINSTANCE(RecentSearchesDB recentSearchesDB) {
            RecentSearchesDB.INSTANCE = recentSearchesDB;
        }
    }

    public abstract RecentSearchesDAO repDao();
}
