package pk1;

import pk1.Coords.Pair;

public class Coords {
	
	private Pair[] trajet= {
			new Pair(4,5),
			new Pair(8,6),
			new Pair(6,3)
	};
	
	public int  getX(int index) {
		if(index <0 || index >= trajet.length) 
			throw new IllegalArgumentException();
		return trajet[index].x;
	}
	public static Pair nouveauPair(int x ,int y) {
		return new Pair(x, y);
	}
	public static class Pair{
		private int x,y;
		public Pair(int x,int y) {
			this.x=x;
			this.y =y;
		}
		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		
		
	}
	public static void main(String[] args) {
		Coords.Pair pair1 = new Pair(7,2);
		Coords.Pair pair2 = Coords.nouveauPair(5, 2);
		System.out.println(pair1);
		System.out.println(pair2);

	}

}
