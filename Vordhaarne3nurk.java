public class Vordhaarne3nurk{
	double a, h;
	public Vordhaarne3nurk(double ahaar,double korgus){
		if(ahaar<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(korgus<=0){throw new RuntimeException("Sobimatu korgus");}
		a=ahaar;
		h=korgus;
	}
	public double pindala(){
		return (a*h)/2;
	}
	//lisage funktsioon Vordhaarne3nurku ymberm66du arvutamiseks
	public double ymberm66t(){
		return a*3;
	}
	public String toString(){
		return "Kolmnurk "+a+"x"+a+"x"+a+" ymberm66t on "+
		       ymberm66t()+", pindala on "+pindala()+".";
	}
}
