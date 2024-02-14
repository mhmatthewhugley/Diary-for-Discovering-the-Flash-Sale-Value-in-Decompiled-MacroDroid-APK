package com.android.p023dx.p024cf.code;

import com.android.dex.util.ExceptionWithContext;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.util.Hex;
import com.android.p023dx.util.MutabilityControl;

/* renamed from: com.android.dx.cf.code.ExecutionStack */
public final class ExecutionStack extends MutabilityControl {
    private final boolean[] local;
    private final TypeBearer[] stack;
    private int stackPtr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecutionStack(int i) {
        super(i != 0);
        this.stack = new TypeBearer[i];
        this.local = new boolean[i];
        this.stackPtr = 0;
    }

    private static String stackElementString(TypeBearer typeBearer) {
        return typeBearer == null ? "<invalid>" : typeBearer.toString();
    }

    private static TypeBearer throwSimException(String str) {
        throw new SimException("stack: " + str);
    }

    public void annotate(ExceptionWithContext exceptionWithContext) {
        String str;
        int i = this.stackPtr - 1;
        for (int i2 = 0; i2 <= i; i2++) {
            if (i2 == i) {
                str = "top0";
            } else {
                str = Hex.m907u2(i - i2);
            }
            exceptionWithContext.addContext("stack[" + str + "]: " + stackElementString(this.stack[i2]));
        }
    }

    public void change(int i, TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int i2 = (this.stackPtr - i) - 1;
            TypeBearer typeBearer2 = this.stack[i2];
            if (typeBearer2 == null || typeBearer2.getType().getCategory() != frameType.getType().getCategory()) {
                throwSimException("incompatible substitution: " + stackElementString(typeBearer2) + " -> " + stackElementString(frameType));
            }
            this.stack[i2] = frameType;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    public void clear() {
        throwIfImmutable();
        for (int i = 0; i < this.stackPtr; i++) {
            this.stack[i] = null;
            this.local[i] = false;
        }
        this.stackPtr = 0;
    }

    public ExecutionStack copy() {
        ExecutionStack executionStack = new ExecutionStack(this.stack.length);
        TypeBearer[] typeBearerArr = this.stack;
        System.arraycopy(typeBearerArr, 0, executionStack.stack, 0, typeBearerArr.length);
        boolean[] zArr = this.local;
        System.arraycopy(zArr, 0, executionStack.local, 0, zArr.length);
        executionStack.stackPtr = this.stackPtr;
        return executionStack;
    }

    public int getMaxStack() {
        return this.stack.length;
    }

    public void makeInitialized(Type type) {
        if (this.stackPtr != 0) {
            throwIfImmutable();
            Type initializedType = type.getInitializedType();
            for (int i = 0; i < this.stackPtr; i++) {
                TypeBearer[] typeBearerArr = this.stack;
                if (typeBearerArr[i] == type) {
                    typeBearerArr[i] = initializedType;
                }
            }
        }
    }

    public ExecutionStack merge(ExecutionStack executionStack) {
        try {
            return Merger.mergeStack(this, executionStack);
        } catch (SimException e) {
            e.addContext("underlay stack:");
            annotate(e);
            e.addContext("overlay stack:");
            executionStack.annotate(e);
            throw e;
        }
    }

    public TypeBearer peek(int i) {
        if (i >= 0) {
            int i2 = this.stackPtr;
            if (i >= i2) {
                return throwSimException("underflow");
            }
            return this.stack[(i2 - i) - 1];
        }
        throw new IllegalArgumentException("n < 0");
    }

    public boolean peekLocal(int i) {
        if (i >= 0) {
            int i2 = this.stackPtr;
            if (i < i2) {
                return this.local[(i2 - i) - 1];
            }
            throw new SimException("stack: underflow");
        }
        throw new IllegalArgumentException("n < 0");
    }

    public Type peekType(int i) {
        return peek(i).getType();
    }

    public TypeBearer pop() {
        throwIfImmutable();
        TypeBearer peek = peek(0);
        TypeBearer[] typeBearerArr = this.stack;
        int i = this.stackPtr;
        typeBearerArr[i - 1] = null;
        this.local[i - 1] = false;
        this.stackPtr = i - peek.getType().getCategory();
        return peek;
    }

    public void push(TypeBearer typeBearer) {
        throwIfImmutable();
        try {
            TypeBearer frameType = typeBearer.getFrameType();
            int category = frameType.getType().getCategory();
            int i = this.stackPtr;
            int i2 = i + category;
            TypeBearer[] typeBearerArr = this.stack;
            if (i2 > typeBearerArr.length) {
                throwSimException("overflow");
                return;
            }
            if (category == 2) {
                typeBearerArr[i] = null;
                this.stackPtr = i + 1;
            }
            int i3 = this.stackPtr;
            typeBearerArr[i3] = frameType;
            this.stackPtr = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    public void setLocal() {
        throwIfImmutable();
        this.local[this.stackPtr] = true;
    }

    public int size() {
        return this.stackPtr;
    }
}
