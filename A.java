import java.awt.*;
import java.awt.event.*;
public class A{
    public static void main(String[]args)throws Exception{
      final Frame f=new Frame("wo de ge ren chuang ti");
      f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
    f.setSize(200,300);
   f.setLocation(300,200);
   Button but1=new Button("di 1 ge an niu");
     f.add(but1);
     but1.addActionListener(new ActionListener(){
     private int num=1;
    @Override
       public void actionPerformed(ActionEvent e){
         f.add(new Button("di"+ ++num+"ge an niu"));
        f.setVisible(true);
     }
    });
       f.setVisible(true);
MyWindowListener mv=new MyWindowListener();
   f.addWindowListener(mv);
}
}
   class MyWindowListener implements WindowListener{
   public void windowClosing(WindowEvent e){
   Window window=e.getWindow();
    window.setVisible(false);
   window.dispose();
}
public void windowActivated (WindowEvent e){
}
public void windowClosed (WindowEvent e){
}
public void windowDeactivated (WindowEvent e){
}
public void windowDeiconified (WindowEvent e){
}
public void windowIconified (WindowEvent e){
}
public void windowOpened (WindowEvent e){
}
    }
         