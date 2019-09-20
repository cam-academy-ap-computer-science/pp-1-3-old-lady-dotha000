/***
 * Grading Comments:
 *  Just about perfect.   Excellent work.
 *  Compile/Run: 15/15
 *  Desired Output: 6/6
 *  Consistency:  2/2
 *  Efficiency:   2/2
 * 25/25
 */
public class OldLady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	verse1();
	System.out.println();
	verse2();
	System.out.println();
	verse3();
	System.out.println();
	verse4();
	System.out.println();
	verse5();
	System.out.println();
	verse6();
	}
	
	//VERSE ONE
	public static void verse1() {
		swallow();
		System.out.println("a fly.");
		fly();
		psd();
	}

	//VERSE TWO
	public static void verse2() {
		swallow();
		System.out.println("a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		fly();
		psd();
	}
	
	//VERSE THREE
	public static void verse3() {
		swallow();
		System.out.println("a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
		spider();
		fly();
		psd();
	}
	
	//VERSE FOUR
	public static void verse4() {
		swallow();
		System.out.println("a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cat();
		bird();
		spider();
		fly();
		psd();
	}
	
	//VERSE FIVE
	public static void verse5() {
		swallow();
		System.out.println("a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
		cat();
		bird();
		spider();
		fly();
		psd();
	}
	
	//VERSE SIX
	public static void verse6() {
		swallow();
		System.out.println("a horse,");
		System.out.println("She died of course.");
	}
	public static void swallow() {
		System.out.print("There was an old lady who swallowed ");
	}
	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
	}
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	public static void psd() {
		System.out.println("Perhaps she'll die.");
	}
}

