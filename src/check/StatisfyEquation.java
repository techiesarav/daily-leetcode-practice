package check;

public class StatisfyEquation {

	public static boolean eqnCheck(String[] equations) {
		int j = 0;
		int k = 0;

		while(k < equations.length) {
			if(equations[k].charAt(1) == '=') {
				String temp = equations[k];
				equations[k] = equations[j];
				equations[j] = temp;

				j++;
				k++;
			}else{
				k++;
			}
		}

		int []parent = new int[26];
		int []rank = new int[26];

		for(int i = 0; i < 26; i++) {
			parent[i] = i;
		}

		for(String s : equations) {
			int x = (int)s.charAt(0) - 'a';
			int y = (int)s.charAt(3) - 'a';

			x = find(parent, x);
			y = find(parent, y);

			if(x == y) {
				if(s.charAt(1) == '!') {
					return false;
				}
			}

			if(s.charAt(1) == '!') {
				continue;
			}

			if(rank[x] < rank[y]) {
				parent[x] = y;
			}else if(rank[y] < rank[x]) {
				parent[y] = x;
			}else{
				parent[x] = y;
				rank[y]++;
			}

		}

		return true;
	}



	private  static int find(int []parent, int v) {
		if(parent[v] == v) {
			return v;
		}

		parent[v] = find(parent, parent[v]);

		return parent[v];
	}

	public static void main(String[] args) {
		String[] sa = {"a==b","b!=a"};
		boolean ssd = eqnCheck(sa);
		System.out.println(ssd+"");

	}

}
