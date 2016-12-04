package annotationDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnoDI {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		
		TextEditor textEditor = appContext.getBean(TextEditor.class);
		textEditor.performSpellingCheck();
		
		
		//Second way to declare ApplicationContext and getBean
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		appCtx.register(TextEditorConfig.class); 
		appCtx.refresh();
		TextEditor tEditor = appCtx.getBean(TextEditor.class);
		appCtx.registerShutdownHook();
	}

}
