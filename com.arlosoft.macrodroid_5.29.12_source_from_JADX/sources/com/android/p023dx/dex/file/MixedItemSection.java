package com.android.p023dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.dex.file.MixedItemSection */
public final class MixedItemSection extends Section {
    private static final Comparator<OffsettedItem> TYPE_SORTER = new Comparator<OffsettedItem>() {
        public int compare(OffsettedItem offsettedItem, OffsettedItem offsettedItem2) {
            return offsettedItem.itemType().compareTo(offsettedItem2.itemType());
        }
    };
    private final HashMap<OffsettedItem, OffsettedItem> interns = new HashMap<>(100);
    private final ArrayList<OffsettedItem> items = new ArrayList<>(100);
    private final SortType sort;
    private int writeSize;

    /* renamed from: com.android.dx.dex.file.MixedItemSection$2 */
    static /* synthetic */ class C15442 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.android.dx.dex.file.MixedItemSection$SortType[] r0 = com.android.p023dx.dex.file.MixedItemSection.SortType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType = r0
                com.android.dx.dex.file.MixedItemSection$SortType r1 = com.android.p023dx.dex.file.MixedItemSection.SortType.INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.dx.dex.file.MixedItemSection$SortType r1 = com.android.p023dx.dex.file.MixedItemSection.SortType.TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.dex.file.MixedItemSection.C15442.<clinit>():void");
        }
    }

    /* renamed from: com.android.dx.dex.file.MixedItemSection$SortType */
    enum SortType {
        NONE,
        TYPE,
        INSTANCE
    }

    public MixedItemSection(String str, DexFile dexFile, int i, SortType sortType) {
        super(str, dexFile, i);
        this.sort = sortType;
        this.writeSize = -1;
    }

    public void add(OffsettedItem offsettedItem) {
        throwIfPrepared();
        try {
            if (offsettedItem.getAlignment() <= getAlignment()) {
                this.items.add(offsettedItem);
                return;
            }
            throw new IllegalArgumentException("incompatible item alignment");
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    public <T extends OffsettedItem> T get(T t) {
        throwIfNotPrepared();
        T t2 = (OffsettedItem) this.interns.get(t);
        if (t2 != null) {
            return t2;
        }
        throw new NoSuchElementException(t.toString());
    }

    public int getAbsoluteItemOffset(Item item) {
        return ((OffsettedItem) item).getAbsoluteOffset();
    }

    public synchronized <T extends OffsettedItem> T intern(T t) {
        throwIfPrepared();
        T t2 = (OffsettedItem) this.interns.get(t);
        if (t2 != null) {
            return t2;
        }
        add(t);
        this.interns.put(t, t);
        return t;
    }

    public Collection<? extends Item> items() {
        return this.items;
    }

    public void placeItems() {
        throwIfNotPrepared();
        int i = C15442.$SwitchMap$com$android$dx$dex$file$MixedItemSection$SortType[this.sort.ordinal()];
        if (i == 1) {
            Collections.sort(this.items);
        } else if (i == 2) {
            Collections.sort(this.items, TYPE_SORTER);
        }
        int size = this.items.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            OffsettedItem offsettedItem = this.items.get(i2);
            try {
                int place = offsettedItem.place(this, i3);
                if (place >= i3) {
                    i3 = offsettedItem.writeSize() + place;
                    i2++;
                } else {
                    throw new RuntimeException("bogus place() result for " + offsettedItem);
                }
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, "...while placing " + offsettedItem);
            }
        }
        this.writeSize = i3;
    }

    /* access modifiers changed from: protected */
    public void prepare0() {
        DexFile file = getFile();
        int i = 0;
        while (true) {
            int size = this.items.size();
            if (i < size) {
                while (i < size) {
                    this.items.get(i).addContents(file);
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public int size() {
        return this.items.size();
    }

    public void writeHeaderPart(AnnotatedOutput annotatedOutput) {
        int i;
        throwIfNotPrepared();
        int i2 = this.writeSize;
        if (i2 != -1) {
            if (i2 == 0) {
                i = 0;
            } else {
                i = getFileOffset();
            }
            String name = getName();
            if (name == null) {
                name = "<unnamed>";
            }
            char[] cArr = new char[(15 - name.length())];
            Arrays.fill(cArr, ' ');
            String str = new String(cArr);
            if (annotatedOutput.annotates()) {
                annotatedOutput.annotate(4, name + "_size:" + str + Hex.m909u4(i2));
                annotatedOutput.annotate(4, name + "_off: " + str + Hex.m909u4(i));
            }
            annotatedOutput.writeInt(i2);
            annotatedOutput.writeInt(i);
            return;
        }
        throw new RuntimeException("write size not yet set");
    }

    public void writeIndexAnnotation(AnnotatedOutput annotatedOutput, ItemType itemType, String str) {
        throwIfNotPrepared();
        TreeMap treeMap = new TreeMap();
        Iterator<OffsettedItem> it = this.items.iterator();
        while (it.hasNext()) {
            OffsettedItem next = it.next();
            if (next.itemType() == itemType) {
                treeMap.put(next.toHuman(), next);
            }
        }
        if (treeMap.size() != 0) {
            annotatedOutput.annotate(0, str);
            for (Map.Entry entry : treeMap.entrySet()) {
                annotatedOutput.annotate(0, ((OffsettedItem) entry.getValue()).offsetString() + ' ' + ((String) entry.getKey()) + 10);
            }
        }
    }

    public int writeSize() {
        throwIfNotPrepared();
        return this.writeSize;
    }

    /* access modifiers changed from: protected */
    public void writeTo0(AnnotatedOutput annotatedOutput) {
        boolean annotates = annotatedOutput.annotates();
        DexFile file = getFile();
        Iterator<OffsettedItem> it = this.items.iterator();
        int i = 0;
        boolean z = true;
        while (it.hasNext()) {
            OffsettedItem next = it.next();
            if (annotates) {
                if (z) {
                    z = false;
                } else {
                    annotatedOutput.annotate(0, IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
            int alignment = next.getAlignment() - 1;
            int i2 = (~alignment) & (i + alignment);
            if (i != i2) {
                annotatedOutput.writeZeroes(i2 - i);
                i = i2;
            }
            next.writeTo(file, annotatedOutput);
            i += next.writeSize();
        }
        if (i != this.writeSize) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
