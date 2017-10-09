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
    public void ser1(Box myBox) {      
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
