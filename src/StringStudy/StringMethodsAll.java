package StringStudy;

public class StringMethodsAll {

	public static void main(String[] args) {
		String name="Velocity";
		
		// length of string
		System.out.println(name.length()); // to see length 
		
		int a = name.length();
		System.out.println( a);
		
		System.out.println("=============");	
		
		//toUppercase()method use 
		System.out.println(name);
		String b = name.toUpperCase();
		System.out.println(b);
		
		System.out.println("=============");	
		
		//tolowercase()methoduse
		String c = b.toLowerCase();
		System.out.println(c);
		
		String d = name.toLowerCase();
		System.out.println(d);
		
	System.out.println("=============");	
		//equalsmethod
		String m="Velocity";
		String n="velocity";
		String o=new String("Velocity");
		String p=new String("velocity");
		String q=new String("VELOCITY");
		
		System.out.println(m==n);
		System.out.println(m==o);
		
		boolean e = q.equals(p);
		System.out.println(e);
		
		System.out.println("=============");
		
		//equalsIgnoreCase()methodcase
		
		boolean f = m.equalsIgnoreCase(n);
		System.out.println(f);
		
		boolean g = p.equalsIgnoreCase(q);
		System.out.println(g);
		
		System.out.println("=============");
		
		//Containsmethod
		
		String city="Mumbai";
		System.out.println(city.contains("bai"));
		System.out.println(city.contains("iab"));
		
		System.out.println("=============");
		
		//isemptymethod
		
		String w="Test";
		String x="";
		String y=" ";
		//String z=null;
		
		boolean aa = w.isEmpty();
		System.out.println(aa);
				
		System.out.println(x.isEmpty());
		System.out.println(y.isEmpty());
		
		System.out.println("=============");
		
		//isBlank method 
		System.out.println(x.isBlank());
		System.out.println(y.isBlank());
		//System.out.println(z.isBlank());
		
		System.out.println("=============");
		
		//charAT method
		String bb="INDIA";
		char ee = bb.charAt(1);
		System.out.println(ee);
		
		//System.out.println(bb.charAt(-1));
		
		System.out.println("=============");
		
		//endswithMethod
		
		boolean CC = bb.endsWith("DIA");
		System.out.println(CC);
		
		System.out.println(bb.endsWith("IN"));
		
		System.out.println("=============");
		
		//startswith method
		
		System.out.println(bb.startsWith("IN"));
		
		System.out.println(bb.startsWith("A", 4));
		
		System.out.println("=============");
		
		//subStringMethodUse
		
		String test="VELOCITY CORPORATE TRAINING CENTER";
		
		String dd = test.substring(28);
		System.out.println(dd);
		System.out.println(test.substring(10));
		
		System.out.println(test.substring(10, 15));
		
		System.out.println("=============");
		
		//concat method study
		
		String mm="PUNE";
		String nn=" CITY";
		
		String ab = mm.concat(nn);
		System.out.println(ab);
		
		System.out.println(mm.concat(nn).concat(" BEST"));

		System.out.println("=============");
		
		//indexofMethod Use
		
		String state="MAHARASHTRA";
		int qq = state.indexOf('A');
		System.out.println(qq);
		
		System.out.println(state.indexOf('H'));
		
		System.out.println(state.indexOf('R',6));
		
		System.out.println(state.indexOf('H', 7));
		System.out.println(state.lastIndexOf('A'));
		
		System.out.println("=============");
		
		//ReplaceMethod
		
		String tal="PUNE MUMBAI PUNE";
		String di = tal.replace('P', 'M');
		System.out.println(di);
		
		System.out.println(tal.replaceAll(" ", "_"));
		

		
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
	}

}
