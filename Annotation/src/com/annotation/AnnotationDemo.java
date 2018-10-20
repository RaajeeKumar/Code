package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Marker Annotation - Annotation with no methods
//Single Value Annotation - Annotation with one method
//Multi Value Annotation - Annotation with multiple methods
//Meta Annotation - Annotation that gives you the meta data about your annotation


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android", version=6)
class NokiaASeries
{
	String model;
	int size;
	
	public NokiaASeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}
	
}

public class AnnotationDemo {

	public static void main(String[] args) {
		NokiaASeries obj = new NokiaASeries("Fire", 5);
		
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
		

	}

}
