public class Proov1{
	public static void main(String[] args){
		Vordhaarne3nurk laud1=new Vordhaarne3nurk(2,2);
		Vordhaarne3nurk laud2=new Vordhaarne3nurk(1.5,3);
		Vordhaarne3nurk laud3=new Vordhaarne3nurk(2,8);
		System.out.println(laud1.pindala()+" "+laud1.ymberm66t());
		System.out.println(laud2.pindala());
		System.out.println(laud3.pindala());
		System.out.println(laud1);
		System.out.println(laud2.toString());
	}
}

// 2.0 6.0
// 2.25
// 8.0
// Kolmnurk 2.0x2.0x2.0 ymberm66t on 6.0, pindala on 2.0.
// Kolmnurk 1.5x1.5x1.5 ymberm66t on 4.5, pindala on 2.25.
