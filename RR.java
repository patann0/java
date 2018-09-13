public class RR{
	public static void main(String[] args){
		int a = 4;
		int b = 0;
		try{
			int c = a / b;
			System.out.println("ぬぬーん" + c);
		}
		catch(ArithmeticException e){

			System.out.println("例外処理キャッチしました");
			System.out.println(e);
			return;
		}
		finally{
			System.out.println("finallyブロック処理");
		}
		System.out.println("checkout");
	}
}
