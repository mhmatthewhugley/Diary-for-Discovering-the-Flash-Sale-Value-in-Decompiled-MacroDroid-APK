package com.android.p023dx.rop.code;

import com.android.p023dx.rop.type.StdTypeList;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import com.android.p023dx.util.Hex;
import java.util.Objects;

/* renamed from: com.android.dx.rop.code.Rop */
public final class Rop {
    public static final int BRANCH_GOTO = 3;
    public static final int BRANCH_IF = 4;
    public static final int BRANCH_MAX = 6;
    public static final int BRANCH_MIN = 1;
    public static final int BRANCH_NONE = 1;
    public static final int BRANCH_RETURN = 2;
    public static final int BRANCH_SWITCH = 5;
    public static final int BRANCH_THROW = 6;
    private final int branchingness;
    private final TypeList exceptions;
    private final boolean isCallLike;
    private final String nickname;
    private final int opcode;
    private final Type result;
    private final TypeList sources;

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, int i2, boolean z, String str) {
        Objects.requireNonNull(type, "result == null");
        Objects.requireNonNull(typeList, "sources == null");
        Objects.requireNonNull(typeList2, "exceptions == null");
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException("bogus branchingness");
        } else if (typeList2.size() == 0 || i2 == 6) {
            this.opcode = i;
            this.result = type;
            this.sources = typeList;
            this.exceptions = typeList2;
            this.branchingness = i2;
            this.isCallLike = z;
            this.nickname = str;
        } else {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
    }

    public final boolean canThrow() {
        return this.exceptions.size() != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rop)) {
            return false;
        }
        Rop rop = (Rop) obj;
        if (this.opcode == rop.opcode && this.branchingness == rop.branchingness && this.result == rop.result && this.sources.equals(rop.sources) && this.exceptions.equals(rop.exceptions)) {
            return true;
        }
        return false;
    }

    public int getBranchingness() {
        return this.branchingness;
    }

    public TypeList getExceptions() {
        return this.exceptions;
    }

    public String getNickname() {
        String str = this.nickname;
        if (str != null) {
            return str;
        }
        return toString();
    }

    public int getOpcode() {
        return this.opcode;
    }

    public Type getResult() {
        return this.result;
    }

    public TypeList getSources() {
        return this.sources;
    }

    public int hashCode() {
        return (((((((this.opcode * 31) + this.branchingness) * 31) + this.result.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.exceptions.hashCode();
    }

    public boolean isCallLike() {
        return this.isCallLike;
    }

    public boolean isCommutative() {
        int i = this.opcode;
        if (i == 14 || i == 16) {
            return true;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(40);
        stringBuffer.append("Rop{");
        stringBuffer.append(RegOps.opName(this.opcode));
        if (this.result != Type.VOID) {
            stringBuffer.append(" ");
            stringBuffer.append(this.result);
        } else {
            stringBuffer.append(" .");
        }
        stringBuffer.append(" <-");
        int size = this.sources.size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(' ');
                stringBuffer.append(this.sources.getType(i));
            }
        }
        if (this.isCallLike) {
            stringBuffer.append(" call");
        }
        int size2 = this.exceptions.size();
        if (size2 != 0) {
            stringBuffer.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                stringBuffer.append(' ');
                if (this.exceptions.getType(i2) == Type.THROWABLE) {
                    stringBuffer.append("<any>");
                } else {
                    stringBuffer.append(this.exceptions.getType(i2));
                }
            }
        } else {
            int i3 = this.branchingness;
            if (i3 == 1) {
                stringBuffer.append(" flows");
            } else if (i3 == 2) {
                stringBuffer.append(" returns");
            } else if (i3 == 3) {
                stringBuffer.append(" gotos");
            } else if (i3 == 4) {
                stringBuffer.append(" ifs");
            } else if (i3 != 5) {
                stringBuffer.append(" " + Hex.m906u1(this.branchingness));
            } else {
                stringBuffer.append(" switches");
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, int i2, String str) {
        this(i, type, typeList, typeList2, i2, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, int i2, String str) {
        this(i, type, typeList, StdTypeList.EMPTY, i2, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, String str) {
        this(i, type, typeList, StdTypeList.EMPTY, 1, false, str);
    }

    public Rop(int i, Type type, TypeList typeList, TypeList typeList2, String str) {
        this(i, type, typeList, typeList2, 6, false, str);
    }

    public Rop(int i, TypeList typeList, TypeList typeList2) {
        this(i, Type.VOID, typeList, typeList2, 6, true, (String) null);
    }
}
