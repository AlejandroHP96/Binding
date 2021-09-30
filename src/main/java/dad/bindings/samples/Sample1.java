package dad.bindings.samples;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class Sample1 {

		public static void main(String[] args) {
			StringProperty nombre = new SimpleStringProperty();
			nombre.addListener((o,ov,nv) -> System.out.println("Antes valía: " + ov + " Y ahora valgo " + nv));
			
			nombre.set("Pepe");
			nombre.set("Maria");
			nombre.set("Luis");
			
			
		}
}
