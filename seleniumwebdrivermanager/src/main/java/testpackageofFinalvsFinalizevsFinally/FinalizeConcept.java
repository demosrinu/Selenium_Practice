package testpackageofFinalvsFinalizevsFinally;

public class FinalizeConcept {

		public void finalize() {
			System.out.println("finalize method");
		}
		
		//finalize is a method
		//It is used to cleanup objects which are not having any reference and with null values
		//finalize method comes into action before the garbage collector gets called
		
		public static void main(String[] args) {
			FinalizeConcept f1 = new FinalizeConcept();
			FinalizeConcept f2 = new FinalizeConcept();
			f1 = null;
			f2 = null;
			System.gc();

	}

}
