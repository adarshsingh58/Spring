Autowiring:
	So far whenever we have to add a depedency to the Spring Bean we add that in properties or constructr-arg explicitly.
	What if Spring does this for us, and all we need to do is add the bean definition for the particular dependency.
	
	Thats what autowiring is. we define all the  bean definitions in XML and in the bean definition which hold the
	dependency to other bean we add the attribute 'autowire' nd define its type whether 'byName', 'byType' or 'constructor'.  
	
	byName:	Autowiring by property name. Spring container looks at the properties of the beans on which autowire attribute is 
			set to byName in the XML configuration file. It then tries to match and wire its properties with the beans defined
			by the same names in the configuration file.
	
	byType:	Autowiring by property datatype. Spring container looks at the properties of the beans on which autowire attribute 
	 		is set to byType in the XML configuration file. It then tries to match and wire a property if its class type matches with
	 		exactly one of the beans name in configuration file. If more than one such beans exists, a fatal exception is thrown.
	
	constructor:Similar to byType, but type applies to constructor arguments. If there is not exactly one bean of the constructor
			 argument type in the container, a fatal error is raised.