/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abnt;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author vinys
 */
public class Abnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FrmFormatar frm = new FrmFormatar();
//        frm.setVisible(true);
        Formatar formatar =  new Formatar(
                "Titulo do  livro",
                "subtitulo do livro",
                "Vinicius Sales Rebouças, Vitor Rocha, Kervin Sama, Hugo Resende",
                "Editora",
                "SP",
                5,
                1,
                100,
                2021);
        String formataReferencia = formatar.formataReferencia();
        
        StringSelection selection = new StringSelection(formataReferencia);
        Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        systemClipboard.setContents(selection, null);
        System.out.println(formataReferencia);
    }
}
