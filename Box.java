import java.io.*;


public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w) {
        width=w;
    }
    public void setHeight(int h) {
        height=h;
    }

    public  void test437 (int width, int height) {
        Box myBox=new Box();
        myBox.setWidth(width);
        myBox.setHeight(height);

        try {
            FileOutputStream fs=new FileOutputStream("foo.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
