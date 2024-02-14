package com.android.p023dx.merge;

import com.android.dex.ClassDef;
import com.android.dex.Dex;
import java.util.Comparator;

/* renamed from: com.android.dx.merge.SortableType */
final class SortableType {
    public static final Comparator<SortableType> NULLS_LAST_ORDER = new Comparator<SortableType>() {
        public int compare(SortableType sortableType, SortableType sortableType2) {
            int typeIndex;
            int typeIndex2;
            if (sortableType == sortableType2) {
                return 0;
            }
            if (sortableType2 == null) {
                return -1;
            }
            if (sortableType == null) {
                return 1;
            }
            if (sortableType.depth != sortableType2.depth) {
                typeIndex = sortableType.depth;
                typeIndex2 = sortableType2.depth;
            } else {
                typeIndex = sortableType.getTypeIndex();
                typeIndex2 = sortableType2.getTypeIndex();
            }
            return typeIndex - typeIndex2;
        }
    };
    private ClassDef classDef;
    /* access modifiers changed from: private */
    public int depth = -1;
    private final Dex dex;
    private final IndexMap indexMap;

    public SortableType(Dex dex2, IndexMap indexMap2, ClassDef classDef2) {
        this.dex = dex2;
        this.indexMap = indexMap2;
        this.classDef = classDef2;
    }

    public ClassDef getClassDef() {
        return this.classDef;
    }

    public Dex getDex() {
        return this.dex;
    }

    public IndexMap getIndexMap() {
        return this.indexMap;
    }

    public int getTypeIndex() {
        return this.classDef.getTypeIndex();
    }

    public boolean isDepthAssigned() {
        return this.depth != -1;
    }

    public boolean tryAssignDepth(SortableType[] sortableTypeArr) {
        int i;
        int max;
        if (this.classDef.getSupertypeIndex() == -1) {
            i = 0;
        } else {
            SortableType sortableType = sortableTypeArr[this.classDef.getSupertypeIndex()];
            if (sortableType == null) {
                i = 1;
            } else {
                i = sortableType.depth;
                if (i == -1) {
                    return false;
                }
            }
        }
        for (short s : this.classDef.getInterfaces()) {
            SortableType sortableType2 = sortableTypeArr[s];
            if (sortableType2 == null) {
                max = Math.max(i, 1);
            } else {
                int i2 = sortableType2.depth;
                if (i2 == -1) {
                    return false;
                }
                max = Math.max(i, i2);
            }
        }
        this.depth = i + 1;
        return true;
    }
}
