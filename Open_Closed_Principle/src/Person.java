
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Devices in the home
        Projector niceProjector = new Projector();
        TV niceLargeScreenTV = new TV();
         
        // The user's control
        RemoteControl remoteControl = RemoteControl.getInstance();
         
        remoteControl.connectToDevice(niceProjector);
        remoteControl.clickOnButon();
         
        remoteControl.connectToDevice(niceLargeScreenTV);
        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
	}

}
