package com.oneclickaway.opensource.placeautocomplete.utils;

import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002J$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n¨\u0006\u0013"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy;", "", "()V", "getHasMap", "Ljava/util/TreeMap;", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$TimeContainer;", "Ljava/util/ArrayList;", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "Lkotlin/collections/ArrayList;", "listOfOptions", "", "groupDataByTime", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "myOption", "DateItem", "GeneralItem", "GroupComparator", "ListItem", "TimeContainer", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
/* compiled from: GroupStrategy.kt */
public final class GroupStrategy {

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$DateItem;", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getType", "", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: GroupStrategy.kt */
    public static final class DateItem extends ListItem {
        public String date;

        public final String getDate() {
            String str = this.date;
            if (str == null) {
                C13706o.m87945v("date");
            }
            return str;
        }

        public int getType() {
            return 101;
        }

        public final void setDate(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.date = str;
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$GeneralItem;", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "()V", "searchSelectedItem", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "getSearchSelectedItem", "()Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "setSearchSelectedItem", "(Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;)V", "getType", "", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: GroupStrategy.kt */
    public static final class GeneralItem extends ListItem {
        public SearchSelectedItem searchSelectedItem;

        public final SearchSelectedItem getSearchSelectedItem() {
            SearchSelectedItem searchSelectedItem2 = this.searchSelectedItem;
            if (searchSelectedItem2 == null) {
                C13706o.m87945v("searchSelectedItem");
            }
            return searchSelectedItem2;
        }

        public int getType() {
            return 102;
        }

        public final void setSearchSelectedItem(SearchSelectedItem searchSelectedItem2) {
            C13706o.m87930g(searchSelectedItem2, "<set-?>");
            this.searchSelectedItem = searchSelectedItem2;
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$GroupComparator;", "Ljava/util/Comparator;", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$TimeContainer;", "()V", "compare", "", "p0", "p1", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: GroupStrategy.kt */
    public static final class GroupComparator implements Comparator<TimeContainer> {
        public int compare(TimeContainer timeContainer, TimeContainer timeContainer2) {
            if (timeContainer == null) {
                C13706o.m87939p();
            }
            long timeInMilliseconds = timeContainer.getTimeInMilliseconds();
            if (timeContainer2 == null) {
                C13706o.m87939p();
            }
            return timeInMilliseconds < timeContainer2.getTimeInMilliseconds() ? 1 : -1;
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "", "()V", "getType", "", "Companion", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: GroupStrategy.kt */
    public static abstract class ListItem {
        public static final Companion Companion = new Companion((C13695i) null);
        public static final int TYPE_DATE = 101;
        public static final int TYPE_GENERAL_ITEM = 102;

        @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem$Companion;", "", "()V", "TYPE_DATE", "", "TYPE_GENERAL_ITEM", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
        /* compiled from: GroupStrategy.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C13695i iVar) {
                this();
            }
        }

        public abstract int getType();
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$TimeContainer;", "", "nowTime", "", "timeInMilliseconds", "", "(Ljava/lang/String;J)V", "getNowTime", "()Ljava/lang/String;", "setNowTime", "(Ljava/lang/String;)V", "getTimeInMilliseconds", "()J", "setTimeInMilliseconds", "(J)V", "equals", "", "other", "hashCode", "", "toString", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 1, 15})
    /* compiled from: GroupStrategy.kt */
    public static final class TimeContainer {
        private String nowTime;
        private long timeInMilliseconds;

        public TimeContainer(String str, long j) {
            C13706o.m87930g(str, "nowTime");
            this.nowTime = str;
            this.timeInMilliseconds = j;
        }

        public boolean equals(Object obj) {
            if (obj instanceof TimeContainer) {
                return C13706o.m87924a(this.nowTime, ((TimeContainer) obj).nowTime);
            }
            return false;
        }

        public final String getNowTime() {
            return this.nowTime;
        }

        public final long getTimeInMilliseconds() {
            return this.timeInMilliseconds;
        }

        public int hashCode() {
            StringBuilder sb = new StringBuilder();
            sb.append("hashCode: ");
            sb.append(this.nowTime.hashCode());
            return this.nowTime.hashCode();
        }

        public final void setNowTime(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.nowTime = str;
        }

        public final void setTimeInMilliseconds(long j) {
            this.timeInMilliseconds = j;
        }

        public String toString() {
            return "TimeContainer(nowTime='" + this.nowTime + "', timeInMilliseconds=" + this.timeInMilliseconds + ')';
        }
    }

    private final TreeMap<TimeContainer, ArrayList<SearchSelectedItem>> getHasMap(List<SearchSelectedItem> list) {
        HashMap hashMap = new HashMap();
        for (SearchSelectedItem next : list) {
            TimeContainer timeContainer = new TimeContainer(Commons.INSTANCE.getPrettyTime(next.getSearchCurrentMilliseconds()), next.getSearchCurrentMilliseconds());
            if (hashMap.containsKey(timeContainer)) {
                ArrayList arrayList = (ArrayList) hashMap.get(timeContainer);
                if (arrayList != null) {
                    arrayList.add(next);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                hashMap.put(timeContainer, arrayList2);
            }
        }
        TreeMap<TimeContainer, ArrayList<SearchSelectedItem>> treeMap = new TreeMap<>(new GroupComparator());
        treeMap.putAll(hashMap);
        return treeMap;
    }

    public final ArrayList<ListItem> groupDataByTime(List<SearchSelectedItem> list) {
        C13706o.m87930g(list, "myOption");
        ArrayList<ListItem> arrayList = new ArrayList<>();
        for (Map.Entry next : getHasMap(list).entrySet()) {
            DateItem dateItem = new DateItem();
            dateItem.setDate(((TimeContainer) next.getKey()).getNowTime());
            arrayList.add(dateItem);
            Iterator it = ((ArrayList) next.getValue()).iterator();
            while (it.hasNext()) {
                SearchSelectedItem searchSelectedItem = (SearchSelectedItem) it.next();
                GeneralItem generalItem = new GeneralItem();
                C13706o.m87925b(searchSelectedItem, "itemList");
                generalItem.setSearchSelectedItem(searchSelectedItem);
                arrayList.add(generalItem);
            }
        }
        return arrayList;
    }
}
