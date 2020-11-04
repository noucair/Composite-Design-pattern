package composite;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Fichiers child1 = new Fichiers(100L);
			Fichiers child2 = new Fichiers(200L);

			Répertoire root= new Répertoire(100L);
			root.add(child1);
			root.add(child2);

			System.out.println(child1.getTaille());      // output : 100
			System.out.println(root.getTaille());    // output : 300
		}
	}
	}

}
