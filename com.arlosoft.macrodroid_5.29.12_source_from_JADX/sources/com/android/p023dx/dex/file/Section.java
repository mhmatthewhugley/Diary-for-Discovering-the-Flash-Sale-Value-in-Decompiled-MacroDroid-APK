package com.android.p023dx.dex.file;

import com.android.p023dx.util.AnnotatedOutput;
import java.util.Collection;
import java.util.Objects;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.dex.file.Section */
public abstract class Section {
    private final int alignment;
    private final DexFile file;
    private int fileOffset = -1;
    private final String name;
    private boolean prepared = false;

    public Section(String str, DexFile dexFile, int i) {
        Objects.requireNonNull(dexFile, "file == null");
        validateAlignment(i);
        this.name = str;
        this.file = dexFile;
        this.alignment = i;
    }

    public static void validateAlignment(int i) {
        if (i <= 0 || (i & (i - 1)) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
    }

    /* access modifiers changed from: protected */
    public final void align(AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
    }

    public abstract int getAbsoluteItemOffset(Item item);

    public final int getAbsoluteOffset(int i) {
        if (i >= 0) {
            int i2 = this.fileOffset;
            if (i2 >= 0) {
                return i2 + i;
            }
            throw new RuntimeException("fileOffset not yet set");
        }
        throw new IllegalArgumentException("relative < 0");
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final DexFile getFile() {
        return this.file;
    }

    public final int getFileOffset() {
        int i = this.fileOffset;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* access modifiers changed from: protected */
    public final String getName() {
        return this.name;
    }

    public abstract Collection<? extends Item> items();

    public final void prepare() {
        throwIfPrepared();
        prepare0();
        this.prepared = true;
    }

    /* access modifiers changed from: protected */
    public abstract void prepare0();

    public final int setFileOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        } else if (this.fileOffset < 0) {
            int i2 = this.alignment - 1;
            int i3 = (i + i2) & (~i2);
            this.fileOffset = i3;
            return i3;
        } else {
            throw new RuntimeException("fileOffset already set");
        }
    }

    /* access modifiers changed from: protected */
    public final void throwIfNotPrepared() {
        if (!this.prepared) {
            throw new RuntimeException("not prepared");
        }
    }

    /* access modifiers changed from: protected */
    public final void throwIfPrepared() {
        if (this.prepared) {
            throw new RuntimeException("already prepared");
        }
    }

    public abstract int writeSize();

    public final void writeTo(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        align(annotatedOutput);
        int cursor = annotatedOutput.getCursor();
        int i = this.fileOffset;
        if (i < 0) {
            this.fileOffset = cursor;
        } else if (i != cursor) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + cursor + ", but expected " + this.fileOffset);
        }
        if (annotatedOutput.annotates()) {
            if (this.name != null) {
                annotatedOutput.annotate(0, IOUtils.LINE_SEPARATOR_UNIX + this.name + ":");
            } else if (cursor != 0) {
                annotatedOutput.annotate(0, IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        writeTo0(annotatedOutput);
    }

    /* access modifiers changed from: protected */
    public abstract void writeTo0(AnnotatedOutput annotatedOutput);
}
