package androidx.renderscript;

import android.renderscript.Script;
import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

public class Script extends BaseObj {
    private final SparseArray<FieldID> mFIDs = new SparseArray<>();
    private final SparseArray<InvokeID> mIIDs = new SparseArray<>();
    private final SparseArray<KernelID> mKIDs = new SparseArray<>();
    private boolean mUseIncSupp = false;

    public static class Builder {
        RenderScript mRS;

        Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }
    }

    public static class FieldBase {
        protected Allocation mAllocation;
        protected Element mElement;

        protected FieldBase() {
        }

        public Allocation getAllocation() {
            return this.mAllocation;
        }

        public Element getElement() {
            return this.mElement;
        }

        public Type getType() {
            return this.mAllocation.getType();
        }

        /* access modifiers changed from: protected */
        public void init(RenderScript renderScript, int i) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, 1);
        }

        public void updateAllocation() {
        }

        /* access modifiers changed from: protected */
        public void init(RenderScript renderScript, int i, int i2) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, i2 | 1);
        }
    }

    public static final class FieldID extends BaseObj {

        /* renamed from: mN */
        Script.FieldID f615mN;
        Script mScript;
        int mSlot;

        FieldID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    public static final class InvokeID extends BaseObj {
        Script mScript;
        int mSlot;

        InvokeID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    public static final class KernelID extends BaseObj {

        /* renamed from: mN */
        Script.KernelID f616mN;
        Script mScript;
        int mSig;
        int mSlot;

        KernelID(long j, RenderScript renderScript, Script script, int i, int i2) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
            this.mSig = i2;
        }
    }

    public static final class LaunchOptions {
        private int strategy;
        /* access modifiers changed from: private */
        public int xend = 0;
        /* access modifiers changed from: private */
        public int xstart = 0;
        /* access modifiers changed from: private */
        public int yend = 0;
        /* access modifiers changed from: private */
        public int ystart = 0;
        /* access modifiers changed from: private */
        public int zend = 0;
        /* access modifiers changed from: private */
        public int zstart = 0;

        public int getXEnd() {
            return this.xend;
        }

        public int getXStart() {
            return this.xstart;
        }

        public int getYEnd() {
            return this.yend;
        }

        public int getYStart() {
            return this.ystart;
        }

        public int getZEnd() {
            return this.zend;
        }

        public int getZStart() {
            return this.zstart;
        }

        public LaunchOptions setX(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.xstart = i;
            this.xend = i2;
            return this;
        }

        public LaunchOptions setY(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.ystart = i;
            this.yend = i2;
            return this;
        }

        public LaunchOptions setZ(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.zstart = i;
            this.zend = i2;
            return this;
        }
    }

    Script(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public void bindAllocation(Allocation allocation, int i) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        if (allocation2 != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptBindAllocation(getID(renderScript), allocation2.getID(this.mRS), i, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptBindAllocation(getID(renderScript2), 0, i, this.mUseIncSupp);
    }

    /* access modifiers changed from: protected */
    public FieldID createFieldID(int i, Element element) {
        FieldID fieldID = this.mFIDs.get(i);
        if (fieldID != null) {
            return fieldID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptFieldIDCreate = renderScript.nScriptFieldIDCreate(getID(renderScript), i, this.mUseIncSupp);
        if (nScriptFieldIDCreate != 0) {
            FieldID fieldID2 = new FieldID(nScriptFieldIDCreate, this.mRS, this, i);
            this.mFIDs.put(i, fieldID2);
            return fieldID2;
        }
        throw new RSDriverException("Failed to create FieldID");
    }

    /* access modifiers changed from: protected */
    public InvokeID createInvokeID(int i) {
        InvokeID invokeID = this.mIIDs.get(i);
        if (invokeID != null) {
            return invokeID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptInvokeIDCreate = renderScript.nScriptInvokeIDCreate(getID(renderScript), i);
        if (nScriptInvokeIDCreate != 0) {
            InvokeID invokeID2 = new InvokeID(nScriptInvokeIDCreate, this.mRS, this, i);
            this.mIIDs.put(i, invokeID2);
            return invokeID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }

    /* access modifiers changed from: protected */
    public KernelID createKernelID(int i, int i2, Element element, Element element2) {
        KernelID kernelID = this.mKIDs.get(i);
        if (kernelID != null) {
            return kernelID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptKernelIDCreate = renderScript.nScriptKernelIDCreate(getID(renderScript), i, i2, this.mUseIncSupp);
        if (nScriptKernelIDCreate != 0) {
            KernelID kernelID2 = new KernelID(nScriptKernelIDCreate, this.mRS, this, i, i2);
            this.mKIDs.put(i, kernelID2);
            return kernelID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }

    /* access modifiers changed from: protected */
    public void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (allocation3 == null && allocation4 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long j = 0;
        long id = allocation3 != null ? allocation3.getID(this.mRS) : 0;
        if (allocation4 != null) {
            j = allocation4.getID(this.mRS);
        }
        long j2 = j;
        byte[] bArr = null;
        if (fieldPacker != null) {
            bArr = fieldPacker.getData();
        }
        byte[] bArr2 = bArr;
        if (this.mUseIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation3);
            long dummyAlloc2 = getDummyAlloc(allocation4);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptForEach(getID(renderScript), i, dummyAlloc, dummyAlloc2, bArr2, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptForEach(getID(renderScript2), i, id, j2, bArr2, this.mUseIncSupp);
    }

    /* access modifiers changed from: package-private */
    public long getDummyAlloc(Allocation allocation) {
        if (allocation == null) {
            return 0;
        }
        Type type = allocation.getType();
        long dummyElement = type.getElement().getDummyElement(this.mRS);
        RenderScript renderScript = this.mRS;
        long nIncAllocationCreateTyped = renderScript.nIncAllocationCreateTyped(allocation.getID(renderScript), type.getDummyType(this.mRS, dummyElement), type.getX() * type.getElement().getBytesSize());
        allocation.setIncAllocID(nIncAllocationCreateTyped);
        return nIncAllocationCreateTyped;
    }

    /* access modifiers changed from: protected */
    public void invoke(int i) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptInvoke(getID(renderScript), i, this.mUseIncSupp);
    }

    /* access modifiers changed from: protected */
    public boolean isIncSupp() {
        return this.mUseIncSupp;
    }

    /* access modifiers changed from: protected */
    public void reduce(int i, Allocation[] allocationArr, Allocation allocation, LaunchOptions launchOptions) {
        this.mRS.validate();
        if (allocationArr == null || allocationArr.length < 1) {
            throw new RSIllegalArgumentException("At least one input is required.");
        } else if (allocation != null) {
            for (Allocation validateObject : allocationArr) {
                this.mRS.validateObject(validateObject);
            }
            long[] jArr = new long[allocationArr.length];
            for (int i2 = 0; i2 < allocationArr.length; i2++) {
                jArr[i2] = allocationArr[i2].getID(this.mRS);
            }
            long id = allocation.getID(this.mRS);
            int[] iArr = null;
            if (launchOptions != null) {
                iArr = new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend};
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptReduce(getID(renderScript), i, jArr, id, iArr);
        } else {
            throw new RSIllegalArgumentException("aout is required to be non-null.");
        }
    }

    /* access modifiers changed from: protected */
    public void setIncSupp(boolean z) {
        this.mUseIncSupp = z;
    }

    public void setTimeZone(String str) {
        this.mRS.validate();
        try {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetTimeZone(getID(renderScript), str.getBytes("UTF-8"), this.mUseIncSupp);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setVar(int i, float f) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarF(getID(renderScript), i, f, this.mUseIncSupp);
    }

    /* access modifiers changed from: protected */
    public void invoke(int i, FieldPacker fieldPacker) {
        if (fieldPacker != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptInvokeV(getID(renderScript), i, fieldPacker.getData(), this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptInvoke(getID(renderScript2), i, this.mUseIncSupp);
    }

    public void setVar(int i, double d) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarD(getID(renderScript), i, d, this.mUseIncSupp);
    }

    public void setVar(int i, int i2) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i, i2, this.mUseIncSupp);
    }

    public void setVar(int i, long j) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarJ(getID(renderScript), i, j, this.mUseIncSupp);
    }

    public void setVar(int i, boolean z) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i, z ? 1 : 0, this.mUseIncSupp);
    }

    public void setVar(int i, BaseObj baseObj) {
        BaseObj baseObj2 = baseObj;
        long j = 0;
        if (this.mUseIncSupp) {
            long dummyAlloc = getDummyAlloc((Allocation) baseObj2);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarObj(getID(renderScript), i, baseObj2 == null ? 0 : dummyAlloc, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        long id = getID(renderScript2);
        if (baseObj2 != null) {
            j = baseObj2.getID(this.mRS);
        }
        renderScript2.nScriptSetVarObj(id, i, j, this.mUseIncSupp);
    }

    /* access modifiers changed from: protected */
    public void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (allocation3 == null && allocation4 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        } else if (launchOptions == null) {
            forEach(i, allocation, allocation2, fieldPacker);
        } else {
            long j = 0;
            long id = allocation3 != null ? allocation3.getID(this.mRS) : 0;
            if (allocation4 != null) {
                j = allocation4.getID(this.mRS);
            }
            long j2 = j;
            byte[] bArr = null;
            if (fieldPacker != null) {
                bArr = fieldPacker.getData();
            }
            byte[] bArr2 = bArr;
            if (this.mUseIncSupp) {
                long dummyAlloc = getDummyAlloc(allocation3);
                long dummyAlloc2 = getDummyAlloc(allocation4);
                RenderScript renderScript = this.mRS;
                renderScript.nScriptForEachClipped(getID(renderScript), i, dummyAlloc, dummyAlloc2, bArr2, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
                return;
            }
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptForEachClipped(getID(renderScript2), i, id, j2, bArr2, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
        }
    }

    public void setVar(int i, FieldPacker fieldPacker) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarV(getID(renderScript), i, fieldPacker.getData(), this.mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldPacker, Element element, int[] iArr) {
        Element element2 = element;
        if (this.mUseIncSupp) {
            long dummyElement = element2.getDummyElement(this.mRS);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarVE(getID(renderScript), i, fieldPacker.getData(), dummyElement, iArr, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptSetVarVE(getID(renderScript2), i, fieldPacker.getData(), element2.getID(this.mRS), iArr, this.mUseIncSupp);
    }

    /* access modifiers changed from: protected */
    public void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker) {
        forEach(i, allocationArr, allocation, fieldPacker, (LaunchOptions) null);
    }

    /* access modifiers changed from: protected */
    public void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        long[] jArr;
        Allocation[] allocationArr2 = allocationArr;
        Allocation allocation2 = allocation;
        this.mRS.validate();
        if (allocationArr2 != null) {
            for (Allocation validateObject : allocationArr2) {
                this.mRS.validateObject(validateObject);
            }
        }
        this.mRS.validateObject(allocation2);
        if (allocationArr2 == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        int[] iArr = null;
        if (allocationArr2 != null) {
            long[] jArr2 = new long[allocationArr2.length];
            for (int i2 = 0; i2 < allocationArr2.length; i2++) {
                jArr2[i2] = allocationArr2[i2].getID(this.mRS);
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        long id = allocation2 != null ? allocation2.getID(this.mRS) : 0;
        byte[] data = fieldPacker != null ? fieldPacker.getData() : null;
        if (launchOptions != null) {
            iArr = new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend};
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptForEach(getID(renderScript), i, jArr, id, data, iArr);
    }
}
