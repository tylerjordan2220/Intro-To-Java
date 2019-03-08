
public class Lesson32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a\\b\\c\\\"d\"");
		System.out.println("\\t is a tab, \\n is a new line,\\" + "\" prints a \"quote\"");
		System.out.println("\"line 1\"\n"+"\\line              two\\");
		System.out.println("\\\\denotes a single line comment\n"+"\\*denotes a multiline comment*\\");
		System.out.println("\"\\\\\"\\\"\"\n"+"        \\\"\\\"\"\\\n"+"\\\"\"\"\"\\");
		String Word = "Birthday";
		System.out.println(Word.toUpperCase());
		String w = "it's my party";
		System.out.println(w.substring(0,4)+" "+w.substring(9,10)+" "+"\""+w.substring(8,13).toUpperCase()+"\"");
		String t = "whose a whats it";
		System.out.println(t.substring(0,5).toUpperCase()+"\n"+t.substring(14,15)+t.substring(12,13)+" "+t.substring(8,12).toUpperCase());
		String u ="Every Way The Wind Blows";
		System.out.println(u.substring(0,5).toLowerCase()+" "+u.substring(6,10).toUpperCase()+""+u.substring(10,13).toLowerCase()+" "+"\\"+u.substring(14,18).toUpperCase()+"\\"+" "+u.substring(19,24).toLowerCase()+" "+(u.length()-20));
		String f = "Peter Piper Picked A Peck Of Picked Peppers";
		System.out.println(f.substring(19,20).toLowerCase()+" "+f.substring(21,25).toLowerCase()+" "+f.substring(26,28).toLowerCase()+" "+f.substring(12,18).toLowerCase()+"           "+f.substring(36,43).toLowerCase()+" "+f.substring(0,5)+" "+f.substring(6,11)+"       "+f.substring(28,36).toLowerCase());
		String i = "word has 4 letters";
		System.out.println("\""+i.substring(9,10)+"\""+" "+i.substring(11,18)+" "+i.substring(5,8)+" "+"\""+(i.length()-9)+"\""+" "+i.substring(11,18));
		String g = "if SUBSTRING is used";
		System.out.println(g.substring(3,12).toLowerCase()+" "+g.substring(13,15)+" "+(g.length()-11));
		String q = "Jim, Jacky, Johnny, Jill";
		System.out.println(q.substring(0,3).toLowerCase()+"\\"+(q.length()-20)+"\n"+q.substring(5,10).toUpperCase()+"\\"+(q.length()-19)+"\n"+q.substring(12,18).toLowerCase()+"\\"+(q.length()-18)+"\n"+q.substring(20,24).toUpperCase()+"\\"+(q.length()-20));
		
		
		
		
		
		
		
		
		
	}

}
