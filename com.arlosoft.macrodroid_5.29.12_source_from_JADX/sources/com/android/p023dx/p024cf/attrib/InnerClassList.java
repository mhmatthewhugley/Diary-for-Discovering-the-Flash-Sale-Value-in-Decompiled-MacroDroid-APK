package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.util.FixedSizeList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.InnerClassList */
public final class InnerClassList extends FixedSizeList {

    /* renamed from: com.android.dx.cf.attrib.InnerClassList$Item */
    public static class Item {
        private final int accessFlags;
        private final CstType innerClass;
        private final CstString innerName;
        private final CstType outerClass;

        public Item(CstType cstType, CstType cstType2, CstString cstString, int i) {
            Objects.requireNonNull(cstType, "innerClass == null");
            this.innerClass = cstType;
            this.outerClass = cstType2;
            this.innerName = cstString;
            this.accessFlags = i;
        }

        public int getAccessFlags() {
            return this.accessFlags;
        }

        public CstType getInnerClass() {
            return this.innerClass;
        }

        public CstString getInnerName() {
            return this.innerName;
        }

        public CstType getOuterClass() {
            return this.outerClass;
        }
    }

    public InnerClassList(int i) {
        super(i);
    }

    public Item get(int i) {
        return (Item) get0(i);
    }

    public void set(int i, CstType cstType, CstType cstType2, CstString cstString, int i2) {
        set0(i, new Item(cstType, cstType2, cstString, i2));
    }
}
