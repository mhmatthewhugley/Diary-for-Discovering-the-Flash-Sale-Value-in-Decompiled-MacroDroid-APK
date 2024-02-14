package com.android.p023dx.util;

import com.android.dex.Leb128;
import com.android.dex.util.ByteOutput;
import com.android.dex.util.ExceptionWithContext;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.util.ByteArrayAnnotatedOutput */
public final class ByteArrayAnnotatedOutput implements AnnotatedOutput, ByteOutput {
    private static final int DEFAULT_SIZE = 1000;
    private int annotationWidth;
    private ArrayList<Annotation> annotations;
    private int cursor;
    private byte[] data;
    private int hexCols;
    private final boolean stretchy;
    private boolean verbose;

    public ByteArrayAnnotatedOutput(byte[] bArr) {
        this(bArr, false);
    }

    private void ensureCapacity(int i) {
        byte[] bArr = this.data;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[((i * 2) + 1000)];
            System.arraycopy(bArr, 0, bArr2, 0, this.cursor);
            this.data = bArr2;
        }
    }

    private static void throwBounds() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    public void alignTo(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.cursor + i2) & (~i2);
        if (this.stretchy) {
            ensureCapacity(i3);
        } else if (i3 > this.data.length) {
            throwBounds();
            return;
        }
        this.cursor = i3;
    }

    public void annotate(String str) {
        if (this.annotations != null) {
            endAnnotation();
            this.annotations.add(new Annotation(this.cursor, str));
        }
    }

    public boolean annotates() {
        return this.annotations != null;
    }

    public void assertCursor(int i) {
        if (this.cursor != i) {
            throw new ExceptionWithContext("expected cursor " + i + "; actual value: " + this.cursor);
        }
    }

    public void enableAnnotations(int i, boolean z) {
        if (this.annotations != null || this.cursor != 0) {
            throw new RuntimeException("cannot enable annotations");
        } else if (i >= 40) {
            int i2 = (((i - 7) / 15) + 1) & -2;
            if (i2 < 6) {
                i2 = 6;
            } else if (i2 > 10) {
                i2 = 10;
            }
            this.annotations = new ArrayList<>(1000);
            this.annotationWidth = i;
            this.hexCols = i2;
            this.verbose = z;
        } else {
            throw new IllegalArgumentException("annotationWidth < 40");
        }
    }

    public void endAnnotation() {
        int size;
        ArrayList<Annotation> arrayList = this.annotations;
        if (arrayList != null && (size = arrayList.size()) != 0) {
            this.annotations.get(size - 1).setEndIfUnset(this.cursor);
        }
    }

    public void finishAnnotating() {
        endAnnotation();
        ArrayList<Annotation> arrayList = this.annotations;
        if (arrayList != null) {
            int size = arrayList.size();
            while (size > 0) {
                int i = size - 1;
                Annotation annotation = this.annotations.get(i);
                if (annotation.getStart() > this.cursor) {
                    this.annotations.remove(i);
                    size--;
                } else {
                    int end = annotation.getEnd();
                    int i2 = this.cursor;
                    if (end > i2) {
                        annotation.setEnd(i2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public int getAnnotationWidth() {
        int i = this.hexCols;
        return this.annotationWidth - (((i * 2) + 8) + (i / 2));
    }

    public byte[] getArray() {
        return this.data;
    }

    public int getCursor() {
        return this.cursor;
    }

    public boolean isVerbose() {
        return this.verbose;
    }

    public byte[] toByteArray() {
        int i = this.cursor;
        byte[] bArr = new byte[i];
        System.arraycopy(this.data, 0, bArr, 0, i);
        return bArr;
    }

    public void write(ByteArray byteArray) {
        int size = byteArray.size();
        int i = this.cursor;
        int i2 = size + i;
        if (this.stretchy) {
            ensureCapacity(i2);
        } else if (i2 > this.data.length) {
            throwBounds();
            return;
        }
        byteArray.getBytes(this.data, i);
        this.cursor = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeAnnotationsTo(java.io.Writer r13) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r12.getAnnotationWidth()
            int r1 = r12.annotationWidth
            int r1 = r1 - r0
            int r1 = r1 + -1
            com.android.dx.util.TwoColumnOutput r2 = new com.android.dx.util.TwoColumnOutput
            java.lang.String r3 = "|"
            r2.<init>((java.io.Writer) r13, (int) r1, (int) r0, (java.lang.String) r3)
            java.io.Writer r13 = r2.getLeft()
            java.io.Writer r0 = r2.getRight()
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r12.annotations
            int r1 = r1.size()
            r3 = 0
            r7 = 0
        L_0x0021:
            int r4 = r12.cursor
            if (r7 >= r4) goto L_0x005d
            if (r3 >= r1) goto L_0x005d
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r4 = r12.annotations
            java.lang.Object r4 = r4.get(r3)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r4 = (com.android.p023dx.util.ByteArrayAnnotatedOutput.Annotation) r4
            int r5 = r4.getStart()
            if (r7 >= r5) goto L_0x003a
            java.lang.String r4 = ""
            r11 = r5
            r8 = r7
            goto L_0x0046
        L_0x003a:
            int r6 = r4.getEnd()
            java.lang.String r4 = r4.getText()
            int r3 = r3 + 1
            r8 = r5
            r11 = r6
        L_0x0046:
            byte[] r5 = r12.data
            int r7 = r11 - r8
            int r9 = r12.hexCols
            r10 = 6
            r6 = r8
            java.lang.String r5 = com.android.p023dx.util.Hex.dump(r5, r6, r7, r8, r9, r10)
            r13.write(r5)
            r0.write(r4)
            r2.flush()
            r7 = r11
            goto L_0x0021
        L_0x005d:
            if (r7 >= r4) goto L_0x006f
            byte[] r5 = r12.data
            int r6 = r4 - r7
            int r8 = r12.hexCols
            r9 = 6
            r4 = r5
            r5 = r7
            java.lang.String r4 = com.android.p023dx.util.Hex.dump(r4, r5, r6, r7, r8, r9)
            r13.write(r4)
        L_0x006f:
            if (r3 >= r1) goto L_0x0083
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r13 = r12.annotations
            java.lang.Object r13 = r13.get(r3)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r13 = (com.android.p023dx.util.ByteArrayAnnotatedOutput.Annotation) r13
            java.lang.String r13 = r13.getText()
            r0.write(r13)
            int r3 = r3 + 1
            goto L_0x006f
        L_0x0083:
            r2.flush()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.util.ByteArrayAnnotatedOutput.writeAnnotationsTo(java.io.Writer):void");
    }

    public void writeByte(int i) {
        int i2 = this.cursor;
        int i3 = i2 + 1;
        if (this.stretchy) {
            ensureCapacity(i3);
        } else if (i3 > this.data.length) {
            throwBounds();
            return;
        }
        this.data[i2] = (byte) i;
        this.cursor = i3;
    }

    public void writeInt(int i) {
        int i2 = this.cursor;
        int i3 = i2 + 4;
        if (this.stretchy) {
            ensureCapacity(i3);
        } else if (i3 > this.data.length) {
            throwBounds();
            return;
        }
        byte[] bArr = this.data;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.cursor = i3;
    }

    public void writeLong(long j) {
        int i = this.cursor;
        int i2 = i + 8;
        if (this.stretchy) {
            ensureCapacity(i2);
        } else if (i2 > this.data.length) {
            throwBounds();
            return;
        }
        int i3 = (int) j;
        byte[] bArr = this.data;
        bArr[i] = (byte) i3;
        bArr[i + 1] = (byte) (i3 >> 8);
        bArr[i + 2] = (byte) (i3 >> 16);
        bArr[i + 3] = (byte) (i3 >> 24);
        int i4 = (int) (j >> 32);
        bArr[i + 4] = (byte) i4;
        bArr[i + 5] = (byte) (i4 >> 8);
        bArr[i + 6] = (byte) (i4 >> 16);
        bArr[i + 7] = (byte) (i4 >> 24);
        this.cursor = i2;
    }

    public void writeShort(int i) {
        int i2 = this.cursor;
        int i3 = i2 + 2;
        if (this.stretchy) {
            ensureCapacity(i3);
        } else if (i3 > this.data.length) {
            throwBounds();
            return;
        }
        byte[] bArr = this.data;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.cursor = i3;
    }

    public int writeSleb128(int i) {
        if (this.stretchy) {
            ensureCapacity(this.cursor + 5);
        }
        int i2 = this.cursor;
        Leb128.writeSignedLeb128(this, i);
        return this.cursor - i2;
    }

    public int writeUleb128(int i) {
        if (this.stretchy) {
            ensureCapacity(this.cursor + 5);
        }
        int i2 = this.cursor;
        Leb128.writeUnsignedLeb128(this, i);
        return this.cursor - i2;
    }

    public void writeZeroes(int i) {
        if (i >= 0) {
            int i2 = this.cursor + i;
            if (this.stretchy) {
                ensureCapacity(i2);
            } else if (i2 > this.data.length) {
                throwBounds();
                return;
            }
            this.cursor = i2;
            return;
        }
        throw new IllegalArgumentException("count < 0");
    }

    public ByteArrayAnnotatedOutput() {
        this(1000);
    }

    public ByteArrayAnnotatedOutput(int i) {
        this(new byte[i], true);
    }

    /* renamed from: com.android.dx.util.ByteArrayAnnotatedOutput$Annotation */
    private static class Annotation {
        private int end;
        private final int start;
        private final String text;

        public Annotation(int i, int i2, String str) {
            this.start = i;
            this.end = i2;
            this.text = str;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }

        public String getText() {
            return this.text;
        }

        public void setEnd(int i) {
            this.end = i;
        }

        public void setEndIfUnset(int i) {
            if (this.end == Integer.MAX_VALUE) {
                this.end = i;
            }
        }

        public Annotation(int i, String str) {
            this(i, Integer.MAX_VALUE, str);
        }
    }

    private ByteArrayAnnotatedOutput(byte[] bArr, boolean z) {
        Objects.requireNonNull(bArr, "data == null");
        this.stretchy = z;
        this.data = bArr;
        this.cursor = 0;
        this.verbose = false;
        this.annotations = null;
        this.annotationWidth = 0;
        this.hexCols = 0;
    }

    public void annotate(int i, String str) {
        int i2;
        if (this.annotations != null) {
            endAnnotation();
            int size = this.annotations.size();
            if (size == 0) {
                i2 = 0;
            } else {
                i2 = this.annotations.get(size - 1).getEnd();
            }
            int i3 = this.cursor;
            if (i2 <= i3) {
                i2 = i3;
            }
            this.annotations.add(new Annotation(i2, i + i2, str));
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = this.cursor;
        int i4 = i3 + i2;
        int i5 = i + i2;
        if ((i | i2 | i4) < 0 || i5 > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; " + i + "..!" + i4);
        }
        if (this.stretchy) {
            ensureCapacity(i4);
        } else if (i4 > this.data.length) {
            throwBounds();
            return;
        }
        System.arraycopy(bArr, i, this.data, i3, i2);
        this.cursor = i4;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
