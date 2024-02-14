package com.android.p023dx;

import com.android.p023dx.rop.code.BasicBlock;
import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.InsnList;
import com.android.p023dx.util.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.dx.Label */
public final class Label {
    Label alternateSuccessor;
    List<Label> catchLabels = Collections.emptyList();
    Code code;

    /* renamed from: id */
    int f1040id = -1;
    final List<Insn> instructions = new ArrayList();
    boolean marked = false;
    Label primarySuccessor;

    /* access modifiers changed from: package-private */
    public void compact() {
        for (int i = 0; i < this.catchLabels.size(); i++) {
            while (this.catchLabels.get(i).isEmpty()) {
                List<Label> list = this.catchLabels;
                list.set(i, list.get(i).primarySuccessor);
            }
        }
        while (true) {
            Label label = this.primarySuccessor;
            if (label != null && label.isEmpty()) {
                this.primarySuccessor = this.primarySuccessor.primarySuccessor;
            }
        }
        while (true) {
            Label label2 = this.alternateSuccessor;
            if (label2 != null && label2.isEmpty()) {
                this.alternateSuccessor = this.alternateSuccessor.primarySuccessor;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isEmpty() {
        return this.instructions.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public BasicBlock toBasicBlock() {
        InsnList insnList = new InsnList(this.instructions.size());
        for (int i = 0; i < this.instructions.size(); i++) {
            insnList.set(i, this.instructions.get(i));
        }
        insnList.setImmutable();
        int i2 = -1;
        IntList intList = new IntList();
        for (Label label : this.catchLabels) {
            intList.add(label.f1040id);
        }
        Label label2 = this.primarySuccessor;
        if (label2 != null) {
            i2 = label2.f1040id;
            intList.add(i2);
        }
        Label label3 = this.alternateSuccessor;
        if (label3 != null) {
            intList.add(label3.f1040id);
        }
        intList.setImmutable();
        return new BasicBlock(this.f1040id, insnList, intList, i2);
    }
}
