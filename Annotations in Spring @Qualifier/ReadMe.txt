Now Spring's job is to create a fully working bean object and pass it to classes dependent on it.

So there can be Many pbject of same type/class but their name/id must be doffrent.

Now while @autowiuring if we havr multiple bean definiton of same class how wil @autowire know which bean definition to inject .
FOr that purpose @Qualifier is used. It allows the a parameter wjich is the id name of the bean you want to inject into the object.
