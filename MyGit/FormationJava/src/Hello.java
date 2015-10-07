import java.util.Random;

public class Hello
{

	private static final int MAXIMUM = 100;
	private static final int LONGUEUR = 10;

	public static void main(String[] args)
	{
		// ------------------------------------------------------------
		// variables
		/*
		 * int i = 0;
		 * 
		 * int j; //+++++++++++++++++++++++++++++++++ // variables temporaires
		 * int tmp;
		 * //------------------------------------------------------------
		 * //------------------------------------------------------------ //
		 * initialisation i = 0; j = 1;
		 * //------------------------------------------------------------
		 * //------------------------------------------------------------ //
		 * affichage System.out.println("i = "+ i); System.out.println("j = " +
		 * j); //------------------------------------------------------------
		 * //------------------------------------------------------------ //
		 * intervetir tmp=i; i=j; j=tmp;
		 * //------------------------------------------------------------
		 * System.out.println("Apres echange \n i= " + i +"\n j= " + j);
		 */
		/*
		 * Affiche 0 à 99 for (int i=0;i<100;i++) { System.out.print(i+" "); }
		 * System.out.println();
		 */

		/*
		 * 10 9 8 7 ... 3 2 1 BOOOM for (int i=10;i>0;i++) { System.out.print(i+
		 * " "); } System.out.println("BOOOM");
		 */

		/*
		 * Le double jusqu'à 1024 int j; for (i=0;i<10;i++) { j*=2;
		 * System.out.print(j); }
		 */
		// Init
		/*
		 * final int ITERATION = 50; int n=1; int nbToTest=2; //int cpt; boolean
		 * isPrime;
		 * 
		 * // On boucle pour les n premier chiffres premiers while(n<=ITERATION)
		 * { // cpt=0; isPrime = true; // On calcule les divisions jusqu'à n-1
		 * for (int i=2;i<nbToTest;i++) { // si le modulo est à 0 on incremente
		 * if (nbToTest%i == 0) { isPrime = false; //cpt++; } }
		 * 
		 * 
		 * if (isPrime) { System.out.println(n+" : "+nbToTest); n++; }
		 * nbToTest++; }
		 */
		/*
		 * int premNb= 3; int deuxNb = 4; int result = add(premNb,deuxNb);
		 * System.out.println(premNb+" + "+ deuxNb+" = " + result);
		 */
		// int[] montab = {4,9,7,6,3,8,12,64,12,78};
		int[] montab = fillTab(LONGUEUR);
		// int[] montab = fillTab(5);
		// display(montab);
		// put(montab,1,99);
//		display(montab);
		// permut2(montab, 2);
		// display(montab);
		// remove(montab, 2);
		// insert(montab, 2, 0);
//		display(montab);
//		int[] tab2 = clone(montab);
		/*
		 * display(tab2); display(clone(montab));
		 */
		// display(even(montab));
		// display(inverse(montab));
		// display(remove2(montab, 2));
//		display(insert2(montab, 2, -99));
		/*
		 * System.out.println("La somme du tableau = " + sum(montab));
		 * System.out.println("La valeur max est = " + max(montab));
		 * System.out.println("La valeur moyenne = " + average(montab));
		 */
		int num = 6;
		System.out.println(num+"! = "+factorielle(num));
		display(montab);
		sortByBubble(montab);
		display(montab);
//		sommeTab(montab, 0);
		display(montab);
		System.out.println("Somme = "+sommeTab(montab, 0));
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// moyenne du tableau
	private static double average(int[] tab)
	{
		double valMoy = 0;

		valMoy = (double) sum(tab) / tab.length;
		// valMoy = sum(tab)/longTab;

		return valMoy;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// ----------------------------------------------------------
	// minimum du tableau
	public static int min(int[] tab)
	{
		int valMin = tab[0];

		for (int i = 1; i < tab.length; i++)
		{
			if (tab[i] < valMin)
			{
				valMin = tab[i];
			}

		}
		return valMin;

	}

	// ----------------------------------------------------------
	// ----------------------------------------------------------
	// tri par bulles
	public static void sortByBubble(int[] tab)
	{
		int j = 1;
		while (j <= tab.length)
		{
			for (int i = 0; i < tab.length - j; i++)
			{
				if (tab[i] > tab[i + 1])
				{
//					permut(tab, i, i + 1);
					permut2(tab, i + 1);
				}
			}
			j++;
		}

	}

	// ----------------------------------------------------------
	// ----------------------------------------------------------
	// Tri par max
	public static int[] sortByMax(int[] tab)
	{
		int[] tabOut = new int[tab.length];

		int mini;
		int maxi;

		for (int iOut = 0; iOut < tab.length; iOut++)
		{
			mini = min(tab);
			for (int iIn = 0; iIn < tab.length; iIn++)
			{
				maxi = max(tab) + 1;
				tabOut[iOut] = mini;

				if (tab[iIn] == mini)
				{
					tab[iIn] = maxi;
				}
			}
		}
		// }
		return tabOut;

	}

	// ----------------------------------------------------------
	// ----------------------------------------------------------
	// 					calcul de factorielle
	public static int factorielle(int number)
	{
		if (number <= 1)
			return 1;
		else
			return (number * factorielle(number - 1));
	}
	// ----------------------------------------------------------

	// ----------------------------------------------------------
	// 			Somme tableau
	// ----------------------------------------------------------
	public static int sommeTab(int[] tab,int indice)
	{
		if (indice == tab.length)
			return 0;
		else
			return (tab[indice]+sommeTab(tab,indice+1));
		
	}
	// +++++++++++++++++++++++++++++++++++++++++++++
	// valeur maximale
	private static int max(int[] tab)
	{
		int valMax = tab[0];

		for (int i = 1; i < tab.length; i++)
		{
			if (tab[i] > valMax)
			{
				valMax = tab[i];
			}
		}
		return valMax;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// Tableau valeur aléatoire
	public static int[] fillTab(int lengthTab)
	{
		int[] tabRnd = new int[lengthTab];
		Random rnd = new Random();

		for (int i = 0; i < lengthTab; i++)
		{
			tabRnd[i] = rnd.nextInt(MAXIMUM);
			// tabRnd[i] = (int) (Math.random() * MAXIMUM);
		}

		return tabRnd;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// met valeur dans tableau
	public static void put(int[] tab, int index, int value)
	{
		tab[index] = value;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// permut
	public static void permut(int[] tab, int index1, int index2)
	{
		int tmp = tab[index2];
		tab[index2] = tab[index1];
		tab[index1] = tmp;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// permut avec l index precedent
	public static void permut2(int[] tab, int index)
	{
		/*
		 * int tmp = tab[index]; tab[index]=tab[index-1]; tab[index-1]=tmp;
		 */
		permut(tab, index, index - 1);
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// enleve un element
	public static void remove(int[] tab, int index)
	{
		for (int i = index; i < tab.length - 1; i++)
		{
			tab[i] = tab[i + 1];
		}
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// insertion
	public static void insert(int[] tab, int index, int value)
	{
		for (int i = tab.length - 1; i > index; i--)
		{
			tab[i] = tab[i - 1];
		}
		put(tab, index, value);

	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// clone un tableau
	public static int[] clone(int[] tab)
	{
		int[] tabClone = new int[tab.length];
		for (int i = 0; i < tab.length; i++)
		{
			tabClone[i] = tab[i];
		}
		return tabClone;

	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// inverse le tableau
	public static int[] inverse(int[] tab)
	{
		int[] tabInverse = new int[tab.length];
		/*
		 * int j = tab.length - 1; for (int i = 0; i < tab.length; i++) {
		 * tabInverse[j] = tab[i]; j--; }
		 */
		for (int i = tab.length - 1; i >= 0; i--)
		{
			tabInverse[tab.length - 1 - i] = tab[i];
		}
		return tabInverse;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// tableau des nb pairs
	public static int[] even(int[] tab)
	{
		int[] tabEven = new int[tab.length];
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] % 2 == 0)
			{
				tabEven[j] = tab[i];
				j++;
			}
		}

		return tabEven;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	public static int[] remove2(int[] tab, int index)
	{
		int[] tabRemove = new int[tab.length - 1];

		for (int i = 0; i < tab.length - 1; i++)
		{
			if (i >= index)
				tabRemove[i] = tab[i + 1];
			else
				tabRemove[i] = tab[i];
		}
		/*
		 * remove(tab,index); for (int i = 0; i < tab.length - 1; i++) {
		 * tabRemove[i] = tab[i]; }
		 */
		return tabRemove;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// insert 2
	public static int[] insert2(int[] tab, int index, int value)
	{
		int[] tabInsrt = new int[tab.length + 1];
		for (int i = tab.length; i >= 0; i--)
		{
			if (i > index)
				tabInsrt[i] = tab[i - 1];
			else
				tabInsrt[i] = tab[i];
		}
		put(tabInsrt, index, value);

		return tabInsrt;

	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * Fonction Add
	 * 
	 * @param a
	 *            Premier nombre
	 * @param b
	 *            Deuxieme nombre
	 * @return l'addition de a et b
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}

	// +++++++++++++++++++++++++++++++++++++++++++++
	// +++++++++++++++++++++++++++++++++++++++++++++
	// Affiche le tableau entrée en parametre
	public static void display(int[] tab)
	{
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Fonction sum (Fait la somme du tableau)
	 * 
	 * @param tableau
	 *            d'entier
	 * @return la somme
	 */
	public static int sum(int[] tab)
	{
		int somme = 0;
		for (int i = 0; i < tab.length; i++)
		{
			somme += tab[i];
		}
		return somme;
	}

}
