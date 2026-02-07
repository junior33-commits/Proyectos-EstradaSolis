
package Ejemplo14;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class CodigoBarras {
    public void crea128(String c) throws IOException{
        JBarcodeBean jb=new JBarcodeBean();
        jb.setCodeType(new Code128());
        jb.setCode(c);
        jb.setCheckDigit(false);
        BufferedImage bi;
        bi=jb.draw(new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB));
        File file=new File("./src/Ejemplo14/"+c+".jpg");
        ImageIO.write(bi,"jpg", file);
    }
}
