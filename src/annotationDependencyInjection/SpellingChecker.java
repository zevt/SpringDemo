package annotationDependencyInjection;

public class SpellingChecker {
	public void spellCheck(){
		System.out.println(" Check Spelling");
	}
	public void init() {
		System.out.println(" Initialize Spelling Checker Inside SpellingChecker");
	}
	public void destroy() {
		System.out.println(" Destroy Spelling Checker");
	}
}