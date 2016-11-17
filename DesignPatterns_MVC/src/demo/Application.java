package demo;

import javax.swing.SwingUtilities;
import view.View;

import controller.Controller;
import model.Model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			
			@Override
			public void run(){
				runApp();
			}
		});
	}
	public static void runApp(){
		Model model = new Model();
		View view  =  new View (model);
		Controller controller = new Controller(model,view);
		
	}
}
