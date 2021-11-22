/*
 * @BlackPro
 */
public class Tri {
public static int[] triOfTab(int[] tab) {
	int temp;
	int max;
	for(int i=0;i<tab.length-1;i++) {
		 max = i;
		for(int j=i+1;j<tab.length;j++) {
			if(tab[j]>tab[max]) {
				max = j;
				}
		}
		temp = tab[max];
		tab[max]=tab[i];
		tab[i] =temp;
	}
	return tab;
}
static int[] table = new int[] {7,10,12,1,0,17,5,20};
public static void main(String[] args) {
	int[] l = triOfTab(table);
	for(int t=0;t<l.length;t++) {
		 System.out.println(l[t]);
		  
	 }
}
}
