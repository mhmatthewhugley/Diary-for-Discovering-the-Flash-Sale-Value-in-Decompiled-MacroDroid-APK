package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.util.FixedSizeList;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.PositionList */
public final class PositionList extends FixedSizeList {
    public static final PositionList EMPTY = new PositionList(0);
    public static final int IMPORTANT = 3;
    public static final int LINES = 2;
    public static final int NONE = 1;

    /* renamed from: com.android.dx.dex.code.PositionList$Entry */
    public static class Entry {
        private final int address;
        private final SourcePosition position;

        public Entry(int i, SourcePosition sourcePosition) {
            if (i >= 0) {
                Objects.requireNonNull(sourcePosition, "position == null");
                this.address = i;
                this.position = sourcePosition;
                return;
            }
            throw new IllegalArgumentException("address < 0");
        }

        public int getAddress() {
            return this.address;
        }

        public SourcePosition getPosition() {
            return this.position;
        }
    }

    public PositionList(int i) {
        super(i);
    }

    public static PositionList make(DalvInsnList dalvInsnList, int i) {
        if (i == 1) {
            return EMPTY;
        }
        if (i == 2 || i == 3) {
            SourcePosition sourcePosition = SourcePosition.NO_INFO;
            int size = dalvInsnList.size();
            Entry[] entryArr = new Entry[size];
            SourcePosition sourcePosition2 = sourcePosition;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                DalvInsn dalvInsn = dalvInsnList.get(i3);
                if (dalvInsn instanceof CodeAddress) {
                    z = true;
                } else {
                    SourcePosition position = dalvInsn.getPosition();
                    if (!position.equals(sourcePosition) && !position.sameLine(sourcePosition2) && (i != 3 || z)) {
                        entryArr[i2] = new Entry(dalvInsn.getAddress(), position);
                        i2++;
                        sourcePosition2 = position;
                        z = false;
                    }
                }
            }
            PositionList positionList = new PositionList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                positionList.set(i4, entryArr[i4]);
            }
            positionList.setImmutable();
            return positionList;
        }
        throw new IllegalArgumentException("bogus howMuch");
    }

    public Entry get(int i) {
        return (Entry) get0(i);
    }

    public void set(int i, Entry entry) {
        set0(i, entry);
    }
}
