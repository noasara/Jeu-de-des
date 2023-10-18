package monPackage;

public class jeufinal {


		public static void main(String[] args) 
		{
			String j1,j2;
			int P1, P2;
			System.out.println("LE JEU DE DÈS");
			System.out.println(" ");
			System.out.println("Le lancé du dé est simulé par un tirage au hasard.");
			System.out.println("Les points marqués à chaque tour sont cumulés jusqu'à ce que l'un des deux joueurs atteigne ou dépasse 30.");
			System.out.println("Celui qui obtient ce nombre de points est déclaré vainqueur.");
			System.out.println("De plus, celui qui obtient un 6 a le droit de rejouer.");
			System.out.println(" ");
			j1 = Saisie.lire_String("Quel est le nom du Joueur 1 ?");/*saisie du prénom du 1er joueur*/
			j2 = Saisie.lire_String("Quel est le nom du Joueur 2 ?");/*saisie du prénom du 2e joueur*/
			P1 = 0;/*initialisation des points de chaque joueur à 0*/
			P2 = 0;/*initialisation des points de chaque joueur à 0*/
			
			System.out.println(" ");
			System.out.println("-- DEBUT DU JEU --");
			
			int J = (int) (Math.random()*2+1);/*choix aléatoire du joueur*/
			
			if (J==1)/*si c'est le joueur 1 qui commence*/
			{
				System.out.println(" ");
				System.out.println("C'est " +j1 + " qui commence.");
				System.out.println(" ");
				
				while ((P1<30)&&(P2<30))/*tant que les points du joueur 1 et 2 sont inférieurs à 30*/
				{
					int d1 = (int)(Math.random()*6+1);/*lancé de dés*/
					System.out.println("Le lancé de " +j1+ " est " +d1+ ".");
					P1 = P1 + d1;/*calcul des points obtenus par le premier joueur*/
					
					while (d1==6)/*quand le lancé de dès est égal à 6*/
					{
						System.out.println(" ");
						System.out.println(j1 +" rejoue.");
						System.out.println(" ");
						d1 = (int)(Math.random()*6+1);/*lancé de dés*/
						System.out.println("Le lancé de " +j1+ " est " +d1+ ".");
						P1 = P1 + d1;/*calcul des points obtenus par le premier joueur*/
					}
					System.out.println(" ");
					System.out.println(j1+" a " +P1+" point(s).");
					System.out.println(" ");
					
					if (P1<30) {/*si les points du joueur 1 sont inférieurs à 30*/
					System.out.println("-- C'est au tour de " +j2+ " --");
					System.out.println(" ");
					}else {
						break;/*arrêt de la boucle si la condition est remplie*/
					}
					
					int d2 = (int)(Math.random()*6+1);
					System.out.println("Le lancé de " +j2+ " est " +d2+ ".");
					P2 = P2 + d2;/*calcul des points obtenus par le deuxième joueur*/
					
					while (d2==6)
					{
						System.out.println(" ");
						System.out.println(j2 +" rejoue.");
						System.out.println(" ");
						d2 = (int)(Math.random()*6+1);/*lancé de dés*/
						System.out.println("Le lancé de " +j2+ " est " +d2+ ".");
						P2 = P2 + d2;/*calcul des points obtenus par le deuxième joueur*/
					}
					System.out.println(" ");
					System.out.println(j2+" a " +P2+ " point(s).");/*affichage des points obtenus par le joueur 2*/
					System.out.println(" ");
					
					if (P2<30) {
						System.out.println("-- C'est au tour de " +j1+ " --");
						System.out.println(" ");
						}else {
							break;
						}
					}
				}
			
			else 
			{
				System.out.println(" ");
				System.out.println("C'est " +j2 + " qui commence.");
				System.out.println(" ");
				
				while ((P2<30)&&(P1<30))
				{
					int d2 = (int)(Math.random()*6+1);
					System.out.println("Le lancé de " +j2+ " est " +d2+ ".");
					P2 = P2 + d2;
				
					while (d2==6)
					{
						System.out.println(" ");
						System.out.println(j2 +" rejoue.");
						System.out.println(" ");
						d2 = (int)(Math.random()*6+1);
						System.out.println("Le lancé de " +j2+ " est " +d2+ ".");
						P2 = P2 + d2;
					}
					System.out.println(" ");
					System.out.println(j2+" a " +P2+ " point(s). ");
					System.out.println(" ");
					
					if (P2<30) {
					System.out.println("-- C'est au tour de " +j1+ " --");
					System.out.println(" ");
					}else {
						break;
					}
					
					int d1 = (int)(Math.random()*6+1);
					System.out.println("Le lancé de " +j1+ " est " +d1+ ".");
					P1 = P1 + d1;
					
					while (P1==6)
					{
						System.out.println(" ");
						System.out.println(j1 +" rejoue.");
						System.out.println(" ");
						d1 = (int)(Math.random()*6+1);
						System.out.println("Le lancé de " +j1+ " est " +d1+ ".");
						P1 = P1 + d1;					
					}
					System.out.println(" ");
					System.out.println(j1+" a " +P1+ " point(s).");
					System.out.println(" ");
					
					if (P1<30) {
						System.out.println("-- C'est au tour de " +j2+ " --");
						System.out.println(" ");
						}else {
							break;
						}

			}}
			if (P1>29)
			{
				System.out.println("C'est "+j1+" qui a gagné la partie !");
			} 
			else 
			{
				System.out.println("C'est "+j2+" qui a gagné la partie !");
			}
			System.out.println(" ");
			System.out.println("-- FIN DU JEU --");
		}
		


	}


