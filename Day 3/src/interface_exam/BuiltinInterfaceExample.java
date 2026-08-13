package interface_exam;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyApp extends Frame implements ActionListener{
	Button b1;
	public MyApp() {
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		b1=new Button("click");
		add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.out.println("button clicked");
		}
	}
	
}
public class BuiltinInterfaceExample {

	public static void main(String[] args) {
		MyApp obj=new MyApp();
	}
}
