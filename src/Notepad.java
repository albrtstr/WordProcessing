
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Notepad extends JFrame implements ActionListener{
    private Dokumen dokumen;
    private JMenu editMenu;
    private JMenuItem UndoMenuItem;
    private JMenuItem RedoMenuItem;
    private JMenuBar menuBar;
    private JTextArea isiDoc;
    private JScrollPane scroll;
    private Stack undoStack;
    private Stack redoStack;
    
    public Notepad(){
        this.setSize(525, 413);
        this.setTitle("Word Processing");
        init();
        dokumen = new Dokumen();
        undoStack = new Stack();
        redoStack = new Stack();
    }
   
    public void push(Stack value){
        push(value);
        undoStack.push("push");
        redoStack.pop();
    }
    
    public void init(){
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        menuBar = new JMenuBar();
        editMenu = new JMenu ("Edit");
        UndoMenuItem = new JMenuItem ("Undo");
        RedoMenuItem = new JMenuItem ("Redo");
        isiDoc = new JTextArea();
        scroll = new JScrollPane();
        editMenu.add(UndoMenuItem);
        editMenu.add(RedoMenuItem);
        menuBar.add(editMenu);
        
        this.setJMenuBar(menuBar);
        
        isiDoc.setColumns(20);
        isiDoc.setRows(5);
        scroll.setViewportView(isiDoc);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == UndoMenuItem) {
//            while (!stack.isEmpty()) {
//                stack.pop();
//            }
//        }
//        if (e.getSource() == RedoMenuItem) {
//            stack.push(WIDTH);
//        }
    }

    public Dokumen getDokumen() {
        return dokumen;
    }

    public void setDokumen(Dokumen dokumen) {
        this.dokumen = dokumen;
    }
    
    
    
    
    public static void main(String[] args) {
        Notepad jadi = new Notepad();
        jadi.setVisible(true);
    }
}
