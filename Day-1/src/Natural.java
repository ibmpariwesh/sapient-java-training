class Natural {
	public static void main(String args[]) {
		call();
	}

	private static void call() {
		int i;
		for (i = 1; i <= 1; i++) {
			call();
		}
		System.out.println(i);
	}
}