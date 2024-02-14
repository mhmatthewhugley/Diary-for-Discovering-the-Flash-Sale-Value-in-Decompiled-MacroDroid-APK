package com.android.p023dx.dex.code;

import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.Type;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.DalvCode */
public final class DalvCode {
    private CatchTable catches = null;
    private DalvInsnList insns = null;
    private LocalList locals = null;
    private final int positionInfo;
    private PositionList positions = null;
    private CatchBuilder unprocessedCatches;
    private OutputFinisher unprocessedInsns;

    /* renamed from: com.android.dx.dex.code.DalvCode$AssignIndicesCallback */
    public interface AssignIndicesCallback {
        int getIndex(Constant constant);
    }

    public DalvCode(int i, OutputFinisher outputFinisher, CatchBuilder catchBuilder) {
        Objects.requireNonNull(outputFinisher, "unprocessedInsns == null");
        Objects.requireNonNull(catchBuilder, "unprocessedCatches == null");
        this.positionInfo = i;
        this.unprocessedInsns = outputFinisher;
        this.unprocessedCatches = catchBuilder;
    }

    private void finishProcessingIfNecessary() {
        if (this.insns == null) {
            DalvInsnList finishProcessingAndGetList = this.unprocessedInsns.finishProcessingAndGetList();
            this.insns = finishProcessingAndGetList;
            this.positions = PositionList.make(finishProcessingAndGetList, this.positionInfo);
            this.locals = LocalList.make(this.insns);
            this.catches = this.unprocessedCatches.build();
            this.unprocessedInsns = null;
            this.unprocessedCatches = null;
        }
    }

    public void assignIndices(AssignIndicesCallback assignIndicesCallback) {
        this.unprocessedInsns.assignIndices(assignIndicesCallback);
    }

    public HashSet<Type> getCatchTypes() {
        return this.unprocessedCatches.getCatchTypes();
    }

    public CatchTable getCatches() {
        finishProcessingIfNecessary();
        return this.catches;
    }

    public HashSet<Constant> getInsnConstants() {
        return this.unprocessedInsns.getAllConstants();
    }

    public DalvInsnList getInsns() {
        finishProcessingIfNecessary();
        return this.insns;
    }

    public LocalList getLocals() {
        finishProcessingIfNecessary();
        return this.locals;
    }

    public PositionList getPositions() {
        finishProcessingIfNecessary();
        return this.positions;
    }

    public boolean hasAnyCatches() {
        return this.unprocessedCatches.hasAnyCatches();
    }

    public boolean hasLocals() {
        return this.unprocessedInsns.hasAnyLocalInfo();
    }

    public boolean hasPositions() {
        if (this.positionInfo == 1 || !this.unprocessedInsns.hasAnyPositionInfo()) {
            return false;
        }
        return true;
    }
}
