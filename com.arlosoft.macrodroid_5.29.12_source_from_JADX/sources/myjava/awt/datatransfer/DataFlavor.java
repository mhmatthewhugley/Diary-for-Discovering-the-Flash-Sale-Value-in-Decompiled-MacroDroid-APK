package myjava.awt.datatransfer;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import myjava.awt.datatransfer.MimeTypeProcessor;
import org.apache.harmony.awt.datatransfer.DTK;
import org.apache.harmony.awt.datatransfer.DataProvider;
import org.apache.harmony.awt.internal.nls.Messages;
import org.apache.http.protocol.HTTP;

public class DataFlavor implements Externalizable, Cloneable {
    public static final DataFlavor javaFileListFlavor = new DataFlavor("application/x-java-file-list; class=java.util.List", "application/x-java-file-list");
    public static final String javaJVMLocalObjectMimeType = "application/x-java-jvm-local-objectref";
    public static final String javaRemoteObjectMimeType = "application/x-java-remote-object";
    public static final String javaSerializedObjectMimeType = "application/x-java-serialized-object";
    @Deprecated
    public static final DataFlavor plainTextFlavor = new DataFlavor("text/plain; charset=unicode; class=java.io.InputStream", "Plain Text");
    private static DataFlavor plainUnicodeFlavor = null;
    private static final long serialVersionUID = 8367026044764648243L;
    private static final String[] sortedTextFlavors = {"text/sgml", "text/xml", "text/html", "text/rtf", "text/enriched", "text/richtext", DataProvider.TYPE_URILIST, "text/tab-separated-values", "text/t140", "text/rfc822-headers", "text/parityfec", "text/directory", "text/css", "text/calendar", "application/x-java-serialized-object", "text/plain"};
    public static final DataFlavor stringFlavor = new DataFlavor("application/x-java-serialized-object; class=java.lang.String", "Unicode String");
    private String humanPresentableName;
    private MimeTypeProcessor.MimeType mimeInfo;
    private Class<?> representationClass;

    public DataFlavor() {
        this.mimeInfo = null;
        this.humanPresentableName = null;
        this.representationClass = null;
    }

