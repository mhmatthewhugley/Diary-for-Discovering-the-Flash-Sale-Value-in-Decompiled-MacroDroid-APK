package javax.mail;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public abstract class Multipart {
    protected String contentType = "multipart/mixed";
    protected Part parent;
    protected Vector<BodyPart> parts = new Vector<>();

    protected Multipart() {
    }

    public synchronized void addBodyPart(BodyPart bodyPart) throws MessagingException {
        if (this.parts == null) {
            this.parts = new Vector<>();
        }
        this.parts.addElement(bodyPart);
        bodyPart.setParent(this);
    }

    public synchronized BodyPart getBodyPart(int i) throws MessagingException {
        Vector<BodyPart> vector;
        vector = this.parts;
        if (vector != null) {
        } else {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
        return vector.elementAt(i);
    }

    public synchronized String getContentType() {
        return this.contentType;
    }

    public synchronized int getCount() throws MessagingException {
        Vector<BodyPart> vector = this.parts;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public synchronized Part getParent() {
        return this.parent;
    }

    public synchronized boolean removeBodyPart(BodyPart bodyPart) throws MessagingException {
        boolean removeElement;
        Vector<BodyPart> vector = this.parts;
        if (vector != null) {
            removeElement = vector.removeElement(bodyPart);
            bodyPart.setParent((Multipart) null);
        } else {
            throw new MessagingException("No such body part");
        }
        return removeElement;
    }

    /* access modifiers changed from: protected */
    public synchronized void setMultipartDataSource(MultipartDataSource multipartDataSource) throws MessagingException {
        this.contentType = multipartDataSource.getContentType();
        int count = multipartDataSource.getCount();
        for (int i = 0; i < count; i++) {
            addBodyPart(multipartDataSource.getBodyPart(i));
        }
    }

    public synchronized void setParent(Part part) {
        this.parent = part;
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException, MessagingException;

    public synchronized void addBodyPart(BodyPart bodyPart, int i) throws MessagingException {
        if (this.parts == null) {
            this.parts = new Vector<>();
        }
        this.parts.insertElementAt(bodyPart, i);
        bodyPart.setParent(this);
    }

    public synchronized void removeBodyPart(int i) throws MessagingException {
        Vector<BodyPart> vector = this.parts;
        if (vector != null) {
            this.parts.removeElementAt(i);
            vector.elementAt(i).setParent((Multipart) null);
        } else {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
    }
}
