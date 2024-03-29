package com.android.p023dx.dex.file;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.util.AnnotatedOutput;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.OffsettedItem */
public abstract class OffsettedItem extends Item implements Comparable<OffsettedItem> {
    private Section addedTo;
    private final int alignment;
    private int offset;
    private int writeSize;

    public OffsettedItem(int i, int i2) {
        Section.validateAlignment(i);
        if (i2 >= -1) {
            this.alignment = i;
            this.writeSize = i2;
            this.addedTo = null;
            this.offset = -1;
            return;
        }
        throw new IllegalArgumentException("writeSize < -1");
    }

    public static int getAbsoluteOffsetOr0(OffsettedItem offsettedItem) {
        if (offsettedItem == null) {
            return 0;
        }
        return offsettedItem.getAbsoluteOffset();
    }

    /* access modifiers changed from: protected */
    public int compareTo0(OffsettedItem offsettedItem) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsettedItem offsettedItem = (OffsettedItem) obj;
        if (itemType() == offsettedItem.itemType() && compareTo0(offsettedItem) == 0) {
            return true;
        }
        return false;
    }

    public final int getAbsoluteOffset() {
        int i = this.offset;
        if (i >= 0) {
            return this.addedTo.getAbsoluteOffset(i);
        }
        throw new RuntimeException("offset not yet known");
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final int getRelativeOffset() {
        int i = this.offset;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("offset not yet known");
    }

    public final String offsetString() {
        return '[' + Integer.toHexString(getAbsoluteOffset()) + ']';
    }

    public final int place(Section section, int i) {
        Objects.requireNonNull(section, "addedTo == null");
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        } else if (this.addedTo == null) {
            int i2 = this.alignment - 1;
            int i3 = (i + i2) & (~i2);
            this.addedTo = section;
            this.offset = i3;
            place0(section, i3);
            return i3;
        } else {
            throw new RuntimeException("already written");
        }
    }

    /* access modifiers changed from: protected */
    public void place0(Section section, int i) {
    }

    public final void setWriteSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        } else if (this.writeSize < 0) {
            this.writeSize = i;
        } else {
            throw new UnsupportedOperationException("writeSize already set");
        }
    }

    public abstract String toHuman();

    public final int writeSize() {
        int i = this.writeSize;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    public final void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
        try {
            if (this.writeSize >= 0) {
                annotatedOutput.assertCursor(getAbsoluteOffset());
                writeTo0(dexFile, annotatedOutput);
                return;
            }
            throw new UnsupportedOperationException("writeSize is unknown");
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, "...while writing " + this);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput);

    public final int compareTo(OffsettedItem offsettedItem) {
        if (this == offsettedItem) {
            return 0;
        }
        ItemType itemType = itemType();
        ItemType itemType2 = offsettedItem.itemType();
        if (itemType != itemType2) {
            return itemType.compareTo(itemType2);
        }
        return compareTo0(offsettedItem);
    }
}
