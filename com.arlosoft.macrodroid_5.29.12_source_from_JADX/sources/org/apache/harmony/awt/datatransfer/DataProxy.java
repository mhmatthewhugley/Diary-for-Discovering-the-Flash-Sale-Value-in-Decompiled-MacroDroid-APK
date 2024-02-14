package org.apache.harmony.awt.datatransfer;

import java.awt.Image;
import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.SystemFlavorMap;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DataBufferUShort;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import org.apache.harmony.awt.internal.nls.Messages;

public final class DataProxy implements Transferable {
    public static final Class[] charsetTextClasses = {byte[].class, ByteBuffer.class, InputStream.class};
    public static final Class[] unicodeTextClasses = {String.class, Reader.class, CharBuffer.class, char[].class};
    private final DataProvider data;
    private final SystemFlavorMap flavorMap = SystemFlavorMap.getDefaultFlavorMap();

    public DataProxy(DataProvider dataProvider) {
        this.data = dataProvider;
    }

    private BufferedImage createBufferedImage(RawBitmap rawBitmap) {
        Object obj;
        DirectColorModel directColorModel;
        WritableRaster writableRaster;
        int[] iArr;
        RawBitmap rawBitmap2 = rawBitmap;
        if (rawBitmap2 != null && (obj = rawBitmap2.buffer) != null && rawBitmap2.width > 0 && rawBitmap2.height > 0) {
            int i = rawBitmap2.bits;
            if (i != 32 || !(obj instanceof int[])) {
                if (i == 24 && (obj instanceof byte[])) {
                    int[] iArr2 = {8, 8, 8};
                    if (isRGB(rawBitmap)) {
                        iArr = new int[3];
                        iArr[1] = 1;
                        iArr[2] = 2;
                    } else if (!isBGR(rawBitmap)) {
                        return null;
                    } else {
                        iArr = new int[3];
                        iArr[0] = 2;
                        iArr[1] = 1;
                    }
                    int[] iArr3 = iArr;
                    byte[] bArr = (byte[]) rawBitmap2.buffer;
                    directColorModel = new ComponentColorModel(ColorSpace.getInstance(1000), iArr2, false, false, 1, 0);
                    writableRaster = Raster.createInterleavedRaster(new DataBufferByte(bArr, bArr.length), rawBitmap2.width, rawBitmap2.height, rawBitmap2.stride, 3, iArr3, (Point) null);
                } else if ((i == 16 || i == 15) && (obj instanceof short[])) {
                    int[] iArr4 = {rawBitmap2.rMask, rawBitmap2.gMask, rawBitmap2.bMask};
                    short[] sArr = (short[]) obj;
                    directColorModel = new DirectColorModel(rawBitmap2.bits, rawBitmap2.rMask, rawBitmap2.gMask, rawBitmap2.bMask);
                    writableRaster = Raster.createPackedRaster(new DataBufferUShort(sArr, sArr.length), rawBitmap2.width, rawBitmap2.height, rawBitmap2.stride, iArr4, (Point) null);
                } else {
                    writableRaster = null;
                    directColorModel = null;
                }
            } else if (!isRGB(rawBitmap) && !isBGR(rawBitmap)) {
                return null;
            } else {
                int[] iArr5 = {rawBitmap2.rMask, rawBitmap2.gMask, rawBitmap2.bMask};
                int[] iArr6 = (int[]) rawBitmap2.buffer;
                directColorModel = new DirectColorModel(24, rawBitmap2.rMask, rawBitmap2.gMask, rawBitmap2.bMask);
                writableRaster = Raster.createPackedRaster(new DataBufferInt(iArr6, iArr6.length), rawBitmap2.width, rawBitmap2.height, rawBitmap2.stride, iArr5, (Point) null);
            }
            if (!(directColorModel == null || writableRaster == null)) {
                return new BufferedImage(directColorModel, writableRaster, false, (Hashtable) null);
            }
        }
        return null;
    }

    private String getCharset(DataFlavor dataFlavor) {
        return dataFlavor.getParameter("charset");
    }

