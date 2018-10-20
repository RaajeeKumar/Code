package com.lambda;

interface Parser
{
	String parse(String str);
}

class StringParser
{
	static String convert(String str){
		if(str.length()<=3)
			return str.toUpperCase();
		else
			return str.toLowerCase();		
	}
}

class MyPrinter
{
	void print(String str, Parser p)
	{
		str = p.parse(str);
		System.out.println(str);
	}
}

public class DemoMethodReference {

	public static void main(String[] args) {
		/*List<String> names = Arrays.asList("Raajee", "Kumar");
		names.forEach(s -> System.out.println(s));
		
		// passing a function to a function - Method Reference
		names.forEach(System.out::println);*/
		
		
		/*MyPrinter p= new MyPrinter();
		p.print("Raa",new Parser()
		{
			public String parse(String str){
				return StringParser.convert(str);	
			}
		});*/
		
		// LAMBDA Expression
		/*MyPrinter p= new MyPrinter();
		p.print("Raa", str-> StringParser.convert(str));*/
		
		//Method Reference
		MyPrinter p= new MyPrinter();
		p.print("Raa", (StringParser::convert));

	}

}
