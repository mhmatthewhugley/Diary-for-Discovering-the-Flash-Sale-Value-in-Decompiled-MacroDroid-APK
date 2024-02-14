package com.android.p023dx.dex.file;

import com.android.p023dx.dex.file.OffsettedItem;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.List;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.UniformListItem */
public final class UniformListItem<T extends OffsettedItem> extends OffsettedItem {
    private static final int HEADER_SIZE = 4;
    private final ItemType itemType;
    private final List<T> items;

    public UniformListItem(ItemType itemType2, List<T> list) {
        super(getAlignment(list), writeSize(list));
        Objects.requireNonNull(itemType2, "itemType == null");
        this.items = list;
        this.itemType = itemType2;
    }

    private static int getAlignment(List<? extends OffsettedItem> list) {
        try {
            return Math.max(4, ((OffsettedItem) list.get(0)).getAlignment());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    private int headerSize() {
        return getAlignment();
    }

    private static int writeSize(List<? extends OffsettedItem> list) {
        return (list.size() * ((OffsettedItem) list.get(0)).writeSize()) + getAlignment(list);
    }

    public void addContents(DexFile dexFile) {
        for (T addContents : this.items) {
            addContents.addContents(dexFile);
        }
    }

    public final List<T> getItems() {
        return this.items;
    }

    public ItemType itemType() {
        return this.itemType;
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
        int headerSize = i + headerSize();
        int i2 = -1;
        int i3 = -1;
        boolean z = true;
        for (T t : this.items) {
            int writeSize = t.writeSize();
            if (z) {
                i3 = t.getAlignment();
                i2 = writeSize;
                z = false;
            } else if (writeSize != i2) {
                throw new UnsupportedOperationException("item size mismatch");
            } else if (t.getAlignment() != i3) {
                throw new UnsupportedOperationException("item alignment mismatch");
            }
            headerSize = t.place(section, headerSize) + writeSize;
        }
    }

    public final String toHuman() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("{");
        boolean z = true;
        for (T t : this.items) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(", ");
            }
            stringBuffer.append(t.toHuman());
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(UniformListItem.class.getName());
        stringBuffer.append(this.items);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int size = this.items.size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + " " + typeName());
            StringBuilder sb = new StringBuilder();
            sb.append("  size: ");
            sb.append(Hex.m909u4(size));
            annotatedOutput.annotate(4, sb.toString());
        }
        annotatedOutput.writeInt(size);
        for (T writeTo : this.items) {
            writeTo.writeTo(dexFile, annotatedOutput);
        }
    }
}
