
package imageviewer;

import Control.MainFrame;
import Model.Image;
import Persistence.FileImageLoader;
import java.io.File;
/**
 *
 * @author Ruben Garcia Quintana
 */
public class ImageViewer {

    public static void main(String[] args) {

        File file = new File("images");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.getImageDisplay().show(image);
        


    }
    
}
