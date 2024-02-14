package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.type.Prototype;
import com.android.p023dx.rop.type.Type;
import java.util.ArrayList;

/* renamed from: com.android.dx.cf.code.Machine */
public interface Machine {
    void auxCstArg(Constant constant);

    void auxInitValues(ArrayList<Constant> arrayList);

    void auxIntArg(int i);

    void auxSwitchArg(SwitchList switchList);

    void auxTargetArg(int i);

    void auxType(Type type);

    void clearArgs();

    Prototype getPrototype();

    void localArg(Frame frame, int i);

    void localInfo(boolean z);

    void localTarget(int i, Type type, LocalItem localItem);

    void popArgs(Frame frame, int i);

    void popArgs(Frame frame, Prototype prototype);

    void popArgs(Frame frame, Type type);

    void popArgs(Frame frame, Type type, Type type2);

    void popArgs(Frame frame, Type type, Type type2, Type type3);

    void run(Frame frame, int i, int i2);
}
