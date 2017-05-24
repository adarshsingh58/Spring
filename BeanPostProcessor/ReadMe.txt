BeanPostProcessor : Just like init and destroy help u call a funtion after initialization and before destruction of a spring bean.
We can leverage BeanPostProcessor of Spring to take it a step further to call a function before initialization.
We can make use of methods postProcessBeforeInitialization and postProcessAfterInitialization of BeanPostProcessor class to do the same.

Order of execution will be:

postProcessBeforeInitialization 
init method
postProcessAfterInitialization 
bean object created and class executes stuff
destroy method


What is needed?
	Create a class implementing BeanPostProcessor and define it in XMl. Spring will auto detect it and will call postProcessBeforeInitialization and postProcessAfterInitialization
	before initialization of any bean.