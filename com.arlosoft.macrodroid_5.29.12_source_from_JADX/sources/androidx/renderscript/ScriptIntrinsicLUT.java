package androidx.renderscript;

import androidx.renderscript.Script;
import com.android.p023dx.p026io.Opcodes;

public class ScriptIntrinsicLUT extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private final byte[] mCache = new byte[1024];
    private boolean mDirty = true;
    private final Matrix4f mMatrix = new Matrix4f();
    private Allocation mTables;

    protected ScriptIntrinsicLUT(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicLUT create(RenderScript renderScript, Element element) {
        boolean isUseNative = renderScript.isUseNative();
        ScriptIntrinsicLUT scriptIntrinsicLUT = new ScriptIntrinsicLUT(renderScript.nScriptIntrinsicCreate(3, element.getID(renderScript), false), renderScript);
        scriptIntrinsicLUT.setIncSupp(false);
        scriptIntrinsicLUT.mTables = Allocation.createSized(renderScript, Element.m552U8(renderScript), 1024);
        for (int i = 0; i < 256; i++) {
            byte[] bArr = scriptIntrinsicLUT.mCache;
            byte b = (byte) i;
            bArr[i] = b;
            bArr[i + 256] = b;
            bArr[i + 512] = b;
            bArr[i + Opcodes.FILL_ARRAY_DATA_PAYLOAD] = b;
        }
        scriptIntrinsicLUT.setVar(0, (BaseObj) scriptIntrinsicLUT.mTables);
        return scriptIntrinsicLUT;
    }

    private void validate(int i, int i2) {
        if (i < 0 || i > 255) {
            throw new RSIllegalArgumentException("Index out of range (0-255).");
        } else if (i2 < 0 || i2 > 255) {
            throw new RSIllegalArgumentException("Value out of range (0-255).");
        }
    }

    public void forEach(Allocation allocation, Allocation allocation2) {
        if (this.mDirty) {
            this.mDirty = false;
            this.mTables.copyFromUnchecked(this.mCache);
        }
        forEach(0, allocation, allocation2, (FieldPacker) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 3, (Element) null, (Element) null);
    }

    public void setAlpha(int i, int i2) {
        validate(i, i2);
        this.mCache[i + Opcodes.FILL_ARRAY_DATA_PAYLOAD] = (byte) i2;
        this.mDirty = true;
    }

    public void setBlue(int i, int i2) {
        validate(i, i2);
        this.mCache[i + 512] = (byte) i2;
        this.mDirty = true;
    }

    public void setGreen(int i, int i2) {
        validate(i, i2);
        this.mCache[i + 256] = (byte) i2;
        this.mDirty = true;
    }

    public void setRed(int i, int i2) {
        validate(i, i2);
        this.mCache[i] = (byte) i2;
        this.mDirty = true;
    }
}
