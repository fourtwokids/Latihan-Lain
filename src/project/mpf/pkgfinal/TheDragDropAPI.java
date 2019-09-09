/*package project.mpf.pkgfinal;
    import java.awt.*;
    import java.awt.event.*;
    import java.awt.dnd.*;
    import java.awt.datatransfer.*;
    import java.io.*;

public class TheDragDropAPI extends Frame{
    int screenWidth = 400;
    int screenHeight = 400;
    Panel panel = new Panel();
    Label topLabel = new Label("Enter text in this text area: ");
    Label bottomLabel = new Label(" And then drag it to this text area: ");
    TextArea textArea1 = new TextArea();
    TextArea textArea2 = new TextArea();
    
    //Drag n Drop variables;
    DragSource source = new DragSource();
    DropTarget target = new DropTarget(textArea2, DnDConstants.ACTION_COPY,new 
        DropTargetHandler(),true);
    TextTransfer transferable = new TextTransfer();
    DragSourceHandler = sourceHandler = new DragSourceHandler();
    
    public static void main(String[] args){
        DragNDrop app = new DragNDrop();
        
    }public DragNDrop(){
        super("Drag n Drop");
        setup();
        setSize(screenWidth,screenHeight);
        addWindowListener(new WindowEventHandler());
        show();
    }
    
    void setup(){
        target.setActive(true);
        panel.setLayout(new GridLayout(4,1));
        panel.add(topLabel);
        panel.add(textArea1);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        try{
            toolkit.createDragGestureRecognizer(Class.forName("java.awt.dnd.MouseDraGestureRecognizer"), source, textArea1, DnDConstants.ACTION_COPY,new DragHandler());
        }catch(ClassNotFoundException ex){
            System.out.println("Recognizer class not found.");
            System.exit(0);
                    
                    
                    
        }
        panel.add(bottomLabel);
        panel.add(textArea2);
        add("Center",panel);
        
    }
    
    
}

class DragSourceHandler implements DragSourceListener{
    public void dropActionChanged(DragSourceDragEvent ev){
        System.out.println("Source: Drop action changed");
    }public void dragEnter(DragSourceDragEvent ev){System.out.println("Source: Drop action changed");}
    public void dragOver(DragSourceDragEvent ev){System.out.println("Source: Drop action changed");}
    public void dragExit(DragSourceDragEvent ev){System.out.println("Source: Drag Exit ");}
    public void dragDropEnd(DragSourceDragEvent ev){System.out.println("Source: Drag Drop End");}
}

class DropTargetHandler implements DropTargetListener{
    public void dragEnter(DropTargetDragEvent aw){
        System.out.println("Target : Drag enter ");
        DataFlavor df[] = aw.getCurrentDataFlavors();
        for (int i = 0; i<df.length;i++){
            if(df[i].equals)(DataFlavor.plainTextFlavor) ||
                    aw.acceptDrag(DnDConstants.ACTION_COPY);
            return;
        
        }
    aw.rejectDrag();
    }
    public void dragOver(DropTargetDragEvent aw){}
    public void dragExit(DropTargetEvent aw){
        System.out.println("Target: Drag Exit");}
    public void dropActionChanged(DropTargetDragEvent aw){
        System.out.println("Target : Drop action changed");}
    public void dropActionChanged(DropTargetDragEvent aw){
        System.out.println("Target: Dropped");
        aw.acceptDrop(DnDConstants.ACTION_COPY);
        Transferable transfer = aw.getTransferable();
        DataFlavor df[]=aw.getCurrentDataFlavors();
        String input ="";
        try{
            for(int i =0;i<df.length;i++){
                if(df[i].eguqls(DataFlavor.stringFlavor)||df[i].equals(
                        DataFlavor.plainTextFlavor)){
                    input = (String) transfer.getTransferData(df[i]);
                }
            }textArea2.setText(input);
        }catch[Exception e]{
            System.out.println(e.toString());
        }
        try{
            target.getDropTargetContext().dropComplete(true);
        }catch(Exception e){}
        
    }
        
}
class TextTransfer implements Transferable{
    public DataFlavor[] getTransferDataFlavors(){
        DataFlavor[] flavors = new DataFlavor[1];
        flavors[0] = DataFlavor.plainTextFlavor;
        return flavors;
    }
    public boolean isDataFlavorSupported(DataFlavor flavor){
        return(flavor.equals(DataFlavor.plainTextFlavor));
    }
    public Object getTransferData(DataFlavor flavor)
        throw UnsupportedFlavorException,IOException{
        return textArea1.getText();}

}
class DragHandler implements DragGestureListener{
    public void dragGestureRecognized(DragGestureEvent e){
        e.startDrag(new Cursor(Cursor.HAND_CURSOR),transferable,sourceHandler);
    }
}

class WindowEventHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}*/