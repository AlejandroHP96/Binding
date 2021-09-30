package dad.bindings.samples;

import javafx.beans.binding.DoubleExpression;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sample2 {

	public static void main(String[] args) {
		DoubleProperty base=new SimpleDoubleProperty();
		DoubleProperty altura=new SimpleDoubleProperty();
		
		DoubleExpression area=base.multiply(altura);
		area.addListener((o,ov,nv) -> System.out.println("El area del rectangulo es: " +nv));
		
		System.out.println("Inicialmente el area vale: "+area.get());
		
		base.set(3);
		altura.set(2);
		
		altura.set(5);
		
		
		StringProperty nombre=new SimpleStringProperty("Perico");
		StringProperty apellido=new SimpleStringProperty("Palotes");
		StringProperty nombreCompleto=new SimpleStringProperty();
		nombreCompleto.addListener((o,ov,nv)->System.out.println("Antes valia "+ov+" y ahora valgo "+nv));
		
		StringExpression expresion=nombre.concat(" ").concat(apellido);
		
		nombreCompleto.bind(expresion);
		
		nombre.set("Manolito");
		apellido.set("Gafotas");
		
		nombreCompleto.unbind();
		
		nombreCompleto.set("Fran Vargas");
	}

}
