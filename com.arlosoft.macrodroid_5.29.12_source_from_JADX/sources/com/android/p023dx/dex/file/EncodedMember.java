package com.android.p023dx.dex.file;

import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.ToHuman;
import java.io.PrintWriter;

/* renamed from: com.android.dx.dex.file.EncodedMember */
public abstract class EncodedMember implements ToHuman {
    private final int accessFlags;

    public EncodedMember(int i) {
        this.accessFlags = i;
    }

    public abstract void addContents(DexFile dexFile);

    public abstract void debugPrint(PrintWriter printWriter, boolean z);

    public abstract int encode(DexFile dexFile, AnnotatedOutput annotatedOutput, int i, int i2);

    public final int getAccessFlags() {
        return this.accessFlags;
    }

    public abstract CstString getName();
}
