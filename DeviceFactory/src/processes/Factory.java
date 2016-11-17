package processes;


public abstract class Factory {
	private String name;
	public Factory(String name){
		this.name = name;
	}
	protected void assembly() {
	}

	protected void testing() {
	}

	protected void packaging() {
	}

	protected void storage() {
	}
	//Template Method
	public void launchProcess(){
		if(name !=null && !name.isEmpty()){
		assembly();
		testing() ;
		packaging() ;
		storage() ;
		}else{
			System.out.println("Empty process");
		}
	}
}
