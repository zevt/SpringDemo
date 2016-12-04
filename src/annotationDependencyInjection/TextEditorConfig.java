package annotationDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TextEditorConfig {
	@Bean
	public TextEditor getTextEditor() {
		return new TextEditor(createSpellingChecker());
	}
	@Bean(initMethod="init", destroyMethod="destroy") 
	@Scope("singleton")
	SpellingChecker createSpellingChecker() {
		return new SpellingChecker();
	}
	
}
