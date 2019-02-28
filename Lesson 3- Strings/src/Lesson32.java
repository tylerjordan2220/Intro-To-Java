
public class Lesson32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a\\b\\c\\\"d\"");
		System.out.println("\\t is a tab, \\n is a new line," + "\" prints a \"quote\"");
		System.out.println("line 1\n"+"\\line              two\\");
		System.out.println("\\\\denotes a single line comment\n"+"\\*denotes a ultiline comment\\*");
		System.out.println("\"\\\\\"\\\"\"\n"+"        \\\"\"\"\\\n"+"\\\"\"\"\"\\");
		String Word = "Birthday";
		System.out.println(Word.toUpperCase());
		String w = "it's my party";
		System.out.println(w.substring(0,4)+" "+w.substring(9,10)+" "+"\""+w.substring(8,13).toUpperCase()+"\"");
		String t = "whose a whats it";
		System.out.println(t.substring(0,5).toUpperCase()+"\n"+t.substring(14,15)+t.substring(12,13)+" "+t.substring(8,12).toUpperCase());
		String u ="Every Way The Wind Blows";
		System.out.println(u.substring(0,5).toLowerCase()+" "+u.substring(6,10).toUpperCase()+" "+u.substring(12,14).toLowerCase()+" "+"\\"+u.substring(14,18).toUpperCase()+"\\"+" "+u.substring(19,24).toLowerCase()+" "+u.length());
		
		
		
		
		
		
		
		
		
		
	}

}
