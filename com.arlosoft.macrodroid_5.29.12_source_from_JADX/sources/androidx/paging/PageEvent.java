package androidx.paging;

import androidx.paging.LoadState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\b\u0001\u0003\u0013\u0014\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo71668d2 = {"Landroidx/paging/PageEvent;", "", "T", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "transform", "map", "(Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "flatMap", "", "predicate", "filter", "<init>", "()V", "Drop", "Insert", "LoadStateUpdate", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* compiled from: PageEvent.kt */
public abstract class PageEvent<T> {

    @Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, mo71668d2 = {"Landroidx/paging/PageEvent$Drop;", "T", "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "minPageOffset", "", "maxPageOffset", "placeholdersRemaining", "(Landroidx/paging/LoadType;III)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMaxPageOffset", "()I", "getMinPageOffset", "pageCount", "getPageCount", "getPlaceholdersRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageEvent.kt */
    public static final class Drop<T> extends PageEvent<T> {
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Drop(LoadType loadType2, int i, int i2, int i3) {
            super((C13695i) null);
            C13706o.m87929f(loadType2, "loadType");
            this.loadType = loadType2;
            this.minPageOffset = i;
            this.maxPageOffset = i2;
            this.placeholdersRemaining = i3;
            boolean z = true;
            if (loadType2 != LoadType.REFRESH) {
                if (getPageCount() > 0) {
                    if (!(i3 < 0 ? false : z)) {
                        throw new IllegalArgumentException(C13706o.m87936m("Invalid placeholdersRemaining ", Integer.valueOf(getPlaceholdersRemaining())).toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(C13706o.m87936m("Drop count must be > 0, but was ", Integer.valueOf(getPageCount())).toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        public static /* synthetic */ Drop copy$default(Drop drop, LoadType loadType2, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                loadType2 = drop.loadType;
            }
            if ((i4 & 2) != 0) {
                i = drop.minPageOffset;
            }
            if ((i4 & 4) != 0) {
                i2 = drop.maxPageOffset;
            }
            if ((i4 & 8) != 0) {
                i3 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType2, i, i2, i3);
        }

        public final LoadType component1() {
            return this.loadType;
        }

        public final int component2() {
            return this.minPageOffset;
        }

        public final int component3() {
            return this.maxPageOffset;
        }

        public final int component4() {
            return this.placeholdersRemaining;
        }

        public final Drop<T> copy(LoadType loadType2, int i, int i2, int i3) {
            C13706o.m87929f(loadType2, "loadType");
            return new Drop<>(loadType2, i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) obj;
            return this.loadType == drop.loadType && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public int hashCode() {
            return (((((this.loadType.hashCode() * 31) + this.minPageOffset) * 31) + this.maxPageOffset) * 31) + this.placeholdersRemaining;
        }

        public String toString() {
            return "Drop(loadType=" + this.loadType + ", minPageOffset=" + this.minPageOffset + ", maxPageOffset=" + this.maxPageOffset + ", placeholdersRemaining=" + this.placeholdersRemaining + ')';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0016\b\b\u0018\u0000 ;*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001;BI\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001c\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b9\u0010:J9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\u0005H\bJO\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012*\u0010\u0007\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00060\t0\u0005H\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00110\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0010J=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH@ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001d\u001a\u00020\u001cHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001cHÆ\u0003JY\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00162\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t2\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u001c2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\t\u0010'\u001a\u00020&HÖ\u0001J\t\u0010(\u001a\u00020\u0019HÖ\u0001J\u0013\u0010*\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001f\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\t8\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b/\u00100R\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b2\u00103R\u0017\u0010\"\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b4\u00103R\u0017\u0010#\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b6\u00107R\u0019\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b8\u00107\u0002\u000b\n\u0005\b20\u0001\n\u0002\b\u0019¨\u0006<"}, mo71668d2 = {"Landroidx/paging/PageEvent$Insert;", "", "T", "Landroidx/paging/PageEvent;", "R", "Lkotlin/Function1;", "Landroidx/paging/TransformablePage;", "transform", "mapPages", "", "transformPages$paging_common", "(Lqa/l;)Landroidx/paging/PageEvent$Insert;", "transformPages", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "map", "(Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "flatMap", "", "predicate", "filter", "Landroidx/paging/LoadType;", "component1", "component2", "", "component3", "component4", "Landroidx/paging/LoadStates;", "component5", "component6", "loadType", "pages", "placeholdersBefore", "placeholdersAfter", "sourceLoadStates", "mediatorLoadStates", "copy", "", "toString", "hashCode", "other", "equals", "Landroidx/paging/LoadType;", "getLoadType", "()Landroidx/paging/LoadType;", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "I", "getPlaceholdersBefore", "()I", "getPlaceholdersAfter", "Landroidx/paging/LoadStates;", "getSourceLoadStates", "()Landroidx/paging/LoadStates;", "getMediatorLoadStates", "<init>", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "Companion", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
    /* compiled from: PageEvent.kt */
    public static final class Insert<T> extends PageEvent<T> {
        public static final Companion Companion;
        /* access modifiers changed from: private */
        public static final Insert<Object> EMPTY_REFRESH_LOCAL;
        private final LoadType loadType;
        private final LoadStates mediatorLoadStates;
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final LoadStates sourceLoadStates;

        @Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, mo71668d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "()V", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "Append", "T", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "Prepend", "placeholdersBefore", "Refresh", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
        /* compiled from: PageEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C13695i iVar) {
                this();
            }

            public static /* synthetic */ Insert Append$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Append(list, i, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Prepend$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Prepend(list, i, loadStates, loadStates2);
            }

            public static /* synthetic */ Insert Refresh$default(Companion companion, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
                if ((i3 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.Refresh(list, i, i2, loadStates, loadStates2);
            }

            public final <T> Insert<T> Append(List<TransformablePage<T>> list, int i, LoadStates loadStates, LoadStates loadStates2) {
                C13706o.m87929f(list, "pages");
                C13706o.m87929f(loadStates, "sourceLoadStates");
                return new Insert(LoadType.APPEND, list, -1, i, loadStates, loadStates2, (C13695i) null);
            }

            public final <T> Insert<T> Prepend(List<TransformablePage<T>> list, int i, LoadStates loadStates, LoadStates loadStates2) {
                C13706o.m87929f(list, "pages");
                C13706o.m87929f(loadStates, "sourceLoadStates");
                return new Insert(LoadType.PREPEND, list, i, -1, loadStates, loadStates2, (C13695i) null);
            }

            public final <T> Insert<T> Refresh(List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
                C13706o.m87929f(list, "pages");
                C13706o.m87929f(loadStates, "sourceLoadStates");
                return new Insert(LoadType.REFRESH, list, i, i2, loadStates, loadStates2, (C13695i) null);
            }

            public final Insert<Object> getEMPTY_REFRESH_LOCAL() {
                return Insert.EMPTY_REFRESH_LOCAL;
            }
        }

        static {
            Companion companion = new Companion((C13695i) null);
            Companion = companion;
            List e = C13612s.m87736e(TransformablePage.Companion.getEMPTY_INITIAL_PAGE());
            LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.Companion;
            EMPTY_REFRESH_LOCAL = Companion.Refresh$default(companion, e, 0, 0, new LoadStates(companion2.getIncomplete$paging_common(), companion2.getComplete$paging_common(), companion2.getComplete$paging_common()), (LoadStates) null, 16, (Object) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ Insert(LoadType loadType2, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, C13695i iVar) {
            this(loadType2, list, i, i2, loadStates, (i3 & 32) != 0 ? null : loadStates2);
        }

        public /* synthetic */ Insert(LoadType loadType2, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, C13695i iVar) {
            this(loadType2, list, i, i2, loadStates, loadStates2);
        }

        public static /* synthetic */ Insert copy$default(Insert insert, LoadType loadType2, List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType2 = insert.loadType;
            }
            if ((i3 & 2) != 0) {
                list = insert.pages;
            }
            List<TransformablePage<T>> list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.placeholdersAfter;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                loadStates = insert.sourceLoadStates;
            }
            LoadStates loadStates3 = loadStates;
            if ((i3 & 32) != 0) {
                loadStates2 = insert.mediatorLoadStates;
            }
            return insert.copy(loadType2, list2, i4, i5, loadStates3, loadStates2);
        }

        private final <R> Insert<R> mapPages(C16265l<? super TransformablePage<T>, TransformablePage<R>> lVar) {
            LoadType loadType2 = getLoadType();
            List<Object> pages2 = getPages();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(pages2, 10));
            for (Object invoke : pages2) {
                arrayList.add(lVar.invoke(invoke));
            }
            return new Insert(loadType2, arrayList, getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), (C13695i) null);
        }

        public final LoadType component1() {
            return this.loadType;
        }

        public final List<TransformablePage<T>> component2() {
            return this.pages;
        }

        public final int component3() {
            return this.placeholdersBefore;
        }

        public final int component4() {
            return this.placeholdersAfter;
        }

        public final LoadStates component5() {
            return this.sourceLoadStates;
        }

        public final LoadStates component6() {
            return this.mediatorLoadStates;
        }

        public final Insert<T> copy(LoadType loadType2, List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            C13706o.m87929f(loadType2, "loadType");
            C13706o.m87929f(list, "pages");
            C13706o.m87929f(loadStates, "sourceLoadStates");
            return new Insert(loadType2, list, i, i2, loadStates, loadStates2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.loadType == insert.loadType && C13706o.m87924a(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && C13706o.m87924a(this.sourceLoadStates, insert.sourceLoadStates) && C13706o.m87924a(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object filter(p370qa.C16269p<? super T, ? super kotlin.coroutines.C13635d<? super java.lang.Boolean>, ? extends java.lang.Object> r19, kotlin.coroutines.C13635d<? super androidx.paging.PageEvent<T>> r20) {
            /*
                r18 = this;
                r0 = r20
                boolean r1 = r0 instanceof androidx.paging.PageEvent$Insert$filter$1
                if (r1 == 0) goto L_0x0017
                r1 = r0
                androidx.paging.PageEvent$Insert$filter$1 r1 = (androidx.paging.PageEvent$Insert$filter$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.label = r2
                r2 = r18
                goto L_0x001e
            L_0x0017:
                androidx.paging.PageEvent$Insert$filter$1 r1 = new androidx.paging.PageEvent$Insert$filter$1
                r2 = r18
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.result
                java.lang.Object r3 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r4 = r1.label
                r5 = 1
                if (r4 == 0) goto L_0x0076
                if (r4 != r5) goto L_0x006e
                int r4 = r1.I$1
                int r6 = r1.I$0
                java.lang.Object r7 = r1.L$10
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r1.L$9
                java.lang.Object r9 = r1.L$8
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r1.L$7
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r1.L$6
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r1.L$5
                androidx.paging.TransformablePage r12 = (androidx.paging.TransformablePage) r12
                java.lang.Object r13 = r1.L$4
                java.util.Iterator r13 = (java.util.Iterator) r13
                java.lang.Object r14 = r1.L$3
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r15 = r1.L$2
                androidx.paging.LoadType r15 = (androidx.paging.LoadType) r15
                java.lang.Object r5 = r1.L$1
                androidx.paging.PageEvent$Insert r5 = (androidx.paging.PageEvent.Insert) r5
                java.lang.Object r2 = r1.L$0
                qa.p r2 = (p370qa.C16269p) r2
                p297ja.C13332o.m85685b(r0)
                r16 = r5
                r5 = r3
                r3 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r7
                r7 = r16
                r17 = r14
                r14 = r6
                r6 = r17
                goto L_0x0104
            L_0x006e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0076:
                p297ja.C13332o.m85685b(r0)
                androidx.paging.LoadType r0 = r18.getLoadType()
                java.util.List r2 = r18.getPages()
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.C13616u.m87774u(r2, r5)
                r4.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
                r6 = r18
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r19
            L_0x0098:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x0148
                java.lang.Object r7 = r3.next()
                androidx.paging.TransformablePage r7 = (androidx.paging.TransformablePage) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List r10 = r7.getData()
                r11 = 0
                java.util.Iterator r10 = r10.iterator()
                r12 = r7
                r11 = r9
                r9 = r10
                r7 = r6
                r10 = r8
                r6 = r5
                r8 = r6
                r5 = r4
                r4 = 0
            L_0x00c0:
                boolean r13 = r9.hasNext()
                if (r13 == 0) goto L_0x0133
                java.lang.Object r13 = r9.next()
                int r14 = r4 + 1
                if (r4 >= 0) goto L_0x00d1
                kotlin.collections.C13614t.m87758t()
            L_0x00d1:
                r1.L$0 = r0
                r1.L$1 = r7
                r1.L$2 = r2
                r1.L$3 = r6
                r1.L$4 = r3
                r1.L$5 = r12
                r1.L$6 = r11
                r1.L$7 = r10
                r1.L$8 = r9
                r1.L$9 = r13
                r1.L$10 = r8
                r1.I$0 = r14
                r1.I$1 = r4
                r15 = 1
                r1.label = r15
                java.lang.Object r15 = r0.invoke(r13, r1)
                if (r15 != r5) goto L_0x00f5
                return r5
            L_0x00f5:
                r16 = r2
                r2 = r0
                r0 = r15
                r15 = r16
                r17 = r9
                r9 = r8
                r8 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r17
            L_0x0104:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x012a
                r11.add(r8)
                java.util.List r0 = r13.getHintOriginalIndices()
                if (r0 != 0) goto L_0x0116
                goto L_0x0123
            L_0x0116:
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L_0x011f
                goto L_0x0123
            L_0x011f:
                int r4 = r0.intValue()
            L_0x0123:
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r4)
                r12.add(r0)
            L_0x012a:
                r0 = r2
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r4 = r14
                r2 = r15
                goto L_0x00c0
            L_0x0133:
                androidx.paging.TransformablePage r4 = new androidx.paging.TransformablePage
                int[] r9 = r12.getOriginalPageOffsets()
                int r12 = r12.getHintOriginalPageOffset()
                r4.<init>(r9, r10, r12, r11)
                r8.add(r4)
                r4 = r5
                r5 = r6
                r6 = r7
                goto L_0x0098
            L_0x0148:
                r3 = r5
                java.util.List r3 = (java.util.List) r3
                int r4 = r6.getPlaceholdersBefore()
                int r5 = r6.getPlaceholdersAfter()
                androidx.paging.LoadStates r0 = r6.getSourceLoadStates()
                androidx.paging.LoadStates r7 = r6.getMediatorLoadStates()
                r8 = 0
                androidx.paging.PageEvent$Insert r9 = new androidx.paging.PageEvent$Insert
                r1 = r9
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.filter(qa.p, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0125 A[LOOP:0: B:30:0x011b->B:32:0x0125, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <R> java.lang.Object flatMap(p370qa.C16269p<? super T, ? super kotlin.coroutines.C13635d<? super java.lang.Iterable<? extends R>>, ? extends java.lang.Object> r19, kotlin.coroutines.C13635d<? super androidx.paging.PageEvent<R>> r20) {
            /*
                r18 = this;
                r0 = r20
                boolean r1 = r0 instanceof androidx.paging.PageEvent$Insert$flatMap$1
                if (r1 == 0) goto L_0x0017
                r1 = r0
                androidx.paging.PageEvent$Insert$flatMap$1 r1 = (androidx.paging.PageEvent$Insert$flatMap$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.label = r2
                r2 = r18
                goto L_0x001e
            L_0x0017:
                androidx.paging.PageEvent$Insert$flatMap$1 r1 = new androidx.paging.PageEvent$Insert$flatMap$1
                r2 = r18
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.result
                java.lang.Object r3 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r4 = r1.label
                r5 = 1
                if (r4 == 0) goto L_0x0076
                if (r4 != r5) goto L_0x006e
                int r4 = r1.I$1
                int r6 = r1.I$0
                java.lang.Object r7 = r1.L$10
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r1.L$9
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.Object r9 = r1.L$8
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r1.L$7
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r1.L$6
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r1.L$5
                androidx.paging.TransformablePage r12 = (androidx.paging.TransformablePage) r12
                java.lang.Object r13 = r1.L$4
                java.util.Iterator r13 = (java.util.Iterator) r13
                java.lang.Object r14 = r1.L$3
                java.util.Collection r14 = (java.util.Collection) r14
                java.lang.Object r15 = r1.L$2
                androidx.paging.LoadType r15 = (androidx.paging.LoadType) r15
                java.lang.Object r5 = r1.L$1
                androidx.paging.PageEvent$Insert r5 = (androidx.paging.PageEvent.Insert) r5
                java.lang.Object r2 = r1.L$0
                qa.p r2 = (p370qa.C16269p) r2
                p297ja.C13332o.m85685b(r0)
                r16 = r12
                r12 = r11
                r11 = r9
                r9 = r7
                r7 = r5
                r5 = r3
                r3 = r15
                r15 = 1
                r17 = r14
                r14 = r6
                r6 = r17
                goto L_0x0102
            L_0x006e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0076:
                p297ja.C13332o.m85685b(r0)
                androidx.paging.LoadType r0 = r18.getLoadType()
                java.util.List r2 = r18.getPages()
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.C13616u.m87774u(r2, r5)
                r4.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
                r6 = r18
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r19
            L_0x0098:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x014e
                java.lang.Object r7 = r3.next()
                androidx.paging.TransformablePage r7 = (androidx.paging.TransformablePage) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List r10 = r7.getData()
                r11 = 0
                java.util.Iterator r10 = r10.iterator()
                r12 = r7
                r11 = r9
                r7 = r6
                r9 = r8
                r6 = r5
                r8 = r6
                r5 = r4
                r4 = 0
            L_0x00bf:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x0138
                java.lang.Object r13 = r10.next()
                int r14 = r4 + 1
                if (r4 >= 0) goto L_0x00d0
                kotlin.collections.C13614t.m87758t()
            L_0x00d0:
                r1.L$0 = r0
                r1.L$1 = r7
                r1.L$2 = r2
                r1.L$3 = r6
                r1.L$4 = r3
                r1.L$5 = r12
                r1.L$6 = r11
                r1.L$7 = r9
                r1.L$8 = r10
                r1.L$9 = r9
                r1.L$10 = r8
                r1.I$0 = r14
                r1.I$1 = r4
                r15 = 1
                r1.label = r15
                java.lang.Object r13 = r0.invoke(r13, r1)
                if (r13 != r5) goto L_0x00f4
                return r5
            L_0x00f4:
                r16 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r10
                r17 = r2
                r2 = r0
                r0 = r13
                r13 = r3
                r3 = r17
            L_0x0102:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean unused = kotlin.collections.C13624y.m87797z(r8, r0)
                java.util.List r0 = r16.getHintOriginalIndices()
                if (r0 != 0) goto L_0x010e
                goto L_0x011b
            L_0x010e:
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 != 0) goto L_0x0117
                goto L_0x011b
            L_0x0117:
                int r4 = r0.intValue()
            L_0x011b:
                int r0 = r12.size()
                int r8 = r10.size()
                if (r0 >= r8) goto L_0x012d
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.C13654b.m87834b(r4)
                r12.add(r0)
                goto L_0x011b
            L_0x012d:
                r0 = r2
                r2 = r3
                r8 = r9
                r9 = r10
                r10 = r11
                r11 = r12
                r3 = r13
                r4 = r14
                r12 = r16
                goto L_0x00bf
            L_0x0138:
                r15 = 1
                androidx.paging.TransformablePage r4 = new androidx.paging.TransformablePage
                int[] r10 = r12.getOriginalPageOffsets()
                int r12 = r12.getHintOriginalPageOffset()
                r4.<init>(r10, r9, r12, r11)
                r8.add(r4)
                r4 = r5
                r5 = r6
                r6 = r7
                goto L_0x0098
            L_0x014e:
                r3 = r5
                java.util.List r3 = (java.util.List) r3
                int r4 = r6.getPlaceholdersBefore()
                int r5 = r6.getPlaceholdersAfter()
                androidx.paging.LoadStates r0 = r6.getSourceLoadStates()
                androidx.paging.LoadStates r7 = r6.getMediatorLoadStates()
                r8 = 0
                androidx.paging.PageEvent$Insert r9 = new androidx.paging.PageEvent$Insert
                r1 = r9
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.flatMap(qa.p, kotlin.coroutines.d):java.lang.Object");
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final List<TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public int hashCode() {
            int hashCode = ((((((((this.loadType.hashCode() * 31) + this.pages.hashCode()) * 31) + this.placeholdersBefore) * 31) + this.placeholdersAfter) * 31) + this.sourceLoadStates.hashCode()) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <R> java.lang.Object map(p370qa.C16269p<? super T, ? super kotlin.coroutines.C13635d<? super R>, ? extends java.lang.Object> r18, kotlin.coroutines.C13635d<? super androidx.paging.PageEvent<R>> r19) {
            /*
                r17 = this;
                r0 = r19
                boolean r1 = r0 instanceof androidx.paging.PageEvent$Insert$map$1
                if (r1 == 0) goto L_0x0017
                r1 = r0
                androidx.paging.PageEvent$Insert$map$1 r1 = (androidx.paging.PageEvent$Insert$map$1) r1
                int r2 = r1.label
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.label = r2
                r2 = r17
                goto L_0x001e
            L_0x0017:
                androidx.paging.PageEvent$Insert$map$1 r1 = new androidx.paging.PageEvent$Insert$map$1
                r2 = r17
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.result
                java.lang.Object r3 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r4 = r1.label
                r5 = 10
                r6 = 1
                if (r4 == 0) goto L_0x006d
                if (r4 != r6) goto L_0x0065
                java.lang.Object r4 = r1.L$10
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Object r7 = r1.L$9
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r1.L$8
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r1.L$7
                java.util.Collection r9 = (java.util.Collection) r9
                java.lang.Object r10 = r1.L$6
                int[] r10 = (int[]) r10
                java.lang.Object r11 = r1.L$5
                androidx.paging.TransformablePage r11 = (androidx.paging.TransformablePage) r11
                java.lang.Object r12 = r1.L$4
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r1.L$3
                java.util.Collection r13 = (java.util.Collection) r13
                java.lang.Object r14 = r1.L$2
                androidx.paging.LoadType r14 = (androidx.paging.LoadType) r14
                java.lang.Object r15 = r1.L$1
                androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
                java.lang.Object r6 = r1.L$0
                qa.p r6 = (p370qa.C16269p) r6
                p297ja.C13332o.m85685b(r0)
                r16 = r11
                r11 = r8
                r8 = r14
                r14 = r9
                r9 = r15
                r15 = 1
                goto L_0x00e2
            L_0x0065:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x006d:
                p297ja.C13332o.m85685b(r0)
                androidx.paging.LoadType r0 = r17.getLoadType()
                java.util.List r4 = r17.getPages()
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = kotlin.collections.C13616u.m87774u(r4, r5)
                r6.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
                r7 = r0
                r8 = r2
                r0 = r18
            L_0x0089:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x0104
                java.lang.Object r9 = r4.next()
                androidx.paging.TransformablePage r9 = (androidx.paging.TransformablePage) r9
                int[] r10 = r9.getOriginalPageOffsets()
                java.util.List r11 = r9.getData()
                java.util.ArrayList r12 = new java.util.ArrayList
                int r13 = kotlin.collections.C13616u.m87774u(r11, r5)
                r12.<init>(r13)
                java.util.Iterator r11 = r11.iterator()
                r13 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r4
                r4 = r7
            L_0x00b0:
                boolean r14 = r11.hasNext()
                if (r14 == 0) goto L_0x00ec
                java.lang.Object r14 = r11.next()
                r1.L$0 = r0
                r1.L$1 = r9
                r1.L$2 = r8
                r1.L$3 = r7
                r1.L$4 = r6
                r1.L$5 = r13
                r1.L$6 = r10
                r1.L$7 = r12
                r1.L$8 = r11
                r1.L$9 = r12
                r1.L$10 = r4
                r15 = 1
                r1.label = r15
                java.lang.Object r14 = r0.invoke(r14, r1)
                if (r14 != r3) goto L_0x00da
                return r3
            L_0x00da:
                r16 = r13
                r13 = r7
                r7 = r12
                r12 = r6
                r6 = r0
                r0 = r14
                r14 = r7
            L_0x00e2:
                r7.add(r0)
                r0 = r6
                r6 = r12
                r7 = r13
                r12 = r14
                r13 = r16
                goto L_0x00b0
            L_0x00ec:
                r15 = 1
                java.util.List r12 = (java.util.List) r12
                int r11 = r13.getHintOriginalPageOffset()
                java.util.List r13 = r13.getHintOriginalIndices()
                androidx.paging.TransformablePage r14 = new androidx.paging.TransformablePage
                r14.<init>(r10, r12, r11, r13)
                r4.add(r14)
                r4 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                goto L_0x0089
            L_0x0104:
                r0 = r6
                java.util.List r0 = (java.util.List) r0
                int r9 = r8.getPlaceholdersBefore()
                int r10 = r8.getPlaceholdersAfter()
                androidx.paging.LoadStates r11 = r8.getSourceLoadStates()
                androidx.paging.LoadStates r12 = r8.getMediatorLoadStates()
                r13 = 0
                androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
                r6 = r1
                r8 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent.Insert.map(qa.p, kotlin.coroutines.d):java.lang.Object");
        }

        public String toString() {
            return "Insert(loadType=" + this.loadType + ", pages=" + this.pages + ", placeholdersBefore=" + this.placeholdersBefore + ", placeholdersAfter=" + this.placeholdersAfter + ", sourceLoadStates=" + this.sourceLoadStates + ", mediatorLoadStates=" + this.mediatorLoadStates + ')';
        }

        public final <R> Insert<R> transformPages$paging_common(C16265l<? super List<TransformablePage<T>>, ? extends List<TransformablePage<R>>> lVar) {
            C13706o.m87929f(lVar, "transform");
            return new Insert(getLoadType(), (List) lVar.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), (C13695i) null);
        }

        private Insert(LoadType loadType2, List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            super((C13695i) null);
            this.loadType = loadType2;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            boolean z = false;
            if (loadType2 == LoadType.APPEND || i >= 0) {
                if (loadType2 == LoadType.PREPEND || i2 >= 0) {
                    if (!((loadType2 != LoadType.REFRESH || (list.isEmpty() ^ true)) ? true : z)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(C13706o.m87936m("Append insert defining placeholdersAfter must be > 0, but was ", Integer.valueOf(getPlaceholdersAfter())).toString());
            }
            throw new IllegalArgumentException(C13706o.m87936m("Prepend insert defining placeholdersBefore must be > 0, but was ", Integer.valueOf(getPlaceholdersBefore())).toString());
        }
    }

    @Metadata(mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, mo71668d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "T", "", "Landroidx/paging/PageEvent;", "source", "Landroidx/paging/LoadStates;", "mediator", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getMediator", "()Landroidx/paging/LoadStates;", "getSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: PageEvent.kt */
    public static final class LoadStateUpdate<T> extends PageEvent<T> {
        private final LoadStates mediator;
        private final LoadStates source;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2, int i, C13695i iVar) {
            this(loadStates, (i & 2) != 0 ? null : loadStates2);
        }

        public static /* synthetic */ LoadStateUpdate copy$default(LoadStateUpdate loadStateUpdate, LoadStates loadStates, LoadStates loadStates2, int i, Object obj) {
            if ((i & 1) != 0) {
                loadStates = loadStateUpdate.source;
            }
            if ((i & 2) != 0) {
                loadStates2 = loadStateUpdate.mediator;
            }
            return loadStateUpdate.copy(loadStates, loadStates2);
        }

        public final LoadStates component1() {
            return this.source;
        }

        public final LoadStates component2() {
            return this.mediator;
        }

        public final LoadStateUpdate<T> copy(LoadStates loadStates, LoadStates loadStates2) {
            C13706o.m87929f(loadStates, "source");
            return new LoadStateUpdate<>(loadStates, loadStates2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return C13706o.m87924a(this.source, loadStateUpdate.source) && C13706o.m87924a(this.mediator, loadStateUpdate.mediator);
        }

        public final LoadStates getMediator() {
            return this.mediator;
        }

        public final LoadStates getSource() {
            return this.source;
        }

        public int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public String toString() {
            return "LoadStateUpdate(source=" + this.source + ", mediator=" + this.mediator + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
            super((C13695i) null);
            C13706o.m87929f(loadStates, "source");
            this.source = loadStates;
            this.mediator = loadStates2;
        }
    }

    private PageEvent() {
    }

    public /* synthetic */ PageEvent(C13695i iVar) {
        this();
    }

    static /* synthetic */ Object filter$suspendImpl(PageEvent pageEvent, C16269p pVar, C13635d dVar) {
        return pageEvent;
    }

    static /* synthetic */ Object flatMap$suspendImpl(PageEvent pageEvent, C16269p pVar, C13635d dVar) {
        return pageEvent;
    }

    static /* synthetic */ Object map$suspendImpl(PageEvent pageEvent, C16269p pVar, C13635d dVar) {
        return pageEvent;
    }

    public Object filter(C16269p<? super T, ? super C13635d<? super Boolean>, ? extends Object> pVar, C13635d<? super PageEvent<T>> dVar) {
        return filter$suspendImpl(this, pVar, dVar);
    }

    public <R> Object flatMap(C16269p<? super T, ? super C13635d<? super Iterable<? extends R>>, ? extends Object> pVar, C13635d<? super PageEvent<R>> dVar) {
        return flatMap$suspendImpl(this, pVar, dVar);
    }

    public <R> Object map(C16269p<? super T, ? super C13635d<? super R>, ? extends Object> pVar, C13635d<? super PageEvent<R>> dVar) {
        return map$suspendImpl(this, pVar, dVar);
    }
}
