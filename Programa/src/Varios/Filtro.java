/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

/**
 *
 * @author Jhony
 */
public class Filtro extends javax.swing.filechooser.FileFilter {

    String extension;

    public Filtro(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(java.io.File f) {
        String s = f.getName();
        if (f.isDirectory()) {
            return true;
        }
        if (f.getName().endsWith(extension)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return ("." + extension);
    }
}
