class fungsi2 {
	private static double radius;
	
	private static double luasLingkaran () {
		return (Math.PI * radius * radius);
	}
	
	private static double kelilingLingkaran () {
		return (2*Math.PI*radius);
	}
	
	public static void main (String [] args) {
		radius = 10;
		
		double luas = luasLingkaran ();
		double keliling = kelilingLingkaran ();
		
		System.out.println ("Radius = " +radius);
		System.out.println ("Luas Lingkaran = " +luas);
		System.out.println ("Keliling Lingkaran = " +keliling);
	}
}