package controller;

import model.Model;
import view.View;

//business logic
public class Controller {
private View view;
private Model model;
	public Controller(Model model, View view) {
		this.view = view;
		this.model = model;
	}

}
