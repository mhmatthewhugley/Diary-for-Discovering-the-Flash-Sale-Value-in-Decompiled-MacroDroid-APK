package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C13584h;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo71668d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "", "T", "Landroidx/paging/PageEvent$Drop;", "event", "Lja/u;", "handlePageDrop", "Landroidx/paging/PageEvent$Insert;", "handleInsert", "Landroidx/paging/PageEvent$LoadStateUpdate;", "handleLoadStateUpdate", "Landroidx/paging/PageEvent;", "add", "", "getAsEvents", "", "placeholdersBefore", "I", "placeholdersAfter", "Lkotlin/collections/h;", "Landroidx/paging/TransformablePage;", "pages", "Lkotlin/collections/h;", "Landroidx/paging/MutableLoadStateCollection;", "sourceStates", "Landroidx/paging/MutableLoadStateCollection;", "Landroidx/paging/LoadStates;", "mediatorStates", "Landroidx/paging/LoadStates;", "", "receivedFirstEvent", "Z", "<init>", "()V", "paging-common"}, mo71669k = 1, mo71670mv = {1, 5, 1})
@VisibleForTesting(otherwise = 2)
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageEventStorage<T> {
    private LoadStates mediatorStates;
    private final C13584h<TransformablePage<T>> pages = new C13584h<>();
    private int placeholdersAfter;
    private int placeholdersBefore;
    private boolean receivedFirstEvent;
    private final MutableLoadStateCollection sourceStates = new MutableLoadStateCollection();

    @Metadata(mo71669k = 3, mo71670mv = {1, 5, 1}, mo71672xi = 48)
    /* compiled from: CachedPageEventFlow.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
            iArr[LoadType.REFRESH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void handleInsert(PageEvent.Insert<T> insert) {
        this.sourceStates.set(insert.getSourceLoadStates());
        this.mediatorStates = insert.getMediatorLoadStates();
        int i = WhenMappings.$EnumSwitchMapping$0[insert.getLoadType().ordinal()];
        if (i == 1) {
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            Iterator it = C16792h.m99547i(insert.getPages().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.pages.addFirst(insert.getPages().get(((C13603n0) it).nextInt()));
            }
        } else if (i == 2) {
            this.placeholdersAfter = insert.getPlaceholdersAfter();
            this.pages.addAll(insert.getPages());
        } else if (i == 3) {
            this.pages.clear();
            this.placeholdersAfter = insert.getPlaceholdersAfter();
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            this.pages.addAll(insert.getPages());
        }
    }

    private final void handleLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate) {
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
    }

    private final void handlePageDrop(PageEvent.Drop<T> drop) {
        this.sourceStates.set(drop.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
        int i = WhenMappings.$EnumSwitchMapping$0[drop.getLoadType().ordinal()];
        int i2 = 0;
        if (i == 1) {
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            int pageCount = drop.getPageCount();
            while (i2 < pageCount) {
                this.pages.removeFirst();
                i2++;
            }
        } else if (i == 2) {
            this.placeholdersAfter = drop.getPlaceholdersRemaining();
            int pageCount2 = drop.getPageCount();
            while (i2 < pageCount2) {
                this.pages.removeLast();
                i2++;
            }
        } else {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
    }

    public final void add(PageEvent<T> pageEvent) {
        C13706o.m87929f(pageEvent, NotificationCompat.CATEGORY_EVENT);
        this.receivedFirstEvent = true;
        if (pageEvent instanceof PageEvent.Insert) {
            handleInsert((PageEvent.Insert) pageEvent);
        } else if (pageEvent instanceof PageEvent.Drop) {
            handlePageDrop((PageEvent.Drop) pageEvent);
        } else if (pageEvent instanceof PageEvent.LoadStateUpdate) {
            handleLoadStateUpdate((PageEvent.LoadStateUpdate) pageEvent);
        }
    }

    public final List<PageEvent<T>> getAsEvents() {
        if (!this.receivedFirstEvent) {
            return C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList();
        LoadStates snapshot = this.sourceStates.snapshot();
        if (!this.pages.isEmpty()) {
            arrayList.add(PageEvent.Insert.Companion.Refresh(C13566b0.m87402F0(this.pages), this.placeholdersBefore, this.placeholdersAfter, snapshot, this.mediatorStates));
        } else {
            arrayList.add(new PageEvent.LoadStateUpdate(snapshot, this.mediatorStates));
        }
        return arrayList;
    }
}
