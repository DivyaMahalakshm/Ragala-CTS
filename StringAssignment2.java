
public class StringAssignment2 {
	private static String url1="https://www.cognizant.com/admin/policy/index.html ";
	private static String url2=" https://www.cognizant.com/service.jsp";
	private static String url3=" https://www.cognizant.com/customer/products/local/showProducts.asp";

	public static void main(String[] args) {
		
		String commnad1=getCommand(url1);
		String commnad2=getCommand(url2);
		String commnad3=getCommand(url3);
		
		System.out.println("Command  1 : "+commnad1);
		System.out.println("Command  1 : "+commnad2);
		System.out.println("Command  1 : "+commnad3);

	}

	private static String getCommand(String Url2) {
		// TODO Auto-generated method stub
		url1=Url2;
		return url1;
	}
	
	

	

}
