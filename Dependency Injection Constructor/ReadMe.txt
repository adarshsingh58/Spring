Spring - Dependency Injection: every Java class , when in real env, is dependednt on some other classes for some purpose. This dependency is inevitable but we should make our modules/classes as much as independent from other classes. This is done in Spring Core by DI.
COnsider below class:

public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor() {
      spellChecker = new SpellChecker();
   }
}

Spring Di Version:

public class TextEditor {
   private SpellChecker spellChecker;
   
   public TextEditor(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
}

In first scenario, it was TextEditor class' job to create the spellChecker Object . Now this is tight coupling as TE class is dependent directly on SPellChecker class. In Spring Version we passed SC object to TE which means TE now doesnt have to be worried about how to create SC object. It gets it from Spring. Thus making our code lossly coupled. Here we have dine constructor based dependency Injection. Here, we have removed total control from the TextEditor and kept it somewhere else (i.e. XML configuration file) and the dependency (i.e. class SpellChecker) is being injected into the class TextEditor through a Class Constructor. Thus the flow of control has been "inverted" by Dependency Injection (DI) because you have effectively delegated dependances to some external system.

Note: Use constructor arguments for mandatory dependencies and setters for optional dependencies