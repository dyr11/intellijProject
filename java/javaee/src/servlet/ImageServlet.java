package servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

/**
 * Created by dyr on 2016/8/9.
 */
@WebServlet(name = "ImageServlet",urlPatterns = {"/image"})
public class ImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedImage bufferedImage=new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB);
        Graphics graphics=bufferedImage.getGraphics();
        Random random=new Random(new Date().getTime());
        char[] chars="QAZWSXEDCRFVTGBYHNUJMIKOLP1234567890".toCharArray();
        for(int i=0;i<4;i++){
            Color color=new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
            graphics.setColor(color);
            graphics.drawString(chars[random.nextInt(chars.length)]+"",20+50*i,50);
        }
        ImageIO.write(bufferedImage,"JPG",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("image start!");
        doPost(request,response);
    }
}
