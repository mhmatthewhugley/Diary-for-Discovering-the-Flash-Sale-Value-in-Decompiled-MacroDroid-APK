package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.BaseMachine */
public abstract class BaseMachine implements Machine {
    private int argCount;
    private TypeBearer[] args = new TypeBearer[10];
    private SwitchList auxCases;
    private Constant auxCst;
    private ArrayList<Constant> auxInitValues;
    private int auxInt;
    private int auxTarget;
    private Type auxType;
    private int localIndex;
    private boolean localInfo;
    private RegisterSpec localTarget;
    private final Prototype prototype;
    private int resultCount;
    private TypeBearer[] results = new TypeBearer[6];

    public BaseMachine(Prototype prototype2) {
        Objects.requireNonNull(prototype2, "prototype == null");
        this.prototype = prototype2;
        clearArgs();
    }

    public static void throwLocalMismatch(TypeBearer typeBearer, TypeBearer typeBearer2) {
        throw new SimException("local variable type mismatch: attempt to set or access a value of type " + typeBearer.toHuman() + " using a local variable of type " + typeBearer2.toHuman() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    /* access modifiers changed from: protected */
    public final void addResult(TypeBearer typeBearer) {
        Objects.requireNonNull(typeBearer, "result == null");
        TypeBearer[] typeBearerArr = this.results;
        int i = this.resultCount;
        typeBearerArr[i] = typeBearer;
        this.resultCount = i + 1;
    }

    /* access modifiers changed from: protected */
    public final TypeBearer arg(int i) {
        if (i < this.argCount) {
            try {
                return this.args[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("n < 0");
            }
        } else {
            throw new IllegalArgumentException("n >= argCount");
        }
    }

    /* access modifiers changed from: protected */
    public final int argCount() {
        return this.argCount;
    }

    /* access modifiers changed from: protected */
    public final int argWidth() {
        int i = 0;
        for (int i2 = 0; i2 < this.argCount; i2++) {
            i += this.args[i2].getType().getCategory();
        }
        return i;
    }

    public final void auxCstArg(Constant constant) {
        Objects.requireNonNull(constant, "cst == null");
        this.auxCst = constant;
    }

    public final void auxInitValues(ArrayList<Constant> arrayList) {
        this.auxInitValues = arrayList;
    }

    public final void auxIntArg(int i) {
        this.auxInt = i;
    }

    public final void auxSwitchArg(SwitchList switchList) {
        Objects.requireNonNull(switchList, "cases == null");
        this.auxCases = switchList;
    }

    public final void auxTargetArg(int i) {
        this.auxTarget = i;
    }

    public final void auxType(Type type) {
        this.auxType = type;
    }

    public final void clearArgs() {
        this.argCount = 0;
        this.auxType = null;
        this.auxInt = 0;
        this.auxCst = null;
        this.auxTarget = 0;
        this.auxCases = null;
        this.auxInitValues = null;
        this.localIndex = -1;
        this.localInfo = false;
        this.localTarget = null;
        this.resultCount = -1;
    }

    /* access modifiers changed from: protected */
    public final void clearResult() {
        this.resultCount = 0;
    }

    /* access modifiers changed from: protected */
    public final SwitchList getAuxCases() {
        return this.auxCases;
    }

    /* access modifiers changed from: protected */
    public final Constant getAuxCst() {
        return this.auxCst;
    }

    /* access modifiers changed from: protected */
    public final int getAuxInt() {
        return this.auxInt;
    }

    /* access modifiers changed from: protected */
    public final int getAuxTarget() {
        return this.auxTarget;
    }

    /* access modifiers changed from: protected */
    public final Type getAuxType() {
        return this.auxType;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<Constant> getInitValues() {
        return this.auxInitValues;
    }

    /* access modifiers changed from: protected */
    public final int getLocalIndex() {
        return this.localIndex;
    }

    /* access modifiers changed from: protected */
    public final boolean getLocalInfo() {
        return this.localInfo;
    }

    /* access modifiers changed from: protected */
    public final RegisterSpec getLocalTarget(boolean z) {
        if (this.localTarget == null) {
            return null;
        }
        if (this.resultCount != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("local target with ");
            sb.append(this.resultCount == 0 ? "no" : "multiple");
            sb.append(" results");
            throw new SimException(sb.toString());
        }
        TypeBearer typeBearer = this.results[0];
        Type type = typeBearer.getType();
        Type type2 = this.localTarget.getType();
        if (type == type2) {
            if (z) {
                return this.localTarget.withType(typeBearer);
            }
            return this.localTarget;
        } else if (!Merger.isPossiblyAssignableFrom(type2, type)) {
            throwLocalMismatch(type, type2);
            return null;
        } else {
            if (type2 == Type.OBJECT) {
                this.localTarget = this.localTarget.withType(typeBearer);
            }
            return this.localTarget;
        }
    }

    public Prototype getPrototype() {
        return this.prototype;
    }

    public final void localArg(Frame frame, int i) {
        clearArgs();
        this.args[0] = frame.getLocals().get(i);
        this.argCount = 1;
        this.localIndex = i;
    }

    public final void localInfo(boolean z) {
        this.localInfo = z;
    }

    public final void localTarget(int i, Type type, LocalItem localItem) {
        this.localTarget = RegisterSpec.makeLocalOptional(i, type, localItem);
    }

    public final void popArgs(Frame frame, int i) {
        ExecutionStack stack = frame.getStack();
        clearArgs();
        if (i > this.args.length) {
            this.args = new TypeBearer[(i + 10)];
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.args[i2] = stack.pop();
        }
        this.argCount = i;
    }

    /* access modifiers changed from: protected */
    public final TypeBearer result(int i) {
        if (i < this.resultCount) {
            try {
                return this.results[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("n < 0");
            }
        } else {
            throw new IllegalArgumentException("n >= resultCount");
        }
    }

    /* access modifiers changed from: protected */
    public final int resultCount() {
        int i = this.resultCount;
        if (i >= 0) {
            return i;
        }
        throw new SimException("results never set");
    }

    /* access modifiers changed from: protected */
    public final int resultWidth() {
        int i = 0;
        for (int i2 = 0; i2 < this.resultCount; i2++) {
            i += this.results[i2].getType().getCategory();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void setResult(TypeBearer typeBearer) {
        Objects.requireNonNull(typeBearer, "result == null");
        this.results[0] = typeBearer;
        this.resultCount = 1;
    }

    /* access modifiers changed from: protected */
    public final void storeResults(Frame frame) {
        int i = this.resultCount;
        if (i < 0) {
            throw new SimException("results never set");
        } else if (i != 0) {
            if (this.localTarget != null) {
                frame.getLocals().set(getLocalTarget(false));
                return;
            }
            ExecutionStack stack = frame.getStack();
            for (int i2 = 0; i2 < this.resultCount; i2++) {
                if (this.localInfo) {
                    stack.setLocal();
                }
                stack.push(this.results[i2]);
            }
        }
    }

    public void popArgs(Frame frame, Prototype prototype2) {
        StdTypeList parameterTypes = prototype2.getParameterTypes();
        int size = parameterTypes.size();
        popArgs(frame, size);
        int i = 0;
        while (i < size) {
            if (Merger.isPossiblyAssignableFrom(parameterTypes.getType(i), this.args[i])) {
                i++;
            } else {
                throw new SimException("at stack depth " + ((size - 1) - i) + ", expected type " + parameterTypes.getType(i).toHuman() + " but found " + this.args[i].getType().toHuman());
            }
        }
    }

    public final void popArgs(Frame frame, Type type) {
        popArgs(frame, 1);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException("expected type " + type.toHuman() + " but found " + this.args[0].getType().toHuman());
        }
    }

    public final void popArgs(Frame frame, Type type, Type type2) {
        popArgs(frame, 2);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException("expected type " + type.toHuman() + " but found " + this.args[0].getType().toHuman());
        } else if (!Merger.isPossiblyAssignableFrom(type2, this.args[1])) {
            throw new SimException("expected type " + type2.toHuman() + " but found " + this.args[1].getType().toHuman());
        }
    }

    public final void popArgs(Frame frame, Type type, Type type2, Type type3) {
        popArgs(frame, 3);
        if (!Merger.isPossiblyAssignableFrom(type, this.args[0])) {
            throw new SimException("expected type " + type.toHuman() + " but found " + this.args[0].getType().toHuman());
        } else if (!Merger.isPossiblyAssignableFrom(type2, this.args[1])) {
            throw new SimException("expected type " + type2.toHuman() + " but found " + this.args[1].getType().toHuman());
        } else if (!Merger.isPossiblyAssignableFrom(type3, this.args[2])) {
            throw new SimException("expected type " + type3.toHuman() + " but found " + this.args[2].getType().toHuman());
        }
    }
}
