import java.util.Vector;

class pertemuan12 {
	public static void main (String[]args) {
		Vector dataku = new Vector ();
		Vector datamu = new Vector ();
		
		dataku.addElement(10);
		dataku.addElement(11);
		dataku.addElement(12);
		dataku.addElement(13);
		dataku.addElement(14);
		
		datamu.addElement ("Test");
		
		dataku.addElement (101);
		
		System.out.println ("Size dataku : " +dataku.size() );
		
		System.out.println ("Size datamu : " +datamu.size() );
		
		for (int i=0; i<dataku.size(); i++) {
			System.out.println ("Dataku Elemen ke " +i +" : " +dataku.elementAt(i));
		}
		System.out.println ("Datamu Elemen ke : " +datamu.elementAt(0));
	}
}