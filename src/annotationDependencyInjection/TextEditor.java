package annotationDependencyInjection;

public class TextEditor {
	private SpellingChecker spellingChecker;
	public TextEditor(SpellingChecker spellingChecker) {
		this.spellingChecker = spellingChecker;
	}
	public void performSpellingCheck() {
		spellingChecker.spellCheck();
	}
}
