package composite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public  abstract class R�pertoires implements Component {
	public Integer taille;
	public String name;
	private Collection children;
	
	
	 public R�pertoires() {
	        children = new ArrayList();
	    }
	
	 public Long getTaille() {

		 Long taille = 0L;

		 for (Component component : component) {

			 taille = taille + component.getSize();

		 }

		 return taille;

		 }
	
	public String getName() {

		return �R�pertoires�;

		}
  
    public void add(Component component){
     
        children.add(component);
    }

  
    public void remove(Component component){
        children.remove(component);
    }

    public Iterator getChildren() {
        return children.iterator();
    }
}