    private Object getFileList(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        if (this.data.isNativeFormatAvailable("application/x-java-file-list")) {
            String[] fileList = this.data.getFileList();
            if (fileList != null) {
                return Arrays.asList(fileList);
            }
            throw new IOException(Messages.getString("awt.4F"));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private Object getHTML(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        if (this.data.isNativeFormatAvailable("text/html")) {
            String html = this.data.getHTML();
            if (html != null) {
                return getTextRepresentation(html, dataFlavor);
            }
            throw new IOException(Messages.getString("awt.4F"));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private Image getImage(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        if (this.data.isNativeFormatAvailable("image/x-java-image")) {
            RawBitmap rawBitmap = this.data.getRawBitmap();
            if (rawBitmap != null) {
                return createBufferedImage(rawBitmap);
            }
            throw new IOException(Messages.getString("awt.4F"));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private Object getPlainText(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        if (this.data.isNativeFormatAvailable("text/plain")) {
            String text = this.data.getText();
            if (text != null) {
                return getTextRepresentation(text, dataFlavor);
            }
            throw new IOException(Messages.getString("awt.4F"));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private Object getSerializedObject(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        String encodeDataFlavor = SystemFlavorMap.encodeDataFlavor(dataFlavor);
        if (encodeDataFlavor == null || !this.data.isNativeFormatAvailable(encodeDataFlavor)) {
            throw new UnsupportedFlavorException(dataFlavor);
        }
        byte[] serializedObject = this.data.getSerializedObject(dataFlavor.getRepresentationClass());
        if (serializedObject != null) {
            try {
                return new ObjectInputStream(new ByteArrayInputStream(serializedObject)).readObject();
            } catch (ClassNotFoundException e) {
                throw new IOException(e.getMessage());
            }
        } else {
            throw new IOException(Messages.getString("awt.4F"));
        }
    }

    private Object getTextRepresentation(String str, DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        if (dataFlavor.getRepresentationClass() == String.class) {
            return str;
        }
        if (dataFlavor.isRepresentationClassReader()) {
            return new StringReader(str);
        }
        if (dataFlavor.isRepresentationClassCharBuffer()) {
            return CharBuffer.wrap(str);
        }
        if (dataFlavor.getRepresentationClass() == char[].class) {
            char[] cArr = new char[str.length()];
            str.getChars(0, str.length(), cArr, 0);
            return cArr;
        }
        String charset = getCharset(dataFlavor);
        if (dataFlavor.getRepresentationClass() == byte[].class) {
            return str.getBytes(charset);
        }
        if (dataFlavor.isRepresentationClassByteBuffer()) {
            return ByteBuffer.wrap(str.getBytes(charset));
        }
        if (dataFlavor.isRepresentationClassInputStream()) {
            return new ByteArrayInputStream(str.getBytes(charset));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private Object getURL(DataFlavor dataFlavor) throws IOException, UnsupportedFlavorException {
        if (this.data.isNativeFormatAvailable("application/x-java-url")) {
            String url = this.data.getURL();
            if (url != null) {
                URL url2 = new URL(url);
                if (dataFlavor.getRepresentationClass().isAssignableFrom(URL.class)) {
                    return url2;
                }
                if (dataFlavor.isFlavorTextType()) {
                    return getTextRepresentation(url2.toString(), dataFlavor);
                }
                throw new UnsupportedFlavorException(dataFlavor);
            }
            throw new IOException(Messages.getString("awt.4F"));
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }

    private boolean isBGR(RawBitmap rawBitmap) {
        return rawBitmap.rMask == 255 && rawBitmap.gMask == 65280 && rawBitmap.bMask == 16711680;
    }

    private boolean isRGB(RawBitmap rawBitmap) {
        return rawBitmap.rMask == 16711680 && rawBitmap.gMask == 65280 && rawBitmap.bMask == 255;
    }

    public DataProvider getDataProvider() {
        return this.data;
    }

    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        String str = String.valueOf(dataFlavor.getPrimaryType()) + "/" + dataFlavor.getSubType();
        if (dataFlavor.isFlavorTextType()) {
            if (str.equalsIgnoreCase("text/html")) {
                return getHTML(dataFlavor);
            }
            if (str.equalsIgnoreCase(DataProvider.TYPE_URILIST)) {
                return getURL(dataFlavor);
            }
            return getPlainText(dataFlavor);
        } else if (dataFlavor.isFlavorJavaFileListType()) {
            return getFileList(dataFlavor);
        } else {
            if (dataFlavor.isFlavorSerializedObjectType()) {
                return getSerializedObject(dataFlavor);
            }
            if (dataFlavor.equals(DataProvider.urlFlavor)) {
                return getURL(dataFlavor);
            }
            if (str.equalsIgnoreCase("image/x-java-image") && Image.class.isAssignableFrom(dataFlavor.getRepresentationClass())) {
                return getImage(dataFlavor);
            }
            throw new UnsupportedFlavorException(dataFlavor);
        }
    }

    public DataFlavor[] getTransferDataFlavors() {
        ArrayList arrayList = new ArrayList();
        String[] nativeFormats = this.data.getNativeFormats();
        for (String flavorsForNative : nativeFormats) {
            for (DataFlavor dataFlavor : this.flavorMap.getFlavorsForNative(flavorsForNative)) {
                if (!arrayList.contains(dataFlavor)) {
                    arrayList.add(dataFlavor);
                }
            }
        }
        return (DataFlavor[]) arrayList.toArray(new DataFlavor[arrayList.size()]);
    }

    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        DataFlavor[] transferDataFlavors = getTransferDataFlavors();
        for (DataFlavor equals : transferDataFlavors) {
            if (equals.equals(dataFlavor)) {
                return true;
            }
        }
        return false;
    }
}
