package annotationDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
	@Bean
	public TextEditor getTextEditor() {
		return new TextEditor(createSpellingChecker());
	}
	@Bean SpellingChecker createSpellingChecker() {
		return new SpellingChecker();
	}
	
}
