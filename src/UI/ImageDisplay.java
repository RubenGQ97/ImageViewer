/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Model.Image;
/**
 *
 * @author Ruben Garcia Quintana
 */


public interface ImageDisplay {
    Image current();
    void show(Image image);
}
