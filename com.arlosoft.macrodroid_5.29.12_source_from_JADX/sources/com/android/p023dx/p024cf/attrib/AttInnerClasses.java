package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.util.MutabilityException;

/* renamed from: com.android.dx.cf.attrib.AttInnerClasses */
public final class AttInnerClasses extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "InnerClasses";
    private final InnerClassList innerClasses;

    public AttInnerClasses(InnerClassList innerClassList) {
        super(ATTRIBUTE_NAME);
        try {
            if (!innerClassList.isMutable()) {
                this.innerClasses = innerClassList;
                return;
            }
            throw new MutabilityException("innerClasses.isMutable()");
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    public int byteLength() {
        return (this.innerClasses.size() * 8) + 8;
    }

    public InnerClassList getInnerClasses() {
        return this.innerClasses;
    }
}
