Bean Life Cycle consist of a lot of phases main ones are Initialization and Destruction.

Initialization: After Bean definition is called, we can make IoC to call a method rght after it.
	To initialize some var may be. This can be done by using 'init' parameter in bean definition
	followed by the method name to be called (XYZ, in this case). This method name must be present in 
	the Bean class.
	
Destruction: Simiarly after a bean's job is done, we can make IoC to call a method befre the bean gets destroyed.
	To do that, we use 'destroy-method' parameter in the bean definition followed by the name of the method to be called
	whic must be resent in the Bean class.