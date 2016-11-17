package reporting;

public  class ReportFormatter {

	String formatOutput;
	public ReportFormatter(Object o, FormatType formatType){
		switch(formatType){
		case XML:
			formatOutput = convertObjectToXML(o);
			break;
		case CVS:
			formatOutput = convertObjectToCSV(o);
			break;
		}
	}
	private String convertObjectToXML(Object o){
		return "XML : <title>" + o.toString() +"</title>";
	}
	private String convertObjectToCSV(Object o){
		return "CVS : ,," + o.toString() +",,";
	}
	public String getFormattedValue(){
		return formatOutput;
	}
}
