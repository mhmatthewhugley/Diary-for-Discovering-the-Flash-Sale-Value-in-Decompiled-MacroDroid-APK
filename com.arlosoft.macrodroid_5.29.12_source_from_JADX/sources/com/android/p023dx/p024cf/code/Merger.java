package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeBearer;
import com.android.p023dx.util.Hex;

/* renamed from: com.android.dx.cf.code.Merger */
public final class Merger {
    private Merger() {
    }

    public static boolean isPossiblyAssignableFrom(TypeBearer typeBearer, TypeBearer typeBearer2) {
        Type type = typeBearer.getType();
        Type type2 = typeBearer2.getType();
        if (type.equals(type2)) {
            return true;
        }
        int basicType = type.getBasicType();
        int basicType2 = type2.getBasicType();
        if (basicType == 10) {
            type = Type.OBJECT;
            basicType = 9;
        }
        if (basicType2 == 10) {
            type2 = Type.OBJECT;
            basicType2 = 9;
        }
        if (basicType == 9 && basicType2 == 9) {
            Type type3 = Type.KNOWN_NULL;
            if (type == type3) {
                return false;
            }
            if (type2 == type3 || type == Type.OBJECT) {
                return true;
            }
            if (type.isArray()) {
                if (!type2.isArray()) {
                    return false;
                }
                do {
                    type = type.getComponentType();
                    type2 = type2.getComponentType();
                    if (!type.isArray() || !type2.isArray()) {
                    }
                    type = type.getComponentType();
                    type2 = type2.getComponentType();
                    break;
                } while (!type2.isArray());
                return isPossiblyAssignableFrom(type, type2);
            } else if (!type2.isArray() || type == Type.SERIALIZABLE || type == Type.CLONEABLE) {
                return true;
            } else {
                return false;
            }
        } else if (!type.isIntlike() || !type2.isIntlike()) {
            return false;
        } else {
            return true;
        }
    }

    public static OneLocalsArray mergeLocals(OneLocalsArray oneLocalsArray, OneLocalsArray oneLocalsArray2) {
        if (oneLocalsArray == oneLocalsArray2) {
            return oneLocalsArray;
        }
        int maxLocals = oneLocalsArray.getMaxLocals();
        OneLocalsArray oneLocalsArray3 = null;
        if (oneLocalsArray2.getMaxLocals() == maxLocals) {
            for (int i = 0; i < maxLocals; i++) {
                TypeBearer orNull = oneLocalsArray.getOrNull(i);
                TypeBearer mergeType = mergeType(orNull, oneLocalsArray2.getOrNull(i));
                if (mergeType != orNull) {
                    if (oneLocalsArray3 == null) {
                        oneLocalsArray3 = oneLocalsArray.copy();
                    }
                    if (mergeType == null) {
                        oneLocalsArray3.invalidate(i);
                    } else {
                        oneLocalsArray3.set(i, mergeType);
                    }
                }
            }
            if (oneLocalsArray3 == null) {
                return oneLocalsArray;
            }
            oneLocalsArray3.setImmutable();
            return oneLocalsArray3;
        }
        throw new SimException("mismatched maxLocals values");
    }

    public static ExecutionStack mergeStack(ExecutionStack executionStack, ExecutionStack executionStack2) {
        if (executionStack == executionStack2) {
            return executionStack;
        }
        int size = executionStack.size();
        ExecutionStack executionStack3 = null;
        if (executionStack2.size() == size) {
            for (int i = 0; i < size; i++) {
                TypeBearer peek = executionStack.peek(i);
                TypeBearer peek2 = executionStack2.peek(i);
                TypeBearer mergeType = mergeType(peek, peek2);
                if (mergeType != peek) {
                    if (executionStack3 == null) {
                        executionStack3 = executionStack.copy();
                    }
                    if (mergeType != null) {
                        try {
                            executionStack3.change(i, mergeType);
                        } catch (SimException e) {
                            e.addContext("...while merging stack[" + Hex.m907u2(i) + "]");
                            throw e;
                        }
                    } else {
                        throw new SimException("incompatible: " + peek + ", " + peek2);
                    }
                }
            }
            if (executionStack3 == null) {
                return executionStack;
            }
            executionStack3.setImmutable();
            return executionStack3;
        }
        throw new SimException("mismatched stack depths");
    }

    public static TypeBearer mergeType(TypeBearer typeBearer, TypeBearer typeBearer2) {
        if (typeBearer == null || typeBearer.equals(typeBearer2)) {
            return typeBearer;
        }
        if (typeBearer2 == null) {
            return null;
        }
        Type type = typeBearer.getType();
        Type type2 = typeBearer2.getType();
        if (type == type2) {
            return type;
        }
        if (type.isReference() && type2.isReference()) {
            Type type3 = Type.KNOWN_NULL;
            if (type == type3) {
                return type2;
            }
            if (type2 == type3) {
                return type;
            }
            if (!type.isArray() || !type2.isArray()) {
                return Type.OBJECT;
            }
            TypeBearer mergeType = mergeType(type.getComponentType(), type2.getComponentType());
            if (mergeType == null) {
                return Type.OBJECT;
            }
            return ((Type) mergeType).getArrayType();
        } else if (!type.isIntlike() || !type2.isIntlike()) {
            return null;
        } else {
            return Type.INT;
        }
    }
}