    private static List<DataFlavor> fetchTextFlavors(List<DataFlavor> list, String str) {
        LinkedList linkedList = new LinkedList();
        Iterator<DataFlavor> it = list.iterator();
        while (it.hasNext()) {
            DataFlavor next = it.next();
            if (!next.isFlavorTextType()) {
                it.remove();
            } else if (next.mimeInfo.getFullType().equals(str)) {
                if (!linkedList.contains(next)) {
                    linkedList.add(next);
                }
                it.remove();
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    private String getCharset() {
        if (this.mimeInfo == null || isCharsetRedundant()) {
            return "";
        }
        String parameter = this.mimeInfo.getParameter("charset");
        if (isCharsetRequired() && (parameter == null || parameter.length() == 0)) {
            return DTK.getDTK().getDefaultCharset();
        }
        if (parameter == null) {
            return "";
        }
        return parameter;
    }

    private static List<DataFlavor> getFlavors(List<DataFlavor> list, String[] strArr) {
        LinkedList linkedList = new LinkedList();
        Iterator<DataFlavor> it = list.iterator();
        while (it.hasNext()) {
            DataFlavor next = it.next();
            if (isCharsetSupported(next.getCharset())) {
                for (String forName : strArr) {
                    if (Charset.forName(forName).equals(Charset.forName(next.getCharset()))) {
                        linkedList.add(next);
                    }
                }
            } else {
                it.remove();
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return list;
    }

    private String getKeyInfo() {
        String str = String.valueOf(this.mimeInfo.getFullType()) + ";class=" + this.representationClass.getName();
        if (!this.mimeInfo.getPrimaryType().equals("text") || isUnicodeFlavor()) {
            return str;
        }
        return String.valueOf(str) + ";charset=" + getCharset().toLowerCase();
    }

    public static final DataFlavor getTextPlainUnicodeFlavor() {
        if (plainUnicodeFlavor == null) {
            plainUnicodeFlavor = new DataFlavor("text/plain; charset=" + DTK.getDTK().getDefaultCharset() + "; class=java.io.InputStream", "Plain Text");
        }
        return plainUnicodeFlavor;
    }

    private void init(String str, String str2, ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls;
        try {
            MimeTypeProcessor.MimeType parse = MimeTypeProcessor.parse(str);
            this.mimeInfo = parse;
            if (str2 != null) {
                this.humanPresentableName = str2;
            } else {
                this.humanPresentableName = String.valueOf(parse.getPrimaryType()) + '/' + this.mimeInfo.getSubType();
            }
            String parameter = this.mimeInfo.getParameter("class");
            if (parameter == null) {
                parameter = "java.io.InputStream";
                this.mimeInfo.addParameter("class", parameter);
            }
            if (classLoader == null) {
                cls = Class.forName(parameter);
            } else {
                cls = classLoader.loadClass(parameter);
            }
            this.representationClass = cls;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(Messages.getString("awt.16D", (Object) str));
        }
    }

    private boolean isByteCodeFlavor() {
        Class<?> cls = this.representationClass;
        if (cls != null) {
            return cls.equals(InputStream.class) || this.representationClass.equals(ByteBuffer.class) || this.representationClass.equals(byte[].class);
        }
        return false;
    }

    private boolean isCharsetRedundant() {
        String fullType = this.mimeInfo.getFullType();
        return fullType.equals("text/rtf") || fullType.equals("text/tab-separated-values") || fullType.equals("text/t140") || fullType.equals("text/rfc822-headers") || fullType.equals("text/parityfec");
    }

    private boolean isCharsetRequired() {
        String fullType = this.mimeInfo.getFullType();
        return fullType.equals("text/sgml") || fullType.equals("text/xml") || fullType.equals("text/html") || fullType.equals("text/enriched") || fullType.equals("text/richtext") || fullType.equals(DataProvider.TYPE_URILIST) || fullType.equals("text/directory") || fullType.equals("text/css") || fullType.equals("text/calendar") || fullType.equals("application/x-java-serialized-object") || fullType.equals("text/plain");
    }

    private static boolean isCharsetSupported(String str) {
        try {
            return Charset.isSupported(str);
        } catch (IllegalCharsetNameException unused) {
            return false;
        }
    }

    private boolean isUnicodeFlavor() {
        Class<?> cls = this.representationClass;
        if (cls != null) {
            return cls.equals(Reader.class) || this.representationClass.equals(String.class) || this.representationClass.equals(CharBuffer.class) || this.representationClass.equals(char[].class);
        }
        return false;
    }

    private static List<DataFlavor> selectBestByAlphabet(List<DataFlavor> list) {
        int size = list.size();
        String[] strArr = new String[size];
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).getCharset();
        }
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        for (DataFlavor next : list) {
            if (strArr[0].equalsIgnoreCase(next.getCharset())) {
                linkedList.add(next);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    private static DataFlavor selectBestByCharset(List<DataFlavor> list) {
        List<DataFlavor> flavors = getFlavors(list, new String[]{HTTP.UTF_16, "UTF-8", "UTF-16BE", "UTF-16LE"});
        if (flavors == null && (flavors = getFlavors(list, new String[]{DTK.getDTK().getDefaultCharset()})) == null && (flavors = getFlavors(list, new String[]{"US-ASCII"})) == null) {
            flavors = selectBestByAlphabet(list);
        }
        if (flavors == null) {
            return null;
        }
        if (flavors.size() == 1) {
            return flavors.get(0);
        }
        return selectBestFlavorWOCharset(flavors);
    }

    private static DataFlavor selectBestFlavorWCharset(List<DataFlavor> list) {
        List<DataFlavor> flavors = getFlavors(list, (Class<?>) Reader.class);
        if (flavors != null) {
            return flavors.get(0);
        }
        List<DataFlavor> flavors2 = getFlavors(list, (Class<?>) String.class);
        if (flavors2 != null) {
            return flavors2.get(0);
        }
        List<DataFlavor> flavors3 = getFlavors(list, (Class<?>) CharBuffer.class);
        if (flavors3 != null) {
            return flavors3.get(0);
        }
        List<DataFlavor> flavors4 = getFlavors(list, (Class<?>) char[].class);
        if (flavors4 != null) {
            return flavors4.get(0);
        }
        return selectBestByCharset(list);
    }

    private static DataFlavor selectBestFlavorWOCharset(List<DataFlavor> list) {
        List<DataFlavor> flavors = getFlavors(list, (Class<?>) InputStream.class);
        if (flavors != null) {
            return flavors.get(0);
        }
        List<DataFlavor> flavors2 = getFlavors(list, (Class<?>) ByteBuffer.class);
        if (flavors2 != null) {
            return flavors2.get(0);
        }
        List<DataFlavor> flavors3 = getFlavors(list, (Class<?>) byte[].class);
        if (flavors3 != null) {
            return flavors3.get(0);
        }
        return list.get(0);
    }

    public static final DataFlavor selectBestTextFlavor(DataFlavor[] dataFlavorArr) {
        if (dataFlavorArr == null) {
            return null;
        }
        List<List<DataFlavor>> sortTextFlavorsByType = sortTextFlavorsByType(new LinkedList(Arrays.asList(dataFlavorArr)));
        if (sortTextFlavorsByType.isEmpty()) {
            return null;
        }
        List list = sortTextFlavorsByType.get(0);
        if (list.size() == 1) {
            return (DataFlavor) list.get(0);
        }
        if (((DataFlavor) list.get(0)).getCharset().length() == 0) {
            return selectBestFlavorWOCharset(list);
        }
        return selectBestFlavorWCharset(list);
    }

    private static List<List<DataFlavor>> sortTextFlavorsByType(List<DataFlavor> list) {
        LinkedList linkedList = new LinkedList();
        for (String fetchTextFlavors : sortedTextFlavors) {
            List<DataFlavor> fetchTextFlavors2 = fetchTextFlavors(list, fetchTextFlavors);
            if (fetchTextFlavors2 != null) {
                linkedList.addLast(fetchTextFlavors2);
            }
        }
        if (!list.isEmpty()) {
            linkedList.addLast(list);
        }
        return linkedList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return r0.loadClass(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2.loadClass(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return java.lang.ClassLoader.getSystemClassLoader().loadClass(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = java.lang.Thread.currentThread().getContextClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final java.lang.Class<?> tryToLoadClass(java.lang.String r1, java.lang.ClassLoader r2) throws java.lang.ClassNotFoundException {
        /*
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0005 }
            return r1
        L_0x0005:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ ClassNotFoundException -> 0x000e }
            java.lang.Class r1 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x000e }
            return r1
        L_0x000e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 == 0) goto L_0x001e
            java.lang.Class r1 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x001e }
            return r1
        L_0x001e:
            java.lang.Class r1 = r2.loadClass(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: myjava.awt.datatransfer.DataFlavor.tryToLoadClass(java.lang.String, java.lang.ClassLoader):java.lang.Class");
    }

    public Object clone() throws CloneNotSupportedException {
        DataFlavor dataFlavor = new DataFlavor();
        dataFlavor.humanPresentableName = this.humanPresentableName;
        dataFlavor.representationClass = this.representationClass;
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        dataFlavor.mimeInfo = mimeType != null ? (MimeTypeProcessor.MimeType) mimeType.clone() : null;
        return dataFlavor;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DataFlavor)) {
            return false;
        }
        return equals((DataFlavor) obj);
    }

    public final Class<?> getDefaultRepresentationClass() {
        return InputStream.class;
    }

    public final String getDefaultRepresentationClassAsString() {
        return getDefaultRepresentationClass().getName();
    }

    public String getHumanPresentableName() {
        return this.humanPresentableName;
    }

    /* access modifiers changed from: package-private */
    public MimeTypeProcessor.MimeType getMimeInfo() {
        return this.mimeInfo;
    }

    public String getMimeType() {
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null) {
            return MimeTypeProcessor.assemble(mimeType);
        }
        return null;
    }

    public String getParameter(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("humanpresentablename")) {
            return this.humanPresentableName;
        }
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null) {
            return mimeType.getParameter(lowerCase);
        }
        return null;
    }

    public String getPrimaryType() {
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null) {
            return mimeType.getPrimaryType();
        }
        return null;
    }

    public Reader getReaderForText(Transferable transferable) throws UnsupportedFlavorException, IOException {
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        Object transferData = transferable.getTransferData(this);
        if (transferData == null) {
            throw new IllegalArgumentException(Messages.getString("awt.16E"));
        } else if (transferData instanceof Reader) {
            Reader reader = (Reader) transferData;
            reader.reset();
            return reader;
        } else if (transferData instanceof String) {
            return new StringReader((String) transferData);
        } else {
            if (transferData instanceof CharBuffer) {
                return new CharArrayReader(((CharBuffer) transferData).array());
            }
            if (transferData instanceof char[]) {
                return new CharArrayReader((char[]) transferData);
            }
            String charset = getCharset();
            if (transferData instanceof InputStream) {
                inputStream = (InputStream) transferData;
                inputStream.reset();
            } else {
                if (transferData instanceof ByteBuffer) {
                    byteArrayInputStream = new ByteArrayInputStream(((ByteBuffer) transferData).array());
                } else if (transferData instanceof byte[]) {
                    byteArrayInputStream = new ByteArrayInputStream((byte[]) transferData);
                } else {
                    throw new IllegalArgumentException(Messages.getString("awt.16F"));
                }
                inputStream = byteArrayInputStream;
            }
            if (charset.length() == 0) {
                return new InputStreamReader(inputStream);
            }
            return new InputStreamReader(inputStream, charset);
        }
    }

    public Class<?> getRepresentationClass() {
        return this.representationClass;
    }

    public String getSubType() {
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null) {
            return mimeType.getSubType();
        }
        return null;
    }

    public int hashCode() {
        return getKeyInfo().hashCode();
    }

    public boolean isFlavorJavaFileListType() {
        return List.class.isAssignableFrom(this.representationClass) && isMimeTypeEqual(javaFileListFlavor);
    }

    public boolean isFlavorRemoteObjectType() {
        return isMimeTypeEqual(javaRemoteObjectMimeType) && isRepresentationClassRemote();
    }

    public boolean isFlavorSerializedObjectType() {
        return isMimeTypeSerializedObject() && isRepresentationClassSerializable();
    }

    public boolean isFlavorTextType() {
        if (equals(stringFlavor) || equals(plainTextFlavor)) {
            return true;
        }
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null && !mimeType.getPrimaryType().equals("text")) {
            return false;
        }
        String charset = getCharset();
        if (!isByteCodeFlavor()) {
            return isUnicodeFlavor();
        }
        if (charset.length() != 0) {
            return isCharsetSupported(charset);
        }
        return true;
    }

    public final boolean isMimeTypeEqual(DataFlavor dataFlavor) {
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType != null) {
            return mimeType.equals(dataFlavor.mimeInfo);
        }
        return dataFlavor.mimeInfo == null;
    }

    public boolean isMimeTypeSerializedObject() {
        return isMimeTypeEqual("application/x-java-serialized-object");
    }

    public boolean isRepresentationClassByteBuffer() {
        return ByteBuffer.class.isAssignableFrom(this.representationClass);
    }

    public boolean isRepresentationClassCharBuffer() {
        return CharBuffer.class.isAssignableFrom(this.representationClass);
    }

    public boolean isRepresentationClassInputStream() {
        return InputStream.class.isAssignableFrom(this.representationClass);
    }

    public boolean isRepresentationClassReader() {
        return Reader.class.isAssignableFrom(this.representationClass);
    }

    public boolean isRepresentationClassRemote() {
        return false;
    }

    public boolean isRepresentationClassSerializable() {
        return Serializable.class.isAssignableFrom(this.representationClass);
    }

    public boolean match(DataFlavor dataFlavor) {
        return equals(dataFlavor);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String normalizeMimeType(String str) {
        return str;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String normalizeMimeTypeParameter(String str, String str2) {
        return str2;
    }

    public synchronized void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.humanPresentableName = (String) objectInput.readObject();
        MimeTypeProcessor.MimeType mimeType = (MimeTypeProcessor.MimeType) objectInput.readObject();
        this.mimeInfo = mimeType;
        this.representationClass = mimeType != null ? Class.forName(mimeType.getParameter("class")) : null;
    }

    public void setHumanPresentableName(String str) {
        this.humanPresentableName = str;
    }

    public String toString() {
        return getClass().getName() + "[MimeType=(" + getMimeType() + ");humanPresentableName=" + this.humanPresentableName + "]";
    }

    public synchronized void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.humanPresentableName);
        objectOutput.writeObject(this.mimeInfo);
    }

    public boolean equals(DataFlavor dataFlavor) {
        if (dataFlavor == this) {
            return true;
        }
        if (dataFlavor == null) {
            return false;
        }
        MimeTypeProcessor.MimeType mimeType = this.mimeInfo;
        if (mimeType == null) {
            return dataFlavor.mimeInfo == null;
        }
        if (!mimeType.equals(dataFlavor.mimeInfo) || !this.representationClass.equals(dataFlavor.representationClass)) {
            return false;
        }
        if (!this.mimeInfo.getPrimaryType().equals("text") || isUnicodeFlavor()) {
            return true;
        }
        String charset = getCharset();
        String charset2 = dataFlavor.getCharset();
        if (!isCharsetSupported(charset) || !isCharsetSupported(charset2)) {
            return charset.equalsIgnoreCase(charset2);
        }
        return Charset.forName(charset).equals(Charset.forName(charset2));
    }

    public boolean isMimeTypeEqual(String str) {
        try {
            return this.mimeInfo.equals(MimeTypeProcessor.parse(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public DataFlavor(Class<?> cls, String str) {
        MimeTypeProcessor.MimeType mimeType = new MimeTypeProcessor.MimeType("application", "x-java-serialized-object");
        this.mimeInfo = mimeType;
        if (str != null) {
            this.humanPresentableName = str;
        } else {
            this.humanPresentableName = "application/x-java-serialized-object";
        }
        mimeType.addParameter("class", cls.getName());
        this.representationClass = cls;
    }

    private static List<DataFlavor> getFlavors(List<DataFlavor> list, Class<?> cls) {
        LinkedList linkedList = new LinkedList();
        for (DataFlavor next : list) {
            if (next.representationClass.equals(cls)) {
                linkedList.add(next);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return list;
    }

    public DataFlavor(String str, String str2) {
        try {
            init(str, str2, (ClassLoader) null);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(Messages.getString("awt.16C", (Object) this.mimeInfo.getParameter("class")), e);
        }
    }

    @Deprecated
    public boolean equals(String str) {
        if (str == null) {
            return false;
        }
        return isMimeTypeEqual(str);
    }

    public DataFlavor(String str) throws ClassNotFoundException {
        init(str, (String) null, (ClassLoader) null);
    }

    public DataFlavor(String str, String str2, ClassLoader classLoader) throws ClassNotFoundException {
        init(str, str2, classLoader);
    }
}
