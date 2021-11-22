
public class Division {
public static double Div(double n1,double n2) {
	double resultat = n1/n2;
	if(resultat>=0) return 1;
	else return 0;
}
public static void main(String args[]) {
	System.out.println(Div(-4,6));
}
}
